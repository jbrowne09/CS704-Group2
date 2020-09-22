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
  private int S1297 = 1;
  private int S652 = 1;
  private int S616 = 1;
  private int S705 = 1;
  private int S669 = 1;
  private int S747 = 1;
  private int S715 = 1;
  private int S789 = 1;
  private int S757 = 1;
  private int S831 = 1;
  private int S797 = 1;
  private int S791 = 1;
  private int S805 = 1;
  private int S813 = 1;
  private int S821 = 1;
  private int S829 = 1;
  
  private int[] ends = new int[12];
  private int[] tdone = new int[12];
  
  public void thread1332(int [] tdone, int [] ends){
        S829=1;
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

  public void thread1331(int [] tdone, int [] ends){
        S821=1;
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

  public void thread1330(int [] tdone, int [] ends){
        S813=1;
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

  public void thread1329(int [] tdone, int [] ends){
        S805=1;
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

  public void thread1328(int [] tdone, int [] ends){
        S797=1;
    S791=0;
    if(gripperLowered.getprestatus()){//sysj\capperPlant.sysj line: 52, column: 25
      gripperLoweredS.setPresent();//sysj\capperPlant.sysj line: 52, column: 42
      currsigs.addElement(gripperLoweredS);
      S791=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S791=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread1327(int [] tdone, int [] ends){
        S831=1;
    thread1328(tdone,ends);
    thread1329(tdone,ends);
    thread1330(tdone,ends);
    thread1331(tdone,ends);
    thread1332(tdone,ends);
    int biggest1333 = 0;
    if(ends[7]>=biggest1333){
      biggest1333=ends[7];
    }
    if(ends[8]>=biggest1333){
      biggest1333=ends[8];
    }
    if(ends[9]>=biggest1333){
      biggest1333=ends[9];
    }
    if(ends[10]>=biggest1333){
      biggest1333=ends[10];
    }
    if(ends[11]>=biggest1333){
      biggest1333=ends[11];
    }
    if(biggest1333 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread1326(int [] tdone, int [] ends){
        S789=1;
    S757=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread1325(int [] tdone, int [] ends){
        S747=1;
    S715=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread1324(int [] tdone, int [] ends){
        S705=1;
    S669=0;
    if(twistGrip.getprestatus()){//sysj\capperPlant.sysj line: 23, column: 20
      S669=1;
      if(untwistGrip.getprestatus()){//sysj\capperPlant.sysj line: 26, column: 20
        S669=2;
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

  public void thread1323(int [] tdone, int [] ends){
        S652=1;
    S616=0;
    if(gripDown.getprestatus()){//sysj\capperPlant.sysj line: 11, column: 20
      S616=1;
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

  public void thread1320(int [] tdone, int [] ends){
        switch(S829){
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

  public void thread1319(int [] tdone, int [] ends){
        switch(S821){
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

  public void thread1318(int [] tdone, int [] ends){
        switch(S813){
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

  public void thread1317(int [] tdone, int [] ends){
        switch(S805){
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

  public void thread1316(int [] tdone, int [] ends){
        switch(S797){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S791){
          case 0 : 
            S791=0;
            if(gripperLowered.getprestatus()){//sysj\capperPlant.sysj line: 52, column: 25
              gripperLoweredS.setPresent();//sysj\capperPlant.sysj line: 52, column: 42
              currsigs.addElement(gripperLoweredS);
              S791=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S791=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            S791=1;
            S791=0;
            if(gripperLowered.getprestatus()){//sysj\capperPlant.sysj line: 52, column: 25
              gripperLoweredS.setPresent();//sysj\capperPlant.sysj line: 52, column: 42
              currsigs.addElement(gripperLoweredS);
              S791=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S791=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1315(int [] tdone, int [] ends){
        switch(S831){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        thread1316(tdone,ends);
        thread1317(tdone,ends);
        thread1318(tdone,ends);
        thread1319(tdone,ends);
        thread1320(tdone,ends);
        int biggest1321 = 0;
        if(ends[7]>=biggest1321){
          biggest1321=ends[7];
        }
        if(ends[8]>=biggest1321){
          biggest1321=ends[8];
        }
        if(ends[9]>=biggest1321){
          biggest1321=ends[9];
        }
        if(ends[10]>=biggest1321){
          biggest1321=ends[10];
        }
        if(ends[11]>=biggest1321){
          biggest1321=ends[11];
        }
        if(biggest1321 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        //FINXME code
        if(biggest1321 == 0){
          S831=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread1314(int [] tdone, int [] ends){
        switch(S789){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S757){
          case 0 : 
            if(clampBottle.getprestatus()){//sysj\capperPlant.sysj line: 44, column: 10
              S757=1;
              if(untwistGrip.getprestatus()){//sysj\capperPlant.sysj line: 45, column: 20
                S757=0;
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
              S757=0;
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

  public void thread1313(int [] tdone, int [] ends){
        switch(S747){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S715){
          case 0 : 
            if(gripCap.getprestatus()){//sysj\capperPlant.sysj line: 35, column: 10
              S715=1;
              if(untwistGrip.getprestatus()){//sysj\capperPlant.sysj line: 36, column: 20
                S715=0;
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
              S715=0;
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

  public void thread1312(int [] tdone, int [] ends){
        switch(S705){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S669){
          case 0 : 
            if(twistGrip.getprestatus()){//sysj\capperPlant.sysj line: 23, column: 20
              S669=1;
              if(untwistGrip.getprestatus()){//sysj\capperPlant.sysj line: 26, column: 20
                S669=2;
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
              S669=2;
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
            S669=2;
            S669=0;
            if(twistGrip.getprestatus()){//sysj\capperPlant.sysj line: 23, column: 20
              S669=1;
              if(untwistGrip.getprestatus()){//sysj\capperPlant.sysj line: 26, column: 20
                S669=2;
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

  public void thread1311(int [] tdone, int [] ends){
        switch(S652){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S616){
          case 0 : 
            if(gripDown.getprestatus()){//sysj\capperPlant.sysj line: 11, column: 20
              S616=1;
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
              S616=2;
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
            S616=2;
            S616=0;
            if(gripDown.getprestatus()){//sysj\capperPlant.sysj line: 11, column: 20
              S616=1;
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

  public void thread1308(int [] tdone, int [] ends){
        S829=1;
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
        S821=1;
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
        S813=1;
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
        S805=1;
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
        S797=1;
    S791=0;
    if(gripperLowered.getprestatus()){//sysj\capperPlant.sysj line: 52, column: 25
      gripperLoweredS.setPresent();//sysj\capperPlant.sysj line: 52, column: 42
      currsigs.addElement(gripperLoweredS);
      S791=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S791=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread1303(int [] tdone, int [] ends){
        S831=1;
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
        S789=1;
    S757=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread1301(int [] tdone, int [] ends){
        S747=1;
    S715=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread1300(int [] tdone, int [] ends){
        S705=1;
    S669=0;
    if(twistGrip.getprestatus()){//sysj\capperPlant.sysj line: 23, column: 20
      S669=1;
      if(untwistGrip.getprestatus()){//sysj\capperPlant.sysj line: 26, column: 20
        S669=2;
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
        S652=1;
    S616=0;
    if(gripDown.getprestatus()){//sysj\capperPlant.sysj line: 11, column: 20
      S616=1;
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
      switch(S1297){
        case 0 : 
          S1297=0;
          break RUN;
        
        case 1 : 
          S1297=2;
          S1297=2;
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
        
        case 2 : 
          thread1311(tdone,ends);
          thread1312(tdone,ends);
          thread1313(tdone,ends);
          thread1314(tdone,ends);
          thread1315(tdone,ends);
          int biggest1322 = 0;
          if(ends[2]>=biggest1322){
            biggest1322=ends[2];
          }
          if(ends[3]>=biggest1322){
            biggest1322=ends[3];
          }
          if(ends[4]>=biggest1322){
            biggest1322=ends[4];
          }
          if(ends[5]>=biggest1322){
            biggest1322=ends[5];
          }
          if(ends[6]>=biggest1322){
            biggest1322=ends[6];
          }
          if(biggest1322 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1322 == 0){
            thread1323(tdone,ends);
            thread1324(tdone,ends);
            thread1325(tdone,ends);
            thread1326(tdone,ends);
            thread1327(tdone,ends);
            int biggest1334 = 0;
            if(ends[2]>=biggest1334){
              biggest1334=ends[2];
            }
            if(ends[3]>=biggest1334){
              biggest1334=ends[3];
            }
            if(ends[4]>=biggest1334){
              biggest1334=ends[4];
            }
            if(ends[5]>=biggest1334){
              biggest1334=ends[5];
            }
            if(ends[6]>=biggest1334){
              biggest1334=ends[6];
            }
            if(biggest1334 == 1){
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
