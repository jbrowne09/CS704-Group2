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
  private int S1588 = 1;
  private int S1390 = 1;
  private int S1389 = 1;
  private int S1446 = 1;
  private int S1404 = 1;
  private int S1412 = 1;
  private int S1420 = 1;
  private int S1428 = 1;
  private int S1436 = 1;
  private int S1444 = 1;
  
  private int[] ends = new int[12];
  private int[] tdone = new int[12];
  
  public void thread1623(int [] tdone, int [] ends){
        S1444=1;
    if(fill4.getprestatus()){//sysj\fillerPlant.sysj line: 40, column: 26
      fill4S.setPresent();//sysj\fillerPlant.sysj line: 40, column: 34
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

  public void thread1622(int [] tdone, int [] ends){
        S1436=1;
    if(fill3.getprestatus()){//sysj\fillerPlant.sysj line: 38, column: 26
      fill3S.setPresent();//sysj\fillerPlant.sysj line: 38, column: 34
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

  public void thread1621(int [] tdone, int [] ends){
        S1428=1;
    if(fill2.getprestatus()){//sysj\fillerPlant.sysj line: 36, column: 26
      fill2S.setPresent();//sysj\fillerPlant.sysj line: 36, column: 34
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

  public void thread1620(int [] tdone, int [] ends){
        S1420=1;
    if(fill1.getprestatus()){//sysj\fillerPlant.sysj line: 34, column: 26
      fill1S.setPresent();//sysj\fillerPlant.sysj line: 34, column: 34
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

  public void thread1619(int [] tdone, int [] ends){
        S1412=1;
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

  public void thread1618(int [] tdone, int [] ends){
        S1404=1;
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

  public void thread1617(int [] tdone, int [] ends){
        S1446=1;
    thread1618(tdone,ends);
    thread1619(tdone,ends);
    thread1620(tdone,ends);
    thread1621(tdone,ends);
    thread1622(tdone,ends);
    thread1623(tdone,ends);
    int biggest1624 = 0;
    if(ends[6]>=biggest1624){
      biggest1624=ends[6];
    }
    if(ends[7]>=biggest1624){
      biggest1624=ends[7];
    }
    if(ends[8]>=biggest1624){
      biggest1624=ends[8];
    }
    if(ends[9]>=biggest1624){
      biggest1624=ends[9];
    }
    if(ends[10]>=biggest1624){
      biggest1624=ends[10];
    }
    if(ends[11]>=biggest1624){
      biggest1624=ends[11];
    }
    if(biggest1624 == 1){
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread1616(int [] tdone, int [] ends){
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

  public void thread1615(int [] tdone, int [] ends){
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

  public void thread1614(int [] tdone, int [] ends){
        S1390=1;
    S1389=0;
    canBottom.setPresent();//sysj\fillerPlant.sysj line: 10, column: 5
    currsigs.addElement(canBottom);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread1611(int [] tdone, int [] ends){
        switch(S1444){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(fill4.getprestatus()){//sysj\fillerPlant.sysj line: 40, column: 26
          fill4S.setPresent();//sysj\fillerPlant.sysj line: 40, column: 34
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

  public void thread1610(int [] tdone, int [] ends){
        switch(S1436){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(fill3.getprestatus()){//sysj\fillerPlant.sysj line: 38, column: 26
          fill3S.setPresent();//sysj\fillerPlant.sysj line: 38, column: 34
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

  public void thread1609(int [] tdone, int [] ends){
        switch(S1428){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(fill2.getprestatus()){//sysj\fillerPlant.sysj line: 36, column: 26
          fill2S.setPresent();//sysj\fillerPlant.sysj line: 36, column: 34
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

  public void thread1608(int [] tdone, int [] ends){
        switch(S1420){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(fill1.getprestatus()){//sysj\fillerPlant.sysj line: 34, column: 26
          fill1S.setPresent();//sysj\fillerPlant.sysj line: 34, column: 34
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

  public void thread1607(int [] tdone, int [] ends){
        switch(S1412){
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

  public void thread1606(int [] tdone, int [] ends){
        switch(S1404){
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

  public void thread1605(int [] tdone, int [] ends){
        switch(S1446){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        thread1606(tdone,ends);
        thread1607(tdone,ends);
        thread1608(tdone,ends);
        thread1609(tdone,ends);
        thread1610(tdone,ends);
        thread1611(tdone,ends);
        int biggest1612 = 0;
        if(ends[6]>=biggest1612){
          biggest1612=ends[6];
        }
        if(ends[7]>=biggest1612){
          biggest1612=ends[7];
        }
        if(ends[8]>=biggest1612){
          biggest1612=ends[8];
        }
        if(ends[9]>=biggest1612){
          biggest1612=ends[9];
        }
        if(ends[10]>=biggest1612){
          biggest1612=ends[10];
        }
        if(ends[11]>=biggest1612){
          biggest1612=ends[11];
        }
        if(biggest1612 == 1){
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        //FINXME code
        if(biggest1612 == 0){
          S1446=0;
          active[5]=0;
          ends[5]=0;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread1604(int [] tdone, int [] ends){
        active[4]=0;
    ends[4]=0;
    tdone[4]=1;
  }

  public void thread1603(int [] tdone, int [] ends){
        active[3]=0;
    ends[3]=0;
    tdone[3]=1;
  }

  public void thread1602(int [] tdone, int [] ends){
        switch(S1390){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S1389){
          case 0 : 
            if(valveRetract.getprestatus()){//sysj\fillerPlant.sysj line: 9, column: 10
              S1389=1;
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
              S1390=0;
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

  public void thread1599(int [] tdone, int [] ends){
        S1444=1;
    if(fill4.getprestatus()){//sysj\fillerPlant.sysj line: 40, column: 26
      fill4S.setPresent();//sysj\fillerPlant.sysj line: 40, column: 34
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

  public void thread1598(int [] tdone, int [] ends){
        S1436=1;
    if(fill3.getprestatus()){//sysj\fillerPlant.sysj line: 38, column: 26
      fill3S.setPresent();//sysj\fillerPlant.sysj line: 38, column: 34
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

  public void thread1597(int [] tdone, int [] ends){
        S1428=1;
    if(fill2.getprestatus()){//sysj\fillerPlant.sysj line: 36, column: 26
      fill2S.setPresent();//sysj\fillerPlant.sysj line: 36, column: 34
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

  public void thread1596(int [] tdone, int [] ends){
        S1420=1;
    if(fill1.getprestatus()){//sysj\fillerPlant.sysj line: 34, column: 26
      fill1S.setPresent();//sysj\fillerPlant.sysj line: 34, column: 34
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

  public void thread1595(int [] tdone, int [] ends){
        S1412=1;
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

  public void thread1594(int [] tdone, int [] ends){
        S1404=1;
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

  public void thread1593(int [] tdone, int [] ends){
        S1446=1;
    thread1594(tdone,ends);
    thread1595(tdone,ends);
    thread1596(tdone,ends);
    thread1597(tdone,ends);
    thread1598(tdone,ends);
    thread1599(tdone,ends);
    int biggest1600 = 0;
    if(ends[6]>=biggest1600){
      biggest1600=ends[6];
    }
    if(ends[7]>=biggest1600){
      biggest1600=ends[7];
    }
    if(ends[8]>=biggest1600){
      biggest1600=ends[8];
    }
    if(ends[9]>=biggest1600){
      biggest1600=ends[9];
    }
    if(ends[10]>=biggest1600){
      biggest1600=ends[10];
    }
    if(ends[11]>=biggest1600){
      biggest1600=ends[11];
    }
    if(biggest1600 == 1){
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread1592(int [] tdone, int [] ends){
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

  public void thread1591(int [] tdone, int [] ends){
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

  public void thread1590(int [] tdone, int [] ends){
        S1390=1;
    S1389=0;
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
      switch(S1588){
        case 0 : 
          S1588=0;
          break RUN;
        
        case 1 : 
          S1588=2;
          S1588=2;
          thread1590(tdone,ends);
          thread1591(tdone,ends);
          thread1592(tdone,ends);
          thread1593(tdone,ends);
          int biggest1601 = 0;
          if(ends[2]>=biggest1601){
            biggest1601=ends[2];
          }
          if(ends[3]>=biggest1601){
            biggest1601=ends[3];
          }
          if(ends[4]>=biggest1601){
            biggest1601=ends[4];
          }
          if(ends[5]>=biggest1601){
            biggest1601=ends[5];
          }
          if(biggest1601 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread1602(tdone,ends);
          thread1603(tdone,ends);
          thread1604(tdone,ends);
          thread1605(tdone,ends);
          int biggest1613 = 0;
          if(ends[2]>=biggest1613){
            biggest1613=ends[2];
          }
          if(ends[3]>=biggest1613){
            biggest1613=ends[3];
          }
          if(ends[4]>=biggest1613){
            biggest1613=ends[4];
          }
          if(ends[5]>=biggest1613){
            biggest1613=ends[5];
          }
          if(biggest1613 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1613 == 0){
            thread1614(tdone,ends);
            thread1615(tdone,ends);
            thread1616(tdone,ends);
            thread1617(tdone,ends);
            int biggest1625 = 0;
            if(ends[2]>=biggest1625){
              biggest1625=ends[2];
            }
            if(ends[3]>=biggest1625){
              biggest1625=ends[3];
            }
            if(ends[4]>=biggest1625){
              biggest1625=ends[4];
            }
            if(ends[5]>=biggest1625){
              biggest1625=ends[5];
            }
            if(biggest1625 == 1){
              active[1]=1;
              ends[1]=1;
              break RUN;
            }
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
