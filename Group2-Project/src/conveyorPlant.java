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
  public Signal bottlePos5 = new Signal("bottlePos5", Signal.INPUT);
  public Signal bottleLeft5 = new Signal("bottleLeft5", Signal.OUTPUT);
  private int S127 = 1;
  private int S15 = 1;
  
  private int[] ends = new int[2];
  private int[] tdone = new int[2];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S127){
        case 0 : 
          S127=0;
          break RUN;
        
        case 1 : 
          S127=2;
          S127=2;
          new Thread(new conveyorGUI()).start();//sysj\conveyorPlant.sysj line: 7, column: 2
          S15=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          switch(S15){
            case 0 : 
              if(enable.getprestatus()){//sysj\conveyorPlant.sysj line: 11, column: 10
                S15=1;
                motor.setPresent();//sysj\conveyorPlant.sysj line: 13, column: 5
                currsigs.addElement(motor);
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
              if(!bottlePos5.getprestatus()){//sysj\conveyorPlant.sysj line: 12, column: 10
                S15=2;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                motor.setPresent();//sysj\conveyorPlant.sysj line: 13, column: 5
                currsigs.addElement(motor);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 2 : 
              if(!enable.getprestatus()){//sysj\conveyorPlant.sysj line: 15, column: 10
                S15=3;
                bottleLeft5.setPresent();//sysj\conveyorPlant.sysj line: 17, column: 5
                currsigs.addElement(bottleLeft5);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 3 : 
              if(bottlePos5.getprestatus()){//sysj\conveyorPlant.sysj line: 16, column: 10
                S15=0;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                bottleLeft5.setPresent();//sysj\conveyorPlant.sysj line: 17, column: 5
                currsigs.addElement(bottleLeft5);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1};
    char [] paused1 = {0, 0};
    char [] suspended1 = {0, 0};
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
          bottlePos5.gethook();
          df = true;
        }
        runClockDomain();
      }
      motor.setpreclear();
      enable.setpreclear();
      bottlePos5.setpreclear();
      bottleLeft5.setpreclear();
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
      dummyint = bottlePos5.getStatus() ? bottlePos5.setprepresent() : bottlePos5.setpreclear();
      bottlePos5.setpreval(bottlePos5.getValue());
      bottlePos5.setClear();
      bottleLeft5.sethook();
      bottleLeft5.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        motor.gethook();
        enable.gethook();
        bottlePos5.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
