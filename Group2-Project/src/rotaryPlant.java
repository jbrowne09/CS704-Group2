import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class rotaryPlant extends ClockDomain{
  public rotaryPlant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal tick = new Signal("tick", Signal.INPUT);
  public Signal NRbottlePos1 = new Signal("NRbottlePos1", Signal.INPUT);
  public Signal NRmotor = new Signal("NRmotor", Signal.INPUT);
  public Signal rotate = new Signal("rotate", Signal.INPUT);
  public Signal bottlePos2 = new Signal("bottlePos2", Signal.OUTPUT);
  public Signal bottlePos3 = new Signal("bottlePos3", Signal.OUTPUT);
  public Signal bottlePos4 = new Signal("bottlePos4", Signal.OUTPUT);
  public Signal bottlePos5 = new Signal("bottlePos5", Signal.OUTPUT);
  public Signal aligned = new Signal("aligned", Signal.OUTPUT);
  public Signal bottlePos2S = new Signal("bottlePos2S", Signal.OUTPUT);
  public Signal bottlePos3S = new Signal("bottlePos3S", Signal.OUTPUT);
  public Signal bottlePos4S = new Signal("bottlePos4S", Signal.OUTPUT);
  public Signal bottlePos5S = new Signal("bottlePos5S", Signal.OUTPUT);
  public Signal rotateS = new Signal("rotateS", Signal.OUTPUT);
  private int S2541 = 1;
  private int S2274 = 1;
  private int S2268 = 1;
  private int S2318 = 1;
  private int S2278 = 1;
  private int S2362 = 1;
  private int S2322 = 1;
  private int S2406 = 1;
  private int S2366 = 1;
  private int S2450 = 1;
  private int S2410 = 1;
  private int S2497 = 1;
  private int S2457 = 1;
  private int S2539 = 1;
  private int S2505 = 1;
  private int S2513 = 1;
  private int S2521 = 1;
  private int S2529 = 1;
  private int S2537 = 1;
  
  private int[] ends = new int[14];
  private int[] tdone = new int[14];
  
  public void thread2568(int [] tdone, int [] ends){
        switch(S2537){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 101, column: 28
          rotateS.setPresent();//sysj\rotaryPlant.sysj line: 101, column: 37
          currsigs.addElement(rotateS);
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

  public void thread2567(int [] tdone, int [] ends){
        switch(S2529){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(bottlePos5.getprestatus()){//sysj\rotaryPlant.sysj line: 99, column: 28
          bottlePos5S.setPresent();//sysj\rotaryPlant.sysj line: 99, column: 41
          currsigs.addElement(bottlePos5S);
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        else {
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        break;
      
    }
  }

  public void thread2566(int [] tdone, int [] ends){
        switch(S2521){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(bottlePos4.getprestatus()){//sysj\rotaryPlant.sysj line: 97, column: 28
          bottlePos4S.setPresent();//sysj\rotaryPlant.sysj line: 97, column: 41
          currsigs.addElement(bottlePos4S);
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

  public void thread2565(int [] tdone, int [] ends){
        switch(S2513){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(bottlePos3.getprestatus()){//sysj\rotaryPlant.sysj line: 95, column: 28
          bottlePos3S.setPresent();//sysj\rotaryPlant.sysj line: 95, column: 41
          currsigs.addElement(bottlePos3S);
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

  public void thread2564(int [] tdone, int [] ends){
        switch(S2505){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 93, column: 28
          bottlePos2S.setPresent();//sysj\rotaryPlant.sysj line: 93, column: 41
          currsigs.addElement(bottlePos2S);
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

  public void thread2563(int [] tdone, int [] ends){
        switch(S2539){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        thread2564(tdone,ends);
        thread2565(tdone,ends);
        thread2566(tdone,ends);
        thread2567(tdone,ends);
        thread2568(tdone,ends);
        int biggest2569 = 0;
        if(ends[9]>=biggest2569){
          biggest2569=ends[9];
        }
        if(ends[10]>=biggest2569){
          biggest2569=ends[10];
        }
        if(ends[11]>=biggest2569){
          biggest2569=ends[11];
        }
        if(ends[12]>=biggest2569){
          biggest2569=ends[12];
        }
        if(ends[13]>=biggest2569){
          biggest2569=ends[13];
        }
        if(biggest2569 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        //FINXME code
        if(biggest2569 == 0){
          S2539=0;
          active[8]=0;
          ends[8]=0;
          tdone[8]=1;
        }
        break;
      
    }
  }

  public void thread2562(int [] tdone, int [] ends){
        switch(S2497){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S2457){
          case 0 : 
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 76, column: 10
              S2457=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 77, column: 5
              currsigs.addElement(aligned);
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            if(tick.getprestatus() && rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 80, column: 10
              S2457=2;
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 85, column: 5
              currsigs.addElement(aligned);
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
            if(!rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 84, column: 10
              S2457=0;
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 77, column: 5
              currsigs.addElement(aligned);
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 85, column: 5
              currsigs.addElement(aligned);
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2561(int [] tdone, int [] ends){
        switch(S2450){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S2410){
          case 0 : 
            if(bottlePos4.getprestatus()){//sysj\rotaryPlant.sysj line: 64, column: 10
              S2410=1;
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
          
          case 1 : 
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 65, column: 10
              S2410=2;
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
          
          case 2 : 
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 67, column: 10
              S2410=3;
              bottlePos5.setPresent();//sysj\rotaryPlant.sysj line: 69, column: 5
              currsigs.addElement(bottlePos5);
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
          
          case 3 : 
            if(NRmotor.getprestatus()){//sysj\rotaryPlant.sysj line: 68, column: 10
              S2410=0;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              bottlePos5.setPresent();//sysj\rotaryPlant.sysj line: 69, column: 5
              currsigs.addElement(bottlePos5);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2560(int [] tdone, int [] ends){
        switch(S2406){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S2366){
          case 0 : 
            if(bottlePos3.getprestatus()){//sysj\rotaryPlant.sysj line: 52, column: 10
              S2366=1;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 53, column: 10
              S2366=2;
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
          
          case 2 : 
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 55, column: 10
              S2366=3;
              bottlePos4.setPresent();//sysj\rotaryPlant.sysj line: 57, column: 5
              currsigs.addElement(bottlePos4);
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
          
          case 3 : 
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 56, column: 10
              S2366=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              bottlePos4.setPresent();//sysj\rotaryPlant.sysj line: 57, column: 5
              currsigs.addElement(bottlePos4);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2559(int [] tdone, int [] ends){
        switch(S2362){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S2322){
          case 0 : 
            if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 40, column: 10
              S2322=1;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 41, column: 10
              S2322=2;
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
          
          case 2 : 
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 43, column: 10
              S2322=3;
              bottlePos3.setPresent();//sysj\rotaryPlant.sysj line: 45, column: 5
              currsigs.addElement(bottlePos3);
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
          
          case 3 : 
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 44, column: 10
              S2322=0;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              bottlePos3.setPresent();//sysj\rotaryPlant.sysj line: 45, column: 5
              currsigs.addElement(bottlePos3);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2558(int [] tdone, int [] ends){
        switch(S2318){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S2278){
          case 0 : 
            if(NRbottlePos1.getprestatus()){//sysj\rotaryPlant.sysj line: 28, column: 10
              S2278=1;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 29, column: 10
              S2278=2;
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
          
          case 2 : 
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 31, column: 10
              S2278=3;
              bottlePos2.setPresent();//sysj\rotaryPlant.sysj line: 33, column: 5
              currsigs.addElement(bottlePos2);
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
          
          case 3 : 
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 32, column: 10
              S2278=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              bottlePos2.setPresent();//sysj\rotaryPlant.sysj line: 33, column: 5
              currsigs.addElement(bottlePos2);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2557(int [] tdone, int [] ends){
        switch(S2274){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S2268){
          case 0 : 
            S2268=0;
            if(NRbottlePos1.getprestatus()){//sysj\rotaryPlant.sysj line: 19, column: 12
              System.out.println("POS 1111111");//sysj\rotaryPlant.sysj line: 19, column: 27
              S2268=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S2268=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            S2268=1;
            S2268=0;
            if(NRbottlePos1.getprestatus()){//sysj\rotaryPlant.sysj line: 19, column: 12
              System.out.println("POS 1111111");//sysj\rotaryPlant.sysj line: 19, column: 27
              S2268=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S2268=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2554(int [] tdone, int [] ends){
        S2537=1;
    if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 101, column: 28
      rotateS.setPresent();//sysj\rotaryPlant.sysj line: 101, column: 37
      currsigs.addElement(rotateS);
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

  public void thread2553(int [] tdone, int [] ends){
        S2529=1;
    if(bottlePos5.getprestatus()){//sysj\rotaryPlant.sysj line: 99, column: 28
      bottlePos5S.setPresent();//sysj\rotaryPlant.sysj line: 99, column: 41
      currsigs.addElement(bottlePos5S);
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread2552(int [] tdone, int [] ends){
        S2521=1;
    if(bottlePos4.getprestatus()){//sysj\rotaryPlant.sysj line: 97, column: 28
      bottlePos4S.setPresent();//sysj\rotaryPlant.sysj line: 97, column: 41
      currsigs.addElement(bottlePos4S);
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

  public void thread2551(int [] tdone, int [] ends){
        S2513=1;
    if(bottlePos3.getprestatus()){//sysj\rotaryPlant.sysj line: 95, column: 28
      bottlePos3S.setPresent();//sysj\rotaryPlant.sysj line: 95, column: 41
      currsigs.addElement(bottlePos3S);
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

  public void thread2550(int [] tdone, int [] ends){
        S2505=1;
    if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 93, column: 28
      bottlePos2S.setPresent();//sysj\rotaryPlant.sysj line: 93, column: 41
      currsigs.addElement(bottlePos2S);
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

  public void thread2549(int [] tdone, int [] ends){
        S2539=1;
    thread2550(tdone,ends);
    thread2551(tdone,ends);
    thread2552(tdone,ends);
    thread2553(tdone,ends);
    thread2554(tdone,ends);
    int biggest2555 = 0;
    if(ends[9]>=biggest2555){
      biggest2555=ends[9];
    }
    if(ends[10]>=biggest2555){
      biggest2555=ends[10];
    }
    if(ends[11]>=biggest2555){
      biggest2555=ends[11];
    }
    if(ends[12]>=biggest2555){
      biggest2555=ends[12];
    }
    if(ends[13]>=biggest2555){
      biggest2555=ends[13];
    }
    if(biggest2555 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread2548(int [] tdone, int [] ends){
        S2497=1;
    S2457=0;
    aligned.setPresent();//sysj\rotaryPlant.sysj line: 77, column: 5
    currsigs.addElement(aligned);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread2547(int [] tdone, int [] ends){
        S2450=1;
    S2410=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread2546(int [] tdone, int [] ends){
        S2406=1;
    S2366=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread2545(int [] tdone, int [] ends){
        S2362=1;
    S2322=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread2544(int [] tdone, int [] ends){
        S2318=1;
    S2278=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread2543(int [] tdone, int [] ends){
        S2274=1;
    S2268=0;
    if(NRbottlePos1.getprestatus()){//sysj\rotaryPlant.sysj line: 19, column: 12
      System.out.println("POS 1111111");//sysj\rotaryPlant.sysj line: 19, column: 27
      S2268=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      S2268=1;
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
      switch(S2541){
        case 0 : 
          S2541=0;
          break RUN;
        
        case 1 : 
          S2541=2;
          S2541=2;
          thread2543(tdone,ends);
          thread2544(tdone,ends);
          thread2545(tdone,ends);
          thread2546(tdone,ends);
          thread2547(tdone,ends);
          thread2548(tdone,ends);
          thread2549(tdone,ends);
          int biggest2556 = 0;
          if(ends[2]>=biggest2556){
            biggest2556=ends[2];
          }
          if(ends[3]>=biggest2556){
            biggest2556=ends[3];
          }
          if(ends[4]>=biggest2556){
            biggest2556=ends[4];
          }
          if(ends[5]>=biggest2556){
            biggest2556=ends[5];
          }
          if(ends[6]>=biggest2556){
            biggest2556=ends[6];
          }
          if(ends[7]>=biggest2556){
            biggest2556=ends[7];
          }
          if(ends[8]>=biggest2556){
            biggest2556=ends[8];
          }
          if(biggest2556 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread2557(tdone,ends);
          thread2558(tdone,ends);
          thread2559(tdone,ends);
          thread2560(tdone,ends);
          thread2561(tdone,ends);
          thread2562(tdone,ends);
          thread2563(tdone,ends);
          int biggest2570 = 0;
          if(ends[2]>=biggest2570){
            biggest2570=ends[2];
          }
          if(ends[3]>=biggest2570){
            biggest2570=ends[3];
          }
          if(ends[4]>=biggest2570){
            biggest2570=ends[4];
          }
          if(ends[5]>=biggest2570){
            biggest2570=ends[5];
          }
          if(ends[6]>=biggest2570){
            biggest2570=ends[6];
          }
          if(ends[7]>=biggest2570){
            biggest2570=ends[7];
          }
          if(ends[8]>=biggest2570){
            biggest2570=ends[8];
          }
          if(biggest2570 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2570 == 0){
            S2541=0;
            active[1]=0;
            ends[1]=0;
            S2541=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          tick.gethook();
          NRbottlePos1.gethook();
          NRmotor.gethook();
          rotate.gethook();
          df = true;
        }
        runClockDomain();
      }
      tick.setpreclear();
      NRbottlePos1.setpreclear();
      NRmotor.setpreclear();
      rotate.setpreclear();
      bottlePos2.setpreclear();
      bottlePos3.setpreclear();
      bottlePos4.setpreclear();
      bottlePos5.setpreclear();
      aligned.setpreclear();
      bottlePos2S.setpreclear();
      bottlePos3S.setpreclear();
      bottlePos4S.setpreclear();
      bottlePos5S.setpreclear();
      rotateS.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = tick.getStatus() ? tick.setprepresent() : tick.setpreclear();
      tick.setpreval(tick.getValue());
      tick.setClear();
      dummyint = NRbottlePos1.getStatus() ? NRbottlePos1.setprepresent() : NRbottlePos1.setpreclear();
      NRbottlePos1.setpreval(NRbottlePos1.getValue());
      NRbottlePos1.setClear();
      dummyint = NRmotor.getStatus() ? NRmotor.setprepresent() : NRmotor.setpreclear();
      NRmotor.setpreval(NRmotor.getValue());
      NRmotor.setClear();
      dummyint = rotate.getStatus() ? rotate.setprepresent() : rotate.setpreclear();
      rotate.setpreval(rotate.getValue());
      rotate.setClear();
      bottlePos2.sethook();
      bottlePos2.setClear();
      bottlePos3.sethook();
      bottlePos3.setClear();
      bottlePos4.sethook();
      bottlePos4.setClear();
      bottlePos5.sethook();
      bottlePos5.setClear();
      aligned.sethook();
      aligned.setClear();
      bottlePos2S.sethook();
      bottlePos2S.setClear();
      bottlePos3S.sethook();
      bottlePos3S.setClear();
      bottlePos4S.sethook();
      bottlePos4S.setClear();
      bottlePos5S.sethook();
      bottlePos5S.setClear();
      rotateS.sethook();
      rotateS.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        tick.gethook();
        NRbottlePos1.gethook();
        NRmotor.gethook();
        rotate.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
