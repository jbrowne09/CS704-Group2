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
  public Signal bottlePos4 = new Signal("bottlePos4", Signal.OUTPUT);
  public Signal gripperLoweredS = new Signal("gripperLoweredS", Signal.OUTPUT);
  public Signal gripperLiftedS = new Signal("gripperLiftedS", Signal.OUTPUT);
  public Signal gripperInitS = new Signal("gripperInitS", Signal.OUTPUT);
  public Signal gripperTurnedS = new Signal("gripperTurnedS", Signal.OUTPUT);
  public Signal gripCapS = new Signal("gripCapS", Signal.OUTPUT);
  public Signal bottleClampedS = new Signal("bottleClampedS", Signal.OUTPUT);
  public Signal bottlePos4S = new Signal("bottlePos4S", Signal.OUTPUT);
  private int S340 = 1;
  private int S44 = 1;
  private int S43 = 1;
  private int S58 = 1;
  private int S57 = 1;
  private int S69 = 1;
  private int S68 = 1;
  private int S80 = 1;
  private int S79 = 1;
  private int S130 = 1;
  private int S88 = 1;
  private int S82 = 1;
  private int S96 = 1;
  private int S104 = 1;
  private int S112 = 1;
  private int S120 = 1;
  private int S128 = 1;
  
  private int[] ends = new int[13];
  private int[] tdone = new int[13];
  
  public void thread378(int [] tdone, int [] ends){
        S128=1;
    if(bottlePos4.getprestatus()){//sysj\capperPlant.sysj line: 52, column: 25
      bottlePos4S.setPresent();//sysj\capperPlant.sysj line: 52, column: 38
      currsigs.addElement(bottlePos4S);
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

  public void thread377(int [] tdone, int [] ends){
        S120=1;
    if(bottleClamped.getprestatus()){//sysj\capperPlant.sysj line: 50, column: 25
      bottleClampedS.setPresent();//sysj\capperPlant.sysj line: 50, column: 41
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

  public void thread376(int [] tdone, int [] ends){
        S112=1;
    if(gripperTurned.getprestatus()){//sysj\capperPlant.sysj line: 48, column: 25
      gripperTurnedS.setPresent();//sysj\capperPlant.sysj line: 48, column: 41
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

  public void thread375(int [] tdone, int [] ends){
        S104=1;
    if(gripperInit.getprestatus()){//sysj\capperPlant.sysj line: 46, column: 25
      gripperInitS.setPresent();//sysj\capperPlant.sysj line: 46, column: 39
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

  public void thread374(int [] tdone, int [] ends){
        S96=1;
    if(gripperLifted.getprestatus()){//sysj\capperPlant.sysj line: 44, column: 25
      gripperLiftedS.setPresent();//sysj\capperPlant.sysj line: 44, column: 41
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

  public void thread373(int [] tdone, int [] ends){
        S88=1;
    S82=0;
    if(gripperLowered.getprestatus()){//sysj\capperPlant.sysj line: 42, column: 25
      gripperLoweredS.setPresent();//sysj\capperPlant.sysj line: 42, column: 42
      currsigs.addElement(gripperLoweredS);
      S82=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S82=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread372(int [] tdone, int [] ends){
        S130=1;
    thread373(tdone,ends);
    thread374(tdone,ends);
    thread375(tdone,ends);
    thread376(tdone,ends);
    thread377(tdone,ends);
    thread378(tdone,ends);
    int biggest379 = 0;
    if(ends[7]>=biggest379){
      biggest379=ends[7];
    }
    if(ends[8]>=biggest379){
      biggest379=ends[8];
    }
    if(ends[9]>=biggest379){
      biggest379=ends[9];
    }
    if(ends[10]>=biggest379){
      biggest379=ends[10];
    }
    if(ends[11]>=biggest379){
      biggest379=ends[11];
    }
    if(ends[12]>=biggest379){
      biggest379=ends[12];
    }
    if(biggest379 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread371(int [] tdone, int [] ends){
        S80=1;
    S79=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread370(int [] tdone, int [] ends){
        S69=1;
    S68=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread369(int [] tdone, int [] ends){
        S58=1;
    S57=0;
    gripperInit.setPresent();//sysj\capperPlant.sysj line: 20, column: 5
    currsigs.addElement(gripperInit);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread368(int [] tdone, int [] ends){
        S44=1;
    S43=0;
    if(gripDown.getprestatus()){//sysj\capperPlant.sysj line: 10, column: 20
      S43=1;
      gripperLowered.setPresent();//sysj\capperPlant.sysj line: 14, column: 5
      currsigs.addElement(gripperLowered);
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      gripperLifted.setPresent();//sysj\capperPlant.sysj line: 11, column: 5
      currsigs.addElement(gripperLifted);
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void thread365(int [] tdone, int [] ends){
        switch(S128){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(bottlePos4.getprestatus()){//sysj\capperPlant.sysj line: 52, column: 25
          bottlePos4S.setPresent();//sysj\capperPlant.sysj line: 52, column: 38
          currsigs.addElement(bottlePos4S);
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

  public void thread364(int [] tdone, int [] ends){
        switch(S120){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(bottleClamped.getprestatus()){//sysj\capperPlant.sysj line: 50, column: 25
          bottleClampedS.setPresent();//sysj\capperPlant.sysj line: 50, column: 41
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

  public void thread363(int [] tdone, int [] ends){
        switch(S112){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(gripperTurned.getprestatus()){//sysj\capperPlant.sysj line: 48, column: 25
          gripperTurnedS.setPresent();//sysj\capperPlant.sysj line: 48, column: 41
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

  public void thread362(int [] tdone, int [] ends){
        switch(S104){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(gripperInit.getprestatus()){//sysj\capperPlant.sysj line: 46, column: 25
          gripperInitS.setPresent();//sysj\capperPlant.sysj line: 46, column: 39
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

  public void thread361(int [] tdone, int [] ends){
        switch(S96){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(gripperLifted.getprestatus()){//sysj\capperPlant.sysj line: 44, column: 25
          gripperLiftedS.setPresent();//sysj\capperPlant.sysj line: 44, column: 41
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

  public void thread360(int [] tdone, int [] ends){
        switch(S88){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S82){
          case 0 : 
            S82=0;
            if(gripperLowered.getprestatus()){//sysj\capperPlant.sysj line: 42, column: 25
              gripperLoweredS.setPresent();//sysj\capperPlant.sysj line: 42, column: 42
              currsigs.addElement(gripperLoweredS);
              S82=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S82=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            S82=1;
            S82=0;
            if(gripperLowered.getprestatus()){//sysj\capperPlant.sysj line: 42, column: 25
              gripperLoweredS.setPresent();//sysj\capperPlant.sysj line: 42, column: 42
              currsigs.addElement(gripperLoweredS);
              S82=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S82=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread359(int [] tdone, int [] ends){
        switch(S130){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        thread360(tdone,ends);
        thread361(tdone,ends);
        thread362(tdone,ends);
        thread363(tdone,ends);
        thread364(tdone,ends);
        thread365(tdone,ends);
        int biggest366 = 0;
        if(ends[7]>=biggest366){
          biggest366=ends[7];
        }
        if(ends[8]>=biggest366){
          biggest366=ends[8];
        }
        if(ends[9]>=biggest366){
          biggest366=ends[9];
        }
        if(ends[10]>=biggest366){
          biggest366=ends[10];
        }
        if(ends[11]>=biggest366){
          biggest366=ends[11];
        }
        if(ends[12]>=biggest366){
          biggest366=ends[12];
        }
        if(biggest366 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        //FINXME code
        if(biggest366 == 0){
          S130=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread358(int [] tdone, int [] ends){
        switch(S80){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S79){
          case 0 : 
            if(clampBottle.getprestatus()){//sysj\capperPlant.sysj line: 35, column: 9
              S79=1;
              bottleClamped.setPresent();//sysj\capperPlant.sysj line: 37, column: 4
              currsigs.addElement(bottleClamped);
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
            if(untwistGrip.getprestatus()){//sysj\capperPlant.sysj line: 36, column: 9
              S80=0;
              active[5]=0;
              ends[5]=0;
              tdone[5]=1;
            }
            else {
              bottleClamped.setPresent();//sysj\capperPlant.sysj line: 37, column: 4
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

  public void thread357(int [] tdone, int [] ends){
        switch(S69){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S68){
          case 0 : 
            if(gripCap.getprestatus()){//sysj\capperPlant.sysj line: 28, column: 9
              S68=1;
              if(untwistGrip.getprestatus()){//sysj\capperPlant.sysj line: 29, column: 19
                S69=0;
                active[4]=0;
                ends[4]=0;
                tdone[4]=1;
              }
              else {
                gripCapS.setPresent();//sysj\capperPlant.sysj line: 30, column: 4
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
            if(untwistGrip.getprestatus()){//sysj\capperPlant.sysj line: 29, column: 19
              S69=0;
              active[4]=0;
              ends[4]=0;
              tdone[4]=1;
            }
            else {
              gripCapS.setPresent();//sysj\capperPlant.sysj line: 30, column: 4
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

  public void thread356(int [] tdone, int [] ends){
        switch(S58){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S57){
          case 0 : 
            if(twistGrip.getprestatus()){//sysj\capperPlant.sysj line: 19, column: 10
              S57=1;
              gripperTurned.setPresent();//sysj\capperPlant.sysj line: 23, column: 5
              currsigs.addElement(gripperTurned);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              gripperInit.setPresent();//sysj\capperPlant.sysj line: 20, column: 5
              currsigs.addElement(gripperInit);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if(untwistGrip.getprestatus()){//sysj\capperPlant.sysj line: 22, column: 10
              S58=0;
              active[3]=0;
              ends[3]=0;
              tdone[3]=1;
            }
            else {
              gripperTurned.setPresent();//sysj\capperPlant.sysj line: 23, column: 5
              currsigs.addElement(gripperTurned);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread355(int [] tdone, int [] ends){
        switch(S44){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S43){
          case 0 : 
            if(gripDown.getprestatus()){//sysj\capperPlant.sysj line: 10, column: 20
              S43=1;
              gripperLowered.setPresent();//sysj\capperPlant.sysj line: 14, column: 5
              currsigs.addElement(gripperLowered);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              gripperLifted.setPresent();//sysj\capperPlant.sysj line: 11, column: 5
              currsigs.addElement(gripperLifted);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(untwistGrip.getprestatus()){//sysj\capperPlant.sysj line: 13, column: 10
              S44=0;
              active[2]=0;
              ends[2]=0;
              tdone[2]=1;
            }
            else {
              gripperLowered.setPresent();//sysj\capperPlant.sysj line: 14, column: 5
              currsigs.addElement(gripperLowered);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread352(int [] tdone, int [] ends){
        S128=1;
    if(bottlePos4.getprestatus()){//sysj\capperPlant.sysj line: 52, column: 25
      bottlePos4S.setPresent();//sysj\capperPlant.sysj line: 52, column: 38
      currsigs.addElement(bottlePos4S);
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

  public void thread351(int [] tdone, int [] ends){
        S120=1;
    if(bottleClamped.getprestatus()){//sysj\capperPlant.sysj line: 50, column: 25
      bottleClampedS.setPresent();//sysj\capperPlant.sysj line: 50, column: 41
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

  public void thread350(int [] tdone, int [] ends){
        S112=1;
    if(gripperTurned.getprestatus()){//sysj\capperPlant.sysj line: 48, column: 25
      gripperTurnedS.setPresent();//sysj\capperPlant.sysj line: 48, column: 41
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

  public void thread349(int [] tdone, int [] ends){
        S104=1;
    if(gripperInit.getprestatus()){//sysj\capperPlant.sysj line: 46, column: 25
      gripperInitS.setPresent();//sysj\capperPlant.sysj line: 46, column: 39
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

  public void thread348(int [] tdone, int [] ends){
        S96=1;
    if(gripperLifted.getprestatus()){//sysj\capperPlant.sysj line: 44, column: 25
      gripperLiftedS.setPresent();//sysj\capperPlant.sysj line: 44, column: 41
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

  public void thread347(int [] tdone, int [] ends){
        S88=1;
    S82=0;
    if(gripperLowered.getprestatus()){//sysj\capperPlant.sysj line: 42, column: 25
      gripperLoweredS.setPresent();//sysj\capperPlant.sysj line: 42, column: 42
      currsigs.addElement(gripperLoweredS);
      S82=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S82=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread346(int [] tdone, int [] ends){
        S130=1;
    thread347(tdone,ends);
    thread348(tdone,ends);
    thread349(tdone,ends);
    thread350(tdone,ends);
    thread351(tdone,ends);
    thread352(tdone,ends);
    int biggest353 = 0;
    if(ends[7]>=biggest353){
      biggest353=ends[7];
    }
    if(ends[8]>=biggest353){
      biggest353=ends[8];
    }
    if(ends[9]>=biggest353){
      biggest353=ends[9];
    }
    if(ends[10]>=biggest353){
      biggest353=ends[10];
    }
    if(ends[11]>=biggest353){
      biggest353=ends[11];
    }
    if(ends[12]>=biggest353){
      biggest353=ends[12];
    }
    if(biggest353 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread345(int [] tdone, int [] ends){
        S80=1;
    S79=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread344(int [] tdone, int [] ends){
        S69=1;
    S68=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread343(int [] tdone, int [] ends){
        S58=1;
    S57=0;
    gripperInit.setPresent();//sysj\capperPlant.sysj line: 20, column: 5
    currsigs.addElement(gripperInit);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread342(int [] tdone, int [] ends){
        S44=1;
    S43=0;
    if(gripDown.getprestatus()){//sysj\capperPlant.sysj line: 10, column: 20
      S43=1;
      gripperLowered.setPresent();//sysj\capperPlant.sysj line: 14, column: 5
      currsigs.addElement(gripperLowered);
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      gripperLifted.setPresent();//sysj\capperPlant.sysj line: 11, column: 5
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
      switch(S340){
        case 0 : 
          S340=0;
          break RUN;
        
        case 1 : 
          S340=2;
          S340=2;
          thread342(tdone,ends);
          thread343(tdone,ends);
          thread344(tdone,ends);
          thread345(tdone,ends);
          thread346(tdone,ends);
          int biggest354 = 0;
          if(ends[2]>=biggest354){
            biggest354=ends[2];
          }
          if(ends[3]>=biggest354){
            biggest354=ends[3];
          }
          if(ends[4]>=biggest354){
            biggest354=ends[4];
          }
          if(ends[5]>=biggest354){
            biggest354=ends[5];
          }
          if(ends[6]>=biggest354){
            biggest354=ends[6];
          }
          if(biggest354 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread355(tdone,ends);
          thread356(tdone,ends);
          thread357(tdone,ends);
          thread358(tdone,ends);
          thread359(tdone,ends);
          int biggest367 = 0;
          if(ends[2]>=biggest367){
            biggest367=ends[2];
          }
          if(ends[3]>=biggest367){
            biggest367=ends[3];
          }
          if(ends[4]>=biggest367){
            biggest367=ends[4];
          }
          if(ends[5]>=biggest367){
            biggest367=ends[5];
          }
          if(ends[6]>=biggest367){
            biggest367=ends[6];
          }
          if(biggest367 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest367 == 0){
            thread368(tdone,ends);
            thread369(tdone,ends);
            thread370(tdone,ends);
            thread371(tdone,ends);
            thread372(tdone,ends);
            int biggest380 = 0;
            if(ends[2]>=biggest380){
              biggest380=ends[2];
            }
            if(ends[3]>=biggest380){
              biggest380=ends[3];
            }
            if(ends[4]>=biggest380){
              biggest380=ends[4];
            }
            if(ends[5]>=biggest380){
              biggest380=ends[5];
            }
            if(ends[6]>=biggest380){
              biggest380=ends[6];
            }
            if(biggest380 == 1){
              active[1]=1;
              ends[1]=1;
              break RUN;
            }
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
      bottlePos4.setpreclear();
      gripperLoweredS.setpreclear();
      gripperLiftedS.setpreclear();
      gripperInitS.setpreclear();
      gripperTurnedS.setpreclear();
      gripCapS.setpreclear();
      bottleClampedS.setpreclear();
      bottlePos4S.setpreclear();
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
      bottlePos4.sethook();
      bottlePos4.setClear();
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
      bottlePos4S.sethook();
      bottlePos4S.setClear();
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
