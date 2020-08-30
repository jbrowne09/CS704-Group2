import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class conveyorPlant extends ClockDomain{
  public conveyorPlant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal motor = new Signal("motor", Signal.INPUT);
  public Signal enable = new Signal("enable", Signal.INPUT);
  public Signal bottleLeft5 = new Signal("bottleLeft5", Signal.OUTPUT);
  public Signal bottlePos1 = new Signal("bottlePos1", Signal.OUTPUT);
  public Signal bottlePos5 = new Signal("bottlePos5", Signal.OUTPUT);
  public Signal motorS = new Signal("motorS", Signal.OUTPUT);
  private int S222 = 1;
  private int S70 = 1;
  private int S36 = 1;
  private int S126 = 1;
  private int S80 = 1;
  
  private int[] ends = new int[4];
  private int[] tdone = new int[4];
  
  public void thread228(int [] tdone, int [] ends){
        switch(S126){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S80){
          case 0 : 
            if(enable.getprestatus() && motor.getprestatus()){//sysj\conveyorPlant.sysj line: 21, column: 10
              S80=1;
              bottlePos1.setPresent();//sysj\conveyorPlant.sysj line: 25, column: 5
              currsigs.addElement(bottlePos1);
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
            if(enable.getprestatus()){//sysj\conveyorPlant.sysj line: 24, column: 10
              S80=2;
              bottlePos5.setPresent();//sysj\conveyorPlant.sysj line: 28, column: 5
              currsigs.addElement(bottlePos5);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              bottlePos1.setPresent();//sysj\conveyorPlant.sysj line: 25, column: 5
              currsigs.addElement(bottlePos1);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 2 : 
            if(enable.getprestatus() && motor.getprestatus()){//sysj\conveyorPlant.sysj line: 27, column: 10
              S80=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              bottlePos5.setPresent();//sysj\conveyorPlant.sysj line: 28, column: 5
              currsigs.addElement(bottlePos5);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread227(int [] tdone, int [] ends){
        switch(S70){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S36){
          case 0 : 
            if(enable.getprestatus()){//sysj\conveyorPlant.sysj line: 11, column: 10
              S36=1;
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
            if(motor.getprestatus()){//sysj\conveyorPlant.sysj line: 12, column: 10
              S36=2;
              motorS.setPresent();//sysj\conveyorPlant.sysj line: 14, column: 5
              currsigs.addElement(motorS);
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
            if(!motor.getprestatus()){//sysj\conveyorPlant.sysj line: 13, column: 11
              S36=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              motorS.setPresent();//sysj\conveyorPlant.sysj line: 14, column: 5
              currsigs.addElement(motorS);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread225(int [] tdone, int [] ends){
        S126=1;
    S80=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread224(int [] tdone, int [] ends){
        S70=1;
    S36=0;
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
      switch(S222){
        case 0 : 
          S222=0;
          break RUN;
        
        case 1 : 
          S222=2;
          S222=2;
          new Thread(new conveyorGUI()).start();//sysj\conveyorPlant.sysj line: 7, column: 2
          thread224(tdone,ends);
          thread225(tdone,ends);
          int biggest226 = 0;
          if(ends[2]>=biggest226){
            biggest226=ends[2];
          }
          if(ends[3]>=biggest226){
            biggest226=ends[3];
          }
          if(biggest226 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread227(tdone,ends);
          thread228(tdone,ends);
          int biggest229 = 0;
          if(ends[2]>=biggest229){
            biggest229=ends[2];
          }
          if(ends[3]>=biggest229){
            biggest229=ends[3];
          }
          if(biggest229 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest229 == 0){
            S222=0;
            active[1]=0;
            ends[1]=0;
            S222=0;
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
          motor.gethook();
          enable.gethook();
          df = true;
        }
        runClockDomain();
      }
      motor.setpreclear();
      enable.setpreclear();
      bottleLeft5.setpreclear();
      bottlePos1.setpreclear();
      bottlePos5.setpreclear();
      motorS.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = motor.getStatus() ? motor.setprepresent() : motor.setpreclear();
      motor.setpreval(motor.getValue());
      motor.setClear();
      dummyint = enable.getStatus() ? enable.setprepresent() : enable.setpreclear();
      enable.setpreval(enable.getValue());
      enable.setClear();
      bottleLeft5.sethook();
      bottleLeft5.setClear();
      bottlePos1.sethook();
      bottlePos1.setClear();
      bottlePos5.sethook();
      bottlePos5.setClear();
      motorS.sethook();
      motorS.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        motor.gethook();
        enable.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
