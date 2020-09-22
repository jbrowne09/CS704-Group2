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
  private int S5333 = 1;
  private int S5291 = 1;
  private int S5251 = 1;
  private int S5299 = 1;
  private int S5293 = 1;
  private int S5307 = 1;
  private int S5315 = 1;
  private int S5323 = 1;
  private int S5331 = 1;
  
  private int[] ends = new int[8];
  private int[] tdone = new int[8];
  
  public void thread5347(int [] tdone, int [] ends){
        switch(S5331){
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

  public void thread5346(int [] tdone, int [] ends){
        switch(S5323){
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

  public void thread5345(int [] tdone, int [] ends){
        switch(S5315){
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

  public void thread5344(int [] tdone, int [] ends){
        switch(S5307){
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

  public void thread5343(int [] tdone, int [] ends){
        switch(S5299){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S5293){
          case 0 : 
            S5293=0;
            if(NbottlePos1.getprestatus()){//sysj\rotaryController.sysj line: 43, column: 27
              CbottlePos1.setPresent();//sysj\rotaryController.sysj line: 43, column: 41
              currsigs.addElement(CbottlePos1);
              S5293=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S5293=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            S5293=1;
            S5293=0;
            if(NbottlePos1.getprestatus()){//sysj\rotaryController.sysj line: 43, column: 27
              CbottlePos1.setPresent();//sysj\rotaryController.sysj line: 43, column: 41
              currsigs.addElement(CbottlePos1);
              S5293=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S5293=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread5342(int [] tdone, int [] ends){
        switch(S5291){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S5251){
          case 0 : 
            if(NbottlePos1.getprestatus() || bottlePos2.getprestatus() || bottlePos3.getprestatus() || bottlePos4.getprestatus()){//sysj\rotaryController.sysj line: 26, column: 10
              S5251=1;
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
              S5251=2;
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
              S5251=3;
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
              S5251=0;
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

  public void thread5340(int [] tdone, int [] ends){
        S5331=1;
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

  public void thread5339(int [] tdone, int [] ends){
        S5323=1;
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

  public void thread5338(int [] tdone, int [] ends){
        S5315=1;
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

  public void thread5337(int [] tdone, int [] ends){
        S5307=1;
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

  public void thread5336(int [] tdone, int [] ends){
        S5299=1;
    S5293=0;
    if(NbottlePos1.getprestatus()){//sysj\rotaryController.sysj line: 43, column: 27
      CbottlePos1.setPresent();//sysj\rotaryController.sysj line: 43, column: 41
      currsigs.addElement(CbottlePos1);
      S5293=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S5293=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread5335(int [] tdone, int [] ends){
        S5291=1;
    S5251=0;
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
      switch(S5333){
        case 0 : 
          S5333=0;
          break RUN;
        
        case 1 : 
          S5333=2;
          S5333=2;
          thread5335(tdone,ends);
          thread5336(tdone,ends);
          thread5337(tdone,ends);
          thread5338(tdone,ends);
          thread5339(tdone,ends);
          thread5340(tdone,ends);
          int biggest5341 = 0;
          if(ends[2]>=biggest5341){
            biggest5341=ends[2];
          }
          if(ends[3]>=biggest5341){
            biggest5341=ends[3];
          }
          if(ends[4]>=biggest5341){
            biggest5341=ends[4];
          }
          if(ends[5]>=biggest5341){
            biggest5341=ends[5];
          }
          if(ends[6]>=biggest5341){
            biggest5341=ends[6];
          }
          if(ends[7]>=biggest5341){
            biggest5341=ends[7];
          }
          if(biggest5341 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread5342(tdone,ends);
          thread5343(tdone,ends);
          thread5344(tdone,ends);
          thread5345(tdone,ends);
          thread5346(tdone,ends);
          thread5347(tdone,ends);
          int biggest5348 = 0;
          if(ends[2]>=biggest5348){
            biggest5348=ends[2];
          }
          if(ends[3]>=biggest5348){
            biggest5348=ends[3];
          }
          if(ends[4]>=biggest5348){
            biggest5348=ends[4];
          }
          if(ends[5]>=biggest5348){
            biggest5348=ends[5];
          }
          if(ends[6]>=biggest5348){
            biggest5348=ends[6];
          }
          if(ends[7]>=biggest5348){
            biggest5348=ends[7];
          }
          if(biggest5348 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest5348 == 0){
            S5333=0;
            active[1]=0;
            ends[1]=0;
            S5333=0;
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
