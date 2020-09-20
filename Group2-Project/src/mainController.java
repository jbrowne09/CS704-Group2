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
  public Signal conveyorDone = new Signal("conveyorDone", Signal.INPUT);
  public Signal rotaryDone = new Signal("rotaryDone", Signal.INPUT);
  public Signal capperDone = new Signal("capperDone", Signal.INPUT);
  public Signal loaderDone = new Signal("loaderDone", Signal.INPUT);
  public Signal unloaderDone = new Signal("unloaderDone", Signal.INPUT);
  public Signal tick = new Signal("tick", Signal.INPUT);
  public Signal conveyorEnable = new Signal("conveyorEnable", Signal.OUTPUT);
  public Signal rotaryEnable = new Signal("rotaryEnable", Signal.OUTPUT);
  public Signal capperEnable = new Signal("capperEnable", Signal.OUTPUT);
  public Signal fillerEnable = new Signal("fillerEnable", Signal.OUTPUT);
  public Signal bottleToLoad = new Signal("bottleToLoad", Signal.OUTPUT);
  private int S1963 = 1;
  private int S1859 = 1;
  
  private int[] ends = new int[2];
  private int[] tdone = new int[2];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S1963){
        case 0 : 
          S1963=0;
          break RUN;
        
        case 1 : 
          S1963=2;
          S1963=2;
          System.out.println("sustaining bottle to load");//sysj\mainController.sysj line: 9, column: 3
          S1859=0;
          bottleToLoad.setPresent();//sysj\mainController.sysj line: 11, column: 4
          currsigs.addElement(bottleToLoad);
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          switch(S1859){
            case 0 : 
              if(loaderDone.getprestatus()){//sysj\mainController.sysj line: 10, column: 9
                System.out.println("exit loader");//sysj\mainController.sysj line: 13, column: 3
                S1859=1;
                System.out.println("conveyor");//sysj\mainController.sysj line: 15, column: 3
                conveyorEnable.setPresent();//sysj\mainController.sysj line: 16, column: 4
                currsigs.addElement(conveyorEnable);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                bottleToLoad.setPresent();//sysj\mainController.sysj line: 11, column: 4
                currsigs.addElement(bottleToLoad);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 1 : 
              if(conveyorDone.getprestatus()){//sysj\mainController.sysj line: 14, column: 9
                System.out.println("halting");//sysj\mainController.sysj line: 19, column: 3
                S1859=2;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                conveyorEnable.setPresent();//sysj\mainController.sysj line: 16, column: 4
                currsigs.addElement(conveyorEnable);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 2 : 
              active[1]=1;
              ends[1]=1;
              break RUN;
            
            case 3 : 
              if(rotaryDone.getprestatus()){//sysj\mainController.sysj line: 21, column: 9
                S1859=4;
                capperEnable.setPresent();//sysj\mainController.sysj line: 25, column: 4
                currsigs.addElement(capperEnable);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                rotaryEnable.setPresent();//sysj\mainController.sysj line: 22, column: 4
                currsigs.addElement(rotaryEnable);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 4 : 
              if(capperDone.getprestatus()){//sysj\mainController.sysj line: 24, column: 9
                System.out.println("sustaining bottle to load");//sysj\mainController.sysj line: 9, column: 3
                S1859=0;
                bottleToLoad.setPresent();//sysj\mainController.sysj line: 11, column: 4
                currsigs.addElement(bottleToLoad);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                capperEnable.setPresent();//sysj\mainController.sysj line: 25, column: 4
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
          conveyorDone.gethook();
          rotaryDone.gethook();
          capperDone.gethook();
          loaderDone.gethook();
          unloaderDone.gethook();
          tick.gethook();
          df = true;
        }
        runClockDomain();
      }
      conveyorDone.setpreclear();
      rotaryDone.setpreclear();
      capperDone.setpreclear();
      loaderDone.setpreclear();
      unloaderDone.setpreclear();
      tick.setpreclear();
      conveyorEnable.setpreclear();
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
      dummyint = conveyorDone.getStatus() ? conveyorDone.setprepresent() : conveyorDone.setpreclear();
      conveyorDone.setpreval(conveyorDone.getValue());
      conveyorDone.setClear();
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
      dummyint = tick.getStatus() ? tick.setprepresent() : tick.setpreclear();
      tick.setpreval(tick.getValue());
      tick.setClear();
      conveyorEnable.sethook();
      conveyorEnable.setClear();
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
        conveyorDone.gethook();
        rotaryDone.gethook();
        capperDone.gethook();
        loaderDone.gethook();
        unloaderDone.gethook();
        tick.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
