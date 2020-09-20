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
  private int S2734 = 1;
  private int S2668 = 1;
  private int S2587 = 1;
  private int S2591 = 1;
  private int S2611 = 1;
  private int S2631 = 1;
  private int S2651 = 1;
  private int S2718 = 1;
  private int S2676 = 1;
  private int S2670 = 1;
  private int S2684 = 1;
  private int S2692 = 1;
  private int S2700 = 1;
  private int S2708 = 1;
  private int S2716 = 1;
  private int S2732 = 1;
  private int S2720 = 1;
  
  private int[] ends = new int[11];
  private int[] tdone = new int[11];
  
  public void thread2756(int [] tdone, int [] ends){
        switch(S2732){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S2720){
          case 0 : 
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 123, column: 10
              System.out.println("tick");//sysj\rotaryPlant.sysj line: 124, column: 4
              S2720=1;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 125, column: 10
              S2720=0;
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

  public void thread2754(int [] tdone, int [] ends){
        switch(S2716){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 118, column: 28
          rotateS.setPresent();//sysj\rotaryPlant.sysj line: 118, column: 37
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

  public void thread2753(int [] tdone, int [] ends){
        switch(S2708){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(bottlePos5.getprestatus()){//sysj\rotaryPlant.sysj line: 116, column: 28
          bottlePos5S.setPresent();//sysj\rotaryPlant.sysj line: 116, column: 41
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

  public void thread2752(int [] tdone, int [] ends){
        switch(S2700){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(bottlePos4.getprestatus()){//sysj\rotaryPlant.sysj line: 114, column: 28
          bottlePos4S.setPresent();//sysj\rotaryPlant.sysj line: 114, column: 41
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

  public void thread2751(int [] tdone, int [] ends){
        switch(S2692){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(bottlePos3.getprestatus()){//sysj\rotaryPlant.sysj line: 112, column: 28
          bottlePos3S.setPresent();//sysj\rotaryPlant.sysj line: 112, column: 41
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

  public void thread2750(int [] tdone, int [] ends){
        switch(S2684){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 110, column: 28
          bottlePos2S.setPresent();//sysj\rotaryPlant.sysj line: 110, column: 41
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

  public void thread2749(int [] tdone, int [] ends){
        switch(S2676){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S2670){
          case 0 : 
            S2670=0;
            if(bottlePos1.getprestatus()){//sysj\rotaryPlant.sysj line: 108, column: 28
              bottlePos1S.setPresent();//sysj\rotaryPlant.sysj line: 108, column: 41
              currsigs.addElement(bottlePos1S);
              S2670=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S2670=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S2670=1;
            S2670=0;
            if(bottlePos1.getprestatus()){//sysj\rotaryPlant.sysj line: 108, column: 28
              bottlePos1S.setPresent();//sysj\rotaryPlant.sysj line: 108, column: 41
              currsigs.addElement(bottlePos1S);
              S2670=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S2670=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2748(int [] tdone, int [] ends){
        switch(S2718){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
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
        //FINXME code
        if(biggest2755 == 0){
          S2718=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread2747(int [] tdone, int [] ends){
        switch(S2668){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S2587){
          case 0 : 
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 52, column: 9
              S2587=1;
              System.out.println("emitting bottlePos1");//sysj\rotaryPlant.sysj line: 54, column: 4
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 56, column: 5
              currsigs.addElement(aligned);
              bottlePos1.setPresent();//sysj\rotaryPlant.sysj line: 57, column: 5
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
          
          case 1 : 
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 53, column: 9
              S2587=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 56, column: 5
              currsigs.addElement(aligned);
              bottlePos1.setPresent();//sysj\rotaryPlant.sysj line: 57, column: 5
              currsigs.addElement(bottlePos1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 2 : 
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 62, column: 9
              S2587=3;
              S2591=0;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 63, column: 9
              S2587=4;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              switch(S2591){
                case 0 : 
                  if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 64, column: 10
                    System.out.println("emitting bottlePos2");//sysj\rotaryPlant.sysj line: 65, column: 4
                    S2591=1;
                    aligned.setPresent();//sysj\rotaryPlant.sysj line: 67, column: 5
                    currsigs.addElement(aligned);
                    bottlePos2.setPresent();//sysj\rotaryPlant.sysj line: 68, column: 5
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
                
                case 1 : 
                  aligned.setPresent();//sysj\rotaryPlant.sysj line: 67, column: 5
                  currsigs.addElement(aligned);
                  bottlePos2.setPresent();//sysj\rotaryPlant.sysj line: 68, column: 5
                  currsigs.addElement(bottlePos2);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                  break;
                
              }
            }
            break;
          
          case 4 : 
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 73, column: 9
              S2587=5;
              S2611=0;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 74, column: 9
              S2587=6;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              switch(S2611){
                case 0 : 
                  if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 75, column: 10
                    System.out.println("emitting bottlePos3");//sysj\rotaryPlant.sysj line: 76, column: 4
                    S2611=1;
                    aligned.setPresent();//sysj\rotaryPlant.sysj line: 78, column: 5
                    currsigs.addElement(aligned);
                    bottlePos3.setPresent();//sysj\rotaryPlant.sysj line: 79, column: 5
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
                
                case 1 : 
                  aligned.setPresent();//sysj\rotaryPlant.sysj line: 78, column: 5
                  currsigs.addElement(aligned);
                  bottlePos3.setPresent();//sysj\rotaryPlant.sysj line: 79, column: 5
                  currsigs.addElement(bottlePos3);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                  break;
                
              }
            }
            break;
          
          case 6 : 
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 84, column: 9
              S2587=7;
              S2631=0;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 85, column: 9
              S2587=8;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              switch(S2631){
                case 0 : 
                  if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 86, column: 10
                    System.out.println("emitting bottlePos4");//sysj\rotaryPlant.sysj line: 87, column: 4
                    S2631=1;
                    aligned.setPresent();//sysj\rotaryPlant.sysj line: 89, column: 5
                    currsigs.addElement(aligned);
                    bottlePos4.setPresent();//sysj\rotaryPlant.sysj line: 90, column: 5
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
                
                case 1 : 
                  aligned.setPresent();//sysj\rotaryPlant.sysj line: 89, column: 5
                  currsigs.addElement(aligned);
                  bottlePos4.setPresent();//sysj\rotaryPlant.sysj line: 90, column: 5
                  currsigs.addElement(bottlePos4);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                  break;
                
              }
            }
            break;
          
          case 8 : 
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 95, column: 9
              S2587=9;
              S2651=0;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 96, column: 9
              S2668=0;
              active[2]=0;
              ends[2]=0;
              tdone[2]=1;
            }
            else {
              switch(S2651){
                case 0 : 
                  if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 97, column: 10
                    System.out.println("emitting bottlePos5");//sysj\rotaryPlant.sysj line: 98, column: 4
                    S2651=1;
                    aligned.setPresent();//sysj\rotaryPlant.sysj line: 100, column: 5
                    currsigs.addElement(aligned);
                    bottlePos5.setPresent();//sysj\rotaryPlant.sysj line: 101, column: 5
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
                
                case 1 : 
                  aligned.setPresent();//sysj\rotaryPlant.sysj line: 100, column: 5
                  currsigs.addElement(aligned);
                  bottlePos5.setPresent();//sysj\rotaryPlant.sysj line: 101, column: 5
                  currsigs.addElement(bottlePos5);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                  break;
                
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2745(int [] tdone, int [] ends){
        S2732=1;
    S2720=0;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread2743(int [] tdone, int [] ends){
        S2716=1;
    if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 118, column: 28
      rotateS.setPresent();//sysj\rotaryPlant.sysj line: 118, column: 37
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

  public void thread2742(int [] tdone, int [] ends){
        S2708=1;
    if(bottlePos5.getprestatus()){//sysj\rotaryPlant.sysj line: 116, column: 28
      bottlePos5S.setPresent();//sysj\rotaryPlant.sysj line: 116, column: 41
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

  public void thread2741(int [] tdone, int [] ends){
        S2700=1;
    if(bottlePos4.getprestatus()){//sysj\rotaryPlant.sysj line: 114, column: 28
      bottlePos4S.setPresent();//sysj\rotaryPlant.sysj line: 114, column: 41
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

  public void thread2740(int [] tdone, int [] ends){
        S2692=1;
    if(bottlePos3.getprestatus()){//sysj\rotaryPlant.sysj line: 112, column: 28
      bottlePos3S.setPresent();//sysj\rotaryPlant.sysj line: 112, column: 41
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

  public void thread2739(int [] tdone, int [] ends){
        S2684=1;
    if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 110, column: 28
      bottlePos2S.setPresent();//sysj\rotaryPlant.sysj line: 110, column: 41
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

  public void thread2738(int [] tdone, int [] ends){
        S2676=1;
    S2670=0;
    if(bottlePos1.getprestatus()){//sysj\rotaryPlant.sysj line: 108, column: 28
      bottlePos1S.setPresent();//sysj\rotaryPlant.sysj line: 108, column: 41
      currsigs.addElement(bottlePos1S);
      S2670=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S2670=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread2737(int [] tdone, int [] ends){
        S2718=1;
    thread2738(tdone,ends);
    thread2739(tdone,ends);
    thread2740(tdone,ends);
    thread2741(tdone,ends);
    thread2742(tdone,ends);
    thread2743(tdone,ends);
    int biggest2744 = 0;
    if(ends[4]>=biggest2744){
      biggest2744=ends[4];
    }
    if(ends[5]>=biggest2744){
      biggest2744=ends[5];
    }
    if(ends[6]>=biggest2744){
      biggest2744=ends[6];
    }
    if(ends[7]>=biggest2744){
      biggest2744=ends[7];
    }
    if(ends[8]>=biggest2744){
      biggest2744=ends[8];
    }
    if(ends[9]>=biggest2744){
      biggest2744=ends[9];
    }
    if(biggest2744 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread2736(int [] tdone, int [] ends){
        S2668=1;
    S2587=0;
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
      switch(S2734){
        case 0 : 
          S2734=0;
          break RUN;
        
        case 1 : 
          S2734=2;
          S2734=2;
          thread2736(tdone,ends);
          thread2737(tdone,ends);
          thread2745(tdone,ends);
          int biggest2746 = 0;
          if(ends[2]>=biggest2746){
            biggest2746=ends[2];
          }
          if(ends[3]>=biggest2746){
            biggest2746=ends[3];
          }
          if(ends[10]>=biggest2746){
            biggest2746=ends[10];
          }
          if(biggest2746 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
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
          //FINXME code
          if(biggest2757 == 0){
            S2734=0;
            active[1]=0;
            ends[1]=0;
            S2734=0;
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
