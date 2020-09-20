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
  private int S2682 = 1;
  private int S2630 = 1;
  private int S2573 = 1;
  private int S2680 = 1;
  private int S2638 = 1;
  private int S2632 = 1;
  private int S2646 = 1;
  private int S2654 = 1;
  private int S2662 = 1;
  private int S2670 = 1;
  private int S2678 = 1;
  
  private int[] ends = new int[10];
  private int[] tdone = new int[10];
  
  public void thread2701(int [] tdone, int [] ends){
        switch(S2678){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 119, column: 28
          rotateS.setPresent();//sysj\rotaryPlant.sysj line: 119, column: 37
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

  public void thread2700(int [] tdone, int [] ends){
        switch(S2670){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(bottlePos5.getprestatus()){//sysj\rotaryPlant.sysj line: 117, column: 28
          bottlePos5S.setPresent();//sysj\rotaryPlant.sysj line: 117, column: 41
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

  public void thread2699(int [] tdone, int [] ends){
        switch(S2662){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(bottlePos4.getprestatus()){//sysj\rotaryPlant.sysj line: 115, column: 28
          bottlePos4S.setPresent();//sysj\rotaryPlant.sysj line: 115, column: 41
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

  public void thread2698(int [] tdone, int [] ends){
        switch(S2654){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(bottlePos3.getprestatus()){//sysj\rotaryPlant.sysj line: 113, column: 28
          bottlePos3S.setPresent();//sysj\rotaryPlant.sysj line: 113, column: 41
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

  public void thread2697(int [] tdone, int [] ends){
        switch(S2646){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 111, column: 28
          bottlePos2S.setPresent();//sysj\rotaryPlant.sysj line: 111, column: 41
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

  public void thread2696(int [] tdone, int [] ends){
        switch(S2638){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S2632){
          case 0 : 
            S2632=0;
            if(bottlePos1.getprestatus()){//sysj\rotaryPlant.sysj line: 109, column: 28
              bottlePos1S.setPresent();//sysj\rotaryPlant.sysj line: 109, column: 41
              currsigs.addElement(bottlePos1S);
              S2632=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S2632=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S2632=1;
            S2632=0;
            if(bottlePos1.getprestatus()){//sysj\rotaryPlant.sysj line: 109, column: 28
              bottlePos1S.setPresent();//sysj\rotaryPlant.sysj line: 109, column: 41
              currsigs.addElement(bottlePos1S);
              S2632=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S2632=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2695(int [] tdone, int [] ends){
        switch(S2680){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread2696(tdone,ends);
        thread2697(tdone,ends);
        thread2698(tdone,ends);
        thread2699(tdone,ends);
        thread2700(tdone,ends);
        thread2701(tdone,ends);
        int biggest2702 = 0;
        if(ends[4]>=biggest2702){
          biggest2702=ends[4];
        }
        if(ends[5]>=biggest2702){
          biggest2702=ends[5];
        }
        if(ends[6]>=biggest2702){
          biggest2702=ends[6];
        }
        if(ends[7]>=biggest2702){
          biggest2702=ends[7];
        }
        if(ends[8]>=biggest2702){
          biggest2702=ends[8];
        }
        if(ends[9]>=biggest2702){
          biggest2702=ends[9];
        }
        if(biggest2702 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest2702 == 0){
          S2680=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread2694(int [] tdone, int [] ends){
        switch(S2630){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S2573){
          case 0 : 
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 52, column: 9
              S2573=1;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 53, column: 9
              S2573=2;
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 57, column: 5
              currsigs.addElement(aligned);
              bottlePos1.setPresent();//sysj\rotaryPlant.sysj line: 58, column: 5
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
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 55, column: 9
              S2573=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 57, column: 5
              currsigs.addElement(aligned);
              bottlePos1.setPresent();//sysj\rotaryPlant.sysj line: 58, column: 5
              currsigs.addElement(bottlePos1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 63, column: 9
              S2573=4;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 64, column: 9
              S2573=5;
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 68, column: 5
              currsigs.addElement(aligned);
              bottlePos2.setPresent();//sysj\rotaryPlant.sysj line: 69, column: 5
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
          
          case 5 : 
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 66, column: 9
              S2573=6;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 68, column: 5
              currsigs.addElement(aligned);
              bottlePos2.setPresent();//sysj\rotaryPlant.sysj line: 69, column: 5
              currsigs.addElement(bottlePos2);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 6 : 
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 74, column: 9
              S2573=7;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 75, column: 9
              S2573=8;
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 79, column: 5
              currsigs.addElement(aligned);
              bottlePos3.setPresent();//sysj\rotaryPlant.sysj line: 80, column: 5
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
          
          case 8 : 
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 77, column: 9
              S2573=9;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 79, column: 5
              currsigs.addElement(aligned);
              bottlePos3.setPresent();//sysj\rotaryPlant.sysj line: 80, column: 5
              currsigs.addElement(bottlePos3);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 9 : 
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 85, column: 9
              S2573=10;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 86, column: 9
              S2573=11;
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 90, column: 5
              currsigs.addElement(aligned);
              bottlePos4.setPresent();//sysj\rotaryPlant.sysj line: 91, column: 5
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
          
          case 11 : 
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 88, column: 9
              S2573=12;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 90, column: 5
              currsigs.addElement(aligned);
              bottlePos4.setPresent();//sysj\rotaryPlant.sysj line: 91, column: 5
              currsigs.addElement(bottlePos4);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 12 : 
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 96, column: 9
              S2573=13;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 97, column: 9
              S2573=14;
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 101, column: 5
              currsigs.addElement(aligned);
              bottlePos5.setPresent();//sysj\rotaryPlant.sysj line: 102, column: 5
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
          
          case 14 : 
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 99, column: 9
              S2630=0;
              active[2]=0;
              ends[2]=0;
              tdone[2]=1;
            }
            else {
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 101, column: 5
              currsigs.addElement(aligned);
              bottlePos5.setPresent();//sysj\rotaryPlant.sysj line: 102, column: 5
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

  public void thread2691(int [] tdone, int [] ends){
        S2678=1;
    if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 119, column: 28
      rotateS.setPresent();//sysj\rotaryPlant.sysj line: 119, column: 37
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

  public void thread2690(int [] tdone, int [] ends){
        S2670=1;
    if(bottlePos5.getprestatus()){//sysj\rotaryPlant.sysj line: 117, column: 28
      bottlePos5S.setPresent();//sysj\rotaryPlant.sysj line: 117, column: 41
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

  public void thread2689(int [] tdone, int [] ends){
        S2662=1;
    if(bottlePos4.getprestatus()){//sysj\rotaryPlant.sysj line: 115, column: 28
      bottlePos4S.setPresent();//sysj\rotaryPlant.sysj line: 115, column: 41
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

  public void thread2688(int [] tdone, int [] ends){
        S2654=1;
    if(bottlePos3.getprestatus()){//sysj\rotaryPlant.sysj line: 113, column: 28
      bottlePos3S.setPresent();//sysj\rotaryPlant.sysj line: 113, column: 41
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

  public void thread2687(int [] tdone, int [] ends){
        S2646=1;
    if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 111, column: 28
      bottlePos2S.setPresent();//sysj\rotaryPlant.sysj line: 111, column: 41
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

  public void thread2686(int [] tdone, int [] ends){
        S2638=1;
    S2632=0;
    if(bottlePos1.getprestatus()){//sysj\rotaryPlant.sysj line: 109, column: 28
      bottlePos1S.setPresent();//sysj\rotaryPlant.sysj line: 109, column: 41
      currsigs.addElement(bottlePos1S);
      S2632=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S2632=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread2685(int [] tdone, int [] ends){
        S2680=1;
    thread2686(tdone,ends);
    thread2687(tdone,ends);
    thread2688(tdone,ends);
    thread2689(tdone,ends);
    thread2690(tdone,ends);
    thread2691(tdone,ends);
    int biggest2692 = 0;
    if(ends[4]>=biggest2692){
      biggest2692=ends[4];
    }
    if(ends[5]>=biggest2692){
      biggest2692=ends[5];
    }
    if(ends[6]>=biggest2692){
      biggest2692=ends[6];
    }
    if(ends[7]>=biggest2692){
      biggest2692=ends[7];
    }
    if(ends[8]>=biggest2692){
      biggest2692=ends[8];
    }
    if(ends[9]>=biggest2692){
      biggest2692=ends[9];
    }
    if(biggest2692 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread2684(int [] tdone, int [] ends){
        S2630=1;
    S2573=0;
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
      switch(S2682){
        case 0 : 
          S2682=0;
          break RUN;
        
        case 1 : 
          S2682=2;
          S2682=2;
          thread2684(tdone,ends);
          thread2685(tdone,ends);
          int biggest2693 = 0;
          if(ends[2]>=biggest2693){
            biggest2693=ends[2];
          }
          if(ends[3]>=biggest2693){
            biggest2693=ends[3];
          }
          if(biggest2693 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread2694(tdone,ends);
          thread2695(tdone,ends);
          int biggest2703 = 0;
          if(ends[2]>=biggest2703){
            biggest2703=ends[2];
          }
          if(ends[3]>=biggest2703){
            biggest2703=ends[3];
          }
          if(biggest2703 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2703 == 0){
            S2682=0;
            active[1]=0;
            ends[1]=0;
            S2682=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
