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
  private int S3297 = 1;
  private int S3255 = 1;
  private int S3215 = 1;
  private int S3263 = 1;
  private int S3257 = 1;
  private int S3271 = 1;
  private int S3279 = 1;
  private int S3287 = 1;
  private int S3295 = 1;
  
  private int[] ends = new int[8];
  private int[] tdone = new int[8];
  
  public void thread3311(int [] tdone, int [] ends){
        switch(S3295){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(bottlePos4.getprestatus()){//sysj\rotaryController.sysj line: 50, column: 27
          NbottlePos4.setPresent();//sysj\rotaryController.sysj line: 50, column: 40
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

  public void thread3310(int [] tdone, int [] ends){
        switch(S3287){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(bottlePos2.getprestatus()){//sysj\rotaryController.sysj line: 48, column: 27
          NbottlePos2.setPresent();//sysj\rotaryController.sysj line: 48, column: 40
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

  public void thread3309(int [] tdone, int [] ends){
        switch(S3279){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(bottlePos5.getprestatus()){//sysj\rotaryController.sysj line: 46, column: 27
          NbottlePos5.setPresent();//sysj\rotaryController.sysj line: 46, column: 40
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

  public void thread3308(int [] tdone, int [] ends){
        switch(S3271){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(Nmotor.getprestatus()){//sysj\rotaryController.sysj line: 44, column: 27
          Cmotor.setPresent();//sysj\rotaryController.sysj line: 44, column: 36
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

  public void thread3307(int [] tdone, int [] ends){
        switch(S3263){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S3257){
          case 0 : 
            S3257=0;
            if(NbottlePos1.getprestatus()){//sysj\rotaryController.sysj line: 42, column: 27
              CbottlePos1.setPresent();//sysj\rotaryController.sysj line: 42, column: 41
              currsigs.addElement(CbottlePos1);
              S3257=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S3257=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            S3257=1;
            S3257=0;
            if(NbottlePos1.getprestatus()){//sysj\rotaryController.sysj line: 42, column: 27
              CbottlePos1.setPresent();//sysj\rotaryController.sysj line: 42, column: 41
              currsigs.addElement(CbottlePos1);
              S3257=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S3257=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread3306(int [] tdone, int [] ends){
        switch(S3255){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S3215){
          case 0 : 
            if(NbottlePos1.getprestatus() || bottlePos2.getprestatus() || bottlePos3.getprestatus() || bottlePos4.getprestatus()){//sysj\rotaryController.sysj line: 26, column: 10
              S3215=1;
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
            if(rotaryEnable.getprestatus()){//sysj\rotaryController.sysj line: 30, column: 10
              S3215=2;
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
            if(!aligned.getprestatus()){//sysj\rotaryController.sysj line: 31, column: 10
              S3215=3;
              rotate.setPresent();//sysj\rotaryController.sysj line: 35, column: 5
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
            if(aligned.getprestatus()){//sysj\rotaryController.sysj line: 34, column: 10
              S3215=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              rotate.setPresent();//sysj\rotaryController.sysj line: 35, column: 5
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

  public void thread3304(int [] tdone, int [] ends){
        S3295=1;
    if(bottlePos4.getprestatus()){//sysj\rotaryController.sysj line: 50, column: 27
      NbottlePos4.setPresent();//sysj\rotaryController.sysj line: 50, column: 40
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

  public void thread3303(int [] tdone, int [] ends){
        S3287=1;
    if(bottlePos2.getprestatus()){//sysj\rotaryController.sysj line: 48, column: 27
      NbottlePos2.setPresent();//sysj\rotaryController.sysj line: 48, column: 40
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

  public void thread3302(int [] tdone, int [] ends){
        S3279=1;
    if(bottlePos5.getprestatus()){//sysj\rotaryController.sysj line: 46, column: 27
      NbottlePos5.setPresent();//sysj\rotaryController.sysj line: 46, column: 40
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

  public void thread3301(int [] tdone, int [] ends){
        S3271=1;
    if(Nmotor.getprestatus()){//sysj\rotaryController.sysj line: 44, column: 27
      Cmotor.setPresent();//sysj\rotaryController.sysj line: 44, column: 36
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

  public void thread3300(int [] tdone, int [] ends){
        S3263=1;
    S3257=0;
    if(NbottlePos1.getprestatus()){//sysj\rotaryController.sysj line: 42, column: 27
      CbottlePos1.setPresent();//sysj\rotaryController.sysj line: 42, column: 41
      currsigs.addElement(CbottlePos1);
      S3257=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S3257=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread3299(int [] tdone, int [] ends){
        S3255=1;
    S3215=0;
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
      switch(S3297){
        case 0 : 
          S3297=0;
          break RUN;
        
        case 1 : 
          S3297=2;
          S3297=2;
          thread3299(tdone,ends);
          thread3300(tdone,ends);
          thread3301(tdone,ends);
          thread3302(tdone,ends);
          thread3303(tdone,ends);
          thread3304(tdone,ends);
          int biggest3305 = 0;
          if(ends[2]>=biggest3305){
            biggest3305=ends[2];
          }
          if(ends[3]>=biggest3305){
            biggest3305=ends[3];
          }
          if(ends[4]>=biggest3305){
            biggest3305=ends[4];
          }
          if(ends[5]>=biggest3305){
            biggest3305=ends[5];
          }
          if(ends[6]>=biggest3305){
            biggest3305=ends[6];
          }
          if(ends[7]>=biggest3305){
            biggest3305=ends[7];
          }
          if(biggest3305 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread3306(tdone,ends);
          thread3307(tdone,ends);
          thread3308(tdone,ends);
          thread3309(tdone,ends);
          thread3310(tdone,ends);
          thread3311(tdone,ends);
          int biggest3312 = 0;
          if(ends[2]>=biggest3312){
            biggest3312=ends[2];
          }
          if(ends[3]>=biggest3312){
            biggest3312=ends[3];
          }
          if(ends[4]>=biggest3312){
            biggest3312=ends[4];
          }
          if(ends[5]>=biggest3312){
            biggest3312=ends[5];
          }
          if(ends[6]>=biggest3312){
            biggest3312=ends[6];
          }
          if(ends[7]>=biggest3312){
            biggest3312=ends[7];
          }
          if(biggest3312 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest3312 == 0){
            S3297=0;
            active[1]=0;
            ends[1]=0;
            S3297=0;
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
