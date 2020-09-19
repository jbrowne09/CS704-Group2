import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class loaderPlant extends ClockDomain{
  public loaderPlant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal CMD = new Signal("CMD", Signal.INPUT);
  private int S1500 = 1;
  private int S1492 = 1;
  
  private int[] ends = new int[2];
  private int[] tdone = new int[2];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S1500){
        case 0 : 
          S1500=0;
          break RUN;
        
        case 1 : 
          S1500=2;
          S1500=2;
          System.out.println("CMD is " + (CMD.getpreval() == null ? null : ((String)CMD.getpreval())));//sysj\loaderPlant.sysj line: 7, column: 2
          S1492=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          switch(S1492){
            case 0 : 
              if(CMD.getprestatus()){//sysj\loaderPlant.sysj line: 8, column: 8
                System.out.println("CMD is " + (CMD.getpreval() == null ? null : ((String)CMD.getpreval())));//sysj\loaderPlant.sysj line: 9, column: 2
                S1492=1;
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
              S1492=1;
              System.out.println("CMD is " + (CMD.getpreval() == null ? null : ((String)CMD.getpreval())));//sysj\loaderPlant.sysj line: 7, column: 2
              S1492=0;
              active[1]=1;
              ends[1]=1;
              break RUN;
            
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
          CMD.gethook();
          df = true;
        }
        runClockDomain();
      }
      CMD.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = CMD.getStatus() ? CMD.setprepresent() : CMD.setpreclear();
      CMD.setpreval(CMD.getValue());
      CMD.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        CMD.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
