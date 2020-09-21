import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class conveyorController extends ClockDomain{
  public conveyorController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottleLeft5 = new Signal("bottleLeft5", Signal.INPUT);
  public Signal bottlePos1 = new Signal("bottlePos1", Signal.INPUT);
  public Signal bottlePos5 = new Signal("bottlePos5", Signal.INPUT);
  public Signal conveyorEnable = new Signal("conveyorEnable", Signal.INPUT);
  public Signal bottleAtConvStart = new Signal("bottleAtConvStart", Signal.INPUT);
  public Signal motor = new Signal("motor", Signal.OUTPUT);
  public Signal conveyorDone = new Signal("conveyorDone", Signal.OUTPUT);
  private int S458 = 1;
  private int S418 = 1;
  private int S384 = 1;
  private int S456 = 1;
  private int S422 = 1;
  
  private int[] ends = new int[4];
  private int[] tdone = new int[4];
  
  public void thread464(int [] tdone, int [] ends){
        switch(S456){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S422){
          case 0 : 
            if(bottlePos5.getprestatus()){//sysj\conveyorController.sysj line: 23, column: 10
              S422=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if(!bottlePos1.getprestatus() && !bottleLeft5.getprestatus()){//sysj\conveyorController.sysj line: 25, column: 10
              S422=2;
              motor.setPresent();//sysj\conveyorController.sysj line: 30, column: 5
              currsigs.addElement(motor);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 2 : 
            if(bottlePos1.getprestatus() || bottleLeft5.getprestatus()){//sysj\conveyorController.sysj line: 29, column: 10
              S422=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              motor.setPresent();//sysj\conveyorController.sysj line: 30, column: 5
              currsigs.addElement(motor);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread463(int [] tdone, int [] ends){
        switch(S418){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S384){
          case 0 : 
            if(bottleAtConvStart.getprestatus()){//sysj\conveyorController.sysj line: 9, column: 10
              S384=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(!bottlePos1.getprestatus() && !bottleLeft5.getprestatus()){//sysj\conveyorController.sysj line: 11, column: 10
              S384=2;
              motor.setPresent();//sysj\conveyorController.sysj line: 16, column: 5
              currsigs.addElement(motor);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 2 : 
            if(bottlePos1.getprestatus() || bottleLeft5.getprestatus()){//sysj\conveyorController.sysj line: 15, column: 10
              S384=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              motor.setPresent();//sysj\conveyorController.sysj line: 16, column: 5
              currsigs.addElement(motor);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread461(int [] tdone, int [] ends){
        S456=1;
    S422=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread460(int [] tdone, int [] ends){
        S418=1;
    S384=0;
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
      switch(S458){
        case 0 : 
          S458=0;
          break RUN;
        
        case 1 : 
          S458=2;
          S458=2;
          thread460(tdone,ends);
          thread461(tdone,ends);
          int biggest462 = 0;
          if(ends[2]>=biggest462){
            biggest462=ends[2];
          }
          if(ends[3]>=biggest462){
            biggest462=ends[3];
          }
          if(biggest462 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread463(tdone,ends);
          thread464(tdone,ends);
          int biggest465 = 0;
          if(ends[2]>=biggest465){
            biggest465=ends[2];
          }
          if(ends[3]>=biggest465){
            biggest465=ends[3];
          }
          if(biggest465 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest465 == 0){
            S458=0;
            active[1]=0;
            ends[1]=0;
            S458=0;
            break RUN;
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
          bottleLeft5.gethook();
          bottlePos1.gethook();
          bottlePos5.gethook();
          conveyorEnable.gethook();
          bottleAtConvStart.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleLeft5.setpreclear();
      bottlePos1.setpreclear();
      bottlePos5.setpreclear();
      conveyorEnable.setpreclear();
      bottleAtConvStart.setpreclear();
      motor.setpreclear();
      conveyorDone.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottleLeft5.getStatus() ? bottleLeft5.setprepresent() : bottleLeft5.setpreclear();
      bottleLeft5.setpreval(bottleLeft5.getValue());
      bottleLeft5.setClear();
      dummyint = bottlePos1.getStatus() ? bottlePos1.setprepresent() : bottlePos1.setpreclear();
      bottlePos1.setpreval(bottlePos1.getValue());
      bottlePos1.setClear();
      dummyint = bottlePos5.getStatus() ? bottlePos5.setprepresent() : bottlePos5.setpreclear();
      bottlePos5.setpreval(bottlePos5.getValue());
      bottlePos5.setClear();
      dummyint = conveyorEnable.getStatus() ? conveyorEnable.setprepresent() : conveyorEnable.setpreclear();
      conveyorEnable.setpreval(conveyorEnable.getValue());
      conveyorEnable.setClear();
      dummyint = bottleAtConvStart.getStatus() ? bottleAtConvStart.setprepresent() : bottleAtConvStart.setpreclear();
      bottleAtConvStart.setpreval(bottleAtConvStart.getValue());
      bottleAtConvStart.setClear();
      motor.sethook();
      motor.setClear();
      conveyorDone.sethook();
      conveyorDone.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        bottleLeft5.gethook();
        bottlePos1.gethook();
        bottlePos5.gethook();
        conveyorEnable.gethook();
        bottleAtConvStart.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
