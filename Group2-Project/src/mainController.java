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
  public Signal NbottleLeft5 = new Signal("NbottleLeft5", Signal.INPUT);
  public Signal NbottlePos1 = new Signal("NbottlePos1", Signal.INPUT);
  public Signal NbottlePos2 = new Signal("NbottlePos2", Signal.INPUT);
  public Signal NbottlePos3 = new Signal("NbottlePos3", Signal.INPUT);
  public Signal NbottlePos4 = new Signal("NbottlePos4", Signal.INPUT);
  public Signal NbottlePos5 = new Signal("NbottlePos5", Signal.INPUT);
  public Signal Naligned = new Signal("Naligned", Signal.INPUT);
  public Signal conveyorEnable = new Signal("conveyorEnable", Signal.OUTPUT);
  public Signal rotaryEnable = new Signal("rotaryEnable", Signal.OUTPUT);
  public Signal NRbottlePos1 = new Signal("NRbottlePos1", Signal.OUTPUT);
  public Signal NRmotor = new Signal("NRmotor", Signal.OUTPUT);
  public Signal NCbottlePos5 = new Signal("NCbottlePos5", Signal.OUTPUT);
  private int S1940 = 1;
  private int S1812 = 1;
  private int S1778 = 1;
  private int S1850 = 1;
  private int S1816 = 1;
  private int S1912 = 1;
  private int S1854 = 1;
  private int S1938 = 1;
  private int S1920 = 1;
  private int S1914 = 1;
  private int S1928 = 1;
  private int S1936 = 1;
  
  private int[] ends = new int[9];
  private int[] tdone = new int[9];
  
  public void thread1957(int [] tdone, int [] ends){
        switch(S1936){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(NbottlePos5.getprestatus()){//sysj\mainController.sysj line: 100, column: 28
          NCbottlePos5.setPresent();//sysj\mainController.sysj line: 100, column: 42
          currsigs.addElement(NCbottlePos5);
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        else {
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        break;
      
    }
  }

  public void thread1956(int [] tdone, int [] ends){
        switch(S1928){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(conveyorEnable.getprestatus()){//sysj\mainController.sysj line: 98, column: 28
          NRmotor.setPresent();//sysj\mainController.sysj line: 98, column: 45
          currsigs.addElement(NRmotor);
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

  public void thread1955(int [] tdone, int [] ends){
        switch(S1920){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S1914){
          case 0 : 
            S1914=0;
            if(NbottlePos1.getprestatus()){//sysj\mainController.sysj line: 96, column: 28
              NRbottlePos1.setPresent();//sysj\mainController.sysj line: 96, column: 42
              currsigs.addElement(NRbottlePos1);
              S1914=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              S1914=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 1 : 
            S1914=1;
            S1914=0;
            if(NbottlePos1.getprestatus()){//sysj\mainController.sysj line: 96, column: 28
              NRbottlePos1.setPresent();//sysj\mainController.sysj line: 96, column: 42
              currsigs.addElement(NRbottlePos1);
              S1914=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              S1914=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1954(int [] tdone, int [] ends){
        switch(S1938){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        thread1955(tdone,ends);
        thread1956(tdone,ends);
        thread1957(tdone,ends);
        int biggest1958 = 0;
        if(ends[6]>=biggest1958){
          biggest1958=ends[6];
        }
        if(ends[7]>=biggest1958){
          biggest1958=ends[7];
        }
        if(ends[8]>=biggest1958){
          biggest1958=ends[8];
        }
        if(biggest1958 == 1){
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        //FINXME code
        if(biggest1958 == 0){
          S1938=0;
          active[5]=0;
          ends[5]=0;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread1953(int [] tdone, int [] ends){
        switch(S1912){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S1854){
          case 0 : 
            if(NbottlePos1.getprestatus() || NbottlePos2.getprestatus() || NbottlePos3.getprestatus() || NbottlePos4.getprestatus()){//sysj\mainController.sysj line: 78, column: 10
              S1854=1;
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
            if(!NbottlePos5.getprestatus()){//sysj\mainController.sysj line: 81, column: 10
              S1854=2;
              rotaryEnable.setPresent();//sysj\mainController.sysj line: 84, column: 5
              currsigs.addElement(rotaryEnable);
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
          
          case 2 : 
            if(!NbottlePos1.getprestatus() && !NbottlePos2.getprestatus() && !NbottlePos3.getprestatus() && !NbottlePos4.getprestatus()){//sysj\mainController.sysj line: 83, column: 10
              S1854=3;
              rotaryEnable.setPresent();//sysj\mainController.sysj line: 88, column: 5
              currsigs.addElement(rotaryEnable);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              rotaryEnable.setPresent();//sysj\mainController.sysj line: 84, column: 5
              currsigs.addElement(rotaryEnable);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 3 : 
            if(Naligned.getprestatus()){//sysj\mainController.sysj line: 87, column: 10
              S1854=0;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              rotaryEnable.setPresent();//sysj\mainController.sysj line: 88, column: 5
              currsigs.addElement(rotaryEnable);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1952(int [] tdone, int [] ends){
        switch(S1850){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S1816){
          case 0 : 
            if(!NbottleLeft5.getprestatus()){//sysj\mainController.sysj line: 61, column: 10
              S1816=1;
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
            if(!NbottlePos1.getprestatus() && !NbottleLeft5.getprestatus()){//sysj\mainController.sysj line: 63, column: 10
              S1816=2;
              conveyorEnable.setPresent();//sysj\mainController.sysj line: 68, column: 5
              currsigs.addElement(conveyorEnable);
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
          
          case 2 : 
            if(NbottlePos1.getprestatus() || NbottleLeft5.getprestatus()){//sysj\mainController.sysj line: 67, column: 10
              S1816=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              conveyorEnable.setPresent();//sysj\mainController.sysj line: 68, column: 5
              currsigs.addElement(conveyorEnable);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1951(int [] tdone, int [] ends){
        switch(S1812){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S1778){
          case 0 : 
            if(!NbottlePos1.getprestatus()){//sysj\mainController.sysj line: 46, column: 10
              S1778=1;
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
            if(!NbottlePos1.getprestatus() && !NbottleLeft5.getprestatus()){//sysj\mainController.sysj line: 48, column: 10
              S1778=2;
              conveyorEnable.setPresent();//sysj\mainController.sysj line: 53, column: 5
              currsigs.addElement(conveyorEnable);
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
            if(NbottlePos1.getprestatus() || NbottleLeft5.getprestatus()){//sysj\mainController.sysj line: 52, column: 10
              S1778=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              conveyorEnable.setPresent();//sysj\mainController.sysj line: 53, column: 5
              currsigs.addElement(conveyorEnable);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1948(int [] tdone, int [] ends){
        S1936=1;
    if(NbottlePos5.getprestatus()){//sysj\mainController.sysj line: 100, column: 28
      NCbottlePos5.setPresent();//sysj\mainController.sysj line: 100, column: 42
      currsigs.addElement(NCbottlePos5);
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread1947(int [] tdone, int [] ends){
        S1928=1;
    if(conveyorEnable.getprestatus()){//sysj\mainController.sysj line: 98, column: 28
      NRmotor.setPresent();//sysj\mainController.sysj line: 98, column: 45
      currsigs.addElement(NRmotor);
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

  public void thread1946(int [] tdone, int [] ends){
        S1920=1;
    S1914=0;
    if(NbottlePos1.getprestatus()){//sysj\mainController.sysj line: 96, column: 28
      NRbottlePos1.setPresent();//sysj\mainController.sysj line: 96, column: 42
      currsigs.addElement(NRbottlePos1);
      S1914=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S1914=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread1945(int [] tdone, int [] ends){
        S1938=1;
    thread1946(tdone,ends);
    thread1947(tdone,ends);
    thread1948(tdone,ends);
    int biggest1949 = 0;
    if(ends[6]>=biggest1949){
      biggest1949=ends[6];
    }
    if(ends[7]>=biggest1949){
      biggest1949=ends[7];
    }
    if(ends[8]>=biggest1949){
      biggest1949=ends[8];
    }
    if(biggest1949 == 1){
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread1944(int [] tdone, int [] ends){
        S1912=1;
    S1854=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread1943(int [] tdone, int [] ends){
        S1850=1;
    S1816=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread1942(int [] tdone, int [] ends){
        S1812=1;
    S1778=0;
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
      switch(S1940){
        case 0 : 
          S1940=0;
          break RUN;
        
        case 1 : 
          S1940=2;
          S1940=2;
          thread1942(tdone,ends);
          thread1943(tdone,ends);
          thread1944(tdone,ends);
          thread1945(tdone,ends);
          int biggest1950 = 0;
          if(ends[2]>=biggest1950){
            biggest1950=ends[2];
          }
          if(ends[3]>=biggest1950){
            biggest1950=ends[3];
          }
          if(ends[4]>=biggest1950){
            biggest1950=ends[4];
          }
          if(ends[5]>=biggest1950){
            biggest1950=ends[5];
          }
          if(biggest1950 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread1951(tdone,ends);
          thread1952(tdone,ends);
          thread1953(tdone,ends);
          thread1954(tdone,ends);
          int biggest1959 = 0;
          if(ends[2]>=biggest1959){
            biggest1959=ends[2];
          }
          if(ends[3]>=biggest1959){
            biggest1959=ends[3];
          }
          if(ends[4]>=biggest1959){
            biggest1959=ends[4];
          }
          if(ends[5]>=biggest1959){
            biggest1959=ends[5];
          }
          if(biggest1959 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1959 == 0){
            S1940=0;
            active[1]=0;
            ends[1]=0;
            S1940=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          NbottleLeft5.gethook();
          NbottlePos1.gethook();
          NbottlePos2.gethook();
          NbottlePos3.gethook();
          NbottlePos4.gethook();
          NbottlePos5.gethook();
          Naligned.gethook();
          df = true;
        }
        runClockDomain();
      }
      NbottleLeft5.setpreclear();
      NbottlePos1.setpreclear();
      NbottlePos2.setpreclear();
      NbottlePos3.setpreclear();
      NbottlePos4.setpreclear();
      NbottlePos5.setpreclear();
      Naligned.setpreclear();
      conveyorEnable.setpreclear();
      rotaryEnable.setpreclear();
      NRbottlePos1.setpreclear();
      NRmotor.setpreclear();
      NCbottlePos5.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = NbottleLeft5.getStatus() ? NbottleLeft5.setprepresent() : NbottleLeft5.setpreclear();
      NbottleLeft5.setpreval(NbottleLeft5.getValue());
      NbottleLeft5.setClear();
      dummyint = NbottlePos1.getStatus() ? NbottlePos1.setprepresent() : NbottlePos1.setpreclear();
      NbottlePos1.setpreval(NbottlePos1.getValue());
      NbottlePos1.setClear();
      dummyint = NbottlePos2.getStatus() ? NbottlePos2.setprepresent() : NbottlePos2.setpreclear();
      NbottlePos2.setpreval(NbottlePos2.getValue());
      NbottlePos2.setClear();
      dummyint = NbottlePos3.getStatus() ? NbottlePos3.setprepresent() : NbottlePos3.setpreclear();
      NbottlePos3.setpreval(NbottlePos3.getValue());
      NbottlePos3.setClear();
      dummyint = NbottlePos4.getStatus() ? NbottlePos4.setprepresent() : NbottlePos4.setpreclear();
      NbottlePos4.setpreval(NbottlePos4.getValue());
      NbottlePos4.setClear();
      dummyint = NbottlePos5.getStatus() ? NbottlePos5.setprepresent() : NbottlePos5.setpreclear();
      NbottlePos5.setpreval(NbottlePos5.getValue());
      NbottlePos5.setClear();
      dummyint = Naligned.getStatus() ? Naligned.setprepresent() : Naligned.setpreclear();
      Naligned.setpreval(Naligned.getValue());
      Naligned.setClear();
      conveyorEnable.sethook();
      conveyorEnable.setClear();
      rotaryEnable.sethook();
      rotaryEnable.setClear();
      NRbottlePos1.sethook();
      NRbottlePos1.setClear();
      NRmotor.sethook();
      NRmotor.setClear();
      NCbottlePos5.sethook();
      NCbottlePos5.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        NbottleLeft5.gethook();
        NbottlePos1.gethook();
        NbottlePos2.gethook();
        NbottlePos3.gethook();
        NbottlePos4.gethook();
        NbottlePos5.gethook();
        Naligned.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
