import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class conveyorController extends ClockDomain{
  public conveyorController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottleLeft5 = new Signal("bottleLeft5", Signal.INPUT);
  public Signal bottlePos1 = new Signal("bottlePos1", Signal.INPUT);
  public Signal loaderDone = new Signal("loaderDone", Signal.INPUT);
  public Signal conveyorEnable = new Signal("conveyorEnable", Signal.INPUT);
  public Signal NbottlePos5 = new Signal("NbottlePos5", Signal.INPUT);
  public Signal NbottlePos1 = new Signal("NbottlePos1", Signal.OUTPUT);
  public Signal Nmotor = new Signal("Nmotor", Signal.OUTPUT);
  public Signal motor = new Signal("motor", Signal.OUTPUT);
  public Signal CbottlePos5 = new Signal("CbottlePos5", Signal.OUTPUT);
  private int S872 = 1;
  private int S808 = 1;
  private int S774 = 1;
  private int S846 = 1;
  private int S812 = 1;
  private int S854 = 1;
  private int S848 = 1;
  private int S862 = 1;
  private int S870 = 1;
  
  private int[] ends = new int[7];
  private int[] tdone = new int[7];
  
  public void thread884(int [] tdone, int [] ends){
        switch(S870){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(motor.getprestatus()){//sysj\conveyorController.sysj line: 55, column: 27
          Nmotor.setPresent();//sysj\conveyorController.sysj line: 55, column: 35
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

  public void thread883(int [] tdone, int [] ends){
        switch(S862){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(bottlePos1.getprestatus()){//sysj\conveyorController.sysj line: 53, column: 27
          NbottlePos1.setPresent();//sysj\conveyorController.sysj line: 53, column: 40
          currsigs.addElement(NbottlePos1);
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

  public void thread882(int [] tdone, int [] ends){
        switch(S854){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S848){
          case 0 : 
            S848=0;
            if(NbottlePos5.getprestatus()){//sysj\conveyorController.sysj line: 51, column: 27
              CbottlePos5.setPresent();//sysj\conveyorController.sysj line: 51, column: 41
              currsigs.addElement(CbottlePos5);
              S848=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S848=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S848=1;
            S848=0;
            if(NbottlePos5.getprestatus()){//sysj\conveyorController.sysj line: 51, column: 27
              CbottlePos5.setPresent();//sysj\conveyorController.sysj line: 51, column: 41
              currsigs.addElement(CbottlePos5);
              S848=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S848=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread881(int [] tdone, int [] ends){
        switch(S846){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S812){
          case 0 : 
            if(NbottlePos5.getprestatus()){//sysj\conveyorController.sysj line: 37, column: 10
              S812=1;
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
            if(!bottlePos1.getprestatus() && !bottleLeft5.getprestatus()){//sysj\conveyorController.sysj line: 39, column: 10
              S812=2;
              motor.setPresent();//sysj\conveyorController.sysj line: 44, column: 5
              currsigs.addElement(motor);
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
            if(bottleLeft5.getprestatus()){//sysj\conveyorController.sysj line: 43, column: 10
              S812=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              motor.setPresent();//sysj\conveyorController.sysj line: 44, column: 5
              currsigs.addElement(motor);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread880(int [] tdone, int [] ends){
        switch(S808){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S774){
          case 0 : 
            if(loaderDone.getprestatus()){//sysj\conveyorController.sysj line: 23, column: 10
              S774=1;
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
            if(!bottlePos1.getprestatus() && !bottleLeft5.getprestatus()){//sysj\conveyorController.sysj line: 25, column: 10
              S774=2;
              motor.setPresent();//sysj\conveyorController.sysj line: 30, column: 5
              currsigs.addElement(motor);
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
            if(bottlePos1.getprestatus()){//sysj\conveyorController.sysj line: 29, column: 10
              S774=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              motor.setPresent();//sysj\conveyorController.sysj line: 30, column: 5
              currsigs.addElement(motor);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread878(int [] tdone, int [] ends){
        S870=1;
    if(motor.getprestatus()){//sysj\conveyorController.sysj line: 55, column: 27
      Nmotor.setPresent();//sysj\conveyorController.sysj line: 55, column: 35
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

  public void thread877(int [] tdone, int [] ends){
        S862=1;
    if(bottlePos1.getprestatus()){//sysj\conveyorController.sysj line: 53, column: 27
      NbottlePos1.setPresent();//sysj\conveyorController.sysj line: 53, column: 40
      currsigs.addElement(NbottlePos1);
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

  public void thread876(int [] tdone, int [] ends){
        S854=1;
    S848=0;
    if(NbottlePos5.getprestatus()){//sysj\conveyorController.sysj line: 51, column: 27
      CbottlePos5.setPresent();//sysj\conveyorController.sysj line: 51, column: 41
      currsigs.addElement(CbottlePos5);
      S848=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S848=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread875(int [] tdone, int [] ends){
        S846=1;
    S812=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread874(int [] tdone, int [] ends){
        S808=1;
    S774=0;
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
      switch(S872){
        case 0 : 
          S872=0;
          break RUN;
        
        case 1 : 
          S872=2;
          S872=2;
          thread874(tdone,ends);
          thread875(tdone,ends);
          thread876(tdone,ends);
          thread877(tdone,ends);
          thread878(tdone,ends);
          int biggest879 = 0;
          if(ends[2]>=biggest879){
            biggest879=ends[2];
          }
          if(ends[3]>=biggest879){
            biggest879=ends[3];
          }
          if(ends[4]>=biggest879){
            biggest879=ends[4];
          }
          if(ends[5]>=biggest879){
            biggest879=ends[5];
          }
          if(ends[6]>=biggest879){
            biggest879=ends[6];
          }
          if(biggest879 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread880(tdone,ends);
          thread881(tdone,ends);
          thread882(tdone,ends);
          thread883(tdone,ends);
          thread884(tdone,ends);
          int biggest885 = 0;
          if(ends[2]>=biggest885){
            biggest885=ends[2];
          }
          if(ends[3]>=biggest885){
            biggest885=ends[3];
          }
          if(ends[4]>=biggest885){
            biggest885=ends[4];
          }
          if(ends[5]>=biggest885){
            biggest885=ends[5];
          }
          if(ends[6]>=biggest885){
            biggest885=ends[6];
          }
          if(biggest885 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest885 == 0){
            S872=0;
            active[1]=0;
            ends[1]=0;
            S872=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0};
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
          bottleLeft5.gethook();
          bottlePos1.gethook();
          loaderDone.gethook();
          conveyorEnable.gethook();
          NbottlePos5.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleLeft5.setpreclear();
      bottlePos1.setpreclear();
      loaderDone.setpreclear();
      conveyorEnable.setpreclear();
      NbottlePos5.setpreclear();
      NbottlePos1.setpreclear();
      Nmotor.setpreclear();
      motor.setpreclear();
      CbottlePos5.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottleLeft5.getStatus() ? bottleLeft5.setprepresent() : bottleLeft5.setpreclear();
      bottleLeft5.setpreval(bottleLeft5.getValue());
      bottleLeft5.setClear();
      dummyint = bottlePos1.getStatus() ? bottlePos1.setprepresent() : bottlePos1.setpreclear();
      bottlePos1.setpreval(bottlePos1.getValue());
      bottlePos1.setClear();
      dummyint = loaderDone.getStatus() ? loaderDone.setprepresent() : loaderDone.setpreclear();
      loaderDone.setpreval(loaderDone.getValue());
      loaderDone.setClear();
      dummyint = conveyorEnable.getStatus() ? conveyorEnable.setprepresent() : conveyorEnable.setpreclear();
      conveyorEnable.setpreval(conveyorEnable.getValue());
      conveyorEnable.setClear();
      dummyint = NbottlePos5.getStatus() ? NbottlePos5.setprepresent() : NbottlePos5.setpreclear();
      NbottlePos5.setpreval(NbottlePos5.getValue());
      NbottlePos5.setClear();
      NbottlePos1.sethook();
      NbottlePos1.setClear();
      Nmotor.sethook();
      Nmotor.setClear();
      motor.sethook();
      motor.setClear();
      CbottlePos5.sethook();
      CbottlePos5.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        bottleLeft5.gethook();
        bottlePos1.gethook();
        loaderDone.gethook();
        conveyorEnable.gethook();
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
