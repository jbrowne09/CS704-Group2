import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class fillerPlant extends ClockDomain{
  public fillerPlant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal inletOn = new Signal("inletOn", Signal.INPUT);
  public Signal injectorOn = new Signal("injectorOn", Signal.INPUT);
  public Signal valveRetract = new Signal("valveRetract", Signal.INPUT);
  public Signal valveExtend = new Signal("valveExtend", Signal.INPUT);
  public Signal fill1 = new Signal("fill1", Signal.INPUT);
  public Signal fill2 = new Signal("fill2", Signal.INPUT);
  public Signal fill3 = new Signal("fill3", Signal.INPUT);
  public Signal fill4 = new Signal("fill4", Signal.INPUT);
  public Signal canBottom = new Signal("canBottom", Signal.OUTPUT);
  public Signal canTop = new Signal("canTop", Signal.OUTPUT);
  public Signal canBottomS = new Signal("canBottomS", Signal.OUTPUT);
  public Signal canTopS = new Signal("canTopS", Signal.OUTPUT);
  public Signal inletIsOnS = new Signal("inletIsOnS", Signal.OUTPUT);
  public Signal injectorIsOnS = new Signal("injectorIsOnS", Signal.OUTPUT);
  public Signal fill1S = new Signal("fill1S", Signal.OUTPUT);
  public Signal fill2S = new Signal("fill2S", Signal.OUTPUT);
  public Signal fill3S = new Signal("fill3S", Signal.OUTPUT);
  public Signal fill4S = new Signal("fill4S", Signal.OUTPUT);
  private int S3105 = 1;
  private int S2989 = 1;
  private int S2961 = 1;
  private int S3103 = 1;
  private int S3021 = 1;
  private int S2999 = 1;
  private int S3053 = 1;
  private int S3031 = 1;
  private int S3061 = 1;
  private int S3055 = 1;
  private int S3069 = 1;
  private int S3077 = 1;
  private int S3085 = 1;
  private int S3093 = 1;
  private int S3101 = 1;
  
  private int[] ends = new int[12];
  private int[] tdone = new int[12];
  
  public void thread3128(int [] tdone, int [] ends){
        switch(S3101){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(fill4.getprestatus()){//sysj\fillerPlant.sysj line: 47, column: 25
          fill4S.setPresent();//sysj\fillerPlant.sysj line: 47, column: 33
          currsigs.addElement(fill4S);
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

  public void thread3127(int [] tdone, int [] ends){
        switch(S3093){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(fill3.getprestatus()){//sysj\fillerPlant.sysj line: 45, column: 25
          fill3S.setPresent();//sysj\fillerPlant.sysj line: 45, column: 33
          currsigs.addElement(fill3S);
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

  public void thread3126(int [] tdone, int [] ends){
        switch(S3085){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(fill2.getprestatus()){//sysj\fillerPlant.sysj line: 43, column: 25
          fill2S.setPresent();//sysj\fillerPlant.sysj line: 43, column: 33
          currsigs.addElement(fill2S);
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

  public void thread3125(int [] tdone, int [] ends){
        switch(S3077){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(fill1.getprestatus()){//sysj\fillerPlant.sysj line: 41, column: 25
          fill1S.setPresent();//sysj\fillerPlant.sysj line: 41, column: 33
          currsigs.addElement(fill1S);
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

  public void thread3124(int [] tdone, int [] ends){
        switch(S3069){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(canTop.getprestatus()){//sysj\fillerPlant.sysj line: 39, column: 25
          canTopS.setPresent();//sysj\fillerPlant.sysj line: 39, column: 34
          currsigs.addElement(canTopS);
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

  public void thread3123(int [] tdone, int [] ends){
        switch(S3061){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S3055){
          case 0 : 
            S3055=0;
            if(canBottom.getprestatus()){//sysj\fillerPlant.sysj line: 37, column: 25
              canBottomS.setPresent();//sysj\fillerPlant.sysj line: 37, column: 37
              currsigs.addElement(canBottomS);
              S3055=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              S3055=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 1 : 
            S3055=1;
            S3055=0;
            if(canBottom.getprestatus()){//sysj\fillerPlant.sysj line: 37, column: 25
              canBottomS.setPresent();//sysj\fillerPlant.sysj line: 37, column: 37
              currsigs.addElement(canBottomS);
              S3055=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              S3055=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread3122(int [] tdone, int [] ends){
        switch(S3053){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S3031){
          case 0 : 
            if(inletOn.getprestatus()){//sysj\fillerPlant.sysj line: 30, column: 11
              S3031=1;
              inletIsOnS.setPresent();//sysj\fillerPlant.sysj line: 32, column: 6
              currsigs.addElement(inletIsOnS);
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
            if(!inletOn.getprestatus()){//sysj\fillerPlant.sysj line: 31, column: 11
              S3031=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              inletIsOnS.setPresent();//sysj\fillerPlant.sysj line: 32, column: 6
              currsigs.addElement(inletIsOnS);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread3121(int [] tdone, int [] ends){
        switch(S3021){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S2999){
          case 0 : 
            if(injectorOn.getprestatus()){//sysj\fillerPlant.sysj line: 21, column: 11
              S2999=1;
              injectorIsOnS.setPresent();//sysj\fillerPlant.sysj line: 23, column: 6
              currsigs.addElement(injectorIsOnS);
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
          
          case 1 : 
            if(!injectorOn.getprestatus()){//sysj\fillerPlant.sysj line: 22, column: 11
              S2999=0;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              injectorIsOnS.setPresent();//sysj\fillerPlant.sysj line: 23, column: 6
              currsigs.addElement(injectorIsOnS);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread3120(int [] tdone, int [] ends){
        switch(S3103){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread3121(tdone,ends);
        thread3122(tdone,ends);
        thread3123(tdone,ends);
        thread3124(tdone,ends);
        thread3125(tdone,ends);
        thread3126(tdone,ends);
        thread3127(tdone,ends);
        thread3128(tdone,ends);
        int biggest3129 = 0;
        if(ends[4]>=biggest3129){
          biggest3129=ends[4];
        }
        if(ends[5]>=biggest3129){
          biggest3129=ends[5];
        }
        if(ends[6]>=biggest3129){
          biggest3129=ends[6];
        }
        if(ends[7]>=biggest3129){
          biggest3129=ends[7];
        }
        if(ends[8]>=biggest3129){
          biggest3129=ends[8];
        }
        if(ends[9]>=biggest3129){
          biggest3129=ends[9];
        }
        if(ends[10]>=biggest3129){
          biggest3129=ends[10];
        }
        if(ends[11]>=biggest3129){
          biggest3129=ends[11];
        }
        if(biggest3129 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest3129 == 0){
          S3103=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread3119(int [] tdone, int [] ends){
        switch(S2989){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S2961){
          case 0 : 
            if(valveRetract.getprestatus()){//sysj\fillerPlant.sysj line: 9, column: 10
              S2961=1;
              canTop.setPresent();//sysj\fillerPlant.sysj line: 13, column: 5
              currsigs.addElement(canTop);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              canBottom.setPresent();//sysj\fillerPlant.sysj line: 10, column: 5
              currsigs.addElement(canBottom);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(valveExtend.getprestatus()){//sysj\fillerPlant.sysj line: 12, column: 10
              S2961=0;
              canBottom.setPresent();//sysj\fillerPlant.sysj line: 10, column: 5
              currsigs.addElement(canBottom);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              canTop.setPresent();//sysj\fillerPlant.sysj line: 13, column: 5
              currsigs.addElement(canTop);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread3116(int [] tdone, int [] ends){
        S3101=1;
    if(fill4.getprestatus()){//sysj\fillerPlant.sysj line: 47, column: 25
      fill4S.setPresent();//sysj\fillerPlant.sysj line: 47, column: 33
      currsigs.addElement(fill4S);
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

  public void thread3115(int [] tdone, int [] ends){
        S3093=1;
    if(fill3.getprestatus()){//sysj\fillerPlant.sysj line: 45, column: 25
      fill3S.setPresent();//sysj\fillerPlant.sysj line: 45, column: 33
      currsigs.addElement(fill3S);
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

  public void thread3114(int [] tdone, int [] ends){
        S3085=1;
    if(fill2.getprestatus()){//sysj\fillerPlant.sysj line: 43, column: 25
      fill2S.setPresent();//sysj\fillerPlant.sysj line: 43, column: 33
      currsigs.addElement(fill2S);
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

  public void thread3113(int [] tdone, int [] ends){
        S3077=1;
    if(fill1.getprestatus()){//sysj\fillerPlant.sysj line: 41, column: 25
      fill1S.setPresent();//sysj\fillerPlant.sysj line: 41, column: 33
      currsigs.addElement(fill1S);
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

  public void thread3112(int [] tdone, int [] ends){
        S3069=1;
    if(canTop.getprestatus()){//sysj\fillerPlant.sysj line: 39, column: 25
      canTopS.setPresent();//sysj\fillerPlant.sysj line: 39, column: 34
      currsigs.addElement(canTopS);
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

  public void thread3111(int [] tdone, int [] ends){
        S3061=1;
    S3055=0;
    if(canBottom.getprestatus()){//sysj\fillerPlant.sysj line: 37, column: 25
      canBottomS.setPresent();//sysj\fillerPlant.sysj line: 37, column: 37
      currsigs.addElement(canBottomS);
      S3055=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S3055=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread3110(int [] tdone, int [] ends){
        S3053=1;
    S3031=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread3109(int [] tdone, int [] ends){
        S3021=1;
    S2999=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread3108(int [] tdone, int [] ends){
        S3103=1;
    thread3109(tdone,ends);
    thread3110(tdone,ends);
    thread3111(tdone,ends);
    thread3112(tdone,ends);
    thread3113(tdone,ends);
    thread3114(tdone,ends);
    thread3115(tdone,ends);
    thread3116(tdone,ends);
    int biggest3117 = 0;
    if(ends[4]>=biggest3117){
      biggest3117=ends[4];
    }
    if(ends[5]>=biggest3117){
      biggest3117=ends[5];
    }
    if(ends[6]>=biggest3117){
      biggest3117=ends[6];
    }
    if(ends[7]>=biggest3117){
      biggest3117=ends[7];
    }
    if(ends[8]>=biggest3117){
      biggest3117=ends[8];
    }
    if(ends[9]>=biggest3117){
      biggest3117=ends[9];
    }
    if(ends[10]>=biggest3117){
      biggest3117=ends[10];
    }
    if(ends[11]>=biggest3117){
      biggest3117=ends[11];
    }
    if(biggest3117 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread3107(int [] tdone, int [] ends){
        S2989=1;
    S2961=0;
    canBottom.setPresent();//sysj\fillerPlant.sysj line: 10, column: 5
    currsigs.addElement(canBottom);
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
      switch(S3105){
        case 0 : 
          S3105=0;
          break RUN;
        
        case 1 : 
          S3105=2;
          S3105=2;
          thread3107(tdone,ends);
          thread3108(tdone,ends);
          int biggest3118 = 0;
          if(ends[2]>=biggest3118){
            biggest3118=ends[2];
          }
          if(ends[3]>=biggest3118){
            biggest3118=ends[3];
          }
          if(biggest3118 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread3119(tdone,ends);
          thread3120(tdone,ends);
          int biggest3130 = 0;
          if(ends[2]>=biggest3130){
            biggest3130=ends[2];
          }
          if(ends[3]>=biggest3130){
            biggest3130=ends[3];
          }
          if(biggest3130 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest3130 == 0){
            S3105=0;
            active[1]=0;
            ends[1]=0;
            S3105=0;
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
          inletOn.gethook();
          injectorOn.gethook();
          valveRetract.gethook();
          valveExtend.gethook();
          fill1.gethook();
          fill2.gethook();
          fill3.gethook();
          fill4.gethook();
          df = true;
        }
        runClockDomain();
      }
      inletOn.setpreclear();
      injectorOn.setpreclear();
      valveRetract.setpreclear();
      valveExtend.setpreclear();
      fill1.setpreclear();
      fill2.setpreclear();
      fill3.setpreclear();
      fill4.setpreclear();
      canBottom.setpreclear();
      canTop.setpreclear();
      canBottomS.setpreclear();
      canTopS.setpreclear();
      inletIsOnS.setpreclear();
      injectorIsOnS.setpreclear();
      fill1S.setpreclear();
      fill2S.setpreclear();
      fill3S.setpreclear();
      fill4S.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = inletOn.getStatus() ? inletOn.setprepresent() : inletOn.setpreclear();
      inletOn.setpreval(inletOn.getValue());
      inletOn.setClear();
      dummyint = injectorOn.getStatus() ? injectorOn.setprepresent() : injectorOn.setpreclear();
      injectorOn.setpreval(injectorOn.getValue());
      injectorOn.setClear();
      dummyint = valveRetract.getStatus() ? valveRetract.setprepresent() : valveRetract.setpreclear();
      valveRetract.setpreval(valveRetract.getValue());
      valveRetract.setClear();
      dummyint = valveExtend.getStatus() ? valveExtend.setprepresent() : valveExtend.setpreclear();
      valveExtend.setpreval(valveExtend.getValue());
      valveExtend.setClear();
      dummyint = fill1.getStatus() ? fill1.setprepresent() : fill1.setpreclear();
      fill1.setpreval(fill1.getValue());
      fill1.setClear();
      dummyint = fill2.getStatus() ? fill2.setprepresent() : fill2.setpreclear();
      fill2.setpreval(fill2.getValue());
      fill2.setClear();
      dummyint = fill3.getStatus() ? fill3.setprepresent() : fill3.setpreclear();
      fill3.setpreval(fill3.getValue());
      fill3.setClear();
      dummyint = fill4.getStatus() ? fill4.setprepresent() : fill4.setpreclear();
      fill4.setpreval(fill4.getValue());
      fill4.setClear();
      canBottom.sethook();
      canBottom.setClear();
      canTop.sethook();
      canTop.setClear();
      canBottomS.sethook();
      canBottomS.setClear();
      canTopS.sethook();
      canTopS.setClear();
      inletIsOnS.sethook();
      inletIsOnS.setClear();
      injectorIsOnS.sethook();
      injectorIsOnS.setClear();
      fill1S.sethook();
      fill1S.setClear();
      fill2S.sethook();
      fill2S.setClear();
      fill3S.sethook();
      fill3S.setClear();
      fill4S.sethook();
      fill4S.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        inletOn.gethook();
        injectorOn.gethook();
        valveRetract.gethook();
        valveExtend.gethook();
        fill1.gethook();
        fill2.gethook();
        fill3.gethook();
        fill4.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
