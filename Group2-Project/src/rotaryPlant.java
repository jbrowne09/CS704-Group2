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
  private int S4037 = 1;
  private int S3578 = 1;
  private int S3538 = 1;
  private int S3622 = 1;
  private int S3582 = 1;
  private int S3666 = 1;
  private int S3626 = 1;
  private int S3710 = 1;
  private int S3670 = 1;
  private int S3766 = 1;
  private int S3714 = 1;
  private int S3822 = 1;
  private int S3770 = 1;
  private int S3878 = 1;
  private int S3826 = 1;
  private int S3934 = 1;
  private int S3882 = 1;
  private int S3993 = 1;
  private int S3941 = 1;
  private int S4035 = 1;
  private int S4001 = 1;
  private int S3995 = 1;
  private int S4009 = 1;
  private int S4017 = 1;
  private int S4025 = 1;
  private int S4033 = 1;
  
  private int[] ends = new int[17];
  private int[] tdone = new int[17];
  
  public void thread4070(int [] tdone, int [] ends){
        switch(S4033){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 151, column: 28
          rotateS.setPresent();//sysj\rotaryPlant.sysj line: 151, column: 37
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

  public void thread4069(int [] tdone, int [] ends){
        switch(S4025){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(bottlePos5.getprestatus()){//sysj\rotaryPlant.sysj line: 149, column: 28
          bottlePos5S.setPresent();//sysj\rotaryPlant.sysj line: 149, column: 41
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

  public void thread4068(int [] tdone, int [] ends){
        switch(S4017){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(bottlePos4.getprestatus()){//sysj\rotaryPlant.sysj line: 147, column: 28
          bottlePos4S.setPresent();//sysj\rotaryPlant.sysj line: 147, column: 41
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

  public void thread4067(int [] tdone, int [] ends){
        switch(S4009){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(bottlePos3.getprestatus()){//sysj\rotaryPlant.sysj line: 145, column: 28
          bottlePos3S.setPresent();//sysj\rotaryPlant.sysj line: 145, column: 41
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

  public void thread4066(int [] tdone, int [] ends){
        switch(S4001){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S3995){
          case 0 : 
            S3995=0;
            if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 143, column: 28
              bottlePos2S.setPresent();//sysj\rotaryPlant.sysj line: 143, column: 41
              currsigs.addElement(bottlePos2S);
              S3995=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              S3995=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
          case 1 : 
            S3995=1;
            S3995=0;
            if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 143, column: 28
              bottlePos2S.setPresent();//sysj\rotaryPlant.sysj line: 143, column: 41
              currsigs.addElement(bottlePos2S);
              S3995=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              S3995=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread4065(int [] tdone, int [] ends){
        switch(S4035){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        thread4066(tdone,ends);
        thread4067(tdone,ends);
        thread4068(tdone,ends);
        thread4069(tdone,ends);
        thread4070(tdone,ends);
        int biggest4071 = 0;
        if(ends[12]>=biggest4071){
          biggest4071=ends[12];
        }
        if(ends[13]>=biggest4071){
          biggest4071=ends[13];
        }
        if(ends[14]>=biggest4071){
          biggest4071=ends[14];
        }
        if(ends[15]>=biggest4071){
          biggest4071=ends[15];
        }
        if(ends[16]>=biggest4071){
          biggest4071=ends[16];
        }
        if(biggest4071 == 1){
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        //FINXME code
        if(biggest4071 == 0){
          S4035=0;
          active[11]=0;
          ends[11]=0;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread4064(int [] tdone, int [] ends){
        switch(S3993){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S3941){
          case 0 : 
            if(tick.getprestatus() && (CbottlePos1.getprestatus() || bottlePos2.getprestatus() || bottlePos3.getprestatus() || bottlePos4.getprestatus())){//sysj\rotaryPlant.sysj line: 126, column: 10
              S3941=1;
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
              S3941=2;
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
            if(tick.getprestatus() && rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 131, column: 10
              S3941=3;
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
              S3941=4;
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
            if(!rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 134, column: 10
              S3941=0;
              aligned.setPresent();//sysj\rotaryPlant.sysj line: 127, column: 5
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
          
        }
        break;
      
    }
  }

  public void thread4063(int [] tdone, int [] ends){
        switch(S3934){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S3882){
          case 0 : 
            if(rotateTo5_1.getprestatus()){//sysj\rotaryPlant.sysj line: 111, column: 10
              S3882=1;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 112, column: 10
              S3882=2;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 114, column: 10
              S3882=3;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 115, column: 10
              S3882=4;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 116, column: 10
              S3882=5;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 118, column: 10
              S3882=0;
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

  public void thread4062(int [] tdone, int [] ends){
        switch(S3878){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S3826){
          case 0 : 
            if(rotateTo4_1.getprestatus()){//sysj\rotaryPlant.sysj line: 96, column: 10
              S3826=1;
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
              S3826=2;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 99, column: 10
              S3826=3;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 100, column: 10
              S3826=4;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 101, column: 10
              S3826=5;
              bottlePos4.setPresent();//sysj\rotaryPlant.sysj line: 104, column: 5
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 103, column: 10
              S3826=0;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              bottlePos4.setPresent();//sysj\rotaryPlant.sysj line: 104, column: 5
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

  public void thread4061(int [] tdone, int [] ends){
        switch(S3822){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S3770){
          case 0 : 
            if(rotateTo3_1.getprestatus()){//sysj\rotaryPlant.sysj line: 81, column: 10
              S3770=1;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 82, column: 10
              S3770=2;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 84, column: 10
              S3770=3;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 85, column: 10
              S3770=4;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 86, column: 10
              S3770=5;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 88, column: 10
              S3770=0;
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

  public void thread4060(int [] tdone, int [] ends){
        switch(S3766){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S3714){
          case 0 : 
            if(rotateTo2_1.getprestatus()){//sysj\rotaryPlant.sysj line: 66, column: 10
              S3714=1;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 67, column: 10
              S3714=2;
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
              S3714=3;
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
              S3714=4;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 71, column: 10
              S3714=5;
              bottlePos2.setPresent();//sysj\rotaryPlant.sysj line: 74, column: 5
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 73, column: 10
              S3714=0;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              bottlePos2.setPresent();//sysj\rotaryPlant.sysj line: 74, column: 5
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

  public void thread4059(int [] tdone, int [] ends){
        switch(S3710){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S3670){
          case 0 : 
            if(bottlePos4.getprestatus()){//sysj\rotaryPlant.sysj line: 54, column: 10
              S3670=1;
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
              S3670=2;
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
              S3670=3;
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
              S3670=0;
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

  public void thread4058(int [] tdone, int [] ends){
        switch(S3666){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S3626){
          case 0 : 
            if(bottlePos3.getprestatus()){//sysj\rotaryPlant.sysj line: 42, column: 10
              S3626=1;
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
              S3626=2;
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
              S3626=3;
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
              S3626=0;
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

  public void thread4057(int [] tdone, int [] ends){
        switch(S3622){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S3582){
          case 0 : 
            if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 30, column: 10
              S3582=1;
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
              S3582=2;
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
              S3582=3;
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
              S3582=0;
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

  public void thread4056(int [] tdone, int [] ends){
        switch(S3578){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S3538){
          case 0 : 
            if(CbottlePos1.getprestatus()){//sysj\rotaryPlant.sysj line: 18, column: 10
              S3538=1;
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
              S3538=2;
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
              S3538=3;
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
              S3538=0;
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

  public void thread4053(int [] tdone, int [] ends){
        S4033=1;
    if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 151, column: 28
      rotateS.setPresent();//sysj\rotaryPlant.sysj line: 151, column: 37
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

  public void thread4052(int [] tdone, int [] ends){
        S4025=1;
    if(bottlePos5.getprestatus()){//sysj\rotaryPlant.sysj line: 149, column: 28
      bottlePos5S.setPresent();//sysj\rotaryPlant.sysj line: 149, column: 41
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

  public void thread4051(int [] tdone, int [] ends){
        S4017=1;
    if(bottlePos4.getprestatus()){//sysj\rotaryPlant.sysj line: 147, column: 28
      bottlePos4S.setPresent();//sysj\rotaryPlant.sysj line: 147, column: 41
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

  public void thread4050(int [] tdone, int [] ends){
        S4009=1;
    if(bottlePos3.getprestatus()){//sysj\rotaryPlant.sysj line: 145, column: 28
      bottlePos3S.setPresent();//sysj\rotaryPlant.sysj line: 145, column: 41
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

  public void thread4049(int [] tdone, int [] ends){
        S4001=1;
    S3995=0;
    if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 143, column: 28
      bottlePos2S.setPresent();//sysj\rotaryPlant.sysj line: 143, column: 41
      currsigs.addElement(bottlePos2S);
      S3995=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      S3995=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread4048(int [] tdone, int [] ends){
        S4035=1;
    thread4049(tdone,ends);
    thread4050(tdone,ends);
    thread4051(tdone,ends);
    thread4052(tdone,ends);
    thread4053(tdone,ends);
    int biggest4054 = 0;
    if(ends[12]>=biggest4054){
      biggest4054=ends[12];
    }
    if(ends[13]>=biggest4054){
      biggest4054=ends[13];
    }
    if(ends[14]>=biggest4054){
      biggest4054=ends[14];
    }
    if(ends[15]>=biggest4054){
      biggest4054=ends[15];
    }
    if(ends[16]>=biggest4054){
      biggest4054=ends[16];
    }
    if(biggest4054 == 1){
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread4047(int [] tdone, int [] ends){
        S3993=1;
    S3941=0;
    aligned.setPresent();//sysj\rotaryPlant.sysj line: 127, column: 5
    currsigs.addElement(aligned);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread4046(int [] tdone, int [] ends){
        S3934=1;
    S3882=0;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread4045(int [] tdone, int [] ends){
        S3878=1;
    S3826=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread4044(int [] tdone, int [] ends){
        S3822=1;
    S3770=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread4043(int [] tdone, int [] ends){
        S3766=1;
    S3714=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread4042(int [] tdone, int [] ends){
        S3710=1;
    S3670=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread4041(int [] tdone, int [] ends){
        S3666=1;
    S3626=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread4040(int [] tdone, int [] ends){
        S3622=1;
    S3582=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread4039(int [] tdone, int [] ends){
        S3578=1;
    S3538=0;
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
      switch(S4037){
        case 0 : 
          S4037=0;
          break RUN;
        
        case 1 : 
          S4037=2;
          S4037=2;
          rotateTo2_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo3_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo4_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo5_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          thread4039(tdone,ends);
          thread4040(tdone,ends);
          thread4041(tdone,ends);
          thread4042(tdone,ends);
          thread4043(tdone,ends);
          thread4044(tdone,ends);
          thread4045(tdone,ends);
          thread4046(tdone,ends);
          thread4047(tdone,ends);
          thread4048(tdone,ends);
          int biggest4055 = 0;
          if(ends[2]>=biggest4055){
            biggest4055=ends[2];
          }
          if(ends[3]>=biggest4055){
            biggest4055=ends[3];
          }
          if(ends[4]>=biggest4055){
            biggest4055=ends[4];
          }
          if(ends[5]>=biggest4055){
            biggest4055=ends[5];
          }
          if(ends[6]>=biggest4055){
            biggest4055=ends[6];
          }
          if(ends[7]>=biggest4055){
            biggest4055=ends[7];
          }
          if(ends[8]>=biggest4055){
            biggest4055=ends[8];
          }
          if(ends[9]>=biggest4055){
            biggest4055=ends[9];
          }
          if(ends[10]>=biggest4055){
            biggest4055=ends[10];
          }
          if(ends[11]>=biggest4055){
            biggest4055=ends[11];
          }
          if(biggest4055 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          rotateTo2_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo3_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo4_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo5_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          thread4056(tdone,ends);
          thread4057(tdone,ends);
          thread4058(tdone,ends);
          thread4059(tdone,ends);
          thread4060(tdone,ends);
          thread4061(tdone,ends);
          thread4062(tdone,ends);
          thread4063(tdone,ends);
          thread4064(tdone,ends);
          thread4065(tdone,ends);
          int biggest4072 = 0;
          if(ends[2]>=biggest4072){
            biggest4072=ends[2];
          }
          if(ends[3]>=biggest4072){
            biggest4072=ends[3];
          }
          if(ends[4]>=biggest4072){
            biggest4072=ends[4];
          }
          if(ends[5]>=biggest4072){
            biggest4072=ends[5];
          }
          if(ends[6]>=biggest4072){
            biggest4072=ends[6];
          }
          if(ends[7]>=biggest4072){
            biggest4072=ends[7];
          }
          if(ends[8]>=biggest4072){
            biggest4072=ends[8];
          }
          if(ends[9]>=biggest4072){
            biggest4072=ends[9];
          }
          if(ends[10]>=biggest4072){
            biggest4072=ends[10];
          }
          if(ends[11]>=biggest4072){
            biggest4072=ends[11];
          }
          if(biggest4072 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest4072 == 0){
            S4037=0;
            active[1]=0;
            ends[1]=0;
            S4037=0;
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
