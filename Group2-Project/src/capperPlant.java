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
  private int S700 = 1;
  private int S121 = 1;
  private int S85 = 1;
  private int S162 = 1;
  private int S134 = 1;
  private int S204 = 1;
  private int S172 = 1;
  private int S236 = 1;
  private int S214 = 1;
  private int S278 = 1;
  private int S244 = 1;
  private int S238 = 1;
  private int S252 = 1;
  private int S260 = 1;
  private int S268 = 1;
  private int S276 = 1;
  
  private int[] ends = new int[12];
  private int[] tdone = new int[12];
  
  public void thread735(int [] tdone, int [] ends){
        S276=1;
    if(bottleClamped.getprestatus()){//sysj\capperPlant.sysj line: 58, column: 25
      bottleClampedS.setPresent();//sysj\capperPlant.sysj line: 58, column: 41
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

  public void thread734(int [] tdone, int [] ends){
        S268=1;
    if(gripperTurned.getprestatus()){//sysj\capperPlant.sysj line: 56, column: 25
      gripperTurnedS.setPresent();//sysj\capperPlant.sysj line: 56, column: 41
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

  public void thread733(int [] tdone, int [] ends){
        S260=1;
    if(gripperInit.getprestatus()){//sysj\capperPlant.sysj line: 54, column: 25
      gripperInitS.setPresent();//sysj\capperPlant.sysj line: 54, column: 39
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

  public void thread732(int [] tdone, int [] ends){
        S252=1;
    if(gripperLifted.getprestatus()){//sysj\capperPlant.sysj line: 52, column: 25
      gripperLiftedS.setPresent();//sysj\capperPlant.sysj line: 52, column: 41
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

  public void thread731(int [] tdone, int [] ends){
        S244=1;
    S238=0;
    if(gripperLowered.getprestatus()){//sysj\capperPlant.sysj line: 50, column: 25
      gripperLoweredS.setPresent();//sysj\capperPlant.sysj line: 50, column: 42
      currsigs.addElement(gripperLoweredS);
      S238=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S238=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread730(int [] tdone, int [] ends){
        S278=1;
    thread731(tdone,ends);
    thread732(tdone,ends);
    thread733(tdone,ends);
    thread734(tdone,ends);
    thread735(tdone,ends);
    int biggest736 = 0;
    if(ends[7]>=biggest736){
      biggest736=ends[7];
    }
    if(ends[8]>=biggest736){
      biggest736=ends[8];
    }
    if(ends[9]>=biggest736){
      biggest736=ends[9];
    }
    if(ends[10]>=biggest736){
      biggest736=ends[10];
    }
    if(ends[11]>=biggest736){
      biggest736=ends[11];
    }
    if(biggest736 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread729(int [] tdone, int [] ends){
        S236=1;
    S214=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread728(int [] tdone, int [] ends){
        S204=1;
    S172=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread727(int [] tdone, int [] ends){
        S162=1;
    S134=0;
    gripperInit.setPresent();//sysj\capperPlant.sysj line: 23, column: 5
    currsigs.addElement(gripperInit);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread726(int [] tdone, int [] ends){
        S121=1;
    S85=0;
    if(gripDown.getprestatus()){//sysj\capperPlant.sysj line: 11, column: 20
      S85=1;
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

  public void thread723(int [] tdone, int [] ends){
        switch(S276){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(bottleClamped.getprestatus()){//sysj\capperPlant.sysj line: 58, column: 25
          bottleClampedS.setPresent();//sysj\capperPlant.sysj line: 58, column: 41
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

  public void thread722(int [] tdone, int [] ends){
        switch(S268){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(gripperTurned.getprestatus()){//sysj\capperPlant.sysj line: 56, column: 25
          gripperTurnedS.setPresent();//sysj\capperPlant.sysj line: 56, column: 41
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

  public void thread721(int [] tdone, int [] ends){
        switch(S260){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(gripperInit.getprestatus()){//sysj\capperPlant.sysj line: 54, column: 25
          gripperInitS.setPresent();//sysj\capperPlant.sysj line: 54, column: 39
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

  public void thread720(int [] tdone, int [] ends){
        switch(S252){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(gripperLifted.getprestatus()){//sysj\capperPlant.sysj line: 52, column: 25
          gripperLiftedS.setPresent();//sysj\capperPlant.sysj line: 52, column: 41
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

  public void thread719(int [] tdone, int [] ends){
        switch(S244){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S238){
          case 0 : 
            S238=0;
            if(gripperLowered.getprestatus()){//sysj\capperPlant.sysj line: 50, column: 25
              gripperLoweredS.setPresent();//sysj\capperPlant.sysj line: 50, column: 42
              currsigs.addElement(gripperLoweredS);
              S238=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S238=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            S238=1;
            S238=0;
            if(gripperLowered.getprestatus()){//sysj\capperPlant.sysj line: 50, column: 25
              gripperLoweredS.setPresent();//sysj\capperPlant.sysj line: 50, column: 42
              currsigs.addElement(gripperLoweredS);
              S238=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S238=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread718(int [] tdone, int [] ends){
        switch(S278){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        thread719(tdone,ends);
        thread720(tdone,ends);
        thread721(tdone,ends);
        thread722(tdone,ends);
        thread723(tdone,ends);
        int biggest724 = 0;
        if(ends[7]>=biggest724){
          biggest724=ends[7];
        }
        if(ends[8]>=biggest724){
          biggest724=ends[8];
        }
        if(ends[9]>=biggest724){
          biggest724=ends[9];
        }
        if(ends[10]>=biggest724){
          biggest724=ends[10];
        }
        if(ends[11]>=biggest724){
          biggest724=ends[11];
        }
        if(biggest724 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        //FINXME code
        if(biggest724 == 0){
          S278=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread717(int [] tdone, int [] ends){
        switch(S236){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S214){
          case 0 : 
            if(clampBottle.getprestatus()){//sysj\capperPlant.sysj line: 42, column: 10
              S214=1;
              bottleClamped.setPresent();//sysj\capperPlant.sysj line: 44, column: 5
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
            if(untwistGrip.getprestatus()){//sysj\capperPlant.sysj line: 43, column: 10
              S214=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              bottleClamped.setPresent();//sysj\capperPlant.sysj line: 44, column: 5
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

  public void thread716(int [] tdone, int [] ends){
        switch(S204){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S172){
          case 0 : 
            if(gripCap.getprestatus()){//sysj\capperPlant.sysj line: 33, column: 10
              S172=1;
              if(untwistGrip.getprestatus()){//sysj\capperPlant.sysj line: 34, column: 20
                S172=0;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                gripCapS.setPresent();//sysj\capperPlant.sysj line: 35, column: 5
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
            if(untwistGrip.getprestatus()){//sysj\capperPlant.sysj line: 34, column: 20
              S172=0;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              gripCapS.setPresent();//sysj\capperPlant.sysj line: 35, column: 5
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

  public void thread715(int [] tdone, int [] ends){
        switch(S162){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S134){
          case 0 : 
            if(twistGrip.getprestatus()){//sysj\capperPlant.sysj line: 22, column: 10
              S134=1;
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
              S134=0;
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

  public void thread714(int [] tdone, int [] ends){
        switch(S121){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S85){
          case 0 : 
            if(gripDown.getprestatus()){//sysj\capperPlant.sysj line: 11, column: 20
              S85=1;
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
              S85=0;
              if(gripDown.getprestatus()){//sysj\capperPlant.sysj line: 11, column: 20
                S85=1;
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

  public void thread711(int [] tdone, int [] ends){
        S276=1;
    if(bottleClamped.getprestatus()){//sysj\capperPlant.sysj line: 58, column: 25
      bottleClampedS.setPresent();//sysj\capperPlant.sysj line: 58, column: 41
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

  public void thread710(int [] tdone, int [] ends){
        S268=1;
    if(gripperTurned.getprestatus()){//sysj\capperPlant.sysj line: 56, column: 25
      gripperTurnedS.setPresent();//sysj\capperPlant.sysj line: 56, column: 41
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

  public void thread709(int [] tdone, int [] ends){
        S260=1;
    if(gripperInit.getprestatus()){//sysj\capperPlant.sysj line: 54, column: 25
      gripperInitS.setPresent();//sysj\capperPlant.sysj line: 54, column: 39
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

  public void thread708(int [] tdone, int [] ends){
        S252=1;
    if(gripperLifted.getprestatus()){//sysj\capperPlant.sysj line: 52, column: 25
      gripperLiftedS.setPresent();//sysj\capperPlant.sysj line: 52, column: 41
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

  public void thread707(int [] tdone, int [] ends){
        S244=1;
    S238=0;
    if(gripperLowered.getprestatus()){//sysj\capperPlant.sysj line: 50, column: 25
      gripperLoweredS.setPresent();//sysj\capperPlant.sysj line: 50, column: 42
      currsigs.addElement(gripperLoweredS);
      S238=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S238=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread706(int [] tdone, int [] ends){
        S278=1;
    thread707(tdone,ends);
    thread708(tdone,ends);
    thread709(tdone,ends);
    thread710(tdone,ends);
    thread711(tdone,ends);
    int biggest712 = 0;
    if(ends[7]>=biggest712){
      biggest712=ends[7];
    }
    if(ends[8]>=biggest712){
      biggest712=ends[8];
    }
    if(ends[9]>=biggest712){
      biggest712=ends[9];
    }
    if(ends[10]>=biggest712){
      biggest712=ends[10];
    }
    if(ends[11]>=biggest712){
      biggest712=ends[11];
    }
    if(biggest712 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread705(int [] tdone, int [] ends){
        S236=1;
    S214=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread704(int [] tdone, int [] ends){
        S204=1;
    S172=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread703(int [] tdone, int [] ends){
        S162=1;
    S134=0;
    gripperInit.setPresent();//sysj\capperPlant.sysj line: 23, column: 5
    currsigs.addElement(gripperInit);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread702(int [] tdone, int [] ends){
        S121=1;
    S85=0;
    if(gripDown.getprestatus()){//sysj\capperPlant.sysj line: 11, column: 20
      S85=1;
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
      switch(S700){
        case 0 : 
          S700=0;
          break RUN;
        
        case 1 : 
          S700=2;
          S700=2;
          thread702(tdone,ends);
          thread703(tdone,ends);
          thread704(tdone,ends);
          thread705(tdone,ends);
          thread706(tdone,ends);
          int biggest713 = 0;
          if(ends[2]>=biggest713){
            biggest713=ends[2];
          }
          if(ends[3]>=biggest713){
            biggest713=ends[3];
          }
          if(ends[4]>=biggest713){
            biggest713=ends[4];
          }
          if(ends[5]>=biggest713){
            biggest713=ends[5];
          }
          if(ends[6]>=biggest713){
            biggest713=ends[6];
          }
          if(biggest713 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread714(tdone,ends);
          thread715(tdone,ends);
          thread716(tdone,ends);
          thread717(tdone,ends);
          thread718(tdone,ends);
          int biggest725 = 0;
          if(ends[2]>=biggest725){
            biggest725=ends[2];
          }
          if(ends[3]>=biggest725){
            biggest725=ends[3];
          }
          if(ends[4]>=biggest725){
            biggest725=ends[4];
          }
          if(ends[5]>=biggest725){
            biggest725=ends[5];
          }
          if(ends[6]>=biggest725){
            biggest725=ends[6];
          }
          if(biggest725 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest725 == 0){
            thread726(tdone,ends);
            thread727(tdone,ends);
            thread728(tdone,ends);
            thread729(tdone,ends);
            thread730(tdone,ends);
            int biggest737 = 0;
            if(ends[2]>=biggest737){
              biggest737=ends[2];
            }
            if(ends[3]>=biggest737){
              biggest737=ends[3];
            }
            if(ends[4]>=biggest737){
              biggest737=ends[4];
            }
            if(ends[5]>=biggest737){
              biggest737=ends[5];
            }
            if(ends[6]>=biggest737){
              biggest737=ends[6];
            }
            if(biggest737 == 1){
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
