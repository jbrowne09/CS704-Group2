import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class fillerController extends ClockDomain{
  public fillerController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal canBottom = new Signal("canBottom", Signal.INPUT);
  public Signal canTop = new Signal("canTop", Signal.INPUT);
  public Signal fillerEnable = new Signal("fillerEnable", Signal.INPUT);
  public Signal tick = new Signal("tick", Signal.INPUT);
  public Signal toFill1 = new Signal("toFill1", Signal.INPUT);
  public Signal toFill2 = new Signal("toFill2", Signal.INPUT);
  public Signal toFill3 = new Signal("toFill3", Signal.INPUT);
  public Signal toFill4 = new Signal("toFill4", Signal.INPUT);
  public Signal inletOn = new Signal("inletOn", Signal.OUTPUT);
  public Signal injectorOn = new Signal("injectorOn", Signal.OUTPUT);
  public Signal valveRetract = new Signal("valveRetract", Signal.OUTPUT);
  public Signal valveExtend = new Signal("valveExtend", Signal.OUTPUT);
  public Signal fillerDone = new Signal("fillerDone", Signal.OUTPUT);
  public Signal fill1 = new Signal("fill1", Signal.OUTPUT);
  public Signal fill2 = new Signal("fill2", Signal.OUTPUT);
  public Signal fill3 = new Signal("fill3", Signal.OUTPUT);
  public Signal fill4 = new Signal("fill4", Signal.OUTPUT);
  private Signal liquidType_1;
  private int S2862 = 1;
  private int S1631 = 1;
  private int S1636 = 1;
  private int S1639 = 1;
  private int S1642 = 1;
  private int S1645 = 1;
  private int S1681 = 1;
  private int S1680 = 1;
  private int S1679 = 1;
  private int S1703 = 1;
  private int S1706 = 1;
  private int S1709 = 1;
  private int S1712 = 1;
  private int S1787 = 1;
  private int S1786 = 1;
  private int S1785 = 1;
  private int S1809 = 1;
  private int S1812 = 1;
  private int S1815 = 1;
  private int S1818 = 1;
  private int S1893 = 1;
  private int S1892 = 1;
  private int S1891 = 1;
  private int S1915 = 1;
  private int S1918 = 1;
  private int S1921 = 1;
  private int S1924 = 1;
  private int S1999 = 1;
  private int S1998 = 1;
  private int S1997 = 1;
  
  private int[] ends = new int[18];
  private int[] tdone = new int[18];
  
  public void thread2947(int [] tdone, int [] ends){
        switch(S1924){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(toFill4.getprestatus()){//sysj\fillerController.sysj line: 128, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 128, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(4);//sysj\fillerController.sysj line: 128, column: 23
          S1924=0;
          active[17]=0;
          ends[17]=0;
          tdone[17]=1;
        }
        else {
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        break;
      
    }
  }

  public void thread2946(int [] tdone, int [] ends){
        switch(S1921){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(toFill3.getprestatus()){//sysj\fillerController.sysj line: 126, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 126, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(3);//sysj\fillerController.sysj line: 126, column: 23
          S1921=0;
          active[16]=0;
          ends[16]=0;
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

  public void thread2945(int [] tdone, int [] ends){
        switch(S1918){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(toFill2.getprestatus()){//sysj\fillerController.sysj line: 124, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 124, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(2);//sysj\fillerController.sysj line: 124, column: 23
          S1918=0;
          active[15]=0;
          ends[15]=0;
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

  public void thread2944(int [] tdone, int [] ends){
        switch(S1915){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(toFill1.getprestatus()){//sysj\fillerController.sysj line: 122, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 122, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(1);//sysj\fillerController.sysj line: 122, column: 23
          S1915=0;
          active[14]=0;
          ends[14]=0;
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

  public void thread2942(int [] tdone, int [] ends){
        S1924=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread2941(int [] tdone, int [] ends){
        S1921=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread2940(int [] tdone, int [] ends){
        S1918=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread2939(int [] tdone, int [] ends){
        S1915=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread2937(int [] tdone, int [] ends){
        S1924=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread2936(int [] tdone, int [] ends){
        S1921=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread2935(int [] tdone, int [] ends){
        S1918=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread2934(int [] tdone, int [] ends){
        S1915=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread2932(int [] tdone, int [] ends){
        S1924=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread2931(int [] tdone, int [] ends){
        S1921=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread2930(int [] tdone, int [] ends){
        S1918=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread2929(int [] tdone, int [] ends){
        S1915=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread2927(int [] tdone, int [] ends){
        S1924=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread2926(int [] tdone, int [] ends){
        S1921=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread2925(int [] tdone, int [] ends){
        S1918=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread2924(int [] tdone, int [] ends){
        S1915=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread2922(int [] tdone, int [] ends){
        switch(S1818){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(toFill4.getprestatus()){//sysj\fillerController.sysj line: 93, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 93, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(4);//sysj\fillerController.sysj line: 93, column: 23
          S1818=0;
          active[13]=0;
          ends[13]=0;
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

  public void thread2921(int [] tdone, int [] ends){
        switch(S1815){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(toFill3.getprestatus()){//sysj\fillerController.sysj line: 91, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 91, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(3);//sysj\fillerController.sysj line: 91, column: 23
          S1815=0;
          active[12]=0;
          ends[12]=0;
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

  public void thread2920(int [] tdone, int [] ends){
        switch(S1812){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(toFill2.getprestatus()){//sysj\fillerController.sysj line: 89, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 89, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(2);//sysj\fillerController.sysj line: 89, column: 23
          S1812=0;
          active[11]=0;
          ends[11]=0;
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

  public void thread2919(int [] tdone, int [] ends){
        switch(S1809){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(toFill1.getprestatus()){//sysj\fillerController.sysj line: 87, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 87, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(1);//sysj\fillerController.sysj line: 87, column: 23
          S1809=0;
          active[10]=0;
          ends[10]=0;
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

  public void thread2917(int [] tdone, int [] ends){
        S1818=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread2916(int [] tdone, int [] ends){
        S1815=1;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread2915(int [] tdone, int [] ends){
        S1812=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread2914(int [] tdone, int [] ends){
        S1809=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread2912(int [] tdone, int [] ends){
        S1818=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread2911(int [] tdone, int [] ends){
        S1815=1;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread2910(int [] tdone, int [] ends){
        S1812=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread2909(int [] tdone, int [] ends){
        S1809=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread2907(int [] tdone, int [] ends){
        S1818=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread2906(int [] tdone, int [] ends){
        S1815=1;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread2905(int [] tdone, int [] ends){
        S1812=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread2904(int [] tdone, int [] ends){
        S1809=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread2902(int [] tdone, int [] ends){
        S1818=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread2901(int [] tdone, int [] ends){
        S1815=1;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread2900(int [] tdone, int [] ends){
        S1812=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread2899(int [] tdone, int [] ends){
        S1809=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread2897(int [] tdone, int [] ends){
        switch(S1712){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(toFill4.getprestatus()){//sysj\fillerController.sysj line: 58, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 58, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(4);//sysj\fillerController.sysj line: 58, column: 23
          S1712=0;
          active[9]=0;
          ends[9]=0;
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

  public void thread2896(int [] tdone, int [] ends){
        switch(S1709){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(toFill3.getprestatus()){//sysj\fillerController.sysj line: 56, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 56, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(3);//sysj\fillerController.sysj line: 56, column: 23
          S1709=0;
          active[8]=0;
          ends[8]=0;
          tdone[8]=1;
        }
        else {
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        break;
      
    }
  }

  public void thread2895(int [] tdone, int [] ends){
        switch(S1706){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(toFill2.getprestatus()){//sysj\fillerController.sysj line: 54, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 54, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(2);//sysj\fillerController.sysj line: 54, column: 23
          S1706=0;
          active[7]=0;
          ends[7]=0;
          tdone[7]=1;
        }
        else {
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread2894(int [] tdone, int [] ends){
        switch(S1703){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(toFill1.getprestatus()){//sysj\fillerController.sysj line: 52, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 52, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(1);//sysj\fillerController.sysj line: 52, column: 23
          S1703=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        else {
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread2892(int [] tdone, int [] ends){
        S1712=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread2891(int [] tdone, int [] ends){
        S1709=1;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread2890(int [] tdone, int [] ends){
        S1706=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread2889(int [] tdone, int [] ends){
        S1703=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread2887(int [] tdone, int [] ends){
        S1712=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread2886(int [] tdone, int [] ends){
        S1709=1;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread2885(int [] tdone, int [] ends){
        S1706=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread2884(int [] tdone, int [] ends){
        S1703=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread2882(int [] tdone, int [] ends){
        S1712=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread2881(int [] tdone, int [] ends){
        S1709=1;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread2880(int [] tdone, int [] ends){
        S1706=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread2879(int [] tdone, int [] ends){
        S1703=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread2877(int [] tdone, int [] ends){
        S1712=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread2876(int [] tdone, int [] ends){
        S1709=1;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread2875(int [] tdone, int [] ends){
        S1706=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread2874(int [] tdone, int [] ends){
        S1703=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread2872(int [] tdone, int [] ends){
        switch(S1645){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(toFill4.getprestatus()){//sysj\fillerController.sysj line: 23, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 23, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(4);//sysj\fillerController.sysj line: 23, column: 23
          S1645=0;
          active[5]=0;
          ends[5]=0;
          tdone[5]=1;
        }
        else {
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread2871(int [] tdone, int [] ends){
        switch(S1642){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(toFill3.getprestatus()){//sysj\fillerController.sysj line: 21, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 21, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(3);//sysj\fillerController.sysj line: 21, column: 23
          S1642=0;
          active[4]=0;
          ends[4]=0;
          tdone[4]=1;
        }
        else {
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread2870(int [] tdone, int [] ends){
        switch(S1639){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(toFill2.getprestatus()){//sysj\fillerController.sysj line: 19, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 19, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(2);//sysj\fillerController.sysj line: 19, column: 23
          S1639=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        else {
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread2869(int [] tdone, int [] ends){
        switch(S1636){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        if(toFill1.getprestatus()){//sysj\fillerController.sysj line: 17, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 17, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(1);//sysj\fillerController.sysj line: 17, column: 23
          S1636=0;
          active[2]=0;
          ends[2]=0;
          tdone[2]=1;
        }
        else {
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
        break;
      
    }
  }

  public void thread2867(int [] tdone, int [] ends){
        S1645=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread2866(int [] tdone, int [] ends){
        S1642=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread2865(int [] tdone, int [] ends){
        S1639=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread2864(int [] tdone, int [] ends){
        S1636=1;
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
      switch(S2862){
        case 0 : 
          S2862=0;
          break RUN;
        
        case 1 : 
          S2862=2;
          S2862=2;
          liquidType_1.setClear();//sysj\fillerController.sysj line: 7, column: 2
          S1631=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          liquidType_1.setClear();//sysj\fillerController.sysj line: 7, column: 2
          switch(S1631){
            case 0 : 
              if(fillerEnable.getprestatus()){//sysj\fillerController.sysj line: 10, column: 10
                S1631=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 1 : 
              if(tick.getprestatus()){//sysj\fillerController.sysj line: 11, column: 10
                S1631=2;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 2 : 
              if(!tick.getprestatus()){//sysj\fillerController.sysj line: 12, column: 10
                System.out.println("Select Liquid 1");//sysj\fillerController.sysj line: 14, column: 4
                S1631=3;
                thread2864(tdone,ends);
                thread2865(tdone,ends);
                thread2866(tdone,ends);
                thread2867(tdone,ends);
                int biggest2868 = 0;
                if(ends[2]>=biggest2868){
                  biggest2868=ends[2];
                }
                if(ends[3]>=biggest2868){
                  biggest2868=ends[3];
                }
                if(ends[4]>=biggest2868){
                  biggest2868=ends[4];
                }
                if(ends[5]>=biggest2868){
                  biggest2868=ends[5];
                }
                if(biggest2868 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 3 : 
              if(liquidType_1.getprestatus()){//sysj\fillerController.sysj line: 16, column: 10
                S1631=4;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                thread2869(tdone,ends);
                thread2870(tdone,ends);
                thread2871(tdone,ends);
                thread2872(tdone,ends);
                int biggest2873 = 0;
                if(ends[2]>=biggest2873){
                  biggest2873=ends[2];
                }
                if(ends[3]>=biggest2873){
                  biggest2873=ends[3];
                }
                if(ends[4]>=biggest2873){
                  biggest2873=ends[4];
                }
                if(ends[5]>=biggest2873){
                  biggest2873=ends[5];
                }
                if(biggest2873 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest2873 == 0){
                  S1631=4;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
            case 4 : 
              if(!tick.getprestatus()){//sysj\fillerController.sysj line: 26, column: 10
                System.out.println("Filling Liquid 1");//sysj\fillerController.sysj line: 27, column: 4
                S1631=5;
                if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 1){//sysj\fillerController.sysj line: 28, column: 7
                  S1681=0;
                  fill1.setPresent();//sysj\fillerController.sysj line: 30, column: 6
                  currsigs.addElement(fill1);
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  S1681=1;
                  if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 2){//sysj\fillerController.sysj line: 33, column: 13
                    S1680=0;
                    fill2.setPresent();//sysj\fillerController.sysj line: 35, column: 6
                    currsigs.addElement(fill2);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S1680=1;
                    if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 3){//sysj\fillerController.sysj line: 38, column: 13
                      S1679=0;
                      fill3.setPresent();//sysj\fillerController.sysj line: 40, column: 6
                      currsigs.addElement(fill3);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S1679=1;
                      fill4.setPresent();//sysj\fillerController.sysj line: 45, column: 6
                      currsigs.addElement(fill4);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                }
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 5 : 
              switch(S1681){
                case 0 : 
                  if(tick.getprestatus()){//sysj\fillerController.sysj line: 29, column: 11
                    System.out.println("Select Liquid 2");//sysj\fillerController.sysj line: 49, column: 4
                    S1631=6;
                    thread2874(tdone,ends);
                    thread2875(tdone,ends);
                    thread2876(tdone,ends);
                    thread2877(tdone,ends);
                    int biggest2878 = 0;
                    if(ends[6]>=biggest2878){
                      biggest2878=ends[6];
                    }
                    if(ends[7]>=biggest2878){
                      biggest2878=ends[7];
                    }
                    if(ends[8]>=biggest2878){
                      biggest2878=ends[8];
                    }
                    if(ends[9]>=biggest2878){
                      biggest2878=ends[9];
                    }
                    if(biggest2878 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    fill1.setPresent();//sysj\fillerController.sysj line: 30, column: 6
                    currsigs.addElement(fill1);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 1 : 
                  switch(S1680){
                    case 0 : 
                      if(tick.getprestatus()){//sysj\fillerController.sysj line: 34, column: 11
                        System.out.println("Select Liquid 2");//sysj\fillerController.sysj line: 49, column: 4
                        S1631=6;
                        thread2879(tdone,ends);
                        thread2880(tdone,ends);
                        thread2881(tdone,ends);
                        thread2882(tdone,ends);
                        int biggest2883 = 0;
                        if(ends[6]>=biggest2883){
                          biggest2883=ends[6];
                        }
                        if(ends[7]>=biggest2883){
                          biggest2883=ends[7];
                        }
                        if(ends[8]>=biggest2883){
                          biggest2883=ends[8];
                        }
                        if(ends[9]>=biggest2883){
                          biggest2883=ends[9];
                        }
                        if(biggest2883 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        fill2.setPresent();//sysj\fillerController.sysj line: 35, column: 6
                        currsigs.addElement(fill2);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                    case 1 : 
                      switch(S1679){
                        case 0 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 39, column: 11
                            System.out.println("Select Liquid 2");//sysj\fillerController.sysj line: 49, column: 4
                            S1631=6;
                            thread2884(tdone,ends);
                            thread2885(tdone,ends);
                            thread2886(tdone,ends);
                            thread2887(tdone,ends);
                            int biggest2888 = 0;
                            if(ends[6]>=biggest2888){
                              biggest2888=ends[6];
                            }
                            if(ends[7]>=biggest2888){
                              biggest2888=ends[7];
                            }
                            if(ends[8]>=biggest2888){
                              biggest2888=ends[8];
                            }
                            if(ends[9]>=biggest2888){
                              biggest2888=ends[9];
                            }
                            if(biggest2888 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            fill3.setPresent();//sysj\fillerController.sysj line: 40, column: 6
                            currsigs.addElement(fill3);
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        
                        case 1 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 44, column: 11
                            System.out.println("Select Liquid 2");//sysj\fillerController.sysj line: 49, column: 4
                            S1631=6;
                            thread2889(tdone,ends);
                            thread2890(tdone,ends);
                            thread2891(tdone,ends);
                            thread2892(tdone,ends);
                            int biggest2893 = 0;
                            if(ends[6]>=biggest2893){
                              biggest2893=ends[6];
                            }
                            if(ends[7]>=biggest2893){
                              biggest2893=ends[7];
                            }
                            if(ends[8]>=biggest2893){
                              biggest2893=ends[8];
                            }
                            if(ends[9]>=biggest2893){
                              biggest2893=ends[9];
                            }
                            if(biggest2893 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            fill4.setPresent();//sysj\fillerController.sysj line: 45, column: 6
                            currsigs.addElement(fill4);
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        
                      }
                      break;
                    
                  }
                  break;
                
              }
              break;
            
            case 6 : 
              if(liquidType_1.getprestatus()){//sysj\fillerController.sysj line: 51, column: 10
                S1631=7;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                thread2894(tdone,ends);
                thread2895(tdone,ends);
                thread2896(tdone,ends);
                thread2897(tdone,ends);
                int biggest2898 = 0;
                if(ends[6]>=biggest2898){
                  biggest2898=ends[6];
                }
                if(ends[7]>=biggest2898){
                  biggest2898=ends[7];
                }
                if(ends[8]>=biggest2898){
                  biggest2898=ends[8];
                }
                if(ends[9]>=biggest2898){
                  biggest2898=ends[9];
                }
                if(biggest2898 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest2898 == 0){
                  S1631=7;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
            case 7 : 
              if(!tick.getprestatus()){//sysj\fillerController.sysj line: 61, column: 10
                System.out.println("Filling Liquid 2");//sysj\fillerController.sysj line: 62, column: 4
                S1631=8;
                if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 1){//sysj\fillerController.sysj line: 63, column: 7
                  S1787=0;
                  fill1.setPresent();//sysj\fillerController.sysj line: 65, column: 6
                  currsigs.addElement(fill1);
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  S1787=1;
                  if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 2){//sysj\fillerController.sysj line: 68, column: 13
                    S1786=0;
                    fill2.setPresent();//sysj\fillerController.sysj line: 70, column: 6
                    currsigs.addElement(fill2);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S1786=1;
                    if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 3){//sysj\fillerController.sysj line: 73, column: 13
                      S1785=0;
                      fill3.setPresent();//sysj\fillerController.sysj line: 75, column: 6
                      currsigs.addElement(fill3);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S1785=1;
                      fill4.setPresent();//sysj\fillerController.sysj line: 80, column: 6
                      currsigs.addElement(fill4);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                }
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 8 : 
              switch(S1787){
                case 0 : 
                  if(tick.getprestatus()){//sysj\fillerController.sysj line: 64, column: 11
                    System.out.println("Select Liquid 3");//sysj\fillerController.sysj line: 84, column: 4
                    S1631=9;
                    thread2899(tdone,ends);
                    thread2900(tdone,ends);
                    thread2901(tdone,ends);
                    thread2902(tdone,ends);
                    int biggest2903 = 0;
                    if(ends[10]>=biggest2903){
                      biggest2903=ends[10];
                    }
                    if(ends[11]>=biggest2903){
                      biggest2903=ends[11];
                    }
                    if(ends[12]>=biggest2903){
                      biggest2903=ends[12];
                    }
                    if(ends[13]>=biggest2903){
                      biggest2903=ends[13];
                    }
                    if(biggest2903 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    fill1.setPresent();//sysj\fillerController.sysj line: 65, column: 6
                    currsigs.addElement(fill1);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 1 : 
                  switch(S1786){
                    case 0 : 
                      if(tick.getprestatus()){//sysj\fillerController.sysj line: 69, column: 11
                        System.out.println("Select Liquid 3");//sysj\fillerController.sysj line: 84, column: 4
                        S1631=9;
                        thread2904(tdone,ends);
                        thread2905(tdone,ends);
                        thread2906(tdone,ends);
                        thread2907(tdone,ends);
                        int biggest2908 = 0;
                        if(ends[10]>=biggest2908){
                          biggest2908=ends[10];
                        }
                        if(ends[11]>=biggest2908){
                          biggest2908=ends[11];
                        }
                        if(ends[12]>=biggest2908){
                          biggest2908=ends[12];
                        }
                        if(ends[13]>=biggest2908){
                          biggest2908=ends[13];
                        }
                        if(biggest2908 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        fill2.setPresent();//sysj\fillerController.sysj line: 70, column: 6
                        currsigs.addElement(fill2);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                    case 1 : 
                      switch(S1785){
                        case 0 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 74, column: 11
                            System.out.println("Select Liquid 3");//sysj\fillerController.sysj line: 84, column: 4
                            S1631=9;
                            thread2909(tdone,ends);
                            thread2910(tdone,ends);
                            thread2911(tdone,ends);
                            thread2912(tdone,ends);
                            int biggest2913 = 0;
                            if(ends[10]>=biggest2913){
                              biggest2913=ends[10];
                            }
                            if(ends[11]>=biggest2913){
                              biggest2913=ends[11];
                            }
                            if(ends[12]>=biggest2913){
                              biggest2913=ends[12];
                            }
                            if(ends[13]>=biggest2913){
                              biggest2913=ends[13];
                            }
                            if(biggest2913 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            fill3.setPresent();//sysj\fillerController.sysj line: 75, column: 6
                            currsigs.addElement(fill3);
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        
                        case 1 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 79, column: 11
                            System.out.println("Select Liquid 3");//sysj\fillerController.sysj line: 84, column: 4
                            S1631=9;
                            thread2914(tdone,ends);
                            thread2915(tdone,ends);
                            thread2916(tdone,ends);
                            thread2917(tdone,ends);
                            int biggest2918 = 0;
                            if(ends[10]>=biggest2918){
                              biggest2918=ends[10];
                            }
                            if(ends[11]>=biggest2918){
                              biggest2918=ends[11];
                            }
                            if(ends[12]>=biggest2918){
                              biggest2918=ends[12];
                            }
                            if(ends[13]>=biggest2918){
                              biggest2918=ends[13];
                            }
                            if(biggest2918 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            fill4.setPresent();//sysj\fillerController.sysj line: 80, column: 6
                            currsigs.addElement(fill4);
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        
                      }
                      break;
                    
                  }
                  break;
                
              }
              break;
            
            case 9 : 
              if(liquidType_1.getprestatus()){//sysj\fillerController.sysj line: 86, column: 10
                S1631=10;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                thread2919(tdone,ends);
                thread2920(tdone,ends);
                thread2921(tdone,ends);
                thread2922(tdone,ends);
                int biggest2923 = 0;
                if(ends[10]>=biggest2923){
                  biggest2923=ends[10];
                }
                if(ends[11]>=biggest2923){
                  biggest2923=ends[11];
                }
                if(ends[12]>=biggest2923){
                  biggest2923=ends[12];
                }
                if(ends[13]>=biggest2923){
                  biggest2923=ends[13];
                }
                if(biggest2923 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest2923 == 0){
                  S1631=10;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
            case 10 : 
              if(!tick.getprestatus()){//sysj\fillerController.sysj line: 96, column: 10
                System.out.println("Filling Liquid 3");//sysj\fillerController.sysj line: 97, column: 4
                S1631=11;
                if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 1){//sysj\fillerController.sysj line: 98, column: 7
                  S1893=0;
                  fill1.setPresent();//sysj\fillerController.sysj line: 100, column: 6
                  currsigs.addElement(fill1);
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  S1893=1;
                  if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 2){//sysj\fillerController.sysj line: 103, column: 13
                    S1892=0;
                    fill2.setPresent();//sysj\fillerController.sysj line: 105, column: 6
                    currsigs.addElement(fill2);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S1892=1;
                    if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 3){//sysj\fillerController.sysj line: 108, column: 13
                      S1891=0;
                      fill3.setPresent();//sysj\fillerController.sysj line: 110, column: 6
                      currsigs.addElement(fill3);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S1891=1;
                      fill4.setPresent();//sysj\fillerController.sysj line: 115, column: 6
                      currsigs.addElement(fill4);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                }
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 11 : 
              switch(S1893){
                case 0 : 
                  if(tick.getprestatus()){//sysj\fillerController.sysj line: 99, column: 11
                    System.out.println("Select Liquid 4");//sysj\fillerController.sysj line: 119, column: 4
                    S1631=12;
                    thread2924(tdone,ends);
                    thread2925(tdone,ends);
                    thread2926(tdone,ends);
                    thread2927(tdone,ends);
                    int biggest2928 = 0;
                    if(ends[14]>=biggest2928){
                      biggest2928=ends[14];
                    }
                    if(ends[15]>=biggest2928){
                      biggest2928=ends[15];
                    }
                    if(ends[16]>=biggest2928){
                      biggest2928=ends[16];
                    }
                    if(ends[17]>=biggest2928){
                      biggest2928=ends[17];
                    }
                    if(biggest2928 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    fill1.setPresent();//sysj\fillerController.sysj line: 100, column: 6
                    currsigs.addElement(fill1);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 1 : 
                  switch(S1892){
                    case 0 : 
                      if(tick.getprestatus()){//sysj\fillerController.sysj line: 104, column: 11
                        System.out.println("Select Liquid 4");//sysj\fillerController.sysj line: 119, column: 4
                        S1631=12;
                        thread2929(tdone,ends);
                        thread2930(tdone,ends);
                        thread2931(tdone,ends);
                        thread2932(tdone,ends);
                        int biggest2933 = 0;
                        if(ends[14]>=biggest2933){
                          biggest2933=ends[14];
                        }
                        if(ends[15]>=biggest2933){
                          biggest2933=ends[15];
                        }
                        if(ends[16]>=biggest2933){
                          biggest2933=ends[16];
                        }
                        if(ends[17]>=biggest2933){
                          biggest2933=ends[17];
                        }
                        if(biggest2933 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        fill2.setPresent();//sysj\fillerController.sysj line: 105, column: 6
                        currsigs.addElement(fill2);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                    case 1 : 
                      switch(S1891){
                        case 0 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 109, column: 11
                            System.out.println("Select Liquid 4");//sysj\fillerController.sysj line: 119, column: 4
                            S1631=12;
                            thread2934(tdone,ends);
                            thread2935(tdone,ends);
                            thread2936(tdone,ends);
                            thread2937(tdone,ends);
                            int biggest2938 = 0;
                            if(ends[14]>=biggest2938){
                              biggest2938=ends[14];
                            }
                            if(ends[15]>=biggest2938){
                              biggest2938=ends[15];
                            }
                            if(ends[16]>=biggest2938){
                              biggest2938=ends[16];
                            }
                            if(ends[17]>=biggest2938){
                              biggest2938=ends[17];
                            }
                            if(biggest2938 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            fill3.setPresent();//sysj\fillerController.sysj line: 110, column: 6
                            currsigs.addElement(fill3);
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        
                        case 1 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 114, column: 11
                            System.out.println("Select Liquid 4");//sysj\fillerController.sysj line: 119, column: 4
                            S1631=12;
                            thread2939(tdone,ends);
                            thread2940(tdone,ends);
                            thread2941(tdone,ends);
                            thread2942(tdone,ends);
                            int biggest2943 = 0;
                            if(ends[14]>=biggest2943){
                              biggest2943=ends[14];
                            }
                            if(ends[15]>=biggest2943){
                              biggest2943=ends[15];
                            }
                            if(ends[16]>=biggest2943){
                              biggest2943=ends[16];
                            }
                            if(ends[17]>=biggest2943){
                              biggest2943=ends[17];
                            }
                            if(biggest2943 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            fill4.setPresent();//sysj\fillerController.sysj line: 115, column: 6
                            currsigs.addElement(fill4);
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        
                      }
                      break;
                    
                  }
                  break;
                
              }
              break;
            
            case 12 : 
              if(liquidType_1.getprestatus()){//sysj\fillerController.sysj line: 121, column: 10
                S1631=13;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                thread2944(tdone,ends);
                thread2945(tdone,ends);
                thread2946(tdone,ends);
                thread2947(tdone,ends);
                int biggest2948 = 0;
                if(ends[14]>=biggest2948){
                  biggest2948=ends[14];
                }
                if(ends[15]>=biggest2948){
                  biggest2948=ends[15];
                }
                if(ends[16]>=biggest2948){
                  biggest2948=ends[16];
                }
                if(ends[17]>=biggest2948){
                  biggest2948=ends[17];
                }
                if(biggest2948 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest2948 == 0){
                  S1631=13;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
            case 13 : 
              if(!tick.getprestatus()){//sysj\fillerController.sysj line: 131, column: 10
                System.out.println("Filling Liquid 4");//sysj\fillerController.sysj line: 132, column: 4
                S1631=14;
                if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 1){//sysj\fillerController.sysj line: 133, column: 7
                  S1999=0;
                  fill1.setPresent();//sysj\fillerController.sysj line: 135, column: 6
                  currsigs.addElement(fill1);
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  S1999=1;
                  if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 2){//sysj\fillerController.sysj line: 138, column: 13
                    S1998=0;
                    fill2.setPresent();//sysj\fillerController.sysj line: 140, column: 6
                    currsigs.addElement(fill2);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S1998=1;
                    if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 3){//sysj\fillerController.sysj line: 143, column: 13
                      S1997=0;
                      fill3.setPresent();//sysj\fillerController.sysj line: 145, column: 6
                      currsigs.addElement(fill3);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S1997=1;
                      fill4.setPresent();//sysj\fillerController.sysj line: 150, column: 6
                      currsigs.addElement(fill4);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                }
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 14 : 
              switch(S1999){
                case 0 : 
                  if(tick.getprestatus()){//sysj\fillerController.sysj line: 134, column: 11
                    S1631=15;
                    fillerDone.setPresent();//sysj\fillerController.sysj line: 155, column: 5
                    currsigs.addElement(fillerDone);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    fill1.setPresent();//sysj\fillerController.sysj line: 135, column: 6
                    currsigs.addElement(fill1);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 1 : 
                  switch(S1998){
                    case 0 : 
                      if(tick.getprestatus()){//sysj\fillerController.sysj line: 139, column: 11
                        S1631=15;
                        fillerDone.setPresent();//sysj\fillerController.sysj line: 155, column: 5
                        currsigs.addElement(fillerDone);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        fill2.setPresent();//sysj\fillerController.sysj line: 140, column: 6
                        currsigs.addElement(fill2);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                    case 1 : 
                      switch(S1997){
                        case 0 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 144, column: 11
                            S1631=15;
                            fillerDone.setPresent();//sysj\fillerController.sysj line: 155, column: 5
                            currsigs.addElement(fillerDone);
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            fill3.setPresent();//sysj\fillerController.sysj line: 145, column: 6
                            currsigs.addElement(fill3);
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        
                        case 1 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 149, column: 11
                            S1631=15;
                            fillerDone.setPresent();//sysj\fillerController.sysj line: 155, column: 5
                            currsigs.addElement(fillerDone);
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            fill4.setPresent();//sysj\fillerController.sysj line: 150, column: 6
                            currsigs.addElement(fill4);
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        
                      }
                      break;
                    
                  }
                  break;
                
              }
              break;
            
            case 15 : 
              if(!fillerEnable.getprestatus()){//sysj\fillerController.sysj line: 154, column: 10
                S1631=0;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                fillerDone.setPresent();//sysj\fillerController.sysj line: 155, column: 5
                currsigs.addElement(fillerDone);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    liquidType_1 = new Signal();
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
          canBottom.gethook();
          canTop.gethook();
          fillerEnable.gethook();
          tick.gethook();
          toFill1.gethook();
          toFill2.gethook();
          toFill3.gethook();
          toFill4.gethook();
          df = true;
        }
        runClockDomain();
      }
      canBottom.setpreclear();
      canTop.setpreclear();
      fillerEnable.setpreclear();
      tick.setpreclear();
      toFill1.setpreclear();
      toFill2.setpreclear();
      toFill3.setpreclear();
      toFill4.setpreclear();
      inletOn.setpreclear();
      injectorOn.setpreclear();
      valveRetract.setpreclear();
      valveExtend.setpreclear();
      fillerDone.setpreclear();
      fill1.setpreclear();
      fill2.setpreclear();
      fill3.setpreclear();
      fill4.setpreclear();
      liquidType_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = canBottom.getStatus() ? canBottom.setprepresent() : canBottom.setpreclear();
      canBottom.setpreval(canBottom.getValue());
      canBottom.setClear();
      dummyint = canTop.getStatus() ? canTop.setprepresent() : canTop.setpreclear();
      canTop.setpreval(canTop.getValue());
      canTop.setClear();
      dummyint = fillerEnable.getStatus() ? fillerEnable.setprepresent() : fillerEnable.setpreclear();
      fillerEnable.setpreval(fillerEnable.getValue());
      fillerEnable.setClear();
      dummyint = tick.getStatus() ? tick.setprepresent() : tick.setpreclear();
      tick.setpreval(tick.getValue());
      tick.setClear();
      dummyint = toFill1.getStatus() ? toFill1.setprepresent() : toFill1.setpreclear();
      toFill1.setpreval(toFill1.getValue());
      toFill1.setClear();
      dummyint = toFill2.getStatus() ? toFill2.setprepresent() : toFill2.setpreclear();
      toFill2.setpreval(toFill2.getValue());
      toFill2.setClear();
      dummyint = toFill3.getStatus() ? toFill3.setprepresent() : toFill3.setpreclear();
      toFill3.setpreval(toFill3.getValue());
      toFill3.setClear();
      dummyint = toFill4.getStatus() ? toFill4.setprepresent() : toFill4.setpreclear();
      toFill4.setpreval(toFill4.getValue());
      toFill4.setClear();
      inletOn.sethook();
      inletOn.setClear();
      injectorOn.sethook();
      injectorOn.setClear();
      valveRetract.sethook();
      valveRetract.setClear();
      valveExtend.sethook();
      valveExtend.setClear();
      fillerDone.sethook();
      fillerDone.setClear();
      fill1.sethook();
      fill1.setClear();
      fill2.sethook();
      fill2.setClear();
      fill3.sethook();
      fill3.setClear();
      fill4.sethook();
      fill4.setClear();
      liquidType_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        canBottom.gethook();
        canTop.gethook();
        fillerEnable.gethook();
        tick.gethook();
        toFill1.gethook();
        toFill2.gethook();
        toFill3.gethook();
        toFill4.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
