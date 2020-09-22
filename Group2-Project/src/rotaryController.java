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
  private int S4598 = 1;
  private int S4556 = 1;
  private int S4516 = 1;
  private int S4564 = 1;
  private int S4558 = 1;
  private int S4572 = 1;
  private int S4580 = 1;
  private int S4588 = 1;
  private int S4596 = 1;
  
  private int[] ends = new int[8];
  private int[] tdone = new int[8];
  
  public void thread4612(int [] tdone, int [] ends){
        switch(S4596){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(bottlePos4.getprestatus()){//sysj\rotaryController.sysj line: 51, column: 27
          NbottlePos4.setPresent();//sysj\rotaryController.sysj line: 51, column: 40
          currsigs.addElement(NbottlePos4);
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

  public void thread4611(int [] tdone, int [] ends){
        switch(S4588){
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

  public void thread4610(int [] tdone, int [] ends){
        switch(S4580){
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

  public void thread4609(int [] tdone, int [] ends){
        switch(S4572){
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

  public void thread4608(int [] tdone, int [] ends){
        switch(S4564){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S4558){
          case 0 : 
            S4558=0;
            if(NbottlePos1.getprestatus()){//sysj\rotaryController.sysj line: 43, column: 27
              CbottlePos1.setPresent();//sysj\rotaryController.sysj line: 43, column: 41
              currsigs.addElement(CbottlePos1);
              S4558=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S4558=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            S4558=1;
            S4558=0;
            if(NbottlePos1.getprestatus()){//sysj\rotaryController.sysj line: 43, column: 27
              CbottlePos1.setPresent();//sysj\rotaryController.sysj line: 43, column: 41
              currsigs.addElement(CbottlePos1);
              S4558=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S4558=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread4607(int [] tdone, int [] ends){
        switch(S4556){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S4516){
          case 0 : 
            if(NbottlePos1.getprestatus() || bottlePos2.getprestatus() || bottlePos3.getprestatus() || bottlePos4.getprestatus()){//sysj\rotaryController.sysj line: 26, column: 10
              S4516=1;
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
              S4516=2;
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
              S4516=3;
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
              S4516=0;
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

  public void thread4605(int [] tdone, int [] ends){
        S4596=1;
    if(bottlePos4.getprestatus()){//sysj\rotaryController.sysj line: 51, column: 27
      NbottlePos4.setPresent();//sysj\rotaryController.sysj line: 51, column: 40
      currsigs.addElement(NbottlePos4);
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

  public void thread4604(int [] tdone, int [] ends){
        S4588=1;
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

  public void thread4603(int [] tdone, int [] ends){
        S4580=1;
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

  public void thread4602(int [] tdone, int [] ends){
        S4572=1;
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

  public void thread4601(int [] tdone, int [] ends){
        S4564=1;
    S4558=0;
    if(NbottlePos1.getprestatus()){//sysj\rotaryController.sysj line: 43, column: 27
      CbottlePos1.setPresent();//sysj\rotaryController.sysj line: 43, column: 41
      currsigs.addElement(CbottlePos1);
      S4558=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S4558=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread4600(int [] tdone, int [] ends){
        S4556=1;
    S4516=0;
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
      switch(S4598){
        case 0 : 
          S4598=0;
          break RUN;
        
        case 1 : 
          S4598=2;
          S4598=2;
          thread4600(tdone,ends);
          thread4601(tdone,ends);
          thread4602(tdone,ends);
          thread4603(tdone,ends);
          thread4604(tdone,ends);
          thread4605(tdone,ends);
          int biggest4606 = 0;
          if(ends[2]>=biggest4606){
            biggest4606=ends[2];
          }
          if(ends[3]>=biggest4606){
            biggest4606=ends[3];
          }
          if(ends[4]>=biggest4606){
            biggest4606=ends[4];
          }
          if(ends[5]>=biggest4606){
            biggest4606=ends[5];
          }
          if(ends[6]>=biggest4606){
            biggest4606=ends[6];
          }
          if(ends[7]>=biggest4606){
            biggest4606=ends[7];
          }
          if(biggest4606 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread4607(tdone,ends);
          thread4608(tdone,ends);
          thread4609(tdone,ends);
          thread4610(tdone,ends);
          thread4611(tdone,ends);
          thread4612(tdone,ends);
          int biggest4613 = 0;
          if(ends[2]>=biggest4613){
            biggest4613=ends[2];
          }
          if(ends[3]>=biggest4613){
            biggest4613=ends[3];
          }
          if(ends[4]>=biggest4613){
            biggest4613=ends[4];
          }
          if(ends[5]>=biggest4613){
            biggest4613=ends[5];
          }
          if(ends[6]>=biggest4613){
            biggest4613=ends[6];
          }
          if(ends[7]>=biggest4613){
            biggest4613=ends[7];
          }
          if(biggest4613 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest4613 == 0){
            S4598=0;
            active[1]=0;
            ends[1]=0;
            S4598=0;
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
