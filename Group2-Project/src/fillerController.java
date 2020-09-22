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
  private Signal stop_1;
  private Signal fill_1;
  private long __start_thread_4;//sysj\fillerController.sysj line: 16, column: 4
  private long __start_thread_7;//sysj\fillerController.sysj line: 32, column: 4
  private long __start_thread_10;//sysj\fillerController.sysj line: 48, column: 4
  private long __start_thread_13;//sysj\fillerController.sysj line: 64, column: 4
  private int S2436 = 1;
  private int S1420 = 1;
  private int S1278 = 1;
  private int S1284 = 1;
  private int S1300 = 1;
  private int S1286 = 1;
  private int S1566 = 1;
  private int S1424 = 1;
  private int S1430 = 1;
  private int S1446 = 1;
  private int S1712 = 1;
  private int S1570 = 1;
  private int S1576 = 1;
  private int S1592 = 1;
  private int S1858 = 1;
  private int S1716 = 1;
  private int S1722 = 1;
  private int S1738 = 1;
  private int S1887 = 1;
  private int S1862 = 1;
  private int S2434 = 1;
  private int S2433 = 1;
  private int S1922 = 1;
  private int S1894 = 1;
  private int S1904 = 1;
  private int S1901 = 1;
  private int S1939 = 1;
  private int S1944 = 1;
  
  private int[] ends = new int[20];
  private int[] tdone = new int[20];
  
  public void thread2485(int [] tdone, int [] ends){
        switch(S1944){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        valveExtend.setPresent();//sysj\fillerController.sysj line: 108, column: 6
        currsigs.addElement(valveExtend);
        active[19]=1;
        ends[19]=1;
        tdone[19]=1;
        break;
      
    }
  }

  public void thread2484(int [] tdone, int [] ends){
        switch(S1939){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        inletOn.setPresent();//sysj\fillerController.sysj line: 106, column: 6
        currsigs.addElement(inletOn);
        active[18]=1;
        ends[18]=1;
        tdone[18]=1;
        break;
      
    }
  }

  public void thread2482(int [] tdone, int [] ends){
        S1944=1;
    valveExtend.setPresent();//sysj\fillerController.sysj line: 108, column: 6
    currsigs.addElement(valveExtend);
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread2481(int [] tdone, int [] ends){
        S1939=1;
    inletOn.setPresent();//sysj\fillerController.sysj line: 106, column: 6
    currsigs.addElement(inletOn);
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread2479(int [] tdone, int [] ends){
        switch(S1904){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        switch(S1901){
          case 0 : 
            S1901=0;
            S1901=1;
            valveRetract.setPresent();//sysj\fillerController.sysj line: 96, column: 6
            currsigs.addElement(valveRetract);
            active[17]=1;
            ends[17]=1;
            tdone[17]=1;
            break;
          
          case 1 : 
            valveRetract.setPresent();//sysj\fillerController.sysj line: 96, column: 6
            currsigs.addElement(valveRetract);
            active[17]=1;
            ends[17]=1;
            tdone[17]=1;
            break;
          
          case 2 : 
            S1901=2;
            S1904=0;
            active[17]=0;
            ends[17]=0;
            tdone[17]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread2478(int [] tdone, int [] ends){
        switch(S1894){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        injectorOn.setPresent();//sysj\fillerController.sysj line: 92, column: 6
        currsigs.addElement(injectorOn);
        active[16]=1;
        ends[16]=1;
        tdone[16]=1;
        break;
      
    }
  }

  public void thread2476(int [] tdone, int [] ends){
        S1904=1;
    if(canBottom.getprestatus()){//sysj\fillerController.sysj line: 94, column: 15
      S1901=0;
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
    else {
      S1904=0;
      active[17]=0;
      ends[17]=0;
      tdone[17]=1;
    }
  }

  public void thread2475(int [] tdone, int [] ends){
        S1894=1;
    injectorOn.setPresent();//sysj\fillerController.sysj line: 92, column: 6
    currsigs.addElement(injectorOn);
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread2474(int [] tdone, int [] ends){
        switch(S2434){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S2433){
          case 0 : 
            if(tick.getprestatus()){//sysj\fillerController.sysj line: 88, column: 8
              S2433=1;
              S1922=0;
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
          
          case 1 : 
            switch(S1922){
              case 0 : 
                if(fillerEnable.getprestatus()){//sysj\fillerController.sysj line: 90, column: 10
                  S1922=1;
                  thread2475(tdone,ends);
                  thread2476(tdone,ends);
                  int biggest2477 = 0;
                  if(ends[16]>=biggest2477){
                    biggest2477=ends[16];
                  }
                  if(ends[17]>=biggest2477){
                    biggest2477=ends[17];
                  }
                  if(biggest2477 == 1){
                    active[15]=1;
                    ends[15]=1;
                    tdone[15]=1;
                  }
                }
                else {
                  active[15]=1;
                  ends[15]=1;
                  tdone[15]=1;
                }
                break;
              
              case 1 : 
                if(canTop.getprestatus()){//sysj\fillerController.sysj line: 91, column: 10
                  System.out.println("select a liquid");//sysj\fillerController.sysj line: 101, column: 4
                  S1922=2;
                  fill_1.setPresent();//sysj\fillerController.sysj line: 103, column: 5
                  currsigs.addElement(fill_1);
                  active[15]=1;
                  ends[15]=1;
                  tdone[15]=1;
                }
                else {
                  thread2478(tdone,ends);
                  thread2479(tdone,ends);
                  int biggest2480 = 0;
                  if(ends[16]>=biggest2480){
                    biggest2480=ends[16];
                  }
                  if(ends[17]>=biggest2480){
                    biggest2480=ends[17];
                  }
                  if(biggest2480 == 1){
                    active[15]=1;
                    ends[15]=1;
                    tdone[15]=1;
                  }
                  //FINXME code
                  if(biggest2480 == 0){
                    System.out.println("select a liquid");//sysj\fillerController.sysj line: 101, column: 4
                    S1922=2;
                    fill_1.setPresent();//sysj\fillerController.sysj line: 103, column: 5
                    currsigs.addElement(fill_1);
                    active[15]=1;
                    ends[15]=1;
                    tdone[15]=1;
                  }
                }
                break;
              
              case 2 : 
                if(stop_1.getprestatus()){//sysj\fillerController.sysj line: 102, column: 10
                  S1922=3;
                  thread2481(tdone,ends);
                  thread2482(tdone,ends);
                  int biggest2483 = 0;
                  if(ends[18]>=biggest2483){
                    biggest2483=ends[18];
                  }
                  if(ends[19]>=biggest2483){
                    biggest2483=ends[19];
                  }
                  if(biggest2483 == 1){
                    active[15]=1;
                    ends[15]=1;
                    tdone[15]=1;
                  }
                }
                else {
                  fill_1.setPresent();//sysj\fillerController.sysj line: 103, column: 5
                  currsigs.addElement(fill_1);
                  active[15]=1;
                  ends[15]=1;
                  tdone[15]=1;
                }
                break;
              
              case 3 : 
                if(canBottom.getprestatus()){//sysj\fillerController.sysj line: 105, column: 10
                  S1922=0;
                  active[15]=1;
                  ends[15]=1;
                  tdone[15]=1;
                }
                else {
                  thread2484(tdone,ends);
                  thread2485(tdone,ends);
                  int biggest2486 = 0;
                  if(ends[18]>=biggest2486){
                    biggest2486=ends[18];
                  }
                  if(ends[19]>=biggest2486){
                    biggest2486=ends[19];
                  }
                  if(biggest2486 == 1){
                    active[15]=1;
                    ends[15]=1;
                    tdone[15]=1;
                  }
                  //FINXME code
                  if(biggest2486 == 0){
                    S1922=0;
                    active[15]=1;
                    ends[15]=1;
                    tdone[15]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2473(int [] tdone, int [] ends){
        switch(S1887){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S1862){
          case 0 : 
            if(tick.getprestatus()){//sysj\fillerController.sysj line: 72, column: 9
              S1862=1;
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
          
          case 1 : 
            if(!tick.getprestatus()){//sysj\fillerController.sysj line: 73, column: 9
              S1862=2;
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
          
          case 2 : 
            if(fill_1.getprestatus()){//sysj\fillerController.sysj line: 74, column: 9
              S1862=3;
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
          
          case 3 : 
            if(!fill_1.getprestatus()){//sysj\fillerController.sysj line: 75, column: 9
              S1862=4;
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
          
          case 4 : 
            if(fill_1.getprestatus()){//sysj\fillerController.sysj line: 76, column: 9
              S1862=5;
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
          
          case 5 : 
            if(!fill_1.getprestatus()){//sysj\fillerController.sysj line: 77, column: 9
              S1862=6;
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
          
          case 6 : 
            if(fill_1.getprestatus()){//sysj\fillerController.sysj line: 78, column: 9
              S1862=7;
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
          
          case 7 : 
            if(!fill_1.getprestatus()){//sysj\fillerController.sysj line: 79, column: 9
              S1862=8;
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
          
          case 8 : 
            if(fill_1.getprestatus()){//sysj\fillerController.sysj line: 80, column: 9
              S1862=9;
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
          
          case 9 : 
            if(!fill_1.getprestatus()){//sysj\fillerController.sysj line: 81, column: 9
              S1862=10;
              fillerDone.setPresent();//sysj\fillerController.sysj line: 83, column: 4
              currsigs.addElement(fillerDone);
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
          
          case 10 : 
            if(!fillerEnable.getprestatus()){//sysj\fillerController.sysj line: 82, column: 9
              S1887=0;
              active[14]=0;
              ends[14]=0;
              tdone[14]=1;
            }
            else {
              fillerDone.setPresent();//sysj\fillerController.sysj line: 83, column: 4
              currsigs.addElement(fillerDone);
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2471(int [] tdone, int [] ends){
        switch(S1738){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_13 >= 2000){//sysj\fillerController.sysj line: 64, column: 4
          ends[13]=2;
          ;//sysj\fillerController.sysj line: 64, column: 4
          stop_1.setPresent();//sysj\fillerController.sysj line: 66, column: 5
          currsigs.addElement(stop_1);
          S1738=0;
          active[13]=0;
          ends[13]=0;
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

  public void thread2470(int [] tdone, int [] ends){
        switch(S1722){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(stop_1.getprestatus()){//sysj\fillerController.sysj line: 59, column: 11
          S1722=0;
          active[12]=0;
          ends[12]=0;
          tdone[12]=1;
        }
        else {
          fill4.setPresent();//sysj\fillerController.sysj line: 60, column: 5
          currsigs.addElement(fill4);
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        break;
      
    }
  }

  public void thread2468(int [] tdone, int [] ends){
        S1738=1;
    __start_thread_13 = com.systemj.Timer.getMs();//sysj\fillerController.sysj line: 64, column: 4
    if(com.systemj.Timer.getMs() - __start_thread_13 >= 2000){//sysj\fillerController.sysj line: 64, column: 4
      ends[13]=2;
      ;//sysj\fillerController.sysj line: 64, column: 4
      stop_1.setPresent();//sysj\fillerController.sysj line: 66, column: 5
      currsigs.addElement(stop_1);
      S1738=0;
      active[13]=0;
      ends[13]=0;
      tdone[13]=1;
    }
    else {
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread2467(int [] tdone, int [] ends){
        S1722=1;
    fill4.setPresent();//sysj\fillerController.sysj line: 60, column: 5
    currsigs.addElement(fill4);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread2466(int [] tdone, int [] ends){
        switch(S1858){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S1716){
          case 0 : 
            if(fill_1.getprestatus()){//sysj\fillerController.sysj line: 57, column: 10
              S1716=1;
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
            if(toFill4.getprestatus()){//sysj\fillerController.sysj line: 58, column: 10
              S1716=2;
              thread2467(tdone,ends);
              thread2468(tdone,ends);
              int biggest2469 = 0;
              if(ends[12]>=biggest2469){
                biggest2469=ends[12];
              }
              if(ends[13]>=biggest2469){
                biggest2469=ends[13];
              }
              if(biggest2469 == 1){
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
          
          case 2 : 
            thread2470(tdone,ends);
            thread2471(tdone,ends);
            int biggest2472 = 0;
            if(ends[12]>=biggest2472){
              biggest2472=ends[12];
            }
            if(ends[13]>=biggest2472){
              biggest2472=ends[13];
            }
            if(biggest2472 == 1){
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            //FINXME code
            if(biggest2472 == 0){
              S1716=0;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2464(int [] tdone, int [] ends){
        switch(S1592){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_10 >= 2000){//sysj\fillerController.sysj line: 48, column: 4
          ends[10]=2;
          ;//sysj\fillerController.sysj line: 48, column: 4
          stop_1.setPresent();//sysj\fillerController.sysj line: 50, column: 5
          currsigs.addElement(stop_1);
          S1592=0;
          active[10]=0;
          ends[10]=0;
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

  public void thread2463(int [] tdone, int [] ends){
        switch(S1576){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(stop_1.getprestatus()){//sysj\fillerController.sysj line: 43, column: 11
          S1576=0;
          active[9]=0;
          ends[9]=0;
          tdone[9]=1;
        }
        else {
          fill3.setPresent();//sysj\fillerController.sysj line: 44, column: 5
          currsigs.addElement(fill3);
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        break;
      
    }
  }

  public void thread2461(int [] tdone, int [] ends){
        S1592=1;
    __start_thread_10 = com.systemj.Timer.getMs();//sysj\fillerController.sysj line: 48, column: 4
    if(com.systemj.Timer.getMs() - __start_thread_10 >= 2000){//sysj\fillerController.sysj line: 48, column: 4
      ends[10]=2;
      ;//sysj\fillerController.sysj line: 48, column: 4
      stop_1.setPresent();//sysj\fillerController.sysj line: 50, column: 5
      currsigs.addElement(stop_1);
      S1592=0;
      active[10]=0;
      ends[10]=0;
      tdone[10]=1;
    }
    else {
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread2460(int [] tdone, int [] ends){
        S1576=1;
    fill3.setPresent();//sysj\fillerController.sysj line: 44, column: 5
    currsigs.addElement(fill3);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread2459(int [] tdone, int [] ends){
        switch(S1712){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S1570){
          case 0 : 
            if(fill_1.getprestatus()){//sysj\fillerController.sysj line: 41, column: 10
              S1570=1;
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
          
          case 1 : 
            if(toFill3.getprestatus()){//sysj\fillerController.sysj line: 42, column: 10
              S1570=2;
              thread2460(tdone,ends);
              thread2461(tdone,ends);
              int biggest2462 = 0;
              if(ends[9]>=biggest2462){
                biggest2462=ends[9];
              }
              if(ends[10]>=biggest2462){
                biggest2462=ends[10];
              }
              if(biggest2462 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
            }
            else {
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 2 : 
            thread2463(tdone,ends);
            thread2464(tdone,ends);
            int biggest2465 = 0;
            if(ends[9]>=biggest2465){
              biggest2465=ends[9];
            }
            if(ends[10]>=biggest2465){
              biggest2465=ends[10];
            }
            if(biggest2465 == 1){
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            //FINXME code
            if(biggest2465 == 0){
              S1570=0;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2457(int [] tdone, int [] ends){
        switch(S1446){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_7 >= 2000){//sysj\fillerController.sysj line: 32, column: 4
          ends[7]=2;
          ;//sysj\fillerController.sysj line: 32, column: 4
          stop_1.setPresent();//sysj\fillerController.sysj line: 34, column: 5
          currsigs.addElement(stop_1);
          S1446=0;
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

  public void thread2456(int [] tdone, int [] ends){
        switch(S1430){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(stop_1.getprestatus()){//sysj\fillerController.sysj line: 27, column: 11
          S1430=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        else {
          fill2.setPresent();//sysj\fillerController.sysj line: 28, column: 5
          currsigs.addElement(fill2);
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread2454(int [] tdone, int [] ends){
        S1446=1;
    __start_thread_7 = com.systemj.Timer.getMs();//sysj\fillerController.sysj line: 32, column: 4
    if(com.systemj.Timer.getMs() - __start_thread_7 >= 2000){//sysj\fillerController.sysj line: 32, column: 4
      ends[7]=2;
      ;//sysj\fillerController.sysj line: 32, column: 4
      stop_1.setPresent();//sysj\fillerController.sysj line: 34, column: 5
      currsigs.addElement(stop_1);
      S1446=0;
      active[7]=0;
      ends[7]=0;
      tdone[7]=1;
    }
    else {
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread2453(int [] tdone, int [] ends){
        S1430=1;
    fill2.setPresent();//sysj\fillerController.sysj line: 28, column: 5
    currsigs.addElement(fill2);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread2452(int [] tdone, int [] ends){
        switch(S1566){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S1424){
          case 0 : 
            if(fill_1.getprestatus()){//sysj\fillerController.sysj line: 25, column: 10
              S1424=1;
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
            if(toFill2.getprestatus()){//sysj\fillerController.sysj line: 26, column: 10
              S1424=2;
              thread2453(tdone,ends);
              thread2454(tdone,ends);
              int biggest2455 = 0;
              if(ends[6]>=biggest2455){
                biggest2455=ends[6];
              }
              if(ends[7]>=biggest2455){
                biggest2455=ends[7];
              }
              if(biggest2455 == 1){
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
            }
            else {
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 2 : 
            thread2456(tdone,ends);
            thread2457(tdone,ends);
            int biggest2458 = 0;
            if(ends[6]>=biggest2458){
              biggest2458=ends[6];
            }
            if(ends[7]>=biggest2458){
              biggest2458=ends[7];
            }
            if(biggest2458 == 1){
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            //FINXME code
            if(biggest2458 == 0){
              S1424=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2450(int [] tdone, int [] ends){
        switch(S1300){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S1286){
          case 0 : 
            S1286=0;
            if(com.systemj.Timer.getMs() - __start_thread_4 >= 2000){//sysj\fillerController.sysj line: 16, column: 4
              ends[4]=2;
              ;//sysj\fillerController.sysj line: 16, column: 4
              stop_1.setPresent();//sysj\fillerController.sysj line: 18, column: 5
              currsigs.addElement(stop_1);
              S1300=0;
              active[4]=0;
              ends[4]=0;
              tdone[4]=1;
            }
            else {
              S1286=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S1286=1;
            S1286=0;
            if(com.systemj.Timer.getMs() - __start_thread_4 >= 2000){//sysj\fillerController.sysj line: 16, column: 4
              ends[4]=2;
              ;//sysj\fillerController.sysj line: 16, column: 4
              stop_1.setPresent();//sysj\fillerController.sysj line: 18, column: 5
              currsigs.addElement(stop_1);
              S1300=0;
              active[4]=0;
              ends[4]=0;
              tdone[4]=1;
            }
            else {
              S1286=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2449(int [] tdone, int [] ends){
        switch(S1284){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(stop_1.getprestatus()){//sysj\fillerController.sysj line: 11, column: 11
          S1284=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        else {
          fill1.setPresent();//sysj\fillerController.sysj line: 12, column: 5
          currsigs.addElement(fill1);
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread2447(int [] tdone, int [] ends){
        S1300=1;
    __start_thread_4 = com.systemj.Timer.getMs();//sysj\fillerController.sysj line: 16, column: 4
    S1286=0;
    if(com.systemj.Timer.getMs() - __start_thread_4 >= 2000){//sysj\fillerController.sysj line: 16, column: 4
      ends[4]=2;
      ;//sysj\fillerController.sysj line: 16, column: 4
      stop_1.setPresent();//sysj\fillerController.sysj line: 18, column: 5
      currsigs.addElement(stop_1);
      S1300=0;
      active[4]=0;
      ends[4]=0;
      tdone[4]=1;
    }
    else {
      S1286=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread2446(int [] tdone, int [] ends){
        S1284=1;
    fill1.setPresent();//sysj\fillerController.sysj line: 12, column: 5
    currsigs.addElement(fill1);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread2445(int [] tdone, int [] ends){
        switch(S1420){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S1278){
          case 0 : 
            if(fill_1.getprestatus()){//sysj\fillerController.sysj line: 9, column: 10
              S1278=1;
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
            if(toFill1.getprestatus()){//sysj\fillerController.sysj line: 10, column: 10
              S1278=2;
              thread2446(tdone,ends);
              thread2447(tdone,ends);
              int biggest2448 = 0;
              if(ends[3]>=biggest2448){
                biggest2448=ends[3];
              }
              if(ends[4]>=biggest2448){
                biggest2448=ends[4];
              }
              if(biggest2448 == 1){
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
          
          case 2 : 
            thread2449(tdone,ends);
            thread2450(tdone,ends);
            int biggest2451 = 0;
            if(ends[3]>=biggest2451){
              biggest2451=ends[3];
            }
            if(ends[4]>=biggest2451){
              biggest2451=ends[4];
            }
            if(biggest2451 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest2451 == 0){
              S1278=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2443(int [] tdone, int [] ends){
        S2434=1;
    S2433=0;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread2442(int [] tdone, int [] ends){
        S1887=1;
    S1862=0;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread2441(int [] tdone, int [] ends){
        S1858=1;
    S1716=0;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread2440(int [] tdone, int [] ends){
        S1712=1;
    S1570=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread2439(int [] tdone, int [] ends){
        S1566=1;
    S1424=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread2438(int [] tdone, int [] ends){
        S1420=1;
    S1278=0;
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
      switch(S2436){
        case 0 : 
          S2436=0;
          break RUN;
        
        case 1 : 
          S2436=2;
          S2436=2;
          stop_1.setClear();//sysj\fillerController.sysj line: 6, column: 5
          fill_1.setClear();//sysj\fillerController.sysj line: 6, column: 5
          thread2438(tdone,ends);
          thread2439(tdone,ends);
          thread2440(tdone,ends);
          thread2441(tdone,ends);
          thread2442(tdone,ends);
          thread2443(tdone,ends);
          int biggest2444 = 0;
          if(ends[2]>=biggest2444){
            biggest2444=ends[2];
          }
          if(ends[5]>=biggest2444){
            biggest2444=ends[5];
          }
          if(ends[8]>=biggest2444){
            biggest2444=ends[8];
          }
          if(ends[11]>=biggest2444){
            biggest2444=ends[11];
          }
          if(ends[14]>=biggest2444){
            biggest2444=ends[14];
          }
          if(ends[15]>=biggest2444){
            biggest2444=ends[15];
          }
          if(biggest2444 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          stop_1.setClear();//sysj\fillerController.sysj line: 6, column: 5
          fill_1.setClear();//sysj\fillerController.sysj line: 6, column: 5
          thread2445(tdone,ends);
          thread2452(tdone,ends);
          thread2459(tdone,ends);
          thread2466(tdone,ends);
          thread2473(tdone,ends);
          thread2474(tdone,ends);
          int biggest2487 = 0;
          if(ends[2]>=biggest2487){
            biggest2487=ends[2];
          }
          if(ends[5]>=biggest2487){
            biggest2487=ends[5];
          }
          if(ends[8]>=biggest2487){
            biggest2487=ends[8];
          }
          if(ends[11]>=biggest2487){
            biggest2487=ends[11];
          }
          if(ends[14]>=biggest2487){
            biggest2487=ends[14];
          }
          if(ends[15]>=biggest2487){
            biggest2487=ends[15];
          }
          if(biggest2487 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2487 == 0){
            S2436=0;
            active[1]=0;
            ends[1]=0;
            S2436=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    stop_1 = new Signal();
    fill_1 = new Signal();
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
      stop_1.setpreclear();
      fill_1.setpreclear();
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
      stop_1.setClear();
      fill_1.setClear();
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
