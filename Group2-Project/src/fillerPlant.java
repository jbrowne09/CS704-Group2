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
  private int S3480 = 1;
  private int S3364 = 1;
  private int S3336 = 1;
  private int S3478 = 1;
  private int S3396 = 1;
  private int S3374 = 1;
  private int S3428 = 1;
  private int S3406 = 1;
  private int S3436 = 1;
  private int S3430 = 1;
  private int S3444 = 1;
  private int S3452 = 1;
  private int S3460 = 1;
  private int S3468 = 1;
  private int S3476 = 1;
  
  private int[] ends = new int[12];
  private int[] tdone = new int[12];
  
  public void thread3503(int [] tdone, int [] ends){
        switch(S3476){
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

  public void thread3502(int [] tdone, int [] ends){
        switch(S3468){
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

  public void thread3501(int [] tdone, int [] ends){
        switch(S3460){
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

  public void thread3500(int [] tdone, int [] ends){
        switch(S3452){
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

  public void thread3499(int [] tdone, int [] ends){
        switch(S3444){
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

  public void thread3498(int [] tdone, int [] ends){
        switch(S3436){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S3430){
          case 0 : 
            S3430=0;
            if(canBottom.getprestatus()){//sysj\fillerPlant.sysj line: 37, column: 25
              canBottomS.setPresent();//sysj\fillerPlant.sysj line: 37, column: 37
              currsigs.addElement(canBottomS);
              S3430=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              S3430=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 1 : 
            S3430=1;
            S3430=0;
            if(canBottom.getprestatus()){//sysj\fillerPlant.sysj line: 37, column: 25
              canBottomS.setPresent();//sysj\fillerPlant.sysj line: 37, column: 37
              currsigs.addElement(canBottomS);
              S3430=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              S3430=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread3497(int [] tdone, int [] ends){
        switch(S3428){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S3406){
          case 0 : 
            if(inletOn.getprestatus()){//sysj\fillerPlant.sysj line: 30, column: 11
              S3406=1;
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
              S3406=0;
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

  public void thread3496(int [] tdone, int [] ends){
        switch(S3396){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S3374){
          case 0 : 
            if(injectorOn.getprestatus()){//sysj\fillerPlant.sysj line: 21, column: 11
              S3374=1;
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
              S3374=0;
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

  public void thread3495(int [] tdone, int [] ends){
        switch(S3478){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread3496(tdone,ends);
        thread3497(tdone,ends);
        thread3498(tdone,ends);
        thread3499(tdone,ends);
        thread3500(tdone,ends);
        thread3501(tdone,ends);
        thread3502(tdone,ends);
        thread3503(tdone,ends);
        int biggest3504 = 0;
        if(ends[4]>=biggest3504){
          biggest3504=ends[4];
        }
        if(ends[5]>=biggest3504){
          biggest3504=ends[5];
        }
        if(ends[6]>=biggest3504){
          biggest3504=ends[6];
        }
        if(ends[7]>=biggest3504){
          biggest3504=ends[7];
        }
        if(ends[8]>=biggest3504){
          biggest3504=ends[8];
        }
        if(ends[9]>=biggest3504){
          biggest3504=ends[9];
        }
        if(ends[10]>=biggest3504){
          biggest3504=ends[10];
        }
        if(ends[11]>=biggest3504){
          biggest3504=ends[11];
        }
        if(biggest3504 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest3504 == 0){
          S3478=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread3494(int [] tdone, int [] ends){
        switch(S3364){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S3336){
          case 0 : 
            if(valveRetract.getprestatus()){//sysj\fillerPlant.sysj line: 9, column: 10
              S3336=1;
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
              S3336=0;
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

  public void thread3491(int [] tdone, int [] ends){
        S3476=1;
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

  public void thread3490(int [] tdone, int [] ends){
        S3468=1;
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

  public void thread3489(int [] tdone, int [] ends){
        S3460=1;
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

  public void thread3488(int [] tdone, int [] ends){
        S3452=1;
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

  public void thread3487(int [] tdone, int [] ends){
        S3444=1;
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

  public void thread3486(int [] tdone, int [] ends){
        S3436=1;
    S3430=0;
    if(canBottom.getprestatus()){//sysj\fillerPlant.sysj line: 37, column: 25
      canBottomS.setPresent();//sysj\fillerPlant.sysj line: 37, column: 37
      currsigs.addElement(canBottomS);
      S3430=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S3430=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread3485(int [] tdone, int [] ends){
        S3428=1;
    S3406=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread3484(int [] tdone, int [] ends){
        S3396=1;
    S3374=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread3483(int [] tdone, int [] ends){
        S3478=1;
    thread3484(tdone,ends);
    thread3485(tdone,ends);
    thread3486(tdone,ends);
    thread3487(tdone,ends);
    thread3488(tdone,ends);
    thread3489(tdone,ends);
    thread3490(tdone,ends);
    thread3491(tdone,ends);
    int biggest3492 = 0;
    if(ends[4]>=biggest3492){
      biggest3492=ends[4];
    }
    if(ends[5]>=biggest3492){
      biggest3492=ends[5];
    }
    if(ends[6]>=biggest3492){
      biggest3492=ends[6];
    }
    if(ends[7]>=biggest3492){
      biggest3492=ends[7];
    }
    if(ends[8]>=biggest3492){
      biggest3492=ends[8];
    }
    if(ends[9]>=biggest3492){
      biggest3492=ends[9];
    }
    if(ends[10]>=biggest3492){
      biggest3492=ends[10];
    }
    if(ends[11]>=biggest3492){
      biggest3492=ends[11];
    }
    if(biggest3492 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread3482(int [] tdone, int [] ends){
        S3364=1;
    S3336=0;
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
      switch(S3480){
        case 0 : 
          S3480=0;
          break RUN;
        
        case 1 : 
          S3480=2;
          S3480=2;
          thread3482(tdone,ends);
          thread3483(tdone,ends);
          int biggest3493 = 0;
          if(ends[2]>=biggest3493){
            biggest3493=ends[2];
          }
          if(ends[3]>=biggest3493){
            biggest3493=ends[3];
          }
          if(biggest3493 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread3494(tdone,ends);
          thread3495(tdone,ends);
          int biggest3505 = 0;
          if(ends[2]>=biggest3505){
            biggest3505=ends[2];
          }
          if(ends[3]>=biggest3505){
            biggest3505=ends[3];
          }
          if(biggest3505 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest3505 == 0){
            S3480=0;
            active[1]=0;
            ends[1]=0;
            S3480=0;
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
