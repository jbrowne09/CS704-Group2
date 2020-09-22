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
  private int S3866 = 1;
  private int S3401 = 1;
  private int S3367 = 1;
  private int S3439 = 1;
  private int S3405 = 1;
  private int S3477 = 1;
  private int S3443 = 1;
  private int S3515 = 1;
  private int S3481 = 1;
  private int S3571 = 1;
  private int S3519 = 1;
  private int S3627 = 1;
  private int S3575 = 1;
  private int S3683 = 1;
  private int S3631 = 1;
  private int S3739 = 1;
  private int S3687 = 1;
  private int S3822 = 1;
  private int S3746 = 1;
  private int S3864 = 1;
  private int S3830 = 1;
  private int S3824 = 1;
  private int S3838 = 1;
  private int S3846 = 1;
  private int S3854 = 1;
  private int S3862 = 1;
  
  private int[] ends = new int[17];
  private int[] tdone = new int[17];
  
  public void thread3899(int [] tdone, int [] ends){
        switch(S3862){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 147, column: 28
          rotateS.setPresent();//sysj\rotaryPlant.sysj line: 147, column: 37
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

  public void thread3898(int [] tdone, int [] ends){
        switch(S3854){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(bottlePos5.getprestatus()){//sysj\rotaryPlant.sysj line: 145, column: 28
          bottlePos5S.setPresent();//sysj\rotaryPlant.sysj line: 145, column: 41
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

  public void thread3897(int [] tdone, int [] ends){
        switch(S3846){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(bottlePos4.getprestatus()){//sysj\rotaryPlant.sysj line: 143, column: 28
          bottlePos4S.setPresent();//sysj\rotaryPlant.sysj line: 143, column: 41
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

  public void thread3896(int [] tdone, int [] ends){
        switch(S3838){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(bottlePos3.getprestatus()){//sysj\rotaryPlant.sysj line: 141, column: 28
          bottlePos3S.setPresent();//sysj\rotaryPlant.sysj line: 141, column: 41
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

  public void thread3895(int [] tdone, int [] ends){
        switch(S3830){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S3824){
          case 0 : 
            S3824=0;
            if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 139, column: 28
              bottlePos2S.setPresent();//sysj\rotaryPlant.sysj line: 139, column: 41
              currsigs.addElement(bottlePos2S);
              S3824=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              S3824=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
          case 1 : 
            S3824=1;
            S3824=0;
            if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 139, column: 28
              bottlePos2S.setPresent();//sysj\rotaryPlant.sysj line: 139, column: 41
              currsigs.addElement(bottlePos2S);
              S3824=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              S3824=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread3894(int [] tdone, int [] ends){
        switch(S3864){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        thread3895(tdone,ends);
        thread3896(tdone,ends);
        thread3897(tdone,ends);
        thread3898(tdone,ends);
        thread3899(tdone,ends);
        int biggest3900 = 0;
        if(ends[12]>=biggest3900){
          biggest3900=ends[12];
        }
        if(ends[13]>=biggest3900){
          biggest3900=ends[13];
        }
        if(ends[14]>=biggest3900){
          biggest3900=ends[14];
        }
        if(ends[15]>=biggest3900){
          biggest3900=ends[15];
        }
        if(ends[16]>=biggest3900){
          biggest3900=ends[16];
        }
        if(biggest3900 == 1){
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        //FINXME code
        if(biggest3900 == 0){
          S3864=0;
          active[11]=0;
          ends[11]=0;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread3893(int [] tdone, int [] ends){
        switch(S3822){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S3746){
          case 0 : 
            if(tick.getprestatus() && (CbottlePos1.getprestatus() || bottlePos2.getprestatus() || bottlePos3.getprestatus() || bottlePos4.getprestatus())){//sysj\rotaryPlant.sysj line: 118, column: 10
              S3746=1;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 122, column: 10
              S3746=2;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 123, column: 10
              S3746=3;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 124, column: 10
              S3746=4;
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 127, column: 5
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
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 126, column: 10
              S3746=5;
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 131, column: 5
              currsigs.addElement(aligned);
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
          
          case 5 : 
            if(!rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 130, column: 10
              S3746=0;
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 119, column: 5
              currsigs.addElement(aligned);
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
          
        }
        break;
      
    }
  }

  public void thread3892(int [] tdone, int [] ends){
        switch(S3739){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S3687){
          case 0 : 
            if(rotateTo5_1.getprestatus()){//sysj\rotaryPlant.sysj line: 103, column: 10
              S3687=1;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 104, column: 10
              S3687=2;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 106, column: 10
              S3687=3;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 107, column: 10
              S3687=4;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 108, column: 10
              S3687=5;
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
          
          case 5 : 
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 110, column: 10
              S3687=0;
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

  public void thread3891(int [] tdone, int [] ends){
        switch(S3683){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S3631){
          case 0 : 
            if(rotateTo4_1.getprestatus()){//sysj\rotaryPlant.sysj line: 88, column: 10
              S3631=1;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 89, column: 10
              S3631=2;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 91, column: 10
              S3631=3;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 92, column: 10
              S3631=4;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 93, column: 10
              S3631=5;
              bottlePos4.setPresent();//sysj\rotaryPlant.sysj line: 96, column: 5
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 95, column: 10
              S3631=0;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              bottlePos4.setPresent();//sysj\rotaryPlant.sysj line: 96, column: 5
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

  public void thread3890(int [] tdone, int [] ends){
        switch(S3627){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S3575){
          case 0 : 
            if(rotateTo3_1.getprestatus()){//sysj\rotaryPlant.sysj line: 73, column: 10
              S3575=1;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 74, column: 10
              S3575=2;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 76, column: 10
              S3575=3;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 77, column: 10
              S3575=4;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 78, column: 10
              S3575=5;
              bottlePos3.setPresent();//sysj\rotaryPlant.sysj line: 81, column: 5
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 80, column: 10
              S3575=0;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              bottlePos3.setPresent();//sysj\rotaryPlant.sysj line: 81, column: 5
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

  public void thread3889(int [] tdone, int [] ends){
        switch(S3571){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S3519){
          case 0 : 
            if(rotateTo2_1.getprestatus()){//sysj\rotaryPlant.sysj line: 58, column: 10
              S3519=1;
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
              S3519=2;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 61, column: 10
              S3519=3;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 62, column: 10
              S3519=4;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 63, column: 10
              S3519=5;
              bottlePos2.setPresent();//sysj\rotaryPlant.sysj line: 66, column: 5
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 65, column: 10
              S3519=0;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              bottlePos2.setPresent();//sysj\rotaryPlant.sysj line: 66, column: 5
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

  public void thread3888(int [] tdone, int [] ends){
        switch(S3515){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S3481){
          case 0 : 
            if(bottlePos4.getprestatus()){//sysj\rotaryPlant.sysj line: 48, column: 10
              S3481=1;
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
              S3481=2;
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
              S3481=0;
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

  public void thread3887(int [] tdone, int [] ends){
        switch(S3477){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S3443){
          case 0 : 
            if(bottlePos3.getprestatus()){//sysj\rotaryPlant.sysj line: 38, column: 10
              S3443=1;
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
              S3443=2;
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
              S3443=0;
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

  public void thread3886(int [] tdone, int [] ends){
        switch(S3439){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S3405){
          case 0 : 
            if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 28, column: 10
              S3405=1;
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
              S3405=2;
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
              S3405=0;
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

  public void thread3885(int [] tdone, int [] ends){
        switch(S3401){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S3367){
          case 0 : 
            if(CbottlePos1.getprestatus()){//sysj\rotaryPlant.sysj line: 18, column: 10
              S3367=1;
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
              S3367=2;
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
              S3367=0;
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

  public void thread3882(int [] tdone, int [] ends){
        S3862=1;
    if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 147, column: 28
      rotateS.setPresent();//sysj\rotaryPlant.sysj line: 147, column: 37
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

  public void thread3881(int [] tdone, int [] ends){
        S3854=1;
    if(bottlePos5.getprestatus()){//sysj\rotaryPlant.sysj line: 145, column: 28
      bottlePos5S.setPresent();//sysj\rotaryPlant.sysj line: 145, column: 41
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

  public void thread3880(int [] tdone, int [] ends){
        S3846=1;
    if(bottlePos4.getprestatus()){//sysj\rotaryPlant.sysj line: 143, column: 28
      bottlePos4S.setPresent();//sysj\rotaryPlant.sysj line: 143, column: 41
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

  public void thread3879(int [] tdone, int [] ends){
        S3838=1;
    if(bottlePos3.getprestatus()){//sysj\rotaryPlant.sysj line: 141, column: 28
      bottlePos3S.setPresent();//sysj\rotaryPlant.sysj line: 141, column: 41
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

  public void thread3878(int [] tdone, int [] ends){
        S3830=1;
    S3824=0;
    if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 139, column: 28
      bottlePos2S.setPresent();//sysj\rotaryPlant.sysj line: 139, column: 41
      currsigs.addElement(bottlePos2S);
      S3824=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      S3824=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread3877(int [] tdone, int [] ends){
        S3864=1;
    thread3878(tdone,ends);
    thread3879(tdone,ends);
    thread3880(tdone,ends);
    thread3881(tdone,ends);
    thread3882(tdone,ends);
    int biggest3883 = 0;
    if(ends[12]>=biggest3883){
      biggest3883=ends[12];
    }
    if(ends[13]>=biggest3883){
      biggest3883=ends[13];
    }
    if(ends[14]>=biggest3883){
      biggest3883=ends[14];
    }
    if(ends[15]>=biggest3883){
      biggest3883=ends[15];
    }
    if(ends[16]>=biggest3883){
      biggest3883=ends[16];
    }
    if(biggest3883 == 1){
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread3876(int [] tdone, int [] ends){
        S3822=1;
    S3746=0;
    aligned.setPresent();//sysj\rotaryPlant.sysj line: 119, column: 5
    currsigs.addElement(aligned);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread3875(int [] tdone, int [] ends){
        S3739=1;
    S3687=0;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread3874(int [] tdone, int [] ends){
        S3683=1;
    S3631=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread3873(int [] tdone, int [] ends){
        S3627=1;
    S3575=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread3872(int [] tdone, int [] ends){
        S3571=1;
    S3519=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread3871(int [] tdone, int [] ends){
        S3515=1;
    S3481=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread3870(int [] tdone, int [] ends){
        S3477=1;
    S3443=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread3869(int [] tdone, int [] ends){
        S3439=1;
    S3405=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread3868(int [] tdone, int [] ends){
        S3401=1;
    S3367=0;
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
      switch(S3866){
        case 0 : 
          S3866=0;
          break RUN;
        
        case 1 : 
          S3866=2;
          S3866=2;
          rotateTo2_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo3_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo4_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo5_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          thread3868(tdone,ends);
          thread3869(tdone,ends);
          thread3870(tdone,ends);
          thread3871(tdone,ends);
          thread3872(tdone,ends);
          thread3873(tdone,ends);
          thread3874(tdone,ends);
          thread3875(tdone,ends);
          thread3876(tdone,ends);
          thread3877(tdone,ends);
          int biggest3884 = 0;
          if(ends[2]>=biggest3884){
            biggest3884=ends[2];
          }
          if(ends[3]>=biggest3884){
            biggest3884=ends[3];
          }
          if(ends[4]>=biggest3884){
            biggest3884=ends[4];
          }
          if(ends[5]>=biggest3884){
            biggest3884=ends[5];
          }
          if(ends[6]>=biggest3884){
            biggest3884=ends[6];
          }
          if(ends[7]>=biggest3884){
            biggest3884=ends[7];
          }
          if(ends[8]>=biggest3884){
            biggest3884=ends[8];
          }
          if(ends[9]>=biggest3884){
            biggest3884=ends[9];
          }
          if(ends[10]>=biggest3884){
            biggest3884=ends[10];
          }
          if(ends[11]>=biggest3884){
            biggest3884=ends[11];
          }
          if(biggest3884 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          rotateTo2_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo3_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo4_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo5_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          thread3885(tdone,ends);
          thread3886(tdone,ends);
          thread3887(tdone,ends);
          thread3888(tdone,ends);
          thread3889(tdone,ends);
          thread3890(tdone,ends);
          thread3891(tdone,ends);
          thread3892(tdone,ends);
          thread3893(tdone,ends);
          thread3894(tdone,ends);
          int biggest3901 = 0;
          if(ends[2]>=biggest3901){
            biggest3901=ends[2];
          }
          if(ends[3]>=biggest3901){
            biggest3901=ends[3];
          }
          if(ends[4]>=biggest3901){
            biggest3901=ends[4];
          }
          if(ends[5]>=biggest3901){
            biggest3901=ends[5];
          }
          if(ends[6]>=biggest3901){
            biggest3901=ends[6];
          }
          if(ends[7]>=biggest3901){
            biggest3901=ends[7];
          }
          if(ends[8]>=biggest3901){
            biggest3901=ends[8];
          }
          if(ends[9]>=biggest3901){
            biggest3901=ends[9];
          }
          if(ends[10]>=biggest3901){
            biggest3901=ends[10];
          }
          if(ends[11]>=biggest3901){
            biggest3901=ends[11];
          }
          if(biggest3901 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest3901 == 0){
            S3866=0;
            active[1]=0;
            ends[1]=0;
            S3866=0;
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
