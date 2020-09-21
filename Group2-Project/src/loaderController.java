import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class loaderController extends ClockDomain{
  public loaderController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottleToLoad = new Signal("bottleToLoad", Signal.INPUT);
  public Signal CMDfb = new Signal("CMDfb", Signal.INPUT);
  public Signal tick = new Signal("tick", Signal.INPUT);
  public Signal loaderDone = new Signal("loaderDone", Signal.OUTPUT);
  public Signal CMD = new Signal("CMD", Signal.OUTPUT);
  private int S1537 = 1;
  private int S1536 = 1;
  private int S1184 = 1;
  
  private int[] ends = new int[2];
  private int[] tdone = new int[2];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S1537){
        case 0 : 
          S1537=0;
          break RUN;
        
        case 1 : 
          S1537=2;
          S1537=2;
          S1536=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          switch(S1536){
            case 0 : 
              if(tick.getprestatus()){//sysj\loaderController.sysj line: 7, column: 8
                S1536=1;
                System.out.println("in loader");//sysj\loaderController.sysj line: 9, column: 2
                S1184=0;
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
              switch(S1184){
                case 0 : 
                  if(bottleToLoad.getprestatus()){//sysj\loaderController.sysj line: 10, column: 9
                    System.out.println("received bottle");//sysj\loaderController.sysj line: 11, column: 3
                    S1184=1;
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
                  if(!tick.getprestatus()){//sysj\loaderController.sysj line: 12, column: 9
                    S1184=2;
                    CMD.setPresent();//sysj\loaderController.sysj line: 14, column: 4
                    currsigs.addElement(CMD);
                    CMD.setValue("B");//sysj\loaderController.sysj line: 14, column: 4
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
                  if(tick.getprestatus()){//sysj\loaderController.sysj line: 13, column: 9
                    S1184=3;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    CMD.setPresent();//sysj\loaderController.sysj line: 14, column: 4
                    currsigs.addElement(CMD);
                    CMD.setValue("B");//sysj\loaderController.sysj line: 14, column: 4
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 3 : 
                  if(!tick.getprestatus()){//sysj\loaderController.sysj line: 17, column: 9
                    S1184=4;
                    CMD.setPresent();//sysj\loaderController.sysj line: 19, column: 4
                    currsigs.addElement(CMD);
                    CMD.setValue("G");//sysj\loaderController.sysj line: 19, column: 4
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 4 : 
                  if(tick.getprestatus()){//sysj\loaderController.sysj line: 18, column: 9
                    S1184=5;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    CMD.setPresent();//sysj\loaderController.sysj line: 19, column: 4
                    currsigs.addElement(CMD);
                    CMD.setValue("G");//sysj\loaderController.sysj line: 19, column: 4
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 5 : 
                  if(!tick.getprestatus()){//sysj\loaderController.sysj line: 22, column: 9
                    S1184=6;
                    CMD.setPresent();//sysj\loaderController.sysj line: 24, column: 4
                    currsigs.addElement(CMD);
                    CMD.setValue("C");//sysj\loaderController.sysj line: 24, column: 4
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 6 : 
                  if(tick.getprestatus()){//sysj\loaderController.sysj line: 23, column: 9
                    S1184=7;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    CMD.setPresent();//sysj\loaderController.sysj line: 24, column: 4
                    currsigs.addElement(CMD);
                    CMD.setValue("C");//sysj\loaderController.sysj line: 24, column: 4
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 7 : 
                  if(!tick.getprestatus()){//sysj\loaderController.sysj line: 27, column: 9
                    S1184=8;
                    CMD.setPresent();//sysj\loaderController.sysj line: 29, column: 4
                    currsigs.addElement(CMD);
                    CMD.setValue("O");//sysj\loaderController.sysj line: 29, column: 4
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 8 : 
                  if(tick.getprestatus()){//sysj\loaderController.sysj line: 28, column: 9
                    S1184=9;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    CMD.setPresent();//sysj\loaderController.sysj line: 29, column: 4
                    currsigs.addElement(CMD);
                    CMD.setValue("O");//sysj\loaderController.sysj line: 29, column: 4
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 9 : 
                  if(!tick.getprestatus()){//sysj\loaderController.sysj line: 32, column: 9
                    S1184=10;
                    CMD.setPresent();//sysj\loaderController.sysj line: 34, column: 4
                    currsigs.addElement(CMD);
                    CMD.setValue("A");//sysj\loaderController.sysj line: 34, column: 4
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 10 : 
                  if(tick.getprestatus()){//sysj\loaderController.sysj line: 33, column: 9
                    S1184=11;
                    loaderDone.setPresent();//sysj\loaderController.sysj line: 36, column: 3
                    currsigs.addElement(loaderDone);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    CMD.setPresent();//sysj\loaderController.sysj line: 34, column: 4
                    currsigs.addElement(CMD);
                    CMD.setValue("A");//sysj\loaderController.sysj line: 34, column: 4
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 11 : 
                  loaderDone.setPresent();//sysj\loaderController.sysj line: 36, column: 3
                  currsigs.addElement(loaderDone);
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                
                case 12 : 
                  S1184=12;
                  System.out.println("in loader");//sysj\loaderController.sysj line: 9, column: 2
                  S1184=0;
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
          bottleToLoad.gethook();
          CMDfb.gethook();
          tick.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleToLoad.setpreclear();
      CMDfb.setpreclear();
      tick.setpreclear();
      loaderDone.setpreclear();
      CMD.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottleToLoad.getStatus() ? bottleToLoad.setprepresent() : bottleToLoad.setpreclear();
      bottleToLoad.setpreval(bottleToLoad.getValue());
      bottleToLoad.setClear();
      dummyint = CMDfb.getStatus() ? CMDfb.setprepresent() : CMDfb.setpreclear();
      CMDfb.setpreval(CMDfb.getValue());
      CMDfb.setClear();
      dummyint = tick.getStatus() ? tick.setprepresent() : tick.setpreclear();
      tick.setpreval(tick.getValue());
      tick.setClear();
      loaderDone.sethook();
      loaderDone.setClear();
      CMD.sethook();
      CMD.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        bottleToLoad.gethook();
        CMDfb.gethook();
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
