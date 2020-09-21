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
  public Signal NbottlePos1 = new Signal("NbottlePos1", Signal.INPUT);
  public Signal Nmotor = new Signal("Nmotor", Signal.INPUT);
  public Signal NbottlePos5 = new Signal("NbottlePos5", Signal.OUTPUT);
  public Signal rotate = new Signal("rotate", Signal.OUTPUT);
  public Signal CbottlePos1 = new Signal("CbottlePos1", Signal.OUTPUT);
  public Signal Cmotor = new Signal("Cmotor", Signal.OUTPUT);
  private int S2314 = 1;
  private int S2288 = 1;
  private int S2254 = 1;
  private int S2296 = 1;
  private int S2290 = 1;
  private int S2304 = 1;
  private int S2312 = 1;
  
  private int[] ends = new int[6];
  private int[] tdone = new int[6];
  
  public void thread2324(int [] tdone, int [] ends){
        switch(S2312){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(bottlePos5.getprestatus()){//sysj\rotaryController.sysj line: 46, column: 27
          NbottlePos5.setPresent();//sysj\rotaryController.sysj line: 46, column: 40
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

  public void thread2323(int [] tdone, int [] ends){
        switch(S2304){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(Nmotor.getprestatus()){//sysj\rotaryController.sysj line: 44, column: 27
          Cmotor.setPresent();//sysj\rotaryController.sysj line: 44, column: 36
          currsigs.addElement(Cmotor);
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

  public void thread2322(int [] tdone, int [] ends){
        switch(S2296){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S2290){
          case 0 : 
            S2290=0;
            if(NbottlePos1.getprestatus()){//sysj\rotaryController.sysj line: 42, column: 27
              CbottlePos1.setPresent();//sysj\rotaryController.sysj line: 42, column: 41
              currsigs.addElement(CbottlePos1);
              S2290=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S2290=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            S2290=1;
            S2290=0;
            if(NbottlePos1.getprestatus()){//sysj\rotaryController.sysj line: 42, column: 27
              CbottlePos1.setPresent();//sysj\rotaryController.sysj line: 42, column: 41
              currsigs.addElement(CbottlePos1);
              S2290=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S2290=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2321(int [] tdone, int [] ends){
        switch(S2288){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S2254){
          case 0 : 
            if(NbottlePos1.getprestatus() || bottlePos2.getprestatus() || bottlePos3.getprestatus() || bottlePos4.getprestatus()){//sysj\rotaryController.sysj line: 24, column: 10
              S2254=1;
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
            if(!aligned.getprestatus()){//sysj\rotaryController.sysj line: 30, column: 11
              S2254=2;
              rotate.setPresent();//sysj\rotaryController.sysj line: 34, column: 6
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
          
          case 2 : 
            if(aligned.getprestatus()){//sysj\rotaryController.sysj line: 33, column: 11
              S2254=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              rotate.setPresent();//sysj\rotaryController.sysj line: 34, column: 6
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

  public void thread2319(int [] tdone, int [] ends){
        S2312=1;
    if(bottlePos5.getprestatus()){//sysj\rotaryController.sysj line: 46, column: 27
      NbottlePos5.setPresent();//sysj\rotaryController.sysj line: 46, column: 40
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

  public void thread2318(int [] tdone, int [] ends){
        S2304=1;
    if(Nmotor.getprestatus()){//sysj\rotaryController.sysj line: 44, column: 27
      Cmotor.setPresent();//sysj\rotaryController.sysj line: 44, column: 36
      currsigs.addElement(Cmotor);
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

  public void thread2317(int [] tdone, int [] ends){
        S2296=1;
    S2290=0;
    if(NbottlePos1.getprestatus()){//sysj\rotaryController.sysj line: 42, column: 27
      CbottlePos1.setPresent();//sysj\rotaryController.sysj line: 42, column: 41
      currsigs.addElement(CbottlePos1);
      S2290=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S2290=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread2316(int [] tdone, int [] ends){
        S2288=1;
    S2254=0;
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
      switch(S2314){
        case 0 : 
          S2314=0;
          break RUN;
        
        case 1 : 
          S2314=2;
          S2314=2;
          thread2316(tdone,ends);
          thread2317(tdone,ends);
          thread2318(tdone,ends);
          thread2319(tdone,ends);
          int biggest2320 = 0;
          if(ends[2]>=biggest2320){
            biggest2320=ends[2];
          }
          if(ends[3]>=biggest2320){
            biggest2320=ends[3];
          }
          if(ends[4]>=biggest2320){
            biggest2320=ends[4];
          }
          if(ends[5]>=biggest2320){
            biggest2320=ends[5];
          }
          if(biggest2320 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread2321(tdone,ends);
          thread2322(tdone,ends);
          thread2323(tdone,ends);
          thread2324(tdone,ends);
          int biggest2325 = 0;
          if(ends[2]>=biggest2325){
            biggest2325=ends[2];
          }
          if(ends[3]>=biggest2325){
            biggest2325=ends[3];
          }
          if(ends[4]>=biggest2325){
            biggest2325=ends[4];
          }
          if(ends[5]>=biggest2325){
            biggest2325=ends[5];
          }
          if(biggest2325 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2325 == 0){
            S2314=0;
            active[1]=0;
            ends[1]=0;
            S2314=0;
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
          bottlePos2.gethook();
          bottlePos3.gethook();
          bottlePos4.gethook();
          bottlePos5.gethook();
          aligned.gethook();
          rotaryEnable.gethook();
          NbottlePos1.gethook();
          Nmotor.gethook();
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
      NbottlePos1.setpreclear();
      Nmotor.setpreclear();
      NbottlePos5.setpreclear();
      rotate.setpreclear();
      CbottlePos1.setpreclear();
      Cmotor.setpreclear();
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
      dummyint = NbottlePos1.getStatus() ? NbottlePos1.setprepresent() : NbottlePos1.setpreclear();
      NbottlePos1.setpreval(NbottlePos1.getValue());
      NbottlePos1.setClear();
      dummyint = Nmotor.getStatus() ? Nmotor.setprepresent() : Nmotor.setpreclear();
      Nmotor.setpreval(Nmotor.getValue());
      Nmotor.setClear();
      NbottlePos5.sethook();
      NbottlePos5.setClear();
      rotate.sethook();
      rotate.setClear();
      CbottlePos1.sethook();
      CbottlePos1.setClear();
      Cmotor.sethook();
      Cmotor.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        bottlePos2.gethook();
        bottlePos3.gethook();
        bottlePos4.gethook();
        bottlePos5.gethook();
        aligned.gethook();
        rotaryEnable.gethook();
        NbottlePos1.gethook();
        Nmotor.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
