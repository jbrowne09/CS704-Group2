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
  public Signal enable = new Signal("enable", Signal.INPUT);
  public Signal bottleLeft5 = new Signal("bottleLeft5", Signal.OUTPUT);
  public Signal bottlePos1 = new Signal("bottlePos1", Signal.OUTPUT);
  public Signal bottlePos5 = new Signal("bottlePos5", Signal.OUTPUT);
  public Signal bottleLeft5S = new Signal("bottleLeft5S", Signal.OUTPUT);
  public Signal bottlePos1S = new Signal("bottlePos1S", Signal.OUTPUT);
  public Signal bottlePos5S = new Signal("bottlePos5S", Signal.OUTPUT);
  public Signal motorS = new Signal("motorS", Signal.OUTPUT);
  private int S352 = 1;
  private int S142 = 1;
  private int S120 = 1;
  private int S204 = 1;
  private int S146 = 1;
  private int S230 = 1;
  private int S212 = 1;
  private int S206 = 1;
  private int S220 = 1;
  private int S228 = 1;
  
  private int[] ends = new int[8];
  private int[] tdone = new int[8];
  
  public void thread367(int [] tdone, int [] ends){
        switch(S228){
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

  public void thread366(int [] tdone, int [] ends){
        switch(S220){
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

  public void thread365(int [] tdone, int [] ends){
        switch(S212){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S206){
          case 0 : 
            S206=0;
            if(bottlePos1.getprestatus()){//sysj\conveyorPlant.sysj line: 36, column: 25
              bottlePos1S.setPresent();//sysj\conveyorPlant.sysj line: 36, column: 38
              currsigs.addElement(bottlePos1S);
              S206=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S206=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S206=1;
            S206=0;
            if(bottlePos1.getprestatus()){//sysj\conveyorPlant.sysj line: 36, column: 25
              bottlePos1S.setPresent();//sysj\conveyorPlant.sysj line: 36, column: 38
              currsigs.addElement(bottlePos1S);
              S206=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S206=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread364(int [] tdone, int [] ends){
        switch(S230){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        thread365(tdone,ends);
        thread366(tdone,ends);
        thread367(tdone,ends);
        int biggest368 = 0;
        if(ends[5]>=biggest368){
          biggest368=ends[5];
        }
        if(ends[6]>=biggest368){
          biggest368=ends[6];
        }
        if(ends[7]>=biggest368){
          biggest368=ends[7];
        }
        if(biggest368 == 1){
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        //FINXME code
        if(biggest368 == 0){
          S230=0;
          active[4]=0;
          ends[4]=0;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread363(int [] tdone, int [] ends){
        switch(S204){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S146){
          case 0 : 
            if(enable.getprestatus()){//sysj\conveyorPlant.sysj line: 21, column: 10
              S146=1;
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
            if(!enable.getprestatus()){//sysj\conveyorPlant.sysj line: 22, column: 10
              S146=2;
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
            if(enable.getprestatus()){//sysj\conveyorPlant.sysj line: 23, column: 10
              S146=3;
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
            if(!enable.getprestatus()){//sysj\conveyorPlant.sysj line: 26, column: 10
              S146=4;
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
            if(enable.getprestatus()){//sysj\conveyorPlant.sysj line: 27, column: 10
              S146=5;
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
            if(!enable.getprestatus()){//sysj\conveyorPlant.sysj line: 30, column: 10
              S146=6;
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

  public void thread362(int [] tdone, int [] ends){
        switch(S142){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S120){
          case 0 : 
            if(motor.getprestatus()){//sysj\conveyorPlant.sysj line: 12, column: 10
              S120=1;
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
              S120=0;
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

  public void thread359(int [] tdone, int [] ends){
        S228=1;
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

  public void thread358(int [] tdone, int [] ends){
        S220=1;
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

  public void thread357(int [] tdone, int [] ends){
        S212=1;
    S206=0;
    if(bottlePos1.getprestatus()){//sysj\conveyorPlant.sysj line: 36, column: 25
      bottlePos1S.setPresent();//sysj\conveyorPlant.sysj line: 36, column: 38
      currsigs.addElement(bottlePos1S);
      S206=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S206=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread356(int [] tdone, int [] ends){
        S230=1;
    thread357(tdone,ends);
    thread358(tdone,ends);
    thread359(tdone,ends);
    int biggest360 = 0;
    if(ends[5]>=biggest360){
      biggest360=ends[5];
    }
    if(ends[6]>=biggest360){
      biggest360=ends[6];
    }
    if(ends[7]>=biggest360){
      biggest360=ends[7];
    }
    if(biggest360 == 1){
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread355(int [] tdone, int [] ends){
        S204=1;
    S146=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread354(int [] tdone, int [] ends){
        S142=1;
    S120=0;
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
      switch(S352){
        case 0 : 
          S352=0;
          break RUN;
        
        case 1 : 
          S352=2;
          S352=2;
          new Thread(new conveyorGUI()).start();//sysj\conveyorPlant.sysj line: 8, column: 2
          thread354(tdone,ends);
          thread355(tdone,ends);
          thread356(tdone,ends);
          int biggest361 = 0;
          if(ends[2]>=biggest361){
            biggest361=ends[2];
          }
          if(ends[3]>=biggest361){
            biggest361=ends[3];
          }
          if(ends[4]>=biggest361){
            biggest361=ends[4];
          }
          if(biggest361 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread362(tdone,ends);
          thread363(tdone,ends);
          thread364(tdone,ends);
          int biggest369 = 0;
          if(ends[2]>=biggest369){
            biggest369=ends[2];
          }
          if(ends[3]>=biggest369){
            biggest369=ends[3];
          }
          if(ends[4]>=biggest369){
            biggest369=ends[4];
          }
          if(biggest369 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest369 == 0){
            S352=0;
            active[1]=0;
            ends[1]=0;
            S352=0;
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
          enable.gethook();
          df = true;
        }
        runClockDomain();
      }
      motor.setpreclear();
      enable.setpreclear();
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
      dummyint = enable.getStatus() ? enable.setprepresent() : enable.setpreclear();
      enable.setpreval(enable.getValue());
      enable.setClear();
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
        enable.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
