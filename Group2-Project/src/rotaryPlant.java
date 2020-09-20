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
  private int S2707 = 1;
  private int S2432 = 1;
  private int S2380 = 1;
  private int S2476 = 1;
  private int S2436 = 1;
  private int S2520 = 1;
  private int S2480 = 1;
  private int S2564 = 1;
  private int S2524 = 1;
  private int S2608 = 1;
  private int S2568 = 1;
  private int S2655 = 1;
  private int S2615 = 1;
  private int S2705 = 1;
  private int S2663 = 1;
  private int S2657 = 1;
  private int S2671 = 1;
  private int S2679 = 1;
  private int S2687 = 1;
  private int S2695 = 1;
  private int S2703 = 1;
  
  private int[] ends = new int[15];
  private int[] tdone = new int[15];
  
  public void thread2736(int [] tdone, int [] ends){
        switch(S2703){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 110, column: 28
          rotateS.setPresent();//sysj\rotaryPlant.sysj line: 110, column: 37
          currsigs.addElement(rotateS);
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

  public void thread2735(int [] tdone, int [] ends){
        switch(S2695){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(bottlePos5.getprestatus()){//sysj\rotaryPlant.sysj line: 108, column: 28
          bottlePos5S.setPresent();//sysj\rotaryPlant.sysj line: 108, column: 41
          currsigs.addElement(bottlePos5S);
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

  public void thread2734(int [] tdone, int [] ends){
        switch(S2687){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(bottlePos4.getprestatus()){//sysj\rotaryPlant.sysj line: 106, column: 28
          bottlePos4S.setPresent();//sysj\rotaryPlant.sysj line: 106, column: 41
          currsigs.addElement(bottlePos4S);
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

  public void thread2733(int [] tdone, int [] ends){
        switch(S2679){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(bottlePos3.getprestatus()){//sysj\rotaryPlant.sysj line: 104, column: 28
          bottlePos3S.setPresent();//sysj\rotaryPlant.sysj line: 104, column: 41
          currsigs.addElement(bottlePos3S);
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

  public void thread2732(int [] tdone, int [] ends){
        switch(S2671){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 102, column: 28
          bottlePos2S.setPresent();//sysj\rotaryPlant.sysj line: 102, column: 41
          currsigs.addElement(bottlePos2S);
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

  public void thread2731(int [] tdone, int [] ends){
        switch(S2663){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S2657){
          case 0 : 
            S2657=0;
            if(bottlePos1.getprestatus()){//sysj\rotaryPlant.sysj line: 100, column: 28
              bottlePos1S.setPresent();//sysj\rotaryPlant.sysj line: 100, column: 41
              currsigs.addElement(bottlePos1S);
              S2657=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              S2657=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
          case 1 : 
            S2657=1;
            S2657=0;
            if(bottlePos1.getprestatus()){//sysj\rotaryPlant.sysj line: 100, column: 28
              bottlePos1S.setPresent();//sysj\rotaryPlant.sysj line: 100, column: 41
              currsigs.addElement(bottlePos1S);
              S2657=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              S2657=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2730(int [] tdone, int [] ends){
        switch(S2705){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        thread2731(tdone,ends);
        thread2732(tdone,ends);
        thread2733(tdone,ends);
        thread2734(tdone,ends);
        thread2735(tdone,ends);
        thread2736(tdone,ends);
        int biggest2737 = 0;
        if(ends[9]>=biggest2737){
          biggest2737=ends[9];
        }
        if(ends[10]>=biggest2737){
          biggest2737=ends[10];
        }
        if(ends[11]>=biggest2737){
          biggest2737=ends[11];
        }
        if(ends[12]>=biggest2737){
          biggest2737=ends[12];
        }
        if(ends[13]>=biggest2737){
          biggest2737=ends[13];
        }
        if(ends[14]>=biggest2737){
          biggest2737=ends[14];
        }
        if(biggest2737 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        //FINXME code
        if(biggest2737 == 0){
          S2705=0;
          active[8]=0;
          ends[8]=0;
          tdone[8]=1;
        }
        break;
      
    }
  }

  public void thread2729(int [] tdone, int [] ends){
        switch(S2655){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S2615){
          case 0 : 
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 85, column: 10
              S2615=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 86, column: 5
              currsigs.addElement(aligned);
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            if(tick.getprestatus() && rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 89, column: 10
              S2615=2;
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 94, column: 5
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
            if(!rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 93, column: 10
              S2615=0;
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 86, column: 5
              currsigs.addElement(aligned);
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 94, column: 5
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

  public void thread2728(int [] tdone, int [] ends){
        switch(S2608){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S2568){
          case 0 : 
            if(bottlePos4.getprestatus()){//sysj\rotaryPlant.sysj line: 72, column: 10
              S2568=1;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 73, column: 10
              S2568=2;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 76, column: 10
              S2568=3;
              bottlePos5.setPresent();//sysj\rotaryPlant.sysj line: 78, column: 5
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 77, column: 10
              S2568=0;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              bottlePos5.setPresent();//sysj\rotaryPlant.sysj line: 78, column: 5
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

  public void thread2727(int [] tdone, int [] ends){
        switch(S2564){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S2524){
          case 0 : 
            if(bottlePos3.getprestatus()){//sysj\rotaryPlant.sysj line: 60, column: 10
              S2524=1;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 61, column: 10
              S2524=2;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 63, column: 10
              S2524=3;
              bottlePos4.setPresent();//sysj\rotaryPlant.sysj line: 65, column: 5
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
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 64, column: 10
              S2524=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              bottlePos4.setPresent();//sysj\rotaryPlant.sysj line: 65, column: 5
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

  public void thread2726(int [] tdone, int [] ends){
        switch(S2520){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S2480){
          case 0 : 
            if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 48, column: 10
              S2480=1;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 49, column: 10
              S2480=2;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 51, column: 10
              S2480=3;
              bottlePos3.setPresent();//sysj\rotaryPlant.sysj line: 53, column: 5
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
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 52, column: 10
              S2480=0;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              bottlePos3.setPresent();//sysj\rotaryPlant.sysj line: 53, column: 5
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

  public void thread2725(int [] tdone, int [] ends){
        switch(S2476){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S2436){
          case 0 : 
            if(bottlePos1.getprestatus()){//sysj\rotaryPlant.sysj line: 36, column: 10
              S2436=1;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 37, column: 10
              S2436=2;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 39, column: 10
              S2436=3;
              bottlePos2.setPresent();//sysj\rotaryPlant.sysj line: 41, column: 5
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
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 40, column: 10
              S2436=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              bottlePos2.setPresent();//sysj\rotaryPlant.sysj line: 41, column: 5
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

  public void thread2724(int [] tdone, int [] ends){
        switch(S2432){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S2380){
          case 0 : 
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 20, column: 10
              S2380=1;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 22, column: 10
              S2380=2;
              bottlePos1.setPresent();//sysj\rotaryPlant.sysj line: 24, column: 5
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
          
          case 2 : 
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 23, column: 10
              S2380=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              bottlePos1.setPresent();//sysj\rotaryPlant.sysj line: 24, column: 5
              currsigs.addElement(bottlePos1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            if(bottlePos5.getprestatus()){//sysj\rotaryPlant.sysj line: 28, column: 10
              S2380=4;
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
          
          case 4 : 
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 29, column: 10
              S2380=5;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 30, column: 10
              S2380=0;
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

  public void thread2721(int [] tdone, int [] ends){
        S2703=1;
    if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 110, column: 28
      rotateS.setPresent();//sysj\rotaryPlant.sysj line: 110, column: 37
      currsigs.addElement(rotateS);
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

  public void thread2720(int [] tdone, int [] ends){
        S2695=1;
    if(bottlePos5.getprestatus()){//sysj\rotaryPlant.sysj line: 108, column: 28
      bottlePos5S.setPresent();//sysj\rotaryPlant.sysj line: 108, column: 41
      currsigs.addElement(bottlePos5S);
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

  public void thread2719(int [] tdone, int [] ends){
        S2687=1;
    if(bottlePos4.getprestatus()){//sysj\rotaryPlant.sysj line: 106, column: 28
      bottlePos4S.setPresent();//sysj\rotaryPlant.sysj line: 106, column: 41
      currsigs.addElement(bottlePos4S);
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

  public void thread2718(int [] tdone, int [] ends){
        S2679=1;
    if(bottlePos3.getprestatus()){//sysj\rotaryPlant.sysj line: 104, column: 28
      bottlePos3S.setPresent();//sysj\rotaryPlant.sysj line: 104, column: 41
      currsigs.addElement(bottlePos3S);
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

  public void thread2717(int [] tdone, int [] ends){
        S2671=1;
    if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 102, column: 28
      bottlePos2S.setPresent();//sysj\rotaryPlant.sysj line: 102, column: 41
      currsigs.addElement(bottlePos2S);
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

  public void thread2716(int [] tdone, int [] ends){
        S2663=1;
    S2657=0;
    if(bottlePos1.getprestatus()){//sysj\rotaryPlant.sysj line: 100, column: 28
      bottlePos1S.setPresent();//sysj\rotaryPlant.sysj line: 100, column: 41
      currsigs.addElement(bottlePos1S);
      S2657=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      S2657=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread2715(int [] tdone, int [] ends){
        S2705=1;
    thread2716(tdone,ends);
    thread2717(tdone,ends);
    thread2718(tdone,ends);
    thread2719(tdone,ends);
    thread2720(tdone,ends);
    thread2721(tdone,ends);
    int biggest2722 = 0;
    if(ends[9]>=biggest2722){
      biggest2722=ends[9];
    }
    if(ends[10]>=biggest2722){
      biggest2722=ends[10];
    }
    if(ends[11]>=biggest2722){
      biggest2722=ends[11];
    }
    if(ends[12]>=biggest2722){
      biggest2722=ends[12];
    }
    if(ends[13]>=biggest2722){
      biggest2722=ends[13];
    }
    if(ends[14]>=biggest2722){
      biggest2722=ends[14];
    }
    if(biggest2722 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread2714(int [] tdone, int [] ends){
        S2655=1;
    S2615=0;
    aligned.setPresent();//sysj\rotaryPlant.sysj line: 86, column: 5
    currsigs.addElement(aligned);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread2713(int [] tdone, int [] ends){
        S2608=1;
    S2568=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread2712(int [] tdone, int [] ends){
        S2564=1;
    S2524=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread2711(int [] tdone, int [] ends){
        S2520=1;
    S2480=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread2710(int [] tdone, int [] ends){
        S2476=1;
    S2436=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread2709(int [] tdone, int [] ends){
        S2432=1;
    S2380=0;
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
      switch(S2707){
        case 0 : 
          S2707=0;
          break RUN;
        
        case 1 : 
          S2707=2;
          S2707=2;
          thread2709(tdone,ends);
          thread2710(tdone,ends);
          thread2711(tdone,ends);
          thread2712(tdone,ends);
          thread2713(tdone,ends);
          thread2714(tdone,ends);
          thread2715(tdone,ends);
          int biggest2723 = 0;
          if(ends[2]>=biggest2723){
            biggest2723=ends[2];
          }
          if(ends[3]>=biggest2723){
            biggest2723=ends[3];
          }
          if(ends[4]>=biggest2723){
            biggest2723=ends[4];
          }
          if(ends[5]>=biggest2723){
            biggest2723=ends[5];
          }
          if(ends[6]>=biggest2723){
            biggest2723=ends[6];
          }
          if(ends[7]>=biggest2723){
            biggest2723=ends[7];
          }
          if(ends[8]>=biggest2723){
            biggest2723=ends[8];
          }
          if(biggest2723 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread2724(tdone,ends);
          thread2725(tdone,ends);
          thread2726(tdone,ends);
          thread2727(tdone,ends);
          thread2728(tdone,ends);
          thread2729(tdone,ends);
          thread2730(tdone,ends);
          int biggest2738 = 0;
          if(ends[2]>=biggest2738){
            biggest2738=ends[2];
          }
          if(ends[3]>=biggest2738){
            biggest2738=ends[3];
          }
          if(ends[4]>=biggest2738){
            biggest2738=ends[4];
          }
          if(ends[5]>=biggest2738){
            biggest2738=ends[5];
          }
          if(ends[6]>=biggest2738){
            biggest2738=ends[6];
          }
          if(ends[7]>=biggest2738){
            biggest2738=ends[7];
          }
          if(ends[8]>=biggest2738){
            biggest2738=ends[8];
          }
          if(biggest2738 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2738 == 0){
            S2707=0;
            active[1]=0;
            ends[1]=0;
            S2707=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
