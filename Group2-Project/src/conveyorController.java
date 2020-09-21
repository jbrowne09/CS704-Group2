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
  private int S482 = 1;
  private int S418 = 1;
  private int S384 = 1;
  private int S456 = 1;
  private int S422 = 1;
  private int S464 = 1;
  private int S458 = 1;
  private int S472 = 1;
  private int S480 = 1;
  
  private int[] ends = new int[7];
  private int[] tdone = new int[7];
  
  public void thread494(int [] tdone, int [] ends){
        switch(S480){
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

  public void thread493(int [] tdone, int [] ends){
        switch(S472){
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

  public void thread492(int [] tdone, int [] ends){
        switch(S464){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S458){
          case 0 : 
            S458=0;
            if(NbottlePos5.getprestatus()){//sysj\conveyorController.sysj line: 51, column: 27
              CbottlePos5.setPresent();//sysj\conveyorController.sysj line: 51, column: 41
              currsigs.addElement(CbottlePos5);
              S458=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S458=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S458=1;
            S458=0;
            if(NbottlePos5.getprestatus()){//sysj\conveyorController.sysj line: 51, column: 27
              CbottlePos5.setPresent();//sysj\conveyorController.sysj line: 51, column: 41
              currsigs.addElement(CbottlePos5);
              S458=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S458=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread491(int [] tdone, int [] ends){
        switch(S456){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S422){
          case 0 : 
            if(NbottlePos5.getprestatus()){//sysj\conveyorController.sysj line: 37, column: 10
              S422=1;
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
              S422=2;
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
              S422=0;
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

  public void thread490(int [] tdone, int [] ends){
        switch(S418){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S384){
          case 0 : 
            if(loaderDone.getprestatus()){//sysj\conveyorController.sysj line: 23, column: 10
              S384=1;
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
              S384=2;
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
              S384=0;
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

  public void thread488(int [] tdone, int [] ends){
        S480=1;
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

  public void thread487(int [] tdone, int [] ends){
        S472=1;
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

  public void thread486(int [] tdone, int [] ends){
        S464=1;
    S458=0;
    if(NbottlePos5.getprestatus()){//sysj\conveyorController.sysj line: 51, column: 27
      CbottlePos5.setPresent();//sysj\conveyorController.sysj line: 51, column: 41
      currsigs.addElement(CbottlePos5);
      S458=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S458=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread485(int [] tdone, int [] ends){
        S456=1;
    S422=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread484(int [] tdone, int [] ends){
        S418=1;
    S384=0;
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
      switch(S482){
        case 0 : 
          S482=0;
          break RUN;
        
        case 1 : 
          S482=2;
          S482=2;
          thread484(tdone,ends);
          thread485(tdone,ends);
          thread486(tdone,ends);
          thread487(tdone,ends);
          thread488(tdone,ends);
          int biggest489 = 0;
          if(ends[2]>=biggest489){
            biggest489=ends[2];
          }
          if(ends[3]>=biggest489){
            biggest489=ends[3];
          }
          if(ends[4]>=biggest489){
            biggest489=ends[4];
          }
          if(ends[5]>=biggest489){
            biggest489=ends[5];
          }
          if(ends[6]>=biggest489){
            biggest489=ends[6];
          }
          if(biggest489 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread490(tdone,ends);
          thread491(tdone,ends);
          thread492(tdone,ends);
          thread493(tdone,ends);
          thread494(tdone,ends);
          int biggest495 = 0;
          if(ends[2]>=biggest495){
            biggest495=ends[2];
          }
          if(ends[3]>=biggest495){
            biggest495=ends[3];
          }
          if(ends[4]>=biggest495){
            biggest495=ends[4];
          }
          if(ends[5]>=biggest495){
            biggest495=ends[5];
          }
          if(ends[6]>=biggest495){
            biggest495=ends[6];
          }
          if(biggest495 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest495 == 0){
            S482=0;
            active[1]=0;
            ends[1]=0;
            S482=0;
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
