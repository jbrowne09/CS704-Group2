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
  public Signal conveyer_enable = new Signal("conveyer_enable", Signal.INPUT);
  public Signal motor = new Signal("motor", Signal.OUTPUT);
  public Signal conveyerDone = new Signal("conveyerDone", Signal.OUTPUT);
  private int S109 = 1;
  private int S35 = 1;
  private int S6 = 1;
  private int S17 = 1;
  private int S16 = 1;
  
  private int[] ends = new int[4];
  private int[] tdone = new int[4];
  
  public void thread115(int [] tdone, int [] ends){
        switch(S17){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S16){
          case 0 : 
            if(bottlePos5.getprestatus()){//sysj\conveyorController.sysj line: 17, column: 9
              S16=1;
              motor.setPresent();//sysj\conveyorController.sysj line: 19, column: 4
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
            if(bottleLeft5.getprestatus()){//sysj\conveyorController.sysj line: 18, column: 9
              conveyerDone.setPresent();//sysj\conveyorController.sysj line: 21, column: 3
              currsigs.addElement(conveyerDone);
              S17=0;
              active[3]=0;
              ends[3]=0;
              tdone[3]=1;
            }
            else {
              motor.setPresent();//sysj\conveyorController.sysj line: 19, column: 4
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

  public void thread114(int [] tdone, int [] ends){
        switch(S6){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        if(bottlePos1.getprestatus()){//sysj\conveyorController.sysj line: 10, column: 9
          conveyerDone.setPresent();//sysj\conveyorController.sysj line: 13, column: 3
          currsigs.addElement(conveyerDone);
          S6=0;
          active[2]=0;
          ends[2]=0;
          tdone[2]=1;
        }
        else {
          motor.setPresent();//sysj\conveyorController.sysj line: 11, column: 4
          currsigs.addElement(motor);
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
        break;
      
    }
  }

  public void thread112(int [] tdone, int [] ends){
        S17=1;
    S16=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread111(int [] tdone, int [] ends){
        S6=1;
    motor.setPresent();//sysj\conveyorController.sysj line: 11, column: 4
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
      switch(S109){
        case 0 : 
          S109=0;
          break RUN;
        
        case 1 : 
          S109=2;
          S109=2;
          S35=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          switch(S35){
            case 0 : 
              if(conveyer_enable.getprestatus()){//sysj\conveyorController.sysj line: 8, column: 9
                S35=1;
                thread111(tdone,ends);
                thread112(tdone,ends);
                int biggest113 = 0;
                if(ends[2]>=biggest113){
                  biggest113=ends[2];
                }
                if(ends[3]>=biggest113){
                  biggest113=ends[3];
                }
                if(biggest113 == 1){
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
              thread114(tdone,ends);
              thread115(tdone,ends);
              int biggest116 = 0;
              if(ends[2]>=biggest116){
                biggest116=ends[2];
              }
              if(ends[3]>=biggest116){
                biggest116=ends[3];
              }
              if(biggest116 == 1){
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              //FINXME code
              if(biggest116 == 0){
                S35=0;
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
          conveyer_enable.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleLeft5.setpreclear();
      bottlePos1.setpreclear();
      bottlePos5.setpreclear();
      conveyer_enable.setpreclear();
      motor.setpreclear();
      conveyerDone.setpreclear();
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
      dummyint = conveyer_enable.getStatus() ? conveyer_enable.setprepresent() : conveyer_enable.setpreclear();
      conveyer_enable.setpreval(conveyer_enable.getValue());
      conveyer_enable.setClear();
      motor.sethook();
      motor.setClear();
      conveyerDone.sethook();
      conveyerDone.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        bottleLeft5.gethook();
        bottlePos1.gethook();
        bottlePos5.gethook();
        conveyer_enable.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
