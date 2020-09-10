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
  public Signal bottlePos4 = new Signal("bottlePos4", Signal.OUTPUT);
  public Signal gripperLoweredS = new Signal("gripperLoweredS", Signal.OUTPUT);
  public Signal gripperLiftedS = new Signal("gripperLiftedS", Signal.OUTPUT);
  public Signal gripperInitS = new Signal("gripperInitS", Signal.OUTPUT);
  public Signal gripperTurnedS = new Signal("gripperTurnedS", Signal.OUTPUT);
  public Signal bottlePos4S = new Signal("bottlePos4S", Signal.OUTPUT);
  private int S456 = 1;
  private int S274 = 1;
  private int S288 = 1;
  private int S287 = 1;
  private int S330 = 1;
  private int S296 = 1;
  private int S290 = 1;
  private int S304 = 1;
  private int S312 = 1;
  private int S320 = 1;
  private int S328 = 1;
  
  private int[] ends = new int[10];
  private int[] tdone = new int[10];
  
  public void thread485(int [] tdone, int [] ends){
        S328=1;
    if(bottlePos4.getprestatus()){//sysj\capperPlant.sysj line: 34, column: 25
      bottlePos4S.setPresent();//sysj\capperPlant.sysj line: 34, column: 38
      currsigs.addElement(bottlePos4S);
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

  public void thread484(int [] tdone, int [] ends){
        S320=1;
    if(gripperTurned.getprestatus()){//sysj\capperPlant.sysj line: 32, column: 25
      gripperTurnedS.setPresent();//sysj\capperPlant.sysj line: 32, column: 41
      currsigs.addElement(gripperTurnedS);
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

  public void thread483(int [] tdone, int [] ends){
        S312=1;
    if(gripperInit.getprestatus()){//sysj\capperPlant.sysj line: 30, column: 25
      gripperInitS.setPresent();//sysj\capperPlant.sysj line: 30, column: 39
      currsigs.addElement(gripperInitS);
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

  public void thread482(int [] tdone, int [] ends){
        S304=1;
    if(gripperLifted.getprestatus()){//sysj\capperPlant.sysj line: 28, column: 25
      gripperLiftedS.setPresent();//sysj\capperPlant.sysj line: 28, column: 41
      currsigs.addElement(gripperLiftedS);
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

  public void thread481(int [] tdone, int [] ends){
        S296=1;
    S290=0;
    if(gripperLowered.getprestatus()){//sysj\capperPlant.sysj line: 26, column: 25
      gripperLoweredS.setPresent();//sysj\capperPlant.sysj line: 26, column: 42
      currsigs.addElement(gripperLoweredS);
      S290=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S290=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread480(int [] tdone, int [] ends){
        S330=1;
    thread481(tdone,ends);
    thread482(tdone,ends);
    thread483(tdone,ends);
    thread484(tdone,ends);
    thread485(tdone,ends);
    int biggest486 = 0;
    if(ends[5]>=biggest486){
      biggest486=ends[5];
    }
    if(ends[6]>=biggest486){
      biggest486=ends[6];
    }
    if(ends[7]>=biggest486){
      biggest486=ends[7];
    }
    if(ends[8]>=biggest486){
      biggest486=ends[8];
    }
    if(ends[9]>=biggest486){
      biggest486=ends[9];
    }
    if(biggest486 == 1){
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread479(int [] tdone, int [] ends){
        S288=1;
    S287=0;
    gripperInit.setPresent();//sysj\capperPlant.sysj line: 18, column: 5
    currsigs.addElement(gripperInit);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread478(int [] tdone, int [] ends){
        S274=1;
    if(gripDown.getprestatus()){//sysj\capperPlant.sysj line: 10, column: 20
      gripperLowered.setPresent();//sysj\capperPlant.sysj line: 13, column: 4
      currsigs.addElement(gripperLowered);
      S274=0;
      active[2]=0;
      ends[2]=0;
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

  public void thread475(int [] tdone, int [] ends){
        switch(S328){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(bottlePos4.getprestatus()){//sysj\capperPlant.sysj line: 34, column: 25
          bottlePos4S.setPresent();//sysj\capperPlant.sysj line: 34, column: 38
          currsigs.addElement(bottlePos4S);
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

  public void thread474(int [] tdone, int [] ends){
        switch(S320){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(gripperTurned.getprestatus()){//sysj\capperPlant.sysj line: 32, column: 25
          gripperTurnedS.setPresent();//sysj\capperPlant.sysj line: 32, column: 41
          currsigs.addElement(gripperTurnedS);
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

  public void thread473(int [] tdone, int [] ends){
        switch(S312){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(gripperInit.getprestatus()){//sysj\capperPlant.sysj line: 30, column: 25
          gripperInitS.setPresent();//sysj\capperPlant.sysj line: 30, column: 39
          currsigs.addElement(gripperInitS);
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

  public void thread472(int [] tdone, int [] ends){
        switch(S304){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(gripperLifted.getprestatus()){//sysj\capperPlant.sysj line: 28, column: 25
          gripperLiftedS.setPresent();//sysj\capperPlant.sysj line: 28, column: 41
          currsigs.addElement(gripperLiftedS);
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

  public void thread471(int [] tdone, int [] ends){
        switch(S296){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S290){
          case 0 : 
            S290=0;
            if(gripperLowered.getprestatus()){//sysj\capperPlant.sysj line: 26, column: 25
              gripperLoweredS.setPresent();//sysj\capperPlant.sysj line: 26, column: 42
              currsigs.addElement(gripperLoweredS);
              S290=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S290=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S290=1;
            S290=0;
            if(gripperLowered.getprestatus()){//sysj\capperPlant.sysj line: 26, column: 25
              gripperLoweredS.setPresent();//sysj\capperPlant.sysj line: 26, column: 42
              currsigs.addElement(gripperLoweredS);
              S290=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S290=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread470(int [] tdone, int [] ends){
        switch(S330){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        thread471(tdone,ends);
        thread472(tdone,ends);
        thread473(tdone,ends);
        thread474(tdone,ends);
        thread475(tdone,ends);
        int biggest476 = 0;
        if(ends[5]>=biggest476){
          biggest476=ends[5];
        }
        if(ends[6]>=biggest476){
          biggest476=ends[6];
        }
        if(ends[7]>=biggest476){
          biggest476=ends[7];
        }
        if(ends[8]>=biggest476){
          biggest476=ends[8];
        }
        if(ends[9]>=biggest476){
          biggest476=ends[9];
        }
        if(biggest476 == 1){
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        //FINXME code
        if(biggest476 == 0){
          S330=0;
          active[4]=0;
          ends[4]=0;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread469(int [] tdone, int [] ends){
        switch(S288){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S287){
          case 0 : 
            if(twistGrip.getprestatus()){//sysj\capperPlant.sysj line: 17, column: 10
              S287=1;
              gripperTurned.setPresent();//sysj\capperPlant.sysj line: 21, column: 5
              currsigs.addElement(gripperTurned);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              gripperInit.setPresent();//sysj\capperPlant.sysj line: 18, column: 5
              currsigs.addElement(gripperInit);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if(untwistGrip.getprestatus()){//sysj\capperPlant.sysj line: 20, column: 10
              S288=0;
              active[3]=0;
              ends[3]=0;
              tdone[3]=1;
            }
            else {
              gripperTurned.setPresent();//sysj\capperPlant.sysj line: 21, column: 5
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

  public void thread468(int [] tdone, int [] ends){
        switch(S274){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        if(gripDown.getprestatus()){//sysj\capperPlant.sysj line: 10, column: 20
          gripperLowered.setPresent();//sysj\capperPlant.sysj line: 13, column: 4
          currsigs.addElement(gripperLowered);
          S274=0;
          active[2]=0;
          ends[2]=0;
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
      
    }
  }

  public void thread465(int [] tdone, int [] ends){
        S328=1;
    if(bottlePos4.getprestatus()){//sysj\capperPlant.sysj line: 34, column: 25
      bottlePos4S.setPresent();//sysj\capperPlant.sysj line: 34, column: 38
      currsigs.addElement(bottlePos4S);
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

  public void thread464(int [] tdone, int [] ends){
        S320=1;
    if(gripperTurned.getprestatus()){//sysj\capperPlant.sysj line: 32, column: 25
      gripperTurnedS.setPresent();//sysj\capperPlant.sysj line: 32, column: 41
      currsigs.addElement(gripperTurnedS);
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

  public void thread463(int [] tdone, int [] ends){
        S312=1;
    if(gripperInit.getprestatus()){//sysj\capperPlant.sysj line: 30, column: 25
      gripperInitS.setPresent();//sysj\capperPlant.sysj line: 30, column: 39
      currsigs.addElement(gripperInitS);
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

  public void thread462(int [] tdone, int [] ends){
        S304=1;
    if(gripperLifted.getprestatus()){//sysj\capperPlant.sysj line: 28, column: 25
      gripperLiftedS.setPresent();//sysj\capperPlant.sysj line: 28, column: 41
      currsigs.addElement(gripperLiftedS);
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

  public void thread461(int [] tdone, int [] ends){
        S296=1;
    S290=0;
    if(gripperLowered.getprestatus()){//sysj\capperPlant.sysj line: 26, column: 25
      gripperLoweredS.setPresent();//sysj\capperPlant.sysj line: 26, column: 42
      currsigs.addElement(gripperLoweredS);
      S290=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S290=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread460(int [] tdone, int [] ends){
        S330=1;
    thread461(tdone,ends);
    thread462(tdone,ends);
    thread463(tdone,ends);
    thread464(tdone,ends);
    thread465(tdone,ends);
    int biggest466 = 0;
    if(ends[5]>=biggest466){
      biggest466=ends[5];
    }
    if(ends[6]>=biggest466){
      biggest466=ends[6];
    }
    if(ends[7]>=biggest466){
      biggest466=ends[7];
    }
    if(ends[8]>=biggest466){
      biggest466=ends[8];
    }
    if(ends[9]>=biggest466){
      biggest466=ends[9];
    }
    if(biggest466 == 1){
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread459(int [] tdone, int [] ends){
        S288=1;
    S287=0;
    gripperInit.setPresent();//sysj\capperPlant.sysj line: 18, column: 5
    currsigs.addElement(gripperInit);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread458(int [] tdone, int [] ends){
        S274=1;
    if(gripDown.getprestatus()){//sysj\capperPlant.sysj line: 10, column: 20
      gripperLowered.setPresent();//sysj\capperPlant.sysj line: 13, column: 4
      currsigs.addElement(gripperLowered);
      S274=0;
      active[2]=0;
      ends[2]=0;
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
      switch(S456){
        case 0 : 
          S456=0;
          break RUN;
        
        case 1 : 
          S456=2;
          S456=2;
          thread458(tdone,ends);
          thread459(tdone,ends);
          thread460(tdone,ends);
          int biggest467 = 0;
          if(ends[2]>=biggest467){
            biggest467=ends[2];
          }
          if(ends[3]>=biggest467){
            biggest467=ends[3];
          }
          if(ends[4]>=biggest467){
            biggest467=ends[4];
          }
          if(biggest467 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread468(tdone,ends);
          thread469(tdone,ends);
          thread470(tdone,ends);
          int biggest477 = 0;
          if(ends[2]>=biggest477){
            biggest477=ends[2];
          }
          if(ends[3]>=biggest477){
            biggest477=ends[3];
          }
          if(ends[4]>=biggest477){
            biggest477=ends[4];
          }
          if(biggest477 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest477 == 0){
            thread478(tdone,ends);
            thread479(tdone,ends);
            thread480(tdone,ends);
            int biggest487 = 0;
            if(ends[2]>=biggest487){
              biggest487=ends[2];
            }
            if(ends[3]>=biggest487){
              biggest487=ends[3];
            }
            if(ends[4]>=biggest487){
              biggest487=ends[4];
            }
            if(biggest487 == 1){
              active[1]=1;
              ends[1]=1;
              break RUN;
            }
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
      bottlePos4.setpreclear();
      gripperLoweredS.setpreclear();
      gripperLiftedS.setpreclear();
      gripperInitS.setpreclear();
      gripperTurnedS.setpreclear();
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
