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
  public Signal tick = new Signal("tick", Signal.INPUT);
  public Signal enableRotary = new Signal("enableRotary", Signal.INPUT);
  public Signal rotate = new Signal("rotate", Signal.OUTPUT);
  public Signal rotaryDone = new Signal("rotaryDone", Signal.OUTPUT);
  private Signal help_1;
  private long __start_thread_3;//sysj\rotaryController.sysj line: 18, column: 1
  private int S2476 = 1;
  private int S2443 = 1;
  private int S2433 = 1;
  private int S2474 = 1;
  private int S2445 = 1;
  
  private int[] ends = new int[4];
  private int[] tdone = new int[4];
  
  public void thread2482(int [] tdone, int [] ends){
        switch(S2474){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S2445){
          case 0 : 
            if(rotate.getprestatus()){//sysj\rotaryController.sysj line: 20, column: 9
              System.out.println("waiting");//sysj\rotaryController.sysj line: 21, column: 3
              S2445=1;
              __start_thread_3 = com.systemj.Timer.getMs();//sysj\rotaryController.sysj line: 18, column: 1
              if(com.systemj.Timer.getMs() - __start_thread_3 >= 500){//sysj\rotaryController.sysj line: 18, column: 1
                ends[3]=2;
                ;//sysj\rotaryController.sysj line: 18, column: 1
                help_1.setPresent();//sysj\rotaryController.sysj line: 23, column: 4
                currsigs.addElement(help_1);
                System.out.println("help");//sysj\rotaryController.sysj line: 24, column: 4
                S2474=0;
                active[3]=0;
                ends[3]=0;
                tdone[3]=1;
              }
              else {
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if(com.systemj.Timer.getMs() - __start_thread_3 >= 500){//sysj\rotaryController.sysj line: 18, column: 1
              ends[3]=2;
              ;//sysj\rotaryController.sysj line: 18, column: 1
              help_1.setPresent();//sysj\rotaryController.sysj line: 23, column: 4
              currsigs.addElement(help_1);
              System.out.println("help");//sysj\rotaryController.sysj line: 24, column: 4
              S2474=0;
              active[3]=0;
              ends[3]=0;
              tdone[3]=1;
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2481(int [] tdone, int [] ends){
        switch(S2443){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S2433){
          case 0 : 
            if(tick.getprestatus()){//sysj\rotaryController.sysj line: 10, column: 9
              S2433=1;
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
            if(!tick.getprestatus()){//sysj\rotaryController.sysj line: 11, column: 9
              rotate.setPresent();//sysj\rotaryController.sysj line: 13, column: 4
              currsigs.addElement(rotate);
              S2433=0;
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
          
        }
        break;
      
    }
  }

  public void thread2479(int [] tdone, int [] ends){
        S2474=1;
    S2445=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread2478(int [] tdone, int [] ends){
        S2443=1;
    S2433=0;
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
      switch(S2476){
        case 0 : 
          S2476=0;
          break RUN;
        
        case 1 : 
          S2476=2;
          S2476=2;
          help_1.setClear();//sysj\rotaryController.sysj line: 7, column: 1
          thread2478(tdone,ends);
          thread2479(tdone,ends);
          int biggest2480 = 0;
          if(ends[2]>=biggest2480){
            biggest2480=ends[2];
          }
          if(ends[3]>=biggest2480){
            biggest2480=ends[3];
          }
          if(biggest2480 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          help_1.setClear();//sysj\rotaryController.sysj line: 7, column: 1
          thread2481(tdone,ends);
          thread2482(tdone,ends);
          int biggest2483 = 0;
          if(ends[2]>=biggest2483){
            biggest2483=ends[2];
          }
          if(ends[3]>=biggest2483){
            biggest2483=ends[3];
          }
          if(biggest2483 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2483 == 0){
            S2476=0;
            active[1]=0;
            ends[1]=0;
            S2476=0;
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
    help_1 = new Signal();
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
          tick.gethook();
          enableRotary.gethook();
          df = true;
        }
        runClockDomain();
      }
      aligned.setpreclear();
      bottlePos5.setpreclear();
      capPos1.setpreclear();
      tick.setpreclear();
      enableRotary.setpreclear();
      rotate.setpreclear();
      rotaryDone.setpreclear();
      help_1.setpreclear();
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
      dummyint = tick.getStatus() ? tick.setprepresent() : tick.setpreclear();
      tick.setpreval(tick.getValue());
      tick.setClear();
      dummyint = enableRotary.getStatus() ? enableRotary.setprepresent() : enableRotary.setpreclear();
      enableRotary.setpreval(enableRotary.getValue());
      enableRotary.setClear();
      rotate.sethook();
      rotate.setClear();
      rotaryDone.sethook();
      rotaryDone.setClear();
      help_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        aligned.gethook();
        bottlePos5.gethook();
        capPos1.gethook();
        tick.gethook();
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
