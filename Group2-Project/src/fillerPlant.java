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
  private int S1452 = 1;
  private int S1384 = 1;
  private int S1356 = 1;
  private int S1392 = 1;
  private int S1386 = 1;
  private int S1400 = 1;
  private int S1450 = 1;
  private int S1408 = 1;
  private int S1416 = 1;
  private int S1424 = 1;
  private int S1432 = 1;
  private int S1440 = 1;
  private int S1448 = 1;
  
  private int[] ends = new int[12];
  private int[] tdone = new int[12];
  
  public void thread1475(int [] tdone, int [] ends){
        switch(S1448){
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

  public void thread1474(int [] tdone, int [] ends){
        switch(S1440){
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

  public void thread1473(int [] tdone, int [] ends){
        switch(S1432){
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

  public void thread1472(int [] tdone, int [] ends){
        switch(S1424){
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

  public void thread1471(int [] tdone, int [] ends){
        switch(S1416){
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

  public void thread1470(int [] tdone, int [] ends){
        switch(S1408){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(canBottom.getprestatus()){//sysj\fillerPlant.sysj line: 37, column: 25
          canBottomS.setPresent();//sysj\fillerPlant.sysj line: 37, column: 37
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

  public void thread1469(int [] tdone, int [] ends){
        switch(S1450){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        thread1470(tdone,ends);
        thread1471(tdone,ends);
        thread1472(tdone,ends);
        thread1473(tdone,ends);
        thread1474(tdone,ends);
        thread1475(tdone,ends);
        int biggest1476 = 0;
        if(ends[6]>=biggest1476){
          biggest1476=ends[6];
        }
        if(ends[7]>=biggest1476){
          biggest1476=ends[7];
        }
        if(ends[8]>=biggest1476){
          biggest1476=ends[8];
        }
        if(ends[9]>=biggest1476){
          biggest1476=ends[9];
        }
        if(ends[10]>=biggest1476){
          biggest1476=ends[10];
        }
        if(ends[11]>=biggest1476){
          biggest1476=ends[11];
        }
        if(biggest1476 == 1){
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        //FINXME code
        if(biggest1476 == 0){
          S1450=0;
          active[5]=0;
          ends[5]=0;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread1468(int [] tdone, int [] ends){
        switch(S1400){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(injectorOn.getprestatus()){//sysj\fillerPlant.sysj line: 29, column: 13
          injectorIsOnS.setPresent();//sysj\fillerPlant.sysj line: 30, column: 5
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
      
    }
  }

  public void thread1467(int [] tdone, int [] ends){
        switch(S1392){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S1386){
          case 0 : 
            S1386=0;
            if(inletOn.getprestatus()){//sysj\fillerPlant.sysj line: 20, column: 13
              inletIsOnS.setPresent();//sysj\fillerPlant.sysj line: 21, column: 5
              currsigs.addElement(inletIsOnS);
              S1386=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S1386=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            S1386=1;
            S1386=0;
            if(inletOn.getprestatus()){//sysj\fillerPlant.sysj line: 20, column: 13
              inletIsOnS.setPresent();//sysj\fillerPlant.sysj line: 21, column: 5
              currsigs.addElement(inletIsOnS);
              S1386=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S1386=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1466(int [] tdone, int [] ends){
        switch(S1384){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S1356){
          case 0 : 
            if(valveRetract.getprestatus()){//sysj\fillerPlant.sysj line: 9, column: 10
              S1356=1;
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
              S1356=2;
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
          
          case 2 : 
            S1356=2;
            S1356=0;
            canBottom.setPresent();//sysj\fillerPlant.sysj line: 10, column: 5
            currsigs.addElement(canBottom);
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread1463(int [] tdone, int [] ends){
        S1448=1;
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

  public void thread1462(int [] tdone, int [] ends){
        S1440=1;
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

  public void thread1461(int [] tdone, int [] ends){
        S1432=1;
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

  public void thread1460(int [] tdone, int [] ends){
        S1424=1;
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

  public void thread1459(int [] tdone, int [] ends){
        S1416=1;
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

  public void thread1458(int [] tdone, int [] ends){
        S1408=1;
    if(canBottom.getprestatus()){//sysj\fillerPlant.sysj line: 37, column: 25
      canBottomS.setPresent();//sysj\fillerPlant.sysj line: 37, column: 37
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

  public void thread1457(int [] tdone, int [] ends){
        S1450=1;
    thread1458(tdone,ends);
    thread1459(tdone,ends);
    thread1460(tdone,ends);
    thread1461(tdone,ends);
    thread1462(tdone,ends);
    thread1463(tdone,ends);
    int biggest1464 = 0;
    if(ends[6]>=biggest1464){
      biggest1464=ends[6];
    }
    if(ends[7]>=biggest1464){
      biggest1464=ends[7];
    }
    if(ends[8]>=biggest1464){
      biggest1464=ends[8];
    }
    if(ends[9]>=biggest1464){
      biggest1464=ends[9];
    }
    if(ends[10]>=biggest1464){
      biggest1464=ends[10];
    }
    if(ends[11]>=biggest1464){
      biggest1464=ends[11];
    }
    if(biggest1464 == 1){
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread1456(int [] tdone, int [] ends){
        S1400=1;
    if(injectorOn.getprestatus()){//sysj\fillerPlant.sysj line: 29, column: 13
      injectorIsOnS.setPresent();//sysj\fillerPlant.sysj line: 30, column: 5
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
  }

  public void thread1455(int [] tdone, int [] ends){
        S1392=1;
    S1386=0;
    if(inletOn.getprestatus()){//sysj\fillerPlant.sysj line: 20, column: 13
      inletIsOnS.setPresent();//sysj\fillerPlant.sysj line: 21, column: 5
      currsigs.addElement(inletIsOnS);
      S1386=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S1386=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread1454(int [] tdone, int [] ends){
        S1384=1;
    S1356=0;
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
      switch(S1452){
        case 0 : 
          S1452=0;
          break RUN;
        
        case 1 : 
          S1452=2;
          S1452=2;
          thread1454(tdone,ends);
          thread1455(tdone,ends);
          thread1456(tdone,ends);
          thread1457(tdone,ends);
          int biggest1465 = 0;
          if(ends[2]>=biggest1465){
            biggest1465=ends[2];
          }
          if(ends[3]>=biggest1465){
            biggest1465=ends[3];
          }
          if(ends[4]>=biggest1465){
            biggest1465=ends[4];
          }
          if(ends[5]>=biggest1465){
            biggest1465=ends[5];
          }
          if(biggest1465 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread1466(tdone,ends);
          thread1467(tdone,ends);
          thread1468(tdone,ends);
          thread1469(tdone,ends);
          int biggest1477 = 0;
          if(ends[2]>=biggest1477){
            biggest1477=ends[2];
          }
          if(ends[3]>=biggest1477){
            biggest1477=ends[3];
          }
          if(ends[4]>=biggest1477){
            biggest1477=ends[4];
          }
          if(ends[5]>=biggest1477){
            biggest1477=ends[5];
          }
          if(biggest1477 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1477 == 0){
            S1452=0;
            active[1]=0;
            ends[1]=0;
            S1452=0;
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
