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
  private int S1949 = 1;
  private int S1923 = 1;
  private int S1889 = 1;
  private int S1931 = 1;
  private int S1925 = 1;
  private int S1939 = 1;
  private int S1947 = 1;
  
  private int[] ends = new int[6];
  private int[] tdone = new int[6];
  
  public void thread1959(int [] tdone, int [] ends){
        switch(S1947){
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

  public void thread1958(int [] tdone, int [] ends){
        switch(S1939){
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

  public void thread1957(int [] tdone, int [] ends){
        switch(S1931){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S1925){
          case 0 : 
            S1925=0;
            if(NbottlePos1.getprestatus()){//sysj\rotaryController.sysj line: 42, column: 27
              CbottlePos1.setPresent();//sysj\rotaryController.sysj line: 42, column: 41
              currsigs.addElement(CbottlePos1);
              S1925=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S1925=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            S1925=1;
            S1925=0;
            if(NbottlePos1.getprestatus()){//sysj\rotaryController.sysj line: 42, column: 27
              CbottlePos1.setPresent();//sysj\rotaryController.sysj line: 42, column: 41
              currsigs.addElement(CbottlePos1);
              S1925=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S1925=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1956(int [] tdone, int [] ends){
        switch(S1923){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S1889){
          case 0 : 
            if(NbottlePos1.getprestatus() || bottlePos2.getprestatus() || bottlePos3.getprestatus() || bottlePos4.getprestatus()){//sysj\rotaryController.sysj line: 24, column: 10
              S1889=1;
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
              S1889=2;
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
              S1889=0;
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

  public void thread1954(int [] tdone, int [] ends){
        S1947=1;
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

  public void thread1953(int [] tdone, int [] ends){
        S1939=1;
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

  public void thread1952(int [] tdone, int [] ends){
        S1931=1;
    S1925=0;
    if(NbottlePos1.getprestatus()){//sysj\rotaryController.sysj line: 42, column: 27
      CbottlePos1.setPresent();//sysj\rotaryController.sysj line: 42, column: 41
      currsigs.addElement(CbottlePos1);
      S1925=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S1925=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread1951(int [] tdone, int [] ends){
        S1923=1;
    S1889=0;
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
      switch(S1949){
        case 0 : 
          S1949=0;
          break RUN;
        
        case 1 : 
          S1949=2;
          S1949=2;
          thread1951(tdone,ends);
          thread1952(tdone,ends);
          thread1953(tdone,ends);
          thread1954(tdone,ends);
          int biggest1955 = 0;
          if(ends[2]>=biggest1955){
            biggest1955=ends[2];
          }
          if(ends[3]>=biggest1955){
            biggest1955=ends[3];
          }
          if(ends[4]>=biggest1955){
            biggest1955=ends[4];
          }
          if(ends[5]>=biggest1955){
            biggest1955=ends[5];
          }
          if(biggest1955 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread1956(tdone,ends);
          thread1957(tdone,ends);
          thread1958(tdone,ends);
          thread1959(tdone,ends);
          int biggest1960 = 0;
          if(ends[2]>=biggest1960){
            biggest1960=ends[2];
          }
          if(ends[3]>=biggest1960){
            biggest1960=ends[3];
          }
          if(ends[4]>=biggest1960){
            biggest1960=ends[4];
          }
          if(ends[5]>=biggest1960){
            biggest1960=ends[5];
          }
          if(biggest1960 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1960 == 0){
            S1949=0;
            active[1]=0;
            ends[1]=0;
            S1949=0;
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
