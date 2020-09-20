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
  private int S1317 = 1;
  private int S1047 = 1;
  private int S1046 = 1;
  private int S1127 = 1;
  private int S1061 = 1;
  private int S1069 = 1;
  private int S1077 = 1;
  private int S1085 = 1;
  private int S1093 = 1;
  private int S1101 = 1;
  private int S1109 = 1;
  private int S1117 = 1;
  private int S1125 = 1;
  
  private int[] ends = new int[15];
  private int[] tdone = new int[15];
  
  public void thread1361(int [] tdone, int [] ends){
        S1125=1;
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

  public void thread1360(int [] tdone, int [] ends){
        S1117=1;
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

  public void thread1359(int [] tdone, int [] ends){
        S1109=1;
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

  public void thread1358(int [] tdone, int [] ends){
        S1101=1;
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

  public void thread1357(int [] tdone, int [] ends){
        S1093=1;
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

  public void thread1356(int [] tdone, int [] ends){
        S1085=1;
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

  public void thread1355(int [] tdone, int [] ends){
        S1077=1;
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

  public void thread1354(int [] tdone, int [] ends){
        S1069=1;
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

  public void thread1353(int [] tdone, int [] ends){
        S1061=1;
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

  public void thread1352(int [] tdone, int [] ends){
        S1127=1;
    thread1353(tdone,ends);
    thread1354(tdone,ends);
    thread1355(tdone,ends);
    thread1356(tdone,ends);
    thread1357(tdone,ends);
    thread1358(tdone,ends);
    thread1359(tdone,ends);
    thread1360(tdone,ends);
    thread1361(tdone,ends);
    int biggest1362 = 0;
    if(ends[6]>=biggest1362){
      biggest1362=ends[6];
    }
    if(ends[7]>=biggest1362){
      biggest1362=ends[7];
    }
    if(ends[8]>=biggest1362){
      biggest1362=ends[8];
    }
    if(ends[9]>=biggest1362){
      biggest1362=ends[9];
    }
    if(ends[10]>=biggest1362){
      biggest1362=ends[10];
    }
    if(ends[11]>=biggest1362){
      biggest1362=ends[11];
    }
    if(ends[12]>=biggest1362){
      biggest1362=ends[12];
    }
    if(ends[13]>=biggest1362){
      biggest1362=ends[13];
    }
    if(ends[14]>=biggest1362){
      biggest1362=ends[14];
    }
    if(biggest1362 == 1){
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread1351(int [] tdone, int [] ends){
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

  public void thread1350(int [] tdone, int [] ends){
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

  public void thread1349(int [] tdone, int [] ends){
        S1047=1;
    S1046=0;
    canBottom.setPresent();//sysj\fillerPlant.sysj line: 11, column: 5
    currsigs.addElement(canBottom);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread1346(int [] tdone, int [] ends){
        switch(S1125){
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

  public void thread1345(int [] tdone, int [] ends){
        switch(S1117){
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

  public void thread1344(int [] tdone, int [] ends){
        switch(S1109){
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

  public void thread1343(int [] tdone, int [] ends){
        switch(S1101){
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

  public void thread1342(int [] tdone, int [] ends){
        switch(S1093){
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

  public void thread1341(int [] tdone, int [] ends){
        switch(S1085){
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

  public void thread1340(int [] tdone, int [] ends){
        switch(S1077){
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

  public void thread1339(int [] tdone, int [] ends){
        switch(S1069){
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

  public void thread1338(int [] tdone, int [] ends){
        switch(S1061){
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

  public void thread1337(int [] tdone, int [] ends){
        switch(S1127){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        thread1338(tdone,ends);
        thread1339(tdone,ends);
        thread1340(tdone,ends);
        thread1341(tdone,ends);
        thread1342(tdone,ends);
        thread1343(tdone,ends);
        thread1344(tdone,ends);
        thread1345(tdone,ends);
        thread1346(tdone,ends);
        int biggest1347 = 0;
        if(ends[6]>=biggest1347){
          biggest1347=ends[6];
        }
        if(ends[7]>=biggest1347){
          biggest1347=ends[7];
        }
        if(ends[8]>=biggest1347){
          biggest1347=ends[8];
        }
        if(ends[9]>=biggest1347){
          biggest1347=ends[9];
        }
        if(ends[10]>=biggest1347){
          biggest1347=ends[10];
        }
        if(ends[11]>=biggest1347){
          biggest1347=ends[11];
        }
        if(ends[12]>=biggest1347){
          biggest1347=ends[12];
        }
        if(ends[13]>=biggest1347){
          biggest1347=ends[13];
        }
        if(ends[14]>=biggest1347){
          biggest1347=ends[14];
        }
        if(biggest1347 == 1){
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        //FINXME code
        if(biggest1347 == 0){
          S1127=0;
          active[5]=0;
          ends[5]=0;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread1336(int [] tdone, int [] ends){
        active[4]=0;
    ends[4]=0;
    tdone[4]=1;
  }

  public void thread1335(int [] tdone, int [] ends){
        active[3]=0;
    ends[3]=0;
    tdone[3]=1;
  }

  public void thread1334(int [] tdone, int [] ends){
        switch(S1047){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S1046){
          case 0 : 
            if(valveRetract.getprestatus()){//sysj\fillerPlant.sysj line: 10, column: 10
              S1046=1;
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
              S1047=0;
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

  public void thread1331(int [] tdone, int [] ends){
        S1125=1;
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

  public void thread1330(int [] tdone, int [] ends){
        S1117=1;
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

  public void thread1329(int [] tdone, int [] ends){
        S1109=1;
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

  public void thread1328(int [] tdone, int [] ends){
        S1101=1;
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

  public void thread1327(int [] tdone, int [] ends){
        S1093=1;
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

  public void thread1326(int [] tdone, int [] ends){
        S1085=1;
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

  public void thread1325(int [] tdone, int [] ends){
        S1077=1;
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

  public void thread1324(int [] tdone, int [] ends){
        S1069=1;
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

  public void thread1323(int [] tdone, int [] ends){
        S1061=1;
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

  public void thread1322(int [] tdone, int [] ends){
        S1127=1;
    thread1323(tdone,ends);
    thread1324(tdone,ends);
    thread1325(tdone,ends);
    thread1326(tdone,ends);
    thread1327(tdone,ends);
    thread1328(tdone,ends);
    thread1329(tdone,ends);
    thread1330(tdone,ends);
    thread1331(tdone,ends);
    int biggest1332 = 0;
    if(ends[6]>=biggest1332){
      biggest1332=ends[6];
    }
    if(ends[7]>=biggest1332){
      biggest1332=ends[7];
    }
    if(ends[8]>=biggest1332){
      biggest1332=ends[8];
    }
    if(ends[9]>=biggest1332){
      biggest1332=ends[9];
    }
    if(ends[10]>=biggest1332){
      biggest1332=ends[10];
    }
    if(ends[11]>=biggest1332){
      biggest1332=ends[11];
    }
    if(ends[12]>=biggest1332){
      biggest1332=ends[12];
    }
    if(ends[13]>=biggest1332){
      biggest1332=ends[13];
    }
    if(ends[14]>=biggest1332){
      biggest1332=ends[14];
    }
    if(biggest1332 == 1){
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread1321(int [] tdone, int [] ends){
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

  public void thread1320(int [] tdone, int [] ends){
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

  public void thread1319(int [] tdone, int [] ends){
        S1047=1;
    S1046=0;
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
      switch(S1317){
        case 0 : 
          S1317=0;
          break RUN;
        
        case 1 : 
          S1317=2;
          S1317=2;
          thread1319(tdone,ends);
          thread1320(tdone,ends);
          thread1321(tdone,ends);
          thread1322(tdone,ends);
          int biggest1333 = 0;
          if(ends[2]>=biggest1333){
            biggest1333=ends[2];
          }
          if(ends[3]>=biggest1333){
            biggest1333=ends[3];
          }
          if(ends[4]>=biggest1333){
            biggest1333=ends[4];
          }
          if(ends[5]>=biggest1333){
            biggest1333=ends[5];
          }
          if(biggest1333 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread1334(tdone,ends);
          thread1335(tdone,ends);
          thread1336(tdone,ends);
          thread1337(tdone,ends);
          int biggest1348 = 0;
          if(ends[2]>=biggest1348){
            biggest1348=ends[2];
          }
          if(ends[3]>=biggest1348){
            biggest1348=ends[3];
          }
          if(ends[4]>=biggest1348){
            biggest1348=ends[4];
          }
          if(ends[5]>=biggest1348){
            biggest1348=ends[5];
          }
          if(biggest1348 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1348 == 0){
            thread1349(tdone,ends);
            thread1350(tdone,ends);
            thread1351(tdone,ends);
            thread1352(tdone,ends);
            int biggest1363 = 0;
            if(ends[2]>=biggest1363){
              biggest1363=ends[2];
            }
            if(ends[3]>=biggest1363){
              biggest1363=ends[3];
            }
            if(ends[4]>=biggest1363){
              biggest1363=ends[4];
            }
            if(ends[5]>=biggest1363){
              biggest1363=ends[5];
            }
            if(biggest1363 == 1){
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
