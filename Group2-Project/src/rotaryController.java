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
  public Signal bottlePos1 = new Signal("bottlePos1", Signal.INPUT);
  public Signal bottlePos2 = new Signal("bottlePos2", Signal.INPUT);
  public Signal bottlePos3 = new Signal("bottlePos3", Signal.INPUT);
  public Signal bottlePos4 = new Signal("bottlePos4", Signal.INPUT);
  public Signal bottlePos5 = new Signal("bottlePos5", Signal.INPUT);
  public Signal aligned = new Signal("aligned", Signal.INPUT);
  public Signal enableRotary = new Signal("enableRotary", Signal.INPUT);
  public Signal rotate = new Signal("rotate", Signal.OUTPUT);
  public Signal rotaryDone = new Signal("rotaryDone", Signal.OUTPUT);
  private int S2375 = 1;
  private int S2317 = 1;
  
  private int[] ends = new int[2];
  private int[] tdone = new int[2];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S2375){
        case 0 : 
          S2375=0;
          break RUN;
        
        case 1 : 
          S2375=2;
          S2375=2;
          S2317=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          switch(S2317){
            case 0 : 
              if(bottlePos1.getprestatus() || bottlePos2.getprestatus() || bottlePos3.getprestatus() || bottlePos4.getprestatus()){//sysj\rotaryController.sysj line: 12, column: 10
                S2317=1;
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
              if(!bottlePos5.getprestatus()){//sysj\rotaryController.sysj line: 15, column: 10
                S2317=2;
                rotate.setPresent();//sysj\rotaryController.sysj line: 18, column: 5
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
              if(!bottlePos1.getprestatus() && !bottlePos2.getprestatus() && !bottlePos3.getprestatus() && !bottlePos4.getprestatus()){//sysj\rotaryController.sysj line: 17, column: 10
                S2317=3;
                rotate.setPresent();//sysj\rotaryController.sysj line: 22, column: 5
                currsigs.addElement(rotate);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                rotate.setPresent();//sysj\rotaryController.sysj line: 18, column: 5
                currsigs.addElement(rotate);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 3 : 
              if(aligned.getprestatus()){//sysj\rotaryController.sysj line: 21, column: 10
                S2317=0;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                rotate.setPresent();//sysj\rotaryController.sysj line: 22, column: 5
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
          bottlePos1.gethook();
          bottlePos2.gethook();
          bottlePos3.gethook();
          bottlePos4.gethook();
          bottlePos5.gethook();
          aligned.gethook();
          enableRotary.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottlePos1.setpreclear();
      bottlePos2.setpreclear();
      bottlePos3.setpreclear();
      bottlePos4.setpreclear();
      bottlePos5.setpreclear();
      aligned.setpreclear();
      enableRotary.setpreclear();
      rotate.setpreclear();
      rotaryDone.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottlePos1.getStatus() ? bottlePos1.setprepresent() : bottlePos1.setpreclear();
      bottlePos1.setpreval(bottlePos1.getValue());
      bottlePos1.setClear();
      dummyint = bottlePos2.getStatus() ? bottlePos2.setprepresent() : bottlePos2.setpreclear();
      bottlePos2.setpreval(bottlePos2.getValue());
      bottlePos2.setClear();
      dummyint = bottlePos3.getStatus() ? bottlePos3.setprepresent() : bottlePos3.setpreclear();
      bottlePos3.setpreval(bottlePos3.getValue());
      bottlePos3.setClear();
      dummyint = bottlePos4.getStatus() ? bottlePos4.setprepresent() : bottlePos4.setpreclear();
      bottlePos4.setpreval(bottlePos4.getValue());
      bottlePos4.setClear();
      dummyint = bottlePos5.getStatus() ? bottlePos5.setprepresent() : bottlePos5.setpreclear();
      bottlePos5.setpreval(bottlePos5.getValue());
      bottlePos5.setClear();
      dummyint = aligned.getStatus() ? aligned.setprepresent() : aligned.setpreclear();
      aligned.setpreval(aligned.getValue());
      aligned.setClear();
      dummyint = enableRotary.getStatus() ? enableRotary.setprepresent() : enableRotary.setpreclear();
      enableRotary.setpreval(enableRotary.getValue());
      enableRotary.setClear();
      rotate.sethook();
      rotate.setClear();
      rotaryDone.sethook();
      rotaryDone.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        bottlePos1.gethook();
        bottlePos2.gethook();
        bottlePos3.gethook();
        bottlePos4.gethook();
        bottlePos5.gethook();
        aligned.gethook();
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
