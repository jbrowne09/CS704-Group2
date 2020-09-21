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
  public Signal CloaderDone = new Signal("CloaderDone", Signal.INPUT);
  public Signal bottleLeft5 = new Signal("bottleLeft5", Signal.OUTPUT);
  public Signal bottlePos1 = new Signal("bottlePos1", Signal.OUTPUT);
  public Signal bottleLeft5S = new Signal("bottleLeft5S", Signal.OUTPUT);
  public Signal bottlePos1S = new Signal("bottlePos1S", Signal.OUTPUT);
  public Signal motorS = new Signal("motorS", Signal.OUTPUT);
  private int S1059 = 1;
  private int S963 = 1;
  private int S899 = 1;
  private int S1031 = 1;
  private int S967 = 1;
  private int S1057 = 1;
  private int S1039 = 1;
  private int S1033 = 1;
  private int S1047 = 1;
  private int S1055 = 1;
  
  private int[] ends = new int[8];
  private int[] tdone = new int[8];
  
  public void thread1074(int [] tdone, int [] ends){
        switch(S1055){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(motor.getprestatus()){//sysj\conveyorPlant.sysj line: 75, column: 25
          motorS.setPresent();//sysj\conveyorPlant.sysj line: 75, column: 33
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

  public void thread1073(int [] tdone, int [] ends){
        switch(S1047){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(bottlePos1.getprestatus()){//sysj\conveyorPlant.sysj line: 73, column: 25
          bottlePos1S.setPresent();//sysj\conveyorPlant.sysj line: 73, column: 38
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

  public void thread1072(int [] tdone, int [] ends){
        switch(S1039){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S1033){
          case 0 : 
            S1033=0;
            if(bottleLeft5.getprestatus()){//sysj\conveyorPlant.sysj line: 71, column: 25
              bottleLeft5S.setPresent();//sysj\conveyorPlant.sysj line: 71, column: 39
              currsigs.addElement(bottleLeft5S);
              S1033=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S1033=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S1033=1;
            S1033=0;
            if(bottleLeft5.getprestatus()){//sysj\conveyorPlant.sysj line: 71, column: 25
              bottleLeft5S.setPresent();//sysj\conveyorPlant.sysj line: 71, column: 39
              currsigs.addElement(bottleLeft5S);
              S1033=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S1033=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1071(int [] tdone, int [] ends){
        switch(S1057){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        thread1072(tdone,ends);
        thread1073(tdone,ends);
        thread1074(tdone,ends);
        int biggest1075 = 0;
        if(ends[5]>=biggest1075){
          biggest1075=ends[5];
        }
        if(ends[6]>=biggest1075){
          biggest1075=ends[6];
        }
        if(ends[7]>=biggest1075){
          biggest1075=ends[7];
        }
        if(biggest1075 == 1){
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        //FINXME code
        if(biggest1075 == 0){
          S1057=0;
          active[4]=0;
          ends[4]=0;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread1070(int [] tdone, int [] ends){
        switch(S1031){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S967){
          case 0 : 
            if(tick.getprestatus() && CbottlePos5.getprestatus()){//sysj\conveyorPlant.sysj line: 48, column: 10
              S967=1;
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
            if(!tick.getprestatus()){//sysj\conveyorPlant.sysj line: 52, column: 10
              S967=2;
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
            if(tick.getprestatus() && motor.getprestatus()){//sysj\conveyorPlant.sysj line: 53, column: 10
              S967=3;
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
            if(!tick.getprestatus()){//sysj\conveyorPlant.sysj line: 57, column: 10
              S967=4;
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
            if(tick.getprestatus()){//sysj\conveyorPlant.sysj line: 58, column: 10
              S967=5;
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
            if(!tick.getprestatus()){//sysj\conveyorPlant.sysj line: 59, column: 10
              S967=6;
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
            if(!tick.getprestatus()){//sysj\conveyorPlant.sysj line: 61, column: 10
              S967=7;
              bottleLeft5.setPresent();//sysj\conveyorPlant.sysj line: 63, column: 5
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
            if(tick.getprestatus()){//sysj\conveyorPlant.sysj line: 62, column: 10
              S967=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              bottleLeft5.setPresent();//sysj\conveyorPlant.sysj line: 63, column: 5
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

  public void thread1069(int [] tdone, int [] ends){
        switch(S963){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S899){
          case 0 : 
            if(tick.getprestatus() && CloaderDone.getprestatus()){//sysj\conveyorPlant.sysj line: 26, column: 10
              S899=1;
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
            if(!tick.getprestatus()){//sysj\conveyorPlant.sysj line: 30, column: 10
              S899=2;
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
            if(tick.getprestatus() && motor.getprestatus()){//sysj\conveyorPlant.sysj line: 31, column: 10
              S899=3;
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
            if(!tick.getprestatus()){//sysj\conveyorPlant.sysj line: 35, column: 10
              S899=4;
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
            if(tick.getprestatus()){//sysj\conveyorPlant.sysj line: 36, column: 10
              S899=5;
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
            if(!tick.getprestatus()){//sysj\conveyorPlant.sysj line: 37, column: 10
              S899=6;
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
          
          case 6 : 
            if(!tick.getprestatus()){//sysj\conveyorPlant.sysj line: 39, column: 10
              S899=7;
              bottlePos1.setPresent();//sysj\conveyorPlant.sysj line: 41, column: 5
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
          
          case 7 : 
            if(tick.getprestatus()){//sysj\conveyorPlant.sysj line: 40, column: 10
              S899=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              bottlePos1.setPresent();//sysj\conveyorPlant.sysj line: 41, column: 5
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

  public void thread1066(int [] tdone, int [] ends){
        S1055=1;
    if(motor.getprestatus()){//sysj\conveyorPlant.sysj line: 75, column: 25
      motorS.setPresent();//sysj\conveyorPlant.sysj line: 75, column: 33
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

  public void thread1065(int [] tdone, int [] ends){
        S1047=1;
    if(bottlePos1.getprestatus()){//sysj\conveyorPlant.sysj line: 73, column: 25
      bottlePos1S.setPresent();//sysj\conveyorPlant.sysj line: 73, column: 38
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

  public void thread1064(int [] tdone, int [] ends){
        S1039=1;
    S1033=0;
    if(bottleLeft5.getprestatus()){//sysj\conveyorPlant.sysj line: 71, column: 25
      bottleLeft5S.setPresent();//sysj\conveyorPlant.sysj line: 71, column: 39
      currsigs.addElement(bottleLeft5S);
      S1033=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S1033=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread1063(int [] tdone, int [] ends){
        S1057=1;
    thread1064(tdone,ends);
    thread1065(tdone,ends);
    thread1066(tdone,ends);
    int biggest1067 = 0;
    if(ends[5]>=biggest1067){
      biggest1067=ends[5];
    }
    if(ends[6]>=biggest1067){
      biggest1067=ends[6];
    }
    if(ends[7]>=biggest1067){
      biggest1067=ends[7];
    }
    if(biggest1067 == 1){
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread1062(int [] tdone, int [] ends){
        S1031=1;
    S967=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread1061(int [] tdone, int [] ends){
        S963=1;
    S899=0;
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
      switch(S1059){
        case 0 : 
          S1059=0;
          break RUN;
        
        case 1 : 
          S1059=2;
          S1059=2;
          thread1061(tdone,ends);
          thread1062(tdone,ends);
          thread1063(tdone,ends);
          int biggest1068 = 0;
          if(ends[2]>=biggest1068){
            biggest1068=ends[2];
          }
          if(ends[3]>=biggest1068){
            biggest1068=ends[3];
          }
          if(ends[4]>=biggest1068){
            biggest1068=ends[4];
          }
          if(biggest1068 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread1069(tdone,ends);
          thread1070(tdone,ends);
          thread1071(tdone,ends);
          int biggest1076 = 0;
          if(ends[2]>=biggest1076){
            biggest1076=ends[2];
          }
          if(ends[3]>=biggest1076){
            biggest1076=ends[3];
          }
          if(ends[4]>=biggest1076){
            biggest1076=ends[4];
          }
          if(biggest1076 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1076 == 0){
            S1059=0;
            active[1]=0;
            ends[1]=0;
            S1059=0;
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
          CloaderDone.gethook();
          df = true;
        }
        runClockDomain();
      }
      tick.setpreclear();
      motor.setpreclear();
      CbottlePos5.setpreclear();
      CloaderDone.setpreclear();
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
      dummyint = motor.getStatus() ? motor.setprepresent() : motor.setpreclear();
      motor.setpreval(motor.getValue());
      motor.setClear();
      dummyint = CbottlePos5.getStatus() ? CbottlePos5.setprepresent() : CbottlePos5.setpreclear();
      CbottlePos5.setpreval(CbottlePos5.getValue());
      CbottlePos5.setClear();
      dummyint = CloaderDone.getStatus() ? CloaderDone.setprepresent() : CloaderDone.setpreclear();
      CloaderDone.setpreval(CloaderDone.getValue());
      CloaderDone.setClear();
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
        motor.gethook();
        CbottlePos5.gethook();
        CloaderDone.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
