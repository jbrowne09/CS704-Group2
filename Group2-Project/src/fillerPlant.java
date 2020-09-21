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
  public Signal canBottom = new Signal("canBottom", Signal.OUTPUT);
  public Signal canTop = new Signal("canTop", Signal.OUTPUT);
  public Signal canBottomS = new Signal("canBottomS", Signal.OUTPUT);
  public Signal canTopS = new Signal("canTopS", Signal.OUTPUT);
  public Signal inletIsOnS = new Signal("inletIsOnS", Signal.OUTPUT);
  public Signal injectorIsOnS = new Signal("injectorIsOnS", Signal.OUTPUT);
  private int S1412 = 1;
  private int S1310 = 1;
  private int S1309 = 1;
  private int S1334 = 1;
  private int S1324 = 1;
  private int S1332 = 1;
  
  private int[] ends = new int[8];
  private int[] tdone = new int[8];
  
  public void thread1435(int [] tdone, int [] ends){
        S1332=1;
    if(canTop.getprestatus()){//sysj\fillerPlant.sysj line: 32, column: 26
      canTopS.setPresent();//sysj\fillerPlant.sysj line: 32, column: 35
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

  public void thread1434(int [] tdone, int [] ends){
        S1324=1;
    if(canBottom.getprestatus()){//sysj\fillerPlant.sysj line: 30, column: 26
      canBottomS.setPresent();//sysj\fillerPlant.sysj line: 30, column: 38
      currsigs.addElement(canBottomS);
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

  public void thread1433(int [] tdone, int [] ends){
        S1334=1;
    thread1434(tdone,ends);
    thread1435(tdone,ends);
    int biggest1436 = 0;
    if(ends[6]>=biggest1436){
      biggest1436=ends[6];
    }
    if(ends[7]>=biggest1436){
      biggest1436=ends[7];
    }
    if(biggest1436 == 1){
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread1432(int [] tdone, int [] ends){
        if(injectorOn.getprestatus()){//sysj\fillerPlant.sysj line: 24, column: 13
      injectorIsOnS.setPresent();//sysj\fillerPlant.sysj line: 25, column: 5
      currsigs.addElement(injectorIsOnS);
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

  public void thread1431(int [] tdone, int [] ends){
        if(inletOn.getprestatus()){//sysj\fillerPlant.sysj line: 18, column: 13
      inletIsOnS.setPresent();//sysj\fillerPlant.sysj line: 19, column: 5
      currsigs.addElement(inletIsOnS);
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
    else {
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
  }

  public void thread1430(int [] tdone, int [] ends){
        S1310=1;
    S1309=0;
    canBottom.setPresent();//sysj\fillerPlant.sysj line: 10, column: 5
    currsigs.addElement(canBottom);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread1427(int [] tdone, int [] ends){
        switch(S1332){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(canTop.getprestatus()){//sysj\fillerPlant.sysj line: 32, column: 26
          canTopS.setPresent();//sysj\fillerPlant.sysj line: 32, column: 35
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

  public void thread1426(int [] tdone, int [] ends){
        switch(S1324){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(canBottom.getprestatus()){//sysj\fillerPlant.sysj line: 30, column: 26
          canBottomS.setPresent();//sysj\fillerPlant.sysj line: 30, column: 38
          currsigs.addElement(canBottomS);
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

  public void thread1425(int [] tdone, int [] ends){
        switch(S1334){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        thread1426(tdone,ends);
        thread1427(tdone,ends);
        int biggest1428 = 0;
        if(ends[6]>=biggest1428){
          biggest1428=ends[6];
        }
        if(ends[7]>=biggest1428){
          biggest1428=ends[7];
        }
        if(biggest1428 == 1){
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        //FINXME code
        if(biggest1428 == 0){
          S1334=0;
          active[5]=0;
          ends[5]=0;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread1424(int [] tdone, int [] ends){
        active[4]=0;
    ends[4]=0;
    tdone[4]=1;
  }

  public void thread1423(int [] tdone, int [] ends){
        active[3]=0;
    ends[3]=0;
    tdone[3]=1;
  }

  public void thread1422(int [] tdone, int [] ends){
        switch(S1310){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S1309){
          case 0 : 
            if(valveRetract.getprestatus()){//sysj\fillerPlant.sysj line: 9, column: 10
              S1309=1;
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
              S1310=0;
              active[2]=0;
              ends[2]=0;
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

  public void thread1419(int [] tdone, int [] ends){
        S1332=1;
    if(canTop.getprestatus()){//sysj\fillerPlant.sysj line: 32, column: 26
      canTopS.setPresent();//sysj\fillerPlant.sysj line: 32, column: 35
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

  public void thread1418(int [] tdone, int [] ends){
        S1324=1;
    if(canBottom.getprestatus()){//sysj\fillerPlant.sysj line: 30, column: 26
      canBottomS.setPresent();//sysj\fillerPlant.sysj line: 30, column: 38
      currsigs.addElement(canBottomS);
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

  public void thread1417(int [] tdone, int [] ends){
        S1334=1;
    thread1418(tdone,ends);
    thread1419(tdone,ends);
    int biggest1420 = 0;
    if(ends[6]>=biggest1420){
      biggest1420=ends[6];
    }
    if(ends[7]>=biggest1420){
      biggest1420=ends[7];
    }
    if(biggest1420 == 1){
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread1416(int [] tdone, int [] ends){
        if(injectorOn.getprestatus()){//sysj\fillerPlant.sysj line: 24, column: 13
      injectorIsOnS.setPresent();//sysj\fillerPlant.sysj line: 25, column: 5
      currsigs.addElement(injectorIsOnS);
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

  public void thread1415(int [] tdone, int [] ends){
        if(inletOn.getprestatus()){//sysj\fillerPlant.sysj line: 18, column: 13
      inletIsOnS.setPresent();//sysj\fillerPlant.sysj line: 19, column: 5
      currsigs.addElement(inletIsOnS);
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
    else {
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
  }

  public void thread1414(int [] tdone, int [] ends){
        S1310=1;
    S1309=0;
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
      switch(S1412){
        case 0 : 
          S1412=0;
          break RUN;
        
        case 1 : 
          S1412=2;
          S1412=2;
          thread1414(tdone,ends);
          thread1415(tdone,ends);
          thread1416(tdone,ends);
          thread1417(tdone,ends);
          int biggest1421 = 0;
          if(ends[2]>=biggest1421){
            biggest1421=ends[2];
          }
          if(ends[3]>=biggest1421){
            biggest1421=ends[3];
          }
          if(ends[4]>=biggest1421){
            biggest1421=ends[4];
          }
          if(ends[5]>=biggest1421){
            biggest1421=ends[5];
          }
          if(biggest1421 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread1422(tdone,ends);
          thread1423(tdone,ends);
          thread1424(tdone,ends);
          thread1425(tdone,ends);
          int biggest1429 = 0;
          if(ends[2]>=biggest1429){
            biggest1429=ends[2];
          }
          if(ends[3]>=biggest1429){
            biggest1429=ends[3];
          }
          if(ends[4]>=biggest1429){
            biggest1429=ends[4];
          }
          if(ends[5]>=biggest1429){
            biggest1429=ends[5];
          }
          if(biggest1429 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1429 == 0){
            thread1430(tdone,ends);
            thread1431(tdone,ends);
            thread1432(tdone,ends);
            thread1433(tdone,ends);
            int biggest1437 = 0;
            if(ends[2]>=biggest1437){
              biggest1437=ends[2];
            }
            if(ends[3]>=biggest1437){
              biggest1437=ends[3];
            }
            if(ends[4]>=biggest1437){
              biggest1437=ends[4];
            }
            if(ends[5]>=biggest1437){
              biggest1437=ends[5];
            }
            if(biggest1437 == 1){
              active[1]=1;
              ends[1]=1;
              break RUN;
            }
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
          inletOn.gethook();
          injectorOn.gethook();
          valveRetract.gethook();
          valveExtend.gethook();
          df = true;
        }
        runClockDomain();
      }
      inletOn.setpreclear();
      injectorOn.setpreclear();
      valveRetract.setpreclear();
      valveExtend.setpreclear();
      canBottom.setpreclear();
      canTop.setpreclear();
      canBottomS.setpreclear();
      canTopS.setpreclear();
      inletIsOnS.setpreclear();
      injectorIsOnS.setpreclear();
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
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        inletOn.gethook();
        injectorOn.gethook();
        valveRetract.gethook();
        valveExtend.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
