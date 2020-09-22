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
  private int S5828 = 1;
  private int S5387 = 1;
  private int S5347 = 1;
  private int S5431 = 1;
  private int S5391 = 1;
  private int S5475 = 1;
  private int S5435 = 1;
  private int S5519 = 1;
  private int S5479 = 1;
  private int S5569 = 1;
  private int S5523 = 1;
  private int S5619 = 1;
  private int S5573 = 1;
  private int S5669 = 1;
  private int S5623 = 1;
  private int S5719 = 1;
  private int S5673 = 1;
  private int S5784 = 1;
  private int S5726 = 1;
  private int S5826 = 1;
  private int S5792 = 1;
  private int S5786 = 1;
  private int S5800 = 1;
  private int S5808 = 1;
  private int S5816 = 1;
  private int S5824 = 1;
  
  private int[] ends = new int[17];
  private int[] tdone = new int[17];
  
  public void thread5861(int [] tdone, int [] ends){
        switch(S5824){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 144, column: 28
          rotateS.setPresent();//sysj\rotaryPlant.sysj line: 144, column: 37
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

  public void thread5860(int [] tdone, int [] ends){
        switch(S5816){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(bottlePos5.getprestatus()){//sysj\rotaryPlant.sysj line: 142, column: 28
          bottlePos5S.setPresent();//sysj\rotaryPlant.sysj line: 142, column: 41
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

  public void thread5859(int [] tdone, int [] ends){
        switch(S5808){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(bottlePos4.getprestatus()){//sysj\rotaryPlant.sysj line: 140, column: 28
          bottlePos4S.setPresent();//sysj\rotaryPlant.sysj line: 140, column: 41
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

  public void thread5858(int [] tdone, int [] ends){
        switch(S5800){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(bottlePos3.getprestatus()){//sysj\rotaryPlant.sysj line: 138, column: 28
          bottlePos3S.setPresent();//sysj\rotaryPlant.sysj line: 138, column: 41
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

  public void thread5857(int [] tdone, int [] ends){
        switch(S5792){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S5786){
          case 0 : 
            S5786=0;
            if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 136, column: 28
              bottlePos2S.setPresent();//sysj\rotaryPlant.sysj line: 136, column: 41
              currsigs.addElement(bottlePos2S);
              S5786=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              S5786=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
          case 1 : 
            S5786=1;
            S5786=0;
            if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 136, column: 28
              bottlePos2S.setPresent();//sysj\rotaryPlant.sysj line: 136, column: 41
              currsigs.addElement(bottlePos2S);
              S5786=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              S5786=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread5856(int [] tdone, int [] ends){
        switch(S5826){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        thread5857(tdone,ends);
        thread5858(tdone,ends);
        thread5859(tdone,ends);
        thread5860(tdone,ends);
        thread5861(tdone,ends);
        int biggest5862 = 0;
        if(ends[12]>=biggest5862){
          biggest5862=ends[12];
        }
        if(ends[13]>=biggest5862){
          biggest5862=ends[13];
        }
        if(ends[14]>=biggest5862){
          biggest5862=ends[14];
        }
        if(ends[15]>=biggest5862){
          biggest5862=ends[15];
        }
        if(ends[16]>=biggest5862){
          biggest5862=ends[16];
        }
        if(biggest5862 == 1){
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        //FINXME code
        if(biggest5862 == 0){
          S5826=0;
          active[11]=0;
          ends[11]=0;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread5855(int [] tdone, int [] ends){
        switch(S5784){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S5726){
          case 0 : 
            if(tick.getprestatus() && (CbottlePos1.getprestatus() || bottlePos2.getprestatus() || bottlePos3.getprestatus() || bottlePos4.getprestatus())){//sysj\rotaryPlant.sysj line: 118, column: 10
              S5726=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 119, column: 5
              currsigs.addElement(aligned);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 1 : 
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 122, column: 10
              S5726=2;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 123, column: 10
              S5726=3;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 124, column: 10
              S5726=4;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 125, column: 10
              S5726=5;
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 128, column: 5
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
          
          case 5 : 
            if(!rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 127, column: 10
              S5726=0;
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 119, column: 5
              currsigs.addElement(aligned);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 128, column: 5
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

  public void thread5854(int [] tdone, int [] ends){
        switch(S5719){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S5673){
          case 0 : 
            if(rotateTo5_1.getprestatus()){//sysj\rotaryPlant.sysj line: 105, column: 10
              S5673=1;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 106, column: 10
              S5673=2;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 107, column: 10
              S5673=3;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 109, column: 10
              S5673=4;
              bottlePos5.setPresent();//sysj\rotaryPlant.sysj line: 111, column: 5
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
          
          case 4 : 
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 110, column: 10
              S5673=0;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              bottlePos5.setPresent();//sysj\rotaryPlant.sysj line: 111, column: 5
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

  public void thread5853(int [] tdone, int [] ends){
        switch(S5669){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S5623){
          case 0 : 
            if(rotateTo4_1.getprestatus()){//sysj\rotaryPlant.sysj line: 92, column: 10
              S5623=1;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 93, column: 10
              S5623=2;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 94, column: 10
              S5623=3;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 96, column: 10
              S5623=4;
              bottlePos4.setPresent();//sysj\rotaryPlant.sysj line: 98, column: 5
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
          
          case 4 : 
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 97, column: 10
              S5623=0;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              bottlePos4.setPresent();//sysj\rotaryPlant.sysj line: 98, column: 5
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

  public void thread5852(int [] tdone, int [] ends){
        switch(S5619){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S5573){
          case 0 : 
            if(rotateTo3_1.getprestatus()){//sysj\rotaryPlant.sysj line: 79, column: 10
              S5573=1;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 80, column: 10
              S5573=2;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 81, column: 10
              S5573=3;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 83, column: 10
              S5573=4;
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
          
          case 4 : 
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 84, column: 10
              S5573=0;
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

  public void thread5851(int [] tdone, int [] ends){
        switch(S5569){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S5523){
          case 0 : 
            if(rotateTo2_1.getprestatus()){//sysj\rotaryPlant.sysj line: 66, column: 10
              S5523=1;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 67, column: 10
              S5523=2;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 68, column: 10
              S5523=3;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 70, column: 10
              S5523=4;
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
          
          case 4 : 
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 71, column: 10
              S5523=0;
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

  public void thread5850(int [] tdone, int [] ends){
        switch(S5519){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S5479){
          case 0 : 
            if(bottlePos4.getprestatus()){//sysj\rotaryPlant.sysj line: 54, column: 10
              S5479=1;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 56, column: 10
              S5479=2;
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
            if(tick.getprestatus() && rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 57, column: 10
              S5479=3;
              rotateTo5_1.setPresent();//sysj\rotaryPlant.sysj line: 59, column: 5
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
          
          case 3 : 
            if(bottlePos5.getprestatus()){//sysj\rotaryPlant.sysj line: 58, column: 10
              S5479=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              rotateTo5_1.setPresent();//sysj\rotaryPlant.sysj line: 59, column: 5
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

  public void thread5849(int [] tdone, int [] ends){
        switch(S5475){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S5435){
          case 0 : 
            if(bottlePos3.getprestatus()){//sysj\rotaryPlant.sysj line: 42, column: 10
              S5435=1;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 44, column: 10
              S5435=2;
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
            if(tick.getprestatus() && rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 45, column: 10
              S5435=3;
              rotateTo4_1.setPresent();//sysj\rotaryPlant.sysj line: 47, column: 5
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
          
          case 3 : 
            if(bottlePos4.getprestatus()){//sysj\rotaryPlant.sysj line: 46, column: 10
              S5435=0;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              rotateTo4_1.setPresent();//sysj\rotaryPlant.sysj line: 47, column: 5
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

  public void thread5848(int [] tdone, int [] ends){
        switch(S5431){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S5391){
          case 0 : 
            if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 30, column: 10
              S5391=1;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 32, column: 10
              S5391=2;
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
            if(tick.getprestatus() && rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 33, column: 10
              S5391=3;
              rotateTo3_1.setPresent();//sysj\rotaryPlant.sysj line: 35, column: 5
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
          
          case 3 : 
            if(bottlePos3.getprestatus()){//sysj\rotaryPlant.sysj line: 34, column: 10
              S5391=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              rotateTo3_1.setPresent();//sysj\rotaryPlant.sysj line: 35, column: 5
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

  public void thread5847(int [] tdone, int [] ends){
        switch(S5387){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S5347){
          case 0 : 
            if(CbottlePos1.getprestatus()){//sysj\rotaryPlant.sysj line: 18, column: 10
              S5347=1;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 20, column: 10
              S5347=2;
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
            if(tick.getprestatus() && rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 21, column: 10
              S5347=3;
              rotateTo2_1.setPresent();//sysj\rotaryPlant.sysj line: 23, column: 5
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
          
          case 3 : 
            if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 22, column: 10
              S5347=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              rotateTo2_1.setPresent();//sysj\rotaryPlant.sysj line: 23, column: 5
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

  public void thread5844(int [] tdone, int [] ends){
        S5824=1;
    if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 144, column: 28
      rotateS.setPresent();//sysj\rotaryPlant.sysj line: 144, column: 37
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

  public void thread5843(int [] tdone, int [] ends){
        S5816=1;
    if(bottlePos5.getprestatus()){//sysj\rotaryPlant.sysj line: 142, column: 28
      bottlePos5S.setPresent();//sysj\rotaryPlant.sysj line: 142, column: 41
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

  public void thread5842(int [] tdone, int [] ends){
        S5808=1;
    if(bottlePos4.getprestatus()){//sysj\rotaryPlant.sysj line: 140, column: 28
      bottlePos4S.setPresent();//sysj\rotaryPlant.sysj line: 140, column: 41
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

  public void thread5841(int [] tdone, int [] ends){
        S5800=1;
    if(bottlePos3.getprestatus()){//sysj\rotaryPlant.sysj line: 138, column: 28
      bottlePos3S.setPresent();//sysj\rotaryPlant.sysj line: 138, column: 41
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

  public void thread5840(int [] tdone, int [] ends){
        S5792=1;
    S5786=0;
    if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 136, column: 28
      bottlePos2S.setPresent();//sysj\rotaryPlant.sysj line: 136, column: 41
      currsigs.addElement(bottlePos2S);
      S5786=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      S5786=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread5839(int [] tdone, int [] ends){
        S5826=1;
    thread5840(tdone,ends);
    thread5841(tdone,ends);
    thread5842(tdone,ends);
    thread5843(tdone,ends);
    thread5844(tdone,ends);
    int biggest5845 = 0;
    if(ends[12]>=biggest5845){
      biggest5845=ends[12];
    }
    if(ends[13]>=biggest5845){
      biggest5845=ends[13];
    }
    if(ends[14]>=biggest5845){
      biggest5845=ends[14];
    }
    if(ends[15]>=biggest5845){
      biggest5845=ends[15];
    }
    if(ends[16]>=biggest5845){
      biggest5845=ends[16];
    }
    if(biggest5845 == 1){
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread5838(int [] tdone, int [] ends){
        S5784=1;
    S5726=0;
    aligned.setPresent();//sysj\rotaryPlant.sysj line: 119, column: 5
    currsigs.addElement(aligned);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread5837(int [] tdone, int [] ends){
        S5719=1;
    S5673=0;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread5836(int [] tdone, int [] ends){
        S5669=1;
    S5623=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread5835(int [] tdone, int [] ends){
        S5619=1;
    S5573=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread5834(int [] tdone, int [] ends){
        S5569=1;
    S5523=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread5833(int [] tdone, int [] ends){
        S5519=1;
    S5479=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread5832(int [] tdone, int [] ends){
        S5475=1;
    S5435=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread5831(int [] tdone, int [] ends){
        S5431=1;
    S5391=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread5830(int [] tdone, int [] ends){
        S5387=1;
    S5347=0;
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
      switch(S5828){
        case 0 : 
          S5828=0;
          break RUN;
        
        case 1 : 
          S5828=2;
          S5828=2;
          rotateTo2_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo3_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo4_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo5_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          thread5830(tdone,ends);
          thread5831(tdone,ends);
          thread5832(tdone,ends);
          thread5833(tdone,ends);
          thread5834(tdone,ends);
          thread5835(tdone,ends);
          thread5836(tdone,ends);
          thread5837(tdone,ends);
          thread5838(tdone,ends);
          thread5839(tdone,ends);
          int biggest5846 = 0;
          if(ends[2]>=biggest5846){
            biggest5846=ends[2];
          }
          if(ends[3]>=biggest5846){
            biggest5846=ends[3];
          }
          if(ends[4]>=biggest5846){
            biggest5846=ends[4];
          }
          if(ends[5]>=biggest5846){
            biggest5846=ends[5];
          }
          if(ends[6]>=biggest5846){
            biggest5846=ends[6];
          }
          if(ends[7]>=biggest5846){
            biggest5846=ends[7];
          }
          if(ends[8]>=biggest5846){
            biggest5846=ends[8];
          }
          if(ends[9]>=biggest5846){
            biggest5846=ends[9];
          }
          if(ends[10]>=biggest5846){
            biggest5846=ends[10];
          }
          if(ends[11]>=biggest5846){
            biggest5846=ends[11];
          }
          if(biggest5846 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          rotateTo2_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo3_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo4_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo5_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          thread5847(tdone,ends);
          thread5848(tdone,ends);
          thread5849(tdone,ends);
          thread5850(tdone,ends);
          thread5851(tdone,ends);
          thread5852(tdone,ends);
          thread5853(tdone,ends);
          thread5854(tdone,ends);
          thread5855(tdone,ends);
          thread5856(tdone,ends);
          int biggest5863 = 0;
          if(ends[2]>=biggest5863){
            biggest5863=ends[2];
          }
          if(ends[3]>=biggest5863){
            biggest5863=ends[3];
          }
          if(ends[4]>=biggest5863){
            biggest5863=ends[4];
          }
          if(ends[5]>=biggest5863){
            biggest5863=ends[5];
          }
          if(ends[6]>=biggest5863){
            biggest5863=ends[6];
          }
          if(ends[7]>=biggest5863){
            biggest5863=ends[7];
          }
          if(ends[8]>=biggest5863){
            biggest5863=ends[8];
          }
          if(ends[9]>=biggest5863){
            biggest5863=ends[9];
          }
          if(ends[10]>=biggest5863){
            biggest5863=ends[10];
          }
          if(ends[11]>=biggest5863){
            biggest5863=ends[11];
          }
          if(biggest5863 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest5863 == 0){
            S5828=0;
            active[1]=0;
            ends[1]=0;
            S5828=0;
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
