import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class capperPlant extends ClockDomain{
  public capperPlant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal clampBottle = new Signal("clampBottle", Signal.INPUT);
  public Signal gripCap = new Signal("gripCap", Signal.INPUT);
  public Signal gripDown = new Signal("gripDown", Signal.INPUT);
  public Signal twistGrip = new Signal("twistGrip", Signal.INPUT);
  public Signal untwistGrip = new Signal("untwistGrip", Signal.INPUT);
  public Signal gripperLowered = new Signal("gripperLowered", Signal.OUTPUT);
  public Signal gripperLifted = new Signal("gripperLifted", Signal.OUTPUT);
  public Signal gripperInit = new Signal("gripperInit", Signal.OUTPUT);
  public Signal gripperTurned = new Signal("gripperTurned", Signal.OUTPUT);
  public Signal bottleClamped = new Signal("bottleClamped", Signal.OUTPUT);
  public Signal gripperLoweredS = new Signal("gripperLoweredS", Signal.OUTPUT);
  public Signal gripperLiftedS = new Signal("gripperLiftedS", Signal.OUTPUT);
  public Signal gripperInitS = new Signal("gripperInitS", Signal.OUTPUT);
  public Signal gripperTurnedS = new Signal("gripperTurnedS", Signal.OUTPUT);
  public Signal gripCapS = new Signal("gripCapS", Signal.OUTPUT);
  public Signal bottleClampedS = new Signal("bottleClampedS", Signal.OUTPUT);
  private int S1273 = 1;
  private int S628 = 1;
  private int S592 = 1;
  private int S681 = 1;
  private int S645 = 1;
  private int S723 = 1;
  private int S691 = 1;
  private int S765 = 1;
  private int S733 = 1;
  private int S807 = 1;
  private int S773 = 1;
  private int S767 = 1;
  private int S781 = 1;
  private int S789 = 1;
  private int S797 = 1;
  private int S805 = 1;
  
  private int[] ends = new int[12];
  private int[] tdone = new int[12];
  
  public void thread1308(int [] tdone, int [] ends){
        S805=1;
    if(bottleClamped.getprestatus()){//sysj\capperPlant.sysj line: 60, column: 25
      bottleClampedS.setPresent();//sysj\capperPlant.sysj line: 60, column: 41
      currsigs.addElement(bottleClampedS);
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

  public void thread1307(int [] tdone, int [] ends){
        S797=1;
    if(gripperTurned.getprestatus()){//sysj\capperPlant.sysj line: 58, column: 25
      gripperTurnedS.setPresent();//sysj\capperPlant.sysj line: 58, column: 41
      currsigs.addElement(gripperTurnedS);
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

  public void thread1306(int [] tdone, int [] ends){
        S789=1;
    if(gripperInit.getprestatus()){//sysj\capperPlant.sysj line: 56, column: 25
      gripperInitS.setPresent();//sysj\capperPlant.sysj line: 56, column: 39
      currsigs.addElement(gripperInitS);
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

  public void thread1305(int [] tdone, int [] ends){
        S781=1;
    if(gripperLifted.getprestatus()){//sysj\capperPlant.sysj line: 54, column: 25
      gripperLiftedS.setPresent();//sysj\capperPlant.sysj line: 54, column: 41
      currsigs.addElement(gripperLiftedS);
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

  public void thread1304(int [] tdone, int [] ends){
        S773=1;
    S767=0;
    if(gripperLowered.getprestatus()){//sysj\capperPlant.sysj line: 52, column: 25
      gripperLoweredS.setPresent();//sysj\capperPlant.sysj line: 52, column: 42
      currsigs.addElement(gripperLoweredS);
      S767=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S767=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread1303(int [] tdone, int [] ends){
        S807=1;
    thread1304(tdone,ends);
    thread1305(tdone,ends);
    thread1306(tdone,ends);
    thread1307(tdone,ends);
    thread1308(tdone,ends);
    int biggest1309 = 0;
    if(ends[7]>=biggest1309){
      biggest1309=ends[7];
    }
    if(ends[8]>=biggest1309){
      biggest1309=ends[8];
    }
    if(ends[9]>=biggest1309){
      biggest1309=ends[9];
    }
    if(ends[10]>=biggest1309){
      biggest1309=ends[10];
    }
    if(ends[11]>=biggest1309){
      biggest1309=ends[11];
    }
    if(biggest1309 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread1302(int [] tdone, int [] ends){
        S765=1;
    S733=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread1301(int [] tdone, int [] ends){
        S723=1;
    S691=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread1300(int [] tdone, int [] ends){
        S681=1;
    S645=0;
    if(twistGrip.getprestatus()){//sysj\capperPlant.sysj line: 23, column: 20
      S645=1;
      if(untwistGrip.getprestatus()){//sysj\capperPlant.sysj line: 26, column: 20
        S645=2;
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
      }
      else {
        gripperTurned.setPresent();//sysj\capperPlant.sysj line: 27, column: 5
        currsigs.addElement(gripperTurned);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
      }
    }
    else {
      gripperInit.setPresent();//sysj\capperPlant.sysj line: 24, column: 5
      currsigs.addElement(gripperInit);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread1299(int [] tdone, int [] ends){
        S628=1;
    S592=0;
    if(gripDown.getprestatus()){//sysj\capperPlant.sysj line: 11, column: 20
      S592=1;
      gripperLowered.setPresent();//sysj\capperPlant.sysj line: 15, column: 5
      currsigs.addElement(gripperLowered);
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      gripperLifted.setPresent();//sysj\capperPlant.sysj line: 12, column: 5
      currsigs.addElement(gripperLifted);
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void thread1296(int [] tdone, int [] ends){
        switch(S805){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(bottleClamped.getprestatus()){//sysj\capperPlant.sysj line: 60, column: 25
          bottleClampedS.setPresent();//sysj\capperPlant.sysj line: 60, column: 41
          currsigs.addElement(bottleClampedS);
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

  public void thread1295(int [] tdone, int [] ends){
        switch(S797){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(gripperTurned.getprestatus()){//sysj\capperPlant.sysj line: 58, column: 25
          gripperTurnedS.setPresent();//sysj\capperPlant.sysj line: 58, column: 41
          currsigs.addElement(gripperTurnedS);
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

  public void thread1294(int [] tdone, int [] ends){
        switch(S789){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(gripperInit.getprestatus()){//sysj\capperPlant.sysj line: 56, column: 25
          gripperInitS.setPresent();//sysj\capperPlant.sysj line: 56, column: 39
          currsigs.addElement(gripperInitS);
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

  public void thread1293(int [] tdone, int [] ends){
        switch(S781){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(gripperLifted.getprestatus()){//sysj\capperPlant.sysj line: 54, column: 25
          gripperLiftedS.setPresent();//sysj\capperPlant.sysj line: 54, column: 41
          currsigs.addElement(gripperLiftedS);
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

  public void thread1292(int [] tdone, int [] ends){
        switch(S773){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S767){
          case 0 : 
            S767=0;
            if(gripperLowered.getprestatus()){//sysj\capperPlant.sysj line: 52, column: 25
              gripperLoweredS.setPresent();//sysj\capperPlant.sysj line: 52, column: 42
              currsigs.addElement(gripperLoweredS);
              S767=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S767=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            S767=1;
            S767=0;
            if(gripperLowered.getprestatus()){//sysj\capperPlant.sysj line: 52, column: 25
              gripperLoweredS.setPresent();//sysj\capperPlant.sysj line: 52, column: 42
              currsigs.addElement(gripperLoweredS);
              S767=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S767=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1291(int [] tdone, int [] ends){
        switch(S807){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        thread1292(tdone,ends);
        thread1293(tdone,ends);
        thread1294(tdone,ends);
        thread1295(tdone,ends);
        thread1296(tdone,ends);
        int biggest1297 = 0;
        if(ends[7]>=biggest1297){
          biggest1297=ends[7];
        }
        if(ends[8]>=biggest1297){
          biggest1297=ends[8];
        }
        if(ends[9]>=biggest1297){
          biggest1297=ends[9];
        }
        if(ends[10]>=biggest1297){
          biggest1297=ends[10];
        }
        if(ends[11]>=biggest1297){
          biggest1297=ends[11];
        }
        if(biggest1297 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        //FINXME code
        if(biggest1297 == 0){
          S807=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread1290(int [] tdone, int [] ends){
        switch(S765){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S733){
          case 0 : 
            if(clampBottle.getprestatus()){//sysj\capperPlant.sysj line: 44, column: 10
              S733=1;
              if(untwistGrip.getprestatus()){//sysj\capperPlant.sysj line: 45, column: 20
                S733=0;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                bottleClamped.setPresent();//sysj\capperPlant.sysj line: 46, column: 5
                currsigs.addElement(bottleClamped);
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
            }
            else {
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            if(untwistGrip.getprestatus()){//sysj\capperPlant.sysj line: 45, column: 20
              S733=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              bottleClamped.setPresent();//sysj\capperPlant.sysj line: 46, column: 5
              currsigs.addElement(bottleClamped);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1289(int [] tdone, int [] ends){
        switch(S723){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S691){
          case 0 : 
            if(gripCap.getprestatus()){//sysj\capperPlant.sysj line: 35, column: 10
              S691=1;
              if(untwistGrip.getprestatus()){//sysj\capperPlant.sysj line: 36, column: 20
                S691=0;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                gripCapS.setPresent();//sysj\capperPlant.sysj line: 37, column: 5
                currsigs.addElement(gripCapS);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            else {
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            if(untwistGrip.getprestatus()){//sysj\capperPlant.sysj line: 36, column: 20
              S691=0;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              gripCapS.setPresent();//sysj\capperPlant.sysj line: 37, column: 5
              currsigs.addElement(gripCapS);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1288(int [] tdone, int [] ends){
        switch(S681){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S645){
          case 0 : 
            if(twistGrip.getprestatus()){//sysj\capperPlant.sysj line: 23, column: 20
              S645=1;
              if(untwistGrip.getprestatus()){//sysj\capperPlant.sysj line: 26, column: 20
                S645=2;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                gripperTurned.setPresent();//sysj\capperPlant.sysj line: 27, column: 5
                currsigs.addElement(gripperTurned);
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
            }
            else {
              gripperInit.setPresent();//sysj\capperPlant.sysj line: 24, column: 5
              currsigs.addElement(gripperInit);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if(untwistGrip.getprestatus()){//sysj\capperPlant.sysj line: 26, column: 20
              S645=2;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              gripperTurned.setPresent();//sysj\capperPlant.sysj line: 27, column: 5
              currsigs.addElement(gripperTurned);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 2 : 
            S645=2;
            S645=0;
            if(twistGrip.getprestatus()){//sysj\capperPlant.sysj line: 23, column: 20
              S645=1;
              if(untwistGrip.getprestatus()){//sysj\capperPlant.sysj line: 26, column: 20
                S645=2;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                gripperTurned.setPresent();//sysj\capperPlant.sysj line: 27, column: 5
                currsigs.addElement(gripperTurned);
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
            }
            else {
              gripperInit.setPresent();//sysj\capperPlant.sysj line: 24, column: 5
              currsigs.addElement(gripperInit);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1287(int [] tdone, int [] ends){
        switch(S628){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S592){
          case 0 : 
            if(gripDown.getprestatus()){//sysj\capperPlant.sysj line: 11, column: 20
              S592=1;
              gripperLowered.setPresent();//sysj\capperPlant.sysj line: 15, column: 5
              currsigs.addElement(gripperLowered);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              gripperLifted.setPresent();//sysj\capperPlant.sysj line: 12, column: 5
              currsigs.addElement(gripperLifted);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(untwistGrip.getprestatus()){//sysj\capperPlant.sysj line: 14, column: 10
              S592=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              gripperLowered.setPresent();//sysj\capperPlant.sysj line: 15, column: 5
              currsigs.addElement(gripperLowered);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 2 : 
            S592=2;
            S592=0;
            if(gripDown.getprestatus()){//sysj\capperPlant.sysj line: 11, column: 20
              S592=1;
              gripperLowered.setPresent();//sysj\capperPlant.sysj line: 15, column: 5
              currsigs.addElement(gripperLowered);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              gripperLifted.setPresent();//sysj\capperPlant.sysj line: 12, column: 5
              currsigs.addElement(gripperLifted);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1284(int [] tdone, int [] ends){
        S805=1;
    if(bottleClamped.getprestatus()){//sysj\capperPlant.sysj line: 60, column: 25
      bottleClampedS.setPresent();//sysj\capperPlant.sysj line: 60, column: 41
      currsigs.addElement(bottleClampedS);
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

  public void thread1283(int [] tdone, int [] ends){
        S797=1;
    if(gripperTurned.getprestatus()){//sysj\capperPlant.sysj line: 58, column: 25
      gripperTurnedS.setPresent();//sysj\capperPlant.sysj line: 58, column: 41
      currsigs.addElement(gripperTurnedS);
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

  public void thread1282(int [] tdone, int [] ends){
        S789=1;
    if(gripperInit.getprestatus()){//sysj\capperPlant.sysj line: 56, column: 25
      gripperInitS.setPresent();//sysj\capperPlant.sysj line: 56, column: 39
      currsigs.addElement(gripperInitS);
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

  public void thread1281(int [] tdone, int [] ends){
        S781=1;
    if(gripperLifted.getprestatus()){//sysj\capperPlant.sysj line: 54, column: 25
      gripperLiftedS.setPresent();//sysj\capperPlant.sysj line: 54, column: 41
      currsigs.addElement(gripperLiftedS);
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

  public void thread1280(int [] tdone, int [] ends){
        S773=1;
    S767=0;
    if(gripperLowered.getprestatus()){//sysj\capperPlant.sysj line: 52, column: 25
      gripperLoweredS.setPresent();//sysj\capperPlant.sysj line: 52, column: 42
      currsigs.addElement(gripperLoweredS);
      S767=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S767=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread1279(int [] tdone, int [] ends){
        S807=1;
    thread1280(tdone,ends);
    thread1281(tdone,ends);
    thread1282(tdone,ends);
    thread1283(tdone,ends);
    thread1284(tdone,ends);
    int biggest1285 = 0;
    if(ends[7]>=biggest1285){
      biggest1285=ends[7];
    }
    if(ends[8]>=biggest1285){
      biggest1285=ends[8];
    }
    if(ends[9]>=biggest1285){
      biggest1285=ends[9];
    }
    if(ends[10]>=biggest1285){
      biggest1285=ends[10];
    }
    if(ends[11]>=biggest1285){
      biggest1285=ends[11];
    }
    if(biggest1285 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread1278(int [] tdone, int [] ends){
        S765=1;
    S733=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread1277(int [] tdone, int [] ends){
        S723=1;
    S691=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread1276(int [] tdone, int [] ends){
        S681=1;
    S645=0;
    if(twistGrip.getprestatus()){//sysj\capperPlant.sysj line: 23, column: 20
      S645=1;
      if(untwistGrip.getprestatus()){//sysj\capperPlant.sysj line: 26, column: 20
        S645=2;
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
      }
      else {
        gripperTurned.setPresent();//sysj\capperPlant.sysj line: 27, column: 5
        currsigs.addElement(gripperTurned);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
      }
    }
    else {
      gripperInit.setPresent();//sysj\capperPlant.sysj line: 24, column: 5
      currsigs.addElement(gripperInit);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread1275(int [] tdone, int [] ends){
        S628=1;
    S592=0;
    if(gripDown.getprestatus()){//sysj\capperPlant.sysj line: 11, column: 20
      S592=1;
      gripperLowered.setPresent();//sysj\capperPlant.sysj line: 15, column: 5
      currsigs.addElement(gripperLowered);
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      gripperLifted.setPresent();//sysj\capperPlant.sysj line: 12, column: 5
      currsigs.addElement(gripperLifted);
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S1273){
        case 0 : 
          S1273=0;
          break RUN;
        
        case 1 : 
          S1273=2;
          S1273=2;
          thread1275(tdone,ends);
          thread1276(tdone,ends);
          thread1277(tdone,ends);
          thread1278(tdone,ends);
          thread1279(tdone,ends);
          int biggest1286 = 0;
          if(ends[2]>=biggest1286){
            biggest1286=ends[2];
          }
          if(ends[3]>=biggest1286){
            biggest1286=ends[3];
          }
          if(ends[4]>=biggest1286){
            biggest1286=ends[4];
          }
          if(ends[5]>=biggest1286){
            biggest1286=ends[5];
          }
          if(ends[6]>=biggest1286){
            biggest1286=ends[6];
          }
          if(biggest1286 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread1287(tdone,ends);
          thread1288(tdone,ends);
          thread1289(tdone,ends);
          thread1290(tdone,ends);
          thread1291(tdone,ends);
          int biggest1298 = 0;
          if(ends[2]>=biggest1298){
            biggest1298=ends[2];
          }
          if(ends[3]>=biggest1298){
            biggest1298=ends[3];
          }
          if(ends[4]>=biggest1298){
            biggest1298=ends[4];
          }
          if(ends[5]>=biggest1298){
            biggest1298=ends[5];
          }
          if(ends[6]>=biggest1298){
            biggest1298=ends[6];
          }
          if(biggest1298 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1298 == 0){
            thread1299(tdone,ends);
            thread1300(tdone,ends);
            thread1301(tdone,ends);
            thread1302(tdone,ends);
            thread1303(tdone,ends);
            int biggest1310 = 0;
            if(ends[2]>=biggest1310){
              biggest1310=ends[2];
            }
            if(ends[3]>=biggest1310){
              biggest1310=ends[3];
            }
            if(ends[4]>=biggest1310){
              biggest1310=ends[4];
            }
            if(ends[5]>=biggest1310){
              biggest1310=ends[5];
            }
            if(ends[6]>=biggest1310){
              biggest1310=ends[6];
            }
            if(biggest1310 == 1){
              active[1]=1;
              ends[1]=1;
              break RUN;
            }
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
          clampBottle.gethook();
          gripCap.gethook();
          gripDown.gethook();
          twistGrip.gethook();
          untwistGrip.gethook();
          df = true;
        }
        runClockDomain();
      }
      clampBottle.setpreclear();
      gripCap.setpreclear();
      gripDown.setpreclear();
      twistGrip.setpreclear();
      untwistGrip.setpreclear();
      gripperLowered.setpreclear();
      gripperLifted.setpreclear();
      gripperInit.setpreclear();
      gripperTurned.setpreclear();
      bottleClamped.setpreclear();
      gripperLoweredS.setpreclear();
      gripperLiftedS.setpreclear();
      gripperInitS.setpreclear();
      gripperTurnedS.setpreclear();
      gripCapS.setpreclear();
      bottleClampedS.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = clampBottle.getStatus() ? clampBottle.setprepresent() : clampBottle.setpreclear();
      clampBottle.setpreval(clampBottle.getValue());
      clampBottle.setClear();
      dummyint = gripCap.getStatus() ? gripCap.setprepresent() : gripCap.setpreclear();
      gripCap.setpreval(gripCap.getValue());
      gripCap.setClear();
      dummyint = gripDown.getStatus() ? gripDown.setprepresent() : gripDown.setpreclear();
      gripDown.setpreval(gripDown.getValue());
      gripDown.setClear();
      dummyint = twistGrip.getStatus() ? twistGrip.setprepresent() : twistGrip.setpreclear();
      twistGrip.setpreval(twistGrip.getValue());
      twistGrip.setClear();
      dummyint = untwistGrip.getStatus() ? untwistGrip.setprepresent() : untwistGrip.setpreclear();
      untwistGrip.setpreval(untwistGrip.getValue());
      untwistGrip.setClear();
      gripperLowered.sethook();
      gripperLowered.setClear();
      gripperLifted.sethook();
      gripperLifted.setClear();
      gripperInit.sethook();
      gripperInit.setClear();
      gripperTurned.sethook();
      gripperTurned.setClear();
      bottleClamped.sethook();
      bottleClamped.setClear();
      gripperLoweredS.sethook();
      gripperLoweredS.setClear();
      gripperLiftedS.sethook();
      gripperLiftedS.setClear();
      gripperInitS.sethook();
      gripperInitS.setClear();
      gripperTurnedS.sethook();
      gripperTurnedS.setClear();
      gripCapS.sethook();
      gripCapS.setClear();
      bottleClampedS.sethook();
      bottleClampedS.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        clampBottle.gethook();
        gripCap.gethook();
        gripDown.gethook();
        twistGrip.gethook();
        untwistGrip.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
