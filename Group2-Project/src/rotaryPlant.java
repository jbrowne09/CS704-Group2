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
  private int S2928 = 1;
  private int S2367 = 1;
  private int S2333 = 1;
  private int S2405 = 1;
  private int S2371 = 1;
  private int S2443 = 1;
  private int S2409 = 1;
  private int S2481 = 1;
  private int S2447 = 1;
  private int S2561 = 1;
  private int S2485 = 1;
  private int S2641 = 1;
  private int S2565 = 1;
  private int S2721 = 1;
  private int S2645 = 1;
  private int S2801 = 1;
  private int S2725 = 1;
  private int S2884 = 1;
  private int S2808 = 1;
  private int S2926 = 1;
  private int S2892 = 1;
  private int S2886 = 1;
  private int S2900 = 1;
  private int S2908 = 1;
  private int S2916 = 1;
  private int S2924 = 1;
  
  private int[] ends = new int[17];
  private int[] tdone = new int[17];
  
  public void thread2961(int [] tdone, int [] ends){
        switch(S2924){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 155, column: 28
          rotateS.setPresent();//sysj\rotaryPlant.sysj line: 155, column: 37
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

  public void thread2960(int [] tdone, int [] ends){
        switch(S2916){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(bottlePos5.getprestatus()){//sysj\rotaryPlant.sysj line: 153, column: 28
          bottlePos5S.setPresent();//sysj\rotaryPlant.sysj line: 153, column: 41
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

  public void thread2959(int [] tdone, int [] ends){
        switch(S2908){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(bottlePos4.getprestatus()){//sysj\rotaryPlant.sysj line: 151, column: 28
          bottlePos4S.setPresent();//sysj\rotaryPlant.sysj line: 151, column: 41
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

  public void thread2958(int [] tdone, int [] ends){
        switch(S2900){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(bottlePos3.getprestatus()){//sysj\rotaryPlant.sysj line: 149, column: 28
          bottlePos3S.setPresent();//sysj\rotaryPlant.sysj line: 149, column: 41
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

  public void thread2957(int [] tdone, int [] ends){
        switch(S2892){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S2886){
          case 0 : 
            S2886=0;
            if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 147, column: 28
              bottlePos2S.setPresent();//sysj\rotaryPlant.sysj line: 147, column: 41
              currsigs.addElement(bottlePos2S);
              S2886=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              S2886=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
          case 1 : 
            S2886=1;
            S2886=0;
            if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 147, column: 28
              bottlePos2S.setPresent();//sysj\rotaryPlant.sysj line: 147, column: 41
              currsigs.addElement(bottlePos2S);
              S2886=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              S2886=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2956(int [] tdone, int [] ends){
        switch(S2926){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        thread2957(tdone,ends);
        thread2958(tdone,ends);
        thread2959(tdone,ends);
        thread2960(tdone,ends);
        thread2961(tdone,ends);
        int biggest2962 = 0;
        if(ends[12]>=biggest2962){
          biggest2962=ends[12];
        }
        if(ends[13]>=biggest2962){
          biggest2962=ends[13];
        }
        if(ends[14]>=biggest2962){
          biggest2962=ends[14];
        }
        if(ends[15]>=biggest2962){
          biggest2962=ends[15];
        }
        if(ends[16]>=biggest2962){
          biggest2962=ends[16];
        }
        if(biggest2962 == 1){
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        //FINXME code
        if(biggest2962 == 0){
          S2926=0;
          active[11]=0;
          ends[11]=0;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread2955(int [] tdone, int [] ends){
        switch(S2884){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S2808){
          case 0 : 
            if(tick.getprestatus() && (CbottlePos1.getprestatus() || bottlePos2.getprestatus() || bottlePos3.getprestatus() || bottlePos4.getprestatus())){//sysj\rotaryPlant.sysj line: 126, column: 10
              S2808=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 127, column: 5
              currsigs.addElement(aligned);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 1 : 
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 130, column: 10
              S2808=2;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 131, column: 10
              S2808=3;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 132, column: 10
              S2808=4;
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 135, column: 5
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
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 134, column: 10
              S2808=5;
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 139, column: 5
              currsigs.addElement(aligned);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 135, column: 5
              currsigs.addElement(aligned);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 5 : 
            if(!rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 138, column: 10
              S2808=0;
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 127, column: 5
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
          
        }
        break;
      
    }
  }

  public void thread2954(int [] tdone, int [] ends){
        switch(S2801){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S2725){
          case 0 : 
            if(rotateTo5_1.getprestatus()){//sysj\rotaryPlant.sysj line: 109, column: 10
              S2725=1;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 110, column: 10
              System.out.println("Rotating to 5");//sysj\rotaryPlant.sysj line: 112, column: 4
              S2725=2;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 113, column: 10
              S2725=3;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 114, column: 10
              S2725=4;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 115, column: 10
              S2725=5;
              System.out.println("putting at 5");//sysj\rotaryPlant.sysj line: 118, column: 5
              bottlePos5.setPresent();//sysj\rotaryPlant.sysj line: 119, column: 5
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 117, column: 10
              S2725=0;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              bottlePos5.setPresent();//sysj\rotaryPlant.sysj line: 119, column: 5
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

  public void thread2953(int [] tdone, int [] ends){
        switch(S2721){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S2645){
          case 0 : 
            if(rotateTo4_1.getprestatus()){//sysj\rotaryPlant.sysj line: 92, column: 10
              S2645=1;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 93, column: 10
              System.out.println("Rotating to 4");//sysj\rotaryPlant.sysj line: 95, column: 4
              S2645=2;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 96, column: 10
              S2645=3;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 97, column: 10
              S2645=4;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 98, column: 10
              S2645=5;
              System.out.println("putting at 4");//sysj\rotaryPlant.sysj line: 101, column: 5
              bottlePos4.setPresent();//sysj\rotaryPlant.sysj line: 102, column: 5
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 100, column: 10
              S2645=0;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              bottlePos4.setPresent();//sysj\rotaryPlant.sysj line: 102, column: 5
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

  public void thread2952(int [] tdone, int [] ends){
        switch(S2641){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S2565){
          case 0 : 
            if(rotateTo3_1.getprestatus()){//sysj\rotaryPlant.sysj line: 75, column: 10
              S2565=1;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 76, column: 10
              System.out.println("Rotating to 3");//sysj\rotaryPlant.sysj line: 78, column: 4
              S2565=2;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 79, column: 10
              S2565=3;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 80, column: 10
              S2565=4;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 81, column: 10
              S2565=5;
              System.out.println("putting at 3");//sysj\rotaryPlant.sysj line: 84, column: 5
              bottlePos3.setPresent();//sysj\rotaryPlant.sysj line: 85, column: 5
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 83, column: 10
              S2565=0;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              bottlePos3.setPresent();//sysj\rotaryPlant.sysj line: 85, column: 5
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

  public void thread2951(int [] tdone, int [] ends){
        switch(S2561){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S2485){
          case 0 : 
            if(rotateTo2_1.getprestatus()){//sysj\rotaryPlant.sysj line: 58, column: 10
              S2485=1;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 59, column: 10
              System.out.println("Rotating to 2");//sysj\rotaryPlant.sysj line: 61, column: 4
              S2485=2;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 62, column: 10
              S2485=3;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 63, column: 10
              S2485=4;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 64, column: 10
              S2485=5;
              System.out.println("putting at 2");//sysj\rotaryPlant.sysj line: 67, column: 5
              bottlePos2.setPresent();//sysj\rotaryPlant.sysj line: 68, column: 5
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 66, column: 10
              S2485=0;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              bottlePos2.setPresent();//sysj\rotaryPlant.sysj line: 68, column: 5
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

  public void thread2950(int [] tdone, int [] ends){
        switch(S2481){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S2447){
          case 0 : 
            if(bottlePos4.getprestatus()){//sysj\rotaryPlant.sysj line: 48, column: 10
              S2447=1;
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
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 49, column: 10
              S2447=2;
              rotateTo5_1.setPresent();//sysj\rotaryPlant.sysj line: 51, column: 5
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
            if(bottlePos5.getprestatus() && !rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 50, column: 10
              S2447=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              rotateTo5_1.setPresent();//sysj\rotaryPlant.sysj line: 51, column: 5
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

  public void thread2949(int [] tdone, int [] ends){
        switch(S2443){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S2409){
          case 0 : 
            if(bottlePos3.getprestatus()){//sysj\rotaryPlant.sysj line: 38, column: 10
              S2409=1;
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
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 39, column: 10
              S2409=2;
              rotateTo4_1.setPresent();//sysj\rotaryPlant.sysj line: 41, column: 5
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
            if(bottlePos4.getprestatus() && !rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 40, column: 10
              S2409=0;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              rotateTo4_1.setPresent();//sysj\rotaryPlant.sysj line: 41, column: 5
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

  public void thread2948(int [] tdone, int [] ends){
        switch(S2405){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S2371){
          case 0 : 
            if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 28, column: 10
              S2371=1;
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
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 29, column: 10
              S2371=2;
              rotateTo3_1.setPresent();//sysj\rotaryPlant.sysj line: 31, column: 5
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
            if(bottlePos3.getprestatus() && !rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 30, column: 10
              S2371=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              rotateTo3_1.setPresent();//sysj\rotaryPlant.sysj line: 31, column: 5
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

  public void thread2947(int [] tdone, int [] ends){
        switch(S2367){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S2333){
          case 0 : 
            if(CbottlePos1.getprestatus()){//sysj\rotaryPlant.sysj line: 18, column: 10
              S2333=1;
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
              S2333=2;
              rotateTo2_1.setPresent();//sysj\rotaryPlant.sysj line: 21, column: 5
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
              S2333=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              rotateTo2_1.setPresent();//sysj\rotaryPlant.sysj line: 21, column: 5
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

  public void thread2944(int [] tdone, int [] ends){
        S2924=1;
    if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 155, column: 28
      rotateS.setPresent();//sysj\rotaryPlant.sysj line: 155, column: 37
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

  public void thread2943(int [] tdone, int [] ends){
        S2916=1;
    if(bottlePos5.getprestatus()){//sysj\rotaryPlant.sysj line: 153, column: 28
      bottlePos5S.setPresent();//sysj\rotaryPlant.sysj line: 153, column: 41
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

  public void thread2942(int [] tdone, int [] ends){
        S2908=1;
    if(bottlePos4.getprestatus()){//sysj\rotaryPlant.sysj line: 151, column: 28
      bottlePos4S.setPresent();//sysj\rotaryPlant.sysj line: 151, column: 41
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

  public void thread2941(int [] tdone, int [] ends){
        S2900=1;
    if(bottlePos3.getprestatus()){//sysj\rotaryPlant.sysj line: 149, column: 28
      bottlePos3S.setPresent();//sysj\rotaryPlant.sysj line: 149, column: 41
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

  public void thread2940(int [] tdone, int [] ends){
        S2892=1;
    S2886=0;
    if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 147, column: 28
      bottlePos2S.setPresent();//sysj\rotaryPlant.sysj line: 147, column: 41
      currsigs.addElement(bottlePos2S);
      S2886=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      S2886=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread2939(int [] tdone, int [] ends){
        S2926=1;
    thread2940(tdone,ends);
    thread2941(tdone,ends);
    thread2942(tdone,ends);
    thread2943(tdone,ends);
    thread2944(tdone,ends);
    int biggest2945 = 0;
    if(ends[12]>=biggest2945){
      biggest2945=ends[12];
    }
    if(ends[13]>=biggest2945){
      biggest2945=ends[13];
    }
    if(ends[14]>=biggest2945){
      biggest2945=ends[14];
    }
    if(ends[15]>=biggest2945){
      biggest2945=ends[15];
    }
    if(ends[16]>=biggest2945){
      biggest2945=ends[16];
    }
    if(biggest2945 == 1){
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread2938(int [] tdone, int [] ends){
        S2884=1;
    S2808=0;
    aligned.setPresent();//sysj\rotaryPlant.sysj line: 127, column: 5
    currsigs.addElement(aligned);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread2937(int [] tdone, int [] ends){
        S2801=1;
    S2725=0;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread2936(int [] tdone, int [] ends){
        S2721=1;
    S2645=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread2935(int [] tdone, int [] ends){
        S2641=1;
    S2565=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread2934(int [] tdone, int [] ends){
        S2561=1;
    S2485=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread2933(int [] tdone, int [] ends){
        S2481=1;
    S2447=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread2932(int [] tdone, int [] ends){
        S2443=1;
    S2409=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread2931(int [] tdone, int [] ends){
        S2405=1;
    S2371=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread2930(int [] tdone, int [] ends){
        S2367=1;
    S2333=0;
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
      switch(S2928){
        case 0 : 
          S2928=0;
          break RUN;
        
        case 1 : 
          S2928=2;
          S2928=2;
          rotateTo2_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo3_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo4_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo5_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          thread2930(tdone,ends);
          thread2931(tdone,ends);
          thread2932(tdone,ends);
          thread2933(tdone,ends);
          thread2934(tdone,ends);
          thread2935(tdone,ends);
          thread2936(tdone,ends);
          thread2937(tdone,ends);
          thread2938(tdone,ends);
          thread2939(tdone,ends);
          int biggest2946 = 0;
          if(ends[2]>=biggest2946){
            biggest2946=ends[2];
          }
          if(ends[3]>=biggest2946){
            biggest2946=ends[3];
          }
          if(ends[4]>=biggest2946){
            biggest2946=ends[4];
          }
          if(ends[5]>=biggest2946){
            biggest2946=ends[5];
          }
          if(ends[6]>=biggest2946){
            biggest2946=ends[6];
          }
          if(ends[7]>=biggest2946){
            biggest2946=ends[7];
          }
          if(ends[8]>=biggest2946){
            biggest2946=ends[8];
          }
          if(ends[9]>=biggest2946){
            biggest2946=ends[9];
          }
          if(ends[10]>=biggest2946){
            biggest2946=ends[10];
          }
          if(ends[11]>=biggest2946){
            biggest2946=ends[11];
          }
          if(biggest2946 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          rotateTo2_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo3_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo4_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo5_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          thread2947(tdone,ends);
          thread2948(tdone,ends);
          thread2949(tdone,ends);
          thread2950(tdone,ends);
          thread2951(tdone,ends);
          thread2952(tdone,ends);
          thread2953(tdone,ends);
          thread2954(tdone,ends);
          thread2955(tdone,ends);
          thread2956(tdone,ends);
          int biggest2963 = 0;
          if(ends[2]>=biggest2963){
            biggest2963=ends[2];
          }
          if(ends[3]>=biggest2963){
            biggest2963=ends[3];
          }
          if(ends[4]>=biggest2963){
            biggest2963=ends[4];
          }
          if(ends[5]>=biggest2963){
            biggest2963=ends[5];
          }
          if(ends[6]>=biggest2963){
            biggest2963=ends[6];
          }
          if(ends[7]>=biggest2963){
            biggest2963=ends[7];
          }
          if(ends[8]>=biggest2963){
            biggest2963=ends[8];
          }
          if(ends[9]>=biggest2963){
            biggest2963=ends[9];
          }
          if(ends[10]>=biggest2963){
            biggest2963=ends[10];
          }
          if(ends[11]>=biggest2963){
            biggest2963=ends[11];
          }
          if(biggest2963 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2963 == 0){
            S2928=0;
            active[1]=0;
            ends[1]=0;
            S2928=0;
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
