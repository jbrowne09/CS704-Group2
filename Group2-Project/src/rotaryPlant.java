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
  private int S2699 = 1;
  private int S2434 = 1;
  private int S2392 = 1;
  private int S2478 = 1;
  private int S2438 = 1;
  private int S2522 = 1;
  private int S2482 = 1;
  private int S2566 = 1;
  private int S2526 = 1;
  private int S2613 = 1;
  private int S2573 = 1;
  private int S2683 = 1;
  private int S2682 = 1;
  private int S2621 = 1;
  private int S2615 = 1;
  private int S2629 = 1;
  private int S2637 = 1;
  private int S2645 = 1;
  private int S2653 = 1;
  private int S2661 = 1;
  private int S2669 = 1;
  private int S2697 = 1;
  private int S2687 = 1;
  
  private int[] ends = new int[16];
  private int[] tdone = new int[16];
  
  public void thread2731(int [] tdone, int [] ends){
        switch(S2697){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S2687){
          case 0 : 
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 106, column: 10
              S2687=1;
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
              S2687=0;
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

  public void thread2729(int [] tdone, int [] ends){
        switch(S2669){
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

  public void thread2728(int [] tdone, int [] ends){
        switch(S2661){
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

  public void thread2727(int [] tdone, int [] ends){
        switch(S2653){
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

  public void thread2726(int [] tdone, int [] ends){
        switch(S2645){
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

  public void thread2725(int [] tdone, int [] ends){
        switch(S2637){
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

  public void thread2724(int [] tdone, int [] ends){
        switch(S2629){
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

  public void thread2723(int [] tdone, int [] ends){
        switch(S2621){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S2615){
          case 0 : 
            S2615=0;
            if(bottlePos1.getprestatus()){//sysj\rotaryPlant.sysj line: 86, column: 28
              bottlePos1S.setPresent();//sysj\rotaryPlant.sysj line: 86, column: 41
              currsigs.addElement(bottlePos1S);
              S2615=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              S2615=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 1 : 
            S2615=1;
            S2615=0;
            if(bottlePos1.getprestatus()){//sysj\rotaryPlant.sysj line: 86, column: 28
              bottlePos1S.setPresent();//sysj\rotaryPlant.sysj line: 86, column: 41
              currsigs.addElement(bottlePos1S);
              S2615=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              S2615=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2722(int [] tdone, int [] ends){
        switch(S2683){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S2682){
          case 0 : 
            thread2723(tdone,ends);
            thread2724(tdone,ends);
            thread2725(tdone,ends);
            thread2726(tdone,ends);
            thread2727(tdone,ends);
            thread2728(tdone,ends);
            thread2729(tdone,ends);
            int biggest2730 = 0;
            if(ends[8]>=biggest2730){
              biggest2730=ends[8];
            }
            if(ends[9]>=biggest2730){
              biggest2730=ends[9];
            }
            if(ends[10]>=biggest2730){
              biggest2730=ends[10];
            }
            if(ends[11]>=biggest2730){
              biggest2730=ends[11];
            }
            if(ends[12]>=biggest2730){
              biggest2730=ends[12];
            }
            if(ends[13]>=biggest2730){
              biggest2730=ends[13];
            }
            if(ends[14]>=biggest2730){
              biggest2730=ends[14];
            }
            if(biggest2730 == 1){
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            //FINXME code
            if(biggest2730 == 0){
              S2682=1;
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

  public void thread2721(int [] tdone, int [] ends){
        switch(S2613){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S2573){
          case 0 : 
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 71, column: 10
              S2573=1;
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
              S2573=2;
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
              S2573=0;
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

  public void thread2720(int [] tdone, int [] ends){
        switch(S2566){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S2526){
          case 0 : 
            if(bottlePos4.getprestatus()){//sysj\rotaryPlant.sysj line: 58, column: 10
              S2526=1;
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
              S2526=2;
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
              S2526=3;
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
              S2526=0;
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

  public void thread2719(int [] tdone, int [] ends){
        switch(S2522){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S2482){
          case 0 : 
            if(bottlePos3.getprestatus()){//sysj\rotaryPlant.sysj line: 46, column: 10
              S2482=1;
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
              S2482=2;
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
              S2482=3;
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
              S2482=0;
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

  public void thread2718(int [] tdone, int [] ends){
        switch(S2478){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S2438){
          case 0 : 
            if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 34, column: 10
              S2438=1;
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
              S2438=2;
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
              S2438=3;
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
              S2438=0;
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

  public void thread2717(int [] tdone, int [] ends){
        switch(S2434){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S2392){
          case 0 : 
            if(bottlePos1.getprestatus()){//sysj\rotaryPlant.sysj line: 21, column: 10
              System.out.println("I SEE POS1");//sysj\rotaryPlant.sysj line: 22, column: 4
              S2392=1;
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
              S2392=2;
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
              S2392=3;
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
              S2392=0;
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

  public void thread2715(int [] tdone, int [] ends){
        S2697=1;
    S2687=0;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread2713(int [] tdone, int [] ends){
        S2669=1;
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

  public void thread2712(int [] tdone, int [] ends){
        S2661=1;
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

  public void thread2711(int [] tdone, int [] ends){
        S2653=1;
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

  public void thread2710(int [] tdone, int [] ends){
        S2645=1;
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

  public void thread2709(int [] tdone, int [] ends){
        S2637=1;
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

  public void thread2708(int [] tdone, int [] ends){
        S2629=1;
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

  public void thread2707(int [] tdone, int [] ends){
        S2621=1;
    S2615=0;
    if(bottlePos1.getprestatus()){//sysj\rotaryPlant.sysj line: 86, column: 28
      bottlePos1S.setPresent();//sysj\rotaryPlant.sysj line: 86, column: 41
      currsigs.addElement(bottlePos1S);
      S2615=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      S2615=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread2706(int [] tdone, int [] ends){
        S2683=1;
    S2682=0;
    thread2707(tdone,ends);
    thread2708(tdone,ends);
    thread2709(tdone,ends);
    thread2710(tdone,ends);
    thread2711(tdone,ends);
    thread2712(tdone,ends);
    thread2713(tdone,ends);
    int biggest2714 = 0;
    if(ends[8]>=biggest2714){
      biggest2714=ends[8];
    }
    if(ends[9]>=biggest2714){
      biggest2714=ends[9];
    }
    if(ends[10]>=biggest2714){
      biggest2714=ends[10];
    }
    if(ends[11]>=biggest2714){
      biggest2714=ends[11];
    }
    if(ends[12]>=biggest2714){
      biggest2714=ends[12];
    }
    if(ends[13]>=biggest2714){
      biggest2714=ends[13];
    }
    if(ends[14]>=biggest2714){
      biggest2714=ends[14];
    }
    if(biggest2714 == 1){
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread2705(int [] tdone, int [] ends){
        S2613=1;
    S2573=0;
    aligned.setPresent();//sysj\rotaryPlant.sysj line: 72, column: 5
    currsigs.addElement(aligned);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread2704(int [] tdone, int [] ends){
        S2566=1;
    S2526=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread2703(int [] tdone, int [] ends){
        S2522=1;
    S2482=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread2702(int [] tdone, int [] ends){
        S2478=1;
    S2438=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread2701(int [] tdone, int [] ends){
        S2434=1;
    S2392=0;
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
      switch(S2699){
        case 0 : 
          S2699=0;
          break RUN;
        
        case 1 : 
          S2699=2;
          S2699=2;
          thread2701(tdone,ends);
          thread2702(tdone,ends);
          thread2703(tdone,ends);
          thread2704(tdone,ends);
          thread2705(tdone,ends);
          thread2706(tdone,ends);
          thread2715(tdone,ends);
          int biggest2716 = 0;
          if(ends[2]>=biggest2716){
            biggest2716=ends[2];
          }
          if(ends[3]>=biggest2716){
            biggest2716=ends[3];
          }
          if(ends[4]>=biggest2716){
            biggest2716=ends[4];
          }
          if(ends[5]>=biggest2716){
            biggest2716=ends[5];
          }
          if(ends[6]>=biggest2716){
            biggest2716=ends[6];
          }
          if(ends[7]>=biggest2716){
            biggest2716=ends[7];
          }
          if(ends[15]>=biggest2716){
            biggest2716=ends[15];
          }
          if(biggest2716 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread2717(tdone,ends);
          thread2718(tdone,ends);
          thread2719(tdone,ends);
          thread2720(tdone,ends);
          thread2721(tdone,ends);
          thread2722(tdone,ends);
          thread2731(tdone,ends);
          int biggest2732 = 0;
          if(ends[2]>=biggest2732){
            biggest2732=ends[2];
          }
          if(ends[3]>=biggest2732){
            biggest2732=ends[3];
          }
          if(ends[4]>=biggest2732){
            biggest2732=ends[4];
          }
          if(ends[5]>=biggest2732){
            biggest2732=ends[5];
          }
          if(ends[6]>=biggest2732){
            biggest2732=ends[6];
          }
          if(ends[7]>=biggest2732){
            biggest2732=ends[7];
          }
          if(ends[15]>=biggest2732){
            biggest2732=ends[15];
          }
          if(biggest2732 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2732 == 0){
            S2699=0;
            active[1]=0;
            ends[1]=0;
            S2699=0;
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
