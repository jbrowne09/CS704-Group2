import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class fillerPlant extends ClockDomain{
  public fillerPlant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal inletOn = new Signal("inletOn", Signal.INPUT);
  public Signal injectorOn = new Signal("injectorOn", Signal.INPUT);
  public Signal valveRetract = new Signal("valveRetract", Signal.INPUT);
  public Signal valveExtend = new Signal("valveExtend", Signal.INPUT);
  public Signal liquidPos1 = new Signal("liquidPos1", Signal.INPUT);
  public Signal liquidPos2 = new Signal("liquidPos2", Signal.INPUT);
  public Signal liquidPos3 = new Signal("liquidPos3", Signal.INPUT);
  public Signal liquidPos4 = new Signal("liquidPos4", Signal.INPUT);
  public Signal bottlePos2 = new Signal("bottlePos2", Signal.OUTPUT);
  public Signal canBottom = new Signal("canBottom", Signal.OUTPUT);
  public Signal canTop = new Signal("canTop", Signal.OUTPUT);
  public Signal inletIsOn = new Signal("inletIsOn", Signal.OUTPUT);
  public Signal injectorIsOn = new Signal("injectorIsOn", Signal.OUTPUT);
  public Signal bottlePos2S = new Signal("bottlePos2S", Signal.OUTPUT);
  public Signal canBottomS = new Signal("canBottomS", Signal.OUTPUT);
  public Signal canTopS = new Signal("canTopS", Signal.OUTPUT);
  public Signal liquidPos1S = new Signal("liquidPos1S", Signal.OUTPUT);
  public Signal liquidPos2S = new Signal("liquidPos2S", Signal.OUTPUT);
  public Signal liquidPos3S = new Signal("liquidPos3S", Signal.OUTPUT);
  public Signal liquidPos4S = new Signal("liquidPos4S", Signal.OUTPUT);
  public Signal inletIsOnS = new Signal("inletIsOnS", Signal.OUTPUT);
  public Signal injectorIsOnS = new Signal("injectorIsOnS", Signal.OUTPUT);
  private int S1134 = 1;
  private int S864 = 1;
  private int S863 = 1;
  private int S944 = 1;
  private int S878 = 1;
  private int S886 = 1;
  private int S894 = 1;
  private int S902 = 1;
  private int S910 = 1;
  private int S918 = 1;
  private int S926 = 1;
  private int S934 = 1;
  private int S942 = 1;
  
  private int[] ends = new int[15];
  private int[] tdone = new int[15];
  
  public void thread1178(int [] tdone, int [] ends){
        S942=1;
    if(liquidPos4.getprestatus()){//sysj\fillerPlant.sysj line: 47, column: 25
      liquidPos4S.setPresent();//sysj\fillerPlant.sysj line: 47, column: 38
      currsigs.addElement(liquidPos4S);
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread1177(int [] tdone, int [] ends){
        S934=1;
    if(liquidPos3.getprestatus()){//sysj\fillerPlant.sysj line: 45, column: 25
      liquidPos3S.setPresent();//sysj\fillerPlant.sysj line: 45, column: 38
      currsigs.addElement(liquidPos3S);
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread1176(int [] tdone, int [] ends){
        S926=1;
    if(liquidPos2.getprestatus()){//sysj\fillerPlant.sysj line: 43, column: 25
      liquidPos2S.setPresent();//sysj\fillerPlant.sysj line: 43, column: 38
      currsigs.addElement(liquidPos2S);
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread1175(int [] tdone, int [] ends){
        S918=1;
    if(liquidPos1.getprestatus()){//sysj\fillerPlant.sysj line: 41, column: 25
      liquidPos1S.setPresent();//sysj\fillerPlant.sysj line: 41, column: 38
      currsigs.addElement(liquidPos1S);
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

  public void thread1174(int [] tdone, int [] ends){
        S910=1;
    if(injectorIsOn.getprestatus()){//sysj\fillerPlant.sysj line: 39, column: 25
      injectorIsOnS.setPresent();//sysj\fillerPlant.sysj line: 39, column: 40
      currsigs.addElement(injectorIsOnS);
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

  public void thread1173(int [] tdone, int [] ends){
        S902=1;
    if(inletIsOn.getprestatus()){//sysj\fillerPlant.sysj line: 37, column: 25
      inletIsOnS.setPresent();//sysj\fillerPlant.sysj line: 37, column: 37
      currsigs.addElement(inletIsOnS);
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

  public void thread1172(int [] tdone, int [] ends){
        S894=1;
    if(canTop.getprestatus()){//sysj\fillerPlant.sysj line: 35, column: 25
      canTopS.setPresent();//sysj\fillerPlant.sysj line: 35, column: 34
      currsigs.addElement(canTopS);
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

  public void thread1171(int [] tdone, int [] ends){
        S886=1;
    if(canBottom.getprestatus()){//sysj\fillerPlant.sysj line: 33, column: 25
      canBottomS.setPresent();//sysj\fillerPlant.sysj line: 33, column: 37
      currsigs.addElement(canBottomS);
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread1170(int [] tdone, int [] ends){
        S878=1;
    if(bottlePos2.getprestatus()){//sysj\fillerPlant.sysj line: 31, column: 25
      bottlePos2S.setPresent();//sysj\fillerPlant.sysj line: 31, column: 38
      currsigs.addElement(bottlePos2S);
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread1169(int [] tdone, int [] ends){
        S944=1;
    thread1170(tdone,ends);
    thread1171(tdone,ends);
    thread1172(tdone,ends);
    thread1173(tdone,ends);
    thread1174(tdone,ends);
    thread1175(tdone,ends);
    thread1176(tdone,ends);
    thread1177(tdone,ends);
    thread1178(tdone,ends);
    int biggest1179 = 0;
    if(ends[6]>=biggest1179){
      biggest1179=ends[6];
    }
    if(ends[7]>=biggest1179){
      biggest1179=ends[7];
    }
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
    if(ends[12]>=biggest1179){
      biggest1179=ends[12];
    }
    if(ends[13]>=biggest1179){
      biggest1179=ends[13];
    }
    if(ends[14]>=biggest1179){
      biggest1179=ends[14];
    }
    if(biggest1179 == 1){
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread1168(int [] tdone, int [] ends){
        if(injectorOn.getprestatus()){//sysj\fillerPlant.sysj line: 25, column: 13
      injectorIsOn.setPresent();//sysj\fillerPlant.sysj line: 26, column: 5
      currsigs.addElement(injectorIsOn);
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

  public void thread1167(int [] tdone, int [] ends){
        if(inletOn.getprestatus()){//sysj\fillerPlant.sysj line: 19, column: 13
      inletIsOn.setPresent();//sysj\fillerPlant.sysj line: 20, column: 5
      currsigs.addElement(inletIsOn);
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
    else {
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
  }

  public void thread1166(int [] tdone, int [] ends){
        S864=1;
    S863=0;
    canBottom.setPresent();//sysj\fillerPlant.sysj line: 11, column: 5
    currsigs.addElement(canBottom);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread1163(int [] tdone, int [] ends){
        switch(S942){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(liquidPos4.getprestatus()){//sysj\fillerPlant.sysj line: 47, column: 25
          liquidPos4S.setPresent();//sysj\fillerPlant.sysj line: 47, column: 38
          currsigs.addElement(liquidPos4S);
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        else {
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        break;
      
    }
  }

  public void thread1162(int [] tdone, int [] ends){
        switch(S934){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(liquidPos3.getprestatus()){//sysj\fillerPlant.sysj line: 45, column: 25
          liquidPos3S.setPresent();//sysj\fillerPlant.sysj line: 45, column: 38
          currsigs.addElement(liquidPos3S);
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        else {
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        break;
      
    }
  }

  public void thread1161(int [] tdone, int [] ends){
        switch(S926){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(liquidPos2.getprestatus()){//sysj\fillerPlant.sysj line: 43, column: 25
          liquidPos2S.setPresent();//sysj\fillerPlant.sysj line: 43, column: 38
          currsigs.addElement(liquidPos2S);
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        else {
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        break;
      
    }
  }

  public void thread1160(int [] tdone, int [] ends){
        switch(S918){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(liquidPos1.getprestatus()){//sysj\fillerPlant.sysj line: 41, column: 25
          liquidPos1S.setPresent();//sysj\fillerPlant.sysj line: 41, column: 38
          currsigs.addElement(liquidPos1S);
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

  public void thread1159(int [] tdone, int [] ends){
        switch(S910){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(injectorIsOn.getprestatus()){//sysj\fillerPlant.sysj line: 39, column: 25
          injectorIsOnS.setPresent();//sysj\fillerPlant.sysj line: 39, column: 40
          currsigs.addElement(injectorIsOnS);
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

  public void thread1158(int [] tdone, int [] ends){
        switch(S902){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(inletIsOn.getprestatus()){//sysj\fillerPlant.sysj line: 37, column: 25
          inletIsOnS.setPresent();//sysj\fillerPlant.sysj line: 37, column: 37
          currsigs.addElement(inletIsOnS);
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

  public void thread1157(int [] tdone, int [] ends){
        switch(S894){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(canTop.getprestatus()){//sysj\fillerPlant.sysj line: 35, column: 25
          canTopS.setPresent();//sysj\fillerPlant.sysj line: 35, column: 34
          currsigs.addElement(canTopS);
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

  public void thread1156(int [] tdone, int [] ends){
        switch(S886){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(canBottom.getprestatus()){//sysj\fillerPlant.sysj line: 33, column: 25
          canBottomS.setPresent();//sysj\fillerPlant.sysj line: 33, column: 37
          currsigs.addElement(canBottomS);
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
      
    }
  }

  public void thread1155(int [] tdone, int [] ends){
        switch(S878){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(bottlePos2.getprestatus()){//sysj\fillerPlant.sysj line: 31, column: 25
          bottlePos2S.setPresent();//sysj\fillerPlant.sysj line: 31, column: 38
          currsigs.addElement(bottlePos2S);
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
      
    }
  }

  public void thread1154(int [] tdone, int [] ends){
        switch(S944){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        thread1155(tdone,ends);
        thread1156(tdone,ends);
        thread1157(tdone,ends);
        thread1158(tdone,ends);
        thread1159(tdone,ends);
        thread1160(tdone,ends);
        thread1161(tdone,ends);
        thread1162(tdone,ends);
        thread1163(tdone,ends);
        int biggest1164 = 0;
        if(ends[6]>=biggest1164){
          biggest1164=ends[6];
        }
        if(ends[7]>=biggest1164){
          biggest1164=ends[7];
        }
        if(ends[8]>=biggest1164){
          biggest1164=ends[8];
        }
        if(ends[9]>=biggest1164){
          biggest1164=ends[9];
        }
        if(ends[10]>=biggest1164){
          biggest1164=ends[10];
        }
        if(ends[11]>=biggest1164){
          biggest1164=ends[11];
        }
        if(ends[12]>=biggest1164){
          biggest1164=ends[12];
        }
        if(ends[13]>=biggest1164){
          biggest1164=ends[13];
        }
        if(ends[14]>=biggest1164){
          biggest1164=ends[14];
        }
        if(biggest1164 == 1){
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        //FINXME code
        if(biggest1164 == 0){
          S944=0;
          active[5]=0;
          ends[5]=0;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread1153(int [] tdone, int [] ends){
        active[4]=0;
    ends[4]=0;
    tdone[4]=1;
  }

  public void thread1152(int [] tdone, int [] ends){
        active[3]=0;
    ends[3]=0;
    tdone[3]=1;
  }

  public void thread1151(int [] tdone, int [] ends){
        switch(S864){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S863){
          case 0 : 
            if(valveRetract.getprestatus()){//sysj\fillerPlant.sysj line: 10, column: 10
              S863=1;
              canTop.setPresent();//sysj\fillerPlant.sysj line: 14, column: 5
              currsigs.addElement(canTop);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              canBottom.setPresent();//sysj\fillerPlant.sysj line: 11, column: 5
              currsigs.addElement(canBottom);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(valveExtend.getprestatus()){//sysj\fillerPlant.sysj line: 13, column: 10
              S864=0;
              active[2]=0;
              ends[2]=0;
              tdone[2]=1;
            }
            else {
              canTop.setPresent();//sysj\fillerPlant.sysj line: 14, column: 5
              currsigs.addElement(canTop);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1148(int [] tdone, int [] ends){
        S942=1;
    if(liquidPos4.getprestatus()){//sysj\fillerPlant.sysj line: 47, column: 25
      liquidPos4S.setPresent();//sysj\fillerPlant.sysj line: 47, column: 38
      currsigs.addElement(liquidPos4S);
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread1147(int [] tdone, int [] ends){
        S934=1;
    if(liquidPos3.getprestatus()){//sysj\fillerPlant.sysj line: 45, column: 25
      liquidPos3S.setPresent();//sysj\fillerPlant.sysj line: 45, column: 38
      currsigs.addElement(liquidPos3S);
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread1146(int [] tdone, int [] ends){
        S926=1;
    if(liquidPos2.getprestatus()){//sysj\fillerPlant.sysj line: 43, column: 25
      liquidPos2S.setPresent();//sysj\fillerPlant.sysj line: 43, column: 38
      currsigs.addElement(liquidPos2S);
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread1145(int [] tdone, int [] ends){
        S918=1;
    if(liquidPos1.getprestatus()){//sysj\fillerPlant.sysj line: 41, column: 25
      liquidPos1S.setPresent();//sysj\fillerPlant.sysj line: 41, column: 38
      currsigs.addElement(liquidPos1S);
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

  public void thread1144(int [] tdone, int [] ends){
        S910=1;
    if(injectorIsOn.getprestatus()){//sysj\fillerPlant.sysj line: 39, column: 25
      injectorIsOnS.setPresent();//sysj\fillerPlant.sysj line: 39, column: 40
      currsigs.addElement(injectorIsOnS);
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

  public void thread1143(int [] tdone, int [] ends){
        S902=1;
    if(inletIsOn.getprestatus()){//sysj\fillerPlant.sysj line: 37, column: 25
      inletIsOnS.setPresent();//sysj\fillerPlant.sysj line: 37, column: 37
      currsigs.addElement(inletIsOnS);
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

  public void thread1142(int [] tdone, int [] ends){
        S894=1;
    if(canTop.getprestatus()){//sysj\fillerPlant.sysj line: 35, column: 25
      canTopS.setPresent();//sysj\fillerPlant.sysj line: 35, column: 34
      currsigs.addElement(canTopS);
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

  public void thread1141(int [] tdone, int [] ends){
        S886=1;
    if(canBottom.getprestatus()){//sysj\fillerPlant.sysj line: 33, column: 25
      canBottomS.setPresent();//sysj\fillerPlant.sysj line: 33, column: 37
      currsigs.addElement(canBottomS);
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread1140(int [] tdone, int [] ends){
        S878=1;
    if(bottlePos2.getprestatus()){//sysj\fillerPlant.sysj line: 31, column: 25
      bottlePos2S.setPresent();//sysj\fillerPlant.sysj line: 31, column: 38
      currsigs.addElement(bottlePos2S);
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread1139(int [] tdone, int [] ends){
        S944=1;
    thread1140(tdone,ends);
    thread1141(tdone,ends);
    thread1142(tdone,ends);
    thread1143(tdone,ends);
    thread1144(tdone,ends);
    thread1145(tdone,ends);
    thread1146(tdone,ends);
    thread1147(tdone,ends);
    thread1148(tdone,ends);
    int biggest1149 = 0;
    if(ends[6]>=biggest1149){
      biggest1149=ends[6];
    }
    if(ends[7]>=biggest1149){
      biggest1149=ends[7];
    }
    if(ends[8]>=biggest1149){
      biggest1149=ends[8];
    }
    if(ends[9]>=biggest1149){
      biggest1149=ends[9];
    }
    if(ends[10]>=biggest1149){
      biggest1149=ends[10];
    }
    if(ends[11]>=biggest1149){
      biggest1149=ends[11];
    }
    if(ends[12]>=biggest1149){
      biggest1149=ends[12];
    }
    if(ends[13]>=biggest1149){
      biggest1149=ends[13];
    }
    if(ends[14]>=biggest1149){
      biggest1149=ends[14];
    }
    if(biggest1149 == 1){
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread1138(int [] tdone, int [] ends){
        if(injectorOn.getprestatus()){//sysj\fillerPlant.sysj line: 25, column: 13
      injectorIsOn.setPresent();//sysj\fillerPlant.sysj line: 26, column: 5
      currsigs.addElement(injectorIsOn);
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

  public void thread1137(int [] tdone, int [] ends){
        if(inletOn.getprestatus()){//sysj\fillerPlant.sysj line: 19, column: 13
      inletIsOn.setPresent();//sysj\fillerPlant.sysj line: 20, column: 5
      currsigs.addElement(inletIsOn);
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
    else {
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
  }

  public void thread1136(int [] tdone, int [] ends){
        S864=1;
    S863=0;
    canBottom.setPresent();//sysj\fillerPlant.sysj line: 11, column: 5
    currsigs.addElement(canBottom);
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
      switch(S1134){
        case 0 : 
          S1134=0;
          break RUN;
        
        case 1 : 
          S1134=2;
          S1134=2;
          thread1136(tdone,ends);
          thread1137(tdone,ends);
          thread1138(tdone,ends);
          thread1139(tdone,ends);
          int biggest1150 = 0;
          if(ends[2]>=biggest1150){
            biggest1150=ends[2];
          }
          if(ends[3]>=biggest1150){
            biggest1150=ends[3];
          }
          if(ends[4]>=biggest1150){
            biggest1150=ends[4];
          }
          if(ends[5]>=biggest1150){
            biggest1150=ends[5];
          }
          if(biggest1150 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread1151(tdone,ends);
          thread1152(tdone,ends);
          thread1153(tdone,ends);
          thread1154(tdone,ends);
          int biggest1165 = 0;
          if(ends[2]>=biggest1165){
            biggest1165=ends[2];
          }
          if(ends[3]>=biggest1165){
            biggest1165=ends[3];
          }
          if(ends[4]>=biggest1165){
            biggest1165=ends[4];
          }
          if(ends[5]>=biggest1165){
            biggest1165=ends[5];
          }
          if(biggest1165 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1165 == 0){
            thread1166(tdone,ends);
            thread1167(tdone,ends);
            thread1168(tdone,ends);
            thread1169(tdone,ends);
            int biggest1180 = 0;
            if(ends[2]>=biggest1180){
              biggest1180=ends[2];
            }
            if(ends[3]>=biggest1180){
              biggest1180=ends[3];
            }
            if(ends[4]>=biggest1180){
              biggest1180=ends[4];
            }
            if(ends[5]>=biggest1180){
              biggest1180=ends[5];
            }
            if(biggest1180 == 1){
              active[1]=1;
              ends[1]=1;
              break RUN;
            }
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          inletOn.gethook();
          injectorOn.gethook();
          valveRetract.gethook();
          valveExtend.gethook();
          liquidPos1.gethook();
          liquidPos2.gethook();
          liquidPos3.gethook();
          liquidPos4.gethook();
          df = true;
        }
        runClockDomain();
      }
      inletOn.setpreclear();
      injectorOn.setpreclear();
      valveRetract.setpreclear();
      valveExtend.setpreclear();
      liquidPos1.setpreclear();
      liquidPos2.setpreclear();
      liquidPos3.setpreclear();
      liquidPos4.setpreclear();
      bottlePos2.setpreclear();
      canBottom.setpreclear();
      canTop.setpreclear();
      inletIsOn.setpreclear();
      injectorIsOn.setpreclear();
      bottlePos2S.setpreclear();
      canBottomS.setpreclear();
      canTopS.setpreclear();
      liquidPos1S.setpreclear();
      liquidPos2S.setpreclear();
      liquidPos3S.setpreclear();
      liquidPos4S.setpreclear();
      inletIsOnS.setpreclear();
      injectorIsOnS.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = inletOn.getStatus() ? inletOn.setprepresent() : inletOn.setpreclear();
      inletOn.setpreval(inletOn.getValue());
      inletOn.setClear();
      dummyint = injectorOn.getStatus() ? injectorOn.setprepresent() : injectorOn.setpreclear();
      injectorOn.setpreval(injectorOn.getValue());
      injectorOn.setClear();
      dummyint = valveRetract.getStatus() ? valveRetract.setprepresent() : valveRetract.setpreclear();
      valveRetract.setpreval(valveRetract.getValue());
      valveRetract.setClear();
      dummyint = valveExtend.getStatus() ? valveExtend.setprepresent() : valveExtend.setpreclear();
      valveExtend.setpreval(valveExtend.getValue());
      valveExtend.setClear();
      dummyint = liquidPos1.getStatus() ? liquidPos1.setprepresent() : liquidPos1.setpreclear();
      liquidPos1.setpreval(liquidPos1.getValue());
      liquidPos1.setClear();
      dummyint = liquidPos2.getStatus() ? liquidPos2.setprepresent() : liquidPos2.setpreclear();
      liquidPos2.setpreval(liquidPos2.getValue());
      liquidPos2.setClear();
      dummyint = liquidPos3.getStatus() ? liquidPos3.setprepresent() : liquidPos3.setpreclear();
      liquidPos3.setpreval(liquidPos3.getValue());
      liquidPos3.setClear();
      dummyint = liquidPos4.getStatus() ? liquidPos4.setprepresent() : liquidPos4.setpreclear();
      liquidPos4.setpreval(liquidPos4.getValue());
      liquidPos4.setClear();
      bottlePos2.sethook();
      bottlePos2.setClear();
      canBottom.sethook();
      canBottom.setClear();
      canTop.sethook();
      canTop.setClear();
      inletIsOn.sethook();
      inletIsOn.setClear();
      injectorIsOn.sethook();
      injectorIsOn.setClear();
      bottlePos2S.sethook();
      bottlePos2S.setClear();
      canBottomS.sethook();
      canBottomS.setClear();
      canTopS.sethook();
      canTopS.setClear();
      liquidPos1S.sethook();
      liquidPos1S.setClear();
      liquidPos2S.sethook();
      liquidPos2S.setClear();
      liquidPos3S.sethook();
      liquidPos3S.setClear();
      liquidPos4S.sethook();
      liquidPos4S.setClear();
      inletIsOnS.sethook();
      inletIsOnS.setClear();
      injectorIsOnS.sethook();
      injectorIsOnS.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        inletOn.gethook();
        injectorOn.gethook();
        valveRetract.gethook();
        valveExtend.gethook();
        liquidPos1.gethook();
        liquidPos2.gethook();
        liquidPos3.gethook();
        liquidPos4.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
