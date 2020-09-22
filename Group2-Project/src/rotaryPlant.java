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
  private int S3812 = 1;
  private int S3377 = 1;
  private int S3337 = 1;
  private int S3421 = 1;
  private int S3381 = 1;
  private int S3465 = 1;
  private int S3425 = 1;
  private int S3509 = 1;
  private int S3469 = 1;
  private int S3559 = 1;
  private int S3513 = 1;
  private int S3609 = 1;
  private int S3563 = 1;
  private int S3659 = 1;
  private int S3613 = 1;
  private int S3709 = 1;
  private int S3663 = 1;
  private int S3768 = 1;
  private int S3716 = 1;
  private int S3810 = 1;
  private int S3776 = 1;
  private int S3770 = 1;
  private int S3784 = 1;
  private int S3792 = 1;
  private int S3800 = 1;
  private int S3808 = 1;
  
  private int[] ends = new int[17];
  private int[] tdone = new int[17];
  
  public void thread3845(int [] tdone, int [] ends){
        switch(S3808){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 143, column: 28
          rotateS.setPresent();//sysj\rotaryPlant.sysj line: 143, column: 37
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

  public void thread3844(int [] tdone, int [] ends){
        switch(S3800){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(bottlePos5.getprestatus()){//sysj\rotaryPlant.sysj line: 141, column: 28
          bottlePos5S.setPresent();//sysj\rotaryPlant.sysj line: 141, column: 41
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

  public void thread3843(int [] tdone, int [] ends){
        switch(S3792){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(bottlePos4.getprestatus()){//sysj\rotaryPlant.sysj line: 139, column: 28
          bottlePos4S.setPresent();//sysj\rotaryPlant.sysj line: 139, column: 41
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

  public void thread3842(int [] tdone, int [] ends){
        switch(S3784){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(bottlePos3.getprestatus()){//sysj\rotaryPlant.sysj line: 137, column: 28
          bottlePos3S.setPresent();//sysj\rotaryPlant.sysj line: 137, column: 41
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

  public void thread3841(int [] tdone, int [] ends){
        switch(S3776){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S3770){
          case 0 : 
            S3770=0;
            if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 135, column: 28
              bottlePos2S.setPresent();//sysj\rotaryPlant.sysj line: 135, column: 41
              currsigs.addElement(bottlePos2S);
              S3770=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              S3770=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
          case 1 : 
            S3770=1;
            S3770=0;
            if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 135, column: 28
              bottlePos2S.setPresent();//sysj\rotaryPlant.sysj line: 135, column: 41
              currsigs.addElement(bottlePos2S);
              S3770=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              S3770=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread3840(int [] tdone, int [] ends){
        switch(S3810){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        thread3841(tdone,ends);
        thread3842(tdone,ends);
        thread3843(tdone,ends);
        thread3844(tdone,ends);
        thread3845(tdone,ends);
        int biggest3846 = 0;
        if(ends[12]>=biggest3846){
          biggest3846=ends[12];
        }
        if(ends[13]>=biggest3846){
          biggest3846=ends[13];
        }
        if(ends[14]>=biggest3846){
          biggest3846=ends[14];
        }
        if(ends[15]>=biggest3846){
          biggest3846=ends[15];
        }
        if(ends[16]>=biggest3846){
          biggest3846=ends[16];
        }
        if(biggest3846 == 1){
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        //FINXME code
        if(biggest3846 == 0){
          S3810=0;
          active[11]=0;
          ends[11]=0;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread3839(int [] tdone, int [] ends){
        switch(S3768){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S3716){
          case 0 : 
            if(tick.getprestatus() && (CbottlePos1.getprestatus() || bottlePos2.getprestatus() || bottlePos3.getprestatus() || bottlePos4.getprestatus())){//sysj\rotaryPlant.sysj line: 118, column: 10
              S3716=1;
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
              S3716=2;
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
            if(tick.getprestatus() && rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 123, column: 10
              S3716=3;
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
              S3716=4;
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
            if(!rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 126, column: 10
              S3716=0;
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 119, column: 5
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
          
        }
        break;
      
    }
  }

  public void thread3838(int [] tdone, int [] ends){
        switch(S3709){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S3663){
          case 0 : 
            if(rotateTo5_1.getprestatus()){//sysj\rotaryPlant.sysj line: 105, column: 10
              S3663=1;
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
            if(tick.getprestatus() && aligned.getprestatus()){//sysj\rotaryPlant.sysj line: 106, column: 10
              S3663=2;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 108, column: 10
              S3663=3;
              bottlePos5.setPresent();//sysj\rotaryPlant.sysj line: 110, column: 5
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
          
          case 3 : 
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 109, column: 10
              S3663=4;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              bottlePos5.setPresent();//sysj\rotaryPlant.sysj line: 110, column: 5
              currsigs.addElement(bottlePos5);
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
          case 4 : 
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 112, column: 10
              S3663=0;
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
        break;
      
    }
  }

  public void thread3837(int [] tdone, int [] ends){
        switch(S3659){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S3613){
          case 0 : 
            if(rotateTo4_1.getprestatus()){//sysj\rotaryPlant.sysj line: 92, column: 10
              S3613=1;
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
            if(tick.getprestatus() && aligned.getprestatus()){//sysj\rotaryPlant.sysj line: 93, column: 10
              S3613=2;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 95, column: 10
              S3613=3;
              bottlePos4.setPresent();//sysj\rotaryPlant.sysj line: 97, column: 5
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
          
          case 3 : 
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 96, column: 10
              S3613=4;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              bottlePos4.setPresent();//sysj\rotaryPlant.sysj line: 97, column: 5
              currsigs.addElement(bottlePos4);
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 4 : 
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 99, column: 10
              S3613=0;
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
        break;
      
    }
  }

  public void thread3836(int [] tdone, int [] ends){
        switch(S3609){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S3563){
          case 0 : 
            if(rotateTo3_1.getprestatus()){//sysj\rotaryPlant.sysj line: 79, column: 10
              S3563=1;
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
            if(tick.getprestatus() && aligned.getprestatus()){//sysj\rotaryPlant.sysj line: 80, column: 10
              S3563=2;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 82, column: 10
              S3563=3;
              bottlePos3.setPresent();//sysj\rotaryPlant.sysj line: 84, column: 5
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
          
          case 3 : 
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 83, column: 10
              S3563=4;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              bottlePos3.setPresent();//sysj\rotaryPlant.sysj line: 84, column: 5
              currsigs.addElement(bottlePos3);
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 4 : 
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 86, column: 10
              S3563=0;
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

  public void thread3835(int [] tdone, int [] ends){
        switch(S3559){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S3513){
          case 0 : 
            if(rotateTo2_1.getprestatus()){//sysj\rotaryPlant.sysj line: 66, column: 10
              S3513=1;
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
            if(tick.getprestatus() && aligned.getprestatus()){//sysj\rotaryPlant.sysj line: 67, column: 10
              S3513=2;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 69, column: 10
              S3513=3;
              bottlePos2.setPresent();//sysj\rotaryPlant.sysj line: 71, column: 5
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
          
          case 3 : 
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 70, column: 10
              S3513=4;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              bottlePos2.setPresent();//sysj\rotaryPlant.sysj line: 71, column: 5
              currsigs.addElement(bottlePos2);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 4 : 
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 73, column: 10
              S3513=0;
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
        break;
      
    }
  }

  public void thread3834(int [] tdone, int [] ends){
        switch(S3509){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S3469){
          case 0 : 
            if(bottlePos4.getprestatus()){//sysj\rotaryPlant.sysj line: 54, column: 10
              S3469=1;
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
            if(!rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 56, column: 10
              S3469=2;
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
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 57, column: 10
              S3469=3;
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
            if(bottlePos5.getprestatus() && !rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 58, column: 10
              S3469=0;
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

  public void thread3833(int [] tdone, int [] ends){
        switch(S3465){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S3425){
          case 0 : 
            if(bottlePos3.getprestatus()){//sysj\rotaryPlant.sysj line: 42, column: 10
              S3425=1;
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
            if(!rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 44, column: 10
              S3425=2;
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
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 45, column: 10
              S3425=3;
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
            if(bottlePos4.getprestatus() && !rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 46, column: 10
              S3425=0;
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

  public void thread3832(int [] tdone, int [] ends){
        switch(S3421){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S3381){
          case 0 : 
            if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 30, column: 10
              S3381=1;
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
            if(!rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 32, column: 10
              S3381=2;
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
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 33, column: 10
              S3381=3;
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
            if(bottlePos3.getprestatus() && !rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 34, column: 10
              S3381=0;
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

  public void thread3831(int [] tdone, int [] ends){
        switch(S3377){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S3337){
          case 0 : 
            if(CbottlePos1.getprestatus()){//sysj\rotaryPlant.sysj line: 18, column: 10
              S3337=1;
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
            if(!rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 20, column: 10
              S3337=2;
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
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 21, column: 10
              S3337=3;
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
            if(bottlePos2.getprestatus() && !rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 22, column: 10
              S3337=0;
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

  public void thread3828(int [] tdone, int [] ends){
        S3808=1;
    if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 143, column: 28
      rotateS.setPresent();//sysj\rotaryPlant.sysj line: 143, column: 37
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

  public void thread3827(int [] tdone, int [] ends){
        S3800=1;
    if(bottlePos5.getprestatus()){//sysj\rotaryPlant.sysj line: 141, column: 28
      bottlePos5S.setPresent();//sysj\rotaryPlant.sysj line: 141, column: 41
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

  public void thread3826(int [] tdone, int [] ends){
        S3792=1;
    if(bottlePos4.getprestatus()){//sysj\rotaryPlant.sysj line: 139, column: 28
      bottlePos4S.setPresent();//sysj\rotaryPlant.sysj line: 139, column: 41
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

  public void thread3825(int [] tdone, int [] ends){
        S3784=1;
    if(bottlePos3.getprestatus()){//sysj\rotaryPlant.sysj line: 137, column: 28
      bottlePos3S.setPresent();//sysj\rotaryPlant.sysj line: 137, column: 41
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

  public void thread3824(int [] tdone, int [] ends){
        S3776=1;
    S3770=0;
    if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 135, column: 28
      bottlePos2S.setPresent();//sysj\rotaryPlant.sysj line: 135, column: 41
      currsigs.addElement(bottlePos2S);
      S3770=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      S3770=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread3823(int [] tdone, int [] ends){
        S3810=1;
    thread3824(tdone,ends);
    thread3825(tdone,ends);
    thread3826(tdone,ends);
    thread3827(tdone,ends);
    thread3828(tdone,ends);
    int biggest3829 = 0;
    if(ends[12]>=biggest3829){
      biggest3829=ends[12];
    }
    if(ends[13]>=biggest3829){
      biggest3829=ends[13];
    }
    if(ends[14]>=biggest3829){
      biggest3829=ends[14];
    }
    if(ends[15]>=biggest3829){
      biggest3829=ends[15];
    }
    if(ends[16]>=biggest3829){
      biggest3829=ends[16];
    }
    if(biggest3829 == 1){
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread3822(int [] tdone, int [] ends){
        S3768=1;
    S3716=0;
    aligned.setPresent();//sysj\rotaryPlant.sysj line: 119, column: 5
    currsigs.addElement(aligned);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread3821(int [] tdone, int [] ends){
        S3709=1;
    S3663=0;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread3820(int [] tdone, int [] ends){
        S3659=1;
    S3613=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread3819(int [] tdone, int [] ends){
        S3609=1;
    S3563=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread3818(int [] tdone, int [] ends){
        S3559=1;
    S3513=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread3817(int [] tdone, int [] ends){
        S3509=1;
    S3469=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread3816(int [] tdone, int [] ends){
        S3465=1;
    S3425=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread3815(int [] tdone, int [] ends){
        S3421=1;
    S3381=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread3814(int [] tdone, int [] ends){
        S3377=1;
    S3337=0;
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
      switch(S3812){
        case 0 : 
          S3812=0;
          break RUN;
        
        case 1 : 
          S3812=2;
          S3812=2;
          rotateTo2_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo3_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo4_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo5_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          thread3814(tdone,ends);
          thread3815(tdone,ends);
          thread3816(tdone,ends);
          thread3817(tdone,ends);
          thread3818(tdone,ends);
          thread3819(tdone,ends);
          thread3820(tdone,ends);
          thread3821(tdone,ends);
          thread3822(tdone,ends);
          thread3823(tdone,ends);
          int biggest3830 = 0;
          if(ends[2]>=biggest3830){
            biggest3830=ends[2];
          }
          if(ends[3]>=biggest3830){
            biggest3830=ends[3];
          }
          if(ends[4]>=biggest3830){
            biggest3830=ends[4];
          }
          if(ends[5]>=biggest3830){
            biggest3830=ends[5];
          }
          if(ends[6]>=biggest3830){
            biggest3830=ends[6];
          }
          if(ends[7]>=biggest3830){
            biggest3830=ends[7];
          }
          if(ends[8]>=biggest3830){
            biggest3830=ends[8];
          }
          if(ends[9]>=biggest3830){
            biggest3830=ends[9];
          }
          if(ends[10]>=biggest3830){
            biggest3830=ends[10];
          }
          if(ends[11]>=biggest3830){
            biggest3830=ends[11];
          }
          if(biggest3830 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          rotateTo2_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo3_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo4_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo5_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          thread3831(tdone,ends);
          thread3832(tdone,ends);
          thread3833(tdone,ends);
          thread3834(tdone,ends);
          thread3835(tdone,ends);
          thread3836(tdone,ends);
          thread3837(tdone,ends);
          thread3838(tdone,ends);
          thread3839(tdone,ends);
          thread3840(tdone,ends);
          int biggest3847 = 0;
          if(ends[2]>=biggest3847){
            biggest3847=ends[2];
          }
          if(ends[3]>=biggest3847){
            biggest3847=ends[3];
          }
          if(ends[4]>=biggest3847){
            biggest3847=ends[4];
          }
          if(ends[5]>=biggest3847){
            biggest3847=ends[5];
          }
          if(ends[6]>=biggest3847){
            biggest3847=ends[6];
          }
          if(ends[7]>=biggest3847){
            biggest3847=ends[7];
          }
          if(ends[8]>=biggest3847){
            biggest3847=ends[8];
          }
          if(ends[9]>=biggest3847){
            biggest3847=ends[9];
          }
          if(ends[10]>=biggest3847){
            biggest3847=ends[10];
          }
          if(ends[11]>=biggest3847){
            biggest3847=ends[11];
          }
          if(biggest3847 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest3847 == 0){
            S3812=0;
            active[1]=0;
            ends[1]=0;
            S3812=0;
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
