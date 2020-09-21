import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class fillerController extends ClockDomain{
  public fillerController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottlePos2 = new Signal("bottlePos2", Signal.INPUT);
  public Signal canBottom = new Signal("canBottom", Signal.INPUT);
  public Signal canTop = new Signal("canTop", Signal.INPUT);
  public Signal liquid1 = new Signal("liquid1", Signal.INPUT);
  public Signal liquid2 = new Signal("liquid2", Signal.INPUT);
  public Signal liquid3 = new Signal("liquid3", Signal.INPUT);
  public Signal liquid4 = new Signal("liquid4", Signal.INPUT);
  public Signal fillerEnable = new Signal("fillerEnable", Signal.INPUT);
  public Signal inletOn = new Signal("inletOn", Signal.OUTPUT);
  public Signal injectorOn = new Signal("injectorOn", Signal.OUTPUT);
  public Signal valveRetract = new Signal("valveRetract", Signal.OUTPUT);
  public Signal valveExtend = new Signal("valveExtend", Signal.OUTPUT);
  public Signal liquidPos1 = new Signal("liquidPos1", Signal.OUTPUT);
  public Signal liquidPos2 = new Signal("liquidPos2", Signal.OUTPUT);
  public Signal liquidPos3 = new Signal("liquidPos3", Signal.OUTPUT);
  public Signal liquidPos4 = new Signal("liquidPos4", Signal.OUTPUT);
  public Signal fillerDone = new Signal("fillerDone", Signal.OUTPUT);
  private int S818 = 1;
  private int S782 = 1;
  private int S564 = 1;
  private int S569 = 1;
  private int S587 = 1;
  private int S592 = 1;
  private int S816 = 1;
  private int S790 = 1;
  private int S798 = 1;
  private int S806 = 1;
  private int S814 = 1;
  
  private int[] ends = new int[12];
  private int[] tdone = new int[12];
  
  public void thread848(int [] tdone, int [] ends){
        switch(S814){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(liquid4.getprestatus()){//sysj\fillerController.sysj line: 35, column: 25
          liquidPos4.setPresent();//sysj\fillerController.sysj line: 35, column: 35
          currsigs.addElement(liquidPos4);
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        else {
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread847(int [] tdone, int [] ends){
        switch(S806){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(liquid3.getprestatus()){//sysj\fillerController.sysj line: 33, column: 25
          liquidPos3.setPresent();//sysj\fillerController.sysj line: 33, column: 35
          currsigs.addElement(liquidPos3);
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
  }

  public void thread846(int [] tdone, int [] ends){
        switch(S798){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(liquid2.getprestatus()){//sysj\fillerController.sysj line: 31, column: 25
          liquidPos2.setPresent();//sysj\fillerController.sysj line: 31, column: 35
          currsigs.addElement(liquidPos2);
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

  public void thread845(int [] tdone, int [] ends){
        switch(S790){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(liquid1.getprestatus()){//sysj\fillerController.sysj line: 29, column: 25
          liquidPos1.setPresent();//sysj\fillerController.sysj line: 29, column: 35
          currsigs.addElement(liquidPos1);
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

  public void thread844(int [] tdone, int [] ends){
        switch(S816){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        thread845(tdone,ends);
        thread846(tdone,ends);
        thread847(tdone,ends);
        thread848(tdone,ends);
        int biggest849 = 0;
        if(ends[8]>=biggest849){
          biggest849=ends[8];
        }
        if(ends[9]>=biggest849){
          biggest849=ends[9];
        }
        if(ends[10]>=biggest849){
          biggest849=ends[10];
        }
        if(ends[11]>=biggest849){
          biggest849=ends[11];
        }
        if(biggest849 == 1){
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        //FINXME code
        if(biggest849 == 0){
          S816=0;
          active[7]=0;
          ends[7]=0;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread842(int [] tdone, int [] ends){
        switch(S592){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        valveExtend.setPresent();//sysj\fillerController.sysj line: 22, column: 6
        currsigs.addElement(valveExtend);
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
        break;
      
    }
  }

  public void thread841(int [] tdone, int [] ends){
        switch(S587){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        inletOn.setPresent();//sysj\fillerController.sysj line: 20, column: 6
        currsigs.addElement(inletOn);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
        break;
      
    }
  }

  public void thread839(int [] tdone, int [] ends){
        S592=1;
    valveExtend.setPresent();//sysj\fillerController.sysj line: 22, column: 6
    currsigs.addElement(valveExtend);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread838(int [] tdone, int [] ends){
        S587=1;
    inletOn.setPresent();//sysj\fillerController.sysj line: 20, column: 6
    currsigs.addElement(inletOn);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread836(int [] tdone, int [] ends){
        active[4]=0;
    ends[4]=0;
    tdone[4]=1;
  }

  public void thread835(int [] tdone, int [] ends){
        switch(S569){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        injectorOn.setPresent();//sysj\fillerController.sysj line: 12, column: 6
        currsigs.addElement(injectorOn);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread833(int [] tdone, int [] ends){
        S592=1;
    valveExtend.setPresent();//sysj\fillerController.sysj line: 22, column: 6
    currsigs.addElement(valveExtend);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread832(int [] tdone, int [] ends){
        S587=1;
    inletOn.setPresent();//sysj\fillerController.sysj line: 20, column: 6
    currsigs.addElement(inletOn);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread830(int [] tdone, int [] ends){
        if(canBottom.getprestatus()){//sysj\fillerController.sysj line: 14, column: 15
      valveRetract.setPresent();//sysj\fillerController.sysj line: 15, column: 6
      currsigs.addElement(valveRetract);
      active[4]=0;
      ends[4]=0;
      tdone[4]=1;
    }
    else {
      active[4]=0;
      ends[4]=0;
      tdone[4]=1;
    }
  }

  public void thread829(int [] tdone, int [] ends){
        S569=1;
    injectorOn.setPresent();//sysj\fillerController.sysj line: 12, column: 6
    currsigs.addElement(injectorOn);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread828(int [] tdone, int [] ends){
        switch(S782){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S564){
          case 0 : 
            if(fillerEnable.getprestatus()){//sysj\fillerController.sysj line: 9, column: 10
              S564=1;
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
            if(bottlePos2.getprestatus()){//sysj\fillerController.sysj line: 10, column: 10
              S564=2;
              thread829(tdone,ends);
              thread830(tdone,ends);
              int biggest831 = 0;
              if(ends[3]>=biggest831){
                biggest831=ends[3];
              }
              if(ends[4]>=biggest831){
                biggest831=ends[4];
              }
              if(biggest831 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 2 : 
            if(canTop.getprestatus()){//sysj\fillerController.sysj line: 11, column: 10
              S564=3;
              thread832(tdone,ends);
              thread833(tdone,ends);
              int biggest834 = 0;
              if(ends[5]>=biggest834){
                biggest834=ends[5];
              }
              if(ends[6]>=biggest834){
                biggest834=ends[6];
              }
              if(biggest834 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              thread835(tdone,ends);
              thread836(tdone,ends);
              int biggest837 = 0;
              if(ends[3]>=biggest837){
                biggest837=ends[3];
              }
              if(ends[4]>=biggest837){
                biggest837=ends[4];
              }
              if(biggest837 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest837 == 0){
                S564=3;
                thread838(tdone,ends);
                thread839(tdone,ends);
                int biggest840 = 0;
                if(ends[5]>=biggest840){
                  biggest840=ends[5];
                }
                if(ends[6]>=biggest840){
                  biggest840=ends[6];
                }
                if(biggest840 == 1){
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
            }
            break;
          
          case 3 : 
            if(canBottom.getprestatus()){//sysj\fillerController.sysj line: 19, column: 10
              fillerDone.setPresent();//sysj\fillerController.sysj line: 24, column: 4
              currsigs.addElement(fillerDone);
              S564=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              thread841(tdone,ends);
              thread842(tdone,ends);
              int biggest843 = 0;
              if(ends[5]>=biggest843){
                biggest843=ends[5];
              }
              if(ends[6]>=biggest843){
                biggest843=ends[6];
              }
              if(biggest843 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest843 == 0){
                fillerDone.setPresent();//sysj\fillerController.sysj line: 24, column: 4
                currsigs.addElement(fillerDone);
                S564=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread825(int [] tdone, int [] ends){
        S814=1;
    if(liquid4.getprestatus()){//sysj\fillerController.sysj line: 35, column: 25
      liquidPos4.setPresent();//sysj\fillerController.sysj line: 35, column: 35
      currsigs.addElement(liquidPos4);
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread824(int [] tdone, int [] ends){
        S806=1;
    if(liquid3.getprestatus()){//sysj\fillerController.sysj line: 33, column: 25
      liquidPos3.setPresent();//sysj\fillerController.sysj line: 33, column: 35
      currsigs.addElement(liquidPos3);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread823(int [] tdone, int [] ends){
        S798=1;
    if(liquid2.getprestatus()){//sysj\fillerController.sysj line: 31, column: 25
      liquidPos2.setPresent();//sysj\fillerController.sysj line: 31, column: 35
      currsigs.addElement(liquidPos2);
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

  public void thread822(int [] tdone, int [] ends){
        S790=1;
    if(liquid1.getprestatus()){//sysj\fillerController.sysj line: 29, column: 25
      liquidPos1.setPresent();//sysj\fillerController.sysj line: 29, column: 35
      currsigs.addElement(liquidPos1);
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

  public void thread821(int [] tdone, int [] ends){
        S816=1;
    thread822(tdone,ends);
    thread823(tdone,ends);
    thread824(tdone,ends);
    thread825(tdone,ends);
    int biggest826 = 0;
    if(ends[8]>=biggest826){
      biggest826=ends[8];
    }
    if(ends[9]>=biggest826){
      biggest826=ends[9];
    }
    if(ends[10]>=biggest826){
      biggest826=ends[10];
    }
    if(ends[11]>=biggest826){
      biggest826=ends[11];
    }
    if(biggest826 == 1){
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread820(int [] tdone, int [] ends){
        S782=1;
    S564=0;
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
      switch(S818){
        case 0 : 
          S818=0;
          break RUN;
        
        case 1 : 
          S818=2;
          S818=2;
          thread820(tdone,ends);
          thread821(tdone,ends);
          int biggest827 = 0;
          if(ends[2]>=biggest827){
            biggest827=ends[2];
          }
          if(ends[7]>=biggest827){
            biggest827=ends[7];
          }
          if(biggest827 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread828(tdone,ends);
          thread844(tdone,ends);
          int biggest850 = 0;
          if(ends[2]>=biggest850){
            biggest850=ends[2];
          }
          if(ends[7]>=biggest850){
            biggest850=ends[7];
          }
          if(biggest850 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest850 == 0){
            S818=0;
            active[1]=0;
            ends[1]=0;
            S818=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          bottlePos2.gethook();
          canBottom.gethook();
          canTop.gethook();
          liquid1.gethook();
          liquid2.gethook();
          liquid3.gethook();
          liquid4.gethook();
          fillerEnable.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottlePos2.setpreclear();
      canBottom.setpreclear();
      canTop.setpreclear();
      liquid1.setpreclear();
      liquid2.setpreclear();
      liquid3.setpreclear();
      liquid4.setpreclear();
      fillerEnable.setpreclear();
      inletOn.setpreclear();
      injectorOn.setpreclear();
      valveRetract.setpreclear();
      valveExtend.setpreclear();
      liquidPos1.setpreclear();
      liquidPos2.setpreclear();
      liquidPos3.setpreclear();
      liquidPos4.setpreclear();
      fillerDone.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottlePos2.getStatus() ? bottlePos2.setprepresent() : bottlePos2.setpreclear();
      bottlePos2.setpreval(bottlePos2.getValue());
      bottlePos2.setClear();
      dummyint = canBottom.getStatus() ? canBottom.setprepresent() : canBottom.setpreclear();
      canBottom.setpreval(canBottom.getValue());
      canBottom.setClear();
      dummyint = canTop.getStatus() ? canTop.setprepresent() : canTop.setpreclear();
      canTop.setpreval(canTop.getValue());
      canTop.setClear();
      dummyint = liquid1.getStatus() ? liquid1.setprepresent() : liquid1.setpreclear();
      liquid1.setpreval(liquid1.getValue());
      liquid1.setClear();
      dummyint = liquid2.getStatus() ? liquid2.setprepresent() : liquid2.setpreclear();
      liquid2.setpreval(liquid2.getValue());
      liquid2.setClear();
      dummyint = liquid3.getStatus() ? liquid3.setprepresent() : liquid3.setpreclear();
      liquid3.setpreval(liquid3.getValue());
      liquid3.setClear();
      dummyint = liquid4.getStatus() ? liquid4.setprepresent() : liquid4.setpreclear();
      liquid4.setpreval(liquid4.getValue());
      liquid4.setClear();
      dummyint = fillerEnable.getStatus() ? fillerEnable.setprepresent() : fillerEnable.setpreclear();
      fillerEnable.setpreval(fillerEnable.getValue());
      fillerEnable.setClear();
      inletOn.sethook();
      inletOn.setClear();
      injectorOn.sethook();
      injectorOn.setClear();
      valveRetract.sethook();
      valveRetract.setClear();
      valveExtend.sethook();
      valveExtend.setClear();
      liquidPos1.sethook();
      liquidPos1.setClear();
      liquidPos2.sethook();
      liquidPos2.setClear();
      liquidPos3.sethook();
      liquidPos3.setClear();
      liquidPos4.sethook();
      liquidPos4.setClear();
      fillerDone.sethook();
      fillerDone.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        bottlePos2.gethook();
        canBottom.gethook();
        canTop.gethook();
        liquid1.gethook();
        liquid2.gethook();
        liquid3.gethook();
        liquid4.gethook();
        fillerEnable.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
