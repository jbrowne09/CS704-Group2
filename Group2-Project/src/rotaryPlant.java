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
  private int S5141 = 1;
  private int S4670 = 1;
  private int S4618 = 1;
  private int S4726 = 1;
  private int S4674 = 1;
  private int S4782 = 1;
  private int S4730 = 1;
  private int S4838 = 1;
  private int S4786 = 1;
  private int S4888 = 1;
  private int S4842 = 1;
  private int S4938 = 1;
  private int S4892 = 1;
  private int S4988 = 1;
  private int S4942 = 1;
  private int S5038 = 1;
  private int S4992 = 1;
  private int S5097 = 1;
  private int S5045 = 1;
  private int S5139 = 1;
  private int S5105 = 1;
  private int S5099 = 1;
  private int S5113 = 1;
  private int S5121 = 1;
  private int S5129 = 1;
  private int S5137 = 1;
  
  private int[] ends = new int[17];
  private int[] tdone = new int[17];
  
  public void thread5174(int [] tdone, int [] ends){
        switch(S5137){
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

  public void thread5173(int [] tdone, int [] ends){
        switch(S5129){
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

  public void thread5172(int [] tdone, int [] ends){
        switch(S5121){
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

  public void thread5171(int [] tdone, int [] ends){
        switch(S5113){
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

  public void thread5170(int [] tdone, int [] ends){
        switch(S5105){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S5099){
          case 0 : 
            S5099=0;
            if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 143, column: 28
              bottlePos2S.setPresent();//sysj\rotaryPlant.sysj line: 143, column: 41
              currsigs.addElement(bottlePos2S);
              S5099=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              S5099=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
          case 1 : 
            S5099=1;
            S5099=0;
            if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 143, column: 28
              bottlePos2S.setPresent();//sysj\rotaryPlant.sysj line: 143, column: 41
              currsigs.addElement(bottlePos2S);
              S5099=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              S5099=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread5169(int [] tdone, int [] ends){
        switch(S5139){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        thread5170(tdone,ends);
        thread5171(tdone,ends);
        thread5172(tdone,ends);
        thread5173(tdone,ends);
        thread5174(tdone,ends);
        int biggest5175 = 0;
        if(ends[12]>=biggest5175){
          biggest5175=ends[12];
        }
        if(ends[13]>=biggest5175){
          biggest5175=ends[13];
        }
        if(ends[14]>=biggest5175){
          biggest5175=ends[14];
        }
        if(ends[15]>=biggest5175){
          biggest5175=ends[15];
        }
        if(ends[16]>=biggest5175){
          biggest5175=ends[16];
        }
        if(biggest5175 == 1){
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        //FINXME code
        if(biggest5175 == 0){
          S5139=0;
          active[11]=0;
          ends[11]=0;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread5168(int [] tdone, int [] ends){
        switch(S5097){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S5045){
          case 0 : 
            if(tick.getprestatus() && (CbottlePos1.getprestatus() || bottlePos2.getprestatus() || bottlePos3.getprestatus() || bottlePos4.getprestatus())){//sysj\rotaryPlant.sysj line: 126, column: 10
              S5045=1;
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
              S5045=2;
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
              S5045=3;
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
              S5045=4;
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
              S5045=0;
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

  public void thread5167(int [] tdone, int [] ends){
        switch(S5038){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S4992){
          case 0 : 
            if(rotateTo5_1.getprestatus()){//sysj\rotaryPlant.sysj line: 113, column: 10
              S4992=1;
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
              S4992=2;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 116, column: 10
              S4992=3;
              bottlePos5.setPresent();//sysj\rotaryPlant.sysj line: 118, column: 5
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 117, column: 10
              S4992=4;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              bottlePos5.setPresent();//sysj\rotaryPlant.sysj line: 118, column: 5
              currsigs.addElement(bottlePos5);
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
          case 4 : 
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 120, column: 10
              S4992=0;
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

  public void thread5166(int [] tdone, int [] ends){
        switch(S4988){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S4942){
          case 0 : 
            if(rotateTo4_1.getprestatus()){//sysj\rotaryPlant.sysj line: 100, column: 10
              S4942=1;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 101, column: 10
              S4942=2;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 103, column: 10
              S4942=3;
              bottlePos4.setPresent();//sysj\rotaryPlant.sysj line: 105, column: 5
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 104, column: 10
              S4942=4;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              bottlePos4.setPresent();//sysj\rotaryPlant.sysj line: 105, column: 5
              currsigs.addElement(bottlePos4);
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 4 : 
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 107, column: 10
              S4942=0;
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

  public void thread5165(int [] tdone, int [] ends){
        switch(S4938){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S4892){
          case 0 : 
            if(rotateTo3_1.getprestatus()){//sysj\rotaryPlant.sysj line: 87, column: 10
              S4892=1;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 88, column: 10
              S4892=2;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 90, column: 10
              S4892=3;
              bottlePos3.setPresent();//sysj\rotaryPlant.sysj line: 92, column: 5
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 91, column: 10
              S4892=4;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              bottlePos3.setPresent();//sysj\rotaryPlant.sysj line: 92, column: 5
              currsigs.addElement(bottlePos3);
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 4 : 
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 94, column: 10
              S4892=0;
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

  public void thread5164(int [] tdone, int [] ends){
        switch(S4888){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S4842){
          case 0 : 
            if(rotateTo2_1.getprestatus()){//sysj\rotaryPlant.sysj line: 74, column: 10
              S4842=1;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 75, column: 10
              S4842=2;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 77, column: 10
              S4842=3;
              bottlePos2.setPresent();//sysj\rotaryPlant.sysj line: 79, column: 5
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 78, column: 10
              S4842=4;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              bottlePos2.setPresent();//sysj\rotaryPlant.sysj line: 79, column: 5
              currsigs.addElement(bottlePos2);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 4 : 
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 81, column: 10
              S4842=0;
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

  public void thread5163(int [] tdone, int [] ends){
        switch(S4838){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S4786){
          case 0 : 
            if(bottlePos4.getprestatus()){//sysj\rotaryPlant.sysj line: 60, column: 10
              S4786=1;
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
            if(!rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 62, column: 10
              S4786=2;
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
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 63, column: 10
              S4786=3;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 64, column: 10
              S4786=4;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 65, column: 10
              S4786=5;
              rotateTo5_1.setPresent();//sysj\rotaryPlant.sysj line: 67, column: 5
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
          
          case 5 : 
            if(bottlePos5.getprestatus() && !rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 66, column: 10
              S4786=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              rotateTo5_1.setPresent();//sysj\rotaryPlant.sysj line: 67, column: 5
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

  public void thread5162(int [] tdone, int [] ends){
        switch(S4782){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S4730){
          case 0 : 
            if(bottlePos3.getprestatus()){//sysj\rotaryPlant.sysj line: 46, column: 10
              S4730=1;
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
            if(!rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 48, column: 10
              S4730=2;
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
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 49, column: 10
              S4730=3;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 50, column: 10
              S4730=4;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 51, column: 10
              S4730=5;
              rotateTo4_1.setPresent();//sysj\rotaryPlant.sysj line: 53, column: 5
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
          
          case 5 : 
            if(bottlePos4.getprestatus() && !rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 52, column: 10
              S4730=0;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              rotateTo4_1.setPresent();//sysj\rotaryPlant.sysj line: 53, column: 5
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

  public void thread5161(int [] tdone, int [] ends){
        switch(S4726){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S4674){
          case 0 : 
            if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 32, column: 10
              S4674=1;
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
            if(!rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 34, column: 10
              S4674=2;
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
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 35, column: 10
              S4674=3;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 36, column: 10
              S4674=4;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 37, column: 10
              S4674=5;
              rotateTo3_1.setPresent();//sysj\rotaryPlant.sysj line: 39, column: 5
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
          
          case 5 : 
            if(bottlePos3.getprestatus() && !rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 38, column: 10
              S4674=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              rotateTo3_1.setPresent();//sysj\rotaryPlant.sysj line: 39, column: 5
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

  public void thread5160(int [] tdone, int [] ends){
        switch(S4670){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S4618){
          case 0 : 
            if(CbottlePos1.getprestatus()){//sysj\rotaryPlant.sysj line: 18, column: 10
              S4618=1;
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
              S4618=2;
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
              S4618=3;
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
            if(!tick.getprestatus()){//sysj\rotaryPlant.sysj line: 22, column: 10
              S4618=4;
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
            if(tick.getprestatus()){//sysj\rotaryPlant.sysj line: 23, column: 10
              S4618=5;
              rotateTo2_1.setPresent();//sysj\rotaryPlant.sysj line: 25, column: 5
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
          
          case 5 : 
            if(bottlePos2.getprestatus() && !rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 24, column: 10
              S4618=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              rotateTo2_1.setPresent();//sysj\rotaryPlant.sysj line: 25, column: 5
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

  public void thread5157(int [] tdone, int [] ends){
        S5137=1;
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

  public void thread5156(int [] tdone, int [] ends){
        S5129=1;
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

  public void thread5155(int [] tdone, int [] ends){
        S5121=1;
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

  public void thread5154(int [] tdone, int [] ends){
        S5113=1;
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

  public void thread5153(int [] tdone, int [] ends){
        S5105=1;
    S5099=0;
    if(bottlePos2.getprestatus()){//sysj\rotaryPlant.sysj line: 143, column: 28
      bottlePos2S.setPresent();//sysj\rotaryPlant.sysj line: 143, column: 41
      currsigs.addElement(bottlePos2S);
      S5099=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      S5099=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread5152(int [] tdone, int [] ends){
        S5139=1;
    thread5153(tdone,ends);
    thread5154(tdone,ends);
    thread5155(tdone,ends);
    thread5156(tdone,ends);
    thread5157(tdone,ends);
    int biggest5158 = 0;
    if(ends[12]>=biggest5158){
      biggest5158=ends[12];
    }
    if(ends[13]>=biggest5158){
      biggest5158=ends[13];
    }
    if(ends[14]>=biggest5158){
      biggest5158=ends[14];
    }
    if(ends[15]>=biggest5158){
      biggest5158=ends[15];
    }
    if(ends[16]>=biggest5158){
      biggest5158=ends[16];
    }
    if(biggest5158 == 1){
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread5151(int [] tdone, int [] ends){
        S5097=1;
    S5045=0;
    aligned.setPresent();//sysj\rotaryPlant.sysj line: 127, column: 5
    currsigs.addElement(aligned);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread5150(int [] tdone, int [] ends){
        S5038=1;
    S4992=0;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread5149(int [] tdone, int [] ends){
        S4988=1;
    S4942=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread5148(int [] tdone, int [] ends){
        S4938=1;
    S4892=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread5147(int [] tdone, int [] ends){
        S4888=1;
    S4842=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread5146(int [] tdone, int [] ends){
        S4838=1;
    S4786=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread5145(int [] tdone, int [] ends){
        S4782=1;
    S4730=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread5144(int [] tdone, int [] ends){
        S4726=1;
    S4674=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread5143(int [] tdone, int [] ends){
        S4670=1;
    S4618=0;
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
      switch(S5141){
        case 0 : 
          S5141=0;
          break RUN;
        
        case 1 : 
          S5141=2;
          S5141=2;
          rotateTo2_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo3_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo4_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo5_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          thread5143(tdone,ends);
          thread5144(tdone,ends);
          thread5145(tdone,ends);
          thread5146(tdone,ends);
          thread5147(tdone,ends);
          thread5148(tdone,ends);
          thread5149(tdone,ends);
          thread5150(tdone,ends);
          thread5151(tdone,ends);
          thread5152(tdone,ends);
          int biggest5159 = 0;
          if(ends[2]>=biggest5159){
            biggest5159=ends[2];
          }
          if(ends[3]>=biggest5159){
            biggest5159=ends[3];
          }
          if(ends[4]>=biggest5159){
            biggest5159=ends[4];
          }
          if(ends[5]>=biggest5159){
            biggest5159=ends[5];
          }
          if(ends[6]>=biggest5159){
            biggest5159=ends[6];
          }
          if(ends[7]>=biggest5159){
            biggest5159=ends[7];
          }
          if(ends[8]>=biggest5159){
            biggest5159=ends[8];
          }
          if(ends[9]>=biggest5159){
            biggest5159=ends[9];
          }
          if(ends[10]>=biggest5159){
            biggest5159=ends[10];
          }
          if(ends[11]>=biggest5159){
            biggest5159=ends[11];
          }
          if(biggest5159 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          rotateTo2_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo3_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo4_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          rotateTo5_1.setClear();//sysj\rotaryPlant.sysj line: 15, column: 2
          thread5160(tdone,ends);
          thread5161(tdone,ends);
          thread5162(tdone,ends);
          thread5163(tdone,ends);
          thread5164(tdone,ends);
          thread5165(tdone,ends);
          thread5166(tdone,ends);
          thread5167(tdone,ends);
          thread5168(tdone,ends);
          thread5169(tdone,ends);
          int biggest5176 = 0;
          if(ends[2]>=biggest5176){
            biggest5176=ends[2];
          }
          if(ends[3]>=biggest5176){
            biggest5176=ends[3];
          }
          if(ends[4]>=biggest5176){
            biggest5176=ends[4];
          }
          if(ends[5]>=biggest5176){
            biggest5176=ends[5];
          }
          if(ends[6]>=biggest5176){
            biggest5176=ends[6];
          }
          if(ends[7]>=biggest5176){
            biggest5176=ends[7];
          }
          if(ends[8]>=biggest5176){
            biggest5176=ends[8];
          }
          if(ends[9]>=biggest5176){
            biggest5176=ends[9];
          }
          if(ends[10]>=biggest5176){
            biggest5176=ends[10];
          }
          if(ends[11]>=biggest5176){
            biggest5176=ends[11];
          }
          if(biggest5176 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest5176 == 0){
            S5141=0;
            active[1]=0;
            ends[1]=0;
            S5141=0;
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
