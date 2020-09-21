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
  public Signal bottlePos2 = new Signal("bottlePos2", Signal.INPUT);
  public Signal bottlePos3 = new Signal("bottlePos3", Signal.INPUT);
  public Signal bottlePos4 = new Signal("bottlePos4", Signal.INPUT);
  public Signal bottlePos5 = new Signal("bottlePos5", Signal.INPUT);
  public Signal aligned = new Signal("aligned", Signal.INPUT);
  public Signal rotaryEnable = new Signal("rotaryEnable", Signal.INPUT);
  public Signal rotate = new Signal("rotate", Signal.OUTPUT);
  public Signal NbottlePos2 = new Signal("NbottlePos2", Signal.OUTPUT);
  public Signal NbottlePos3 = new Signal("NbottlePos3", Signal.OUTPUT);
  public Signal NbottlePos4 = new Signal("NbottlePos4", Signal.OUTPUT);
  public Signal NbottlePos5 = new Signal("NbottlePos5", Signal.OUTPUT);
  public Signal Naligned = new Signal("Naligned", Signal.OUTPUT);
  private int S2358 = 1;
  private int S2316 = 1;
  private int S2310 = 1;
  private int S2324 = 1;
  private int S2332 = 1;
  private int S2340 = 1;
  private int S2348 = 1;
  private int S2356 = 1;
  
  private int[] ends = new int[8];
  private int[] tdone = new int[8];
  
  public void thread2372(int [] tdone, int [] ends){
        switch(S2356){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(rotaryEnable.getprestatus()){//sysj\rotaryController.sysj line: 28, column: 25
          rotate.setPresent();//sysj\rotaryController.sysj line: 28, column: 40
          currsigs.addElement(rotate);
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        else {
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread2371(int [] tdone, int [] ends){
        switch(S2348){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(aligned.getprestatus()){//sysj\rotaryController.sysj line: 26, column: 25
          Naligned.setPresent();//sysj\rotaryController.sysj line: 26, column: 35
          currsigs.addElement(Naligned);
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        else {
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread2370(int [] tdone, int [] ends){
        switch(S2340){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(bottlePos5.getprestatus()){//sysj\rotaryController.sysj line: 24, column: 25
          NbottlePos5.setPresent();//sysj\rotaryController.sysj line: 24, column: 38
          currsigs.addElement(NbottlePos5);
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
      
    }
  }

  public void thread2369(int [] tdone, int [] ends){
        switch(S2332){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(bottlePos4.getprestatus()){//sysj\rotaryController.sysj line: 22, column: 25
          NbottlePos4.setPresent();//sysj\rotaryController.sysj line: 22, column: 38
          currsigs.addElement(NbottlePos4);
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
      
    }
  }

  public void thread2368(int [] tdone, int [] ends){
        switch(S2324){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(bottlePos3.getprestatus()){//sysj\rotaryController.sysj line: 20, column: 25
          NbottlePos3.setPresent();//sysj\rotaryController.sysj line: 20, column: 38
          currsigs.addElement(NbottlePos3);
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
      
    }
  }

  public void thread2367(int [] tdone, int [] ends){
        switch(S2316){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S2310){
          case 0 : 
            S2310=0;
            if(bottlePos2.getprestatus()){//sysj\rotaryController.sysj line: 18, column: 25
              NbottlePos2.setPresent();//sysj\rotaryController.sysj line: 18, column: 38
              currsigs.addElement(NbottlePos2);
              S2310=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S2310=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            S2310=1;
            S2310=0;
            if(bottlePos2.getprestatus()){//sysj\rotaryController.sysj line: 18, column: 25
              NbottlePos2.setPresent();//sysj\rotaryController.sysj line: 18, column: 38
              currsigs.addElement(NbottlePos2);
              S2310=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S2310=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2365(int [] tdone, int [] ends){
        S2356=1;
    if(rotaryEnable.getprestatus()){//sysj\rotaryController.sysj line: 28, column: 25
      rotate.setPresent();//sysj\rotaryController.sysj line: 28, column: 40
      currsigs.addElement(rotate);
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread2364(int [] tdone, int [] ends){
        S2348=1;
    if(aligned.getprestatus()){//sysj\rotaryController.sysj line: 26, column: 25
      Naligned.setPresent();//sysj\rotaryController.sysj line: 26, column: 35
      currsigs.addElement(Naligned);
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread2363(int [] tdone, int [] ends){
        S2340=1;
    if(bottlePos5.getprestatus()){//sysj\rotaryController.sysj line: 24, column: 25
      NbottlePos5.setPresent();//sysj\rotaryController.sysj line: 24, column: 38
      currsigs.addElement(NbottlePos5);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread2362(int [] tdone, int [] ends){
        S2332=1;
    if(bottlePos4.getprestatus()){//sysj\rotaryController.sysj line: 22, column: 25
      NbottlePos4.setPresent();//sysj\rotaryController.sysj line: 22, column: 38
      currsigs.addElement(NbottlePos4);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread2361(int [] tdone, int [] ends){
        S2324=1;
    if(bottlePos3.getprestatus()){//sysj\rotaryController.sysj line: 20, column: 25
      NbottlePos3.setPresent();//sysj\rotaryController.sysj line: 20, column: 38
      currsigs.addElement(NbottlePos3);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread2360(int [] tdone, int [] ends){
        S2316=1;
    S2310=0;
    if(bottlePos2.getprestatus()){//sysj\rotaryController.sysj line: 18, column: 25
      NbottlePos2.setPresent();//sysj\rotaryController.sysj line: 18, column: 38
      currsigs.addElement(NbottlePos2);
      S2310=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      S2310=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S2358){
        case 0 : 
          S2358=0;
          break RUN;
        
        case 1 : 
          S2358=2;
          S2358=2;
          thread2360(tdone,ends);
          thread2361(tdone,ends);
          thread2362(tdone,ends);
          thread2363(tdone,ends);
          thread2364(tdone,ends);
          thread2365(tdone,ends);
          int biggest2366 = 0;
          if(ends[2]>=biggest2366){
            biggest2366=ends[2];
          }
          if(ends[3]>=biggest2366){
            biggest2366=ends[3];
          }
          if(ends[4]>=biggest2366){
            biggest2366=ends[4];
          }
          if(ends[5]>=biggest2366){
            biggest2366=ends[5];
          }
          if(ends[6]>=biggest2366){
            biggest2366=ends[6];
          }
          if(ends[7]>=biggest2366){
            biggest2366=ends[7];
          }
          if(biggest2366 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread2367(tdone,ends);
          thread2368(tdone,ends);
          thread2369(tdone,ends);
          thread2370(tdone,ends);
          thread2371(tdone,ends);
          thread2372(tdone,ends);
          int biggest2373 = 0;
          if(ends[2]>=biggest2373){
            biggest2373=ends[2];
          }
          if(ends[3]>=biggest2373){
            biggest2373=ends[3];
          }
          if(ends[4]>=biggest2373){
            biggest2373=ends[4];
          }
          if(ends[5]>=biggest2373){
            biggest2373=ends[5];
          }
          if(ends[6]>=biggest2373){
            biggest2373=ends[6];
          }
          if(ends[7]>=biggest2373){
            biggest2373=ends[7];
          }
          if(biggest2373 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2373 == 0){
            S2358=0;
            active[1]=0;
            ends[1]=0;
            S2358=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0};
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
          bottlePos2.gethook();
          bottlePos3.gethook();
          bottlePos4.gethook();
          bottlePos5.gethook();
          aligned.gethook();
          rotaryEnable.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottlePos2.setpreclear();
      bottlePos3.setpreclear();
      bottlePos4.setpreclear();
      bottlePos5.setpreclear();
      aligned.setpreclear();
      rotaryEnable.setpreclear();
      rotate.setpreclear();
      NbottlePos2.setpreclear();
      NbottlePos3.setpreclear();
      NbottlePos4.setpreclear();
      NbottlePos5.setpreclear();
      Naligned.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
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
      dummyint = rotaryEnable.getStatus() ? rotaryEnable.setprepresent() : rotaryEnable.setpreclear();
      rotaryEnable.setpreval(rotaryEnable.getValue());
      rotaryEnable.setClear();
      rotate.sethook();
      rotate.setClear();
      NbottlePos2.sethook();
      NbottlePos2.setClear();
      NbottlePos3.sethook();
      NbottlePos3.setClear();
      NbottlePos4.sethook();
      NbottlePos4.setClear();
      NbottlePos5.sethook();
      NbottlePos5.setClear();
      Naligned.sethook();
      Naligned.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        bottlePos2.gethook();
        bottlePos3.gethook();
        bottlePos4.gethook();
        bottlePos5.gethook();
        aligned.gethook();
        rotaryEnable.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
