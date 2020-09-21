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
  public Signal conveyorEnable = new Signal("conveyorEnable", Signal.INPUT);
  public Signal motor = new Signal("motor", Signal.OUTPUT);
  public Signal NbottleLeft5 = new Signal("NbottleLeft5", Signal.OUTPUT);
  public Signal NbottlePos1 = new Signal("NbottlePos1", Signal.OUTPUT);
  private int S513 = 1;
  private int S495 = 1;
  private int S489 = 1;
  private int S503 = 1;
  private int S511 = 1;
  
  private int[] ends = new int[5];
  private int[] tdone = new int[5];
  
  public void thread521(int [] tdone, int [] ends){
        switch(S511){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(conveyorEnable.getprestatus()){//sysj\conveyorController.sysj line: 22, column: 25
          motor.setPresent();//sysj\conveyorController.sysj line: 22, column: 42
          currsigs.addElement(motor);
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        else {
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread520(int [] tdone, int [] ends){
        switch(S503){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(bottlePos1.getprestatus()){//sysj\conveyorController.sysj line: 20, column: 25
          NbottlePos1.setPresent();//sysj\conveyorController.sysj line: 20, column: 38
          currsigs.addElement(NbottlePos1);
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
      
    }
  }

  public void thread519(int [] tdone, int [] ends){
        switch(S495){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S489){
          case 0 : 
            S489=0;
            if(bottleLeft5.getprestatus()){//sysj\conveyorController.sysj line: 18, column: 25
              NbottleLeft5.setPresent();//sysj\conveyorController.sysj line: 18, column: 39
              currsigs.addElement(NbottleLeft5);
              S489=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S489=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            S489=1;
            S489=0;
            if(bottleLeft5.getprestatus()){//sysj\conveyorController.sysj line: 18, column: 25
              NbottleLeft5.setPresent();//sysj\conveyorController.sysj line: 18, column: 39
              currsigs.addElement(NbottleLeft5);
              S489=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S489=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread517(int [] tdone, int [] ends){
        S511=1;
    if(conveyorEnable.getprestatus()){//sysj\conveyorController.sysj line: 22, column: 25
      motor.setPresent();//sysj\conveyorController.sysj line: 22, column: 42
      currsigs.addElement(motor);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread516(int [] tdone, int [] ends){
        S503=1;
    if(bottlePos1.getprestatus()){//sysj\conveyorController.sysj line: 20, column: 25
      NbottlePos1.setPresent();//sysj\conveyorController.sysj line: 20, column: 38
      currsigs.addElement(NbottlePos1);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread515(int [] tdone, int [] ends){
        S495=1;
    S489=0;
    if(bottleLeft5.getprestatus()){//sysj\conveyorController.sysj line: 18, column: 25
      NbottleLeft5.setPresent();//sysj\conveyorController.sysj line: 18, column: 39
      currsigs.addElement(NbottleLeft5);
      S489=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      S489=1;
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
      switch(S513){
        case 0 : 
          S513=0;
          break RUN;
        
        case 1 : 
          S513=2;
          S513=2;
          thread515(tdone,ends);
          thread516(tdone,ends);
          thread517(tdone,ends);
          int biggest518 = 0;
          if(ends[2]>=biggest518){
            biggest518=ends[2];
          }
          if(ends[3]>=biggest518){
            biggest518=ends[3];
          }
          if(ends[4]>=biggest518){
            biggest518=ends[4];
          }
          if(biggest518 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread519(tdone,ends);
          thread520(tdone,ends);
          thread521(tdone,ends);
          int biggest522 = 0;
          if(ends[2]>=biggest522){
            biggest522=ends[2];
          }
          if(ends[3]>=biggest522){
            biggest522=ends[3];
          }
          if(ends[4]>=biggest522){
            biggest522=ends[4];
          }
          if(biggest522 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest522 == 0){
            S513=0;
            active[1]=0;
            ends[1]=0;
            S513=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0};
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
          conveyorEnable.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleLeft5.setpreclear();
      bottlePos1.setpreclear();
      conveyorEnable.setpreclear();
      motor.setpreclear();
      NbottleLeft5.setpreclear();
      NbottlePos1.setpreclear();
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
      dummyint = conveyorEnable.getStatus() ? conveyorEnable.setprepresent() : conveyorEnable.setpreclear();
      conveyorEnable.setpreval(conveyorEnable.getValue());
      conveyorEnable.setClear();
      motor.sethook();
      motor.setClear();
      NbottleLeft5.sethook();
      NbottleLeft5.setClear();
      NbottlePos1.sethook();
      NbottlePos1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        bottleLeft5.gethook();
        bottlePos1.gethook();
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
