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
  private int S730 = 1;
  private int S127 = 1;
  private int S91 = 1;
  private int S168 = 1;
  private int S140 = 1;
  private int S210 = 1;
  private int S178 = 1;
  private int S242 = 1;
  private int S220 = 1;
  private int S292 = 1;
  private int S250 = 1;
  private int S244 = 1;
  private int S258 = 1;
  private int S266 = 1;
  private int S274 = 1;
  private int S282 = 1;
  private int S290 = 1;
  
  private int[] ends = new int[13];
  private int[] tdone = new int[13];
  
  public void thread768(int [] tdone, int [] ends){
        S290=1;
    if(bottlePos4.getprestatus()){//sysj\capperPlant.sysj line: 61, column: 25
      bottlePos4S.setPresent();//sysj\capperPlant.sysj line: 61, column: 38
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

  public void thread767(int [] tdone, int [] ends){
        S282=1;
    if(bottleClamped.getprestatus()){//sysj\capperPlant.sysj line: 59, column: 25
      bottleClampedS.setPresent();//sysj\capperPlant.sysj line: 59, column: 41
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

  public void thread766(int [] tdone, int [] ends){
        S274=1;
    if(gripperTurned.getprestatus()){//sysj\capperPlant.sysj line: 57, column: 25
      gripperTurnedS.setPresent();//sysj\capperPlant.sysj line: 57, column: 41
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

  public void thread765(int [] tdone, int [] ends){
        S266=1;
    if(gripperInit.getprestatus()){//sysj\capperPlant.sysj line: 55, column: 25
      gripperInitS.setPresent();//sysj\capperPlant.sysj line: 55, column: 39
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

  public void thread764(int [] tdone, int [] ends){
        S258=1;
    if(gripperLifted.getprestatus()){//sysj\capperPlant.sysj line: 53, column: 25
      gripperLiftedS.setPresent();//sysj\capperPlant.sysj line: 53, column: 41
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

  public void thread763(int [] tdone, int [] ends){
        S250=1;
    S244=0;
    if(gripperLowered.getprestatus()){//sysj\capperPlant.sysj line: 51, column: 25
      gripperLoweredS.setPresent();//sysj\capperPlant.sysj line: 51, column: 42
      currsigs.addElement(gripperLoweredS);
      S244=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S244=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread762(int [] tdone, int [] ends){
        S292=1;
    thread763(tdone,ends);
    thread764(tdone,ends);
    thread765(tdone,ends);
    thread766(tdone,ends);
    thread767(tdone,ends);
    thread768(tdone,ends);
    int biggest769 = 0;
    if(ends[7]>=biggest769){
      biggest769=ends[7];
    }
    if(ends[8]>=biggest769){
      biggest769=ends[8];
    }
    if(ends[9]>=biggest769){
      biggest769=ends[9];
    }
    if(ends[10]>=biggest769){
      biggest769=ends[10];
    }
    if(ends[11]>=biggest769){
      biggest769=ends[11];
    }
    if(ends[12]>=biggest769){
      biggest769=ends[12];
    }
    if(biggest769 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread761(int [] tdone, int [] ends){
        S242=1;
    S220=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread760(int [] tdone, int [] ends){
        S210=1;
    S178=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread759(int [] tdone, int [] ends){
        S168=1;
    S140=0;
    gripperInit.setPresent();//sysj\capperPlant.sysj line: 23, column: 5
    currsigs.addElement(gripperInit);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread758(int [] tdone, int [] ends){
        S127=1;
    S91=0;
    if(gripDown.getprestatus()){//sysj\capperPlant.sysj line: 11, column: 20
      S91=1;
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

  public void thread755(int [] tdone, int [] ends){
        switch(S290){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(bottlePos4.getprestatus()){//sysj\capperPlant.sysj line: 61, column: 25
          bottlePos4S.setPresent();//sysj\capperPlant.sysj line: 61, column: 38
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

  public void thread754(int [] tdone, int [] ends){
        switch(S282){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(bottleClamped.getprestatus()){//sysj\capperPlant.sysj line: 59, column: 25
          bottleClampedS.setPresent();//sysj\capperPlant.sysj line: 59, column: 41
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

  public void thread753(int [] tdone, int [] ends){
        switch(S274){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(gripperTurned.getprestatus()){//sysj\capperPlant.sysj line: 57, column: 25
          gripperTurnedS.setPresent();//sysj\capperPlant.sysj line: 57, column: 41
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

  public void thread752(int [] tdone, int [] ends){
        switch(S266){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(gripperInit.getprestatus()){//sysj\capperPlant.sysj line: 55, column: 25
          gripperInitS.setPresent();//sysj\capperPlant.sysj line: 55, column: 39
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

  public void thread751(int [] tdone, int [] ends){
        switch(S258){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(gripperLifted.getprestatus()){//sysj\capperPlant.sysj line: 53, column: 25
          gripperLiftedS.setPresent();//sysj\capperPlant.sysj line: 53, column: 41
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

  public void thread750(int [] tdone, int [] ends){
        switch(S250){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S244){
          case 0 : 
            S244=0;
            if(gripperLowered.getprestatus()){//sysj\capperPlant.sysj line: 51, column: 25
              gripperLoweredS.setPresent();//sysj\capperPlant.sysj line: 51, column: 42
              currsigs.addElement(gripperLoweredS);
              S244=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S244=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            S244=1;
            S244=0;
            if(gripperLowered.getprestatus()){//sysj\capperPlant.sysj line: 51, column: 25
              gripperLoweredS.setPresent();//sysj\capperPlant.sysj line: 51, column: 42
              currsigs.addElement(gripperLoweredS);
              S244=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S244=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread749(int [] tdone, int [] ends){
        switch(S292){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        thread750(tdone,ends);
        thread751(tdone,ends);
        thread752(tdone,ends);
        thread753(tdone,ends);
        thread754(tdone,ends);
        thread755(tdone,ends);
        int biggest756 = 0;
        if(ends[7]>=biggest756){
          biggest756=ends[7];
        }
        if(ends[8]>=biggest756){
          biggest756=ends[8];
        }
        if(ends[9]>=biggest756){
          biggest756=ends[9];
        }
        if(ends[10]>=biggest756){
          biggest756=ends[10];
        }
        if(ends[11]>=biggest756){
          biggest756=ends[11];
        }
        if(ends[12]>=biggest756){
          biggest756=ends[12];
        }
        if(biggest756 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        //FINXME code
        if(biggest756 == 0){
          S292=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread748(int [] tdone, int [] ends){
        switch(S242){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S220){
          case 0 : 
            if(clampBottle.getprestatus()){//sysj\capperPlant.sysj line: 43, column: 10
              S220=1;
              bottleClamped.setPresent();//sysj\capperPlant.sysj line: 45, column: 5
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
            if(untwistGrip.getprestatus()){//sysj\capperPlant.sysj line: 44, column: 10
              S220=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              bottleClamped.setPresent();//sysj\capperPlant.sysj line: 45, column: 5
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

  public void thread747(int [] tdone, int [] ends){
        switch(S210){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S178){
          case 0 : 
            if(gripCap.getprestatus()){//sysj\capperPlant.sysj line: 34, column: 10
              S178=1;
              if(untwistGrip.getprestatus()){//sysj\capperPlant.sysj line: 35, column: 20
                S178=0;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                gripCapS.setPresent();//sysj\capperPlant.sysj line: 36, column: 5
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
            if(untwistGrip.getprestatus()){//sysj\capperPlant.sysj line: 35, column: 20
              S178=0;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              gripCapS.setPresent();//sysj\capperPlant.sysj line: 36, column: 5
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

  public void thread746(int [] tdone, int [] ends){
        switch(S168){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S140){
          case 0 : 
            if(twistGrip.getprestatus()){//sysj\capperPlant.sysj line: 22, column: 10
              S140=1;
              gripperTurned.setPresent();//sysj\capperPlant.sysj line: 26, column: 5
              currsigs.addElement(gripperTurned);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              gripperInit.setPresent();//sysj\capperPlant.sysj line: 23, column: 5
              currsigs.addElement(gripperInit);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if(untwistGrip.getprestatus()){//sysj\capperPlant.sysj line: 25, column: 10
              S140=0;
              gripperInit.setPresent();//sysj\capperPlant.sysj line: 23, column: 5
              currsigs.addElement(gripperInit);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              gripperTurned.setPresent();//sysj\capperPlant.sysj line: 26, column: 5
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

  public void thread745(int [] tdone, int [] ends){
        switch(S127){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S91){
          case 0 : 
            if(gripDown.getprestatus()){//sysj\capperPlant.sysj line: 11, column: 20
              S91=1;
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
              S91=0;
              if(gripDown.getprestatus()){//sysj\capperPlant.sysj line: 11, column: 20
                S91=1;
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
            else {
              gripperLowered.setPresent();//sysj\capperPlant.sysj line: 15, column: 5
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

  public void thread742(int [] tdone, int [] ends){
        S290=1;
    if(bottlePos4.getprestatus()){//sysj\capperPlant.sysj line: 61, column: 25
      bottlePos4S.setPresent();//sysj\capperPlant.sysj line: 61, column: 38
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

  public void thread741(int [] tdone, int [] ends){
        S282=1;
    if(bottleClamped.getprestatus()){//sysj\capperPlant.sysj line: 59, column: 25
      bottleClampedS.setPresent();//sysj\capperPlant.sysj line: 59, column: 41
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

  public void thread740(int [] tdone, int [] ends){
        S274=1;
    if(gripperTurned.getprestatus()){//sysj\capperPlant.sysj line: 57, column: 25
      gripperTurnedS.setPresent();//sysj\capperPlant.sysj line: 57, column: 41
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

  public void thread739(int [] tdone, int [] ends){
        S266=1;
    if(gripperInit.getprestatus()){//sysj\capperPlant.sysj line: 55, column: 25
      gripperInitS.setPresent();//sysj\capperPlant.sysj line: 55, column: 39
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

  public void thread738(int [] tdone, int [] ends){
        S258=1;
    if(gripperLifted.getprestatus()){//sysj\capperPlant.sysj line: 53, column: 25
      gripperLiftedS.setPresent();//sysj\capperPlant.sysj line: 53, column: 41
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

  public void thread737(int [] tdone, int [] ends){
        S250=1;
    S244=0;
    if(gripperLowered.getprestatus()){//sysj\capperPlant.sysj line: 51, column: 25
      gripperLoweredS.setPresent();//sysj\capperPlant.sysj line: 51, column: 42
      currsigs.addElement(gripperLoweredS);
      S244=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S244=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread736(int [] tdone, int [] ends){
        S292=1;
    thread737(tdone,ends);
    thread738(tdone,ends);
    thread739(tdone,ends);
    thread740(tdone,ends);
    thread741(tdone,ends);
    thread742(tdone,ends);
    int biggest743 = 0;
    if(ends[7]>=biggest743){
      biggest743=ends[7];
    }
    if(ends[8]>=biggest743){
      biggest743=ends[8];
    }
    if(ends[9]>=biggest743){
      biggest743=ends[9];
    }
    if(ends[10]>=biggest743){
      biggest743=ends[10];
    }
    if(ends[11]>=biggest743){
      biggest743=ends[11];
    }
    if(ends[12]>=biggest743){
      biggest743=ends[12];
    }
    if(biggest743 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread735(int [] tdone, int [] ends){
        S242=1;
    S220=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread734(int [] tdone, int [] ends){
        S210=1;
    S178=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread733(int [] tdone, int [] ends){
        S168=1;
    S140=0;
    gripperInit.setPresent();//sysj\capperPlant.sysj line: 23, column: 5
    currsigs.addElement(gripperInit);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread732(int [] tdone, int [] ends){
        S127=1;
    S91=0;
    if(gripDown.getprestatus()){//sysj\capperPlant.sysj line: 11, column: 20
      S91=1;
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
      switch(S730){
        case 0 : 
          S730=0;
          break RUN;
        
        case 1 : 
          S730=2;
          S730=2;
          thread732(tdone,ends);
          thread733(tdone,ends);
          thread734(tdone,ends);
          thread735(tdone,ends);
          thread736(tdone,ends);
          int biggest744 = 0;
          if(ends[2]>=biggest744){
            biggest744=ends[2];
          }
          if(ends[3]>=biggest744){
            biggest744=ends[3];
          }
          if(ends[4]>=biggest744){
            biggest744=ends[4];
          }
          if(ends[5]>=biggest744){
            biggest744=ends[5];
          }
          if(ends[6]>=biggest744){
            biggest744=ends[6];
          }
          if(biggest744 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread745(tdone,ends);
          thread746(tdone,ends);
          thread747(tdone,ends);
          thread748(tdone,ends);
          thread749(tdone,ends);
          int biggest757 = 0;
          if(ends[2]>=biggest757){
            biggest757=ends[2];
          }
          if(ends[3]>=biggest757){
            biggest757=ends[3];
          }
          if(ends[4]>=biggest757){
            biggest757=ends[4];
          }
          if(ends[5]>=biggest757){
            biggest757=ends[5];
          }
          if(ends[6]>=biggest757){
            biggest757=ends[6];
          }
          if(biggest757 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest757 == 0){
            thread758(tdone,ends);
            thread759(tdone,ends);
            thread760(tdone,ends);
            thread761(tdone,ends);
            thread762(tdone,ends);
            int biggest770 = 0;
            if(ends[2]>=biggest770){
              biggest770=ends[2];
            }
            if(ends[3]>=biggest770){
              biggest770=ends[3];
            }
            if(ends[4]>=biggest770){
              biggest770=ends[4];
            }
            if(ends[5]>=biggest770){
              biggest770=ends[5];
            }
            if(ends[6]>=biggest770){
              biggest770=ends[6];
            }
            if(biggest770 == 1){
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
