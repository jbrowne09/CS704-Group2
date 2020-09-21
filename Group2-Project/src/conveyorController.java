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
  public Signal motor = new Signal("motor", Signal.OUTPUT);
  public Signal CbottlePos5 = new Signal("CbottlePos5", Signal.OUTPUT);
  public Signal CloaderDone = new Signal("CloaderDone", Signal.OUTPUT);
  private int S880 = 1;
  private int S808 = 1;
  private int S774 = 1;
  private int S846 = 1;
  private int S812 = 1;
  private int S854 = 1;
  private int S848 = 1;
  private int S862 = 1;
  private int S870 = 1;
  private int S878 = 1;
  
  private int[] ends = new int[8];
  private int[] tdone = new int[8];
  
  public void thread894(int [] tdone, int [] ends){
        switch(S878){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(motor.getprestatus()){//sysj\conveyorController.sysj line: 58, column: 27
          Nmotor.setPresent();//sysj\conveyorController.sysj line: 58, column: 35
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

  public void thread893(int [] tdone, int [] ends){
        switch(S870){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(bottlePos1.getprestatus()){//sysj\conveyorController.sysj line: 56, column: 27
          NbottlePos1.setPresent();//sysj\conveyorController.sysj line: 56, column: 40
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

  public void thread892(int [] tdone, int [] ends){
        switch(S862){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(NloaderDone.getprestatus()){//sysj\conveyorController.sysj line: 54, column: 27
          CloaderDone.setPresent();//sysj\conveyorController.sysj line: 54, column: 41
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

  public void thread891(int [] tdone, int [] ends){
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
            if(NbottlePos5.getprestatus()){//sysj\conveyorController.sysj line: 52, column: 27
              CbottlePos5.setPresent();//sysj\conveyorController.sysj line: 52, column: 41
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
            if(NbottlePos5.getprestatus()){//sysj\conveyorController.sysj line: 52, column: 27
              CbottlePos5.setPresent();//sysj\conveyorController.sysj line: 52, column: 41
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

  public void thread890(int [] tdone, int [] ends){
        switch(S846){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S812){
          case 0 : 
            if(NbottlePos5.getprestatus()){//sysj\conveyorController.sysj line: 38, column: 10
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
            if(!bottlePos1.getprestatus() && !bottleLeft5.getprestatus()){//sysj\conveyorController.sysj line: 40, column: 10
              S812=2;
              motor.setPresent();//sysj\conveyorController.sysj line: 45, column: 5
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
            if(bottleLeft5.getprestatus()){//sysj\conveyorController.sysj line: 44, column: 10
              S812=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              motor.setPresent();//sysj\conveyorController.sysj line: 45, column: 5
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

  public void thread889(int [] tdone, int [] ends){
        switch(S808){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S774){
          case 0 : 
            if(NloaderDone.getprestatus()){//sysj\conveyorController.sysj line: 24, column: 10
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
            if(!bottlePos1.getprestatus() && !bottleLeft5.getprestatus()){//sysj\conveyorController.sysj line: 26, column: 10
              S774=2;
              motor.setPresent();//sysj\conveyorController.sysj line: 31, column: 5
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
            if(bottlePos1.getprestatus()){//sysj\conveyorController.sysj line: 30, column: 10
              S774=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              motor.setPresent();//sysj\conveyorController.sysj line: 31, column: 5
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

  public void thread887(int [] tdone, int [] ends){
        S878=1;
    if(motor.getprestatus()){//sysj\conveyorController.sysj line: 58, column: 27
      Nmotor.setPresent();//sysj\conveyorController.sysj line: 58, column: 35
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

  public void thread886(int [] tdone, int [] ends){
        S870=1;
    if(bottlePos1.getprestatus()){//sysj\conveyorController.sysj line: 56, column: 27
      NbottlePos1.setPresent();//sysj\conveyorController.sysj line: 56, column: 40
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

  public void thread885(int [] tdone, int [] ends){
        S862=1;
    if(NloaderDone.getprestatus()){//sysj\conveyorController.sysj line: 54, column: 27
      CloaderDone.setPresent();//sysj\conveyorController.sysj line: 54, column: 41
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

  public void thread884(int [] tdone, int [] ends){
        S854=1;
    S848=0;
    if(NbottlePos5.getprestatus()){//sysj\conveyorController.sysj line: 52, column: 27
      CbottlePos5.setPresent();//sysj\conveyorController.sysj line: 52, column: 41
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

  public void thread883(int [] tdone, int [] ends){
        S846=1;
    S812=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread882(int [] tdone, int [] ends){
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
      switch(S880){
        case 0 : 
          S880=0;
          break RUN;
        
        case 1 : 
          S880=2;
          S880=2;
          thread882(tdone,ends);
          thread883(tdone,ends);
          thread884(tdone,ends);
          thread885(tdone,ends);
          thread886(tdone,ends);
          thread887(tdone,ends);
          int biggest888 = 0;
          if(ends[2]>=biggest888){
            biggest888=ends[2];
          }
          if(ends[3]>=biggest888){
            biggest888=ends[3];
          }
          if(ends[4]>=biggest888){
            biggest888=ends[4];
          }
          if(ends[5]>=biggest888){
            biggest888=ends[5];
          }
          if(ends[6]>=biggest888){
            biggest888=ends[6];
          }
          if(ends[7]>=biggest888){
            biggest888=ends[7];
          }
          if(biggest888 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread889(tdone,ends);
          thread890(tdone,ends);
          thread891(tdone,ends);
          thread892(tdone,ends);
          thread893(tdone,ends);
          thread894(tdone,ends);
          int biggest895 = 0;
          if(ends[2]>=biggest895){
            biggest895=ends[2];
          }
          if(ends[3]>=biggest895){
            biggest895=ends[3];
          }
          if(ends[4]>=biggest895){
            biggest895=ends[4];
          }
          if(ends[5]>=biggest895){
            biggest895=ends[5];
          }
          if(ends[6]>=biggest895){
            biggest895=ends[6];
          }
          if(ends[7]>=biggest895){
            biggest895=ends[7];
          }
          if(biggest895 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest895 == 0){
            S880=0;
            active[1]=0;
            ends[1]=0;
            S880=0;
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
