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
  private int S873 = 1;
  private int S787 = 1;
  private int S747 = 1;
  private int S831 = 1;
  private int S791 = 1;
  private int S839 = 1;
  private int S833 = 1;
  private int S847 = 1;
  private int S855 = 1;
  private int S863 = 1;
  private int S871 = 1;
  
  private int[] ends = new int[9];
  private int[] tdone = new int[9];
  
  public void thread889(int [] tdone, int [] ends){
        switch(S871){
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

  public void thread888(int [] tdone, int [] ends){
        switch(S863){
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

  public void thread887(int [] tdone, int [] ends){
        switch(S855){
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

  public void thread886(int [] tdone, int [] ends){
        switch(S847){
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

  public void thread885(int [] tdone, int [] ends){
        switch(S839){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S833){
          case 0 : 
            S833=0;
            if(NbottlePos5.getprestatus()){//sysj\conveyorController.sysj line: 57, column: 27
              CbottlePos5.setPresent();//sysj\conveyorController.sysj line: 57, column: 41
              currsigs.addElement(CbottlePos5);
              S833=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S833=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S833=1;
            S833=0;
            if(NbottlePos5.getprestatus()){//sysj\conveyorController.sysj line: 57, column: 27
              CbottlePos5.setPresent();//sysj\conveyorController.sysj line: 57, column: 41
              currsigs.addElement(CbottlePos5);
              S833=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S833=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread884(int [] tdone, int [] ends){
        switch(S831){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S791){
          case 0 : 
            if(!NbottlePos5.getprestatus()){//sysj\conveyorController.sysj line: 42, column: 10
              S791=1;
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
              S791=2;
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
              S791=3;
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
              S791=0;
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

  public void thread883(int [] tdone, int [] ends){
        switch(S787){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S747){
          case 0 : 
            if(!NloaderDone.getprestatus()){//sysj\conveyorController.sysj line: 27, column: 10
              S747=1;
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
              S747=2;
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
              S747=3;
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
              S747=0;
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

  public void thread881(int [] tdone, int [] ends){
        S871=1;
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

  public void thread880(int [] tdone, int [] ends){
        S863=1;
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

  public void thread879(int [] tdone, int [] ends){
        S855=1;
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

  public void thread878(int [] tdone, int [] ends){
        S847=1;
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

  public void thread877(int [] tdone, int [] ends){
        S839=1;
    S833=0;
    if(NbottlePos5.getprestatus()){//sysj\conveyorController.sysj line: 57, column: 27
      CbottlePos5.setPresent();//sysj\conveyorController.sysj line: 57, column: 41
      currsigs.addElement(CbottlePos5);
      S833=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S833=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread876(int [] tdone, int [] ends){
        S831=1;
    S791=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread875(int [] tdone, int [] ends){
        S787=1;
    S747=0;
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
      switch(S873){
        case 0 : 
          S873=0;
          break RUN;
        
        case 1 : 
          S873=2;
          S873=2;
          thread875(tdone,ends);
          thread876(tdone,ends);
          thread877(tdone,ends);
          thread878(tdone,ends);
          thread879(tdone,ends);
          thread880(tdone,ends);
          thread881(tdone,ends);
          int biggest882 = 0;
          if(ends[2]>=biggest882){
            biggest882=ends[2];
          }
          if(ends[3]>=biggest882){
            biggest882=ends[3];
          }
          if(ends[4]>=biggest882){
            biggest882=ends[4];
          }
          if(ends[5]>=biggest882){
            biggest882=ends[5];
          }
          if(ends[6]>=biggest882){
            biggest882=ends[6];
          }
          if(ends[7]>=biggest882){
            biggest882=ends[7];
          }
          if(ends[8]>=biggest882){
            biggest882=ends[8];
          }
          if(biggest882 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread883(tdone,ends);
          thread884(tdone,ends);
          thread885(tdone,ends);
          thread886(tdone,ends);
          thread887(tdone,ends);
          thread888(tdone,ends);
          thread889(tdone,ends);
          int biggest890 = 0;
          if(ends[2]>=biggest890){
            biggest890=ends[2];
          }
          if(ends[3]>=biggest890){
            biggest890=ends[3];
          }
          if(ends[4]>=biggest890){
            biggest890=ends[4];
          }
          if(ends[5]>=biggest890){
            biggest890=ends[5];
          }
          if(ends[6]>=biggest890){
            biggest890=ends[6];
          }
          if(ends[7]>=biggest890){
            biggest890=ends[7];
          }
          if(ends[8]>=biggest890){
            biggest890=ends[8];
          }
          if(biggest890 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest890 == 0){
            S873=0;
            active[1]=0;
            ends[1]=0;
            S873=0;
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
