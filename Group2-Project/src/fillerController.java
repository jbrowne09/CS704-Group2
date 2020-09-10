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
  private int S1121 = 1;
  private int S1085 = 1;
  private int S867 = 1;
  private int S872 = 1;
  private int S890 = 1;
  private int S895 = 1;
  private int S1119 = 1;
  private int S1093 = 1;
  private int S1101 = 1;
  private int S1109 = 1;
  private int S1117 = 1;
  
  private int[] ends = new int[12];
  private int[] tdone = new int[12];
  
  public void thread1151(int [] tdone, int [] ends){
        switch(S1117){
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

  public void thread1150(int [] tdone, int [] ends){
        switch(S1109){
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

  public void thread1149(int [] tdone, int [] ends){
        switch(S1101){
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

  public void thread1148(int [] tdone, int [] ends){
        switch(S1093){
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

  public void thread1147(int [] tdone, int [] ends){
        switch(S1119){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        thread1148(tdone,ends);
        thread1149(tdone,ends);
        thread1150(tdone,ends);
        thread1151(tdone,ends);
        int biggest1152 = 0;
        if(ends[8]>=biggest1152){
          biggest1152=ends[8];
        }
        if(ends[9]>=biggest1152){
          biggest1152=ends[9];
        }
        if(ends[10]>=biggest1152){
          biggest1152=ends[10];
        }
        if(ends[11]>=biggest1152){
          biggest1152=ends[11];
        }
        if(biggest1152 == 1){
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        //FINXME code
        if(biggest1152 == 0){
          S1119=0;
          active[7]=0;
          ends[7]=0;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread1145(int [] tdone, int [] ends){
        switch(S895){
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

  public void thread1144(int [] tdone, int [] ends){
        switch(S890){
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

  public void thread1142(int [] tdone, int [] ends){
        S895=1;
    valveExtend.setPresent();//sysj\fillerController.sysj line: 22, column: 6
    currsigs.addElement(valveExtend);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread1141(int [] tdone, int [] ends){
        S890=1;
    inletOn.setPresent();//sysj\fillerController.sysj line: 20, column: 6
    currsigs.addElement(inletOn);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread1139(int [] tdone, int [] ends){
        active[4]=0;
    ends[4]=0;
    tdone[4]=1;
  }

  public void thread1138(int [] tdone, int [] ends){
        switch(S872){
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

  public void thread1136(int [] tdone, int [] ends){
        S895=1;
    valveExtend.setPresent();//sysj\fillerController.sysj line: 22, column: 6
    currsigs.addElement(valveExtend);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread1135(int [] tdone, int [] ends){
        S890=1;
    inletOn.setPresent();//sysj\fillerController.sysj line: 20, column: 6
    currsigs.addElement(inletOn);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread1133(int [] tdone, int [] ends){
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

  public void thread1132(int [] tdone, int [] ends){
        S872=1;
    injectorOn.setPresent();//sysj\fillerController.sysj line: 12, column: 6
    currsigs.addElement(injectorOn);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread1131(int [] tdone, int [] ends){
        switch(S1085){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S867){
          case 0 : 
            if(fillerEnable.getprestatus()){//sysj\fillerController.sysj line: 9, column: 10
              S867=1;
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
              S867=2;
              thread1132(tdone,ends);
              thread1133(tdone,ends);
              int biggest1134 = 0;
              if(ends[3]>=biggest1134){
                biggest1134=ends[3];
              }
              if(ends[4]>=biggest1134){
                biggest1134=ends[4];
              }
              if(biggest1134 == 1){
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
              S867=3;
              thread1135(tdone,ends);
              thread1136(tdone,ends);
              int biggest1137 = 0;
              if(ends[5]>=biggest1137){
                biggest1137=ends[5];
              }
              if(ends[6]>=biggest1137){
                biggest1137=ends[6];
              }
              if(biggest1137 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              thread1138(tdone,ends);
              thread1139(tdone,ends);
              int biggest1140 = 0;
              if(ends[3]>=biggest1140){
                biggest1140=ends[3];
              }
              if(ends[4]>=biggest1140){
                biggest1140=ends[4];
              }
              if(biggest1140 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest1140 == 0){
                S867=3;
                thread1141(tdone,ends);
                thread1142(tdone,ends);
                int biggest1143 = 0;
                if(ends[5]>=biggest1143){
                  biggest1143=ends[5];
                }
                if(ends[6]>=biggest1143){
                  biggest1143=ends[6];
                }
                if(biggest1143 == 1){
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
              S867=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              thread1144(tdone,ends);
              thread1145(tdone,ends);
              int biggest1146 = 0;
              if(ends[5]>=biggest1146){
                biggest1146=ends[5];
              }
              if(ends[6]>=biggest1146){
                biggest1146=ends[6];
              }
              if(biggest1146 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest1146 == 0){
                fillerDone.setPresent();//sysj\fillerController.sysj line: 24, column: 4
                currsigs.addElement(fillerDone);
                S867=0;
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

  public void thread1128(int [] tdone, int [] ends){
        S1117=1;
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

  public void thread1127(int [] tdone, int [] ends){
        S1109=1;
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

  public void thread1126(int [] tdone, int [] ends){
        S1101=1;
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

  public void thread1125(int [] tdone, int [] ends){
        S1093=1;
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

  public void thread1124(int [] tdone, int [] ends){
        S1119=1;
    thread1125(tdone,ends);
    thread1126(tdone,ends);
    thread1127(tdone,ends);
    thread1128(tdone,ends);
    int biggest1129 = 0;
    if(ends[8]>=biggest1129){
      biggest1129=ends[8];
    }
    if(ends[9]>=biggest1129){
      biggest1129=ends[9];
    }
    if(ends[10]>=biggest1129){
      biggest1129=ends[10];
    }
    if(ends[11]>=biggest1129){
      biggest1129=ends[11];
    }
    if(biggest1129 == 1){
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread1123(int [] tdone, int [] ends){
        S1085=1;
    S867=0;
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
      switch(S1121){
        case 0 : 
          S1121=0;
          break RUN;
        
        case 1 : 
          S1121=2;
          S1121=2;
          thread1123(tdone,ends);
          thread1124(tdone,ends);
          int biggest1130 = 0;
          if(ends[2]>=biggest1130){
            biggest1130=ends[2];
          }
          if(ends[7]>=biggest1130){
            biggest1130=ends[7];
          }
          if(biggest1130 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread1131(tdone,ends);
          thread1147(tdone,ends);
          int biggest1153 = 0;
          if(ends[2]>=biggest1153){
            biggest1153=ends[2];
          }
          if(ends[7]>=biggest1153){
            biggest1153=ends[7];
          }
          if(biggest1153 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1153 == 0){
            S1121=0;
            active[1]=0;
            ends[1]=0;
            S1121=0;
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
