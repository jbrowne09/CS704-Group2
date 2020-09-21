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
  public Signal NbottlePos5 = new Signal("NbottlePos5", Signal.INPUT);
  public Signal bottleLeft5 = new Signal("bottleLeft5", Signal.OUTPUT);
  public Signal bottlePos1 = new Signal("bottlePos1", Signal.OUTPUT);
  public Signal bottlePos5 = new Signal("bottlePos5", Signal.OUTPUT);
  public Signal bottleAtConvStart = new Signal("bottleAtConvStart", Signal.OUTPUT);
  public Signal NbottlePos1 = new Signal("NbottlePos1", Signal.OUTPUT);
  public Signal NbottleLeft5 = new Signal("NbottleLeft5", Signal.OUTPUT);
  public Signal Nmotor = new Signal("Nmotor", Signal.OUTPUT);
  public Signal bottleLeft5S = new Signal("bottleLeft5S", Signal.OUTPUT);
  public Signal motorS = new Signal("motorS", Signal.OUTPUT);
  private int S734 = 1;
  private int S599 = 1;
  private int S576 = 1;
  private int S673 = 1;
  private int S609 = 1;
  private int S718 = 1;
  private int S681 = 1;
  private int S675 = 1;
  private int S692 = 1;
  private int S700 = 1;
  private int S708 = 1;
  private int S716 = 1;
  private int S732 = 1;
  private int S722 = 1;
  
  private int[] ends = new int[11];
  private int[] tdone = new int[11];
  
  public void thread756(int [] tdone, int [] ends){
        switch(S732){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S722){
          case 0 : 
            if(tick.getprestatus()){//sysj\conveyorPlant.sysj line: 72, column: 10
              S722=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 1 : 
            if(!tick.getprestatus()){//sysj\conveyorPlant.sysj line: 74, column: 10
              S722=0;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread754(int [] tdone, int [] ends){
        switch(S716){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(NbottlePos5.getprestatus()){//sysj\conveyorPlant.sysj line: 67, column: 25
          bottlePos5.setPresent();//sysj\conveyorPlant.sysj line: 67, column: 39
          currsigs.addElement(bottlePos5);
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        else {
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        break;
      
    }
  }

  public void thread753(int [] tdone, int [] ends){
        switch(S708){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(bottleLeft5.getprestatus()){//sysj\conveyorPlant.sysj line: 63, column: 25
          NbottleLeft5.setPresent();//sysj\conveyorPlant.sysj line: 63, column: 39
          currsigs.addElement(NbottleLeft5);
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

  public void thread752(int [] tdone, int [] ends){
        switch(S700){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(bottlePos1.getprestatus()){//sysj\conveyorPlant.sysj line: 61, column: 25
          NbottlePos1.setPresent();//sysj\conveyorPlant.sysj line: 61, column: 38
          currsigs.addElement(NbottlePos1);
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

  public void thread751(int [] tdone, int [] ends){
        switch(S692){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(motor.getprestatus()){//sysj\conveyorPlant.sysj line: 59, column: 25
          motorS.setPresent();//sysj\conveyorPlant.sysj line: 59, column: 33
          currsigs.addElement(motorS);
          Nmotor.setPresent();//sysj\conveyorPlant.sysj line: 59, column: 46
          currsigs.addElement(Nmotor);
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

  public void thread750(int [] tdone, int [] ends){
        switch(S681){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S675){
          case 0 : 
            S675=0;
            if(bottleLeft5.getprestatus()){//sysj\conveyorPlant.sysj line: 57, column: 25
              bottleLeft5S.setPresent();//sysj\conveyorPlant.sysj line: 57, column: 39
              currsigs.addElement(bottleLeft5S);
              S675=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S675=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S675=1;
            S675=0;
            if(bottleLeft5.getprestatus()){//sysj\conveyorPlant.sysj line: 57, column: 25
              bottleLeft5S.setPresent();//sysj\conveyorPlant.sysj line: 57, column: 39
              currsigs.addElement(bottleLeft5S);
              S675=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S675=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread749(int [] tdone, int [] ends){
        switch(S718){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        thread750(tdone,ends);
        thread751(tdone,ends);
        thread752(tdone,ends);
        thread753(tdone,ends);
        thread754(tdone,ends);
        int biggest755 = 0;
        if(ends[5]>=biggest755){
          biggest755=ends[5];
        }
        if(ends[6]>=biggest755){
          biggest755=ends[6];
        }
        if(ends[7]>=biggest755){
          biggest755=ends[7];
        }
        if(ends[8]>=biggest755){
          biggest755=ends[8];
        }
        if(ends[9]>=biggest755){
          biggest755=ends[9];
        }
        if(biggest755 == 1){
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        //FINXME code
        if(biggest755 == 0){
          S718=0;
          active[4]=0;
          ends[4]=0;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread748(int [] tdone, int [] ends){
        switch(S673){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S609){
          case 0 : 
            if(NbottlePos5.getprestatus()){//sysj\conveyorPlant.sysj line: 40, column: 10
              S609=1;
              bottlePos5.setPresent();//sysj\conveyorPlant.sysj line: 43, column: 5
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
          
          case 1 : 
            if(motor.getprestatus()){//sysj\conveyorPlant.sysj line: 42, column: 10
              S609=2;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              bottlePos5.setPresent();//sysj\conveyorPlant.sysj line: 43, column: 5
              currsigs.addElement(bottlePos5);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 2 : 
            if(tick.getprestatus()){//sysj\conveyorPlant.sysj line: 46, column: 10
              S609=3;
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
            if(!tick.getprestatus()){//sysj\conveyorPlant.sysj line: 47, column: 10
              S609=4;
              bottleLeft5.setPresent();//sysj\conveyorPlant.sysj line: 50, column: 5
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
          
          case 4 : 
            if(tick.getprestatus()){//sysj\conveyorPlant.sysj line: 49, column: 10
              S609=5;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              bottleLeft5.setPresent();//sysj\conveyorPlant.sysj line: 50, column: 5
              currsigs.addElement(bottleLeft5);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 5 : 
            if(!tick.getprestatus()){//sysj\conveyorPlant.sysj line: 52, column: 10
              S609=0;
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
          
        }
        break;
      
    }
  }

  public void thread747(int [] tdone, int [] ends){
        switch(S599){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S576){
          case 0 : 
            if(tick.getprestatus()){//sysj\conveyorPlant.sysj line: 21, column: 10
              S576=1;
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
            if(!tick.getprestatus()){//sysj\conveyorPlant.sysj line: 22, column: 10
              S576=2;
              bottleAtConvStart.setPresent();//sysj\conveyorPlant.sysj line: 25, column: 5
              currsigs.addElement(bottleAtConvStart);
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
            if(motor.getprestatus()){//sysj\conveyorPlant.sysj line: 24, column: 10
              S576=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              bottleAtConvStart.setPresent();//sysj\conveyorPlant.sysj line: 25, column: 5
              currsigs.addElement(bottleAtConvStart);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            if(tick.getprestatus()){//sysj\conveyorPlant.sysj line: 28, column: 10
              S576=4;
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
            if(!tick.getprestatus()){//sysj\conveyorPlant.sysj line: 29, column: 10
              S576=5;
              bottlePos1.setPresent();//sysj\conveyorPlant.sysj line: 32, column: 5
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
          
          case 5 : 
            if(tick.getprestatus()){//sysj\conveyorPlant.sysj line: 31, column: 10
              S576=6;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              bottlePos1.setPresent();//sysj\conveyorPlant.sysj line: 32, column: 5
              currsigs.addElement(bottlePos1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 6 : 
            if(!tick.getprestatus()){//sysj\conveyorPlant.sysj line: 34, column: 10
              S599=0;
              active[2]=0;
              ends[2]=0;
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

  public void thread745(int [] tdone, int [] ends){
        S732=1;
    S722=0;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread743(int [] tdone, int [] ends){
        S716=1;
    if(NbottlePos5.getprestatus()){//sysj\conveyorPlant.sysj line: 67, column: 25
      bottlePos5.setPresent();//sysj\conveyorPlant.sysj line: 67, column: 39
      currsigs.addElement(bottlePos5);
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread742(int [] tdone, int [] ends){
        S708=1;
    if(bottleLeft5.getprestatus()){//sysj\conveyorPlant.sysj line: 63, column: 25
      NbottleLeft5.setPresent();//sysj\conveyorPlant.sysj line: 63, column: 39
      currsigs.addElement(NbottleLeft5);
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

  public void thread741(int [] tdone, int [] ends){
        S700=1;
    if(bottlePos1.getprestatus()){//sysj\conveyorPlant.sysj line: 61, column: 25
      NbottlePos1.setPresent();//sysj\conveyorPlant.sysj line: 61, column: 38
      currsigs.addElement(NbottlePos1);
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

  public void thread740(int [] tdone, int [] ends){
        S692=1;
    if(motor.getprestatus()){//sysj\conveyorPlant.sysj line: 59, column: 25
      motorS.setPresent();//sysj\conveyorPlant.sysj line: 59, column: 33
      currsigs.addElement(motorS);
      Nmotor.setPresent();//sysj\conveyorPlant.sysj line: 59, column: 46
      currsigs.addElement(Nmotor);
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

  public void thread739(int [] tdone, int [] ends){
        S681=1;
    S675=0;
    if(bottleLeft5.getprestatus()){//sysj\conveyorPlant.sysj line: 57, column: 25
      bottleLeft5S.setPresent();//sysj\conveyorPlant.sysj line: 57, column: 39
      currsigs.addElement(bottleLeft5S);
      S675=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S675=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread738(int [] tdone, int [] ends){
        S718=1;
    thread739(tdone,ends);
    thread740(tdone,ends);
    thread741(tdone,ends);
    thread742(tdone,ends);
    thread743(tdone,ends);
    int biggest744 = 0;
    if(ends[5]>=biggest744){
      biggest744=ends[5];
    }
    if(ends[6]>=biggest744){
      biggest744=ends[6];
    }
    if(ends[7]>=biggest744){
      biggest744=ends[7];
    }
    if(ends[8]>=biggest744){
      biggest744=ends[8];
    }
    if(ends[9]>=biggest744){
      biggest744=ends[9];
    }
    if(biggest744 == 1){
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread737(int [] tdone, int [] ends){
        S673=1;
    S609=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread736(int [] tdone, int [] ends){
        S599=1;
    S576=0;
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
      switch(S734){
        case 0 : 
          S734=0;
          break RUN;
        
        case 1 : 
          S734=2;
          S734=2;
          thread736(tdone,ends);
          thread737(tdone,ends);
          thread738(tdone,ends);
          thread745(tdone,ends);
          int biggest746 = 0;
          if(ends[2]>=biggest746){
            biggest746=ends[2];
          }
          if(ends[3]>=biggest746){
            biggest746=ends[3];
          }
          if(ends[4]>=biggest746){
            biggest746=ends[4];
          }
          if(ends[10]>=biggest746){
            biggest746=ends[10];
          }
          if(biggest746 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread747(tdone,ends);
          thread748(tdone,ends);
          thread749(tdone,ends);
          thread756(tdone,ends);
          int biggest757 = 0;
          if(ends[2]>=biggest757){
            biggest757=ends[2];
          }
          if(ends[3]>=biggest757){
            biggest757=ends[3];
          }
          if(ends[4]>=biggest757){
            biggest757=ends[4];
          }
          if(ends[10]>=biggest757){
            biggest757=ends[10];
          }
          if(biggest757 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest757 == 0){
            S734=0;
            active[1]=0;
            ends[1]=0;
            S734=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          NbottlePos5.gethook();
          df = true;
        }
        runClockDomain();
      }
      motor.setpreclear();
      tick.setpreclear();
      NbottlePos5.setpreclear();
      bottleLeft5.setpreclear();
      bottlePos1.setpreclear();
      bottlePos5.setpreclear();
      bottleAtConvStart.setpreclear();
      NbottlePos1.setpreclear();
      NbottleLeft5.setpreclear();
      Nmotor.setpreclear();
      bottleLeft5S.setpreclear();
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
      dummyint = NbottlePos5.getStatus() ? NbottlePos5.setprepresent() : NbottlePos5.setpreclear();
      NbottlePos5.setpreval(NbottlePos5.getValue());
      NbottlePos5.setClear();
      bottleLeft5.sethook();
      bottleLeft5.setClear();
      bottlePos1.sethook();
      bottlePos1.setClear();
      bottlePos5.sethook();
      bottlePos5.setClear();
      bottleAtConvStart.sethook();
      bottleAtConvStart.setClear();
      NbottlePos1.sethook();
      NbottlePos1.setClear();
      NbottleLeft5.sethook();
      NbottleLeft5.setClear();
      Nmotor.sethook();
      Nmotor.setClear();
      bottleLeft5S.sethook();
      bottleLeft5S.setClear();
      motorS.sethook();
      motorS.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        motor.gethook();
        tick.gethook();
        NbottlePos5.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
