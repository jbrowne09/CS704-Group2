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
  private int S1049 = 1;
  private int S953 = 1;
  private int S889 = 1;
  private int S1021 = 1;
  private int S957 = 1;
  private int S1047 = 1;
  private int S1029 = 1;
  private int S1023 = 1;
  private int S1037 = 1;
  private int S1045 = 1;
  
  private int[] ends = new int[8];
  private int[] tdone = new int[8];
  
  public void thread1064(int [] tdone, int [] ends){
        switch(S1045){
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

  public void thread1063(int [] tdone, int [] ends){
        switch(S1037){
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

  public void thread1062(int [] tdone, int [] ends){
        switch(S1029){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S1023){
          case 0 : 
            S1023=0;
            if(bottleLeft5.getprestatus()){//sysj\conveyorPlant.sysj line: 57, column: 25
              bottleLeft5S.setPresent();//sysj\conveyorPlant.sysj line: 57, column: 39
              currsigs.addElement(bottleLeft5S);
              S1023=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S1023=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S1023=1;
            S1023=0;
            if(bottleLeft5.getprestatus()){//sysj\conveyorPlant.sysj line: 57, column: 25
              bottleLeft5S.setPresent();//sysj\conveyorPlant.sysj line: 57, column: 39
              currsigs.addElement(bottleLeft5S);
              S1023=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S1023=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1061(int [] tdone, int [] ends){
        switch(S1047){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        thread1062(tdone,ends);
        thread1063(tdone,ends);
        thread1064(tdone,ends);
        int biggest1065 = 0;
        if(ends[5]>=biggest1065){
          biggest1065=ends[5];
        }
        if(ends[6]>=biggest1065){
          biggest1065=ends[6];
        }
        if(ends[7]>=biggest1065){
          biggest1065=ends[7];
        }
        if(biggest1065 == 1){
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        //FINXME code
        if(biggest1065 == 0){
          S1047=0;
          active[4]=0;
          ends[4]=0;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread1060(int [] tdone, int [] ends){
        switch(S1021){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S957){
          case 0 : 
            if(tick.getprestatus() && CbottlePos5.getprestatus()){//sysj\conveyorPlant.sysj line: 34, column: 10
              S957=1;
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
              S957=2;
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
              S957=3;
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
              S957=4;
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
              S957=5;
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
              S957=6;
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
              S957=7;
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
              S957=0;
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

  public void thread1059(int [] tdone, int [] ends){
        switch(S953){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S889){
          case 0 : 
            if(tick.getprestatus()){//sysj\conveyorPlant.sysj line: 18, column: 10
              S889=1;
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
              S889=2;
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
              S889=3;
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
              S889=4;
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
              S889=0;
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

  public void thread1056(int [] tdone, int [] ends){
        S1045=1;
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

  public void thread1055(int [] tdone, int [] ends){
        S1037=1;
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

  public void thread1054(int [] tdone, int [] ends){
        S1029=1;
    S1023=0;
    if(bottleLeft5.getprestatus()){//sysj\conveyorPlant.sysj line: 57, column: 25
      bottleLeft5S.setPresent();//sysj\conveyorPlant.sysj line: 57, column: 39
      currsigs.addElement(bottleLeft5S);
      S1023=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S1023=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread1053(int [] tdone, int [] ends){
        S1047=1;
    thread1054(tdone,ends);
    thread1055(tdone,ends);
    thread1056(tdone,ends);
    int biggest1057 = 0;
    if(ends[5]>=biggest1057){
      biggest1057=ends[5];
    }
    if(ends[6]>=biggest1057){
      biggest1057=ends[6];
    }
    if(ends[7]>=biggest1057){
      biggest1057=ends[7];
    }
    if(biggest1057 == 1){
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread1052(int [] tdone, int [] ends){
        S1021=1;
    S957=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread1051(int [] tdone, int [] ends){
        S953=1;
    S889=0;
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
      switch(S1049){
        case 0 : 
          S1049=0;
          break RUN;
        
        case 1 : 
          S1049=2;
          S1049=2;
          thread1051(tdone,ends);
          thread1052(tdone,ends);
          thread1053(tdone,ends);
          int biggest1058 = 0;
          if(ends[2]>=biggest1058){
            biggest1058=ends[2];
          }
          if(ends[3]>=biggest1058){
            biggest1058=ends[3];
          }
          if(ends[4]>=biggest1058){
            biggest1058=ends[4];
          }
          if(biggest1058 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread1059(tdone,ends);
          thread1060(tdone,ends);
          thread1061(tdone,ends);
          int biggest1066 = 0;
          if(ends[2]>=biggest1066){
            biggest1066=ends[2];
          }
          if(ends[3]>=biggest1066){
            biggest1066=ends[3];
          }
          if(ends[4]>=biggest1066){
            biggest1066=ends[4];
          }
          if(biggest1066 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1066 == 0){
            S1049=0;
            active[1]=0;
            ends[1]=0;
            S1049=0;
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
