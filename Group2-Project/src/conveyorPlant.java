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
  private int S1588 = 1;
  private int S1492 = 1;
  private int S1440 = 1;
  private int S1560 = 1;
  private int S1496 = 1;
  private int S1586 = 1;
  private int S1568 = 1;
  private int S1562 = 1;
  private int S1576 = 1;
  private int S1584 = 1;
  
  private int[] ends = new int[8];
  private int[] tdone = new int[8];
  
  public void thread1603(int [] tdone, int [] ends){
        switch(S1584){
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

  public void thread1602(int [] tdone, int [] ends){
        switch(S1576){
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

  public void thread1601(int [] tdone, int [] ends){
        switch(S1568){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S1562){
          case 0 : 
            S1562=0;
            if(bottleLeft5.getprestatus()){//sysj\conveyorPlant.sysj line: 68, column: 25
              bottleLeft5S.setPresent();//sysj\conveyorPlant.sysj line: 68, column: 39
              currsigs.addElement(bottleLeft5S);
              S1562=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S1562=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S1562=1;
            S1562=0;
            if(bottleLeft5.getprestatus()){//sysj\conveyorPlant.sysj line: 68, column: 25
              bottleLeft5S.setPresent();//sysj\conveyorPlant.sysj line: 68, column: 39
              currsigs.addElement(bottleLeft5S);
              S1562=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S1562=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1600(int [] tdone, int [] ends){
        switch(S1586){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        thread1601(tdone,ends);
        thread1602(tdone,ends);
        thread1603(tdone,ends);
        int biggest1604 = 0;
        if(ends[5]>=biggest1604){
          biggest1604=ends[5];
        }
        if(ends[6]>=biggest1604){
          biggest1604=ends[6];
        }
        if(ends[7]>=biggest1604){
          biggest1604=ends[7];
        }
        if(biggest1604 == 1){
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        //FINXME code
        if(biggest1604 == 0){
          S1586=0;
          active[4]=0;
          ends[4]=0;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread1599(int [] tdone, int [] ends){
        switch(S1560){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S1496){
          case 0 : 
            if(tick.getprestatus() && CbottlePos5.getprestatus()){//sysj\conveyorPlant.sysj line: 45, column: 10
              S1496=1;
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
              S1496=2;
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
              S1496=3;
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
              S1496=4;
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
              S1496=5;
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
              S1496=6;
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
              S1496=7;
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
              S1496=0;
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

  public void thread1598(int [] tdone, int [] ends){
        switch(S1492){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S1440){
          case 0 : 
            if(CloaderDone.getprestatus()){//sysj\conveyorPlant.sysj line: 26, column: 10
              S1440=1;
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
              S1440=2;
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
              S1440=3;
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
              S1440=4;
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
              S1440=5;
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
              S1440=0;
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

  public void thread1595(int [] tdone, int [] ends){
        S1584=1;
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

  public void thread1594(int [] tdone, int [] ends){
        S1576=1;
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

  public void thread1593(int [] tdone, int [] ends){
        S1568=1;
    S1562=0;
    if(bottleLeft5.getprestatus()){//sysj\conveyorPlant.sysj line: 68, column: 25
      bottleLeft5S.setPresent();//sysj\conveyorPlant.sysj line: 68, column: 39
      currsigs.addElement(bottleLeft5S);
      S1562=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S1562=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread1592(int [] tdone, int [] ends){
        S1586=1;
    thread1593(tdone,ends);
    thread1594(tdone,ends);
    thread1595(tdone,ends);
    int biggest1596 = 0;
    if(ends[5]>=biggest1596){
      biggest1596=ends[5];
    }
    if(ends[6]>=biggest1596){
      biggest1596=ends[6];
    }
    if(ends[7]>=biggest1596){
      biggest1596=ends[7];
    }
    if(biggest1596 == 1){
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread1591(int [] tdone, int [] ends){
        S1560=1;
    S1496=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread1590(int [] tdone, int [] ends){
        S1492=1;
    S1440=0;
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
      switch(S1588){
        case 0 : 
          S1588=0;
          break RUN;
        
        case 1 : 
          S1588=2;
          S1588=2;
          thread1590(tdone,ends);
          thread1591(tdone,ends);
          thread1592(tdone,ends);
          int biggest1597 = 0;
          if(ends[2]>=biggest1597){
            biggest1597=ends[2];
          }
          if(ends[3]>=biggest1597){
            biggest1597=ends[3];
          }
          if(ends[4]>=biggest1597){
            biggest1597=ends[4];
          }
          if(biggest1597 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread1598(tdone,ends);
          thread1599(tdone,ends);
          thread1600(tdone,ends);
          int biggest1605 = 0;
          if(ends[2]>=biggest1605){
            biggest1605=ends[2];
          }
          if(ends[3]>=biggest1605){
            biggest1605=ends[3];
          }
          if(ends[4]>=biggest1605){
            biggest1605=ends[4];
          }
          if(biggest1605 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1605 == 0){
            S1588=0;
            active[1]=0;
            ends[1]=0;
            S1588=0;
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
