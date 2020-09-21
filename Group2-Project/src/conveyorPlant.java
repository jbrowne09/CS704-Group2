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
  public Signal NCbottlePos5 = new Signal("NCbottlePos5", Signal.INPUT);
  public Signal motor = new Signal("motor", Signal.INPUT);
  public Signal bottleLeft5 = new Signal("bottleLeft5", Signal.OUTPUT);
  public Signal bottlePos1 = new Signal("bottlePos1", Signal.OUTPUT);
  public Signal bottleLeft5S = new Signal("bottleLeft5S", Signal.OUTPUT);
  public Signal bottlePos1S = new Signal("bottlePos1S", Signal.OUTPUT);
  public Signal motorS = new Signal("motorS", Signal.OUTPUT);
  private int S650 = 1;
  private int S566 = 1;
  private int S532 = 1;
  private int S622 = 1;
  private int S570 = 1;
  private int S648 = 1;
  private int S630 = 1;
  private int S624 = 1;
  private int S638 = 1;
  private int S646 = 1;
  
  private int[] ends = new int[8];
  private int[] tdone = new int[8];
  
  public void thread665(int [] tdone, int [] ends){
        switch(S646){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(motor.getprestatus()){//sysj\conveyorPlant.sysj line: 58, column: 25
          motorS.setPresent();//sysj\conveyorPlant.sysj line: 58, column: 33
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

  public void thread664(int [] tdone, int [] ends){
        switch(S638){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(bottlePos1.getprestatus()){//sysj\conveyorPlant.sysj line: 56, column: 25
          bottlePos1S.setPresent();//sysj\conveyorPlant.sysj line: 56, column: 38
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

  public void thread663(int [] tdone, int [] ends){
        switch(S630){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S624){
          case 0 : 
            S624=0;
            if(bottleLeft5.getprestatus()){//sysj\conveyorPlant.sysj line: 54, column: 25
              bottleLeft5S.setPresent();//sysj\conveyorPlant.sysj line: 54, column: 39
              currsigs.addElement(bottleLeft5S);
              S624=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S624=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S624=1;
            S624=0;
            if(bottleLeft5.getprestatus()){//sysj\conveyorPlant.sysj line: 54, column: 25
              bottleLeft5S.setPresent();//sysj\conveyorPlant.sysj line: 54, column: 39
              currsigs.addElement(bottleLeft5S);
              S624=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S624=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread662(int [] tdone, int [] ends){
        switch(S648){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        thread663(tdone,ends);
        thread664(tdone,ends);
        thread665(tdone,ends);
        int biggest666 = 0;
        if(ends[5]>=biggest666){
          biggest666=ends[5];
        }
        if(ends[6]>=biggest666){
          biggest666=ends[6];
        }
        if(ends[7]>=biggest666){
          biggest666=ends[7];
        }
        if(biggest666 == 1){
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        //FINXME code
        if(biggest666 == 0){
          S648=0;
          active[4]=0;
          ends[4]=0;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread661(int [] tdone, int [] ends){
        switch(S622){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S570){
          case 0 : 
            if(!tick.getprestatus()){//sysj\conveyorPlant.sysj line: 36, column: 10
              S570=1;
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
            if(NCbottlePos5.getprestatus()){//sysj\conveyorPlant.sysj line: 37, column: 10
              S570=2;
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
            if(!tick.getprestatus()){//sysj\conveyorPlant.sysj line: 39, column: 10
              S570=3;
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
            if(tick.getprestatus() && motor.getprestatus()){//sysj\conveyorPlant.sysj line: 40, column: 10
              S570=4;
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
            if(!tick.getprestatus()){//sysj\conveyorPlant.sysj line: 44, column: 10
              S570=5;
              bottleLeft5.setPresent();//sysj\conveyorPlant.sysj line: 46, column: 5
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
          
          case 5 : 
            if(tick.getprestatus()){//sysj\conveyorPlant.sysj line: 45, column: 10
              S570=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              bottleLeft5.setPresent();//sysj\conveyorPlant.sysj line: 46, column: 5
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

  public void thread660(int [] tdone, int [] ends){
        switch(S566){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S532){
          case 0 : 
            if(!tick.getprestatus()){//sysj\conveyorPlant.sysj line: 21, column: 10
              S532=1;
              bottlePos1.setPresent();//sysj\conveyorPlant.sysj line: 23, column: 5
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
          
          case 1 : 
            if(tick.getprestatus()){//sysj\conveyorPlant.sysj line: 22, column: 10
              S532=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              bottlePos1.setPresent();//sysj\conveyorPlant.sysj line: 23, column: 5
              currsigs.addElement(bottlePos1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 2 : 
            if(!tick.getprestatus()){//sysj\conveyorPlant.sysj line: 26, column: 10
              S532=3;
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
            if(tick.getprestatus() && motor.getprestatus()){//sysj\conveyorPlant.sysj line: 27, column: 10
              S532=0;
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

  public void thread657(int [] tdone, int [] ends){
        S646=1;
    if(motor.getprestatus()){//sysj\conveyorPlant.sysj line: 58, column: 25
      motorS.setPresent();//sysj\conveyorPlant.sysj line: 58, column: 33
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

  public void thread656(int [] tdone, int [] ends){
        S638=1;
    if(bottlePos1.getprestatus()){//sysj\conveyorPlant.sysj line: 56, column: 25
      bottlePos1S.setPresent();//sysj\conveyorPlant.sysj line: 56, column: 38
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

  public void thread655(int [] tdone, int [] ends){
        S630=1;
    S624=0;
    if(bottleLeft5.getprestatus()){//sysj\conveyorPlant.sysj line: 54, column: 25
      bottleLeft5S.setPresent();//sysj\conveyorPlant.sysj line: 54, column: 39
      currsigs.addElement(bottleLeft5S);
      S624=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S624=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread654(int [] tdone, int [] ends){
        S648=1;
    thread655(tdone,ends);
    thread656(tdone,ends);
    thread657(tdone,ends);
    int biggest658 = 0;
    if(ends[5]>=biggest658){
      biggest658=ends[5];
    }
    if(ends[6]>=biggest658){
      biggest658=ends[6];
    }
    if(ends[7]>=biggest658){
      biggest658=ends[7];
    }
    if(biggest658 == 1){
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread653(int [] tdone, int [] ends){
        S622=1;
    S570=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread652(int [] tdone, int [] ends){
        S566=1;
    S532=0;
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
      switch(S650){
        case 0 : 
          S650=0;
          break RUN;
        
        case 1 : 
          S650=2;
          S650=2;
          thread652(tdone,ends);
          thread653(tdone,ends);
          thread654(tdone,ends);
          int biggest659 = 0;
          if(ends[2]>=biggest659){
            biggest659=ends[2];
          }
          if(ends[3]>=biggest659){
            biggest659=ends[3];
          }
          if(ends[4]>=biggest659){
            biggest659=ends[4];
          }
          if(biggest659 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread660(tdone,ends);
          thread661(tdone,ends);
          thread662(tdone,ends);
          int biggest667 = 0;
          if(ends[2]>=biggest667){
            biggest667=ends[2];
          }
          if(ends[3]>=biggest667){
            biggest667=ends[3];
          }
          if(ends[4]>=biggest667){
            biggest667=ends[4];
          }
          if(biggest667 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest667 == 0){
            S650=0;
            active[1]=0;
            ends[1]=0;
            S650=0;
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
          NCbottlePos5.gethook();
          motor.gethook();
          df = true;
        }
        runClockDomain();
      }
      tick.setpreclear();
      NCbottlePos5.setpreclear();
      motor.setpreclear();
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
      dummyint = NCbottlePos5.getStatus() ? NCbottlePos5.setprepresent() : NCbottlePos5.setpreclear();
      NCbottlePos5.setpreval(NCbottlePos5.getValue());
      NCbottlePos5.setClear();
      dummyint = motor.getStatus() ? motor.setprepresent() : motor.setpreclear();
      motor.setpreval(motor.getValue());
      motor.setClear();
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
        NCbottlePos5.gethook();
        motor.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
