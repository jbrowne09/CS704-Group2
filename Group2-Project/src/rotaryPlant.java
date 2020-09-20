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
  public Signal rotate = new Signal("rotate", Signal.INPUT);
  public Signal tick = new Signal("tick", Signal.INPUT);
  public Signal bottlePos1 = new Signal("bottlePos1", Signal.OUTPUT);
  public Signal bottlePos2 = new Signal("bottlePos2", Signal.OUTPUT);
  public Signal bottlePos3 = new Signal("bottlePos3", Signal.OUTPUT);
  public Signal bottlePos4 = new Signal("bottlePos4", Signal.OUTPUT);
  public Signal bottlePos5 = new Signal("bottlePos5", Signal.OUTPUT);
  public Signal aligned = new Signal("aligned", Signal.OUTPUT);
  public Signal bottlePos1S = new Signal("bottlePos1S", Signal.OUTPUT);
  public Signal bottlePos2S = new Signal("bottlePos2S", Signal.OUTPUT);
  public Signal bottlePos3S = new Signal("bottlePos3S", Signal.OUTPUT);
  public Signal bottlePos4S = new Signal("bottlePos4S", Signal.OUTPUT);
  public Signal bottlePos5S = new Signal("bottlePos5S", Signal.OUTPUT);
  public Signal rotateS = new Signal("rotateS", Signal.OUTPUT);
  private int S2634 = 1;
  private int S2568 = 1;
  private int S2360 = 1;
  private int S2618 = 1;
  private int S2576 = 1;
  private int S2570 = 1;
  private int S2584 = 1;
  private int S2592 = 1;
  private int S2600 = 1;
  private int S2608 = 1;
  private int S2616 = 1;
  private int S2632 = 1;
  private int S2622 = 1;
  
  private int[] ends = new int[11];
  private int[] tdone = new int[11];
  
  public void thread2656(int [] tdone, int [] ends){
        switch(S2632){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S2622){
          case 0 : 
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 93, column: 10
              S2622=1;
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
          
          case 1 : 
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 95, column: 10
              S2622=0;
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
        break;
      
    }
  }

  public void thread2654(int [] tdone, int [] ends){
        switch(S2616){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 88, column: 28
          rotateS.setPresent();//sysj\rotaryPlant.sysj line: 88, column: 37
          currsigs.addElement(rotateS);
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

  public void thread2653(int [] tdone, int [] ends){
        switch(S2608){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(bottlePos5.getprestatus()){//sysj\rotaryPlant.sysj line: 86, column: 28
          bottlePos5S.setPresent();//sysj\rotaryPlant.sysj line: 86, column: 41
          currsigs.addElement(bottlePos5S);
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

  public void thread2652(int [] tdone, int [] ends){
        switch(S2600){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(bottlePos4.getprestatus()){//sysj\rotaryPlant.sysj line: 84, column: 28
          bottlePos4S.setPresent();//sysj\rotaryPlant.sysj line: 84, column: 41
          currsigs.addElement(bottlePos4S);
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

  public void thread2651(int [] tdone, int [] ends){
        switch(S2592){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(bottlePos3.getprestatus()){//sysj\rotaryPlant.sysj line: 82, column: 28
          bottlePos3S.setPresent();//sysj\rotaryPlant.sysj line: 82, column: 41
          currsigs.addElement(bottlePos3S);
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

  public void thread2650(int [] tdone, int [] ends){
        switch(S2584){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 80, column: 28
          bottlePos2S.setPresent();//sysj\rotaryPlant.sysj line: 80, column: 41
          currsigs.addElement(bottlePos2S);
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
  }

  public void thread2649(int [] tdone, int [] ends){
        switch(S2576){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S2570){
          case 0 : 
            S2570=0;
            if(bottlePos1.getprestatus()){//sysj\rotaryPlant.sysj line: 78, column: 28
              bottlePos1S.setPresent();//sysj\rotaryPlant.sysj line: 78, column: 41
              currsigs.addElement(bottlePos1S);
              S2570=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S2570=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S2570=1;
            S2570=0;
            if(bottlePos1.getprestatus()){//sysj\rotaryPlant.sysj line: 78, column: 28
              bottlePos1S.setPresent();//sysj\rotaryPlant.sysj line: 78, column: 41
              currsigs.addElement(bottlePos1S);
              S2570=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S2570=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2648(int [] tdone, int [] ends){
        switch(S2618){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread2649(tdone,ends);
        thread2650(tdone,ends);
        thread2651(tdone,ends);
        thread2652(tdone,ends);
        thread2653(tdone,ends);
        thread2654(tdone,ends);
        int biggest2655 = 0;
        if(ends[4]>=biggest2655){
          biggest2655=ends[4];
        }
        if(ends[5]>=biggest2655){
          biggest2655=ends[5];
        }
        if(ends[6]>=biggest2655){
          biggest2655=ends[6];
        }
        if(ends[7]>=biggest2655){
          biggest2655=ends[7];
        }
        if(ends[8]>=biggest2655){
          biggest2655=ends[8];
        }
        if(ends[9]>=biggest2655){
          biggest2655=ends[9];
        }
        if(biggest2655 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest2655 == 0){
          S2618=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread2647(int [] tdone, int [] ends){
        switch(S2568){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S2360){
          case 0 : 
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 15, column: 10
              S2360=1;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 16, column: 10
              S2360=2;
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
          
          case 2 : 
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 18, column: 10
              S2360=3;
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 21, column: 6
              currsigs.addElement(aligned);
              bottlePos1.setPresent();//sysj\rotaryPlant.sysj line: 22, column: 6
              currsigs.addElement(bottlePos1);
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
          
          case 3 : 
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 19, column: 10
              S2360=4;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 21, column: 6
              currsigs.addElement(aligned);
              bottlePos1.setPresent();//sysj\rotaryPlant.sysj line: 22, column: 6
              currsigs.addElement(bottlePos1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 4 : 
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 27, column: 10
              S2360=5;
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
          
          case 5 : 
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 28, column: 10
              S2360=6;
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
          
          case 6 : 
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 30, column: 10
              S2360=7;
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 33, column: 6
              currsigs.addElement(aligned);
              bottlePos2.setPresent();//sysj\rotaryPlant.sysj line: 34, column: 6
              currsigs.addElement(bottlePos2);
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
          
          case 7 : 
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 31, column: 10
              S2360=8;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 33, column: 6
              currsigs.addElement(aligned);
              bottlePos2.setPresent();//sysj\rotaryPlant.sysj line: 34, column: 6
              currsigs.addElement(bottlePos2);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 8 : 
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 39, column: 10
              S2360=9;
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
          
          case 9 : 
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 40, column: 10
              S2360=10;
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
          
          case 10 : 
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 42, column: 10
              S2360=11;
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 45, column: 6
              currsigs.addElement(aligned);
              bottlePos3.setPresent();//sysj\rotaryPlant.sysj line: 46, column: 6
              currsigs.addElement(bottlePos3);
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
          
          case 11 : 
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 43, column: 10
              S2360=12;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 45, column: 6
              currsigs.addElement(aligned);
              bottlePos3.setPresent();//sysj\rotaryPlant.sysj line: 46, column: 6
              currsigs.addElement(bottlePos3);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 12 : 
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 51, column: 10
              S2360=13;
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
          
          case 13 : 
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 52, column: 10
              S2360=14;
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
          
          case 14 : 
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 54, column: 10
              S2360=15;
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 57, column: 6
              currsigs.addElement(aligned);
              bottlePos4.setPresent();//sysj\rotaryPlant.sysj line: 58, column: 6
              currsigs.addElement(bottlePos4);
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
          
          case 15 : 
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 55, column: 10
              S2360=16;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 57, column: 6
              currsigs.addElement(aligned);
              bottlePos4.setPresent();//sysj\rotaryPlant.sysj line: 58, column: 6
              currsigs.addElement(bottlePos4);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 16 : 
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 63, column: 10
              S2360=17;
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
          
          case 17 : 
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 64, column: 10
              S2360=18;
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
          
          case 18 : 
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 66, column: 10
              S2360=19;
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 69, column: 6
              currsigs.addElement(aligned);
              bottlePos5.setPresent();//sysj\rotaryPlant.sysj line: 70, column: 6
              currsigs.addElement(bottlePos5);
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
          
          case 19 : 
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 67, column: 10
              S2360=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 69, column: 6
              currsigs.addElement(aligned);
              bottlePos5.setPresent();//sysj\rotaryPlant.sysj line: 70, column: 6
              currsigs.addElement(bottlePos5);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2645(int [] tdone, int [] ends){
        S2632=1;
    S2622=0;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread2643(int [] tdone, int [] ends){
        S2616=1;
    if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 88, column: 28
      rotateS.setPresent();//sysj\rotaryPlant.sysj line: 88, column: 37
      currsigs.addElement(rotateS);
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

  public void thread2642(int [] tdone, int [] ends){
        S2608=1;
    if(bottlePos5.getprestatus()){//sysj\rotaryPlant.sysj line: 86, column: 28
      bottlePos5S.setPresent();//sysj\rotaryPlant.sysj line: 86, column: 41
      currsigs.addElement(bottlePos5S);
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

  public void thread2641(int [] tdone, int [] ends){
        S2600=1;
    if(bottlePos4.getprestatus()){//sysj\rotaryPlant.sysj line: 84, column: 28
      bottlePos4S.setPresent();//sysj\rotaryPlant.sysj line: 84, column: 41
      currsigs.addElement(bottlePos4S);
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

  public void thread2640(int [] tdone, int [] ends){
        S2592=1;
    if(bottlePos3.getprestatus()){//sysj\rotaryPlant.sysj line: 82, column: 28
      bottlePos3S.setPresent();//sysj\rotaryPlant.sysj line: 82, column: 41
      currsigs.addElement(bottlePos3S);
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

  public void thread2639(int [] tdone, int [] ends){
        S2584=1;
    if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 80, column: 28
      bottlePos2S.setPresent();//sysj\rotaryPlant.sysj line: 80, column: 41
      currsigs.addElement(bottlePos2S);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread2638(int [] tdone, int [] ends){
        S2576=1;
    S2570=0;
    if(bottlePos1.getprestatus()){//sysj\rotaryPlant.sysj line: 78, column: 28
      bottlePos1S.setPresent();//sysj\rotaryPlant.sysj line: 78, column: 41
      currsigs.addElement(bottlePos1S);
      S2570=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S2570=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread2637(int [] tdone, int [] ends){
        S2618=1;
    thread2638(tdone,ends);
    thread2639(tdone,ends);
    thread2640(tdone,ends);
    thread2641(tdone,ends);
    thread2642(tdone,ends);
    thread2643(tdone,ends);
    int biggest2644 = 0;
    if(ends[4]>=biggest2644){
      biggest2644=ends[4];
    }
    if(ends[5]>=biggest2644){
      biggest2644=ends[5];
    }
    if(ends[6]>=biggest2644){
      biggest2644=ends[6];
    }
    if(ends[7]>=biggest2644){
      biggest2644=ends[7];
    }
    if(ends[8]>=biggest2644){
      biggest2644=ends[8];
    }
    if(ends[9]>=biggest2644){
      biggest2644=ends[9];
    }
    if(biggest2644 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread2636(int [] tdone, int [] ends){
        S2568=1;
    S2360=0;
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
      switch(S2634){
        case 0 : 
          S2634=0;
          break RUN;
        
        case 1 : 
          S2634=2;
          S2634=2;
          thread2636(tdone,ends);
          thread2637(tdone,ends);
          thread2645(tdone,ends);
          int biggest2646 = 0;
          if(ends[2]>=biggest2646){
            biggest2646=ends[2];
          }
          if(ends[3]>=biggest2646){
            biggest2646=ends[3];
          }
          if(ends[10]>=biggest2646){
            biggest2646=ends[10];
          }
          if(biggest2646 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread2647(tdone,ends);
          thread2648(tdone,ends);
          thread2656(tdone,ends);
          int biggest2657 = 0;
          if(ends[2]>=biggest2657){
            biggest2657=ends[2];
          }
          if(ends[3]>=biggest2657){
            biggest2657=ends[3];
          }
          if(ends[10]>=biggest2657){
            biggest2657=ends[10];
          }
          if(biggest2657 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2657 == 0){
            S2634=0;
            active[1]=0;
            ends[1]=0;
            S2634=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          rotate.gethook();
          tick.gethook();
          df = true;
        }
        runClockDomain();
      }
      rotate.setpreclear();
      tick.setpreclear();
      bottlePos1.setpreclear();
      bottlePos2.setpreclear();
      bottlePos3.setpreclear();
      bottlePos4.setpreclear();
      bottlePos5.setpreclear();
      aligned.setpreclear();
      bottlePos1S.setpreclear();
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
      dummyint = rotate.getStatus() ? rotate.setprepresent() : rotate.setpreclear();
      rotate.setpreval(rotate.getValue());
      rotate.setClear();
      dummyint = tick.getStatus() ? tick.setprepresent() : tick.setpreclear();
      tick.setpreval(tick.getValue());
      tick.setClear();
      bottlePos1.sethook();
      bottlePos1.setClear();
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
      bottlePos1S.sethook();
      bottlePos1S.setClear();
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
        rotate.gethook();
        tick.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
