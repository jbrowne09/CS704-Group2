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
  public Signal bottleLeft5 = new Signal("bottleLeft5", Signal.OUTPUT);
  public Signal bottlePos1 = new Signal("bottlePos1", Signal.OUTPUT);
  public Signal loaderDone = new Signal("loaderDone", Signal.OUTPUT);
  public Signal bottleLeft5S = new Signal("bottleLeft5S", Signal.OUTPUT);
  public Signal bottlePos1S = new Signal("bottlePos1S", Signal.OUTPUT);
  public Signal motorS = new Signal("motorS", Signal.OUTPUT);
  private int S659 = 1;
  private int S563 = 1;
  private int S499 = 1;
  private int S631 = 1;
  private int S567 = 1;
  private int S657 = 1;
  private int S639 = 1;
  private int S633 = 1;
  private int S647 = 1;
  private int S655 = 1;
  
  private int[] ends = new int[8];
  private int[] tdone = new int[8];
  
  public void thread674(int [] tdone, int [] ends){
        switch(S655){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(motor.getprestatus()){//sysj\conveyorPlant.sysj line: 61, column: 25
          motorS.setPresent();//sysj\conveyorPlant.sysj line: 61, column: 33
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

  public void thread673(int [] tdone, int [] ends){
        switch(S647){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(bottlePos1.getprestatus()){//sysj\conveyorPlant.sysj line: 59, column: 25
          bottlePos1S.setPresent();//sysj\conveyorPlant.sysj line: 59, column: 38
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

  public void thread672(int [] tdone, int [] ends){
        switch(S639){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S633){
          case 0 : 
            S633=0;
            if(bottleLeft5.getprestatus()){//sysj\conveyorPlant.sysj line: 57, column: 25
              bottleLeft5S.setPresent();//sysj\conveyorPlant.sysj line: 57, column: 39
              currsigs.addElement(bottleLeft5S);
              S633=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S633=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S633=1;
            S633=0;
            if(bottleLeft5.getprestatus()){//sysj\conveyorPlant.sysj line: 57, column: 25
              bottleLeft5S.setPresent();//sysj\conveyorPlant.sysj line: 57, column: 39
              currsigs.addElement(bottleLeft5S);
              S633=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S633=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread671(int [] tdone, int [] ends){
        switch(S657){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        thread672(tdone,ends);
        thread673(tdone,ends);
        thread674(tdone,ends);
        int biggest675 = 0;
        if(ends[5]>=biggest675){
          biggest675=ends[5];
        }
        if(ends[6]>=biggest675){
          biggest675=ends[6];
        }
        if(ends[7]>=biggest675){
          biggest675=ends[7];
        }
        if(biggest675 == 1){
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        //FINXME code
        if(biggest675 == 0){
          S657=0;
          active[4]=0;
          ends[4]=0;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread670(int [] tdone, int [] ends){
        switch(S631){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S567){
          case 0 : 
            if(tick.getprestatus() && CbottlePos5.getprestatus()){//sysj\conveyorPlant.sysj line: 34, column: 10
              S567=1;
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
            if(!tick.getprestatus()){//sysj\conveyorPlant.sysj line: 38, column: 10
              S567=2;
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
            if(tick.getprestatus() && motor.getprestatus()){//sysj\conveyorPlant.sysj line: 39, column: 10
              S567=3;
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
            if(!tick.getprestatus()){//sysj\conveyorPlant.sysj line: 43, column: 10
              S567=4;
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
            if(tick.getprestatus()){//sysj\conveyorPlant.sysj line: 44, column: 10
              S567=5;
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
            if(!tick.getprestatus()){//sysj\conveyorPlant.sysj line: 45, column: 10
              S567=6;
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
            if(!tick.getprestatus()){//sysj\conveyorPlant.sysj line: 47, column: 10
              S567=7;
              bottleLeft5.setPresent();//sysj\conveyorPlant.sysj line: 49, column: 5
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
            if(tick.getprestatus()){//sysj\conveyorPlant.sysj line: 48, column: 10
              S567=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              bottleLeft5.setPresent();//sysj\conveyorPlant.sysj line: 49, column: 5
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

  public void thread669(int [] tdone, int [] ends){
        switch(S563){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S499){
          case 0 : 
            if(tick.getprestatus()){//sysj\conveyorPlant.sysj line: 18, column: 10
              S499=1;
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
            if(!tick.getprestatus()){//sysj\conveyorPlant.sysj line: 19, column: 10
              S499=2;
              loaderDone.setPresent();//sysj\conveyorPlant.sysj line: 22, column: 5
              currsigs.addElement(loaderDone);
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
            if(tick.getprestatus() && motor.getprestatus()){//sysj\conveyorPlant.sysj line: 21, column: 10
              S499=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              loaderDone.setPresent();//sysj\conveyorPlant.sysj line: 22, column: 5
              currsigs.addElement(loaderDone);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            if(!tick.getprestatus()){//sysj\conveyorPlant.sysj line: 25, column: 10
              S499=4;
              bottlePos1.setPresent();//sysj\conveyorPlant.sysj line: 27, column: 5
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
            if(tick.getprestatus()){//sysj\conveyorPlant.sysj line: 26, column: 10
              S499=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              bottlePos1.setPresent();//sysj\conveyorPlant.sysj line: 27, column: 5
              currsigs.addElement(bottlePos1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread666(int [] tdone, int [] ends){
        S655=1;
    if(motor.getprestatus()){//sysj\conveyorPlant.sysj line: 61, column: 25
      motorS.setPresent();//sysj\conveyorPlant.sysj line: 61, column: 33
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

  public void thread665(int [] tdone, int [] ends){
        S647=1;
    if(bottlePos1.getprestatus()){//sysj\conveyorPlant.sysj line: 59, column: 25
      bottlePos1S.setPresent();//sysj\conveyorPlant.sysj line: 59, column: 38
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

  public void thread664(int [] tdone, int [] ends){
        S639=1;
    S633=0;
    if(bottleLeft5.getprestatus()){//sysj\conveyorPlant.sysj line: 57, column: 25
      bottleLeft5S.setPresent();//sysj\conveyorPlant.sysj line: 57, column: 39
      currsigs.addElement(bottleLeft5S);
      S633=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S633=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread663(int [] tdone, int [] ends){
        S657=1;
    thread664(tdone,ends);
    thread665(tdone,ends);
    thread666(tdone,ends);
    int biggest667 = 0;
    if(ends[5]>=biggest667){
      biggest667=ends[5];
    }
    if(ends[6]>=biggest667){
      biggest667=ends[6];
    }
    if(ends[7]>=biggest667){
      biggest667=ends[7];
    }
    if(biggest667 == 1){
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread662(int [] tdone, int [] ends){
        S631=1;
    S567=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread661(int [] tdone, int [] ends){
        S563=1;
    S499=0;
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
      switch(S659){
        case 0 : 
          S659=0;
          break RUN;
        
        case 1 : 
          S659=2;
          S659=2;
          thread661(tdone,ends);
          thread662(tdone,ends);
          thread663(tdone,ends);
          int biggest668 = 0;
          if(ends[2]>=biggest668){
            biggest668=ends[2];
          }
          if(ends[3]>=biggest668){
            biggest668=ends[3];
          }
          if(ends[4]>=biggest668){
            biggest668=ends[4];
          }
          if(biggest668 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread669(tdone,ends);
          thread670(tdone,ends);
          thread671(tdone,ends);
          int biggest676 = 0;
          if(ends[2]>=biggest676){
            biggest676=ends[2];
          }
          if(ends[3]>=biggest676){
            biggest676=ends[3];
          }
          if(ends[4]>=biggest676){
            biggest676=ends[4];
          }
          if(biggest676 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest676 == 0){
            S659=0;
            active[1]=0;
            ends[1]=0;
            S659=0;
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
          df = true;
        }
        runClockDomain();
      }
      tick.setpreclear();
      motor.setpreclear();
      CbottlePos5.setpreclear();
      bottleLeft5.setpreclear();
      bottlePos1.setpreclear();
      loaderDone.setpreclear();
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
      bottleLeft5.sethook();
      bottleLeft5.setClear();
      bottlePos1.sethook();
      bottlePos1.setClear();
      loaderDone.sethook();
      loaderDone.setClear();
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
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
