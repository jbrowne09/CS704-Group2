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
  private int S1148 = 1;
  private int S1112 = 1;
  private int S894 = 1;
  private int S899 = 1;
  private int S917 = 1;
  private int S922 = 1;
  private int S1146 = 1;
  private int S1120 = 1;
  private int S1128 = 1;
  private int S1136 = 1;
  private int S1144 = 1;
  
  private int[] ends = new int[12];
  private int[] tdone = new int[12];
  
  public void thread1178(int [] tdone, int [] ends){
        switch(S1144){
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

  public void thread1177(int [] tdone, int [] ends){
        switch(S1136){
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

  public void thread1176(int [] tdone, int [] ends){
        switch(S1128){
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

  public void thread1175(int [] tdone, int [] ends){
        switch(S1120){
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

  public void thread1174(int [] tdone, int [] ends){
        switch(S1146){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        thread1175(tdone,ends);
        thread1176(tdone,ends);
        thread1177(tdone,ends);
        thread1178(tdone,ends);
        int biggest1179 = 0;
        if(ends[8]>=biggest1179){
          biggest1179=ends[8];
        }
        if(ends[9]>=biggest1179){
          biggest1179=ends[9];
        }
        if(ends[10]>=biggest1179){
          biggest1179=ends[10];
        }
        if(ends[11]>=biggest1179){
          biggest1179=ends[11];
        }
        if(biggest1179 == 1){
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        //FINXME code
        if(biggest1179 == 0){
          S1146=0;
          active[7]=0;
          ends[7]=0;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread1172(int [] tdone, int [] ends){
        switch(S922){
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

  public void thread1171(int [] tdone, int [] ends){
        switch(S917){
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

  public void thread1169(int [] tdone, int [] ends){
        S922=1;
    valveExtend.setPresent();//sysj\fillerController.sysj line: 22, column: 6
    currsigs.addElement(valveExtend);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread1168(int [] tdone, int [] ends){
        S917=1;
    inletOn.setPresent();//sysj\fillerController.sysj line: 20, column: 6
    currsigs.addElement(inletOn);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread1166(int [] tdone, int [] ends){
        active[4]=0;
    ends[4]=0;
    tdone[4]=1;
  }

  public void thread1165(int [] tdone, int [] ends){
        switch(S899){
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

  public void thread1163(int [] tdone, int [] ends){
        S922=1;
    valveExtend.setPresent();//sysj\fillerController.sysj line: 22, column: 6
    currsigs.addElement(valveExtend);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread1162(int [] tdone, int [] ends){
        S917=1;
    inletOn.setPresent();//sysj\fillerController.sysj line: 20, column: 6
    currsigs.addElement(inletOn);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread1160(int [] tdone, int [] ends){
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

  public void thread1159(int [] tdone, int [] ends){
        S899=1;
    injectorOn.setPresent();//sysj\fillerController.sysj line: 12, column: 6
    currsigs.addElement(injectorOn);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread1158(int [] tdone, int [] ends){
        switch(S1112){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S894){
          case 0 : 
            if(fillerEnable.getprestatus()){//sysj\fillerController.sysj line: 9, column: 10
              S894=1;
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
              S894=2;
              thread1159(tdone,ends);
              thread1160(tdone,ends);
              int biggest1161 = 0;
              if(ends[3]>=biggest1161){
                biggest1161=ends[3];
              }
              if(ends[4]>=biggest1161){
                biggest1161=ends[4];
              }
              if(biggest1161 == 1){
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
              S894=3;
              thread1162(tdone,ends);
              thread1163(tdone,ends);
              int biggest1164 = 0;
              if(ends[5]>=biggest1164){
                biggest1164=ends[5];
              }
              if(ends[6]>=biggest1164){
                biggest1164=ends[6];
              }
              if(biggest1164 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              thread1165(tdone,ends);
              thread1166(tdone,ends);
              int biggest1167 = 0;
              if(ends[3]>=biggest1167){
                biggest1167=ends[3];
              }
              if(ends[4]>=biggest1167){
                biggest1167=ends[4];
              }
              if(biggest1167 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest1167 == 0){
                S894=3;
                thread1168(tdone,ends);
                thread1169(tdone,ends);
                int biggest1170 = 0;
                if(ends[5]>=biggest1170){
                  biggest1170=ends[5];
                }
                if(ends[6]>=biggest1170){
                  biggest1170=ends[6];
                }
                if(biggest1170 == 1){
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
              S894=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              thread1171(tdone,ends);
              thread1172(tdone,ends);
              int biggest1173 = 0;
              if(ends[5]>=biggest1173){
                biggest1173=ends[5];
              }
              if(ends[6]>=biggest1173){
                biggest1173=ends[6];
              }
              if(biggest1173 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest1173 == 0){
                fillerDone.setPresent();//sysj\fillerController.sysj line: 24, column: 4
                currsigs.addElement(fillerDone);
                S894=0;
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

  public void thread1155(int [] tdone, int [] ends){
        S1144=1;
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

  public void thread1154(int [] tdone, int [] ends){
        S1136=1;
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

  public void thread1153(int [] tdone, int [] ends){
        S1128=1;
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

  public void thread1152(int [] tdone, int [] ends){
        S1120=1;
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

  public void thread1151(int [] tdone, int [] ends){
        S1146=1;
    thread1152(tdone,ends);
    thread1153(tdone,ends);
    thread1154(tdone,ends);
    thread1155(tdone,ends);
    int biggest1156 = 0;
    if(ends[8]>=biggest1156){
      biggest1156=ends[8];
    }
    if(ends[9]>=biggest1156){
      biggest1156=ends[9];
    }
    if(ends[10]>=biggest1156){
      biggest1156=ends[10];
    }
    if(ends[11]>=biggest1156){
      biggest1156=ends[11];
    }
    if(biggest1156 == 1){
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread1150(int [] tdone, int [] ends){
        S1112=1;
    S894=0;
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
      switch(S1148){
        case 0 : 
          S1148=0;
          break RUN;
        
        case 1 : 
          S1148=2;
          S1148=2;
          thread1150(tdone,ends);
          thread1151(tdone,ends);
          int biggest1157 = 0;
          if(ends[2]>=biggest1157){
            biggest1157=ends[2];
          }
          if(ends[7]>=biggest1157){
            biggest1157=ends[7];
          }
          if(biggest1157 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread1158(tdone,ends);
          thread1174(tdone,ends);
          int biggest1180 = 0;
          if(ends[2]>=biggest1180){
            biggest1180=ends[2];
          }
          if(ends[7]>=biggest1180){
            biggest1180=ends[7];
          }
          if(biggest1180 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1180 == 0){
            S1148=0;
            active[1]=0;
            ends[1]=0;
            S1148=0;
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
