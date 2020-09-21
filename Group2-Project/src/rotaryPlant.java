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
  private int S2634 = 1;
  private int S2411 = 1;
  private int S2377 = 1;
  private int S2455 = 1;
  private int S2415 = 1;
  private int S2499 = 1;
  private int S2459 = 1;
  private int S2543 = 1;
  private int S2503 = 1;
  private int S2590 = 1;
  private int S2550 = 1;
  private int S2632 = 1;
  private int S2598 = 1;
  private int S2592 = 1;
  private int S2606 = 1;
  private int S2614 = 1;
  private int S2622 = 1;
  private int S2630 = 1;
  
  private int[] ends = new int[13];
  private int[] tdone = new int[13];
  
  public void thread2659(int [] tdone, int [] ends){
        switch(S2630){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 93, column: 28
          rotateS.setPresent();//sysj\rotaryPlant.sysj line: 93, column: 37
          currsigs.addElement(rotateS);
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

  public void thread2658(int [] tdone, int [] ends){
        switch(S2622){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(bottlePos5.getprestatus()){//sysj\rotaryPlant.sysj line: 91, column: 28
          bottlePos5S.setPresent();//sysj\rotaryPlant.sysj line: 91, column: 41
          currsigs.addElement(bottlePos5S);
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

  public void thread2657(int [] tdone, int [] ends){
        switch(S2614){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(bottlePos4.getprestatus()){//sysj\rotaryPlant.sysj line: 89, column: 28
          bottlePos4S.setPresent();//sysj\rotaryPlant.sysj line: 89, column: 41
          currsigs.addElement(bottlePos4S);
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

  public void thread2656(int [] tdone, int [] ends){
        switch(S2606){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(bottlePos3.getprestatus()){//sysj\rotaryPlant.sysj line: 87, column: 28
          bottlePos3S.setPresent();//sysj\rotaryPlant.sysj line: 87, column: 41
          currsigs.addElement(bottlePos3S);
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

  public void thread2655(int [] tdone, int [] ends){
        switch(S2598){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S2592){
          case 0 : 
            S2592=0;
            if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 85, column: 28
              bottlePos2S.setPresent();//sysj\rotaryPlant.sysj line: 85, column: 41
              currsigs.addElement(bottlePos2S);
              S2592=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              S2592=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 1 : 
            S2592=1;
            S2592=0;
            if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 85, column: 28
              bottlePos2S.setPresent();//sysj\rotaryPlant.sysj line: 85, column: 41
              currsigs.addElement(bottlePos2S);
              S2592=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              S2592=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2654(int [] tdone, int [] ends){
        switch(S2632){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        thread2655(tdone,ends);
        thread2656(tdone,ends);
        thread2657(tdone,ends);
        thread2658(tdone,ends);
        thread2659(tdone,ends);
        int biggest2660 = 0;
        if(ends[8]>=biggest2660){
          biggest2660=ends[8];
        }
        if(ends[9]>=biggest2660){
          biggest2660=ends[9];
        }
        if(ends[10]>=biggest2660){
          biggest2660=ends[10];
        }
        if(ends[11]>=biggest2660){
          biggest2660=ends[11];
        }
        if(ends[12]>=biggest2660){
          biggest2660=ends[12];
        }
        if(biggest2660 == 1){
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        //FINXME code
        if(biggest2660 == 0){
          S2632=0;
          active[7]=0;
          ends[7]=0;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread2653(int [] tdone, int [] ends){
        switch(S2590){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S2550){
          case 0 : 
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 68, column: 10
              S2550=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 69, column: 5
              currsigs.addElement(aligned);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 1 : 
            if(tick.getprestatus() && rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 72, column: 10
              S2550=2;
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 77, column: 5
              currsigs.addElement(aligned);
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
            if(!rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 76, column: 10
              S2550=0;
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 69, column: 5
              currsigs.addElement(aligned);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 77, column: 5
              currsigs.addElement(aligned);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2652(int [] tdone, int [] ends){
        switch(S2543){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S2503){
          case 0 : 
            if(bottlePos4.getprestatus()){//sysj\rotaryPlant.sysj line: 56, column: 10
              S2503=1;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 57, column: 10
              S2503=2;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 59, column: 10
              S2503=3;
              bottlePos5.setPresent();//sysj\rotaryPlant.sysj line: 61, column: 5
              currsigs.addElement(bottlePos5);
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
            if(NRmotor.getprestatus()){//sysj\rotaryPlant.sysj line: 60, column: 10
              S2503=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              bottlePos5.setPresent();//sysj\rotaryPlant.sysj line: 61, column: 5
              currsigs.addElement(bottlePos5);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2651(int [] tdone, int [] ends){
        switch(S2499){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S2459){
          case 0 : 
            if(bottlePos3.getprestatus()){//sysj\rotaryPlant.sysj line: 44, column: 10
              S2459=1;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 45, column: 10
              S2459=2;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 47, column: 10
              S2459=3;
              bottlePos4.setPresent();//sysj\rotaryPlant.sysj line: 49, column: 5
              currsigs.addElement(bottlePos4);
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
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 48, column: 10
              S2459=0;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              bottlePos4.setPresent();//sysj\rotaryPlant.sysj line: 49, column: 5
              currsigs.addElement(bottlePos4);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2650(int [] tdone, int [] ends){
        switch(S2455){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S2415){
          case 0 : 
            if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 32, column: 10
              S2415=1;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 33, column: 10
              S2415=2;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 35, column: 10
              S2415=3;
              bottlePos3.setPresent();//sysj\rotaryPlant.sysj line: 37, column: 5
              currsigs.addElement(bottlePos3);
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
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 36, column: 10
              S2415=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              bottlePos3.setPresent();//sysj\rotaryPlant.sysj line: 37, column: 5
              currsigs.addElement(bottlePos3);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2649(int [] tdone, int [] ends){
        switch(S2411){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S2377){
          case 0 : 
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 21, column: 10
              S2377=1;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 23, column: 10
              S2377=2;
              bottlePos2.setPresent();//sysj\rotaryPlant.sysj line: 25, column: 5
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
          
          case 2 : 
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 24, column: 10
              S2377=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              bottlePos2.setPresent();//sysj\rotaryPlant.sysj line: 25, column: 5
              currsigs.addElement(bottlePos2);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2646(int [] tdone, int [] ends){
        S2630=1;
    if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 93, column: 28
      rotateS.setPresent();//sysj\rotaryPlant.sysj line: 93, column: 37
      currsigs.addElement(rotateS);
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

  public void thread2645(int [] tdone, int [] ends){
        S2622=1;
    if(bottlePos5.getprestatus()){//sysj\rotaryPlant.sysj line: 91, column: 28
      bottlePos5S.setPresent();//sysj\rotaryPlant.sysj line: 91, column: 41
      currsigs.addElement(bottlePos5S);
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

  public void thread2644(int [] tdone, int [] ends){
        S2614=1;
    if(bottlePos4.getprestatus()){//sysj\rotaryPlant.sysj line: 89, column: 28
      bottlePos4S.setPresent();//sysj\rotaryPlant.sysj line: 89, column: 41
      currsigs.addElement(bottlePos4S);
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

  public void thread2643(int [] tdone, int [] ends){
        S2606=1;
    if(bottlePos3.getprestatus()){//sysj\rotaryPlant.sysj line: 87, column: 28
      bottlePos3S.setPresent();//sysj\rotaryPlant.sysj line: 87, column: 41
      currsigs.addElement(bottlePos3S);
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
        S2598=1;
    S2592=0;
    if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 85, column: 28
      bottlePos2S.setPresent();//sysj\rotaryPlant.sysj line: 85, column: 41
      currsigs.addElement(bottlePos2S);
      S2592=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      S2592=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread2641(int [] tdone, int [] ends){
        S2632=1;
    thread2642(tdone,ends);
    thread2643(tdone,ends);
    thread2644(tdone,ends);
    thread2645(tdone,ends);
    thread2646(tdone,ends);
    int biggest2647 = 0;
    if(ends[8]>=biggest2647){
      biggest2647=ends[8];
    }
    if(ends[9]>=biggest2647){
      biggest2647=ends[9];
    }
    if(ends[10]>=biggest2647){
      biggest2647=ends[10];
    }
    if(ends[11]>=biggest2647){
      biggest2647=ends[11];
    }
    if(ends[12]>=biggest2647){
      biggest2647=ends[12];
    }
    if(biggest2647 == 1){
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread2640(int [] tdone, int [] ends){
        S2590=1;
    S2550=0;
    aligned.setPresent();//sysj\rotaryPlant.sysj line: 69, column: 5
    currsigs.addElement(aligned);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread2639(int [] tdone, int [] ends){
        S2543=1;
    S2503=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread2638(int [] tdone, int [] ends){
        S2499=1;
    S2459=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread2637(int [] tdone, int [] ends){
        S2455=1;
    S2415=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread2636(int [] tdone, int [] ends){
        S2411=1;
    S2377=0;
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
          thread2638(tdone,ends);
          thread2639(tdone,ends);
          thread2640(tdone,ends);
          thread2641(tdone,ends);
          int biggest2648 = 0;
          if(ends[2]>=biggest2648){
            biggest2648=ends[2];
          }
          if(ends[3]>=biggest2648){
            biggest2648=ends[3];
          }
          if(ends[4]>=biggest2648){
            biggest2648=ends[4];
          }
          if(ends[5]>=biggest2648){
            biggest2648=ends[5];
          }
          if(ends[6]>=biggest2648){
            biggest2648=ends[6];
          }
          if(ends[7]>=biggest2648){
            biggest2648=ends[7];
          }
          if(biggest2648 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread2649(tdone,ends);
          thread2650(tdone,ends);
          thread2651(tdone,ends);
          thread2652(tdone,ends);
          thread2653(tdone,ends);
          thread2654(tdone,ends);
          int biggest2661 = 0;
          if(ends[2]>=biggest2661){
            biggest2661=ends[2];
          }
          if(ends[3]>=biggest2661){
            biggest2661=ends[3];
          }
          if(ends[4]>=biggest2661){
            biggest2661=ends[4];
          }
          if(ends[5]>=biggest2661){
            biggest2661=ends[5];
          }
          if(ends[6]>=biggest2661){
            biggest2661=ends[6];
          }
          if(ends[7]>=biggest2661){
            biggest2661=ends[7];
          }
          if(biggest2661 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2661 == 0){
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
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
