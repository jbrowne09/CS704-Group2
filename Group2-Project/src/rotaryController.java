import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class rotaryController extends ClockDomain{
  public rotaryController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal aligned = new Signal("aligned", Signal.INPUT);
  public Signal bottlePos5 = new Signal("bottlePos5", Signal.INPUT);
  public Signal capPos1 = new Signal("capPos1", Signal.INPUT);
  public Signal enableRotary = new Signal("enableRotary", Signal.INPUT);
  public Signal rotate = new Signal("rotate", Signal.OUTPUT);
  public Signal rotaryDone = new Signal("rotaryDone", Signal.OUTPUT);
  private int S2076 = 1;
  private int S2038 = 1;
  
  private int[] ends = new int[2];
  private int[] tdone = new int[2];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S2076){
        case 0 : 
          S2076=0;
          break RUN;
        
        case 1 : 
          S2076=2;
          S2076=2;
          S2038=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          switch(S2038){
            case 0 : 
              if(enableRotary.getprestatus()){//sysj\rotaryController.sysj line: 10, column: 9
                S2038=1;
                System.out.println("cap on bottle in Pos1 or Pos5, please remove it");//sysj\rotaryController.sysj line: 12, column: 4
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
              if(!capPos1.getprestatus() && !bottlePos5.getprestatus()){//sysj\rotaryController.sysj line: 11, column: 9
                S2038=2;
                rotate.setPresent();//sysj\rotaryController.sysj line: 16, column: 4
                currsigs.addElement(rotate);
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
              if(aligned.getprestatus()){//sysj\rotaryController.sysj line: 15, column: 9
                rotaryDone.setPresent();//sysj\rotaryController.sysj line: 18, column: 3
                currsigs.addElement(rotaryDone);
                S2038=0;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                rotate.setPresent();//sysj\rotaryController.sysj line: 16, column: 4
                currsigs.addElement(rotate);
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
          aligned.gethook();
          bottlePos5.gethook();
          capPos1.gethook();
          enableRotary.gethook();
          df = true;
        }
        runClockDomain();
      }
      aligned.setpreclear();
      bottlePos5.setpreclear();
      capPos1.setpreclear();
      enableRotary.setpreclear();
      rotate.setpreclear();
      rotaryDone.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = aligned.getStatus() ? aligned.setprepresent() : aligned.setpreclear();
      aligned.setpreval(aligned.getValue());
      aligned.setClear();
      dummyint = bottlePos5.getStatus() ? bottlePos5.setprepresent() : bottlePos5.setpreclear();
      bottlePos5.setpreval(bottlePos5.getValue());
      bottlePos5.setClear();
      dummyint = capPos1.getStatus() ? capPos1.setprepresent() : capPos1.setpreclear();
      capPos1.setpreval(capPos1.getValue());
      capPos1.setClear();
      dummyint = enableRotary.getStatus() ? enableRotary.setprepresent() : enableRotary.setpreclear();
      enableRotary.setpreval(enableRotary.getValue());
      enableRotary.setClear();
      rotate.sethook();
      rotate.setClear();
      rotaryDone.sethook();
      rotaryDone.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        aligned.gethook();
        bottlePos5.gethook();
        capPos1.gethook();
        enableRotary.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
