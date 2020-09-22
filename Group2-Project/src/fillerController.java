import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class fillerController extends ClockDomain{
  public fillerController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal canBottom = new Signal("canBottom", Signal.INPUT);
  public Signal canTop = new Signal("canTop", Signal.INPUT);
  public Signal fillerEnable = new Signal("fillerEnable", Signal.INPUT);
  public Signal tick = new Signal("tick", Signal.INPUT);
  public Signal toFill1 = new Signal("toFill1", Signal.INPUT);
  public Signal toFill2 = new Signal("toFill2", Signal.INPUT);
  public Signal toFill3 = new Signal("toFill3", Signal.INPUT);
  public Signal toFill4 = new Signal("toFill4", Signal.INPUT);
  public Signal inletOn = new Signal("inletOn", Signal.OUTPUT);
  public Signal injectorOn = new Signal("injectorOn", Signal.OUTPUT);
  public Signal valveRetract = new Signal("valveRetract", Signal.OUTPUT);
  public Signal valveExtend = new Signal("valveExtend", Signal.OUTPUT);
  public Signal fillerDone = new Signal("fillerDone", Signal.OUTPUT);
  public Signal fill1 = new Signal("fill1", Signal.OUTPUT);
  public Signal fill2 = new Signal("fill2", Signal.OUTPUT);
  public Signal fill3 = new Signal("fill3", Signal.OUTPUT);
  public Signal fill4 = new Signal("fill4", Signal.OUTPUT);
  private int S1715 = 1;
  private int S1642 = 1;
  private int S1275 = 1;
  private int S1283 = 1;
  private int S1293 = 1;
  private int S1321 = 1;
  private int S1329 = 1;
  private int S1713 = 1;
  private int S1646 = 1;
  private int S1656 = 1;
  private int S1650 = 1;
  private int S1664 = 1;
  private int S1672 = 1;
  private int S1680 = 1;
  
  private int[] ends = new int[12];
  private int[] tdone = new int[12];
  
  public void thread1745(int [] tdone, int [] ends){
        switch(S1680){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(toFill4.getprestatus()){//sysj\fillerController.sysj line: 49, column: 25
          fill4.setPresent();//sysj\fillerController.sysj line: 49, column: 35
          currsigs.addElement(fill4);
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

  public void thread1744(int [] tdone, int [] ends){
        switch(S1672){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(toFill3.getprestatus()){//sysj\fillerController.sysj line: 47, column: 25
          fill3.setPresent();//sysj\fillerController.sysj line: 47, column: 35
          currsigs.addElement(fill3);
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

  public void thread1743(int [] tdone, int [] ends){
        switch(S1664){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(toFill2.getprestatus()){//sysj\fillerController.sysj line: 45, column: 25
          fill2.setPresent();//sysj\fillerController.sysj line: 45, column: 35
          currsigs.addElement(fill2);
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

  public void thread1742(int [] tdone, int [] ends){
        switch(S1656){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S1650){
          case 0 : 
            S1650=0;
            if(toFill1.getprestatus()){//sysj\fillerController.sysj line: 43, column: 25
              fill1.setPresent();//sysj\fillerController.sysj line: 43, column: 35
              currsigs.addElement(fill1);
              S1650=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              S1650=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 1 : 
            S1650=1;
            S1650=0;
            if(toFill1.getprestatus()){//sysj\fillerController.sysj line: 43, column: 25
              fill1.setPresent();//sysj\fillerController.sysj line: 43, column: 35
              currsigs.addElement(fill1);
              S1650=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              S1650=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1740(int [] tdone, int [] ends){
        S1680=1;
    if(toFill4.getprestatus()){//sysj\fillerController.sysj line: 49, column: 25
      fill4.setPresent();//sysj\fillerController.sysj line: 49, column: 35
      currsigs.addElement(fill4);
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

  public void thread1739(int [] tdone, int [] ends){
        S1672=1;
    if(toFill3.getprestatus()){//sysj\fillerController.sysj line: 47, column: 25
      fill3.setPresent();//sysj\fillerController.sysj line: 47, column: 35
      currsigs.addElement(fill3);
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

  public void thread1738(int [] tdone, int [] ends){
        S1664=1;
    if(toFill2.getprestatus()){//sysj\fillerController.sysj line: 45, column: 25
      fill2.setPresent();//sysj\fillerController.sysj line: 45, column: 35
      currsigs.addElement(fill2);
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

  public void thread1737(int [] tdone, int [] ends){
        S1656=1;
    S1650=0;
    if(toFill1.getprestatus()){//sysj\fillerController.sysj line: 43, column: 25
      fill1.setPresent();//sysj\fillerController.sysj line: 43, column: 35
      currsigs.addElement(fill1);
      S1650=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      S1650=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread1736(int [] tdone, int [] ends){
        switch(S1713){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S1646){
          case 0 : 
            if(tick.getprestatus()){//sysj\fillerController.sysj line: 40, column: 8
              S1646=1;
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
          
          case 1 : 
            if(!tick.getprestatus()){//sysj\fillerController.sysj line: 41, column: 8
              S1646=2;
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
          
          case 2 : 
            if(tick.getprestatus()){//sysj\fillerController.sysj line: 42, column: 8
              S1646=3;
              thread1737(tdone,ends);
              thread1738(tdone,ends);
              thread1739(tdone,ends);
              thread1740(tdone,ends);
              int biggest1741 = 0;
              if(ends[8]>=biggest1741){
                biggest1741=ends[8];
              }
              if(ends[9]>=biggest1741){
                biggest1741=ends[9];
              }
              if(ends[10]>=biggest1741){
                biggest1741=ends[10];
              }
              if(ends[11]>=biggest1741){
                biggest1741=ends[11];
              }
              if(biggest1741 == 1){
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
            }
            else {
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 3 : 
            thread1742(tdone,ends);
            thread1743(tdone,ends);
            thread1744(tdone,ends);
            thread1745(tdone,ends);
            int biggest1746 = 0;
            if(ends[8]>=biggest1746){
              biggest1746=ends[8];
            }
            if(ends[9]>=biggest1746){
              biggest1746=ends[9];
            }
            if(ends[10]>=biggest1746){
              biggest1746=ends[10];
            }
            if(ends[11]>=biggest1746){
              biggest1746=ends[11];
            }
            if(biggest1746 == 1){
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            //FINXME code
            if(biggest1746 == 0){
              S1713=0;
              active[7]=0;
              ends[7]=0;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1734(int [] tdone, int [] ends){
        switch(S1329){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        valveExtend.setPresent();//sysj\fillerController.sysj line: 31, column: 5
        currsigs.addElement(valveExtend);
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
        break;
      
    }
  }

  public void thread1733(int [] tdone, int [] ends){
        switch(S1321){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        inletOn.setPresent();//sysj\fillerController.sysj line: 27, column: 5
        currsigs.addElement(inletOn);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
        break;
      
    }
  }

  public void thread1731(int [] tdone, int [] ends){
        S1329=1;
    System.out.println("sustain valve extend");//sysj\fillerController.sysj line: 30, column: 5
    valveExtend.setPresent();//sysj\fillerController.sysj line: 31, column: 5
    currsigs.addElement(valveExtend);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread1730(int [] tdone, int [] ends){
        S1321=1;
    System.out.println("sustain inlet on");//sysj\fillerController.sysj line: 26, column: 7
    inletOn.setPresent();//sysj\fillerController.sysj line: 27, column: 5
    currsigs.addElement(inletOn);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread1728(int [] tdone, int [] ends){
        switch(S1293){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        valveRetract.setPresent();//sysj\fillerController.sysj line: 20, column: 6
        currsigs.addElement(valveRetract);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
        break;
      
    }
  }

  public void thread1727(int [] tdone, int [] ends){
        switch(S1283){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        injectorOn.setPresent();//sysj\fillerController.sysj line: 16, column: 5
        currsigs.addElement(injectorOn);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread1725(int [] tdone, int [] ends){
        S1329=1;
    System.out.println("sustain valve extend");//sysj\fillerController.sysj line: 30, column: 5
    valveExtend.setPresent();//sysj\fillerController.sysj line: 31, column: 5
    currsigs.addElement(valveExtend);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread1724(int [] tdone, int [] ends){
        S1321=1;
    System.out.println("sustain inlet on");//sysj\fillerController.sysj line: 26, column: 7
    inletOn.setPresent();//sysj\fillerController.sysj line: 27, column: 5
    currsigs.addElement(inletOn);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread1722(int [] tdone, int [] ends){
        S1293=1;
    if(canBottom.getprestatus()){//sysj\fillerController.sysj line: 18, column: 15
      System.out.println("valve retract");//sysj\fillerController.sysj line: 19, column: 5
      valveRetract.setPresent();//sysj\fillerController.sysj line: 20, column: 6
      currsigs.addElement(valveRetract);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S1293=0;
      active[4]=0;
      ends[4]=0;
      tdone[4]=1;
    }
  }

  public void thread1721(int [] tdone, int [] ends){
        S1283=1;
    System.out.println("sustain injectoron");//sysj\fillerController.sysj line: 15, column: 5
    injectorOn.setPresent();//sysj\fillerController.sysj line: 16, column: 5
    currsigs.addElement(injectorOn);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread1720(int [] tdone, int [] ends){
        switch(S1642){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S1275){
          case 0 : 
            if(tick.getprestatus()){//sysj\fillerController.sysj line: 12, column: 10
              S1275=1;
              thread1721(tdone,ends);
              thread1722(tdone,ends);
              int biggest1723 = 0;
              if(ends[3]>=biggest1723){
                biggest1723=ends[3];
              }
              if(ends[4]>=biggest1723){
                biggest1723=ends[4];
              }
              if(biggest1723 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(canTop.getprestatus()){//sysj\fillerController.sysj line: 13, column: 10
              System.out.println("done pt1");//sysj\fillerController.sysj line: 24, column: 4
              S1275=2;
              thread1724(tdone,ends);
              thread1725(tdone,ends);
              int biggest1726 = 0;
              if(ends[5]>=biggest1726){
                biggest1726=ends[5];
              }
              if(ends[6]>=biggest1726){
                biggest1726=ends[6];
              }
              if(biggest1726 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              thread1727(tdone,ends);
              thread1728(tdone,ends);
              int biggest1729 = 0;
              if(ends[3]>=biggest1729){
                biggest1729=ends[3];
              }
              if(ends[4]>=biggest1729){
                biggest1729=ends[4];
              }
              if(biggest1729 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest1729 == 0){
                System.out.println("done pt1");//sysj\fillerController.sysj line: 24, column: 4
                S1275=2;
                thread1730(tdone,ends);
                thread1731(tdone,ends);
                int biggest1732 = 0;
                if(ends[5]>=biggest1732){
                  biggest1732=ends[5];
                }
                if(ends[6]>=biggest1732){
                  biggest1732=ends[6];
                }
                if(biggest1732 == 1){
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
            }
            break;
          
          case 2 : 
            if(canBottom.getprestatus()){//sysj\fillerController.sysj line: 25, column: 10
              System.out.println("done");//sysj\fillerController.sysj line: 33, column: 4
              fillerDone.setPresent();//sysj\fillerController.sysj line: 34, column: 4
              currsigs.addElement(fillerDone);
              System.out.println("filler");//sysj\fillerController.sysj line: 9, column: 3
              S1275=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              thread1733(tdone,ends);
              thread1734(tdone,ends);
              int biggest1735 = 0;
              if(ends[5]>=biggest1735){
                biggest1735=ends[5];
              }
              if(ends[6]>=biggest1735){
                biggest1735=ends[6];
              }
              if(biggest1735 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest1735 == 0){
                System.out.println("done");//sysj\fillerController.sysj line: 33, column: 4
                fillerDone.setPresent();//sysj\fillerController.sysj line: 34, column: 4
                currsigs.addElement(fillerDone);
                System.out.println("filler");//sysj\fillerController.sysj line: 9, column: 3
                S1275=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1718(int [] tdone, int [] ends){
        S1713=1;
    S1646=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread1717(int [] tdone, int [] ends){
        S1642=1;
    System.out.println("filler");//sysj\fillerController.sysj line: 9, column: 3
    S1275=0;
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
      switch(S1715){
        case 0 : 
          S1715=0;
          break RUN;
        
        case 1 : 
          S1715=2;
          S1715=2;
          thread1717(tdone,ends);
          thread1718(tdone,ends);
          int biggest1719 = 0;
          if(ends[2]>=biggest1719){
            biggest1719=ends[2];
          }
          if(ends[7]>=biggest1719){
            biggest1719=ends[7];
          }
          if(biggest1719 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread1720(tdone,ends);
          thread1736(tdone,ends);
          int biggest1747 = 0;
          if(ends[2]>=biggest1747){
            biggest1747=ends[2];
          }
          if(ends[7]>=biggest1747){
            biggest1747=ends[7];
          }
          if(biggest1747 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1747 == 0){
            S1715=0;
            active[1]=0;
            ends[1]=0;
            S1715=0;
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
          canBottom.gethook();
          canTop.gethook();
          fillerEnable.gethook();
          tick.gethook();
          toFill1.gethook();
          toFill2.gethook();
          toFill3.gethook();
          toFill4.gethook();
          df = true;
        }
        runClockDomain();
      }
      canBottom.setpreclear();
      canTop.setpreclear();
      fillerEnable.setpreclear();
      tick.setpreclear();
      toFill1.setpreclear();
      toFill2.setpreclear();
      toFill3.setpreclear();
      toFill4.setpreclear();
      inletOn.setpreclear();
      injectorOn.setpreclear();
      valveRetract.setpreclear();
      valveExtend.setpreclear();
      fillerDone.setpreclear();
      fill1.setpreclear();
      fill2.setpreclear();
      fill3.setpreclear();
      fill4.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = canBottom.getStatus() ? canBottom.setprepresent() : canBottom.setpreclear();
      canBottom.setpreval(canBottom.getValue());
      canBottom.setClear();
      dummyint = canTop.getStatus() ? canTop.setprepresent() : canTop.setpreclear();
      canTop.setpreval(canTop.getValue());
      canTop.setClear();
      dummyint = fillerEnable.getStatus() ? fillerEnable.setprepresent() : fillerEnable.setpreclear();
      fillerEnable.setpreval(fillerEnable.getValue());
      fillerEnable.setClear();
      dummyint = tick.getStatus() ? tick.setprepresent() : tick.setpreclear();
      tick.setpreval(tick.getValue());
      tick.setClear();
      dummyint = toFill1.getStatus() ? toFill1.setprepresent() : toFill1.setpreclear();
      toFill1.setpreval(toFill1.getValue());
      toFill1.setClear();
      dummyint = toFill2.getStatus() ? toFill2.setprepresent() : toFill2.setpreclear();
      toFill2.setpreval(toFill2.getValue());
      toFill2.setClear();
      dummyint = toFill3.getStatus() ? toFill3.setprepresent() : toFill3.setpreclear();
      toFill3.setpreval(toFill3.getValue());
      toFill3.setClear();
      dummyint = toFill4.getStatus() ? toFill4.setprepresent() : toFill4.setpreclear();
      toFill4.setpreval(toFill4.getValue());
      toFill4.setClear();
      inletOn.sethook();
      inletOn.setClear();
      injectorOn.sethook();
      injectorOn.setClear();
      valveRetract.sethook();
      valveRetract.setClear();
      valveExtend.sethook();
      valveExtend.setClear();
      fillerDone.sethook();
      fillerDone.setClear();
      fill1.sethook();
      fill1.setClear();
      fill2.sethook();
      fill2.setClear();
      fill3.sethook();
      fill3.setClear();
      fill4.sethook();
      fill4.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        canBottom.gethook();
        canTop.gethook();
        fillerEnable.gethook();
        tick.gethook();
        toFill1.gethook();
        toFill2.gethook();
        toFill3.gethook();
        toFill4.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
