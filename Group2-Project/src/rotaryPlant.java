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
  public Signal NbottlePos1 = new Signal("NbottlePos1", Signal.INPUT);
  public Signal Nmotor = new Signal("Nmotor", Signal.INPUT);
  public Signal NbottleLeft5 = new Signal("NbottleLeft5", Signal.INPUT);
  public Signal bottlePos1 = new Signal("bottlePos1", Signal.OUTPUT);
  public Signal bottlePos2 = new Signal("bottlePos2", Signal.OUTPUT);
  public Signal bottlePos3 = new Signal("bottlePos3", Signal.OUTPUT);
  public Signal bottlePos4 = new Signal("bottlePos4", Signal.OUTPUT);
  public Signal bottlePos5 = new Signal("bottlePos5", Signal.OUTPUT);
  public Signal aligned = new Signal("aligned", Signal.OUTPUT);
  public Signal NbottlePos5 = new Signal("NbottlePos5", Signal.OUTPUT);
  public Signal bottlePos1S = new Signal("bottlePos1S", Signal.OUTPUT);
  public Signal bottlePos2S = new Signal("bottlePos2S", Signal.OUTPUT);
  public Signal bottlePos3S = new Signal("bottlePos3S", Signal.OUTPUT);
  public Signal bottlePos4S = new Signal("bottlePos4S", Signal.OUTPUT);
  public Signal bottlePos5S = new Signal("bottlePos5S", Signal.OUTPUT);
  public Signal rotateS = new Signal("rotateS", Signal.OUTPUT);
  private int S2592 = 1;
  private int S2327 = 1;
  private int S2285 = 1;
  private int S2371 = 1;
  private int S2331 = 1;
  private int S2415 = 1;
  private int S2375 = 1;
  private int S2459 = 1;
  private int S2419 = 1;
  private int S2506 = 1;
  private int S2466 = 1;
  private int S2576 = 1;
  private int S2575 = 1;
  private int S2514 = 1;
  private int S2508 = 1;
  private int S2522 = 1;
  private int S2530 = 1;
  private int S2538 = 1;
  private int S2546 = 1;
  private int S2554 = 1;
  private int S2562 = 1;
  private int S2590 = 1;
  private int S2580 = 1;
  
  private int[] ends = new int[16];
  private int[] tdone = new int[16];
  
  public void thread2624(int [] tdone, int [] ends){
        switch(S2590){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S2580){
          case 0 : 
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 106, column: 10
              S2580=1;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 108, column: 10
              S2580=0;
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
        break;
      
    }
  }

  public void thread2622(int [] tdone, int [] ends){
        switch(S2562){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(bottlePos5.getprestatus()){//sysj\rotaryPlant.sysj line: 98, column: 28
          NbottlePos5.setPresent();//sysj\rotaryPlant.sysj line: 98, column: 41
          currsigs.addElement(NbottlePos5);
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

  public void thread2621(int [] tdone, int [] ends){
        switch(S2554){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 96, column: 28
          rotateS.setPresent();//sysj\rotaryPlant.sysj line: 96, column: 37
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

  public void thread2620(int [] tdone, int [] ends){
        switch(S2546){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(bottlePos5.getprestatus()){//sysj\rotaryPlant.sysj line: 94, column: 28
          bottlePos5S.setPresent();//sysj\rotaryPlant.sysj line: 94, column: 41
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

  public void thread2619(int [] tdone, int [] ends){
        switch(S2538){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(bottlePos4.getprestatus()){//sysj\rotaryPlant.sysj line: 92, column: 28
          bottlePos4S.setPresent();//sysj\rotaryPlant.sysj line: 92, column: 41
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

  public void thread2618(int [] tdone, int [] ends){
        switch(S2530){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(bottlePos3.getprestatus()){//sysj\rotaryPlant.sysj line: 90, column: 28
          bottlePos3S.setPresent();//sysj\rotaryPlant.sysj line: 90, column: 41
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

  public void thread2617(int [] tdone, int [] ends){
        switch(S2522){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 88, column: 28
          bottlePos2S.setPresent();//sysj\rotaryPlant.sysj line: 88, column: 41
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

  public void thread2616(int [] tdone, int [] ends){
        switch(S2514){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S2508){
          case 0 : 
            S2508=0;
            if(bottlePos1.getprestatus()){//sysj\rotaryPlant.sysj line: 86, column: 28
              bottlePos1S.setPresent();//sysj\rotaryPlant.sysj line: 86, column: 41
              currsigs.addElement(bottlePos1S);
              S2508=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              S2508=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 1 : 
            S2508=1;
            S2508=0;
            if(bottlePos1.getprestatus()){//sysj\rotaryPlant.sysj line: 86, column: 28
              bottlePos1S.setPresent();//sysj\rotaryPlant.sysj line: 86, column: 41
              currsigs.addElement(bottlePos1S);
              S2508=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              S2508=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2615(int [] tdone, int [] ends){
        switch(S2576){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S2575){
          case 0 : 
            thread2616(tdone,ends);
            thread2617(tdone,ends);
            thread2618(tdone,ends);
            thread2619(tdone,ends);
            thread2620(tdone,ends);
            thread2621(tdone,ends);
            thread2622(tdone,ends);
            int biggest2623 = 0;
            if(ends[8]>=biggest2623){
              biggest2623=ends[8];
            }
            if(ends[9]>=biggest2623){
              biggest2623=ends[9];
            }
            if(ends[10]>=biggest2623){
              biggest2623=ends[10];
            }
            if(ends[11]>=biggest2623){
              biggest2623=ends[11];
            }
            if(ends[12]>=biggest2623){
              biggest2623=ends[12];
            }
            if(ends[13]>=biggest2623){
              biggest2623=ends[13];
            }
            if(ends[14]>=biggest2623){
              biggest2623=ends[14];
            }
            if(biggest2623 == 1){
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            //FINXME code
            if(biggest2623 == 0){
              S2575=1;
              if(NbottlePos1.getprestatus()){//sysj\rotaryPlant.sysj line: 101, column: 28
                bottlePos1.setPresent();//sysj\rotaryPlant.sysj line: 101, column: 42
                currsigs.addElement(bottlePos1);
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
            break;
          
          case 1 : 
            if(NbottlePos1.getprestatus()){//sysj\rotaryPlant.sysj line: 101, column: 28
              bottlePos1.setPresent();//sysj\rotaryPlant.sysj line: 101, column: 42
              currsigs.addElement(bottlePos1);
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
        break;
      
    }
  }

  public void thread2614(int [] tdone, int [] ends){
        switch(S2506){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S2466){
          case 0 : 
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 71, column: 10
              S2466=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 72, column: 5
              currsigs.addElement(aligned);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 1 : 
            if(tick.getprestatus() && rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 75, column: 10
              S2466=2;
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 80, column: 5
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
            if(!rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 79, column: 10
              S2466=0;
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 72, column: 5
              currsigs.addElement(aligned);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 80, column: 5
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

  public void thread2613(int [] tdone, int [] ends){
        switch(S2459){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S2419){
          case 0 : 
            if(bottlePos4.getprestatus()){//sysj\rotaryPlant.sysj line: 58, column: 10
              S2419=1;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 59, column: 10
              S2419=2;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 62, column: 10
              S2419=3;
              bottlePos5.setPresent();//sysj\rotaryPlant.sysj line: 64, column: 5
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 63, column: 10
              S2419=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              bottlePos5.setPresent();//sysj\rotaryPlant.sysj line: 64, column: 5
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

  public void thread2612(int [] tdone, int [] ends){
        switch(S2415){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S2375){
          case 0 : 
            if(bottlePos3.getprestatus()){//sysj\rotaryPlant.sysj line: 46, column: 10
              S2375=1;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 47, column: 10
              S2375=2;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 49, column: 10
              S2375=3;
              bottlePos4.setPresent();//sysj\rotaryPlant.sysj line: 51, column: 5
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
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 50, column: 10
              S2375=0;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              bottlePos4.setPresent();//sysj\rotaryPlant.sysj line: 51, column: 5
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

  public void thread2611(int [] tdone, int [] ends){
        switch(S2371){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S2331){
          case 0 : 
            if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 34, column: 10
              S2331=1;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 35, column: 10
              S2331=2;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 37, column: 10
              S2331=3;
              bottlePos3.setPresent();//sysj\rotaryPlant.sysj line: 39, column: 5
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
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 38, column: 10
              S2331=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              bottlePos3.setPresent();//sysj\rotaryPlant.sysj line: 39, column: 5
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

  public void thread2610(int [] tdone, int [] ends){
        switch(S2327){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S2285){
          case 0 : 
            if(bottlePos1.getprestatus()){//sysj\rotaryPlant.sysj line: 21, column: 10
              System.out.println("I SEE POS1");//sysj\rotaryPlant.sysj line: 22, column: 4
              S2285=1;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 23, column: 10
              S2285=2;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 25, column: 10
              S2285=3;
              bottlePos2.setPresent();//sysj\rotaryPlant.sysj line: 27, column: 5
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
          
          case 3 : 
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 26, column: 10
              S2285=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              bottlePos2.setPresent();//sysj\rotaryPlant.sysj line: 27, column: 5
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

  public void thread2608(int [] tdone, int [] ends){
        S2590=1;
    S2580=0;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread2606(int [] tdone, int [] ends){
        S2562=1;
    if(bottlePos5.getprestatus()){//sysj\rotaryPlant.sysj line: 98, column: 28
      NbottlePos5.setPresent();//sysj\rotaryPlant.sysj line: 98, column: 41
      currsigs.addElement(NbottlePos5);
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

  public void thread2605(int [] tdone, int [] ends){
        S2554=1;
    if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 96, column: 28
      rotateS.setPresent();//sysj\rotaryPlant.sysj line: 96, column: 37
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

  public void thread2604(int [] tdone, int [] ends){
        S2546=1;
    if(bottlePos5.getprestatus()){//sysj\rotaryPlant.sysj line: 94, column: 28
      bottlePos5S.setPresent();//sysj\rotaryPlant.sysj line: 94, column: 41
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

  public void thread2603(int [] tdone, int [] ends){
        S2538=1;
    if(bottlePos4.getprestatus()){//sysj\rotaryPlant.sysj line: 92, column: 28
      bottlePos4S.setPresent();//sysj\rotaryPlant.sysj line: 92, column: 41
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

  public void thread2602(int [] tdone, int [] ends){
        S2530=1;
    if(bottlePos3.getprestatus()){//sysj\rotaryPlant.sysj line: 90, column: 28
      bottlePos3S.setPresent();//sysj\rotaryPlant.sysj line: 90, column: 41
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

  public void thread2601(int [] tdone, int [] ends){
        S2522=1;
    if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 88, column: 28
      bottlePos2S.setPresent();//sysj\rotaryPlant.sysj line: 88, column: 41
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

  public void thread2600(int [] tdone, int [] ends){
        S2514=1;
    S2508=0;
    if(bottlePos1.getprestatus()){//sysj\rotaryPlant.sysj line: 86, column: 28
      bottlePos1S.setPresent();//sysj\rotaryPlant.sysj line: 86, column: 41
      currsigs.addElement(bottlePos1S);
      S2508=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      S2508=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread2599(int [] tdone, int [] ends){
        S2576=1;
    S2575=0;
    thread2600(tdone,ends);
    thread2601(tdone,ends);
    thread2602(tdone,ends);
    thread2603(tdone,ends);
    thread2604(tdone,ends);
    thread2605(tdone,ends);
    thread2606(tdone,ends);
    int biggest2607 = 0;
    if(ends[8]>=biggest2607){
      biggest2607=ends[8];
    }
    if(ends[9]>=biggest2607){
      biggest2607=ends[9];
    }
    if(ends[10]>=biggest2607){
      biggest2607=ends[10];
    }
    if(ends[11]>=biggest2607){
      biggest2607=ends[11];
    }
    if(ends[12]>=biggest2607){
      biggest2607=ends[12];
    }
    if(ends[13]>=biggest2607){
      biggest2607=ends[13];
    }
    if(ends[14]>=biggest2607){
      biggest2607=ends[14];
    }
    if(biggest2607 == 1){
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread2598(int [] tdone, int [] ends){
        S2506=1;
    S2466=0;
    aligned.setPresent();//sysj\rotaryPlant.sysj line: 72, column: 5
    currsigs.addElement(aligned);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread2597(int [] tdone, int [] ends){
        S2459=1;
    S2419=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread2596(int [] tdone, int [] ends){
        S2415=1;
    S2375=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread2595(int [] tdone, int [] ends){
        S2371=1;
    S2331=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread2594(int [] tdone, int [] ends){
        S2327=1;
    S2285=0;
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
      switch(S2592){
        case 0 : 
          S2592=0;
          break RUN;
        
        case 1 : 
          S2592=2;
          S2592=2;
          thread2594(tdone,ends);
          thread2595(tdone,ends);
          thread2596(tdone,ends);
          thread2597(tdone,ends);
          thread2598(tdone,ends);
          thread2599(tdone,ends);
          thread2608(tdone,ends);
          int biggest2609 = 0;
          if(ends[2]>=biggest2609){
            biggest2609=ends[2];
          }
          if(ends[3]>=biggest2609){
            biggest2609=ends[3];
          }
          if(ends[4]>=biggest2609){
            biggest2609=ends[4];
          }
          if(ends[5]>=biggest2609){
            biggest2609=ends[5];
          }
          if(ends[6]>=biggest2609){
            biggest2609=ends[6];
          }
          if(ends[7]>=biggest2609){
            biggest2609=ends[7];
          }
          if(ends[15]>=biggest2609){
            biggest2609=ends[15];
          }
          if(biggest2609 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread2610(tdone,ends);
          thread2611(tdone,ends);
          thread2612(tdone,ends);
          thread2613(tdone,ends);
          thread2614(tdone,ends);
          thread2615(tdone,ends);
          thread2624(tdone,ends);
          int biggest2625 = 0;
          if(ends[2]>=biggest2625){
            biggest2625=ends[2];
          }
          if(ends[3]>=biggest2625){
            biggest2625=ends[3];
          }
          if(ends[4]>=biggest2625){
            biggest2625=ends[4];
          }
          if(ends[5]>=biggest2625){
            biggest2625=ends[5];
          }
          if(ends[6]>=biggest2625){
            biggest2625=ends[6];
          }
          if(ends[7]>=biggest2625){
            biggest2625=ends[7];
          }
          if(ends[15]>=biggest2625){
            biggest2625=ends[15];
          }
          if(biggest2625 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2625 == 0){
            S2592=0;
            active[1]=0;
            ends[1]=0;
            S2592=0;
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
          rotate.gethook();
          tick.gethook();
          NbottlePos1.gethook();
          Nmotor.gethook();
          NbottleLeft5.gethook();
          df = true;
        }
        runClockDomain();
      }
      rotate.setpreclear();
      tick.setpreclear();
      NbottlePos1.setpreclear();
      Nmotor.setpreclear();
      NbottleLeft5.setpreclear();
      bottlePos1.setpreclear();
      bottlePos2.setpreclear();
      bottlePos3.setpreclear();
      bottlePos4.setpreclear();
      bottlePos5.setpreclear();
      aligned.setpreclear();
      NbottlePos5.setpreclear();
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
      dummyint = NbottlePos1.getStatus() ? NbottlePos1.setprepresent() : NbottlePos1.setpreclear();
      NbottlePos1.setpreval(NbottlePos1.getValue());
      NbottlePos1.setClear();
      dummyint = Nmotor.getStatus() ? Nmotor.setprepresent() : Nmotor.setpreclear();
      Nmotor.setpreval(Nmotor.getValue());
      Nmotor.setClear();
      dummyint = NbottleLeft5.getStatus() ? NbottleLeft5.setprepresent() : NbottleLeft5.setpreclear();
      NbottleLeft5.setpreval(NbottleLeft5.getValue());
      NbottleLeft5.setClear();
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
      NbottlePos5.sethook();
      NbottlePos5.setClear();
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
        NbottlePos1.gethook();
        Nmotor.gethook();
        NbottleLeft5.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
