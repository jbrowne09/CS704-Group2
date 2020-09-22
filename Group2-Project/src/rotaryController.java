import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class rotaryController extends ClockDomain{
  public rotaryController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottlePos2 = new Signal("bottlePos2", Signal.INPUT);
  public Signal bottlePos3 = new Signal("bottlePos3", Signal.INPUT);
  public Signal bottlePos4 = new Signal("bottlePos4", Signal.INPUT);
  public Signal bottlePos5 = new Signal("bottlePos5", Signal.INPUT);
  public Signal aligned = new Signal("aligned", Signal.INPUT);
  public Signal rotaryEnable = new Signal("rotaryEnable", Signal.INPUT);
  public Signal NbottlePos1 = new Signal("NbottlePos1", Signal.INPUT);
  public Signal Nmotor = new Signal("Nmotor", Signal.INPUT);
  public Signal NbottlePos5 = new Signal("NbottlePos5", Signal.OUTPUT);
  public Signal rotate = new Signal("rotate", Signal.OUTPUT);
  public Signal CbottlePos1 = new Signal("CbottlePos1", Signal.OUTPUT);
  public Signal Cmotor = new Signal("Cmotor", Signal.OUTPUT);
  public Signal NbottlePos2 = new Signal("NbottlePos2", Signal.OUTPUT);
  public Signal NbottlePos4 = new Signal("NbottlePos4", Signal.OUTPUT);
  public Signal NbottlePos3 = new Signal("NbottlePos3", Signal.OUTPUT);
  private int S7633 = 1;
  private int S7583 = 1;
  private int S7543 = 1;
  private int S7591 = 1;
  private int S7585 = 1;
  private int S7599 = 1;
  private int S7607 = 1;
  private int S7615 = 1;
  private int S7623 = 1;
  private int S7631 = 1;
  
  private int[] ends = new int[9];
  private int[] tdone = new int[9];
  
  public void thread7649(int [] tdone, int [] ends){
        switch(S7631){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(bottlePos4.getprestatus()){//sysj\rotaryController.sysj line: 53, column: 27
          NbottlePos4.setPresent();//sysj\rotaryController.sysj line: 53, column: 40
          currsigs.addElement(NbottlePos4);
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

  public void thread7648(int [] tdone, int [] ends){
        switch(S7623){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(bottlePos3.getprestatus()){//sysj\rotaryController.sysj line: 51, column: 27
          NbottlePos3.setPresent();//sysj\rotaryController.sysj line: 51, column: 40
          currsigs.addElement(NbottlePos3);
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

  public void thread7647(int [] tdone, int [] ends){
        switch(S7615){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(bottlePos2.getprestatus()){//sysj\rotaryController.sysj line: 49, column: 27
          NbottlePos2.setPresent();//sysj\rotaryController.sysj line: 49, column: 40
          currsigs.addElement(NbottlePos2);
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

  public void thread7646(int [] tdone, int [] ends){
        switch(S7607){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(bottlePos5.getprestatus()){//sysj\rotaryController.sysj line: 47, column: 27
          NbottlePos5.setPresent();//sysj\rotaryController.sysj line: 47, column: 40
          currsigs.addElement(NbottlePos5);
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

  public void thread7645(int [] tdone, int [] ends){
        switch(S7599){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(Nmotor.getprestatus()){//sysj\rotaryController.sysj line: 45, column: 27
          Cmotor.setPresent();//sysj\rotaryController.sysj line: 45, column: 36
          currsigs.addElement(Cmotor);
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        else {
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread7644(int [] tdone, int [] ends){
        switch(S7591){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S7585){
          case 0 : 
            S7585=0;
            if(NbottlePos1.getprestatus()){//sysj\rotaryController.sysj line: 43, column: 27
              CbottlePos1.setPresent();//sysj\rotaryController.sysj line: 43, column: 41
              currsigs.addElement(CbottlePos1);
              S7585=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S7585=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            S7585=1;
            S7585=0;
            if(NbottlePos1.getprestatus()){//sysj\rotaryController.sysj line: 43, column: 27
              CbottlePos1.setPresent();//sysj\rotaryController.sysj line: 43, column: 41
              currsigs.addElement(CbottlePos1);
              S7585=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S7585=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread7643(int [] tdone, int [] ends){
        switch(S7583){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S7543){
          case 0 : 
            if(NbottlePos1.getprestatus() || bottlePos2.getprestatus() || bottlePos3.getprestatus() || bottlePos4.getprestatus()){//sysj\rotaryController.sysj line: 26, column: 10
              S7543=1;
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
            if(!aligned.getprestatus()){//sysj\rotaryController.sysj line: 30, column: 10
              S7543=2;
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
            if(rotaryEnable.getprestatus()){//sysj\rotaryController.sysj line: 34, column: 10
              S7543=3;
              rotate.setPresent();//sysj\rotaryController.sysj line: 36, column: 5
              currsigs.addElement(rotate);
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
            if(aligned.getprestatus()){//sysj\rotaryController.sysj line: 35, column: 10
              S7543=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              rotate.setPresent();//sysj\rotaryController.sysj line: 36, column: 5
              currsigs.addElement(rotate);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread7641(int [] tdone, int [] ends){
        S7631=1;
    if(bottlePos4.getprestatus()){//sysj\rotaryController.sysj line: 53, column: 27
      NbottlePos4.setPresent();//sysj\rotaryController.sysj line: 53, column: 40
      currsigs.addElement(NbottlePos4);
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

  public void thread7640(int [] tdone, int [] ends){
        S7623=1;
    if(bottlePos3.getprestatus()){//sysj\rotaryController.sysj line: 51, column: 27
      NbottlePos3.setPresent();//sysj\rotaryController.sysj line: 51, column: 40
      currsigs.addElement(NbottlePos3);
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

  public void thread7639(int [] tdone, int [] ends){
        S7615=1;
    if(bottlePos2.getprestatus()){//sysj\rotaryController.sysj line: 49, column: 27
      NbottlePos2.setPresent();//sysj\rotaryController.sysj line: 49, column: 40
      currsigs.addElement(NbottlePos2);
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

  public void thread7638(int [] tdone, int [] ends){
        S7607=1;
    if(bottlePos5.getprestatus()){//sysj\rotaryController.sysj line: 47, column: 27
      NbottlePos5.setPresent();//sysj\rotaryController.sysj line: 47, column: 40
      currsigs.addElement(NbottlePos5);
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

  public void thread7637(int [] tdone, int [] ends){
        S7599=1;
    if(Nmotor.getprestatus()){//sysj\rotaryController.sysj line: 45, column: 27
      Cmotor.setPresent();//sysj\rotaryController.sysj line: 45, column: 36
      currsigs.addElement(Cmotor);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread7636(int [] tdone, int [] ends){
        S7591=1;
    S7585=0;
    if(NbottlePos1.getprestatus()){//sysj\rotaryController.sysj line: 43, column: 27
      CbottlePos1.setPresent();//sysj\rotaryController.sysj line: 43, column: 41
      currsigs.addElement(CbottlePos1);
      S7585=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S7585=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread7635(int [] tdone, int [] ends){
        S7583=1;
    S7543=0;
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
      switch(S7633){
        case 0 : 
          S7633=0;
          break RUN;
        
        case 1 : 
          S7633=2;
          S7633=2;
          thread7635(tdone,ends);
          thread7636(tdone,ends);
          thread7637(tdone,ends);
          thread7638(tdone,ends);
          thread7639(tdone,ends);
          thread7640(tdone,ends);
          thread7641(tdone,ends);
          int biggest7642 = 0;
          if(ends[2]>=biggest7642){
            biggest7642=ends[2];
          }
          if(ends[3]>=biggest7642){
            biggest7642=ends[3];
          }
          if(ends[4]>=biggest7642){
            biggest7642=ends[4];
          }
          if(ends[5]>=biggest7642){
            biggest7642=ends[5];
          }
          if(ends[6]>=biggest7642){
            biggest7642=ends[6];
          }
          if(ends[7]>=biggest7642){
            biggest7642=ends[7];
          }
          if(ends[8]>=biggest7642){
            biggest7642=ends[8];
          }
          if(biggest7642 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread7643(tdone,ends);
          thread7644(tdone,ends);
          thread7645(tdone,ends);
          thread7646(tdone,ends);
          thread7647(tdone,ends);
          thread7648(tdone,ends);
          thread7649(tdone,ends);
          int biggest7650 = 0;
          if(ends[2]>=biggest7650){
            biggest7650=ends[2];
          }
          if(ends[3]>=biggest7650){
            biggest7650=ends[3];
          }
          if(ends[4]>=biggest7650){
            biggest7650=ends[4];
          }
          if(ends[5]>=biggest7650){
            biggest7650=ends[5];
          }
          if(ends[6]>=biggest7650){
            biggest7650=ends[6];
          }
          if(ends[7]>=biggest7650){
            biggest7650=ends[7];
          }
          if(ends[8]>=biggest7650){
            biggest7650=ends[8];
          }
          if(biggest7650 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest7650 == 0){
            S7633=0;
            active[1]=0;
            ends[1]=0;
            S7633=0;
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
          bottlePos2.gethook();
          bottlePos3.gethook();
          bottlePos4.gethook();
          bottlePos5.gethook();
          aligned.gethook();
          rotaryEnable.gethook();
          NbottlePos1.gethook();
          Nmotor.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottlePos2.setpreclear();
      bottlePos3.setpreclear();
      bottlePos4.setpreclear();
      bottlePos5.setpreclear();
      aligned.setpreclear();
      rotaryEnable.setpreclear();
      NbottlePos1.setpreclear();
      Nmotor.setpreclear();
      NbottlePos5.setpreclear();
      rotate.setpreclear();
      CbottlePos1.setpreclear();
      Cmotor.setpreclear();
      NbottlePos2.setpreclear();
      NbottlePos4.setpreclear();
      NbottlePos3.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottlePos2.getStatus() ? bottlePos2.setprepresent() : bottlePos2.setpreclear();
      bottlePos2.setpreval(bottlePos2.getValue());
      bottlePos2.setClear();
      dummyint = bottlePos3.getStatus() ? bottlePos3.setprepresent() : bottlePos3.setpreclear();
      bottlePos3.setpreval(bottlePos3.getValue());
      bottlePos3.setClear();
      dummyint = bottlePos4.getStatus() ? bottlePos4.setprepresent() : bottlePos4.setpreclear();
      bottlePos4.setpreval(bottlePos4.getValue());
      bottlePos4.setClear();
      dummyint = bottlePos5.getStatus() ? bottlePos5.setprepresent() : bottlePos5.setpreclear();
      bottlePos5.setpreval(bottlePos5.getValue());
      bottlePos5.setClear();
      dummyint = aligned.getStatus() ? aligned.setprepresent() : aligned.setpreclear();
      aligned.setpreval(aligned.getValue());
      aligned.setClear();
      dummyint = rotaryEnable.getStatus() ? rotaryEnable.setprepresent() : rotaryEnable.setpreclear();
      rotaryEnable.setpreval(rotaryEnable.getValue());
      rotaryEnable.setClear();
      dummyint = NbottlePos1.getStatus() ? NbottlePos1.setprepresent() : NbottlePos1.setpreclear();
      NbottlePos1.setpreval(NbottlePos1.getValue());
      NbottlePos1.setClear();
      dummyint = Nmotor.getStatus() ? Nmotor.setprepresent() : Nmotor.setpreclear();
      Nmotor.setpreval(Nmotor.getValue());
      Nmotor.setClear();
      NbottlePos5.sethook();
      NbottlePos5.setClear();
      rotate.sethook();
      rotate.setClear();
      CbottlePos1.sethook();
      CbottlePos1.setClear();
      Cmotor.sethook();
      Cmotor.setClear();
      NbottlePos2.sethook();
      NbottlePos2.setClear();
      NbottlePos4.sethook();
      NbottlePos4.setClear();
      NbottlePos3.sethook();
      NbottlePos3.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        bottlePos2.gethook();
        bottlePos3.gethook();
        bottlePos4.gethook();
        bottlePos5.gethook();
        aligned.gethook();
        rotaryEnable.gethook();
        NbottlePos1.gethook();
        Nmotor.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
