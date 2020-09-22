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
  private int S1252 = 1;
  private int S607 = 1;
  private int S571 = 1;
  private int S660 = 1;
  private int S624 = 1;
  private int S702 = 1;
  private int S670 = 1;
  private int S744 = 1;
  private int S712 = 1;
  private int S786 = 1;
  private int S752 = 1;
  private int S746 = 1;
  private int S760 = 1;
  private int S768 = 1;
  private int S776 = 1;
  private int S784 = 1;
  
  private int[] ends = new int[12];
  private int[] tdone = new int[12];
  
  public void thread1287(int [] tdone, int [] ends){
        S784=1;
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

  public void thread1286(int [] tdone, int [] ends){
        S776=1;
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

  public void thread1285(int [] tdone, int [] ends){
        S768=1;
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

  public void thread1284(int [] tdone, int [] ends){
        S760=1;
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

  public void thread1283(int [] tdone, int [] ends){
        S752=1;
    S746=0;
    if(gripperLowered.getprestatus()){//sysj\capperPlant.sysj line: 52, column: 25
      gripperLoweredS.setPresent();//sysj\capperPlant.sysj line: 52, column: 42
      currsigs.addElement(gripperLoweredS);
      S746=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S746=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread1282(int [] tdone, int [] ends){
        S786=1;
    thread1283(tdone,ends);
    thread1284(tdone,ends);
    thread1285(tdone,ends);
    thread1286(tdone,ends);
    thread1287(tdone,ends);
    int biggest1288 = 0;
    if(ends[7]>=biggest1288){
      biggest1288=ends[7];
    }
    if(ends[8]>=biggest1288){
      biggest1288=ends[8];
    }
    if(ends[9]>=biggest1288){
      biggest1288=ends[9];
    }
    if(ends[10]>=biggest1288){
      biggest1288=ends[10];
    }
    if(ends[11]>=biggest1288){
      biggest1288=ends[11];
    }
    if(biggest1288 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread1281(int [] tdone, int [] ends){
        S744=1;
    S712=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread1280(int [] tdone, int [] ends){
        S702=1;
    S670=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread1279(int [] tdone, int [] ends){
        S660=1;
    S624=0;
    if(twistGrip.getprestatus()){//sysj\capperPlant.sysj line: 23, column: 20
      S624=1;
      if(untwistGrip.getprestatus()){//sysj\capperPlant.sysj line: 26, column: 20
        S624=2;
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

  public void thread1278(int [] tdone, int [] ends){
        S607=1;
    S571=0;
    if(gripDown.getprestatus()){//sysj\capperPlant.sysj line: 11, column: 20
      S571=1;
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

  public void thread1275(int [] tdone, int [] ends){
        switch(S784){
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

  public void thread1274(int [] tdone, int [] ends){
        switch(S776){
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

  public void thread1273(int [] tdone, int [] ends){
        switch(S768){
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

  public void thread1272(int [] tdone, int [] ends){
        switch(S760){
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

  public void thread1271(int [] tdone, int [] ends){
        switch(S752){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S746){
          case 0 : 
            S746=0;
            if(gripperLowered.getprestatus()){//sysj\capperPlant.sysj line: 52, column: 25
              gripperLoweredS.setPresent();//sysj\capperPlant.sysj line: 52, column: 42
              currsigs.addElement(gripperLoweredS);
              S746=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S746=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            S746=1;
            S746=0;
            if(gripperLowered.getprestatus()){//sysj\capperPlant.sysj line: 52, column: 25
              gripperLoweredS.setPresent();//sysj\capperPlant.sysj line: 52, column: 42
              currsigs.addElement(gripperLoweredS);
              S746=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S746=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1270(int [] tdone, int [] ends){
        switch(S786){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        thread1271(tdone,ends);
        thread1272(tdone,ends);
        thread1273(tdone,ends);
        thread1274(tdone,ends);
        thread1275(tdone,ends);
        int biggest1276 = 0;
        if(ends[7]>=biggest1276){
          biggest1276=ends[7];
        }
        if(ends[8]>=biggest1276){
          biggest1276=ends[8];
        }
        if(ends[9]>=biggest1276){
          biggest1276=ends[9];
        }
        if(ends[10]>=biggest1276){
          biggest1276=ends[10];
        }
        if(ends[11]>=biggest1276){
          biggest1276=ends[11];
        }
        if(biggest1276 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        //FINXME code
        if(biggest1276 == 0){
          S786=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread1269(int [] tdone, int [] ends){
        switch(S744){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S712){
          case 0 : 
            if(clampBottle.getprestatus()){//sysj\capperPlant.sysj line: 44, column: 10
              S712=1;
              if(untwistGrip.getprestatus()){//sysj\capperPlant.sysj line: 45, column: 20
                S712=0;
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
              S712=0;
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

  public void thread1268(int [] tdone, int [] ends){
        switch(S702){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S670){
          case 0 : 
            if(gripCap.getprestatus()){//sysj\capperPlant.sysj line: 35, column: 10
              S670=1;
              if(untwistGrip.getprestatus()){//sysj\capperPlant.sysj line: 36, column: 20
                S670=0;
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
              S670=0;
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

  public void thread1267(int [] tdone, int [] ends){
        switch(S660){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S624){
          case 0 : 
            if(twistGrip.getprestatus()){//sysj\capperPlant.sysj line: 23, column: 20
              S624=1;
              if(untwistGrip.getprestatus()){//sysj\capperPlant.sysj line: 26, column: 20
                S624=2;
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
              S624=2;
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
            S624=2;
            S624=0;
            if(twistGrip.getprestatus()){//sysj\capperPlant.sysj line: 23, column: 20
              S624=1;
              if(untwistGrip.getprestatus()){//sysj\capperPlant.sysj line: 26, column: 20
                S624=2;
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

  public void thread1266(int [] tdone, int [] ends){
        switch(S607){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S571){
          case 0 : 
            if(gripDown.getprestatus()){//sysj\capperPlant.sysj line: 11, column: 20
              S571=1;
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
              S571=2;
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
            S571=2;
            S571=0;
            if(gripDown.getprestatus()){//sysj\capperPlant.sysj line: 11, column: 20
              S571=1;
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

  public void thread1263(int [] tdone, int [] ends){
        S784=1;
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

  public void thread1262(int [] tdone, int [] ends){
        S776=1;
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

  public void thread1261(int [] tdone, int [] ends){
        S768=1;
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

  public void thread1260(int [] tdone, int [] ends){
        S760=1;
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

  public void thread1259(int [] tdone, int [] ends){
        S752=1;
    S746=0;
    if(gripperLowered.getprestatus()){//sysj\capperPlant.sysj line: 52, column: 25
      gripperLoweredS.setPresent();//sysj\capperPlant.sysj line: 52, column: 42
      currsigs.addElement(gripperLoweredS);
      S746=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S746=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread1258(int [] tdone, int [] ends){
        S786=1;
    thread1259(tdone,ends);
    thread1260(tdone,ends);
    thread1261(tdone,ends);
    thread1262(tdone,ends);
    thread1263(tdone,ends);
    int biggest1264 = 0;
    if(ends[7]>=biggest1264){
      biggest1264=ends[7];
    }
    if(ends[8]>=biggest1264){
      biggest1264=ends[8];
    }
    if(ends[9]>=biggest1264){
      biggest1264=ends[9];
    }
    if(ends[10]>=biggest1264){
      biggest1264=ends[10];
    }
    if(ends[11]>=biggest1264){
      biggest1264=ends[11];
    }
    if(biggest1264 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread1257(int [] tdone, int [] ends){
        S744=1;
    S712=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread1256(int [] tdone, int [] ends){
        S702=1;
    S670=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread1255(int [] tdone, int [] ends){
        S660=1;
    S624=0;
    if(twistGrip.getprestatus()){//sysj\capperPlant.sysj line: 23, column: 20
      S624=1;
      if(untwistGrip.getprestatus()){//sysj\capperPlant.sysj line: 26, column: 20
        S624=2;
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

  public void thread1254(int [] tdone, int [] ends){
        S607=1;
    S571=0;
    if(gripDown.getprestatus()){//sysj\capperPlant.sysj line: 11, column: 20
      S571=1;
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
      switch(S1252){
        case 0 : 
          S1252=0;
          break RUN;
        
        case 1 : 
          S1252=2;
          S1252=2;
          thread1254(tdone,ends);
          thread1255(tdone,ends);
          thread1256(tdone,ends);
          thread1257(tdone,ends);
          thread1258(tdone,ends);
          int biggest1265 = 0;
          if(ends[2]>=biggest1265){
            biggest1265=ends[2];
          }
          if(ends[3]>=biggest1265){
            biggest1265=ends[3];
          }
          if(ends[4]>=biggest1265){
            biggest1265=ends[4];
          }
          if(ends[5]>=biggest1265){
            biggest1265=ends[5];
          }
          if(ends[6]>=biggest1265){
            biggest1265=ends[6];
          }
          if(biggest1265 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread1266(tdone,ends);
          thread1267(tdone,ends);
          thread1268(tdone,ends);
          thread1269(tdone,ends);
          thread1270(tdone,ends);
          int biggest1277 = 0;
          if(ends[2]>=biggest1277){
            biggest1277=ends[2];
          }
          if(ends[3]>=biggest1277){
            biggest1277=ends[3];
          }
          if(ends[4]>=biggest1277){
            biggest1277=ends[4];
          }
          if(ends[5]>=biggest1277){
            biggest1277=ends[5];
          }
          if(ends[6]>=biggest1277){
            biggest1277=ends[6];
          }
          if(biggest1277 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1277 == 0){
            thread1278(tdone,ends);
            thread1279(tdone,ends);
            thread1280(tdone,ends);
            thread1281(tdone,ends);
            thread1282(tdone,ends);
            int biggest1289 = 0;
            if(ends[2]>=biggest1289){
              biggest1289=ends[2];
            }
            if(ends[3]>=biggest1289){
              biggest1289=ends[3];
            }
            if(ends[4]>=biggest1289){
              biggest1289=ends[4];
            }
            if(ends[5]>=biggest1289){
              biggest1289=ends[5];
            }
            if(ends[6]>=biggest1289){
              biggest1289=ends[6];
            }
            if(biggest1289 == 1){
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
