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
  public Signal tick = new Signal("tick", Signal.INPUT);
  public Signal motor = new Signal("motor", Signal.INPUT);
  public Signal CbottlePos5 = new Signal("CbottlePos5", Signal.INPUT);
  public Signal CloaderDone = new Signal("CloaderDone", Signal.INPUT);
  public Signal bottleLeft5 = new Signal("bottleLeft5", Signal.OUTPUT);
  public Signal bottlePos1 = new Signal("bottlePos1", Signal.OUTPUT);
  public Signal bottleLeft5S = new Signal("bottleLeft5S", Signal.OUTPUT);
  public Signal bottlePos1S = new Signal("bottlePos1S", Signal.OUTPUT);
  public Signal motorS = new Signal("motorS", Signal.OUTPUT);
  private int S1600 = 1;
  private int S1504 = 1;
  private int S1452 = 1;
  private int S1572 = 1;
  private int S1508 = 1;
  private int S1598 = 1;
  private int S1580 = 1;
  private int S1574 = 1;
  private int S1588 = 1;
  private int S1596 = 1;
  
  private int[] ends = new int[8];
  private int[] tdone = new int[8];
  
  public void thread1615(int [] tdone, int [] ends){
        switch(S1596){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(motor.getprestatus()){//sysj\conveyorPlant.sysj line: 72, column: 25
          motorS.setPresent();//sysj\conveyorPlant.sysj line: 72, column: 33
          currsigs.addElement(motorS);
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

  public void thread1614(int [] tdone, int [] ends){
        switch(S1588){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(bottlePos1.getprestatus()){//sysj\conveyorPlant.sysj line: 70, column: 25
          bottlePos1S.setPresent();//sysj\conveyorPlant.sysj line: 70, column: 38
          currsigs.addElement(bottlePos1S);
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

  public void thread1613(int [] tdone, int [] ends){
        switch(S1580){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S1574){
          case 0 : 
            S1574=0;
            if(bottleLeft5.getprestatus()){//sysj\conveyorPlant.sysj line: 68, column: 25
              bottleLeft5S.setPresent();//sysj\conveyorPlant.sysj line: 68, column: 39
              currsigs.addElement(bottleLeft5S);
              S1574=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S1574=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S1574=1;
            S1574=0;
            if(bottleLeft5.getprestatus()){//sysj\conveyorPlant.sysj line: 68, column: 25
              bottleLeft5S.setPresent();//sysj\conveyorPlant.sysj line: 68, column: 39
              currsigs.addElement(bottleLeft5S);
              S1574=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S1574=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1612(int [] tdone, int [] ends){
        switch(S1598){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        thread1613(tdone,ends);
        thread1614(tdone,ends);
        thread1615(tdone,ends);
        int biggest1616 = 0;
        if(ends[5]>=biggest1616){
          biggest1616=ends[5];
        }
        if(ends[6]>=biggest1616){
          biggest1616=ends[6];
        }
        if(ends[7]>=biggest1616){
          biggest1616=ends[7];
        }
        if(biggest1616 == 1){
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        //FINXME code
        if(biggest1616 == 0){
          S1598=0;
          active[4]=0;
          ends[4]=0;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread1611(int [] tdone, int [] ends){
        switch(S1572){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S1508){
          case 0 : 
            if(tick.getprestatus() && CbottlePos5.getprestatus()){//sysj\conveyorPlant.sysj line: 45, column: 10
              S1508=1;
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
            if(!tick.getprestatus()){//sysj\conveyorPlant.sysj line: 49, column: 10
              S1508=2;
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
            if(tick.getprestatus() && motor.getprestatus()){//sysj\conveyorPlant.sysj line: 50, column: 10
              S1508=3;
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
            if(!tick.getprestatus()){//sysj\conveyorPlant.sysj line: 54, column: 10
              S1508=4;
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
          
          case 4 : 
            if(tick.getprestatus()){//sysj\conveyorPlant.sysj line: 55, column: 10
              S1508=5;
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
            if(!tick.getprestatus()){//sysj\conveyorPlant.sysj line: 56, column: 10
              S1508=6;
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
          
          case 6 : 
            if(!tick.getprestatus()){//sysj\conveyorPlant.sysj line: 58, column: 10
              S1508=7;
              bottleLeft5.setPresent();//sysj\conveyorPlant.sysj line: 60, column: 5
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
            if(tick.getprestatus()){//sysj\conveyorPlant.sysj line: 59, column: 10
              S1508=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              bottleLeft5.setPresent();//sysj\conveyorPlant.sysj line: 60, column: 5
              currsigs.addElement(bottleLeft5);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1610(int [] tdone, int [] ends){
        switch(S1504){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S1452){
          case 0 : 
            if(CloaderDone.getprestatus()){//sysj\conveyorPlant.sysj line: 26, column: 10
              S1452=1;
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
            if(!tick.getprestatus()){//sysj\conveyorPlant.sysj line: 30, column: 10
              S1452=2;
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
            if(tick.getprestatus() && motor.getprestatus()){//sysj\conveyorPlant.sysj line: 31, column: 10
              S1452=3;
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
          
          case 3 : 
            if(!tick.getprestatus()){//sysj\conveyorPlant.sysj line: 35, column: 10
              S1452=4;
              bottlePos1.setPresent();//sysj\conveyorPlant.sysj line: 37, column: 5
              currsigs.addElement(bottlePos1);
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
          
          case 4 : 
            if(tick.getprestatus()){//sysj\conveyorPlant.sysj line: 36, column: 10
              S1452=5;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              bottlePos1.setPresent();//sysj\conveyorPlant.sysj line: 37, column: 5
              currsigs.addElement(bottlePos1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 5 : 
            if(!tick.getprestatus()){//sysj\conveyorPlant.sysj line: 39, column: 10
              S1452=0;
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

  public void thread1607(int [] tdone, int [] ends){
        S1596=1;
    if(motor.getprestatus()){//sysj\conveyorPlant.sysj line: 72, column: 25
      motorS.setPresent();//sysj\conveyorPlant.sysj line: 72, column: 33
      currsigs.addElement(motorS);
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

  public void thread1606(int [] tdone, int [] ends){
        S1588=1;
    if(bottlePos1.getprestatus()){//sysj\conveyorPlant.sysj line: 70, column: 25
      bottlePos1S.setPresent();//sysj\conveyorPlant.sysj line: 70, column: 38
      currsigs.addElement(bottlePos1S);
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

  public void thread1605(int [] tdone, int [] ends){
        S1580=1;
    S1574=0;
    if(bottleLeft5.getprestatus()){//sysj\conveyorPlant.sysj line: 68, column: 25
      bottleLeft5S.setPresent();//sysj\conveyorPlant.sysj line: 68, column: 39
      currsigs.addElement(bottleLeft5S);
      S1574=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S1574=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread1604(int [] tdone, int [] ends){
        S1598=1;
    thread1605(tdone,ends);
    thread1606(tdone,ends);
    thread1607(tdone,ends);
    int biggest1608 = 0;
    if(ends[5]>=biggest1608){
      biggest1608=ends[5];
    }
    if(ends[6]>=biggest1608){
      biggest1608=ends[6];
    }
    if(ends[7]>=biggest1608){
      biggest1608=ends[7];
    }
    if(biggest1608 == 1){
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread1603(int [] tdone, int [] ends){
        S1572=1;
    S1508=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread1602(int [] tdone, int [] ends){
        S1504=1;
    S1452=0;
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
      switch(S1600){
        case 0 : 
          S1600=0;
          break RUN;
        
        case 1 : 
          S1600=2;
          S1600=2;
          thread1602(tdone,ends);
          thread1603(tdone,ends);
          thread1604(tdone,ends);
          int biggest1609 = 0;
          if(ends[2]>=biggest1609){
            biggest1609=ends[2];
          }
          if(ends[3]>=biggest1609){
            biggest1609=ends[3];
          }
          if(ends[4]>=biggest1609){
            biggest1609=ends[4];
          }
          if(biggest1609 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread1610(tdone,ends);
          thread1611(tdone,ends);
          thread1612(tdone,ends);
          int biggest1617 = 0;
          if(ends[2]>=biggest1617){
            biggest1617=ends[2];
          }
          if(ends[3]>=biggest1617){
            biggest1617=ends[3];
          }
          if(ends[4]>=biggest1617){
            biggest1617=ends[4];
          }
          if(biggest1617 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1617 == 0){
            S1600=0;
            active[1]=0;
            ends[1]=0;
            S1600=0;
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
          tick.gethook();
          motor.gethook();
          CbottlePos5.gethook();
          CloaderDone.gethook();
          df = true;
        }
        runClockDomain();
      }
      tick.setpreclear();
      motor.setpreclear();
      CbottlePos5.setpreclear();
      CloaderDone.setpreclear();
      bottleLeft5.setpreclear();
      bottlePos1.setpreclear();
      bottleLeft5S.setpreclear();
      bottlePos1S.setpreclear();
      motorS.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = tick.getStatus() ? tick.setprepresent() : tick.setpreclear();
      tick.setpreval(tick.getValue());
      tick.setClear();
      dummyint = motor.getStatus() ? motor.setprepresent() : motor.setpreclear();
      motor.setpreval(motor.getValue());
      motor.setClear();
      dummyint = CbottlePos5.getStatus() ? CbottlePos5.setprepresent() : CbottlePos5.setpreclear();
      CbottlePos5.setpreval(CbottlePos5.getValue());
      CbottlePos5.setClear();
      dummyint = CloaderDone.getStatus() ? CloaderDone.setprepresent() : CloaderDone.setpreclear();
      CloaderDone.setpreval(CloaderDone.getValue());
      CloaderDone.setClear();
      bottleLeft5.sethook();
      bottleLeft5.setClear();
      bottlePos1.sethook();
      bottlePos1.setClear();
      bottleLeft5S.sethook();
      bottleLeft5S.setClear();
      bottlePos1S.sethook();
      bottlePos1S.setClear();
      motorS.sethook();
      motorS.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        tick.gethook();
        motor.gethook();
        CbottlePos5.gethook();
        CloaderDone.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
