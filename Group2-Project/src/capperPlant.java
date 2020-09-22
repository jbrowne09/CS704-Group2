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
  private int S718 = 1;
  private int S139 = 1;
  private int S103 = 1;
  private int S180 = 1;
  private int S152 = 1;
  private int S222 = 1;
  private int S190 = 1;
  private int S254 = 1;
  private int S232 = 1;
  private int S296 = 1;
  private int S262 = 1;
  private int S256 = 1;
  private int S270 = 1;
  private int S278 = 1;
  private int S286 = 1;
  private int S294 = 1;
  
  private int[] ends = new int[12];
  private int[] tdone = new int[12];
  
  public void thread753(int [] tdone, int [] ends){
        S294=1;
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

  public void thread752(int [] tdone, int [] ends){
        S286=1;
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

  public void thread751(int [] tdone, int [] ends){
        S278=1;
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

  public void thread750(int [] tdone, int [] ends){
        S270=1;
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

  public void thread749(int [] tdone, int [] ends){
        S262=1;
    S256=0;
    if(gripperLowered.getprestatus()){//sysj\capperPlant.sysj line: 50, column: 25
      gripperLoweredS.setPresent();//sysj\capperPlant.sysj line: 50, column: 42
      currsigs.addElement(gripperLoweredS);
      S256=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S256=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread748(int [] tdone, int [] ends){
        S296=1;
    thread749(tdone,ends);
    thread750(tdone,ends);
    thread751(tdone,ends);
    thread752(tdone,ends);
    thread753(tdone,ends);
    int biggest754 = 0;
    if(ends[7]>=biggest754){
      biggest754=ends[7];
    }
    if(ends[8]>=biggest754){
      biggest754=ends[8];
    }
    if(ends[9]>=biggest754){
      biggest754=ends[9];
    }
    if(ends[10]>=biggest754){
      biggest754=ends[10];
    }
    if(ends[11]>=biggest754){
      biggest754=ends[11];
    }
    if(biggest754 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread747(int [] tdone, int [] ends){
        S254=1;
    S232=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread746(int [] tdone, int [] ends){
        S222=1;
    S190=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread745(int [] tdone, int [] ends){
        S180=1;
    S152=0;
    gripperInit.setPresent();//sysj\capperPlant.sysj line: 23, column: 5
    currsigs.addElement(gripperInit);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread744(int [] tdone, int [] ends){
        S139=1;
    S103=0;
    if(gripDown.getprestatus()){//sysj\capperPlant.sysj line: 11, column: 20
      S103=1;
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

  public void thread741(int [] tdone, int [] ends){
        switch(S294){
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

  public void thread740(int [] tdone, int [] ends){
        switch(S286){
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

  public void thread739(int [] tdone, int [] ends){
        switch(S278){
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

  public void thread738(int [] tdone, int [] ends){
        switch(S270){
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

  public void thread737(int [] tdone, int [] ends){
        switch(S262){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S256){
          case 0 : 
            S256=0;
            if(gripperLowered.getprestatus()){//sysj\capperPlant.sysj line: 50, column: 25
              gripperLoweredS.setPresent();//sysj\capperPlant.sysj line: 50, column: 42
              currsigs.addElement(gripperLoweredS);
              S256=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S256=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            S256=1;
            S256=0;
            if(gripperLowered.getprestatus()){//sysj\capperPlant.sysj line: 50, column: 25
              gripperLoweredS.setPresent();//sysj\capperPlant.sysj line: 50, column: 42
              currsigs.addElement(gripperLoweredS);
              S256=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S256=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread736(int [] tdone, int [] ends){
        switch(S296){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        thread737(tdone,ends);
        thread738(tdone,ends);
        thread739(tdone,ends);
        thread740(tdone,ends);
        thread741(tdone,ends);
        int biggest742 = 0;
        if(ends[7]>=biggest742){
          biggest742=ends[7];
        }
        if(ends[8]>=biggest742){
          biggest742=ends[8];
        }
        if(ends[9]>=biggest742){
          biggest742=ends[9];
        }
        if(ends[10]>=biggest742){
          biggest742=ends[10];
        }
        if(ends[11]>=biggest742){
          biggest742=ends[11];
        }
        if(biggest742 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        //FINXME code
        if(biggest742 == 0){
          S296=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread735(int [] tdone, int [] ends){
        switch(S254){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S232){
          case 0 : 
            if(clampBottle.getprestatus()){//sysj\capperPlant.sysj line: 42, column: 10
              S232=1;
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
              S232=0;
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

  public void thread734(int [] tdone, int [] ends){
        switch(S222){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S190){
          case 0 : 
            if(gripCap.getprestatus()){//sysj\capperPlant.sysj line: 33, column: 10
              S190=1;
              if(untwistGrip.getprestatus()){//sysj\capperPlant.sysj line: 34, column: 20
                S190=0;
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
              S190=0;
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

  public void thread733(int [] tdone, int [] ends){
        switch(S180){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S152){
          case 0 : 
            if(twistGrip.getprestatus()){//sysj\capperPlant.sysj line: 22, column: 10
              S152=1;
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
              S152=0;
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

  public void thread732(int [] tdone, int [] ends){
        switch(S139){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S103){
          case 0 : 
            if(gripDown.getprestatus()){//sysj\capperPlant.sysj line: 11, column: 20
              S103=1;
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
              S103=0;
              if(gripDown.getprestatus()){//sysj\capperPlant.sysj line: 11, column: 20
                S103=1;
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

  public void thread729(int [] tdone, int [] ends){
        S294=1;
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

  public void thread728(int [] tdone, int [] ends){
        S286=1;
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

  public void thread727(int [] tdone, int [] ends){
        S278=1;
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

  public void thread726(int [] tdone, int [] ends){
        S270=1;
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

  public void thread725(int [] tdone, int [] ends){
        S262=1;
    S256=0;
    if(gripperLowered.getprestatus()){//sysj\capperPlant.sysj line: 50, column: 25
      gripperLoweredS.setPresent();//sysj\capperPlant.sysj line: 50, column: 42
      currsigs.addElement(gripperLoweredS);
      S256=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S256=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread724(int [] tdone, int [] ends){
        S296=1;
    thread725(tdone,ends);
    thread726(tdone,ends);
    thread727(tdone,ends);
    thread728(tdone,ends);
    thread729(tdone,ends);
    int biggest730 = 0;
    if(ends[7]>=biggest730){
      biggest730=ends[7];
    }
    if(ends[8]>=biggest730){
      biggest730=ends[8];
    }
    if(ends[9]>=biggest730){
      biggest730=ends[9];
    }
    if(ends[10]>=biggest730){
      biggest730=ends[10];
    }
    if(ends[11]>=biggest730){
      biggest730=ends[11];
    }
    if(biggest730 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread723(int [] tdone, int [] ends){
        S254=1;
    S232=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread722(int [] tdone, int [] ends){
        S222=1;
    S190=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread721(int [] tdone, int [] ends){
        S180=1;
    S152=0;
    gripperInit.setPresent();//sysj\capperPlant.sysj line: 23, column: 5
    currsigs.addElement(gripperInit);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread720(int [] tdone, int [] ends){
        S139=1;
    S103=0;
    if(gripDown.getprestatus()){//sysj\capperPlant.sysj line: 11, column: 20
      S103=1;
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
      switch(S718){
        case 0 : 
          S718=0;
          break RUN;
        
        case 1 : 
          S718=2;
          S718=2;
          thread720(tdone,ends);
          thread721(tdone,ends);
          thread722(tdone,ends);
          thread723(tdone,ends);
          thread724(tdone,ends);
          int biggest731 = 0;
          if(ends[2]>=biggest731){
            biggest731=ends[2];
          }
          if(ends[3]>=biggest731){
            biggest731=ends[3];
          }
          if(ends[4]>=biggest731){
            biggest731=ends[4];
          }
          if(ends[5]>=biggest731){
            biggest731=ends[5];
          }
          if(ends[6]>=biggest731){
            biggest731=ends[6];
          }
          if(biggest731 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread732(tdone,ends);
          thread733(tdone,ends);
          thread734(tdone,ends);
          thread735(tdone,ends);
          thread736(tdone,ends);
          int biggest743 = 0;
          if(ends[2]>=biggest743){
            biggest743=ends[2];
          }
          if(ends[3]>=biggest743){
            biggest743=ends[3];
          }
          if(ends[4]>=biggest743){
            biggest743=ends[4];
          }
          if(ends[5]>=biggest743){
            biggest743=ends[5];
          }
          if(ends[6]>=biggest743){
            biggest743=ends[6];
          }
          if(biggest743 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest743 == 0){
            thread744(tdone,ends);
            thread745(tdone,ends);
            thread746(tdone,ends);
            thread747(tdone,ends);
            thread748(tdone,ends);
            int biggest755 = 0;
            if(ends[2]>=biggest755){
              biggest755=ends[2];
            }
            if(ends[3]>=biggest755){
              biggest755=ends[3];
            }
            if(ends[4]>=biggest755){
              biggest755=ends[4];
            }
            if(ends[5]>=biggest755){
              biggest755=ends[5];
            }
            if(ends[6]>=biggest755){
              biggest755=ends[6];
            }
            if(biggest755 == 1){
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
