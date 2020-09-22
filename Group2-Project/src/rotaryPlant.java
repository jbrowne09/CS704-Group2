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
  private int S7488 = 1;
  private int S7029 = 1;
  private int S6983 = 1;
  private int S7079 = 1;
  private int S7033 = 1;
  private int S7129 = 1;
  private int S7083 = 1;
  private int S7179 = 1;
  private int S7133 = 1;
  private int S7229 = 1;
  private int S7183 = 1;
  private int S7279 = 1;
  private int S7233 = 1;
  private int S7329 = 1;
  private int S7283 = 1;
  private int S7379 = 1;
  private int S7333 = 1;
  private int S7444 = 1;
  private int S7386 = 1;
  private int S7486 = 1;
  private int S7452 = 1;
  private int S7446 = 1;
  private int S7460 = 1;
  private int S7468 = 1;
  private int S7476 = 1;
  private int S7484 = 1;
  
  private int[] ends = new int[17];
  private int[] tdone = new int[17];
  
  public void thread7521(int [] tdone, int [] ends){
        switch(S7484){
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

  public void thread7520(int [] tdone, int [] ends){
        switch(S7476){
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

  public void thread7519(int [] tdone, int [] ends){
        switch(S7468){
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

  public void thread7518(int [] tdone, int [] ends){
        switch(S7460){
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

  public void thread7517(int [] tdone, int [] ends){
        switch(S7452){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S7446){
          case 0 : 
            S7446=0;
            if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 140, column: 28
              bottlePos2S.setPresent();//sysj\rotaryPlant.sysj line: 140, column: 41
              currsigs.addElement(bottlePos2S);
              S7446=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              S7446=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
          case 1 : 
            S7446=1;
            S7446=0;
            if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 140, column: 28
              bottlePos2S.setPresent();//sysj\rotaryPlant.sysj line: 140, column: 41
              currsigs.addElement(bottlePos2S);
              S7446=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              S7446=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread7516(int [] tdone, int [] ends){
        switch(S7486){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        thread7517(tdone,ends);
        thread7518(tdone,ends);
        thread7519(tdone,ends);
        thread7520(tdone,ends);
        thread7521(tdone,ends);
        int biggest7522 = 0;
        if(ends[12]>=biggest7522){
          biggest7522=ends[12];
        }
        if(ends[13]>=biggest7522){
          biggest7522=ends[13];
        }
        if(ends[14]>=biggest7522){
          biggest7522=ends[14];
        }
        if(ends[15]>=biggest7522){
          biggest7522=ends[15];
        }
        if(ends[16]>=biggest7522){
          biggest7522=ends[16];
        }
        if(biggest7522 == 1){
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        //FINXME code
        if(biggest7522 == 0){
          S7486=0;
          active[11]=0;
          ends[11]=0;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread7515(int [] tdone, int [] ends){
        switch(S7444){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S7386){
          case 0 : 
            if(tick.getprestatus() && (CbottlePos1.getprestatus() || bottlePos2.getprestatus() || bottlePos3.getprestatus() || bottlePos4.getprestatus())){//sysj\rotaryPlant.sysj line: 122, column: 10
              S7386=1;
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
              S7386=2;
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
              S7386=3;
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
              S7386=4;
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
              S7386=5;
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
              S7386=0;
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

  public void thread7514(int [] tdone, int [] ends){
        switch(S7379){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S7333){
          case 0 : 
            if(rotateTo5_1.getprestatus()){//sysj\rotaryPlant.sysj line: 109, column: 10
              S7333=1;
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
              S7333=2;
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
              S7333=3;
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
              S7333=4;
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
              S7333=0;
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

  public void thread7513(int [] tdone, int [] ends){
        switch(S7329){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S7283){
          case 0 : 
            if(rotateTo4_1.getprestatus()){//sysj\rotaryPlant.sysj line: 96, column: 10
              S7283=1;
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
              S7283=2;
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
              S7283=3;
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
              S7283=4;
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
              S7283=0;
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

  public void thread7512(int [] tdone, int [] ends){
        switch(S7279){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S7233){
          case 0 : 
            if(rotateTo3_1.getprestatus()){//sysj\rotaryPlant.sysj line: 83, column: 10
              S7233=1;
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
              S7233=2;
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
              S7233=3;
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
              S7233=4;
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
              S7233=0;
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

  public void thread7511(int [] tdone, int [] ends){
        switch(S7229){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S7183){
          case 0 : 
            if(rotateTo2_1.getprestatus()){//sysj\rotaryPlant.sysj line: 70, column: 10
              S7183=1;
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
              S7183=2;
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
              S7183=3;
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
              S7183=4;
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
              S7183=0;
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

  public void thread7510(int [] tdone, int [] ends){
        switch(S7179){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S7133){
          case 0 : 
            if(bottlePos4.getprestatus()){//sysj\rotaryPlant.sysj line: 57, column: 10
              S7133=1;
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
              S7133=2;
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
              S7133=3;
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
              S7133=4;
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
              S7133=0;
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

  public void thread7509(int [] tdone, int [] ends){
        switch(S7129){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S7083){
          case 0 : 
            if(bottlePos3.getprestatus()){//sysj\rotaryPlant.sysj line: 44, column: 10
              S7083=1;
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
              S7083=2;
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
              S7083=3;
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
              S7083=4;
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
              S7083=0;
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

  public void thread7508(int [] tdone, int [] ends){
        switch(S7079){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S7033){
          case 0 : 
            if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 31, column: 10
              S7033=1;
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
              S7033=2;
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
              S7033=3;
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
              S7033=4;
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
              S7033=0;
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

  public void thread7507(int [] tdone, int [] ends){
        switch(S7029){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S6983){
          case 0 : 
            if(CbottlePos1.getprestatus()){//sysj\rotaryPlant.sysj line: 18, column: 10
              S6983=1;
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
              S6983=2;
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
              S6983=3;
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
              S6983=4;
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
              S6983=0;
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

  public void thread7504(int [] tdone, int [] ends){
        S7484=1;
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

  public void thread7503(int [] tdone, int [] ends){
        S7476=1;
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

  public void thread7502(int [] tdone, int [] ends){
        S7468=1;
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

  public void thread7501(int [] tdone, int [] ends){
        S7460=1;
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

  public void thread7500(int [] tdone, int [] ends){
        S7452=1;
    S7446=0;
    if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 140, column: 28
      bottlePos2S.setPresent();//sysj\rotaryPlant.sysj line: 140, column: 41
      currsigs.addElement(bottlePos2S);
      S7446=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      S7446=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread7499(int [] tdone, int [] ends){
        S7486=1;
    thread7500(tdone,ends);
    thread7501(tdone,ends);
    thread7502(tdone,ends);
    thread7503(tdone,ends);
    thread7504(tdone,ends);
    int biggest7505 = 0;
    if(ends[12]>=biggest7505){
      biggest7505=ends[12];
    }
    if(ends[13]>=biggest7505){
      biggest7505=ends[13];
    }
    if(ends[14]>=biggest7505){
      biggest7505=ends[14];
    }
    if(ends[15]>=biggest7505){
      biggest7505=ends[15];
    }
    if(ends[16]>=biggest7505){
      biggest7505=ends[16];
    }
    if(biggest7505 == 1){
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread7498(int [] tdone, int [] ends){
        S7444=1;
    S7386=0;
    aligned.setPresent();//sysj\rotaryPlant.sysj line: 123, column: 5
    currsigs.addElement(aligned);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread7497(int [] tdone, int [] ends){
        S7379=1;
    S7333=0;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread7496(int [] tdone, int [] ends){
        S7329=1;
    S7283=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread7495(int [] tdone, int [] ends){
        S7279=1;
    S7233=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread7494(int [] tdone, int [] ends){
        S7229=1;
    S7183=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread7493(int [] tdone, int [] ends){
        S7179=1;
    S7133=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread7492(int [] tdone, int [] ends){
        S7129=1;
    S7083=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread7491(int [] tdone, int [] ends){
        S7079=1;
    S7033=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread7490(int [] tdone, int [] ends){
        S7029=1;
    S6983=0;
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
      switch(S7488){
        case 0 : 
          S7488=0;
          break RUN;
        
        case 1 : 
          S7488=2;
          S7488=2;
          rotateTo2_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo3_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo4_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo5_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          thread7490(tdone,ends);
          thread7491(tdone,ends);
          thread7492(tdone,ends);
          thread7493(tdone,ends);
          thread7494(tdone,ends);
          thread7495(tdone,ends);
          thread7496(tdone,ends);
          thread7497(tdone,ends);
          thread7498(tdone,ends);
          thread7499(tdone,ends);
          int biggest7506 = 0;
          if(ends[2]>=biggest7506){
            biggest7506=ends[2];
          }
          if(ends[3]>=biggest7506){
            biggest7506=ends[3];
          }
          if(ends[4]>=biggest7506){
            biggest7506=ends[4];
          }
          if(ends[5]>=biggest7506){
            biggest7506=ends[5];
          }
          if(ends[6]>=biggest7506){
            biggest7506=ends[6];
          }
          if(ends[7]>=biggest7506){
            biggest7506=ends[7];
          }
          if(ends[8]>=biggest7506){
            biggest7506=ends[8];
          }
          if(ends[9]>=biggest7506){
            biggest7506=ends[9];
          }
          if(ends[10]>=biggest7506){
            biggest7506=ends[10];
          }
          if(ends[11]>=biggest7506){
            biggest7506=ends[11];
          }
          if(biggest7506 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          rotateTo2_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo3_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo4_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo5_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          thread7507(tdone,ends);
          thread7508(tdone,ends);
          thread7509(tdone,ends);
          thread7510(tdone,ends);
          thread7511(tdone,ends);
          thread7512(tdone,ends);
          thread7513(tdone,ends);
          thread7514(tdone,ends);
          thread7515(tdone,ends);
          thread7516(tdone,ends);
          int biggest7523 = 0;
          if(ends[2]>=biggest7523){
            biggest7523=ends[2];
          }
          if(ends[3]>=biggest7523){
            biggest7523=ends[3];
          }
          if(ends[4]>=biggest7523){
            biggest7523=ends[4];
          }
          if(ends[5]>=biggest7523){
            biggest7523=ends[5];
          }
          if(ends[6]>=biggest7523){
            biggest7523=ends[6];
          }
          if(ends[7]>=biggest7523){
            biggest7523=ends[7];
          }
          if(ends[8]>=biggest7523){
            biggest7523=ends[8];
          }
          if(ends[9]>=biggest7523){
            biggest7523=ends[9];
          }
          if(ends[10]>=biggest7523){
            biggest7523=ends[10];
          }
          if(ends[11]>=biggest7523){
            biggest7523=ends[11];
          }
          if(biggest7523 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest7523 == 0){
            S7488=0;
            active[1]=0;
            ends[1]=0;
            S7488=0;
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
