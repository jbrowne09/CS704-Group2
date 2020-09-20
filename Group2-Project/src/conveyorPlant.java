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
  private int S726 = 1;
  private int S636 = 1;
  private int S614 = 1;
  private int S698 = 1;
  private int S640 = 1;
  private int S724 = 1;
  private int S706 = 1;
  private int S700 = 1;
  private int S714 = 1;
  private int S722 = 1;
  
  private int[] ends = new int[8];
  private int[] tdone = new int[8];
  
  public void thread741(int [] tdone, int [] ends){
        switch(S722){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(bottleLeft5.getprestatus()){//sysj\conveyorPlant.sysj line: 40, column: 25
          bottleLeft5S.setPresent();//sysj\conveyorPlant.sysj line: 40, column: 39
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

  public void thread740(int [] tdone, int [] ends){
        switch(S714){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(bottlePos5.getprestatus()){//sysj\conveyorPlant.sysj line: 38, column: 25
          bottlePos5S.setPresent();//sysj\conveyorPlant.sysj line: 38, column: 38
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

  public void thread739(int [] tdone, int [] ends){
        switch(S706){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S700){
          case 0 : 
            S700=0;
            if(bottlePos1.getprestatus()){//sysj\conveyorPlant.sysj line: 36, column: 25
              bottlePos1S.setPresent();//sysj\conveyorPlant.sysj line: 36, column: 38
              currsigs.addElement(bottlePos1S);
              S700=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S700=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S700=1;
            S700=0;
            if(bottlePos1.getprestatus()){//sysj\conveyorPlant.sysj line: 36, column: 25
              bottlePos1S.setPresent();//sysj\conveyorPlant.sysj line: 36, column: 38
              currsigs.addElement(bottlePos1S);
              S700=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S700=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread738(int [] tdone, int [] ends){
        switch(S724){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        thread739(tdone,ends);
        thread740(tdone,ends);
        thread741(tdone,ends);
        int biggest742 = 0;
        if(ends[5]>=biggest742){
          biggest742=ends[5];
        }
        if(ends[6]>=biggest742){
          biggest742=ends[6];
        }
        if(ends[7]>=biggest742){
          biggest742=ends[7];
        }
        if(biggest742 == 1){
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        //FINXME code
        if(biggest742 == 0){
          S724=0;
          active[4]=0;
          ends[4]=0;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread737(int [] tdone, int [] ends){
        switch(S698){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S640){
          case 0 : 
            if(tick.getprestatus()){//sysj\conveyorPlant.sysj line: 21, column: 10
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
            if(!tick.getprestatus()){//sysj\conveyorPlant.sysj line: 22, column: 10
              S640=2;
              bottlePos1.setPresent();//sysj\conveyorPlant.sysj line: 24, column: 5
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
          
          case 2 : 
            if(tick.getprestatus()){//sysj\conveyorPlant.sysj line: 23, column: 10
              S640=3;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              bottlePos1.setPresent();//sysj\conveyorPlant.sysj line: 24, column: 5
              currsigs.addElement(bottlePos1);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 3 : 
            if(!tick.getprestatus()){//sysj\conveyorPlant.sysj line: 26, column: 10
              S640=4;
              bottlePos5.setPresent();//sysj\conveyorPlant.sysj line: 28, column: 5
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
          
          case 4 : 
            if(tick.getprestatus()){//sysj\conveyorPlant.sysj line: 27, column: 10
              S640=5;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              bottlePos5.setPresent();//sysj\conveyorPlant.sysj line: 28, column: 5
              currsigs.addElement(bottlePos5);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 5 : 
            if(!tick.getprestatus()){//sysj\conveyorPlant.sysj line: 30, column: 10
              S640=6;
              bottleLeft5.setPresent();//sysj\conveyorPlant.sysj line: 31, column: 4
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
          
          case 6 : 
            bottleLeft5.setPresent();//sysj\conveyorPlant.sysj line: 31, column: 4
            currsigs.addElement(bottleLeft5);
            active[3]=1;
            ends[3]=1;
            tdone[3]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread736(int [] tdone, int [] ends){
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

  public void thread733(int [] tdone, int [] ends){
        S722=1;
    if(bottleLeft5.getprestatus()){//sysj\conveyorPlant.sysj line: 40, column: 25
      bottleLeft5S.setPresent();//sysj\conveyorPlant.sysj line: 40, column: 39
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

  public void thread732(int [] tdone, int [] ends){
        S714=1;
    if(bottlePos5.getprestatus()){//sysj\conveyorPlant.sysj line: 38, column: 25
      bottlePos5S.setPresent();//sysj\conveyorPlant.sysj line: 38, column: 38
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

  public void thread731(int [] tdone, int [] ends){
        S706=1;
    S700=0;
    if(bottlePos1.getprestatus()){//sysj\conveyorPlant.sysj line: 36, column: 25
      bottlePos1S.setPresent();//sysj\conveyorPlant.sysj line: 36, column: 38
      currsigs.addElement(bottlePos1S);
      S700=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S700=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread730(int [] tdone, int [] ends){
        S724=1;
    thread731(tdone,ends);
    thread732(tdone,ends);
    thread733(tdone,ends);
    int biggest734 = 0;
    if(ends[5]>=biggest734){
      biggest734=ends[5];
    }
    if(ends[6]>=biggest734){
      biggest734=ends[6];
    }
    if(ends[7]>=biggest734){
      biggest734=ends[7];
    }
    if(biggest734 == 1){
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread729(int [] tdone, int [] ends){
        S698=1;
    S640=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread728(int [] tdone, int [] ends){
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
      switch(S726){
        case 0 : 
          S726=0;
          break RUN;
        
        case 1 : 
          S726=2;
          S726=2;
          thread728(tdone,ends);
          thread729(tdone,ends);
          thread730(tdone,ends);
          int biggest735 = 0;
          if(ends[2]>=biggest735){
            biggest735=ends[2];
          }
          if(ends[3]>=biggest735){
            biggest735=ends[3];
          }
          if(ends[4]>=biggest735){
            biggest735=ends[4];
          }
          if(biggest735 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread736(tdone,ends);
          thread737(tdone,ends);
          thread738(tdone,ends);
          int biggest743 = 0;
          if(ends[2]>=biggest743){
            biggest743=ends[2];
          }
          if(ends[3]>=biggest743){
            biggest743=ends[3];
          }
          if(ends[4]>=biggest743){
            biggest743=ends[4];
          }
          if(biggest743 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest743 == 0){
            S726=0;
            active[1]=0;
            ends[1]=0;
            S726=0;
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
