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
  private int S543 = 1;
  private int S459 = 1;
  private int S425 = 1;
  private int S515 = 1;
  private int S463 = 1;
  private int S541 = 1;
  private int S523 = 1;
  private int S517 = 1;
  private int S531 = 1;
  private int S539 = 1;
  
  private int[] ends = new int[8];
  private int[] tdone = new int[8];
  
  public void thread558(int [] tdone, int [] ends){
        switch(S539){
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

  public void thread557(int [] tdone, int [] ends){
        switch(S531){
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

  public void thread556(int [] tdone, int [] ends){
        switch(S523){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S517){
          case 0 : 
            S517=0;
            if(bottleLeft5.getprestatus()){//sysj\conveyorPlant.sysj line: 54, column: 25
              bottleLeft5S.setPresent();//sysj\conveyorPlant.sysj line: 54, column: 39
              currsigs.addElement(bottleLeft5S);
              S517=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S517=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S517=1;
            S517=0;
            if(bottleLeft5.getprestatus()){//sysj\conveyorPlant.sysj line: 54, column: 25
              bottleLeft5S.setPresent();//sysj\conveyorPlant.sysj line: 54, column: 39
              currsigs.addElement(bottleLeft5S);
              S517=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S517=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread555(int [] tdone, int [] ends){
        switch(S541){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        thread556(tdone,ends);
        thread557(tdone,ends);
        thread558(tdone,ends);
        int biggest559 = 0;
        if(ends[5]>=biggest559){
          biggest559=ends[5];
        }
        if(ends[6]>=biggest559){
          biggest559=ends[6];
        }
        if(ends[7]>=biggest559){
          biggest559=ends[7];
        }
        if(biggest559 == 1){
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        //FINXME code
        if(biggest559 == 0){
          S541=0;
          active[4]=0;
          ends[4]=0;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread554(int [] tdone, int [] ends){
        switch(S515){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S463){
          case 0 : 
            if(!tick.getprestatus()){//sysj\conveyorPlant.sysj line: 36, column: 10
              S463=1;
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
              S463=2;
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
              S463=3;
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
              S463=4;
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
              S463=5;
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
              S463=0;
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

  public void thread553(int [] tdone, int [] ends){
        switch(S459){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S425){
          case 0 : 
            if(!tick.getprestatus()){//sysj\conveyorPlant.sysj line: 21, column: 10
              S425=1;
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
              S425=2;
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
              S425=3;
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
              S425=0;
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

  public void thread550(int [] tdone, int [] ends){
        S539=1;
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

  public void thread549(int [] tdone, int [] ends){
        S531=1;
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

  public void thread548(int [] tdone, int [] ends){
        S523=1;
    S517=0;
    if(bottleLeft5.getprestatus()){//sysj\conveyorPlant.sysj line: 54, column: 25
      bottleLeft5S.setPresent();//sysj\conveyorPlant.sysj line: 54, column: 39
      currsigs.addElement(bottleLeft5S);
      S517=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S517=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread547(int [] tdone, int [] ends){
        S541=1;
    thread548(tdone,ends);
    thread549(tdone,ends);
    thread550(tdone,ends);
    int biggest551 = 0;
    if(ends[5]>=biggest551){
      biggest551=ends[5];
    }
    if(ends[6]>=biggest551){
      biggest551=ends[6];
    }
    if(ends[7]>=biggest551){
      biggest551=ends[7];
    }
    if(biggest551 == 1){
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread546(int [] tdone, int [] ends){
        S515=1;
    S463=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread545(int [] tdone, int [] ends){
        S459=1;
    S425=0;
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
      switch(S543){
        case 0 : 
          S543=0;
          break RUN;
        
        case 1 : 
          S543=2;
          S543=2;
          thread545(tdone,ends);
          thread546(tdone,ends);
          thread547(tdone,ends);
          int biggest552 = 0;
          if(ends[2]>=biggest552){
            biggest552=ends[2];
          }
          if(ends[3]>=biggest552){
            biggest552=ends[3];
          }
          if(ends[4]>=biggest552){
            biggest552=ends[4];
          }
          if(biggest552 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread553(tdone,ends);
          thread554(tdone,ends);
          thread555(tdone,ends);
          int biggest560 = 0;
          if(ends[2]>=biggest560){
            biggest560=ends[2];
          }
          if(ends[3]>=biggest560){
            biggest560=ends[3];
          }
          if(ends[4]>=biggest560){
            biggest560=ends[4];
          }
          if(biggest560 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest560 == 0){
            S543=0;
            active[1]=0;
            ends[1]=0;
            S543=0;
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
