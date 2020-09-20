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
  private int S2745 = 1;
  private int S2679 = 1;
  private int S2471 = 1;
  private int S2729 = 1;
  private int S2687 = 1;
  private int S2681 = 1;
  private int S2695 = 1;
  private int S2703 = 1;
  private int S2711 = 1;
  private int S2719 = 1;
  private int S2727 = 1;
  private int S2743 = 1;
  private int S2733 = 1;
  
  private int[] ends = new int[11];
  private int[] tdone = new int[11];
  
  public void thread2767(int [] tdone, int [] ends){
        switch(S2743){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S2733){
          case 0 : 
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 93, column: 10
              S2733=1;
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
              S2733=0;
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

  public void thread2765(int [] tdone, int [] ends){
        switch(S2727){
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

  public void thread2764(int [] tdone, int [] ends){
        switch(S2719){
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

  public void thread2763(int [] tdone, int [] ends){
        switch(S2711){
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

  public void thread2762(int [] tdone, int [] ends){
        switch(S2703){
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

  public void thread2761(int [] tdone, int [] ends){
        switch(S2695){
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

  public void thread2760(int [] tdone, int [] ends){
        switch(S2687){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S2681){
          case 0 : 
            S2681=0;
            if(bottlePos1.getprestatus()){//sysj\rotaryPlant.sysj line: 78, column: 28
              bottlePos1S.setPresent();//sysj\rotaryPlant.sysj line: 78, column: 41
              currsigs.addElement(bottlePos1S);
              S2681=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S2681=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S2681=1;
            S2681=0;
            if(bottlePos1.getprestatus()){//sysj\rotaryPlant.sysj line: 78, column: 28
              bottlePos1S.setPresent();//sysj\rotaryPlant.sysj line: 78, column: 41
              currsigs.addElement(bottlePos1S);
              S2681=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S2681=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2759(int [] tdone, int [] ends){
        switch(S2729){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread2760(tdone,ends);
        thread2761(tdone,ends);
        thread2762(tdone,ends);
        thread2763(tdone,ends);
        thread2764(tdone,ends);
        thread2765(tdone,ends);
        int biggest2766 = 0;
        if(ends[4]>=biggest2766){
          biggest2766=ends[4];
        }
        if(ends[5]>=biggest2766){
          biggest2766=ends[5];
        }
        if(ends[6]>=biggest2766){
          biggest2766=ends[6];
        }
        if(ends[7]>=biggest2766){
          biggest2766=ends[7];
        }
        if(ends[8]>=biggest2766){
          biggest2766=ends[8];
        }
        if(ends[9]>=biggest2766){
          biggest2766=ends[9];
        }
        if(biggest2766 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest2766 == 0){
          S2729=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread2758(int [] tdone, int [] ends){
        switch(S2679){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S2471){
          case 0 : 
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 15, column: 10
              S2471=1;
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
              S2471=2;
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
              S2471=3;
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
              S2471=4;
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
              S2471=5;
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
              S2471=6;
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
              S2471=7;
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
              S2471=8;
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
              S2471=9;
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
              S2471=10;
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
              S2471=11;
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
              S2471=12;
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
              S2471=13;
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
              S2471=14;
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
              S2471=15;
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
              S2471=16;
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
              S2471=17;
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
              S2471=18;
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
              S2471=19;
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
              S2471=0;
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

  public void thread2756(int [] tdone, int [] ends){
        S2743=1;
    S2733=0;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread2754(int [] tdone, int [] ends){
        S2727=1;
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

  public void thread2753(int [] tdone, int [] ends){
        S2719=1;
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

  public void thread2752(int [] tdone, int [] ends){
        S2711=1;
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

  public void thread2751(int [] tdone, int [] ends){
        S2703=1;
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

  public void thread2750(int [] tdone, int [] ends){
        S2695=1;
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

  public void thread2749(int [] tdone, int [] ends){
        S2687=1;
    S2681=0;
    if(bottlePos1.getprestatus()){//sysj\rotaryPlant.sysj line: 78, column: 28
      bottlePos1S.setPresent();//sysj\rotaryPlant.sysj line: 78, column: 41
      currsigs.addElement(bottlePos1S);
      S2681=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S2681=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread2748(int [] tdone, int [] ends){
        S2729=1;
    thread2749(tdone,ends);
    thread2750(tdone,ends);
    thread2751(tdone,ends);
    thread2752(tdone,ends);
    thread2753(tdone,ends);
    thread2754(tdone,ends);
    int biggest2755 = 0;
    if(ends[4]>=biggest2755){
      biggest2755=ends[4];
    }
    if(ends[5]>=biggest2755){
      biggest2755=ends[5];
    }
    if(ends[6]>=biggest2755){
      biggest2755=ends[6];
    }
    if(ends[7]>=biggest2755){
      biggest2755=ends[7];
    }
    if(ends[8]>=biggest2755){
      biggest2755=ends[8];
    }
    if(ends[9]>=biggest2755){
      biggest2755=ends[9];
    }
    if(biggest2755 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread2747(int [] tdone, int [] ends){
        S2679=1;
    S2471=0;
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
      switch(S2745){
        case 0 : 
          S2745=0;
          break RUN;
        
        case 1 : 
          S2745=2;
          S2745=2;
          thread2747(tdone,ends);
          thread2748(tdone,ends);
          thread2756(tdone,ends);
          int biggest2757 = 0;
          if(ends[2]>=biggest2757){
            biggest2757=ends[2];
          }
          if(ends[3]>=biggest2757){
            biggest2757=ends[3];
          }
          if(ends[10]>=biggest2757){
            biggest2757=ends[10];
          }
          if(biggest2757 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread2758(tdone,ends);
          thread2759(tdone,ends);
          thread2767(tdone,ends);
          int biggest2768 = 0;
          if(ends[2]>=biggest2768){
            biggest2768=ends[2];
          }
          if(ends[3]>=biggest2768){
            biggest2768=ends[3];
          }
          if(ends[10]>=biggest2768){
            biggest2768=ends[10];
          }
          if(biggest2768 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2768 == 0){
            S2745=0;
            active[1]=0;
            ends[1]=0;
            S2745=0;
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
