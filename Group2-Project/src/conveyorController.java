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
  public Signal conveyorEnable = new Signal("conveyorEnable", Signal.INPUT);
  public Signal NbottlePos5 = new Signal("NbottlePos5", Signal.INPUT);
  public Signal NloaderDone = new Signal("NloaderDone", Signal.INPUT);
  public Signal NbottlePos1 = new Signal("NbottlePos1", Signal.OUTPUT);
  public Signal Nmotor = new Signal("Nmotor", Signal.OUTPUT);
  public Signal NbottleLeft5 = new Signal("NbottleLeft5", Signal.OUTPUT);
  public Signal motor = new Signal("motor", Signal.OUTPUT);
  public Signal CbottlePos5 = new Signal("CbottlePos5", Signal.OUTPUT);
  public Signal CloaderDone = new Signal("CloaderDone", Signal.OUTPUT);
  private int S900 = 1;
  private int S814 = 1;
  private int S774 = 1;
  private int S858 = 1;
  private int S818 = 1;
  private int S866 = 1;
  private int S860 = 1;
  private int S874 = 1;
  private int S882 = 1;
  private int S890 = 1;
  private int S898 = 1;
  
  private int[] ends = new int[9];
  private int[] tdone = new int[9];
  
  public void thread916(int [] tdone, int [] ends){
        switch(S898){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(bottleLeft5.getprestatus()){//sysj\conveyorController.sysj line: 65, column: 27
          NbottleLeft5.setPresent();//sysj\conveyorController.sysj line: 65, column: 41
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

  public void thread915(int [] tdone, int [] ends){
        switch(S890){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(motor.getprestatus()){//sysj\conveyorController.sysj line: 63, column: 27
          Nmotor.setPresent();//sysj\conveyorController.sysj line: 63, column: 35
          currsigs.addElement(Nmotor);
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

  public void thread914(int [] tdone, int [] ends){
        switch(S882){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(bottlePos1.getprestatus()){//sysj\conveyorController.sysj line: 61, column: 27
          NbottlePos1.setPresent();//sysj\conveyorController.sysj line: 61, column: 40
          currsigs.addElement(NbottlePos1);
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

  public void thread913(int [] tdone, int [] ends){
        switch(S874){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(NloaderDone.getprestatus()){//sysj\conveyorController.sysj line: 59, column: 27
          CloaderDone.setPresent();//sysj\conveyorController.sysj line: 59, column: 41
          currsigs.addElement(CloaderDone);
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

  public void thread912(int [] tdone, int [] ends){
        switch(S866){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S860){
          case 0 : 
            S860=0;
            if(NbottlePos5.getprestatus()){//sysj\conveyorController.sysj line: 57, column: 27
              CbottlePos5.setPresent();//sysj\conveyorController.sysj line: 57, column: 41
              currsigs.addElement(CbottlePos5);
              S860=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S860=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S860=1;
            S860=0;
            if(NbottlePos5.getprestatus()){//sysj\conveyorController.sysj line: 57, column: 27
              CbottlePos5.setPresent();//sysj\conveyorController.sysj line: 57, column: 41
              currsigs.addElement(CbottlePos5);
              S860=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S860=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread911(int [] tdone, int [] ends){
        switch(S858){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S818){
          case 0 : 
            if(!NbottlePos5.getprestatus()){//sysj\conveyorController.sysj line: 42, column: 10
              S818=1;
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
            if(NbottlePos5.getprestatus()){//sysj\conveyorController.sysj line: 43, column: 10
              S818=2;
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
            if(!bottlePos1.getprestatus() && !bottleLeft5.getprestatus()){//sysj\conveyorController.sysj line: 45, column: 10
              S818=3;
              motor.setPresent();//sysj\conveyorController.sysj line: 50, column: 5
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
          
          case 3 : 
            if(bottleLeft5.getprestatus()){//sysj\conveyorController.sysj line: 49, column: 10
              S818=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              motor.setPresent();//sysj\conveyorController.sysj line: 50, column: 5
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

  public void thread910(int [] tdone, int [] ends){
        switch(S814){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S774){
          case 0 : 
            if(!NloaderDone.getprestatus()){//sysj\conveyorController.sysj line: 27, column: 10
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
            if(NloaderDone.getprestatus()){//sysj\conveyorController.sysj line: 28, column: 10
              S774=2;
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
            if(!bottlePos1.getprestatus() && !bottleLeft5.getprestatus()){//sysj\conveyorController.sysj line: 30, column: 10
              S774=3;
              motor.setPresent();//sysj\conveyorController.sysj line: 35, column: 5
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
          
          case 3 : 
            if(bottlePos1.getprestatus()){//sysj\conveyorController.sysj line: 34, column: 10
              S774=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              motor.setPresent();//sysj\conveyorController.sysj line: 35, column: 5
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

  public void thread908(int [] tdone, int [] ends){
        S898=1;
    if(bottleLeft5.getprestatus()){//sysj\conveyorController.sysj line: 65, column: 27
      NbottleLeft5.setPresent();//sysj\conveyorController.sysj line: 65, column: 41
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

  public void thread907(int [] tdone, int [] ends){
        S890=1;
    if(motor.getprestatus()){//sysj\conveyorController.sysj line: 63, column: 27
      Nmotor.setPresent();//sysj\conveyorController.sysj line: 63, column: 35
      currsigs.addElement(Nmotor);
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

  public void thread906(int [] tdone, int [] ends){
        S882=1;
    if(bottlePos1.getprestatus()){//sysj\conveyorController.sysj line: 61, column: 27
      NbottlePos1.setPresent();//sysj\conveyorController.sysj line: 61, column: 40
      currsigs.addElement(NbottlePos1);
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

  public void thread905(int [] tdone, int [] ends){
        S874=1;
    if(NloaderDone.getprestatus()){//sysj\conveyorController.sysj line: 59, column: 27
      CloaderDone.setPresent();//sysj\conveyorController.sysj line: 59, column: 41
      currsigs.addElement(CloaderDone);
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

  public void thread904(int [] tdone, int [] ends){
        S866=1;
    S860=0;
    if(NbottlePos5.getprestatus()){//sysj\conveyorController.sysj line: 57, column: 27
      CbottlePos5.setPresent();//sysj\conveyorController.sysj line: 57, column: 41
      currsigs.addElement(CbottlePos5);
      S860=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S860=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread903(int [] tdone, int [] ends){
        S858=1;
    S818=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread902(int [] tdone, int [] ends){
        S814=1;
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
      switch(S900){
        case 0 : 
          S900=0;
          break RUN;
        
        case 1 : 
          S900=2;
          S900=2;
          thread902(tdone,ends);
          thread903(tdone,ends);
          thread904(tdone,ends);
          thread905(tdone,ends);
          thread906(tdone,ends);
          thread907(tdone,ends);
          thread908(tdone,ends);
          int biggest909 = 0;
          if(ends[2]>=biggest909){
            biggest909=ends[2];
          }
          if(ends[3]>=biggest909){
            biggest909=ends[3];
          }
          if(ends[4]>=biggest909){
            biggest909=ends[4];
          }
          if(ends[5]>=biggest909){
            biggest909=ends[5];
          }
          if(ends[6]>=biggest909){
            biggest909=ends[6];
          }
          if(ends[7]>=biggest909){
            biggest909=ends[7];
          }
          if(ends[8]>=biggest909){
            biggest909=ends[8];
          }
          if(biggest909 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread910(tdone,ends);
          thread911(tdone,ends);
          thread912(tdone,ends);
          thread913(tdone,ends);
          thread914(tdone,ends);
          thread915(tdone,ends);
          thread916(tdone,ends);
          int biggest917 = 0;
          if(ends[2]>=biggest917){
            biggest917=ends[2];
          }
          if(ends[3]>=biggest917){
            biggest917=ends[3];
          }
          if(ends[4]>=biggest917){
            biggest917=ends[4];
          }
          if(ends[5]>=biggest917){
            biggest917=ends[5];
          }
          if(ends[6]>=biggest917){
            biggest917=ends[6];
          }
          if(ends[7]>=biggest917){
            biggest917=ends[7];
          }
          if(ends[8]>=biggest917){
            biggest917=ends[8];
          }
          if(biggest917 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest917 == 0){
            S900=0;
            active[1]=0;
            ends[1]=0;
            S900=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          conveyorEnable.gethook();
          NbottlePos5.gethook();
          NloaderDone.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleLeft5.setpreclear();
      bottlePos1.setpreclear();
      conveyorEnable.setpreclear();
      NbottlePos5.setpreclear();
      NloaderDone.setpreclear();
      NbottlePos1.setpreclear();
      Nmotor.setpreclear();
      NbottleLeft5.setpreclear();
      motor.setpreclear();
      CbottlePos5.setpreclear();
      CloaderDone.setpreclear();
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
      dummyint = conveyorEnable.getStatus() ? conveyorEnable.setprepresent() : conveyorEnable.setpreclear();
      conveyorEnable.setpreval(conveyorEnable.getValue());
      conveyorEnable.setClear();
      dummyint = NbottlePos5.getStatus() ? NbottlePos5.setprepresent() : NbottlePos5.setpreclear();
      NbottlePos5.setpreval(NbottlePos5.getValue());
      NbottlePos5.setClear();
      dummyint = NloaderDone.getStatus() ? NloaderDone.setprepresent() : NloaderDone.setpreclear();
      NloaderDone.setpreval(NloaderDone.getValue());
      NloaderDone.setClear();
      NbottlePos1.sethook();
      NbottlePos1.setClear();
      Nmotor.sethook();
      Nmotor.setClear();
      NbottleLeft5.sethook();
      NbottleLeft5.setClear();
      motor.sethook();
      motor.setClear();
      CbottlePos5.sethook();
      CbottlePos5.setClear();
      CloaderDone.sethook();
      CloaderDone.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        bottleLeft5.gethook();
        bottlePos1.gethook();
        conveyorEnable.gethook();
        NbottlePos5.gethook();
        NloaderDone.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
