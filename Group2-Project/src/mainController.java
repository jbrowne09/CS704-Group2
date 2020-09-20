import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class mainController extends ClockDomain{
  public mainController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal conveyerDone = new Signal("conveyerDone", Signal.INPUT);
  public Signal rotaryDone = new Signal("rotaryDone", Signal.INPUT);
  public Signal capperDone = new Signal("capperDone", Signal.INPUT);
  public Signal loaderDone = new Signal("loaderDone", Signal.INPUT);
  public Signal unloaderDone = new Signal("unloaderDone", Signal.INPUT);
  public Signal request = new Signal("request", Signal.INPUT);
  public Signal enable = new Signal("enable", Signal.INPUT);
  public Signal conveyerEnable = new Signal("conveyerEnable", Signal.OUTPUT);
  public Signal rotaryEnable = new Signal("rotaryEnable", Signal.OUTPUT);
  public Signal capperEnable = new Signal("capperEnable", Signal.OUTPUT);
  public Signal fillerEnable = new Signal("fillerEnable", Signal.OUTPUT);
  public Signal bottleToLoad = new Signal("bottleToLoad", Signal.OUTPUT);
  private int S2318 = 1;
  private int S2240 = 1;
  
  private int[] ends = new int[2];
  private int[] tdone = new int[2];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S2318){
        case 0 : 
          S2318=0;
          break RUN;
        
        case 1 : 
          S2318=2;
          S2318=2;
          S2240=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          switch(S2240){
            case 0 : 
              if(request.getprestatus()){//sysj\mainController.sysj line: 8, column: 9
                bottleToLoad.setPresent();//sysj\mainController.sysj line: 9, column: 3
                currsigs.addElement(bottleToLoad);
                S2240=1;
                conveyerEnable.setPresent();//sysj\mainController.sysj line: 11, column: 4
                currsigs.addElement(conveyerEnable);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 1 : 
              if(conveyerDone.getprestatus()){//sysj\mainController.sysj line: 10, column: 9
                S2240=2;
                rotaryEnable.setPresent();//sysj\mainController.sysj line: 14, column: 4
                currsigs.addElement(rotaryEnable);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                conveyerEnable.setPresent();//sysj\mainController.sysj line: 11, column: 4
                currsigs.addElement(conveyerEnable);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 2 : 
              if(rotaryDone.getprestatus()){//sysj\mainController.sysj line: 13, column: 9
                S2240=3;
                capperEnable.setPresent();//sysj\mainController.sysj line: 17, column: 4
                currsigs.addElement(capperEnable);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                rotaryEnable.setPresent();//sysj\mainController.sysj line: 14, column: 4
                currsigs.addElement(rotaryEnable);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 3 : 
              if(capperDone.getprestatus()){//sysj\mainController.sysj line: 16, column: 9
                S2240=0;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                capperEnable.setPresent();//sysj\mainController.sysj line: 17, column: 4
                currsigs.addElement(capperEnable);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1};
    char [] paused1 = {0, 0};
    char [] suspended1 = {0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[1] != 0){
      int index = 1;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        if(!df){
          conveyerDone.gethook();
          rotaryDone.gethook();
          capperDone.gethook();
          loaderDone.gethook();
          unloaderDone.gethook();
          request.gethook();
          enable.gethook();
          df = true;
        }
        runClockDomain();
      }
      conveyerDone.setpreclear();
      rotaryDone.setpreclear();
      capperDone.setpreclear();
      loaderDone.setpreclear();
      unloaderDone.setpreclear();
      request.setpreclear();
      enable.setpreclear();
      conveyerEnable.setpreclear();
      rotaryEnable.setpreclear();
      capperEnable.setpreclear();
      fillerEnable.setpreclear();
      bottleToLoad.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = conveyerDone.getStatus() ? conveyerDone.setprepresent() : conveyerDone.setpreclear();
      conveyerDone.setpreval(conveyerDone.getValue());
      conveyerDone.setClear();
      dummyint = rotaryDone.getStatus() ? rotaryDone.setprepresent() : rotaryDone.setpreclear();
      rotaryDone.setpreval(rotaryDone.getValue());
      rotaryDone.setClear();
      dummyint = capperDone.getStatus() ? capperDone.setprepresent() : capperDone.setpreclear();
      capperDone.setpreval(capperDone.getValue());
      capperDone.setClear();
      dummyint = loaderDone.getStatus() ? loaderDone.setprepresent() : loaderDone.setpreclear();
      loaderDone.setpreval(loaderDone.getValue());
      loaderDone.setClear();
      dummyint = unloaderDone.getStatus() ? unloaderDone.setprepresent() : unloaderDone.setpreclear();
      unloaderDone.setpreval(unloaderDone.getValue());
      unloaderDone.setClear();
      dummyint = request.getStatus() ? request.setprepresent() : request.setpreclear();
      request.setpreval(request.getValue());
      request.setClear();
      dummyint = enable.getStatus() ? enable.setprepresent() : enable.setpreclear();
      enable.setpreval(enable.getValue());
      enable.setClear();
      conveyerEnable.sethook();
      conveyerEnable.setClear();
      rotaryEnable.sethook();
      rotaryEnable.setClear();
      capperEnable.sethook();
      capperEnable.setClear();
      fillerEnable.sethook();
      fillerEnable.setClear();
      bottleToLoad.sethook();
      bottleToLoad.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        conveyerDone.gethook();
        rotaryDone.gethook();
        capperDone.gethook();
        loaderDone.gethook();
        unloaderDone.gethook();
        request.gethook();
        enable.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
