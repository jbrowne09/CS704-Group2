import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class conveyorPlant extends ClockDomain{
  public conveyorPlant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal motor = new Signal("motor", Signal.INPUT);
  public Signal tick = new Signal("tick", Signal.INPUT);
  public Signal bottleLeft5 = new Signal("bottleLeft5", Signal.OUTPUT);
  public Signal bottlePos1 = new Signal("bottlePos1", Signal.OUTPUT);
  public Signal bottlePos5 = new Signal("bottlePos5", Signal.OUTPUT);
  public Signal bottleLeft5S = new Signal("bottleLeft5S", Signal.OUTPUT);
  public Signal bottlePos1S = new Signal("bottlePos1S", Signal.OUTPUT);
  public Signal bottlePos5S = new Signal("bottlePos5S", Signal.OUTPUT);
  public Signal motorS = new Signal("motorS", Signal.OUTPUT);
  private int S730 = 1;
  private int S636 = 1;
  private int S614 = 1;
  private int S702 = 1;
  private int S640 = 1;
  private int S728 = 1;
  private int S710 = 1;
  private int S704 = 1;
  private int S718 = 1;
  private int S726 = 1;
  
  private int[] ends = new int[8];
  private int[] tdone = new int[8];
  
  public void thread745(int [] tdone, int [] ends){
        switch(S726){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(bottleLeft5.getprestatus()){//sysj\conveyorPlant.sysj line: 41, column: 25
          bottleLeft5S.setPresent();//sysj\conveyorPlant.sysj line: 41, column: 39
          currsigs.addElement(bottleLeft5S);
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

  public void thread744(int [] tdone, int [] ends){
        switch(S718){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(bottlePos5.getprestatus()){//sysj\conveyorPlant.sysj line: 39, column: 25
          bottlePos5S.setPresent();//sysj\conveyorPlant.sysj line: 39, column: 38
          currsigs.addElement(bottlePos5S);
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

  public void thread743(int [] tdone, int [] ends){
        switch(S710){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S704){
          case 0 : 
            S704=0;
            if(bottlePos1.getprestatus()){//sysj\conveyorPlant.sysj line: 37, column: 25
              bottlePos1S.setPresent();//sysj\conveyorPlant.sysj line: 37, column: 38
              currsigs.addElement(bottlePos1S);
              S704=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S704=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S704=1;
            S704=0;
            if(bottlePos1.getprestatus()){//sysj\conveyorPlant.sysj line: 37, column: 25
              bottlePos1S.setPresent();//sysj\conveyorPlant.sysj line: 37, column: 38
              currsigs.addElement(bottlePos1S);
              S704=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S704=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread742(int [] tdone, int [] ends){
        switch(S728){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        thread743(tdone,ends);
        thread744(tdone,ends);
        thread745(tdone,ends);
        int biggest746 = 0;
        if(ends[5]>=biggest746){
          biggest746=ends[5];
        }
        if(ends[6]>=biggest746){
          biggest746=ends[6];
        }
        if(ends[7]>=biggest746){
          biggest746=ends[7];
        }
        if(biggest746 == 1){
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        //FINXME code
        if(biggest746 == 0){
          S728=0;
          active[4]=0;
          ends[4]=0;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread741(int [] tdone, int [] ends){
        switch(S702){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S640){
          case 0 : 
            if(motor.getprestatus()){//sysj\conveyorPlant.sysj line: 21, column: 10
              S640=1;
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
            if(tick.getprestatus()){//sysj\conveyorPlant.sysj line: 22, column: 10
              S640=2;
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
            if(!tick.getprestatus()){//sysj\conveyorPlant.sysj line: 23, column: 10
              S640=3;
              bottlePos1.setPresent();//sysj\conveyorPlant.sysj line: 25, column: 5
              currsigs.addElement(bottlePos1);
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
          
          case 3 : 
            if(tick.getprestatus()){//sysj\conveyorPlant.sysj line: 24, column: 10
              S640=4;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              bottlePos1.setPresent();//sysj\conveyorPlant.sysj line: 25, column: 5
              currsigs.addElement(bottlePos1);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 4 : 
            if(!tick.getprestatus()){//sysj\conveyorPlant.sysj line: 27, column: 10
              S640=5;
              bottlePos5.setPresent();//sysj\conveyorPlant.sysj line: 29, column: 5
              currsigs.addElement(bottlePos5);
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
          
          case 5 : 
            if(tick.getprestatus()){//sysj\conveyorPlant.sysj line: 28, column: 10
              S640=6;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              bottlePos5.setPresent();//sysj\conveyorPlant.sysj line: 29, column: 5
              currsigs.addElement(bottlePos5);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 6 : 
            if(!tick.getprestatus()){//sysj\conveyorPlant.sysj line: 31, column: 10
              S640=7;
              bottleLeft5.setPresent();//sysj\conveyorPlant.sysj line: 32, column: 4
              currsigs.addElement(bottleLeft5);
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
          
          case 7 : 
            bottleLeft5.setPresent();//sysj\conveyorPlant.sysj line: 32, column: 4
            currsigs.addElement(bottleLeft5);
            active[3]=1;
            ends[3]=1;
            tdone[3]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread740(int [] tdone, int [] ends){
        switch(S636){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S614){
          case 0 : 
            if(motor.getprestatus()){//sysj\conveyorPlant.sysj line: 12, column: 10
              S614=1;
              motorS.setPresent();//sysj\conveyorPlant.sysj line: 14, column: 5
              currsigs.addElement(motorS);
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
            if(!motor.getprestatus()){//sysj\conveyorPlant.sysj line: 13, column: 11
              S614=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              motorS.setPresent();//sysj\conveyorPlant.sysj line: 14, column: 5
              currsigs.addElement(motorS);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread737(int [] tdone, int [] ends){
        S726=1;
    if(bottleLeft5.getprestatus()){//sysj\conveyorPlant.sysj line: 41, column: 25
      bottleLeft5S.setPresent();//sysj\conveyorPlant.sysj line: 41, column: 39
      currsigs.addElement(bottleLeft5S);
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

  public void thread736(int [] tdone, int [] ends){
        S718=1;
    if(bottlePos5.getprestatus()){//sysj\conveyorPlant.sysj line: 39, column: 25
      bottlePos5S.setPresent();//sysj\conveyorPlant.sysj line: 39, column: 38
      currsigs.addElement(bottlePos5S);
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

  public void thread735(int [] tdone, int [] ends){
        S710=1;
    S704=0;
    if(bottlePos1.getprestatus()){//sysj\conveyorPlant.sysj line: 37, column: 25
      bottlePos1S.setPresent();//sysj\conveyorPlant.sysj line: 37, column: 38
      currsigs.addElement(bottlePos1S);
      S704=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S704=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread734(int [] tdone, int [] ends){
        S728=1;
    thread735(tdone,ends);
    thread736(tdone,ends);
    thread737(tdone,ends);
    int biggest738 = 0;
    if(ends[5]>=biggest738){
      biggest738=ends[5];
    }
    if(ends[6]>=biggest738){
      biggest738=ends[6];
    }
    if(ends[7]>=biggest738){
      biggest738=ends[7];
    }
    if(biggest738 == 1){
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread733(int [] tdone, int [] ends){
        S702=1;
    S640=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread732(int [] tdone, int [] ends){
        S636=1;
    S614=0;
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
      switch(S730){
        case 0 : 
          S730=0;
          break RUN;
        
        case 1 : 
          S730=2;
          S730=2;
          thread732(tdone,ends);
          thread733(tdone,ends);
          thread734(tdone,ends);
          int biggest739 = 0;
          if(ends[2]>=biggest739){
            biggest739=ends[2];
          }
          if(ends[3]>=biggest739){
            biggest739=ends[3];
          }
          if(ends[4]>=biggest739){
            biggest739=ends[4];
          }
          if(biggest739 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread740(tdone,ends);
          thread741(tdone,ends);
          thread742(tdone,ends);
          int biggest747 = 0;
          if(ends[2]>=biggest747){
            biggest747=ends[2];
          }
          if(ends[3]>=biggest747){
            biggest747=ends[3];
          }
          if(ends[4]>=biggest747){
            biggest747=ends[4];
          }
          if(biggest747 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest747 == 0){
            S730=0;
            active[1]=0;
            ends[1]=0;
            S730=0;
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
          motor.gethook();
          tick.gethook();
          df = true;
        }
        runClockDomain();
      }
      motor.setpreclear();
      tick.setpreclear();
      bottleLeft5.setpreclear();
      bottlePos1.setpreclear();
      bottlePos5.setpreclear();
      bottleLeft5S.setpreclear();
      bottlePos1S.setpreclear();
      bottlePos5S.setpreclear();
      motorS.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = motor.getStatus() ? motor.setprepresent() : motor.setpreclear();
      motor.setpreval(motor.getValue());
      motor.setClear();
      dummyint = tick.getStatus() ? tick.setprepresent() : tick.setpreclear();
      tick.setpreval(tick.getValue());
      tick.setClear();
      bottleLeft5.sethook();
      bottleLeft5.setClear();
      bottlePos1.sethook();
      bottlePos1.setClear();
      bottlePos5.sethook();
      bottlePos5.setClear();
      bottleLeft5S.sethook();
      bottleLeft5S.setClear();
      bottlePos1S.sethook();
      bottlePos1S.setClear();
      bottlePos5S.sethook();
      bottlePos5S.setClear();
      motorS.sethook();
      motorS.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        motor.gethook();
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
