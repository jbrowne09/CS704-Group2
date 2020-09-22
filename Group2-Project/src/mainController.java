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
  public Signal caploaderDone = new Signal("caploaderDone", Signal.INPUT);
  public Signal getBottle = new Signal("getBottle", Signal.INPUT);
  public Signal tick = new Signal("tick", Signal.INPUT);
  public Signal bottleAtLoad = new Signal("bottleAtLoad", Signal.INPUT);
  public Signal NbottleLeft5 = new Signal("NbottleLeft5", Signal.INPUT);
  public Signal NbottlePos2 = new Signal("NbottlePos2", Signal.INPUT);
  public Signal NbottlePos3 = new Signal("NbottlePos3", Signal.INPUT);
  public Signal NbottlePos4 = new Signal("NbottlePos4", Signal.INPUT);
  public Signal conveyorEnable = new Signal("conveyorEnable", Signal.OUTPUT);
  public Signal rotaryEnable = new Signal("rotaryEnable", Signal.OUTPUT);
  public Signal capperEnable = new Signal("capperEnable", Signal.OUTPUT);
  public Signal fillerEnable = new Signal("fillerEnable", Signal.OUTPUT);
  public Signal caploaderEnable = new Signal("caploaderEnable", Signal.OUTPUT);
  public Signal bottleToLoad = new Signal("bottleToLoad", Signal.OUTPUT);
  public Signal bottleToUnload = new Signal("bottleToUnload", Signal.OUTPUT);
  public Signal bottleAtLoadS = new Signal("bottleAtLoadS", Signal.OUTPUT);
  private Signal bottleWaitAtLoad_1;
  private Signal bottleWaitAtEnd_1;
  private int S6917 = 1;
  private int S6623 = 1;
  private int S6589 = 1;
  private int S6661 = 1;
  private int S6627 = 1;
  private int S6699 = 1;
  private int S6665 = 1;
  private int S6737 = 1;
  private int S6703 = 1;
  private int S6775 = 1;
  private int S6741 = 1;
  private int S6813 = 1;
  private int S6779 = 1;
  private int S6851 = 1;
  private int S6817 = 1;
  private int S6883 = 1;
  private int S6861 = 1;
  private int S6915 = 1;
  private int S6893 = 1;
  
  private int[] ends = new int[11];
  private int[] tdone = new int[11];
  
  public void thread6937(int [] tdone, int [] ends){
        switch(S6915){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S6893){
          case 0 : 
            if(bottleAtLoad.getprestatus()){//sysj\mainController.sysj line: 110, column: 10
              S6893=1;
              bottleAtLoadS.setPresent();//sysj\mainController.sysj line: 112, column: 5
              currsigs.addElement(bottleAtLoadS);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 1 : 
            if(getBottle.getprestatus()){//sysj\mainController.sysj line: 111, column: 10
              S6893=0;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              bottleAtLoadS.setPresent();//sysj\mainController.sysj line: 112, column: 5
              currsigs.addElement(bottleAtLoadS);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread6936(int [] tdone, int [] ends){
        switch(S6883){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S6861){
          case 0 : 
            if(!capperEnable.getprestatus() && !fillerEnable.getprestatus() && !caploaderEnable.getprestatus()){//sysj\mainController.sysj line: 99, column: 10
              S6861=1;
              rotaryEnable.setPresent();//sysj\mainController.sysj line: 101, column: 5
              currsigs.addElement(rotaryEnable);
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
            if(capperEnable.getprestatus() || fillerEnable.getprestatus() || caploaderEnable.getprestatus()){//sysj\mainController.sysj line: 100, column: 10
              S6861=0;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              rotaryEnable.setPresent();//sysj\mainController.sysj line: 101, column: 5
              currsigs.addElement(rotaryEnable);
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread6935(int [] tdone, int [] ends){
        switch(S6851){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S6817){
          case 0 : 
            if(!NbottlePos2.getprestatus()){//sysj\mainController.sysj line: 88, column: 10
              S6817=1;
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
            if(NbottlePos2.getprestatus()){//sysj\mainController.sysj line: 89, column: 10
              S6817=2;
              fillerEnable.setPresent();//sysj\mainController.sysj line: 91, column: 5
              currsigs.addElement(fillerEnable);
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
          
          case 2 : 
            if(fillerDone.getprestatus()){//sysj\mainController.sysj line: 90, column: 10
              S6817=0;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              fillerEnable.setPresent();//sysj\mainController.sysj line: 91, column: 5
              currsigs.addElement(fillerEnable);
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread6934(int [] tdone, int [] ends){
        switch(S6813){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S6779){
          case 0 : 
            if(!NbottlePos4.getprestatus()){//sysj\mainController.sysj line: 77, column: 10
              S6779=1;
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
            if(NbottlePos4.getprestatus()){//sysj\mainController.sysj line: 78, column: 10
              S6779=2;
              capperEnable.setPresent();//sysj\mainController.sysj line: 80, column: 5
              currsigs.addElement(capperEnable);
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
            if(capperDone.getprestatus()){//sysj\mainController.sysj line: 79, column: 10
              S6779=0;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              capperEnable.setPresent();//sysj\mainController.sysj line: 80, column: 5
              currsigs.addElement(capperEnable);
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread6933(int [] tdone, int [] ends){
        switch(S6775){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S6741){
          case 0 : 
            if(!NbottlePos3.getprestatus()){//sysj\mainController.sysj line: 66, column: 10
              S6741=1;
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
            if(NbottlePos3.getprestatus()){//sysj\mainController.sysj line: 67, column: 10
              S6741=2;
              caploaderEnable.setPresent();//sysj\mainController.sysj line: 69, column: 5
              currsigs.addElement(caploaderEnable);
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
            if(caploaderDone.getprestatus()){//sysj\mainController.sysj line: 68, column: 10
              S6741=0;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              caploaderEnable.setPresent();//sysj\mainController.sysj line: 69, column: 5
              currsigs.addElement(caploaderEnable);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread6932(int [] tdone, int [] ends){
        switch(S6737){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S6703){
          case 0 : 
            if(bottleWaitAtEnd_1.getprestatus()){//sysj\mainController.sysj line: 54, column: 10
              S6703=1;
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
              S6703=2;
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
              S6703=0;
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

  public void thread6931(int [] tdone, int [] ends){
        switch(S6699){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S6665){
          case 0 : 
            if(!NbottleLeft5.getprestatus()){//sysj\mainController.sysj line: 44, column: 10
              S6665=1;
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
              S6665=2;
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
              S6665=0;
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

  public void thread6930(int [] tdone, int [] ends){
        switch(S6661){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S6627){
          case 0 : 
            if(bottleWaitAtLoad_1.getprestatus()){//sysj\mainController.sysj line: 33, column: 10
              S6627=1;
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
              S6627=2;
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
              S6627=0;
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

  public void thread6929(int [] tdone, int [] ends){
        switch(S6623){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S6589){
          case 0 : 
            if(!bottleAtLoad.getprestatus()){//sysj\mainController.sysj line: 23, column: 10
              S6589=1;
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
              S6589=2;
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
              S6589=0;
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

  public void thread6927(int [] tdone, int [] ends){
        S6915=1;
    S6893=0;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread6926(int [] tdone, int [] ends){
        S6883=1;
    S6861=0;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread6925(int [] tdone, int [] ends){
        S6851=1;
    S6817=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread6924(int [] tdone, int [] ends){
        S6813=1;
    S6779=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread6923(int [] tdone, int [] ends){
        S6775=1;
    S6741=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread6922(int [] tdone, int [] ends){
        S6737=1;
    S6703=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread6921(int [] tdone, int [] ends){
        S6699=1;
    S6665=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread6920(int [] tdone, int [] ends){
        S6661=1;
    S6627=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread6919(int [] tdone, int [] ends){
        S6623=1;
    S6589=0;
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
      switch(S6917){
        case 0 : 
          S6917=0;
          break RUN;
        
        case 1 : 
          S6917=2;
          S6917=2;
          bottleWaitAtLoad_1.setClear();//sysj\mainController.sysj line: 19, column: 2
          bottleWaitAtEnd_1.setClear();//sysj\mainController.sysj line: 20, column: 2
          thread6919(tdone,ends);
          thread6920(tdone,ends);
          thread6921(tdone,ends);
          thread6922(tdone,ends);
          thread6923(tdone,ends);
          thread6924(tdone,ends);
          thread6925(tdone,ends);
          thread6926(tdone,ends);
          thread6927(tdone,ends);
          int biggest6928 = 0;
          if(ends[2]>=biggest6928){
            biggest6928=ends[2];
          }
          if(ends[3]>=biggest6928){
            biggest6928=ends[3];
          }
          if(ends[4]>=biggest6928){
            biggest6928=ends[4];
          }
          if(ends[5]>=biggest6928){
            biggest6928=ends[5];
          }
          if(ends[6]>=biggest6928){
            biggest6928=ends[6];
          }
          if(ends[7]>=biggest6928){
            biggest6928=ends[7];
          }
          if(ends[8]>=biggest6928){
            biggest6928=ends[8];
          }
          if(ends[9]>=biggest6928){
            biggest6928=ends[9];
          }
          if(ends[10]>=biggest6928){
            biggest6928=ends[10];
          }
          if(biggest6928 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          bottleWaitAtLoad_1.setClear();//sysj\mainController.sysj line: 19, column: 2
          bottleWaitAtEnd_1.setClear();//sysj\mainController.sysj line: 20, column: 2
          thread6929(tdone,ends);
          thread6930(tdone,ends);
          thread6931(tdone,ends);
          thread6932(tdone,ends);
          thread6933(tdone,ends);
          thread6934(tdone,ends);
          thread6935(tdone,ends);
          thread6936(tdone,ends);
          thread6937(tdone,ends);
          int biggest6938 = 0;
          if(ends[2]>=biggest6938){
            biggest6938=ends[2];
          }
          if(ends[3]>=biggest6938){
            biggest6938=ends[3];
          }
          if(ends[4]>=biggest6938){
            biggest6938=ends[4];
          }
          if(ends[5]>=biggest6938){
            biggest6938=ends[5];
          }
          if(ends[6]>=biggest6938){
            biggest6938=ends[6];
          }
          if(ends[7]>=biggest6938){
            biggest6938=ends[7];
          }
          if(ends[8]>=biggest6938){
            biggest6938=ends[8];
          }
          if(ends[9]>=biggest6938){
            biggest6938=ends[9];
          }
          if(ends[10]>=biggest6938){
            biggest6938=ends[10];
          }
          if(biggest6938 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest6938 == 0){
            S6917=0;
            active[1]=0;
            ends[1]=0;
            S6917=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          caploaderDone.gethook();
          getBottle.gethook();
          tick.gethook();
          bottleAtLoad.gethook();
          NbottleLeft5.gethook();
          NbottlePos2.gethook();
          NbottlePos3.gethook();
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
      caploaderDone.setpreclear();
      getBottle.setpreclear();
      tick.setpreclear();
      bottleAtLoad.setpreclear();
      NbottleLeft5.setpreclear();
      NbottlePos2.setpreclear();
      NbottlePos3.setpreclear();
      NbottlePos4.setpreclear();
      conveyorEnable.setpreclear();
      rotaryEnable.setpreclear();
      capperEnable.setpreclear();
      fillerEnable.setpreclear();
      caploaderEnable.setpreclear();
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
      dummyint = caploaderDone.getStatus() ? caploaderDone.setprepresent() : caploaderDone.setpreclear();
      caploaderDone.setpreval(caploaderDone.getValue());
      caploaderDone.setClear();
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
      dummyint = NbottlePos3.getStatus() ? NbottlePos3.setprepresent() : NbottlePos3.setpreclear();
      NbottlePos3.setpreval(NbottlePos3.getValue());
      NbottlePos3.setClear();
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
      caploaderEnable.sethook();
      caploaderEnable.setClear();
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
        caploaderDone.gethook();
        getBottle.gethook();
        tick.gethook();
        bottleAtLoad.gethook();
        NbottleLeft5.gethook();
        NbottlePos2.gethook();
        NbottlePos3.gethook();
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
