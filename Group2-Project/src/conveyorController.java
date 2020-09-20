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
  public Signal motor = new Signal("motor", Signal.OUTPUT);
  public Signal conveyorDone = new Signal("conveyorDone", Signal.OUTPUT);
  private int S597 = 1;
  private int S489 = 1;
  private int S495 = 1;
  private int S506 = 1;
  private int S505 = 1;
  
  private int[] ends = new int[4];
  private int[] tdone = new int[4];
  
  public void thread603(int [] tdone, int [] ends){
        switch(S506){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S505){
          case 0 : 
            if(bottlePos5.getprestatus()){//sysj\conveyorController.sysj line: 18, column: 9
              S505=1;
              motor.setPresent();//sysj\conveyorController.sysj line: 20, column: 4
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
          
          case 1 : 
            if(bottleLeft5.getprestatus()){//sysj\conveyorController.sysj line: 19, column: 9
              conveyorDone.setPresent();//sysj\conveyorController.sysj line: 22, column: 3
              currsigs.addElement(conveyorDone);
              S506=0;
              active[3]=0;
              ends[3]=0;
              tdone[3]=1;
            }
            else {
              motor.setPresent();//sysj\conveyorController.sysj line: 20, column: 4
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

  public void thread602(int [] tdone, int [] ends){
        switch(S495){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        if(bottlePos1.getprestatus()){//sysj\conveyorController.sysj line: 11, column: 9
          conveyorDone.setPresent();//sysj\conveyorController.sysj line: 14, column: 3
          currsigs.addElement(conveyorDone);
          S495=0;
          active[2]=0;
          ends[2]=0;
          tdone[2]=1;
        }
        else {
          motor.setPresent();//sysj\conveyorController.sysj line: 12, column: 4
          currsigs.addElement(motor);
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
        break;
      
    }
  }

  public void thread600(int [] tdone, int [] ends){
        S506=1;
    S505=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread599(int [] tdone, int [] ends){
        S495=1;
    motor.setPresent();//sysj\conveyorController.sysj line: 12, column: 4
    currsigs.addElement(motor);
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
      switch(S597){
        case 0 : 
          S597=0;
          break RUN;
        
        case 1 : 
          S597=2;
          S597=2;
          S489=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          switch(S489){
            case 0 : 
              if(conveyorEnable.getprestatus()){//sysj\conveyorController.sysj line: 8, column: 9
                System.out.println("in conveyor");//sysj\conveyorController.sysj line: 9, column: 3
                S489=1;
                thread599(tdone,ends);
                thread600(tdone,ends);
                int biggest601 = 0;
                if(ends[2]>=biggest601){
                  biggest601=ends[2];
                }
                if(ends[3]>=biggest601){
                  biggest601=ends[3];
                }
                if(biggest601 == 1){
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
            
            case 1 : 
              thread602(tdone,ends);
              thread603(tdone,ends);
              int biggest604 = 0;
              if(ends[2]>=biggest604){
                biggest604=ends[2];
              }
              if(ends[3]>=biggest604){
                biggest604=ends[3];
              }
              if(biggest604 == 1){
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              //FINXME code
              if(biggest604 == 0){
                S489=0;
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
          bottleLeft5.gethook();
          bottlePos1.gethook();
          bottlePos5.gethook();
          conveyorEnable.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleLeft5.setpreclear();
      bottlePos1.setpreclear();
      bottlePos5.setpreclear();
      conveyorEnable.setpreclear();
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
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
