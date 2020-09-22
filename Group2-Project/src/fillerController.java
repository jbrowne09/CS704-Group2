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
  private int S2796 = 1;
  private int S1780 = 1;
  private int S1638 = 1;
  private int S1644 = 1;
  private int S1660 = 1;
  private int S1646 = 1;
  private int S1926 = 1;
  private int S1784 = 1;
  private int S1790 = 1;
  private int S1806 = 1;
  private int S2072 = 1;
  private int S1930 = 1;
  private int S1936 = 1;
  private int S1952 = 1;
  private int S2218 = 1;
  private int S2076 = 1;
  private int S2082 = 1;
  private int S2098 = 1;
  private int S2247 = 1;
  private int S2222 = 1;
  private int S2794 = 1;
  private int S2793 = 1;
  private int S2282 = 1;
  private int S2254 = 1;
  private int S2264 = 1;
  private int S2261 = 1;
  private int S2299 = 1;
  private int S2304 = 1;
  
  private int[] ends = new int[20];
  private int[] tdone = new int[20];
  
  public void thread2845(int [] tdone, int [] ends){
        switch(S2304){
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

  public void thread2844(int [] tdone, int [] ends){
        switch(S2299){
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

  public void thread2842(int [] tdone, int [] ends){
        S2304=1;
    valveExtend.setPresent();//sysj\fillerController.sysj line: 108, column: 6
    currsigs.addElement(valveExtend);
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread2841(int [] tdone, int [] ends){
        S2299=1;
    inletOn.setPresent();//sysj\fillerController.sysj line: 106, column: 6
    currsigs.addElement(inletOn);
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread2839(int [] tdone, int [] ends){
        switch(S2264){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        switch(S2261){
          case 0 : 
            S2261=0;
            S2261=1;
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
            S2261=2;
            S2264=0;
            active[17]=0;
            ends[17]=0;
            tdone[17]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread2838(int [] tdone, int [] ends){
        switch(S2254){
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

  public void thread2836(int [] tdone, int [] ends){
        S2264=1;
    if(canBottom.getprestatus()){//sysj\fillerController.sysj line: 94, column: 15
      S2261=0;
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
    else {
      S2264=0;
      active[17]=0;
      ends[17]=0;
      tdone[17]=1;
    }
  }

  public void thread2835(int [] tdone, int [] ends){
        S2254=1;
    injectorOn.setPresent();//sysj\fillerController.sysj line: 92, column: 6
    currsigs.addElement(injectorOn);
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread2834(int [] tdone, int [] ends){
        switch(S2794){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S2793){
          case 0 : 
            if(tick.getprestatus()){//sysj\fillerController.sysj line: 88, column: 8
              S2793=1;
              S2282=0;
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
            switch(S2282){
              case 0 : 
                if(fillerEnable.getprestatus()){//sysj\fillerController.sysj line: 90, column: 10
                  S2282=1;
                  thread2835(tdone,ends);
                  thread2836(tdone,ends);
                  int biggest2837 = 0;
                  if(ends[16]>=biggest2837){
                    biggest2837=ends[16];
                  }
                  if(ends[17]>=biggest2837){
                    biggest2837=ends[17];
                  }
                  if(biggest2837 == 1){
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
                  S2282=2;
                  fill_1.setPresent();//sysj\fillerController.sysj line: 103, column: 5
                  currsigs.addElement(fill_1);
                  active[15]=1;
                  ends[15]=1;
                  tdone[15]=1;
                }
                else {
                  thread2838(tdone,ends);
                  thread2839(tdone,ends);
                  int biggest2840 = 0;
                  if(ends[16]>=biggest2840){
                    biggest2840=ends[16];
                  }
                  if(ends[17]>=biggest2840){
                    biggest2840=ends[17];
                  }
                  if(biggest2840 == 1){
                    active[15]=1;
                    ends[15]=1;
                    tdone[15]=1;
                  }
                  //FINXME code
                  if(biggest2840 == 0){
                    System.out.println("select a liquid");//sysj\fillerController.sysj line: 101, column: 4
                    S2282=2;
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
                  S2282=3;
                  thread2841(tdone,ends);
                  thread2842(tdone,ends);
                  int biggest2843 = 0;
                  if(ends[18]>=biggest2843){
                    biggest2843=ends[18];
                  }
                  if(ends[19]>=biggest2843){
                    biggest2843=ends[19];
                  }
                  if(biggest2843 == 1){
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
                  S2282=0;
                  active[15]=1;
                  ends[15]=1;
                  tdone[15]=1;
                }
                else {
                  thread2844(tdone,ends);
                  thread2845(tdone,ends);
                  int biggest2846 = 0;
                  if(ends[18]>=biggest2846){
                    biggest2846=ends[18];
                  }
                  if(ends[19]>=biggest2846){
                    biggest2846=ends[19];
                  }
                  if(biggest2846 == 1){
                    active[15]=1;
                    ends[15]=1;
                    tdone[15]=1;
                  }
                  //FINXME code
                  if(biggest2846 == 0){
                    S2282=0;
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

  public void thread2833(int [] tdone, int [] ends){
        switch(S2247){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S2222){
          case 0 : 
            if(tick.getprestatus()){//sysj\fillerController.sysj line: 72, column: 9
              S2222=1;
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
              S2222=2;
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
              S2222=3;
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
              S2222=4;
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
              S2222=5;
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
              S2222=6;
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
              S2222=7;
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
              S2222=8;
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
              S2222=9;
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
              S2222=10;
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
              S2247=0;
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

  public void thread2831(int [] tdone, int [] ends){
        switch(S2098){
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
          S2098=0;
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

  public void thread2830(int [] tdone, int [] ends){
        switch(S2082){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(stop_1.getprestatus()){//sysj\fillerController.sysj line: 59, column: 11
          S2082=0;
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

  public void thread2828(int [] tdone, int [] ends){
        S2098=1;
    __start_thread_13 = com.systemj.Timer.getMs();//sysj\fillerController.sysj line: 64, column: 4
    if(com.systemj.Timer.getMs() - __start_thread_13 >= 2000){//sysj\fillerController.sysj line: 64, column: 4
      ends[13]=2;
      ;//sysj\fillerController.sysj line: 64, column: 4
      stop_1.setPresent();//sysj\fillerController.sysj line: 66, column: 5
      currsigs.addElement(stop_1);
      S2098=0;
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

  public void thread2827(int [] tdone, int [] ends){
        S2082=1;
    fill4.setPresent();//sysj\fillerController.sysj line: 60, column: 5
    currsigs.addElement(fill4);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread2826(int [] tdone, int [] ends){
        switch(S2218){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S2076){
          case 0 : 
            if(fill_1.getprestatus()){//sysj\fillerController.sysj line: 57, column: 10
              S2076=1;
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
              S2076=2;
              thread2827(tdone,ends);
              thread2828(tdone,ends);
              int biggest2829 = 0;
              if(ends[12]>=biggest2829){
                biggest2829=ends[12];
              }
              if(ends[13]>=biggest2829){
                biggest2829=ends[13];
              }
              if(biggest2829 == 1){
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
            thread2830(tdone,ends);
            thread2831(tdone,ends);
            int biggest2832 = 0;
            if(ends[12]>=biggest2832){
              biggest2832=ends[12];
            }
            if(ends[13]>=biggest2832){
              biggest2832=ends[13];
            }
            if(biggest2832 == 1){
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            //FINXME code
            if(biggest2832 == 0){
              S2076=0;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2824(int [] tdone, int [] ends){
        switch(S1952){
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
          S1952=0;
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

  public void thread2823(int [] tdone, int [] ends){
        switch(S1936){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(stop_1.getprestatus()){//sysj\fillerController.sysj line: 43, column: 11
          S1936=0;
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

  public void thread2821(int [] tdone, int [] ends){
        S1952=1;
    __start_thread_10 = com.systemj.Timer.getMs();//sysj\fillerController.sysj line: 48, column: 4
    if(com.systemj.Timer.getMs() - __start_thread_10 >= 2000){//sysj\fillerController.sysj line: 48, column: 4
      ends[10]=2;
      ;//sysj\fillerController.sysj line: 48, column: 4
      stop_1.setPresent();//sysj\fillerController.sysj line: 50, column: 5
      currsigs.addElement(stop_1);
      S1952=0;
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

  public void thread2820(int [] tdone, int [] ends){
        S1936=1;
    fill3.setPresent();//sysj\fillerController.sysj line: 44, column: 5
    currsigs.addElement(fill3);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread2819(int [] tdone, int [] ends){
        switch(S2072){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S1930){
          case 0 : 
            if(fill_1.getprestatus()){//sysj\fillerController.sysj line: 41, column: 10
              S1930=1;
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
              S1930=2;
              thread2820(tdone,ends);
              thread2821(tdone,ends);
              int biggest2822 = 0;
              if(ends[9]>=biggest2822){
                biggest2822=ends[9];
              }
              if(ends[10]>=biggest2822){
                biggest2822=ends[10];
              }
              if(biggest2822 == 1){
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
            thread2823(tdone,ends);
            thread2824(tdone,ends);
            int biggest2825 = 0;
            if(ends[9]>=biggest2825){
              biggest2825=ends[9];
            }
            if(ends[10]>=biggest2825){
              biggest2825=ends[10];
            }
            if(biggest2825 == 1){
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            //FINXME code
            if(biggest2825 == 0){
              S1930=0;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2817(int [] tdone, int [] ends){
        switch(S1806){
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
          S1806=0;
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

  public void thread2816(int [] tdone, int [] ends){
        switch(S1790){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(stop_1.getprestatus()){//sysj\fillerController.sysj line: 27, column: 11
          S1790=0;
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

  public void thread2814(int [] tdone, int [] ends){
        S1806=1;
    __start_thread_7 = com.systemj.Timer.getMs();//sysj\fillerController.sysj line: 32, column: 4
    if(com.systemj.Timer.getMs() - __start_thread_7 >= 2000){//sysj\fillerController.sysj line: 32, column: 4
      ends[7]=2;
      ;//sysj\fillerController.sysj line: 32, column: 4
      stop_1.setPresent();//sysj\fillerController.sysj line: 34, column: 5
      currsigs.addElement(stop_1);
      S1806=0;
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

  public void thread2813(int [] tdone, int [] ends){
        S1790=1;
    fill2.setPresent();//sysj\fillerController.sysj line: 28, column: 5
    currsigs.addElement(fill2);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread2812(int [] tdone, int [] ends){
        switch(S1926){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S1784){
          case 0 : 
            if(fill_1.getprestatus()){//sysj\fillerController.sysj line: 25, column: 10
              S1784=1;
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
              S1784=2;
              thread2813(tdone,ends);
              thread2814(tdone,ends);
              int biggest2815 = 0;
              if(ends[6]>=biggest2815){
                biggest2815=ends[6];
              }
              if(ends[7]>=biggest2815){
                biggest2815=ends[7];
              }
              if(biggest2815 == 1){
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
            thread2816(tdone,ends);
            thread2817(tdone,ends);
            int biggest2818 = 0;
            if(ends[6]>=biggest2818){
              biggest2818=ends[6];
            }
            if(ends[7]>=biggest2818){
              biggest2818=ends[7];
            }
            if(biggest2818 == 1){
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            //FINXME code
            if(biggest2818 == 0){
              S1784=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2810(int [] tdone, int [] ends){
        switch(S1660){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S1646){
          case 0 : 
            S1646=0;
            if(com.systemj.Timer.getMs() - __start_thread_4 >= 2000){//sysj\fillerController.sysj line: 16, column: 4
              ends[4]=2;
              ;//sysj\fillerController.sysj line: 16, column: 4
              stop_1.setPresent();//sysj\fillerController.sysj line: 18, column: 5
              currsigs.addElement(stop_1);
              S1660=0;
              active[4]=0;
              ends[4]=0;
              tdone[4]=1;
            }
            else {
              S1646=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S1646=1;
            S1646=0;
            if(com.systemj.Timer.getMs() - __start_thread_4 >= 2000){//sysj\fillerController.sysj line: 16, column: 4
              ends[4]=2;
              ;//sysj\fillerController.sysj line: 16, column: 4
              stop_1.setPresent();//sysj\fillerController.sysj line: 18, column: 5
              currsigs.addElement(stop_1);
              S1660=0;
              active[4]=0;
              ends[4]=0;
              tdone[4]=1;
            }
            else {
              S1646=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2809(int [] tdone, int [] ends){
        switch(S1644){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(stop_1.getprestatus()){//sysj\fillerController.sysj line: 11, column: 11
          S1644=0;
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

  public void thread2807(int [] tdone, int [] ends){
        S1660=1;
    __start_thread_4 = com.systemj.Timer.getMs();//sysj\fillerController.sysj line: 16, column: 4
    S1646=0;
    if(com.systemj.Timer.getMs() - __start_thread_4 >= 2000){//sysj\fillerController.sysj line: 16, column: 4
      ends[4]=2;
      ;//sysj\fillerController.sysj line: 16, column: 4
      stop_1.setPresent();//sysj\fillerController.sysj line: 18, column: 5
      currsigs.addElement(stop_1);
      S1660=0;
      active[4]=0;
      ends[4]=0;
      tdone[4]=1;
    }
    else {
      S1646=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread2806(int [] tdone, int [] ends){
        S1644=1;
    fill1.setPresent();//sysj\fillerController.sysj line: 12, column: 5
    currsigs.addElement(fill1);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread2805(int [] tdone, int [] ends){
        switch(S1780){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S1638){
          case 0 : 
            if(fill_1.getprestatus()){//sysj\fillerController.sysj line: 9, column: 10
              S1638=1;
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
              S1638=2;
              thread2806(tdone,ends);
              thread2807(tdone,ends);
              int biggest2808 = 0;
              if(ends[3]>=biggest2808){
                biggest2808=ends[3];
              }
              if(ends[4]>=biggest2808){
                biggest2808=ends[4];
              }
              if(biggest2808 == 1){
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
            thread2809(tdone,ends);
            thread2810(tdone,ends);
            int biggest2811 = 0;
            if(ends[3]>=biggest2811){
              biggest2811=ends[3];
            }
            if(ends[4]>=biggest2811){
              biggest2811=ends[4];
            }
            if(biggest2811 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest2811 == 0){
              S1638=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2803(int [] tdone, int [] ends){
        S2794=1;
    S2793=0;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread2802(int [] tdone, int [] ends){
        S2247=1;
    S2222=0;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread2801(int [] tdone, int [] ends){
        S2218=1;
    S2076=0;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread2800(int [] tdone, int [] ends){
        S2072=1;
    S1930=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread2799(int [] tdone, int [] ends){
        S1926=1;
    S1784=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread2798(int [] tdone, int [] ends){
        S1780=1;
    S1638=0;
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
      switch(S2796){
        case 0 : 
          S2796=0;
          break RUN;
        
        case 1 : 
          S2796=2;
          S2796=2;
          stop_1.setClear();//sysj\fillerController.sysj line: 6, column: 5
          fill_1.setClear();//sysj\fillerController.sysj line: 6, column: 5
          thread2798(tdone,ends);
          thread2799(tdone,ends);
          thread2800(tdone,ends);
          thread2801(tdone,ends);
          thread2802(tdone,ends);
          thread2803(tdone,ends);
          int biggest2804 = 0;
          if(ends[2]>=biggest2804){
            biggest2804=ends[2];
          }
          if(ends[5]>=biggest2804){
            biggest2804=ends[5];
          }
          if(ends[8]>=biggest2804){
            biggest2804=ends[8];
          }
          if(ends[11]>=biggest2804){
            biggest2804=ends[11];
          }
          if(ends[14]>=biggest2804){
            biggest2804=ends[14];
          }
          if(ends[15]>=biggest2804){
            biggest2804=ends[15];
          }
          if(biggest2804 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          stop_1.setClear();//sysj\fillerController.sysj line: 6, column: 5
          fill_1.setClear();//sysj\fillerController.sysj line: 6, column: 5
          thread2805(tdone,ends);
          thread2812(tdone,ends);
          thread2819(tdone,ends);
          thread2826(tdone,ends);
          thread2833(tdone,ends);
          thread2834(tdone,ends);
          int biggest2847 = 0;
          if(ends[2]>=biggest2847){
            biggest2847=ends[2];
          }
          if(ends[5]>=biggest2847){
            biggest2847=ends[5];
          }
          if(ends[8]>=biggest2847){
            biggest2847=ends[8];
          }
          if(ends[11]>=biggest2847){
            biggest2847=ends[11];
          }
          if(ends[14]>=biggest2847){
            biggest2847=ends[14];
          }
          if(ends[15]>=biggest2847){
            biggest2847=ends[15];
          }
          if(biggest2847 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2847 == 0){
            S2796=0;
            active[1]=0;
            ends[1]=0;
            S2796=0;
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
