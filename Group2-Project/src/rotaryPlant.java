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
  public Signal rotate = new Signal("rotate", Signal.INPUT);
  public Signal CbottlePos1 = new Signal("CbottlePos1", Signal.INPUT);
  public Signal Cmotor = new Signal("Cmotor", Signal.INPUT);
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
  private Signal rotateTo2_1;
  private Signal rotateTo3_1;
  private Signal rotateTo4_1;
  private Signal rotateTo5_1;
  private int S2659 = 1;
  private int S2026 = 1;
  private int S1968 = 1;
  private int S2088 = 1;
  private int S2030 = 1;
  private int S2150 = 1;
  private int S2092 = 1;
  private int S2212 = 1;
  private int S2154 = 1;
  private int S2292 = 1;
  private int S2216 = 1;
  private int S2372 = 1;
  private int S2296 = 1;
  private int S2452 = 1;
  private int S2376 = 1;
  private int S2532 = 1;
  private int S2456 = 1;
  private int S2615 = 1;
  private int S2539 = 1;
  private int S2657 = 1;
  private int S2623 = 1;
  private int S2617 = 1;
  private int S2631 = 1;
  private int S2639 = 1;
  private int S2647 = 1;
  private int S2655 = 1;
  
  private int[] ends = new int[17];
  private int[] tdone = new int[17];
  
  public void thread2692(int [] tdone, int [] ends){
        switch(S2655){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 159, column: 28
          rotateS.setPresent();//sysj\rotaryPlant.sysj line: 159, column: 37
          currsigs.addElement(rotateS);
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        else {
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        break;
      
    }
  }

  public void thread2691(int [] tdone, int [] ends){
        switch(S2647){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(bottlePos5.getprestatus()){//sysj\rotaryPlant.sysj line: 157, column: 28
          bottlePos5S.setPresent();//sysj\rotaryPlant.sysj line: 157, column: 41
          currsigs.addElement(bottlePos5S);
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
  }

  public void thread2690(int [] tdone, int [] ends){
        switch(S2639){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(bottlePos4.getprestatus()){//sysj\rotaryPlant.sysj line: 155, column: 28
          bottlePos4S.setPresent();//sysj\rotaryPlant.sysj line: 155, column: 41
          currsigs.addElement(bottlePos4S);
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

  public void thread2689(int [] tdone, int [] ends){
        switch(S2631){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(bottlePos3.getprestatus()){//sysj\rotaryPlant.sysj line: 153, column: 28
          bottlePos3S.setPresent();//sysj\rotaryPlant.sysj line: 153, column: 41
          currsigs.addElement(bottlePos3S);
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

  public void thread2688(int [] tdone, int [] ends){
        switch(S2623){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S2617){
          case 0 : 
            S2617=0;
            if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 151, column: 28
              bottlePos2S.setPresent();//sysj\rotaryPlant.sysj line: 151, column: 41
              currsigs.addElement(bottlePos2S);
              S2617=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              S2617=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
          case 1 : 
            S2617=1;
            S2617=0;
            if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 151, column: 28
              bottlePos2S.setPresent();//sysj\rotaryPlant.sysj line: 151, column: 41
              currsigs.addElement(bottlePos2S);
              S2617=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              S2617=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2687(int [] tdone, int [] ends){
        switch(S2657){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        thread2688(tdone,ends);
        thread2689(tdone,ends);
        thread2690(tdone,ends);
        thread2691(tdone,ends);
        thread2692(tdone,ends);
        int biggest2693 = 0;
        if(ends[12]>=biggest2693){
          biggest2693=ends[12];
        }
        if(ends[13]>=biggest2693){
          biggest2693=ends[13];
        }
        if(ends[14]>=biggest2693){
          biggest2693=ends[14];
        }
        if(ends[15]>=biggest2693){
          biggest2693=ends[15];
        }
        if(ends[16]>=biggest2693){
          biggest2693=ends[16];
        }
        if(biggest2693 == 1){
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        //FINXME code
        if(biggest2693 == 0){
          S2657=0;
          active[11]=0;
          ends[11]=0;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread2686(int [] tdone, int [] ends){
        switch(S2615){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S2539){
          case 0 : 
            if(tick.getprestatus() && (CbottlePos1.getprestatus() || bottlePos2.getprestatus() || bottlePos3.getprestatus() || bottlePos4.getprestatus())){//sysj\rotaryPlant.sysj line: 130, column: 10
              S2539=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 131, column: 5
              currsigs.addElement(aligned);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 1 : 
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 134, column: 10
              S2539=2;
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
          
          case 2 : 
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 135, column: 10
              S2539=3;
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
          
          case 3 : 
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 136, column: 10
              S2539=4;
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 139, column: 5
              currsigs.addElement(aligned);
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
          
          case 4 : 
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 138, column: 10
              S2539=5;
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 143, column: 5
              currsigs.addElement(aligned);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 139, column: 5
              currsigs.addElement(aligned);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 5 : 
            if(!rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 142, column: 10
              S2539=0;
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 131, column: 5
              currsigs.addElement(aligned);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 143, column: 5
              currsigs.addElement(aligned);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2685(int [] tdone, int [] ends){
        switch(S2532){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S2456){
          case 0 : 
            if(rotateTo5_1.getprestatus()){//sysj\rotaryPlant.sysj line: 113, column: 10
              S2456=1;
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
          
          case 1 : 
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 114, column: 10
              System.out.println("Rotating to 5");//sysj\rotaryPlant.sysj line: 116, column: 4
              S2456=2;
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
          
          case 2 : 
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 117, column: 10
              S2456=3;
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
          
          case 3 : 
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 118, column: 10
              S2456=4;
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
          
          case 4 : 
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 119, column: 10
              S2456=5;
              System.out.println("putting at 5");//sysj\rotaryPlant.sysj line: 122, column: 5
              bottlePos5.setPresent();//sysj\rotaryPlant.sysj line: 123, column: 5
              currsigs.addElement(bottlePos5);
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
          
          case 5 : 
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 121, column: 10
              S2456=0;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              bottlePos5.setPresent();//sysj\rotaryPlant.sysj line: 123, column: 5
              currsigs.addElement(bottlePos5);
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2684(int [] tdone, int [] ends){
        switch(S2452){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S2376){
          case 0 : 
            if(rotateTo4_1.getprestatus()){//sysj\rotaryPlant.sysj line: 96, column: 10
              S2376=1;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 97, column: 10
              System.out.println("Rotating to 4");//sysj\rotaryPlant.sysj line: 99, column: 4
              S2376=2;
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
          
          case 2 : 
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 100, column: 10
              S2376=3;
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
          
          case 3 : 
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 101, column: 10
              S2376=4;
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
          
          case 4 : 
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 102, column: 10
              S2376=5;
              System.out.println("putting at 4");//sysj\rotaryPlant.sysj line: 105, column: 5
              bottlePos4.setPresent();//sysj\rotaryPlant.sysj line: 106, column: 5
              currsigs.addElement(bottlePos4);
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
          
          case 5 : 
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 104, column: 10
              S2376=0;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              bottlePos4.setPresent();//sysj\rotaryPlant.sysj line: 106, column: 5
              currsigs.addElement(bottlePos4);
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2683(int [] tdone, int [] ends){
        switch(S2372){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S2296){
          case 0 : 
            if(rotateTo3_1.getprestatus()){//sysj\rotaryPlant.sysj line: 79, column: 10
              S2296=1;
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
          
          case 1 : 
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 80, column: 10
              System.out.println("Rotating to 3");//sysj\rotaryPlant.sysj line: 82, column: 4
              S2296=2;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 83, column: 10
              S2296=3;
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
          
          case 3 : 
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 84, column: 10
              S2296=4;
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
          
          case 4 : 
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 85, column: 10
              S2296=5;
              System.out.println("putting at 3");//sysj\rotaryPlant.sysj line: 88, column: 5
              bottlePos3.setPresent();//sysj\rotaryPlant.sysj line: 89, column: 5
              currsigs.addElement(bottlePos3);
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
          
          case 5 : 
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 87, column: 10
              S2296=0;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              bottlePos3.setPresent();//sysj\rotaryPlant.sysj line: 89, column: 5
              currsigs.addElement(bottlePos3);
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2682(int [] tdone, int [] ends){
        switch(S2292){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S2216){
          case 0 : 
            if(rotateTo2_1.getprestatus()){//sysj\rotaryPlant.sysj line: 62, column: 10
              S2216=1;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 63, column: 10
              System.out.println("Rotating to 2");//sysj\rotaryPlant.sysj line: 65, column: 4
              S2216=2;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 66, column: 10
              S2216=3;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 67, column: 10
              S2216=4;
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
          
          case 4 : 
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 68, column: 10
              S2216=5;
              System.out.println("putting at 2");//sysj\rotaryPlant.sysj line: 71, column: 5
              bottlePos2.setPresent();//sysj\rotaryPlant.sysj line: 72, column: 5
              currsigs.addElement(bottlePos2);
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
          
          case 5 : 
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 70, column: 10
              S2216=0;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              bottlePos2.setPresent();//sysj\rotaryPlant.sysj line: 72, column: 5
              currsigs.addElement(bottlePos2);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2681(int [] tdone, int [] ends){
        switch(S2212){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S2154){
          case 0 : 
            if(bottlePos4.getprestatus()){//sysj\rotaryPlant.sysj line: 51, column: 10
              S2154=1;
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
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 52, column: 10
              S2154=2;
              System.out.println("to 5");//sysj\rotaryPlant.sysj line: 54, column: 5
              rotateTo5_1.setPresent();//sysj\rotaryPlant.sysj line: 55, column: 5
              currsigs.addElement(rotateTo5_1);
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
            if(bottlePos5.getprestatus() && !rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 53, column: 10
              S2154=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              rotateTo5_1.setPresent();//sysj\rotaryPlant.sysj line: 55, column: 5
              currsigs.addElement(rotateTo5_1);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2680(int [] tdone, int [] ends){
        switch(S2150){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S2092){
          case 0 : 
            if(bottlePos3.getprestatus()){//sysj\rotaryPlant.sysj line: 40, column: 10
              S2092=1;
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
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 41, column: 10
              S2092=2;
              System.out.println("to 4");//sysj\rotaryPlant.sysj line: 43, column: 5
              rotateTo4_1.setPresent();//sysj\rotaryPlant.sysj line: 44, column: 5
              currsigs.addElement(rotateTo4_1);
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
            if(bottlePos4.getprestatus() && !rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 42, column: 10
              S2092=0;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              rotateTo4_1.setPresent();//sysj\rotaryPlant.sysj line: 44, column: 5
              currsigs.addElement(rotateTo4_1);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2679(int [] tdone, int [] ends){
        switch(S2088){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S2030){
          case 0 : 
            if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 29, column: 10
              S2030=1;
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
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 30, column: 10
              S2030=2;
              System.out.println("to 3");//sysj\rotaryPlant.sysj line: 32, column: 5
              rotateTo3_1.setPresent();//sysj\rotaryPlant.sysj line: 33, column: 5
              currsigs.addElement(rotateTo3_1);
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
            if(bottlePos3.getprestatus() && !rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 31, column: 10
              S2030=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              rotateTo3_1.setPresent();//sysj\rotaryPlant.sysj line: 33, column: 5
              currsigs.addElement(rotateTo3_1);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2678(int [] tdone, int [] ends){
        switch(S2026){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S1968){
          case 0 : 
            if(CbottlePos1.getprestatus()){//sysj\rotaryPlant.sysj line: 18, column: 10
              S1968=1;
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
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 19, column: 10
              S1968=2;
              System.out.println("to 2");//sysj\rotaryPlant.sysj line: 21, column: 5
              rotateTo2_1.setPresent();//sysj\rotaryPlant.sysj line: 22, column: 5
              currsigs.addElement(rotateTo2_1);
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
            if(bottlePos2.getprestatus() && !rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 20, column: 10
              S1968=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              rotateTo2_1.setPresent();//sysj\rotaryPlant.sysj line: 22, column: 5
              currsigs.addElement(rotateTo2_1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2675(int [] tdone, int [] ends){
        S2655=1;
    if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 159, column: 28
      rotateS.setPresent();//sysj\rotaryPlant.sysj line: 159, column: 37
      currsigs.addElement(rotateS);
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
    else {
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread2674(int [] tdone, int [] ends){
        S2647=1;
    if(bottlePos5.getprestatus()){//sysj\rotaryPlant.sysj line: 157, column: 28
      bottlePos5S.setPresent();//sysj\rotaryPlant.sysj line: 157, column: 41
      currsigs.addElement(bottlePos5S);
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread2673(int [] tdone, int [] ends){
        S2639=1;
    if(bottlePos4.getprestatus()){//sysj\rotaryPlant.sysj line: 155, column: 28
      bottlePos4S.setPresent();//sysj\rotaryPlant.sysj line: 155, column: 41
      currsigs.addElement(bottlePos4S);
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

  public void thread2672(int [] tdone, int [] ends){
        S2631=1;
    if(bottlePos3.getprestatus()){//sysj\rotaryPlant.sysj line: 153, column: 28
      bottlePos3S.setPresent();//sysj\rotaryPlant.sysj line: 153, column: 41
      currsigs.addElement(bottlePos3S);
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

  public void thread2671(int [] tdone, int [] ends){
        S2623=1;
    S2617=0;
    if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 151, column: 28
      bottlePos2S.setPresent();//sysj\rotaryPlant.sysj line: 151, column: 41
      currsigs.addElement(bottlePos2S);
      S2617=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      S2617=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread2670(int [] tdone, int [] ends){
        S2657=1;
    thread2671(tdone,ends);
    thread2672(tdone,ends);
    thread2673(tdone,ends);
    thread2674(tdone,ends);
    thread2675(tdone,ends);
    int biggest2676 = 0;
    if(ends[12]>=biggest2676){
      biggest2676=ends[12];
    }
    if(ends[13]>=biggest2676){
      biggest2676=ends[13];
    }
    if(ends[14]>=biggest2676){
      biggest2676=ends[14];
    }
    if(ends[15]>=biggest2676){
      biggest2676=ends[15];
    }
    if(ends[16]>=biggest2676){
      biggest2676=ends[16];
    }
    if(biggest2676 == 1){
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread2669(int [] tdone, int [] ends){
        S2615=1;
    S2539=0;
    aligned.setPresent();//sysj\rotaryPlant.sysj line: 131, column: 5
    currsigs.addElement(aligned);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread2668(int [] tdone, int [] ends){
        S2532=1;
    S2456=0;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread2667(int [] tdone, int [] ends){
        S2452=1;
    S2376=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread2666(int [] tdone, int [] ends){
        S2372=1;
    S2296=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread2665(int [] tdone, int [] ends){
        S2292=1;
    S2216=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread2664(int [] tdone, int [] ends){
        S2212=1;
    S2154=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread2663(int [] tdone, int [] ends){
        S2150=1;
    S2092=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread2662(int [] tdone, int [] ends){
        S2088=1;
    S2030=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread2661(int [] tdone, int [] ends){
        S2026=1;
    S1968=0;
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
      switch(S2659){
        case 0 : 
          S2659=0;
          break RUN;
        
        case 1 : 
          S2659=2;
          S2659=2;
          rotateTo2_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo3_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo4_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo5_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          thread2661(tdone,ends);
          thread2662(tdone,ends);
          thread2663(tdone,ends);
          thread2664(tdone,ends);
          thread2665(tdone,ends);
          thread2666(tdone,ends);
          thread2667(tdone,ends);
          thread2668(tdone,ends);
          thread2669(tdone,ends);
          thread2670(tdone,ends);
          int biggest2677 = 0;
          if(ends[2]>=biggest2677){
            biggest2677=ends[2];
          }
          if(ends[3]>=biggest2677){
            biggest2677=ends[3];
          }
          if(ends[4]>=biggest2677){
            biggest2677=ends[4];
          }
          if(ends[5]>=biggest2677){
            biggest2677=ends[5];
          }
          if(ends[6]>=biggest2677){
            biggest2677=ends[6];
          }
          if(ends[7]>=biggest2677){
            biggest2677=ends[7];
          }
          if(ends[8]>=biggest2677){
            biggest2677=ends[8];
          }
          if(ends[9]>=biggest2677){
            biggest2677=ends[9];
          }
          if(ends[10]>=biggest2677){
            biggest2677=ends[10];
          }
          if(ends[11]>=biggest2677){
            biggest2677=ends[11];
          }
          if(biggest2677 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          rotateTo2_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo3_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo4_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo5_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          thread2678(tdone,ends);
          thread2679(tdone,ends);
          thread2680(tdone,ends);
          thread2681(tdone,ends);
          thread2682(tdone,ends);
          thread2683(tdone,ends);
          thread2684(tdone,ends);
          thread2685(tdone,ends);
          thread2686(tdone,ends);
          thread2687(tdone,ends);
          int biggest2694 = 0;
          if(ends[2]>=biggest2694){
            biggest2694=ends[2];
          }
          if(ends[3]>=biggest2694){
            biggest2694=ends[3];
          }
          if(ends[4]>=biggest2694){
            biggest2694=ends[4];
          }
          if(ends[5]>=biggest2694){
            biggest2694=ends[5];
          }
          if(ends[6]>=biggest2694){
            biggest2694=ends[6];
          }
          if(ends[7]>=biggest2694){
            biggest2694=ends[7];
          }
          if(ends[8]>=biggest2694){
            biggest2694=ends[8];
          }
          if(ends[9]>=biggest2694){
            biggest2694=ends[9];
          }
          if(ends[10]>=biggest2694){
            biggest2694=ends[10];
          }
          if(ends[11]>=biggest2694){
            biggest2694=ends[11];
          }
          if(biggest2694 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2694 == 0){
            S2659=0;
            active[1]=0;
            ends[1]=0;
            S2659=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    rotateTo2_1 = new Signal();
    rotateTo3_1 = new Signal();
    rotateTo4_1 = new Signal();
    rotateTo5_1 = new Signal();
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
          rotate.gethook();
          CbottlePos1.gethook();
          Cmotor.gethook();
          df = true;
        }
        runClockDomain();
      }
      tick.setpreclear();
      rotate.setpreclear();
      CbottlePos1.setpreclear();
      Cmotor.setpreclear();
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
      rotateTo2_1.setpreclear();
      rotateTo3_1.setpreclear();
      rotateTo4_1.setpreclear();
      rotateTo5_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = tick.getStatus() ? tick.setprepresent() : tick.setpreclear();
      tick.setpreval(tick.getValue());
      tick.setClear();
      dummyint = rotate.getStatus() ? rotate.setprepresent() : rotate.setpreclear();
      rotate.setpreval(rotate.getValue());
      rotate.setClear();
      dummyint = CbottlePos1.getStatus() ? CbottlePos1.setprepresent() : CbottlePos1.setpreclear();
      CbottlePos1.setpreval(CbottlePos1.getValue());
      CbottlePos1.setClear();
      dummyint = Cmotor.getStatus() ? Cmotor.setprepresent() : Cmotor.setpreclear();
      Cmotor.setpreval(Cmotor.getValue());
      Cmotor.setClear();
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
      rotateTo2_1.setClear();
      rotateTo3_1.setClear();
      rotateTo4_1.setClear();
      rotateTo5_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        tick.gethook();
        rotate.gethook();
        CbottlePos1.gethook();
        Cmotor.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
