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
  private int S919 = 1;
  private int S274 = 1;
  private int S238 = 1;
  private int S327 = 1;
  private int S291 = 1;
  private int S369 = 1;
  private int S337 = 1;
  private int S411 = 1;
  private int S379 = 1;
  private int S453 = 1;
  private int S419 = 1;
  private int S413 = 1;
  private int S427 = 1;
  private int S435 = 1;
  private int S443 = 1;
  private int S451 = 1;
  
  private int[] ends = new int[12];
  private int[] tdone = new int[12];
  
  public void thread954(int [] tdone, int [] ends){
        S451=1;
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

  public void thread953(int [] tdone, int [] ends){
        S443=1;
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

  public void thread952(int [] tdone, int [] ends){
        S435=1;
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

  public void thread951(int [] tdone, int [] ends){
        S427=1;
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

  public void thread950(int [] tdone, int [] ends){
        S419=1;
    S413=0;
    if(gripperLowered.getprestatus()){//sysj\capperPlant.sysj line: 52, column: 25
      gripperLoweredS.setPresent();//sysj\capperPlant.sysj line: 52, column: 42
      currsigs.addElement(gripperLoweredS);
      S413=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S413=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread949(int [] tdone, int [] ends){
        S453=1;
    thread950(tdone,ends);
    thread951(tdone,ends);
    thread952(tdone,ends);
    thread953(tdone,ends);
    thread954(tdone,ends);
    int biggest955 = 0;
    if(ends[7]>=biggest955){
      biggest955=ends[7];
    }
    if(ends[8]>=biggest955){
      biggest955=ends[8];
    }
    if(ends[9]>=biggest955){
      biggest955=ends[9];
    }
    if(ends[10]>=biggest955){
      biggest955=ends[10];
    }
    if(ends[11]>=biggest955){
      biggest955=ends[11];
    }
    if(biggest955 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread948(int [] tdone, int [] ends){
        S411=1;
    S379=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread947(int [] tdone, int [] ends){
        S369=1;
    S337=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread946(int [] tdone, int [] ends){
        S327=1;
    S291=0;
    if(twistGrip.getprestatus()){//sysj\capperPlant.sysj line: 23, column: 20
      S291=1;
      if(untwistGrip.getprestatus()){//sysj\capperPlant.sysj line: 26, column: 20
        S291=2;
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

  public void thread945(int [] tdone, int [] ends){
        S274=1;
    S238=0;
    if(gripDown.getprestatus()){//sysj\capperPlant.sysj line: 11, column: 20
      S238=1;
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

  public void thread942(int [] tdone, int [] ends){
        switch(S451){
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

  public void thread941(int [] tdone, int [] ends){
        switch(S443){
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

  public void thread940(int [] tdone, int [] ends){
        switch(S435){
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

  public void thread939(int [] tdone, int [] ends){
        switch(S427){
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

  public void thread938(int [] tdone, int [] ends){
        switch(S419){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S413){
          case 0 : 
            S413=0;
            if(gripperLowered.getprestatus()){//sysj\capperPlant.sysj line: 52, column: 25
              gripperLoweredS.setPresent();//sysj\capperPlant.sysj line: 52, column: 42
              currsigs.addElement(gripperLoweredS);
              S413=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S413=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            S413=1;
            S413=0;
            if(gripperLowered.getprestatus()){//sysj\capperPlant.sysj line: 52, column: 25
              gripperLoweredS.setPresent();//sysj\capperPlant.sysj line: 52, column: 42
              currsigs.addElement(gripperLoweredS);
              S413=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S413=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread937(int [] tdone, int [] ends){
        switch(S453){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        thread938(tdone,ends);
        thread939(tdone,ends);
        thread940(tdone,ends);
        thread941(tdone,ends);
        thread942(tdone,ends);
        int biggest943 = 0;
        if(ends[7]>=biggest943){
          biggest943=ends[7];
        }
        if(ends[8]>=biggest943){
          biggest943=ends[8];
        }
        if(ends[9]>=biggest943){
          biggest943=ends[9];
        }
        if(ends[10]>=biggest943){
          biggest943=ends[10];
        }
        if(ends[11]>=biggest943){
          biggest943=ends[11];
        }
        if(biggest943 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        //FINXME code
        if(biggest943 == 0){
          S453=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread936(int [] tdone, int [] ends){
        switch(S411){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S379){
          case 0 : 
            if(clampBottle.getprestatus()){//sysj\capperPlant.sysj line: 44, column: 10
              S379=1;
              if(untwistGrip.getprestatus()){//sysj\capperPlant.sysj line: 45, column: 20
                S379=0;
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
              S379=0;
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

  public void thread935(int [] tdone, int [] ends){
        switch(S369){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S337){
          case 0 : 
            if(gripCap.getprestatus()){//sysj\capperPlant.sysj line: 35, column: 10
              S337=1;
              if(untwistGrip.getprestatus()){//sysj\capperPlant.sysj line: 36, column: 20
                S337=0;
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
              S337=0;
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

  public void thread934(int [] tdone, int [] ends){
        switch(S327){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S291){
          case 0 : 
            if(twistGrip.getprestatus()){//sysj\capperPlant.sysj line: 23, column: 20
              S291=1;
              if(untwistGrip.getprestatus()){//sysj\capperPlant.sysj line: 26, column: 20
                S291=2;
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
              S291=2;
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
            S291=2;
            S291=0;
            if(twistGrip.getprestatus()){//sysj\capperPlant.sysj line: 23, column: 20
              S291=1;
              if(untwistGrip.getprestatus()){//sysj\capperPlant.sysj line: 26, column: 20
                S291=2;
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

  public void thread933(int [] tdone, int [] ends){
        switch(S274){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S238){
          case 0 : 
            if(gripDown.getprestatus()){//sysj\capperPlant.sysj line: 11, column: 20
              S238=1;
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
              S238=2;
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
            S238=2;
            S238=0;
            if(gripDown.getprestatus()){//sysj\capperPlant.sysj line: 11, column: 20
              S238=1;
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

  public void thread930(int [] tdone, int [] ends){
        S451=1;
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

  public void thread929(int [] tdone, int [] ends){
        S443=1;
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

  public void thread928(int [] tdone, int [] ends){
        S435=1;
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

  public void thread927(int [] tdone, int [] ends){
        S427=1;
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

  public void thread926(int [] tdone, int [] ends){
        S419=1;
    S413=0;
    if(gripperLowered.getprestatus()){//sysj\capperPlant.sysj line: 52, column: 25
      gripperLoweredS.setPresent();//sysj\capperPlant.sysj line: 52, column: 42
      currsigs.addElement(gripperLoweredS);
      S413=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S413=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread925(int [] tdone, int [] ends){
        S453=1;
    thread926(tdone,ends);
    thread927(tdone,ends);
    thread928(tdone,ends);
    thread929(tdone,ends);
    thread930(tdone,ends);
    int biggest931 = 0;
    if(ends[7]>=biggest931){
      biggest931=ends[7];
    }
    if(ends[8]>=biggest931){
      biggest931=ends[8];
    }
    if(ends[9]>=biggest931){
      biggest931=ends[9];
    }
    if(ends[10]>=biggest931){
      biggest931=ends[10];
    }
    if(ends[11]>=biggest931){
      biggest931=ends[11];
    }
    if(biggest931 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread924(int [] tdone, int [] ends){
        S411=1;
    S379=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread923(int [] tdone, int [] ends){
        S369=1;
    S337=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread922(int [] tdone, int [] ends){
        S327=1;
    S291=0;
    if(twistGrip.getprestatus()){//sysj\capperPlant.sysj line: 23, column: 20
      S291=1;
      if(untwistGrip.getprestatus()){//sysj\capperPlant.sysj line: 26, column: 20
        S291=2;
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

  public void thread921(int [] tdone, int [] ends){
        S274=1;
    S238=0;
    if(gripDown.getprestatus()){//sysj\capperPlant.sysj line: 11, column: 20
      S238=1;
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
      switch(S919){
        case 0 : 
          S919=0;
          break RUN;
        
        case 1 : 
          S919=2;
          S919=2;
          thread921(tdone,ends);
          thread922(tdone,ends);
          thread923(tdone,ends);
          thread924(tdone,ends);
          thread925(tdone,ends);
          int biggest932 = 0;
          if(ends[2]>=biggest932){
            biggest932=ends[2];
          }
          if(ends[3]>=biggest932){
            biggest932=ends[3];
          }
          if(ends[4]>=biggest932){
            biggest932=ends[4];
          }
          if(ends[5]>=biggest932){
            biggest932=ends[5];
          }
          if(ends[6]>=biggest932){
            biggest932=ends[6];
          }
          if(biggest932 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread933(tdone,ends);
          thread934(tdone,ends);
          thread935(tdone,ends);
          thread936(tdone,ends);
          thread937(tdone,ends);
          int biggest944 = 0;
          if(ends[2]>=biggest944){
            biggest944=ends[2];
          }
          if(ends[3]>=biggest944){
            biggest944=ends[3];
          }
          if(ends[4]>=biggest944){
            biggest944=ends[4];
          }
          if(ends[5]>=biggest944){
            biggest944=ends[5];
          }
          if(ends[6]>=biggest944){
            biggest944=ends[6];
          }
          if(biggest944 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest944 == 0){
            thread945(tdone,ends);
            thread946(tdone,ends);
            thread947(tdone,ends);
            thread948(tdone,ends);
            thread949(tdone,ends);
            int biggest956 = 0;
            if(ends[2]>=biggest956){
              biggest956=ends[2];
            }
            if(ends[3]>=biggest956){
              biggest956=ends[3];
            }
            if(ends[4]>=biggest956){
              biggest956=ends[4];
            }
            if(ends[5]>=biggest956){
              biggest956=ends[5];
            }
            if(ends[6]>=biggest956){
              biggest956=ends[6];
            }
            if(biggest956 == 1){
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
