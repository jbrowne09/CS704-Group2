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
  public Signal fillerDone = new Signal("fillerDone", Signal.INPUT);
  public Signal loaderDone = new Signal("loaderDone", Signal.INPUT);
  public Signal unloaderDone = new Signal("unloaderDone", Signal.INPUT);
  public Signal getBottle = new Signal("getBottle", Signal.INPUT);
  public Signal tick = new Signal("tick", Signal.INPUT);
  public Signal bottleAtLoad = new Signal("bottleAtLoad", Signal.INPUT);
  public Signal NbottleLeft5 = new Signal("NbottleLeft5", Signal.INPUT);
  public Signal NbottlePos2 = new Signal("NbottlePos2", Signal.INPUT);
  public Signal NbottlePos4 = new Signal("NbottlePos4", Signal.INPUT);
  public Signal conveyorEnable = new Signal("conveyorEnable", Signal.OUTPUT);
  public Signal rotaryEnable = new Signal("rotaryEnable", Signal.OUTPUT);
  public Signal capperEnable = new Signal("capperEnable", Signal.OUTPUT);
  public Signal fillerEnable = new Signal("fillerEnable", Signal.OUTPUT);
  public Signal bottleToLoad = new Signal("bottleToLoad", Signal.OUTPUT);
  public Signal bottleToUnload = new Signal("bottleToUnload", Signal.OUTPUT);
  public Signal bottleAtLoadS = new Signal("bottleAtLoadS", Signal.OUTPUT);
  private Signal bottleWaitAtLoad_1;
  private Signal bottleWaitAtEnd_1;
  private int S3752 = 1;
  private int S3496 = 1;
  private int S3462 = 1;
  private int S3534 = 1;
  private int S3500 = 1;
  private int S3572 = 1;
  private int S3538 = 1;
  private int S3610 = 1;
  private int S3576 = 1;
  private int S3648 = 1;
  private int S3614 = 1;
  private int S3686 = 1;
  private int S3652 = 1;
  private int S3718 = 1;
  private int S3696 = 1;
  private int S3750 = 1;
  private int S3728 = 1;
  
  private int[] ends = new int[10];
  private int[] tdone = new int[10];
  
  public void thread3770(int [] tdone, int [] ends){
        switch(S3750){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S3728){
          case 0 : 
            if(bottleAtLoad.getprestatus()){//sysj\mainController.sysj line: 102, column: 10
              S3728=1;
              bottleAtLoadS.setPresent();//sysj\mainController.sysj line: 104, column: 5
              currsigs.addElement(bottleAtLoadS);
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
          case 1 : 
            if(getBottle.getprestatus()){//sysj\mainController.sysj line: 103, column: 10
              S3728=0;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              bottleAtLoadS.setPresent();//sysj\mainController.sysj line: 104, column: 5
              currsigs.addElement(bottleAtLoadS);
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread3769(int [] tdone, int [] ends){
        switch(S3718){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S3696){
          case 0 : 
            if(!capperEnable.getprestatus() && !fillerEnable.getprestatus()){//sysj\mainController.sysj line: 91, column: 10
              S3696=1;
              rotaryEnable.setPresent();//sysj\mainController.sysj line: 93, column: 5
              currsigs.addElement(rotaryEnable);
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 1 : 
            if(capperEnable.getprestatus() || fillerEnable.getprestatus()){//sysj\mainController.sysj line: 92, column: 10
              S3696=0;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              rotaryEnable.setPresent();//sysj\mainController.sysj line: 93, column: 5
              currsigs.addElement(rotaryEnable);
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread3768(int [] tdone, int [] ends){
        switch(S3686){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S3652){
          case 0 : 
            if(!NbottlePos2.getprestatus()){//sysj\mainController.sysj line: 79, column: 10
              S3652=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            if(NbottlePos2.getprestatus()){//sysj\mainController.sysj line: 80, column: 10
              S3652=2;
              fillerEnable.setPresent();//sysj\mainController.sysj line: 82, column: 5
              currsigs.addElement(fillerEnable);
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 2 : 
            if(fillerDone.getprestatus()){//sysj\mainController.sysj line: 81, column: 10
              S3652=0;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              fillerEnable.setPresent();//sysj\mainController.sysj line: 82, column: 5
              currsigs.addElement(fillerEnable);
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread3767(int [] tdone, int [] ends){
        switch(S3648){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S3614){
          case 0 : 
            if(!NbottlePos4.getprestatus()){//sysj\mainController.sysj line: 67, column: 10
              S3614=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 1 : 
            if(NbottlePos4.getprestatus()){//sysj\mainController.sysj line: 68, column: 10
              S3614=2;
              capperEnable.setPresent();//sysj\mainController.sysj line: 70, column: 5
              currsigs.addElement(capperEnable);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 2 : 
            if(capperDone.getprestatus()){//sysj\mainController.sysj line: 69, column: 10
              S3614=0;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              capperEnable.setPresent();//sysj\mainController.sysj line: 70, column: 5
              currsigs.addElement(capperEnable);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread3766(int [] tdone, int [] ends){
        switch(S3610){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S3576){
          case 0 : 
            if(bottleWaitAtEnd_1.getprestatus()){//sysj\mainController.sysj line: 54, column: 10
              S3576=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            if(!unloaderDone.getprestatus()){//sysj\mainController.sysj line: 56, column: 10
              S3576=2;
              bottleToUnload.setPresent();//sysj\mainController.sysj line: 58, column: 5
              currsigs.addElement(bottleToUnload);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 2 : 
            if(unloaderDone.getprestatus()){//sysj\mainController.sysj line: 57, column: 10
              S3576=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              bottleToUnload.setPresent();//sysj\mainController.sysj line: 58, column: 5
              currsigs.addElement(bottleToUnload);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread3765(int [] tdone, int [] ends){
        switch(S3572){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S3538){
          case 0 : 
            if(!NbottleLeft5.getprestatus()){//sysj\mainController.sysj line: 44, column: 10
              S3538=1;
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
            if(NbottleLeft5.getprestatus()){//sysj\mainController.sysj line: 45, column: 10
              S3538=2;
              bottleWaitAtEnd_1.setPresent();//sysj\mainController.sysj line: 47, column: 5
              currsigs.addElement(bottleWaitAtEnd_1);
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
          
          case 2 : 
            if(!bottleToUnload.getprestatus()){//sysj\mainController.sysj line: 46, column: 10
              S3538=0;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              bottleWaitAtEnd_1.setPresent();//sysj\mainController.sysj line: 47, column: 5
              currsigs.addElement(bottleWaitAtEnd_1);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread3764(int [] tdone, int [] ends){
        switch(S3534){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S3500){
          case 0 : 
            if(bottleWaitAtLoad_1.getprestatus()){//sysj\mainController.sysj line: 33, column: 10
              S3500=1;
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
            if(!loaderDone.getprestatus()){//sysj\mainController.sysj line: 35, column: 10
              S3500=2;
              bottleToLoad.setPresent();//sysj\mainController.sysj line: 37, column: 5
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
            if(loaderDone.getprestatus()){//sysj\mainController.sysj line: 36, column: 10
              S3500=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              bottleToLoad.setPresent();//sysj\mainController.sysj line: 37, column: 5
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

  public void thread3763(int [] tdone, int [] ends){
        switch(S3496){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S3462){
          case 0 : 
            if(!bottleAtLoad.getprestatus()){//sysj\mainController.sysj line: 23, column: 10
              S3462=1;
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
            if(bottleAtLoad.getprestatus()){//sysj\mainController.sysj line: 24, column: 10
              S3462=2;
              bottleWaitAtLoad_1.setPresent();//sysj\mainController.sysj line: 26, column: 5
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
            if(!bottleToLoad.getprestatus()){//sysj\mainController.sysj line: 25, column: 10
              S3462=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              bottleWaitAtLoad_1.setPresent();//sysj\mainController.sysj line: 26, column: 5
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

  public void thread3761(int [] tdone, int [] ends){
        S3750=1;
    S3728=0;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread3760(int [] tdone, int [] ends){
        S3718=1;
    S3696=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread3759(int [] tdone, int [] ends){
        S3686=1;
    S3652=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread3758(int [] tdone, int [] ends){
        S3648=1;
    S3614=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread3757(int [] tdone, int [] ends){
        S3610=1;
    S3576=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread3756(int [] tdone, int [] ends){
        S3572=1;
    S3538=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread3755(int [] tdone, int [] ends){
        S3534=1;
    S3500=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread3754(int [] tdone, int [] ends){
        S3496=1;
    S3462=0;
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
      switch(S3752){
        case 0 : 
          S3752=0;
          break RUN;
        
        case 1 : 
          S3752=2;
          S3752=2;
          bottleWaitAtLoad_1.setClear();//sysj\mainController.sysj line: 19, column: 2
          bottleWaitAtEnd_1.setClear();//sysj\mainController.sysj line: 20, column: 2
          thread3754(tdone,ends);
          thread3755(tdone,ends);
          thread3756(tdone,ends);
          thread3757(tdone,ends);
          thread3758(tdone,ends);
          thread3759(tdone,ends);
          thread3760(tdone,ends);
          thread3761(tdone,ends);
          int biggest3762 = 0;
          if(ends[2]>=biggest3762){
            biggest3762=ends[2];
          }
          if(ends[3]>=biggest3762){
            biggest3762=ends[3];
          }
          if(ends[4]>=biggest3762){
            biggest3762=ends[4];
          }
          if(ends[5]>=biggest3762){
            biggest3762=ends[5];
          }
          if(ends[6]>=biggest3762){
            biggest3762=ends[6];
          }
          if(ends[7]>=biggest3762){
            biggest3762=ends[7];
          }
          if(ends[8]>=biggest3762){
            biggest3762=ends[8];
          }
          if(ends[9]>=biggest3762){
            biggest3762=ends[9];
          }
          if(biggest3762 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          bottleWaitAtLoad_1.setClear();//sysj\mainController.sysj line: 19, column: 2
          bottleWaitAtEnd_1.setClear();//sysj\mainController.sysj line: 20, column: 2
          thread3763(tdone,ends);
          thread3764(tdone,ends);
          thread3765(tdone,ends);
          thread3766(tdone,ends);
          thread3767(tdone,ends);
          thread3768(tdone,ends);
          thread3769(tdone,ends);
          thread3770(tdone,ends);
          int biggest3771 = 0;
          if(ends[2]>=biggest3771){
            biggest3771=ends[2];
          }
          if(ends[3]>=biggest3771){
            biggest3771=ends[3];
          }
          if(ends[4]>=biggest3771){
            biggest3771=ends[4];
          }
          if(ends[5]>=biggest3771){
            biggest3771=ends[5];
          }
          if(ends[6]>=biggest3771){
            biggest3771=ends[6];
          }
          if(ends[7]>=biggest3771){
            biggest3771=ends[7];
          }
          if(ends[8]>=biggest3771){
            biggest3771=ends[8];
          }
          if(ends[9]>=biggest3771){
            biggest3771=ends[9];
          }
          if(biggest3771 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest3771 == 0){
            S3752=0;
            active[1]=0;
            ends[1]=0;
            S3752=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    bottleWaitAtLoad_1 = new Signal();
    bottleWaitAtEnd_1 = new Signal();
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
          fillerDone.gethook();
          loaderDone.gethook();
          unloaderDone.gethook();
          getBottle.gethook();
          tick.gethook();
          bottleAtLoad.gethook();
          NbottleLeft5.gethook();
          NbottlePos2.gethook();
          NbottlePos4.gethook();
          df = true;
        }
        runClockDomain();
      }
      conveyorDone.setpreclear();
      rotaryDone.setpreclear();
      capperDone.setpreclear();
      fillerDone.setpreclear();
      loaderDone.setpreclear();
      unloaderDone.setpreclear();
      getBottle.setpreclear();
      tick.setpreclear();
      bottleAtLoad.setpreclear();
      NbottleLeft5.setpreclear();
      NbottlePos2.setpreclear();
      NbottlePos4.setpreclear();
      conveyorEnable.setpreclear();
      rotaryEnable.setpreclear();
      capperEnable.setpreclear();
      fillerEnable.setpreclear();
      bottleToLoad.setpreclear();
      bottleToUnload.setpreclear();
      bottleAtLoadS.setpreclear();
      bottleWaitAtLoad_1.setpreclear();
      bottleWaitAtEnd_1.setpreclear();
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
      dummyint = fillerDone.getStatus() ? fillerDone.setprepresent() : fillerDone.setpreclear();
      fillerDone.setpreval(fillerDone.getValue());
      fillerDone.setClear();
      dummyint = loaderDone.getStatus() ? loaderDone.setprepresent() : loaderDone.setpreclear();
      loaderDone.setpreval(loaderDone.getValue());
      loaderDone.setClear();
      dummyint = unloaderDone.getStatus() ? unloaderDone.setprepresent() : unloaderDone.setpreclear();
      unloaderDone.setpreval(unloaderDone.getValue());
      unloaderDone.setClear();
      dummyint = getBottle.getStatus() ? getBottle.setprepresent() : getBottle.setpreclear();
      getBottle.setpreval(getBottle.getValue());
      getBottle.setClear();
      dummyint = tick.getStatus() ? tick.setprepresent() : tick.setpreclear();
      tick.setpreval(tick.getValue());
      tick.setClear();
      dummyint = bottleAtLoad.getStatus() ? bottleAtLoad.setprepresent() : bottleAtLoad.setpreclear();
      bottleAtLoad.setpreval(bottleAtLoad.getValue());
      bottleAtLoad.setClear();
      dummyint = NbottleLeft5.getStatus() ? NbottleLeft5.setprepresent() : NbottleLeft5.setpreclear();
      NbottleLeft5.setpreval(NbottleLeft5.getValue());
      NbottleLeft5.setClear();
      dummyint = NbottlePos2.getStatus() ? NbottlePos2.setprepresent() : NbottlePos2.setpreclear();
      NbottlePos2.setpreval(NbottlePos2.getValue());
      NbottlePos2.setClear();
      dummyint = NbottlePos4.getStatus() ? NbottlePos4.setprepresent() : NbottlePos4.setpreclear();
      NbottlePos4.setpreval(NbottlePos4.getValue());
      NbottlePos4.setClear();
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
      bottleToUnload.sethook();
      bottleToUnload.setClear();
      bottleAtLoadS.sethook();
      bottleAtLoadS.setClear();
      bottleWaitAtLoad_1.setClear();
      bottleWaitAtEnd_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        conveyorDone.gethook();
        rotaryDone.gethook();
        capperDone.gethook();
        fillerDone.gethook();
        loaderDone.gethook();
        unloaderDone.gethook();
        getBottle.gethook();
        tick.gethook();
        bottleAtLoad.gethook();
        NbottleLeft5.gethook();
        NbottlePos2.gethook();
        NbottlePos4.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
