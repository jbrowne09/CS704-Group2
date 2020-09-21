import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class fillerController extends ClockDomain{
  public fillerController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottlePos2 = new Signal("bottlePos2", Signal.INPUT);
  public Signal canBottom = new Signal("canBottom", Signal.INPUT);
  public Signal canTop = new Signal("canTop", Signal.INPUT);
  public Signal liquid1 = new Signal("liquid1", Signal.INPUT);
  public Signal liquid2 = new Signal("liquid2", Signal.INPUT);
  public Signal liquid3 = new Signal("liquid3", Signal.INPUT);
  public Signal liquid4 = new Signal("liquid4", Signal.INPUT);
  public Signal fillerEnable = new Signal("fillerEnable", Signal.INPUT);
  public Signal inletOn = new Signal("inletOn", Signal.OUTPUT);
  public Signal injectorOn = new Signal("injectorOn", Signal.OUTPUT);
  public Signal valveRetract = new Signal("valveRetract", Signal.OUTPUT);
  public Signal valveExtend = new Signal("valveExtend", Signal.OUTPUT);
  public Signal liquidPos1 = new Signal("liquidPos1", Signal.OUTPUT);
  public Signal liquidPos2 = new Signal("liquidPos2", Signal.OUTPUT);
  public Signal liquidPos3 = new Signal("liquidPos3", Signal.OUTPUT);
  public Signal liquidPos4 = new Signal("liquidPos4", Signal.OUTPUT);
  public Signal fillerDone = new Signal("fillerDone", Signal.OUTPUT);
  private int S1015 = 1;
  private int S979 = 1;
  private int S761 = 1;
  private int S766 = 1;
  private int S784 = 1;
  private int S789 = 1;
  private int S1013 = 1;
  private int S987 = 1;
  private int S995 = 1;
  private int S1003 = 1;
  private int S1011 = 1;
  
  private int[] ends = new int[12];
  private int[] tdone = new int[12];
  
  public void thread1045(int [] tdone, int [] ends){
        switch(S1011){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(liquid4.getprestatus()){//sysj\fillerController.sysj line: 35, column: 25
          liquidPos4.setPresent();//sysj\fillerController.sysj line: 35, column: 35
          currsigs.addElement(liquidPos4);
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        else {
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread1044(int [] tdone, int [] ends){
        switch(S1003){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(liquid3.getprestatus()){//sysj\fillerController.sysj line: 33, column: 25
          liquidPos3.setPresent();//sysj\fillerController.sysj line: 33, column: 35
          currsigs.addElement(liquidPos3);
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
      
    }
  }

  public void thread1043(int [] tdone, int [] ends){
        switch(S995){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(liquid2.getprestatus()){//sysj\fillerController.sysj line: 31, column: 25
          liquidPos2.setPresent();//sysj\fillerController.sysj line: 31, column: 35
          currsigs.addElement(liquidPos2);
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
      
    }
  }

  public void thread1042(int [] tdone, int [] ends){
        switch(S987){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(liquid1.getprestatus()){//sysj\fillerController.sysj line: 29, column: 25
          liquidPos1.setPresent();//sysj\fillerController.sysj line: 29, column: 35
          currsigs.addElement(liquidPos1);
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
      
    }
  }

  public void thread1041(int [] tdone, int [] ends){
        switch(S1013){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        thread1042(tdone,ends);
        thread1043(tdone,ends);
        thread1044(tdone,ends);
        thread1045(tdone,ends);
        int biggest1046 = 0;
        if(ends[8]>=biggest1046){
          biggest1046=ends[8];
        }
        if(ends[9]>=biggest1046){
          biggest1046=ends[9];
        }
        if(ends[10]>=biggest1046){
          biggest1046=ends[10];
        }
        if(ends[11]>=biggest1046){
          biggest1046=ends[11];
        }
        if(biggest1046 == 1){
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        //FINXME code
        if(biggest1046 == 0){
          S1013=0;
          active[7]=0;
          ends[7]=0;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread1039(int [] tdone, int [] ends){
        switch(S789){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        valveExtend.setPresent();//sysj\fillerController.sysj line: 22, column: 6
        currsigs.addElement(valveExtend);
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
        break;
      
    }
  }

  public void thread1038(int [] tdone, int [] ends){
        switch(S784){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        inletOn.setPresent();//sysj\fillerController.sysj line: 20, column: 6
        currsigs.addElement(inletOn);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
        break;
      
    }
  }

  public void thread1036(int [] tdone, int [] ends){
        S789=1;
    valveExtend.setPresent();//sysj\fillerController.sysj line: 22, column: 6
    currsigs.addElement(valveExtend);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread1035(int [] tdone, int [] ends){
        S784=1;
    inletOn.setPresent();//sysj\fillerController.sysj line: 20, column: 6
    currsigs.addElement(inletOn);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread1033(int [] tdone, int [] ends){
        active[4]=0;
    ends[4]=0;
    tdone[4]=1;
  }

  public void thread1032(int [] tdone, int [] ends){
        switch(S766){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        injectorOn.setPresent();//sysj\fillerController.sysj line: 12, column: 6
        currsigs.addElement(injectorOn);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread1030(int [] tdone, int [] ends){
        S789=1;
    valveExtend.setPresent();//sysj\fillerController.sysj line: 22, column: 6
    currsigs.addElement(valveExtend);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread1029(int [] tdone, int [] ends){
        S784=1;
    inletOn.setPresent();//sysj\fillerController.sysj line: 20, column: 6
    currsigs.addElement(inletOn);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread1027(int [] tdone, int [] ends){
        if(canBottom.getprestatus()){//sysj\fillerController.sysj line: 14, column: 15
      valveRetract.setPresent();//sysj\fillerController.sysj line: 15, column: 6
      currsigs.addElement(valveRetract);
      active[4]=0;
      ends[4]=0;
      tdone[4]=1;
    }
    else {
      active[4]=0;
      ends[4]=0;
      tdone[4]=1;
    }
  }

  public void thread1026(int [] tdone, int [] ends){
        S766=1;
    injectorOn.setPresent();//sysj\fillerController.sysj line: 12, column: 6
    currsigs.addElement(injectorOn);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread1025(int [] tdone, int [] ends){
        switch(S979){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S761){
          case 0 : 
            if(fillerEnable.getprestatus()){//sysj\fillerController.sysj line: 9, column: 10
              S761=1;
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
            if(bottlePos2.getprestatus()){//sysj\fillerController.sysj line: 10, column: 10
              S761=2;
              thread1026(tdone,ends);
              thread1027(tdone,ends);
              int biggest1028 = 0;
              if(ends[3]>=biggest1028){
                biggest1028=ends[3];
              }
              if(ends[4]>=biggest1028){
                biggest1028=ends[4];
              }
              if(biggest1028 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 2 : 
            if(canTop.getprestatus()){//sysj\fillerController.sysj line: 11, column: 10
              S761=3;
              thread1029(tdone,ends);
              thread1030(tdone,ends);
              int biggest1031 = 0;
              if(ends[5]>=biggest1031){
                biggest1031=ends[5];
              }
              if(ends[6]>=biggest1031){
                biggest1031=ends[6];
              }
              if(biggest1031 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              thread1032(tdone,ends);
              thread1033(tdone,ends);
              int biggest1034 = 0;
              if(ends[3]>=biggest1034){
                biggest1034=ends[3];
              }
              if(ends[4]>=biggest1034){
                biggest1034=ends[4];
              }
              if(biggest1034 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest1034 == 0){
                S761=3;
                thread1035(tdone,ends);
                thread1036(tdone,ends);
                int biggest1037 = 0;
                if(ends[5]>=biggest1037){
                  biggest1037=ends[5];
                }
                if(ends[6]>=biggest1037){
                  biggest1037=ends[6];
                }
                if(biggest1037 == 1){
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
            }
            break;
          
          case 3 : 
            if(canBottom.getprestatus()){//sysj\fillerController.sysj line: 19, column: 10
              fillerDone.setPresent();//sysj\fillerController.sysj line: 24, column: 4
              currsigs.addElement(fillerDone);
              S761=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              thread1038(tdone,ends);
              thread1039(tdone,ends);
              int biggest1040 = 0;
              if(ends[5]>=biggest1040){
                biggest1040=ends[5];
              }
              if(ends[6]>=biggest1040){
                biggest1040=ends[6];
              }
              if(biggest1040 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest1040 == 0){
                fillerDone.setPresent();//sysj\fillerController.sysj line: 24, column: 4
                currsigs.addElement(fillerDone);
                S761=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1022(int [] tdone, int [] ends){
        S1011=1;
    if(liquid4.getprestatus()){//sysj\fillerController.sysj line: 35, column: 25
      liquidPos4.setPresent();//sysj\fillerController.sysj line: 35, column: 35
      currsigs.addElement(liquidPos4);
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread1021(int [] tdone, int [] ends){
        S1003=1;
    if(liquid3.getprestatus()){//sysj\fillerController.sysj line: 33, column: 25
      liquidPos3.setPresent();//sysj\fillerController.sysj line: 33, column: 35
      currsigs.addElement(liquidPos3);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread1020(int [] tdone, int [] ends){
        S995=1;
    if(liquid2.getprestatus()){//sysj\fillerController.sysj line: 31, column: 25
      liquidPos2.setPresent();//sysj\fillerController.sysj line: 31, column: 35
      currsigs.addElement(liquidPos2);
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread1019(int [] tdone, int [] ends){
        S987=1;
    if(liquid1.getprestatus()){//sysj\fillerController.sysj line: 29, column: 25
      liquidPos1.setPresent();//sysj\fillerController.sysj line: 29, column: 35
      currsigs.addElement(liquidPos1);
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread1018(int [] tdone, int [] ends){
        S1013=1;
    thread1019(tdone,ends);
    thread1020(tdone,ends);
    thread1021(tdone,ends);
    thread1022(tdone,ends);
    int biggest1023 = 0;
    if(ends[8]>=biggest1023){
      biggest1023=ends[8];
    }
    if(ends[9]>=biggest1023){
      biggest1023=ends[9];
    }
    if(ends[10]>=biggest1023){
      biggest1023=ends[10];
    }
    if(ends[11]>=biggest1023){
      biggest1023=ends[11];
    }
    if(biggest1023 == 1){
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread1017(int [] tdone, int [] ends){
        S979=1;
    S761=0;
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
      switch(S1015){
        case 0 : 
          S1015=0;
          break RUN;
        
        case 1 : 
          S1015=2;
          S1015=2;
          thread1017(tdone,ends);
          thread1018(tdone,ends);
          int biggest1024 = 0;
          if(ends[2]>=biggest1024){
            biggest1024=ends[2];
          }
          if(ends[7]>=biggest1024){
            biggest1024=ends[7];
          }
          if(biggest1024 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread1025(tdone,ends);
          thread1041(tdone,ends);
          int biggest1047 = 0;
          if(ends[2]>=biggest1047){
            biggest1047=ends[2];
          }
          if(ends[7]>=biggest1047){
            biggest1047=ends[7];
          }
          if(biggest1047 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1047 == 0){
            S1015=0;
            active[1]=0;
            ends[1]=0;
            S1015=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          bottlePos2.gethook();
          canBottom.gethook();
          canTop.gethook();
          liquid1.gethook();
          liquid2.gethook();
          liquid3.gethook();
          liquid4.gethook();
          fillerEnable.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottlePos2.setpreclear();
      canBottom.setpreclear();
      canTop.setpreclear();
      liquid1.setpreclear();
      liquid2.setpreclear();
      liquid3.setpreclear();
      liquid4.setpreclear();
      fillerEnable.setpreclear();
      inletOn.setpreclear();
      injectorOn.setpreclear();
      valveRetract.setpreclear();
      valveExtend.setpreclear();
      liquidPos1.setpreclear();
      liquidPos2.setpreclear();
      liquidPos3.setpreclear();
      liquidPos4.setpreclear();
      fillerDone.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottlePos2.getStatus() ? bottlePos2.setprepresent() : bottlePos2.setpreclear();
      bottlePos2.setpreval(bottlePos2.getValue());
      bottlePos2.setClear();
      dummyint = canBottom.getStatus() ? canBottom.setprepresent() : canBottom.setpreclear();
      canBottom.setpreval(canBottom.getValue());
      canBottom.setClear();
      dummyint = canTop.getStatus() ? canTop.setprepresent() : canTop.setpreclear();
      canTop.setpreval(canTop.getValue());
      canTop.setClear();
      dummyint = liquid1.getStatus() ? liquid1.setprepresent() : liquid1.setpreclear();
      liquid1.setpreval(liquid1.getValue());
      liquid1.setClear();
      dummyint = liquid2.getStatus() ? liquid2.setprepresent() : liquid2.setpreclear();
      liquid2.setpreval(liquid2.getValue());
      liquid2.setClear();
      dummyint = liquid3.getStatus() ? liquid3.setprepresent() : liquid3.setpreclear();
      liquid3.setpreval(liquid3.getValue());
      liquid3.setClear();
      dummyint = liquid4.getStatus() ? liquid4.setprepresent() : liquid4.setpreclear();
      liquid4.setpreval(liquid4.getValue());
      liquid4.setClear();
      dummyint = fillerEnable.getStatus() ? fillerEnable.setprepresent() : fillerEnable.setpreclear();
      fillerEnable.setpreval(fillerEnable.getValue());
      fillerEnable.setClear();
      inletOn.sethook();
      inletOn.setClear();
      injectorOn.sethook();
      injectorOn.setClear();
      valveRetract.sethook();
      valveRetract.setClear();
      valveExtend.sethook();
      valveExtend.setClear();
      liquidPos1.sethook();
      liquidPos1.setClear();
      liquidPos2.sethook();
      liquidPos2.setClear();
      liquidPos3.sethook();
      liquidPos3.setClear();
      liquidPos4.sethook();
      liquidPos4.setClear();
      fillerDone.sethook();
      fillerDone.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        bottlePos2.gethook();
        canBottom.gethook();
        canTop.gethook();
        liquid1.gethook();
        liquid2.gethook();
        liquid3.gethook();
        liquid4.gethook();
        fillerEnable.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
