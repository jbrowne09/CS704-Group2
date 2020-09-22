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
  private int S5842 = 1;
  private int S5383 = 1;
  private int S5337 = 1;
  private int S5433 = 1;
  private int S5387 = 1;
  private int S5483 = 1;
  private int S5437 = 1;
  private int S5533 = 1;
  private int S5487 = 1;
  private int S5583 = 1;
  private int S5537 = 1;
  private int S5633 = 1;
  private int S5587 = 1;
  private int S5683 = 1;
  private int S5637 = 1;
  private int S5733 = 1;
  private int S5687 = 1;
  private int S5798 = 1;
  private int S5740 = 1;
  private int S5840 = 1;
  private int S5806 = 1;
  private int S5800 = 1;
  private int S5814 = 1;
  private int S5822 = 1;
  private int S5830 = 1;
  private int S5838 = 1;
  
  private int[] ends = new int[17];
  private int[] tdone = new int[17];
  
  public void thread5875(int [] tdone, int [] ends){
        switch(S5838){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 148, column: 28
          rotateS.setPresent();//sysj\rotaryPlant.sysj line: 148, column: 37
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

  public void thread5874(int [] tdone, int [] ends){
        switch(S5830){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(bottlePos5.getprestatus()){//sysj\rotaryPlant.sysj line: 146, column: 28
          bottlePos5S.setPresent();//sysj\rotaryPlant.sysj line: 146, column: 41
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

  public void thread5873(int [] tdone, int [] ends){
        switch(S5822){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(bottlePos4.getprestatus()){//sysj\rotaryPlant.sysj line: 144, column: 28
          bottlePos4S.setPresent();//sysj\rotaryPlant.sysj line: 144, column: 41
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

  public void thread5872(int [] tdone, int [] ends){
        switch(S5814){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(bottlePos3.getprestatus()){//sysj\rotaryPlant.sysj line: 142, column: 28
          bottlePos3S.setPresent();//sysj\rotaryPlant.sysj line: 142, column: 41
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

  public void thread5871(int [] tdone, int [] ends){
        switch(S5806){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S5800){
          case 0 : 
            S5800=0;
            if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 140, column: 28
              bottlePos2S.setPresent();//sysj\rotaryPlant.sysj line: 140, column: 41
              currsigs.addElement(bottlePos2S);
              S5800=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              S5800=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
          case 1 : 
            S5800=1;
            S5800=0;
            if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 140, column: 28
              bottlePos2S.setPresent();//sysj\rotaryPlant.sysj line: 140, column: 41
              currsigs.addElement(bottlePos2S);
              S5800=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              S5800=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread5870(int [] tdone, int [] ends){
        switch(S5840){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        thread5871(tdone,ends);
        thread5872(tdone,ends);
        thread5873(tdone,ends);
        thread5874(tdone,ends);
        thread5875(tdone,ends);
        int biggest5876 = 0;
        if(ends[12]>=biggest5876){
          biggest5876=ends[12];
        }
        if(ends[13]>=biggest5876){
          biggest5876=ends[13];
        }
        if(ends[14]>=biggest5876){
          biggest5876=ends[14];
        }
        if(ends[15]>=biggest5876){
          biggest5876=ends[15];
        }
        if(ends[16]>=biggest5876){
          biggest5876=ends[16];
        }
        if(biggest5876 == 1){
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        //FINXME code
        if(biggest5876 == 0){
          S5840=0;
          active[11]=0;
          ends[11]=0;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread5869(int [] tdone, int [] ends){
        switch(S5798){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S5740){
          case 0 : 
            if(tick.getprestatus() && (CbottlePos1.getprestatus() || bottlePos2.getprestatus() || bottlePos3.getprestatus() || bottlePos4.getprestatus())){//sysj\rotaryPlant.sysj line: 122, column: 10
              S5740=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 123, column: 5
              currsigs.addElement(aligned);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 1 : 
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 126, column: 10
              S5740=2;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 127, column: 10
              S5740=3;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 128, column: 10
              S5740=4;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 129, column: 10
              S5740=5;
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 132, column: 5
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
            if(!rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 131, column: 10
              S5740=0;
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 123, column: 5
              currsigs.addElement(aligned);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 132, column: 5
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

  public void thread5868(int [] tdone, int [] ends){
        switch(S5733){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S5687){
          case 0 : 
            if(rotateTo5_1.getprestatus()){//sysj\rotaryPlant.sysj line: 109, column: 10
              S5687=1;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 110, column: 10
              S5687=2;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 111, column: 10
              S5687=3;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 113, column: 10
              S5687=4;
              bottlePos5.setPresent();//sysj\rotaryPlant.sysj line: 115, column: 5
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 114, column: 10
              S5687=0;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              bottlePos5.setPresent();//sysj\rotaryPlant.sysj line: 115, column: 5
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

  public void thread5867(int [] tdone, int [] ends){
        switch(S5683){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S5637){
          case 0 : 
            if(rotateTo4_1.getprestatus()){//sysj\rotaryPlant.sysj line: 96, column: 10
              S5637=1;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 97, column: 10
              S5637=2;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 98, column: 10
              S5637=3;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 100, column: 10
              S5637=4;
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
          
          case 4 : 
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 101, column: 10
              S5637=0;
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

  public void thread5866(int [] tdone, int [] ends){
        switch(S5633){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S5587){
          case 0 : 
            if(rotateTo3_1.getprestatus()){//sysj\rotaryPlant.sysj line: 83, column: 10
              S5587=1;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 84, column: 10
              S5587=2;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 85, column: 10
              S5587=3;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 87, column: 10
              S5587=4;
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
          
          case 4 : 
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 88, column: 10
              S5587=0;
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

  public void thread5865(int [] tdone, int [] ends){
        switch(S5583){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S5537){
          case 0 : 
            if(rotateTo2_1.getprestatus()){//sysj\rotaryPlant.sysj line: 70, column: 10
              S5537=1;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 71, column: 10
              S5537=2;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 72, column: 10
              S5537=3;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 74, column: 10
              S5537=4;
              bottlePos2.setPresent();//sysj\rotaryPlant.sysj line: 76, column: 5
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 75, column: 10
              S5537=0;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              bottlePos2.setPresent();//sysj\rotaryPlant.sysj line: 76, column: 5
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

  public void thread5864(int [] tdone, int [] ends){
        switch(S5533){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S5487){
          case 0 : 
            if(bottlePos4.getprestatus()){//sysj\rotaryPlant.sysj line: 57, column: 10
              S5487=1;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 59, column: 10
              S5487=2;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 60, column: 10
              S5487=3;
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
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 61, column: 10
              S5487=4;
              rotateTo5_1.setPresent();//sysj\rotaryPlant.sysj line: 63, column: 5
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
          
          case 4 : 
            if(bottlePos5.getprestatus()){//sysj\rotaryPlant.sysj line: 62, column: 10
              S5487=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              rotateTo5_1.setPresent();//sysj\rotaryPlant.sysj line: 63, column: 5
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

  public void thread5863(int [] tdone, int [] ends){
        switch(S5483){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S5437){
          case 0 : 
            if(bottlePos3.getprestatus()){//sysj\rotaryPlant.sysj line: 44, column: 10
              S5437=1;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 46, column: 10
              S5437=2;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 47, column: 10
              S5437=3;
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
              S5437=4;
              rotateTo4_1.setPresent();//sysj\rotaryPlant.sysj line: 50, column: 5
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
          
          case 4 : 
            if(bottlePos4.getprestatus()){//sysj\rotaryPlant.sysj line: 49, column: 10
              S5437=0;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              rotateTo4_1.setPresent();//sysj\rotaryPlant.sysj line: 50, column: 5
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

  public void thread5862(int [] tdone, int [] ends){
        switch(S5433){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S5387){
          case 0 : 
            if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 31, column: 10
              S5387=1;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 33, column: 10
              S5387=2;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 34, column: 10
              S5387=3;
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
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 35, column: 10
              S5387=4;
              rotateTo3_1.setPresent();//sysj\rotaryPlant.sysj line: 37, column: 5
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
          
          case 4 : 
            if(bottlePos3.getprestatus()){//sysj\rotaryPlant.sysj line: 36, column: 10
              S5387=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              rotateTo3_1.setPresent();//sysj\rotaryPlant.sysj line: 37, column: 5
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

  public void thread5861(int [] tdone, int [] ends){
        switch(S5383){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S5337){
          case 0 : 
            if(CbottlePos1.getprestatus()){//sysj\rotaryPlant.sysj line: 18, column: 10
              S5337=1;
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
              S5337=2;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 21, column: 10
              S5337=3;
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
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 22, column: 10
              S5337=4;
              rotateTo2_1.setPresent();//sysj\rotaryPlant.sysj line: 24, column: 5
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
          
          case 4 : 
            if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 23, column: 10
              S5337=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              rotateTo2_1.setPresent();//sysj\rotaryPlant.sysj line: 24, column: 5
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

  public void thread5858(int [] tdone, int [] ends){
        S5838=1;
    if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 148, column: 28
      rotateS.setPresent();//sysj\rotaryPlant.sysj line: 148, column: 37
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

  public void thread5857(int [] tdone, int [] ends){
        S5830=1;
    if(bottlePos5.getprestatus()){//sysj\rotaryPlant.sysj line: 146, column: 28
      bottlePos5S.setPresent();//sysj\rotaryPlant.sysj line: 146, column: 41
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

  public void thread5856(int [] tdone, int [] ends){
        S5822=1;
    if(bottlePos4.getprestatus()){//sysj\rotaryPlant.sysj line: 144, column: 28
      bottlePos4S.setPresent();//sysj\rotaryPlant.sysj line: 144, column: 41
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

  public void thread5855(int [] tdone, int [] ends){
        S5814=1;
    if(bottlePos3.getprestatus()){//sysj\rotaryPlant.sysj line: 142, column: 28
      bottlePos3S.setPresent();//sysj\rotaryPlant.sysj line: 142, column: 41
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

  public void thread5854(int [] tdone, int [] ends){
        S5806=1;
    S5800=0;
    if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 140, column: 28
      bottlePos2S.setPresent();//sysj\rotaryPlant.sysj line: 140, column: 41
      currsigs.addElement(bottlePos2S);
      S5800=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      S5800=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread5853(int [] tdone, int [] ends){
        S5840=1;
    thread5854(tdone,ends);
    thread5855(tdone,ends);
    thread5856(tdone,ends);
    thread5857(tdone,ends);
    thread5858(tdone,ends);
    int biggest5859 = 0;
    if(ends[12]>=biggest5859){
      biggest5859=ends[12];
    }
    if(ends[13]>=biggest5859){
      biggest5859=ends[13];
    }
    if(ends[14]>=biggest5859){
      biggest5859=ends[14];
    }
    if(ends[15]>=biggest5859){
      biggest5859=ends[15];
    }
    if(ends[16]>=biggest5859){
      biggest5859=ends[16];
    }
    if(biggest5859 == 1){
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread5852(int [] tdone, int [] ends){
        S5798=1;
    S5740=0;
    aligned.setPresent();//sysj\rotaryPlant.sysj line: 123, column: 5
    currsigs.addElement(aligned);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread5851(int [] tdone, int [] ends){
        S5733=1;
    S5687=0;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread5850(int [] tdone, int [] ends){
        S5683=1;
    S5637=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread5849(int [] tdone, int [] ends){
        S5633=1;
    S5587=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread5848(int [] tdone, int [] ends){
        S5583=1;
    S5537=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread5847(int [] tdone, int [] ends){
        S5533=1;
    S5487=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread5846(int [] tdone, int [] ends){
        S5483=1;
    S5437=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread5845(int [] tdone, int [] ends){
        S5433=1;
    S5387=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread5844(int [] tdone, int [] ends){
        S5383=1;
    S5337=0;
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
      switch(S5842){
        case 0 : 
          S5842=0;
          break RUN;
        
        case 1 : 
          S5842=2;
          S5842=2;
          rotateTo2_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo3_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo4_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo5_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          thread5844(tdone,ends);
          thread5845(tdone,ends);
          thread5846(tdone,ends);
          thread5847(tdone,ends);
          thread5848(tdone,ends);
          thread5849(tdone,ends);
          thread5850(tdone,ends);
          thread5851(tdone,ends);
          thread5852(tdone,ends);
          thread5853(tdone,ends);
          int biggest5860 = 0;
          if(ends[2]>=biggest5860){
            biggest5860=ends[2];
          }
          if(ends[3]>=biggest5860){
            biggest5860=ends[3];
          }
          if(ends[4]>=biggest5860){
            biggest5860=ends[4];
          }
          if(ends[5]>=biggest5860){
            biggest5860=ends[5];
          }
          if(ends[6]>=biggest5860){
            biggest5860=ends[6];
          }
          if(ends[7]>=biggest5860){
            biggest5860=ends[7];
          }
          if(ends[8]>=biggest5860){
            biggest5860=ends[8];
          }
          if(ends[9]>=biggest5860){
            biggest5860=ends[9];
          }
          if(ends[10]>=biggest5860){
            biggest5860=ends[10];
          }
          if(ends[11]>=biggest5860){
            biggest5860=ends[11];
          }
          if(biggest5860 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          rotateTo2_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo3_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo4_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo5_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          thread5861(tdone,ends);
          thread5862(tdone,ends);
          thread5863(tdone,ends);
          thread5864(tdone,ends);
          thread5865(tdone,ends);
          thread5866(tdone,ends);
          thread5867(tdone,ends);
          thread5868(tdone,ends);
          thread5869(tdone,ends);
          thread5870(tdone,ends);
          int biggest5877 = 0;
          if(ends[2]>=biggest5877){
            biggest5877=ends[2];
          }
          if(ends[3]>=biggest5877){
            biggest5877=ends[3];
          }
          if(ends[4]>=biggest5877){
            biggest5877=ends[4];
          }
          if(ends[5]>=biggest5877){
            biggest5877=ends[5];
          }
          if(ends[6]>=biggest5877){
            biggest5877=ends[6];
          }
          if(ends[7]>=biggest5877){
            biggest5877=ends[7];
          }
          if(ends[8]>=biggest5877){
            biggest5877=ends[8];
          }
          if(ends[9]>=biggest5877){
            biggest5877=ends[9];
          }
          if(ends[10]>=biggest5877){
            biggest5877=ends[10];
          }
          if(ends[11]>=biggest5877){
            biggest5877=ends[11];
          }
          if(biggest5877 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest5877 == 0){
            S5842=0;
            active[1]=0;
            ends[1]=0;
            S5842=0;
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
