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
  public Signal bottleAtPoint = new Signal("bottleAtPoint", Signal.INPUT);
  public Signal CMDfb = new Signal("CMDfb", Signal.INPUT);
  public Signal ready = new Signal("ready", Signal.INPUT);
  public Signal loaderDone = new Signal("loaderDone", Signal.OUTPUT);
  public Signal CMD = new Signal("CMD", Signal.OUTPUT);
  private int S1665 = 1;
  private int S1493 = 1;
  
  private int[] ends = new int[2];
  private int[] tdone = new int[2];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S1665){
        case 0 : 
          S1665=0;
          break RUN;
        
        case 1 : 
          S1665=2;
          S1665=2;
          S1493=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          switch(S1493){
            case 0 : 
              if(!CMDfb.getprestatus()){//sysj\loaderController.sysj line: 10, column: 9
                S1493=1;
                CMD.setPresent();//sysj\loaderController.sysj line: 12, column: 4
                currsigs.addElement(CMD);
                CMD.setValue("B");//sysj\loaderController.sysj line: 12, column: 4
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
              if(CMDfb.getprestatus()){//sysj\loaderController.sysj line: 11, column: 9
                S1493=2;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                CMD.setPresent();//sysj\loaderController.sysj line: 12, column: 4
                currsigs.addElement(CMD);
                CMD.setValue("B");//sysj\loaderController.sysj line: 12, column: 4
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 2 : 
              if(!CMDfb.getprestatus()){//sysj\loaderController.sysj line: 14, column: 9
                S1493=3;
                CMD.setPresent();//sysj\loaderController.sysj line: 16, column: 4
                currsigs.addElement(CMD);
                CMD.setValue("G");//sysj\loaderController.sysj line: 16, column: 4
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
              if(CMDfb.getprestatus()){//sysj\loaderController.sysj line: 15, column: 9
                S1493=4;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                CMD.setPresent();//sysj\loaderController.sysj line: 16, column: 4
                currsigs.addElement(CMD);
                CMD.setValue("G");//sysj\loaderController.sysj line: 16, column: 4
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 4 : 
              if(!CMDfb.getprestatus()){//sysj\loaderController.sysj line: 18, column: 9
                S1493=5;
                CMD.setPresent();//sysj\loaderController.sysj line: 20, column: 4
                currsigs.addElement(CMD);
                CMD.setValue("C");//sysj\loaderController.sysj line: 20, column: 4
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
              if(CMDfb.getprestatus()){//sysj\loaderController.sysj line: 19, column: 9
                S1493=6;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                CMD.setPresent();//sysj\loaderController.sysj line: 20, column: 4
                currsigs.addElement(CMD);
                CMD.setValue("C");//sysj\loaderController.sysj line: 20, column: 4
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 6 : 
              if(!CMDfb.getprestatus()){//sysj\loaderController.sysj line: 22, column: 9
                S1493=7;
                CMD.setPresent();//sysj\loaderController.sysj line: 24, column: 4
                currsigs.addElement(CMD);
                CMD.setValue("D");//sysj\loaderController.sysj line: 24, column: 4
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
              if(CMDfb.getprestatus()){//sysj\loaderController.sysj line: 23, column: 9
                S1493=8;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                CMD.setPresent();//sysj\loaderController.sysj line: 24, column: 4
                currsigs.addElement(CMD);
                CMD.setValue("D");//sysj\loaderController.sysj line: 24, column: 4
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 8 : 
              if(!CMDfb.getprestatus()){//sysj\loaderController.sysj line: 26, column: 9
                S1493=9;
                CMD.setPresent();//sysj\loaderController.sysj line: 28, column: 4
                currsigs.addElement(CMD);
                CMD.setValue("O");//sysj\loaderController.sysj line: 28, column: 4
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
              if(CMDfb.getprestatus()){//sysj\loaderController.sysj line: 27, column: 9
                S1493=10;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                CMD.setPresent();//sysj\loaderController.sysj line: 28, column: 4
                currsigs.addElement(CMD);
                CMD.setValue("O");//sysj\loaderController.sysj line: 28, column: 4
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 10 : 
              if(!CMDfb.getprestatus()){//sysj\loaderController.sysj line: 30, column: 9
                S1493=11;
                CMD.setPresent();//sysj\loaderController.sysj line: 32, column: 4
                currsigs.addElement(CMD);
                CMD.setValue("A");//sysj\loaderController.sysj line: 32, column: 4
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 11 : 
              if(CMDfb.getprestatus()){//sysj\loaderController.sysj line: 31, column: 9
                S1493=12;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                CMD.setPresent();//sysj\loaderController.sysj line: 32, column: 4
                currsigs.addElement(CMD);
                CMD.setValue("A");//sysj\loaderController.sysj line: 32, column: 4
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 12 : 
              S1493=12;
              S1493=0;
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
          bottleAtPoint.gethook();
          CMDfb.gethook();
          ready.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleAtPoint.setpreclear();
      CMDfb.setpreclear();
      ready.setpreclear();
      loaderDone.setpreclear();
      CMD.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottleAtPoint.getStatus() ? bottleAtPoint.setprepresent() : bottleAtPoint.setpreclear();
      bottleAtPoint.setpreval(bottleAtPoint.getValue());
      bottleAtPoint.setClear();
      dummyint = CMDfb.getStatus() ? CMDfb.setprepresent() : CMDfb.setpreclear();
      CMDfb.setpreval(CMDfb.getValue());
      CMDfb.setClear();
      dummyint = ready.getStatus() ? ready.setprepresent() : ready.setpreclear();
      ready.setpreval(ready.getValue());
      ready.setClear();
      loaderDone.sethook();
      loaderDone.setClear();
      CMD.sethook();
      CMD.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        bottleAtPoint.gethook();
        CMDfb.gethook();
        ready.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
