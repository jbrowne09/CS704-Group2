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
  private int S2558 = 1;
  private int S2460 = 1;
  private int S2438 = 1;
  private int S2492 = 1;
  private int S2470 = 1;
  private int S2524 = 1;
  private int S2502 = 1;
  private int S2556 = 1;
  private int S2534 = 1;
  
  private int[] ends = new int[6];
  private int[] tdone = new int[6];
  
  public void thread2568(int [] tdone, int [] ends){
        switch(S2556){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S2534){
          case 0 : 
            if(bottlePos4.getprestatus()){//sysj\rotaryController.sysj line: 52, column: 10
              S2534=1;
              rotate.setPresent();//sysj\rotaryController.sysj line: 54, column: 5
              currsigs.addElement(rotate);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            if(aligned.getprestatus()){//sysj\rotaryController.sysj line: 53, column: 10
              S2534=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              rotate.setPresent();//sysj\rotaryController.sysj line: 54, column: 5
              currsigs.addElement(rotate);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2567(int [] tdone, int [] ends){
        switch(S2524){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S2502){
          case 0 : 
            if(bottlePos3.getprestatus()){//sysj\rotaryController.sysj line: 43, column: 10
              S2502=1;
              rotate.setPresent();//sysj\rotaryController.sysj line: 45, column: 5
              currsigs.addElement(rotate);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            if(aligned.getprestatus()){//sysj\rotaryController.sysj line: 44, column: 10
              S2502=0;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              rotate.setPresent();//sysj\rotaryController.sysj line: 45, column: 5
              currsigs.addElement(rotate);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2566(int [] tdone, int [] ends){
        switch(S2492){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S2470){
          case 0 : 
            if(bottlePos2.getprestatus()){//sysj\rotaryController.sysj line: 34, column: 10
              S2470=1;
              rotate.setPresent();//sysj\rotaryController.sysj line: 36, column: 5
              currsigs.addElement(rotate);
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
            if(aligned.getprestatus()){//sysj\rotaryController.sysj line: 35, column: 10
              S2470=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              rotate.setPresent();//sysj\rotaryController.sysj line: 36, column: 5
              currsigs.addElement(rotate);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2565(int [] tdone, int [] ends){
        switch(S2460){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S2438){
          case 0 : 
            if(bottlePos1.getprestatus()){//sysj\rotaryController.sysj line: 25, column: 10
              S2438=1;
              rotate.setPresent();//sysj\rotaryController.sysj line: 27, column: 5
              currsigs.addElement(rotate);
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
            if(aligned.getprestatus()){//sysj\rotaryController.sysj line: 26, column: 10
              S2438=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              rotate.setPresent();//sysj\rotaryController.sysj line: 27, column: 5
              currsigs.addElement(rotate);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2563(int [] tdone, int [] ends){
        S2556=1;
    S2534=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread2562(int [] tdone, int [] ends){
        S2524=1;
    S2502=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread2561(int [] tdone, int [] ends){
        S2492=1;
    S2470=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread2560(int [] tdone, int [] ends){
        S2460=1;
    S2438=0;
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
      switch(S2558){
        case 0 : 
          S2558=0;
          break RUN;
        
        case 1 : 
          S2558=2;
          S2558=2;
          thread2560(tdone,ends);
          thread2561(tdone,ends);
          thread2562(tdone,ends);
          thread2563(tdone,ends);
          int biggest2564 = 0;
          if(ends[2]>=biggest2564){
            biggest2564=ends[2];
          }
          if(ends[3]>=biggest2564){
            biggest2564=ends[3];
          }
          if(ends[4]>=biggest2564){
            biggest2564=ends[4];
          }
          if(ends[5]>=biggest2564){
            biggest2564=ends[5];
          }
          if(biggest2564 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread2565(tdone,ends);
          thread2566(tdone,ends);
          thread2567(tdone,ends);
          thread2568(tdone,ends);
          int biggest2569 = 0;
          if(ends[2]>=biggest2569){
            biggest2569=ends[2];
          }
          if(ends[3]>=biggest2569){
            biggest2569=ends[3];
          }
          if(ends[4]>=biggest2569){
            biggest2569=ends[4];
          }
          if(ends[5]>=biggest2569){
            biggest2569=ends[5];
          }
          if(biggest2569 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2569 == 0){
            S2558=0;
            active[1]=0;
            ends[1]=0;
            S2558=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0};
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
