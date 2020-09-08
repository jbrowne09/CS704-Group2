import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class mainController extends ClockDomain{
  public mainController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal conveyerDone = new Signal("conveyerDone", Signal.INPUT);
  public Signal request = new Signal("request", Signal.INPUT);
  public Signal enable = new Signal("enable", Signal.INPUT);
  public Signal conveyer_enable = new Signal("conveyer_enable", Signal.OUTPUT);
  public Signal rotary_enable = new Signal("rotary_enable", Signal.OUTPUT);
  public Signal capper_enable = new Signal("capper_enable", Signal.OUTPUT);
  public Signal filler_enable = new Signal("filler_enable", Signal.OUTPUT);
  public Signal bottleLoader_enable = new Signal("bottleLoader_enable", Signal.OUTPUT);
  public Signal bottleUnloader_enable = new Signal("bottleUnloader_enable", Signal.OUTPUT);
  private int S407 = 1;
  private int S385 = 1;
  
  private int[] ends = new int[2];
  private int[] tdone = new int[2];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S407){
        case 0 : 
          S407=0;
          break RUN;
        
        case 1 : 
          S407=2;
          S407=2;
          S385=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          switch(S385){
            case 0 : 
              if(request.getprestatus()){//sysj\mainController.sysj line: 9, column: 9
                S385=1;
                conveyer_enable.setPresent();//sysj\mainController.sysj line: 11, column: 4
                currsigs.addElement(conveyer_enable);
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
              if(conveyerDone.getprestatus()){//sysj\mainController.sysj line: 10, column: 9
                S385=0;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                conveyer_enable.setPresent();//sysj\mainController.sysj line: 11, column: 4
                currsigs.addElement(conveyer_enable);
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
          conveyerDone.gethook();
          request.gethook();
          enable.gethook();
          df = true;
        }
        runClockDomain();
      }
      conveyerDone.setpreclear();
      request.setpreclear();
      enable.setpreclear();
      conveyer_enable.setpreclear();
      rotary_enable.setpreclear();
      capper_enable.setpreclear();
      filler_enable.setpreclear();
      bottleLoader_enable.setpreclear();
      bottleUnloader_enable.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = conveyerDone.getStatus() ? conveyerDone.setprepresent() : conveyerDone.setpreclear();
      conveyerDone.setpreval(conveyerDone.getValue());
      conveyerDone.setClear();
      dummyint = request.getStatus() ? request.setprepresent() : request.setpreclear();
      request.setpreval(request.getValue());
      request.setClear();
      dummyint = enable.getStatus() ? enable.setprepresent() : enable.setpreclear();
      enable.setpreval(enable.getValue());
      enable.setClear();
      conveyer_enable.sethook();
      conveyer_enable.setClear();
      rotary_enable.sethook();
      rotary_enable.setClear();
      capper_enable.sethook();
      capper_enable.setClear();
      filler_enable.sethook();
      filler_enable.setClear();
      bottleLoader_enable.sethook();
      bottleLoader_enable.setClear();
      bottleUnloader_enable.sethook();
      bottleUnloader_enable.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        conveyerDone.gethook();
        request.gethook();
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
