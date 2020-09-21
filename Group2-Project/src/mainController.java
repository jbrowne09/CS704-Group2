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
  private Signal bottleWaitAtLoad_1;
  private int S1892 = 1;
  private int S1820 = 1;
  private int S1786 = 1;
  private int S1858 = 1;
  private int S1824 = 1;
  private int S1890 = 1;
  private int S1868 = 1;
  
  private int[] ends = new int[5];
  private int[] tdone = new int[5];
  
  public void thread1900(int [] tdone, int [] ends){
        switch(S1890){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S1868){
          case 0 : 
            if(bottleAtLoad.getprestatus()){//sysj\mainController.sysj line: 78, column: 10
              S1868=1;
              bottleAtLoadS.setPresent();//sysj\mainController.sysj line: 80, column: 5
              currsigs.addElement(bottleAtLoadS);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            if(!bottleAtLoad.getprestatus()){//sysj\mainController.sysj line: 79, column: 10
              S1868=0;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              bottleAtLoadS.setPresent();//sysj\mainController.sysj line: 80, column: 5
              currsigs.addElement(bottleAtLoadS);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1899(int [] tdone, int [] ends){
        switch(S1858){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S1824){
          case 0 : 
            if(bottleWaitAtLoad_1.getprestatus()){//sysj\mainController.sysj line: 23, column: 10
              S1824=1;
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
            if(!loaderDone.getprestatus()){//sysj\mainController.sysj line: 25, column: 10
              S1824=2;
              bottleToLoad.setPresent();//sysj\mainController.sysj line: 27, column: 5
              currsigs.addElement(bottleToLoad);
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
          
          case 2 : 
            if(loaderDone.getprestatus()){//sysj\mainController.sysj line: 26, column: 10
              S1824=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              bottleToLoad.setPresent();//sysj\mainController.sysj line: 27, column: 5
              currsigs.addElement(bottleToLoad);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1898(int [] tdone, int [] ends){
        switch(S1820){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S1786){
          case 0 : 
            if(!bottleAtLoad.getprestatus()){//sysj\mainController.sysj line: 13, column: 10
              S1786=1;
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
            if(bottleAtLoad.getprestatus()){//sysj\mainController.sysj line: 14, column: 10
              S1786=2;
              bottleWaitAtLoad_1.setPresent();//sysj\mainController.sysj line: 16, column: 5
              currsigs.addElement(bottleWaitAtLoad_1);
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
          
          case 2 : 
            if(!bottleToLoad.getprestatus()){//sysj\mainController.sysj line: 15, column: 10
              S1786=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              bottleWaitAtLoad_1.setPresent();//sysj\mainController.sysj line: 16, column: 5
              currsigs.addElement(bottleWaitAtLoad_1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1896(int [] tdone, int [] ends){
        S1890=1;
    S1868=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread1895(int [] tdone, int [] ends){
        S1858=1;
    S1824=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread1894(int [] tdone, int [] ends){
        S1820=1;
    S1786=0;
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
      switch(S1892){
        case 0 : 
          S1892=0;
          break RUN;
        
        case 1 : 
          S1892=2;
          S1892=2;
          bottleWaitAtLoad_1.setClear();//sysj\mainController.sysj line: 10, column: 2
          thread1894(tdone,ends);
          thread1895(tdone,ends);
          thread1896(tdone,ends);
          int biggest1897 = 0;
          if(ends[2]>=biggest1897){
            biggest1897=ends[2];
          }
          if(ends[3]>=biggest1897){
            biggest1897=ends[3];
          }
          if(ends[4]>=biggest1897){
            biggest1897=ends[4];
          }
          if(biggest1897 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          bottleWaitAtLoad_1.setClear();//sysj\mainController.sysj line: 10, column: 2
          thread1898(tdone,ends);
          thread1899(tdone,ends);
          thread1900(tdone,ends);
          int biggest1901 = 0;
          if(ends[2]>=biggest1901){
            biggest1901=ends[2];
          }
          if(ends[3]>=biggest1901){
            biggest1901=ends[3];
          }
          if(ends[4]>=biggest1901){
            biggest1901=ends[4];
          }
          if(biggest1901 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1901 == 0){
            S1892=0;
            active[1]=0;
            ends[1]=0;
            S1892=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    bottleWaitAtLoad_1 = new Signal();
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
      bottleWaitAtLoad_1.setpreclear();
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
      bottleWaitAtLoad_1.setClear();
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
