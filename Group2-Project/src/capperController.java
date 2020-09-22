import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class capperController extends ClockDomain{
  public capperController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal gripperLowered = new Signal("gripperLowered", Signal.INPUT);
  public Signal gripperLifted = new Signal("gripperLifted", Signal.INPUT);
  public Signal gripperInit = new Signal("gripperInit", Signal.INPUT);
  public Signal gripperTurned = new Signal("gripperTurned", Signal.INPUT);
  public Signal bottleClamped = new Signal("bottleClamped", Signal.INPUT);
  public Signal capperEnable = new Signal("capperEnable", Signal.INPUT);
  public Signal tick = new Signal("tick", Signal.INPUT);
  public Signal clampBottle = new Signal("clampBottle", Signal.OUTPUT);
  public Signal gripCap = new Signal("gripCap", Signal.OUTPUT);
  public Signal gripDown = new Signal("gripDown", Signal.OUTPUT);
  public Signal twistGrip = new Signal("twistGrip", Signal.OUTPUT);
  public Signal untwistGrip = new Signal("untwistGrip", Signal.OUTPUT);
  public Signal capperDone = new Signal("capperDone", Signal.OUTPUT);
  private int S574 = 1;
  private int S363 = 1;
  private int S370 = 1;
  private int S375 = 1;
  
  private int[] ends = new int[4];
  private int[] tdone = new int[4];
  
  public void thread580(int [] tdone, int [] ends){
        switch(S375){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        clampBottle.setPresent();//sysj\capperController.sysj line: 14, column: 5
        currsigs.addElement(clampBottle);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread579(int [] tdone, int [] ends){
        switch(S370){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        gripDown.setPresent();//sysj\capperController.sysj line: 12, column: 5
        currsigs.addElement(gripDown);
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
        break;
      
    }
  }

  public void thread577(int [] tdone, int [] ends){
        S375=1;
    clampBottle.setPresent();//sysj\capperController.sysj line: 14, column: 5
    currsigs.addElement(clampBottle);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread576(int [] tdone, int [] ends){
        S370=1;
    gripDown.setPresent();//sysj\capperController.sysj line: 12, column: 5
    currsigs.addElement(gripDown);
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
      switch(S574){
        case 0 : 
          S574=0;
          break RUN;
        
        case 1 : 
          S574=2;
          S574=2;
          S363=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          switch(S363){
            case 0 : 
              if(capperEnable.getprestatus()){//sysj\capperController.sysj line: 8, column: 9
                S363=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 1 : 
              if(tick.getprestatus()){//sysj\capperController.sysj line: 9, column: 9
                S363=2;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 2 : 
              if(!tick.getprestatus()){//sysj\capperController.sysj line: 10, column: 9
                S363=3;
                thread576(tdone,ends);
                thread577(tdone,ends);
                int biggest578 = 0;
                if(ends[2]>=biggest578){
                  biggest578=ends[2];
                }
                if(ends[3]>=biggest578){
                  biggest578=ends[3];
                }
                if(biggest578 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 3 : 
              if(tick.getprestatus()){//sysj\capperController.sysj line: 11, column: 9
                S363=4;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                thread579(tdone,ends);
                thread580(tdone,ends);
                int biggest581 = 0;
                if(ends[2]>=biggest581){
                  biggest581=ends[2];
                }
                if(ends[3]>=biggest581){
                  biggest581=ends[3];
                }
                if(biggest581 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest581 == 0){
                  S363=4;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
            case 4 : 
              if(!tick.getprestatus()){//sysj\capperController.sysj line: 16, column: 9
                S363=5;
                gripCap.setPresent();//sysj\capperController.sysj line: 18, column: 4
                currsigs.addElement(gripCap);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 5 : 
              if(tick.getprestatus()){//sysj\capperController.sysj line: 17, column: 9
                S363=6;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                gripCap.setPresent();//sysj\capperController.sysj line: 18, column: 4
                currsigs.addElement(gripCap);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 6 : 
              if(!tick.getprestatus()){//sysj\capperController.sysj line: 20, column: 9
                S363=7;
                twistGrip.setPresent();//sysj\capperController.sysj line: 22, column: 4
                currsigs.addElement(twistGrip);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 7 : 
              if(tick.getprestatus()){//sysj\capperController.sysj line: 21, column: 9
                S363=8;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                twistGrip.setPresent();//sysj\capperController.sysj line: 22, column: 4
                currsigs.addElement(twistGrip);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 8 : 
              if(!tick.getprestatus()){//sysj\capperController.sysj line: 24, column: 9
                S363=9;
                untwistGrip.setPresent();//sysj\capperController.sysj line: 26, column: 4
                currsigs.addElement(untwistGrip);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 9 : 
              if(gripperLifted.getprestatus()){//sysj\capperController.sysj line: 25, column: 9
                S363=10;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                untwistGrip.setPresent();//sysj\capperController.sysj line: 26, column: 4
                currsigs.addElement(untwistGrip);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 10 : 
              if(!tick.getprestatus()){//sysj\capperController.sysj line: 28, column: 9
                S363=11;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 11 : 
              if(tick.getprestatus()){//sysj\capperController.sysj line: 29, column: 9
                S363=12;
                capperDone.setPresent();//sysj\capperController.sysj line: 31, column: 4
                currsigs.addElement(capperDone);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 12 : 
              if(!capperEnable.getprestatus()){//sysj\capperController.sysj line: 30, column: 9
                S363=0;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                capperDone.setPresent();//sysj\capperController.sysj line: 31, column: 4
                currsigs.addElement(capperDone);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0};
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
          gripperLowered.gethook();
          gripperLifted.gethook();
          gripperInit.gethook();
          gripperTurned.gethook();
          bottleClamped.gethook();
          capperEnable.gethook();
          tick.gethook();
          df = true;
        }
        runClockDomain();
      }
      gripperLowered.setpreclear();
      gripperLifted.setpreclear();
      gripperInit.setpreclear();
      gripperTurned.setpreclear();
      bottleClamped.setpreclear();
      capperEnable.setpreclear();
      tick.setpreclear();
      clampBottle.setpreclear();
      gripCap.setpreclear();
      gripDown.setpreclear();
      twistGrip.setpreclear();
      untwistGrip.setpreclear();
      capperDone.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = gripperLowered.getStatus() ? gripperLowered.setprepresent() : gripperLowered.setpreclear();
      gripperLowered.setpreval(gripperLowered.getValue());
      gripperLowered.setClear();
      dummyint = gripperLifted.getStatus() ? gripperLifted.setprepresent() : gripperLifted.setpreclear();
      gripperLifted.setpreval(gripperLifted.getValue());
      gripperLifted.setClear();
      dummyint = gripperInit.getStatus() ? gripperInit.setprepresent() : gripperInit.setpreclear();
      gripperInit.setpreval(gripperInit.getValue());
      gripperInit.setClear();
      dummyint = gripperTurned.getStatus() ? gripperTurned.setprepresent() : gripperTurned.setpreclear();
      gripperTurned.setpreval(gripperTurned.getValue());
      gripperTurned.setClear();
      dummyint = bottleClamped.getStatus() ? bottleClamped.setprepresent() : bottleClamped.setpreclear();
      bottleClamped.setpreval(bottleClamped.getValue());
      bottleClamped.setClear();
      dummyint = capperEnable.getStatus() ? capperEnable.setprepresent() : capperEnable.setpreclear();
      capperEnable.setpreval(capperEnable.getValue());
      capperEnable.setClear();
      dummyint = tick.getStatus() ? tick.setprepresent() : tick.setpreclear();
      tick.setpreval(tick.getValue());
      tick.setClear();
      clampBottle.sethook();
      clampBottle.setClear();
      gripCap.sethook();
      gripCap.setClear();
      gripDown.sethook();
      gripDown.setClear();
      twistGrip.sethook();
      twistGrip.setClear();
      untwistGrip.sethook();
      untwistGrip.setClear();
      capperDone.sethook();
      capperDone.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        gripperLowered.gethook();
        gripperLifted.gethook();
        gripperInit.gethook();
        gripperTurned.gethook();
        bottleClamped.gethook();
        capperEnable.gethook();
        tick.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
