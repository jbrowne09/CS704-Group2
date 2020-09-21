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
  public Signal bottleAtLoad = new Signal("bottleAtLoad", Signal.INPUT);
  public Signal conveyorEnable = new Signal("conveyorEnable", Signal.OUTPUT);
  public Signal rotaryEnable = new Signal("rotaryEnable", Signal.OUTPUT);
  public Signal capperEnable = new Signal("capperEnable", Signal.OUTPUT);
  public Signal fillerEnable = new Signal("fillerEnable", Signal.OUTPUT);
  public Signal bottleToLoad = new Signal("bottleToLoad", Signal.OUTPUT);
  public Signal bottleAtLoadS = new Signal("bottleAtLoadS", Signal.OUTPUT);
  private int S2031 = 1;
  private int S1997 = 1;
  private int S1799 = 1;
  private int S2029 = 1;
  private int S2007 = 1;
  
  private int[] ends = new int[4];
  private int[] tdone = new int[4];
  
  public void thread2037(int [] tdone, int [] ends){
        switch(S2029){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S2007){
          case 0 : 
            if(bottleAtLoad.getprestatus()){//sysj\mainController.sysj line: 57, column: 10
              S2007=1;
              bottleAtLoadS.setPresent();//sysj\mainController.sysj line: 59, column: 5
              currsigs.addElement(bottleAtLoadS);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if(!bottleAtLoad.getprestatus()){//sysj\mainController.sysj line: 58, column: 10
              S2007=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              bottleAtLoadS.setPresent();//sysj\mainController.sysj line: 59, column: 5
              currsigs.addElement(bottleAtLoadS);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2036(int [] tdone, int [] ends){
        switch(S1997){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S1799){
          case 0 : 
            if(tick.getprestatus()){//sysj\mainController.sysj line: 13, column: 10
              System.out.println("entering loader");//sysj\mainController.sysj line: 15, column: 4
              S1799=1;
              bottleToLoad.setPresent();//sysj\mainController.sysj line: 17, column: 5
              currsigs.addElement(bottleToLoad);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(loaderDone.getprestatus()){//sysj\mainController.sysj line: 16, column: 10
              System.out.println("exit loader");//sysj\mainController.sysj line: 19, column: 4
              S1799=2;
              System.out.println("entering capper");//sysj\mainController.sysj line: 22, column: 5
              capperEnable.setPresent();//sysj\mainController.sysj line: 23, column: 5
              currsigs.addElement(capperEnable);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              bottleToLoad.setPresent();//sysj\mainController.sysj line: 17, column: 5
              currsigs.addElement(bottleToLoad);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 2 : 
            if(capperDone.getprestatus()){//sysj\mainController.sysj line: 21, column: 10
              System.out.println("exit capper");//sysj\mainController.sysj line: 25, column: 4
              S1799=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              capperEnable.setPresent();//sysj\mainController.sysj line: 23, column: 5
              currsigs.addElement(capperEnable);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
          case 4 : 
            if(conveyorDone.getprestatus()){//sysj\mainController.sysj line: 33, column: 10
              System.out.println("exit conveyor");//sysj\mainController.sysj line: 37, column: 4
              S1799=5;
              System.out.println("entering rotary");//sysj\mainController.sysj line: 40, column: 5
              rotaryEnable.setPresent();//sysj\mainController.sysj line: 41, column: 5
              currsigs.addElement(rotaryEnable);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              conveyorEnable.setPresent();//sysj\mainController.sysj line: 35, column: 5
              currsigs.addElement(conveyorEnable);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 5 : 
            if(rotaryDone.getprestatus()){//sysj\mainController.sysj line: 39, column: 10
              System.out.println("exit rotary");//sysj\mainController.sysj line: 43, column: 4
              S1799=6;
              System.out.println("entering capper");//sysj\mainController.sysj line: 46, column: 5
              capperEnable.setPresent();//sysj\mainController.sysj line: 47, column: 5
              currsigs.addElement(capperEnable);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              rotaryEnable.setPresent();//sysj\mainController.sysj line: 41, column: 5
              currsigs.addElement(rotaryEnable);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 6 : 
            if(capperDone.getprestatus()){//sysj\mainController.sysj line: 45, column: 10
              System.out.println("exit capper");//sysj\mainController.sysj line: 49, column: 4
              S1799=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              capperEnable.setPresent();//sysj\mainController.sysj line: 47, column: 5
              currsigs.addElement(capperEnable);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2034(int [] tdone, int [] ends){
        S2029=1;
    S2007=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread2033(int [] tdone, int [] ends){
        S1997=1;
    S1799=0;
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S2031){
        case 0 : 
          S2031=0;
          break RUN;
        
        case 1 : 
          S2031=2;
          S2031=2;
          thread2033(tdone,ends);
          thread2034(tdone,ends);
          int biggest2035 = 0;
          if(ends[2]>=biggest2035){
            biggest2035=ends[2];
          }
          if(ends[3]>=biggest2035){
            biggest2035=ends[3];
          }
          if(biggest2035 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread2036(tdone,ends);
          thread2037(tdone,ends);
          int biggest2038 = 0;
          if(ends[2]>=biggest2038){
            biggest2038=ends[2];
          }
          if(ends[3]>=biggest2038){
            biggest2038=ends[3];
          }
          if(biggest2038 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2038 == 0){
            S2031=0;
            active[1]=0;
            ends[1]=0;
            S2031=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0};
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
          bottleAtLoad.gethook();
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
      bottleAtLoad.setpreclear();
      conveyorEnable.setpreclear();
      rotaryEnable.setpreclear();
      capperEnable.setpreclear();
      fillerEnable.setpreclear();
      bottleToLoad.setpreclear();
      bottleAtLoadS.setpreclear();
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
      dummyint = bottleAtLoad.getStatus() ? bottleAtLoad.setprepresent() : bottleAtLoad.setpreclear();
      bottleAtLoad.setpreval(bottleAtLoad.getValue());
      bottleAtLoad.setClear();
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
      bottleAtLoadS.sethook();
      bottleAtLoadS.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        conveyorDone.gethook();
        rotaryDone.gethook();
        capperDone.gethook();
        loaderDone.gethook();
        unloaderDone.gethook();
        tick.gethook();
        bottleAtLoad.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
