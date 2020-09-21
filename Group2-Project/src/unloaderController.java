import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class unloaderController extends ClockDomain{
  public unloaderController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottleAtEnd = new Signal("bottleAtEnd", Signal.INPUT);
  public Signal CMDfd = new Signal("CMDfd", Signal.INPUT);
  public Signal tick = new Signal("tick", Signal.INPUT);
  public Signal unloaderDone = new Signal("unloaderDone", Signal.OUTPUT);
  public Signal CMD2 = new Signal("CMD2", Signal.OUTPUT);
  private int S2262 = 1;
  private int S2261 = 1;
  private int S1970 = 1;
  
  private int[] ends = new int[2];
  private int[] tdone = new int[2];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S2262){
        case 0 : 
          S2262=0;
          break RUN;
        
        case 1 : 
          S2262=2;
          S2262=2;
          S2261=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          switch(S2261){
            case 0 : 
              if(tick.getprestatus()){//sysj\nloaderController.sysj line: 8, column: 8
                S2261=1;
                S1970=0;
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
              switch(S1970){
                case 0 : 
                  if(!tick.getprestatus()){//sysj\nloaderController.sysj line: 11, column: 9
                    S1970=1;
                    CMD2.setPresent();//sysj\nloaderController.sysj line: 13, column: 4
                    currsigs.addElement(CMD2);
                    CMD2.setValue("C2");//sysj\nloaderController.sysj line: 13, column: 4
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
                  if(tick.getprestatus()){//sysj\nloaderController.sysj line: 12, column: 9
                    S1970=2;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    CMD2.setPresent();//sysj\nloaderController.sysj line: 13, column: 4
                    currsigs.addElement(CMD2);
                    CMD2.setValue("C2");//sysj\nloaderController.sysj line: 13, column: 4
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 2 : 
                  if(!tick.getprestatus()){//sysj\nloaderController.sysj line: 15, column: 9
                    S1970=3;
                    CMD2.setPresent();//sysj\nloaderController.sysj line: 17, column: 4
                    currsigs.addElement(CMD2);
                    CMD2.setValue("G2");//sysj\nloaderController.sysj line: 17, column: 4
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
                  if(tick.getprestatus()){//sysj\nloaderController.sysj line: 16, column: 9
                    S1970=4;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    CMD2.setPresent();//sysj\nloaderController.sysj line: 17, column: 4
                    currsigs.addElement(CMD2);
                    CMD2.setValue("G2");//sysj\nloaderController.sysj line: 17, column: 4
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 4 : 
                  if(!tick.getprestatus()){//sysj\nloaderController.sysj line: 19, column: 9
                    S1970=5;
                    CMD2.setPresent();//sysj\nloaderController.sysj line: 21, column: 4
                    currsigs.addElement(CMD2);
                    CMD2.setValue("B2");//sysj\nloaderController.sysj line: 21, column: 4
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 5 : 
                  if(tick.getprestatus()){//sysj\nloaderController.sysj line: 20, column: 9
                    S1970=6;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    CMD2.setPresent();//sysj\nloaderController.sysj line: 21, column: 4
                    currsigs.addElement(CMD2);
                    CMD2.setValue("B2");//sysj\nloaderController.sysj line: 21, column: 4
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 6 : 
                  if(!tick.getprestatus()){//sysj\nloaderController.sysj line: 23, column: 9
                    S1970=7;
                    CMD2.setPresent();//sysj\nloaderController.sysj line: 25, column: 4
                    currsigs.addElement(CMD2);
                    CMD2.setValue("O2");//sysj\nloaderController.sysj line: 25, column: 4
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 7 : 
                  if(tick.getprestatus()){//sysj\nloaderController.sysj line: 24, column: 9
                    S1970=8;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    CMD2.setPresent();//sysj\nloaderController.sysj line: 25, column: 4
                    currsigs.addElement(CMD2);
                    CMD2.setValue("O2");//sysj\nloaderController.sysj line: 25, column: 4
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 8 : 
                  if(!tick.getprestatus()){//sysj\nloaderController.sysj line: 27, column: 9
                    S1970=9;
                    CMD2.setPresent();//sysj\nloaderController.sysj line: 29, column: 4
                    currsigs.addElement(CMD2);
                    CMD2.setValue("A2");//sysj\nloaderController.sysj line: 29, column: 4
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 9 : 
                  if(tick.getprestatus()){//sysj\nloaderController.sysj line: 28, column: 9
                    unloaderDone.setPresent();//sysj\nloaderController.sysj line: 31, column: 3
                    currsigs.addElement(unloaderDone);
                    S1970=10;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    CMD2.setPresent();//sysj\nloaderController.sysj line: 29, column: 4
                    currsigs.addElement(CMD2);
                    CMD2.setValue("A2");//sysj\nloaderController.sysj line: 29, column: 4
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 10 : 
                  S1970=10;
                  S1970=0;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                
              }
              break;
            
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
          bottleAtEnd.gethook();
          CMDfd.gethook();
          tick.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleAtEnd.setpreclear();
      CMDfd.setpreclear();
      tick.setpreclear();
      unloaderDone.setpreclear();
      CMD2.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottleAtEnd.getStatus() ? bottleAtEnd.setprepresent() : bottleAtEnd.setpreclear();
      bottleAtEnd.setpreval(bottleAtEnd.getValue());
      bottleAtEnd.setClear();
      dummyint = CMDfd.getStatus() ? CMDfd.setprepresent() : CMDfd.setpreclear();
      CMDfd.setpreval(CMDfd.getValue());
      CMDfd.setClear();
      dummyint = tick.getStatus() ? tick.setprepresent() : tick.setpreclear();
      tick.setpreval(tick.getValue());
      tick.setClear();
      unloaderDone.sethook();
      unloaderDone.setClear();
      CMD2.sethook();
      CMD2.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        bottleAtEnd.gethook();
        CMDfd.gethook();
        tick.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
