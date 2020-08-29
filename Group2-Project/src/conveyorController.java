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
  public Signal requestConveyor = new Signal("requestConveyor", Signal.INPUT);
  public Signal motor = new Signal("motor", Signal.OUTPUT);
  private int S209 = 1;
  private int S103 = 1;
  private int S33 = 1;
  private int S5 = 1;
  private int S207 = 1;
  private int S137 = 1;
  private int S109 = 1;
  
  private int[] ends = new int[4];
  private int[] tdone = new int[4];
  
  public void thread215(int [] tdone, int [] ends){
        switch(S207){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S137){
          case 0 : 
            if(bottlePos5.getprestatus()){//sysj\conveyorController.sysj line: 24, column: 13
              S137=1;
              S109=0;
              motor.setPresent();//sysj\conveyorController.sysj line: 28, column: 10
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
            if(bottleLeft5.getprestatus()){//sysj\conveyorController.sysj line: 25, column: 13
              S137=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              switch(S109){
                case 0 : 
                  if(bottlePos1.getprestatus()){//sysj\conveyorController.sysj line: 27, column: 15
                    S109=1;
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  else {
                    motor.setPresent();//sysj\conveyorController.sysj line: 28, column: 10
                    currsigs.addElement(motor);
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  break;
                
                case 1 : 
                  S109=1;
                  S109=0;
                  motor.setPresent();//sysj\conveyorController.sysj line: 28, column: 10
                  currsigs.addElement(motor);
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                  break;
                
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread214(int [] tdone, int [] ends){
        switch(S103){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S33){
          case 0 : 
            if(requestConveyor.getprestatus()){//sysj\conveyorController.sysj line: 10, column: 13
              S33=1;
              S5=0;
              motor.setPresent();//sysj\conveyorController.sysj line: 14, column: 10
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
          
          case 1 : 
            if(bottlePos1.getprestatus()){//sysj\conveyorController.sysj line: 11, column: 13
              S33=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              switch(S5){
                case 0 : 
                  if(bottleLeft5.getprestatus()){//sysj\conveyorController.sysj line: 13, column: 15
                    S5=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    motor.setPresent();//sysj\conveyorController.sysj line: 14, column: 10
                    currsigs.addElement(motor);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  break;
                
                case 1 : 
                  S5=1;
                  S5=0;
                  motor.setPresent();//sysj\conveyorController.sysj line: 14, column: 10
                  currsigs.addElement(motor);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                  break;
                
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread212(int [] tdone, int [] ends){
        S207=1;
    S137=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread211(int [] tdone, int [] ends){
        S103=1;
    S33=0;
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
      switch(S209){
        case 0 : 
          S209=0;
          break RUN;
        
        case 1 : 
          S209=2;
          S209=2;
          thread211(tdone,ends);
          thread212(tdone,ends);
          int biggest213 = 0;
          if(ends[2]>=biggest213){
            biggest213=ends[2];
          }
          if(ends[3]>=biggest213){
            biggest213=ends[3];
          }
          if(biggest213 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread214(tdone,ends);
          thread215(tdone,ends);
          int biggest216 = 0;
          if(ends[2]>=biggest216){
            biggest216=ends[2];
          }
          if(ends[3]>=biggest216){
            biggest216=ends[3];
          }
          if(biggest216 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest216 == 0){
            S209=0;
            active[1]=0;
            ends[1]=0;
            S209=0;
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
          requestConveyor.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleLeft5.setpreclear();
      bottlePos1.setpreclear();
      bottlePos5.setpreclear();
      requestConveyor.setpreclear();
      motor.setpreclear();
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
      dummyint = requestConveyor.getStatus() ? requestConveyor.setprepresent() : requestConveyor.setpreclear();
      requestConveyor.setpreval(requestConveyor.getValue());
      requestConveyor.setClear();
      motor.sethook();
      motor.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        bottleLeft5.gethook();
        bottlePos1.gethook();
        bottlePos5.gethook();
        requestConveyor.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
