import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class capperController extends ClockDomain{
  public capperController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal gripperLowered = new Signal("gripperLowered", Signal.INPUT);
  public Signal gripperLifted = new Signal("gripperLifted", Signal.INPUT);
  public Signal gripperInit = new Signal("gripperInit", Signal.INPUT);
  public Signal gripperTurned = new Signal("gripperTurned", Signal.INPUT);
  public Signal bottlePos4 = new Signal("bottlePos4", Signal.INPUT);
  public Signal capperEnable = new Signal("capperEnable", Signal.INPUT);
  public Signal clampBottle = new Signal("clampBottle", Signal.OUTPUT);
  public Signal gripCap = new Signal("gripCap", Signal.OUTPUT);
  public Signal gripDown = new Signal("gripDown", Signal.OUTPUT);
  public Signal twistGrip = new Signal("twistGrip", Signal.OUTPUT);
  public Signal untwistGrip = new Signal("untwistGrip", Signal.OUTPUT);
  public Signal capperDone = new Signal("capperDone", Signal.OUTPUT);
  private int S247 = 1;
  private int S3 = 1;
  private int S16 = 1;
  private int S8 = 1;
  private int S13 = 1;
  private int S27 = 1;
  private int S26 = 1;
  private int S42 = 1;
  private int S29 = 1;
  private int S32 = 1;
  private int S35 = 1;
  
  private int[] ends = new int[9];
  private int[] tdone = new int[9];
  
  public void thread266(int [] tdone, int [] ends){
        switch(S35){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(gripperLifted.getprestatus()){//sysj\capperController.sysj line: 29, column: 36
          S35=0;
          active[8]=0;
          ends[8]=0;
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

  public void thread265(int [] tdone, int [] ends){
        switch(S32){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(gripperInit.getprestatus()){//sysj\capperController.sysj line: 29, column: 11
          S32=0;
          active[7]=0;
          ends[7]=0;
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

  public void thread263(int [] tdone, int [] ends){
        S35=1;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread262(int [] tdone, int [] ends){
        S32=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread261(int [] tdone, int [] ends){
        switch(S42){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S29){
          case 0 : 
            if(gripCap.getprestatus()){//sysj\capperController.sysj line: 27, column: 10
              twistGrip.setPresent();//sysj\capperController.sysj line: 28, column: 4
              currsigs.addElement(twistGrip);
              S29=1;
              thread262(tdone,ends);
              thread263(tdone,ends);
              int biggest264 = 0;
              if(ends[7]>=biggest264){
                biggest264=ends[7];
              }
              if(ends[8]>=biggest264){
                biggest264=ends[8];
              }
              if(biggest264 == 1){
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
            }
            else {
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 1 : 
            thread265(tdone,ends);
            thread266(tdone,ends);
            int biggest267 = 0;
            if(ends[7]>=biggest267){
              biggest267=ends[7];
            }
            if(ends[8]>=biggest267){
              biggest267=ends[8];
            }
            if(biggest267 == 1){
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            //FINXME code
            if(biggest267 == 0){
              capperDone.setPresent();//sysj\capperController.sysj line: 30, column: 4
              currsigs.addElement(capperDone);
              S42=0;
              active[6]=0;
              ends[6]=0;
              tdone[6]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread260(int [] tdone, int [] ends){
        switch(S27){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S26){
          case 0 : 
            if(gripperLowered.getprestatus()){//sysj\capperController.sysj line: 19, column: 10
              S26=1;
              gripCap.setPresent();//sysj\capperController.sysj line: 21, column: 5
              currsigs.addElement(gripCap);
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
          
          case 1 : 
            if(gripperTurned.getprestatus()){//sysj\capperController.sysj line: 20, column: 10
              untwistGrip.setPresent();//sysj\capperController.sysj line: 23, column: 4
              currsigs.addElement(untwistGrip);
              S27=0;
              active[5]=0;
              ends[5]=0;
              tdone[5]=1;
            }
            else {
              gripCap.setPresent();//sysj\capperController.sysj line: 21, column: 5
              currsigs.addElement(gripCap);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread258(int [] tdone, int [] ends){
        switch(S13){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        gripDown.setPresent();//sysj\capperController.sysj line: 14, column: 6
        currsigs.addElement(gripDown);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
        break;
      
    }
  }

  public void thread257(int [] tdone, int [] ends){
        switch(S8){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        clampBottle.setPresent();//sysj\capperController.sysj line: 12, column: 6
        currsigs.addElement(clampBottle);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread256(int [] tdone, int [] ends){
        switch(S16){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        if(untwistGrip.getprestatus()){//sysj\capperController.sysj line: 11, column: 10
          S16=0;
          active[2]=0;
          ends[2]=0;
          tdone[2]=1;
        }
        else {
          thread257(tdone,ends);
          thread258(tdone,ends);
          int biggest259 = 0;
          if(ends[3]>=biggest259){
            biggest259=ends[3];
          }
          if(ends[4]>=biggest259){
            biggest259=ends[4];
          }
          if(biggest259 == 1){
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
          }
          //FINXME code
          if(biggest259 == 0){
            S16=0;
            active[2]=0;
            ends[2]=0;
            tdone[2]=1;
          }
        }
        break;
      
    }
  }

  public void thread254(int [] tdone, int [] ends){
        S42=1;
    S29=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread253(int [] tdone, int [] ends){
        S27=1;
    S26=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread251(int [] tdone, int [] ends){
        S13=1;
    gripDown.setPresent();//sysj\capperController.sysj line: 14, column: 6
    currsigs.addElement(gripDown);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread250(int [] tdone, int [] ends){
        S8=1;
    clampBottle.setPresent();//sysj\capperController.sysj line: 12, column: 6
    currsigs.addElement(clampBottle);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread249(int [] tdone, int [] ends){
        S16=1;
    thread250(tdone,ends);
    thread251(tdone,ends);
    int biggest252 = 0;
    if(ends[3]>=biggest252){
      biggest252=ends[3];
    }
    if(ends[4]>=biggest252){
      biggest252=ends[4];
    }
    if(biggest252 == 1){
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S247){
        case 0 : 
          S247=0;
          break RUN;
        
        case 1 : 
          S247=2;
          S247=2;
          S3=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          switch(S3){
            case 0 : 
              if(capperEnable.getprestatus()){//sysj\capperController.sysj line: 8, column: 9
                S3=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 1 : 
              if(bottlePos4.getprestatus()){//sysj\capperController.sysj line: 9, column: 9
                S3=2;
                thread249(tdone,ends);
                thread253(tdone,ends);
                thread254(tdone,ends);
                int biggest255 = 0;
                if(ends[2]>=biggest255){
                  biggest255=ends[2];
                }
                if(ends[5]>=biggest255){
                  biggest255=ends[5];
                }
                if(ends[6]>=biggest255){
                  biggest255=ends[6];
                }
                if(biggest255 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 2 : 
              thread256(tdone,ends);
              thread260(tdone,ends);
              thread261(tdone,ends);
              int biggest268 = 0;
              if(ends[2]>=biggest268){
                biggest268=ends[2];
              }
              if(ends[5]>=biggest268){
                biggest268=ends[5];
              }
              if(ends[6]>=biggest268){
                biggest268=ends[6];
              }
              if(biggest268 == 1){
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              //FINXME code
              if(biggest268 == 0){
                S3=0;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
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
          gripperLowered.gethook();
          gripperLifted.gethook();
          gripperInit.gethook();
          gripperTurned.gethook();
          bottlePos4.gethook();
          capperEnable.gethook();
          df = true;
        }
        runClockDomain();
      }
      gripperLowered.setpreclear();
      gripperLifted.setpreclear();
      gripperInit.setpreclear();
      gripperTurned.setpreclear();
      bottlePos4.setpreclear();
      capperEnable.setpreclear();
      clampBottle.setpreclear();
      gripCap.setpreclear();
      gripDown.setpreclear();
      twistGrip.setpreclear();
      untwistGrip.setpreclear();
      capperDone.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = gripperLowered.getStatus() ? gripperLowered.setprepresent() : gripperLowered.setpreclear();
      gripperLowered.setpreval(gripperLowered.getValue());
      gripperLowered.setClear();
      dummyint = gripperLifted.getStatus() ? gripperLifted.setprepresent() : gripperLifted.setpreclear();
      gripperLifted.setpreval(gripperLifted.getValue());
      gripperLifted.setClear();
      dummyint = gripperInit.getStatus() ? gripperInit.setprepresent() : gripperInit.setpreclear();
      gripperInit.setpreval(gripperInit.getValue());
      gripperInit.setClear();
      dummyint = gripperTurned.getStatus() ? gripperTurned.setprepresent() : gripperTurned.setpreclear();
      gripperTurned.setpreval(gripperTurned.getValue());
      gripperTurned.setClear();
      dummyint = bottlePos4.getStatus() ? bottlePos4.setprepresent() : bottlePos4.setpreclear();
      bottlePos4.setpreval(bottlePos4.getValue());
      bottlePos4.setClear();
      dummyint = capperEnable.getStatus() ? capperEnable.setprepresent() : capperEnable.setpreclear();
      capperEnable.setpreval(capperEnable.getValue());
      capperEnable.setClear();
      clampBottle.sethook();
      clampBottle.setClear();
      gripCap.sethook();
      gripCap.setClear();
      gripDown.sethook();
      gripDown.setClear();
      twistGrip.sethook();
      twistGrip.setClear();
      untwistGrip.sethook();
      untwistGrip.setClear();
      capperDone.sethook();
      capperDone.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        gripperLowered.gethook();
        gripperLifted.gethook();
        gripperInit.gethook();
        gripperTurned.gethook();
        bottlePos4.gethook();
        capperEnable.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
