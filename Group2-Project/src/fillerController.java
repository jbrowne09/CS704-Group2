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
  private int S1771 = 1;
  private int S1286 = 1;
  private int S1274 = 1;
  private int S1300 = 1;
  private int S1288 = 1;
  private int S1314 = 1;
  private int S1302 = 1;
  private int S1328 = 1;
  private int S1316 = 1;
  private int S1698 = 1;
  private int S1331 = 1;
  private int S1339 = 1;
  private int S1349 = 1;
  private int S1377 = 1;
  private int S1385 = 1;
  private int S1769 = 1;
  private int S1702 = 1;
  private int S1712 = 1;
  private int S1706 = 1;
  private int S1720 = 1;
  private int S1728 = 1;
  private int S1736 = 1;
  
  private int[] ends = new int[16];
  private int[] tdone = new int[16];
  
  public void thread1809(int [] tdone, int [] ends){
        switch(S1736){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(toFill4.getprestatus()){//sysj\fillerController.sysj line: 81, column: 25
          fill4.setPresent();//sysj\fillerController.sysj line: 81, column: 35
          currsigs.addElement(fill4);
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        else {
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        break;
      
    }
  }

  public void thread1808(int [] tdone, int [] ends){
        switch(S1728){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(toFill3.getprestatus()){//sysj\fillerController.sysj line: 79, column: 25
          fill3.setPresent();//sysj\fillerController.sysj line: 79, column: 35
          currsigs.addElement(fill3);
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        else {
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        break;
      
    }
  }

  public void thread1807(int [] tdone, int [] ends){
        switch(S1720){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(toFill2.getprestatus()){//sysj\fillerController.sysj line: 77, column: 25
          fill2.setPresent();//sysj\fillerController.sysj line: 77, column: 35
          currsigs.addElement(fill2);
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        else {
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        break;
      
    }
  }

  public void thread1806(int [] tdone, int [] ends){
        switch(S1712){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S1706){
          case 0 : 
            S1706=0;
            if(toFill1.getprestatus()){//sysj\fillerController.sysj line: 75, column: 25
              fill1.setPresent();//sysj\fillerController.sysj line: 75, column: 35
              currsigs.addElement(fill1);
              S1706=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              S1706=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
          case 1 : 
            S1706=1;
            S1706=0;
            if(toFill1.getprestatus()){//sysj\fillerController.sysj line: 75, column: 25
              fill1.setPresent();//sysj\fillerController.sysj line: 75, column: 35
              currsigs.addElement(fill1);
              S1706=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              S1706=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1804(int [] tdone, int [] ends){
        S1736=1;
    if(toFill4.getprestatus()){//sysj\fillerController.sysj line: 81, column: 25
      fill4.setPresent();//sysj\fillerController.sysj line: 81, column: 35
      currsigs.addElement(fill4);
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread1803(int [] tdone, int [] ends){
        S1728=1;
    if(toFill3.getprestatus()){//sysj\fillerController.sysj line: 79, column: 25
      fill3.setPresent();//sysj\fillerController.sysj line: 79, column: 35
      currsigs.addElement(fill3);
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread1802(int [] tdone, int [] ends){
        S1720=1;
    if(toFill2.getprestatus()){//sysj\fillerController.sysj line: 77, column: 25
      fill2.setPresent();//sysj\fillerController.sysj line: 77, column: 35
      currsigs.addElement(fill2);
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread1801(int [] tdone, int [] ends){
        S1712=1;
    S1706=0;
    if(toFill1.getprestatus()){//sysj\fillerController.sysj line: 75, column: 25
      fill1.setPresent();//sysj\fillerController.sysj line: 75, column: 35
      currsigs.addElement(fill1);
      S1706=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      S1706=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread1800(int [] tdone, int [] ends){
        switch(S1769){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S1702){
          case 0 : 
            if(tick.getprestatus()){//sysj\fillerController.sysj line: 72, column: 8
              S1702=1;
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
          
          case 1 : 
            if(!tick.getprestatus()){//sysj\fillerController.sysj line: 73, column: 8
              S1702=2;
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
          
          case 2 : 
            if(tick.getprestatus()){//sysj\fillerController.sysj line: 74, column: 8
              S1702=3;
              thread1801(tdone,ends);
              thread1802(tdone,ends);
              thread1803(tdone,ends);
              thread1804(tdone,ends);
              int biggest1805 = 0;
              if(ends[12]>=biggest1805){
                biggest1805=ends[12];
              }
              if(ends[13]>=biggest1805){
                biggest1805=ends[13];
              }
              if(ends[14]>=biggest1805){
                biggest1805=ends[14];
              }
              if(ends[15]>=biggest1805){
                biggest1805=ends[15];
              }
              if(biggest1805 == 1){
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
            }
            else {
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
          case 3 : 
            thread1806(tdone,ends);
            thread1807(tdone,ends);
            thread1808(tdone,ends);
            thread1809(tdone,ends);
            int biggest1810 = 0;
            if(ends[12]>=biggest1810){
              biggest1810=ends[12];
            }
            if(ends[13]>=biggest1810){
              biggest1810=ends[13];
            }
            if(ends[14]>=biggest1810){
              biggest1810=ends[14];
            }
            if(ends[15]>=biggest1810){
              biggest1810=ends[15];
            }
            if(biggest1810 == 1){
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            //FINXME code
            if(biggest1810 == 0){
              S1769=0;
              active[11]=0;
              ends[11]=0;
              tdone[11]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1798(int [] tdone, int [] ends){
        switch(S1385){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        valveExtend.setPresent();//sysj\fillerController.sysj line: 63, column: 5
        currsigs.addElement(valveExtend);
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
        break;
      
    }
  }

  public void thread1797(int [] tdone, int [] ends){
        switch(S1377){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        inletOn.setPresent();//sysj\fillerController.sysj line: 59, column: 5
        currsigs.addElement(inletOn);
        active[9]=1;
        ends[9]=1;
        tdone[9]=1;
        break;
      
    }
  }

  public void thread1795(int [] tdone, int [] ends){
        S1385=1;
    System.out.println("sustain valve extend");//sysj\fillerController.sysj line: 62, column: 5
    valveExtend.setPresent();//sysj\fillerController.sysj line: 63, column: 5
    currsigs.addElement(valveExtend);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread1794(int [] tdone, int [] ends){
        S1377=1;
    System.out.println("sustain inlet on");//sysj\fillerController.sysj line: 58, column: 7
    inletOn.setPresent();//sysj\fillerController.sysj line: 59, column: 5
    currsigs.addElement(inletOn);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread1792(int [] tdone, int [] ends){
        switch(S1349){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        valveRetract.setPresent();//sysj\fillerController.sysj line: 52, column: 6
        currsigs.addElement(valveRetract);
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
        break;
      
    }
  }

  public void thread1791(int [] tdone, int [] ends){
        switch(S1339){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        injectorOn.setPresent();//sysj\fillerController.sysj line: 48, column: 5
        currsigs.addElement(injectorOn);
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
        break;
      
    }
  }

  public void thread1789(int [] tdone, int [] ends){
        S1385=1;
    System.out.println("sustain valve extend");//sysj\fillerController.sysj line: 62, column: 5
    valveExtend.setPresent();//sysj\fillerController.sysj line: 63, column: 5
    currsigs.addElement(valveExtend);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread1788(int [] tdone, int [] ends){
        S1377=1;
    System.out.println("sustain inlet on");//sysj\fillerController.sysj line: 58, column: 7
    inletOn.setPresent();//sysj\fillerController.sysj line: 59, column: 5
    currsigs.addElement(inletOn);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread1786(int [] tdone, int [] ends){
        S1349=1;
    if(canBottom.getprestatus()){//sysj\fillerController.sysj line: 50, column: 15
      System.out.println("valve retract");//sysj\fillerController.sysj line: 51, column: 5
      valveRetract.setPresent();//sysj\fillerController.sysj line: 52, column: 6
      currsigs.addElement(valveRetract);
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      S1349=0;
      active[8]=0;
      ends[8]=0;
      tdone[8]=1;
    }
  }

  public void thread1785(int [] tdone, int [] ends){
        S1339=1;
    System.out.println("sustain injectoron");//sysj\fillerController.sysj line: 47, column: 5
    injectorOn.setPresent();//sysj\fillerController.sysj line: 48, column: 5
    currsigs.addElement(injectorOn);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread1784(int [] tdone, int [] ends){
        switch(S1698){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S1331){
          case 0 : 
            if(tick.getprestatus()){//sysj\fillerController.sysj line: 44, column: 10
              S1331=1;
              thread1785(tdone,ends);
              thread1786(tdone,ends);
              int biggest1787 = 0;
              if(ends[7]>=biggest1787){
                biggest1787=ends[7];
              }
              if(ends[8]>=biggest1787){
                biggest1787=ends[8];
              }
              if(biggest1787 == 1){
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
            if(canTop.getprestatus()){//sysj\fillerController.sysj line: 45, column: 10
              System.out.println("done pt1");//sysj\fillerController.sysj line: 56, column: 4
              S1331=2;
              thread1788(tdone,ends);
              thread1789(tdone,ends);
              int biggest1790 = 0;
              if(ends[9]>=biggest1790){
                biggest1790=ends[9];
              }
              if(ends[10]>=biggest1790){
                biggest1790=ends[10];
              }
              if(biggest1790 == 1){
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
            }
            else {
              thread1791(tdone,ends);
              thread1792(tdone,ends);
              int biggest1793 = 0;
              if(ends[7]>=biggest1793){
                biggest1793=ends[7];
              }
              if(ends[8]>=biggest1793){
                biggest1793=ends[8];
              }
              if(biggest1793 == 1){
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
              //FINXME code
              if(biggest1793 == 0){
                System.out.println("done pt1");//sysj\fillerController.sysj line: 56, column: 4
                S1331=2;
                thread1794(tdone,ends);
                thread1795(tdone,ends);
                int biggest1796 = 0;
                if(ends[9]>=biggest1796){
                  biggest1796=ends[9];
                }
                if(ends[10]>=biggest1796){
                  biggest1796=ends[10];
                }
                if(biggest1796 == 1){
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
              }
            }
            break;
          
          case 2 : 
            if(canBottom.getprestatus()){//sysj\fillerController.sysj line: 57, column: 10
              System.out.println("done");//sysj\fillerController.sysj line: 65, column: 4
              fillerDone.setPresent();//sysj\fillerController.sysj line: 66, column: 4
              currsigs.addElement(fillerDone);
              System.out.println("filler");//sysj\fillerController.sysj line: 41, column: 3
              S1331=0;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              thread1797(tdone,ends);
              thread1798(tdone,ends);
              int biggest1799 = 0;
              if(ends[9]>=biggest1799){
                biggest1799=ends[9];
              }
              if(ends[10]>=biggest1799){
                biggest1799=ends[10];
              }
              if(biggest1799 == 1){
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
              //FINXME code
              if(biggest1799 == 0){
                System.out.println("done");//sysj\fillerController.sysj line: 65, column: 4
                fillerDone.setPresent();//sysj\fillerController.sysj line: 66, column: 4
                currsigs.addElement(fillerDone);
                System.out.println("filler");//sysj\fillerController.sysj line: 41, column: 3
                S1331=0;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1783(int [] tdone, int [] ends){
        switch(S1328){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S1316){
          case 0 : 
            if(toFill4.getprestatus()){//sysj\fillerController.sysj line: 33, column: 10
              System.out.println("liquidPos4");//sysj\fillerController.sysj line: 34, column: 4
              S1316=1;
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
            if(!toFill4.getprestatus()){//sysj\fillerController.sysj line: 35, column: 10
              S1316=0;
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
        break;
      
    }
  }

  public void thread1782(int [] tdone, int [] ends){
        switch(S1314){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S1302){
          case 0 : 
            if(toFill3.getprestatus()){//sysj\fillerController.sysj line: 25, column: 10
              System.out.println("liquidPos3");//sysj\fillerController.sysj line: 26, column: 4
              S1302=1;
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
            if(!toFill3.getprestatus()){//sysj\fillerController.sysj line: 27, column: 10
              S1302=0;
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
        break;
      
    }
  }

  public void thread1781(int [] tdone, int [] ends){
        switch(S1300){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S1288){
          case 0 : 
            if(toFill2.getprestatus()){//sysj\fillerController.sysj line: 17, column: 10
              System.out.println("liquidPos2");//sysj\fillerController.sysj line: 18, column: 4
              S1288=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if(!toFill2.getprestatus()){//sysj\fillerController.sysj line: 19, column: 10
              S1288=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1780(int [] tdone, int [] ends){
        switch(S1286){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S1274){
          case 0 : 
            if(toFill1.getprestatus()){//sysj\fillerController.sysj line: 9, column: 10
              System.out.println("liquidPos1");//sysj\fillerController.sysj line: 10, column: 4
              S1274=1;
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
            if(!toFill1.getprestatus()){//sysj\fillerController.sysj line: 11, column: 10
              S1274=0;
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
          
        }
        break;
      
    }
  }

  public void thread1778(int [] tdone, int [] ends){
        S1769=1;
    S1702=0;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread1777(int [] tdone, int [] ends){
        S1698=1;
    System.out.println("filler");//sysj\fillerController.sysj line: 41, column: 3
    S1331=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread1776(int [] tdone, int [] ends){
        S1328=1;
    S1316=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread1775(int [] tdone, int [] ends){
        S1314=1;
    S1302=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread1774(int [] tdone, int [] ends){
        S1300=1;
    S1288=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread1773(int [] tdone, int [] ends){
        S1286=1;
    S1274=0;
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
      switch(S1771){
        case 0 : 
          S1771=0;
          break RUN;
        
        case 1 : 
          S1771=2;
          S1771=2;
          thread1773(tdone,ends);
          thread1774(tdone,ends);
          thread1775(tdone,ends);
          thread1776(tdone,ends);
          thread1777(tdone,ends);
          thread1778(tdone,ends);
          int biggest1779 = 0;
          if(ends[2]>=biggest1779){
            biggest1779=ends[2];
          }
          if(ends[3]>=biggest1779){
            biggest1779=ends[3];
          }
          if(ends[4]>=biggest1779){
            biggest1779=ends[4];
          }
          if(ends[5]>=biggest1779){
            biggest1779=ends[5];
          }
          if(ends[6]>=biggest1779){
            biggest1779=ends[6];
          }
          if(ends[11]>=biggest1779){
            biggest1779=ends[11];
          }
          if(biggest1779 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread1780(tdone,ends);
          thread1781(tdone,ends);
          thread1782(tdone,ends);
          thread1783(tdone,ends);
          thread1784(tdone,ends);
          thread1800(tdone,ends);
          int biggest1811 = 0;
          if(ends[2]>=biggest1811){
            biggest1811=ends[2];
          }
          if(ends[3]>=biggest1811){
            biggest1811=ends[3];
          }
          if(ends[4]>=biggest1811){
            biggest1811=ends[4];
          }
          if(ends[5]>=biggest1811){
            biggest1811=ends[5];
          }
          if(ends[6]>=biggest1811){
            biggest1811=ends[6];
          }
          if(ends[11]>=biggest1811){
            biggest1811=ends[11];
          }
          if(biggest1811 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1811 == 0){
            S1771=0;
            active[1]=0;
            ends[1]=0;
            S1771=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
