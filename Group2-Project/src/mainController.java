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
  public Signal request = new Signal("request", Signal.INPUT);
  public Signal enable = new Signal("enable", Signal.INPUT);
  public Signal conveyerEnable = new Signal("conveyerEnable", Signal.OUTPUT);
  public Signal rotaryEnable = new Signal("rotaryEnable", Signal.OUTPUT);
  public Signal capperEnable = new Signal("capperEnable", Signal.OUTPUT);
  public Signal fillerEnable = new Signal("fillerEnable", Signal.OUTPUT);
  public Signal bottleLoaderEnable = new Signal("bottleLoaderEnable", Signal.OUTPUT);
  public Signal bottleUnloaderEnable = new Signal("bottleUnloaderEnable", Signal.OUTPUT);
  private int S1587 = 1;
  private int S1527 = 1;
  
  private int[] ends = new int[2];
  private int[] tdone = new int[2];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S1587){
        case 0 : 
          S1587=0;
          break RUN;
        
        case 1 : 
          S1587=2;
          S1587=2;
          S1527=0;
          System.out.println("conveyer enabled");//sysj\mainController.sysj line: 11, column: 3
          conveyerEnable.setPresent();//sysj\mainController.sysj line: 12, column: 4
          currsigs.addElement(conveyerEnable);
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          switch(S1527){
            case 0 : 
              if(conveyerDone.getprestatus()){//sysj\mainController.sysj line: 10, column: 9
                S1527=1;
                rotaryEnable.setPresent();//sysj\mainController.sysj line: 15, column: 4
                currsigs.addElement(rotaryEnable);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                conveyerEnable.setPresent();//sysj\mainController.sysj line: 12, column: 4
                currsigs.addElement(conveyerEnable);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 1 : 
              if(rotaryDone.getprestatus()){//sysj\mainController.sysj line: 14, column: 9
                S1527=2;
                capperEnable.setPresent();//sysj\mainController.sysj line: 18, column: 4
                currsigs.addElement(capperEnable);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                rotaryEnable.setPresent();//sysj\mainController.sysj line: 15, column: 4
                currsigs.addElement(rotaryEnable);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 2 : 
              if(capperDone.getprestatus()){//sysj\mainController.sysj line: 17, column: 9
                S1527=0;
                System.out.println("conveyer enabled");//sysj\mainController.sysj line: 11, column: 3
                conveyerEnable.setPresent();//sysj\mainController.sysj line: 12, column: 4
                currsigs.addElement(conveyerEnable);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                capperEnable.setPresent();//sysj\mainController.sysj line: 18, column: 4
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
          request.gethook();
          enable.gethook();
          df = true;
        }
        runClockDomain();
      }
      conveyerDone.setpreclear();
      rotaryDone.setpreclear();
      capperDone.setpreclear();
      request.setpreclear();
      enable.setpreclear();
      conveyerEnable.setpreclear();
      rotaryEnable.setpreclear();
      capperEnable.setpreclear();
      fillerEnable.setpreclear();
      bottleLoaderEnable.setpreclear();
      bottleUnloaderEnable.setpreclear();
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
      bottleLoaderEnable.sethook();
      bottleLoaderEnable.setClear();
      bottleUnloaderEnable.sethook();
      bottleUnloaderEnable.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        conveyerDone.gethook();
        rotaryDone.gethook();
        capperDone.gethook();
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
