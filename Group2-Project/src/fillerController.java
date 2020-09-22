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
  private int S2886 = 1;
  private int S1655 = 1;
  private int S1660 = 1;
  private int S1663 = 1;
  private int S1666 = 1;
  private int S1669 = 1;
  private int S1705 = 1;
  private int S1704 = 1;
  private int S1703 = 1;
  private int S1727 = 1;
  private int S1730 = 1;
  private int S1733 = 1;
  private int S1736 = 1;
  private int S1811 = 1;
  private int S1810 = 1;
  private int S1809 = 1;
  private int S1833 = 1;
  private int S1836 = 1;
  private int S1839 = 1;
  private int S1842 = 1;
  private int S1917 = 1;
  private int S1916 = 1;
  private int S1915 = 1;
  private int S1939 = 1;
  private int S1942 = 1;
  private int S1945 = 1;
  private int S1948 = 1;
  private int S2023 = 1;
  private int S2022 = 1;
  private int S2021 = 1;
  
  private int[] ends = new int[18];
  private int[] tdone = new int[18];
  
  public void thread2971(int [] tdone, int [] ends){
        switch(S1948){
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
          S1948=0;
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

  public void thread2970(int [] tdone, int [] ends){
        switch(S1945){
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
          S1945=0;
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

  public void thread2969(int [] tdone, int [] ends){
        switch(S1942){
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
          S1942=0;
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

  public void thread2968(int [] tdone, int [] ends){
        switch(S1939){
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
          S1939=0;
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

  public void thread2966(int [] tdone, int [] ends){
        S1948=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread2965(int [] tdone, int [] ends){
        S1945=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread2964(int [] tdone, int [] ends){
        S1942=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread2963(int [] tdone, int [] ends){
        S1939=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread2961(int [] tdone, int [] ends){
        S1948=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread2960(int [] tdone, int [] ends){
        S1945=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread2959(int [] tdone, int [] ends){
        S1942=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread2958(int [] tdone, int [] ends){
        S1939=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread2956(int [] tdone, int [] ends){
        S1948=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread2955(int [] tdone, int [] ends){
        S1945=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread2954(int [] tdone, int [] ends){
        S1942=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread2953(int [] tdone, int [] ends){
        S1939=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread2951(int [] tdone, int [] ends){
        S1948=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread2950(int [] tdone, int [] ends){
        S1945=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread2949(int [] tdone, int [] ends){
        S1942=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread2948(int [] tdone, int [] ends){
        S1939=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread2946(int [] tdone, int [] ends){
        switch(S1842){
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
          S1842=0;
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

  public void thread2945(int [] tdone, int [] ends){
        switch(S1839){
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
          S1839=0;
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

  public void thread2944(int [] tdone, int [] ends){
        switch(S1836){
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
          S1836=0;
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

  public void thread2943(int [] tdone, int [] ends){
        switch(S1833){
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
          S1833=0;
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

  public void thread2941(int [] tdone, int [] ends){
        S1842=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread2940(int [] tdone, int [] ends){
        S1839=1;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread2939(int [] tdone, int [] ends){
        S1836=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread2938(int [] tdone, int [] ends){
        S1833=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread2936(int [] tdone, int [] ends){
        S1842=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread2935(int [] tdone, int [] ends){
        S1839=1;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread2934(int [] tdone, int [] ends){
        S1836=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread2933(int [] tdone, int [] ends){
        S1833=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread2931(int [] tdone, int [] ends){
        S1842=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread2930(int [] tdone, int [] ends){
        S1839=1;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread2929(int [] tdone, int [] ends){
        S1836=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread2928(int [] tdone, int [] ends){
        S1833=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread2926(int [] tdone, int [] ends){
        S1842=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread2925(int [] tdone, int [] ends){
        S1839=1;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread2924(int [] tdone, int [] ends){
        S1836=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread2923(int [] tdone, int [] ends){
        S1833=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread2921(int [] tdone, int [] ends){
        switch(S1736){
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
          S1736=0;
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

  public void thread2920(int [] tdone, int [] ends){
        switch(S1733){
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
          S1733=0;
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

  public void thread2919(int [] tdone, int [] ends){
        switch(S1730){
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
          S1730=0;
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

  public void thread2918(int [] tdone, int [] ends){
        switch(S1727){
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
          S1727=0;
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

  public void thread2916(int [] tdone, int [] ends){
        S1736=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread2915(int [] tdone, int [] ends){
        S1733=1;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread2914(int [] tdone, int [] ends){
        S1730=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread2913(int [] tdone, int [] ends){
        S1727=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread2911(int [] tdone, int [] ends){
        S1736=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread2910(int [] tdone, int [] ends){
        S1733=1;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread2909(int [] tdone, int [] ends){
        S1730=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread2908(int [] tdone, int [] ends){
        S1727=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread2906(int [] tdone, int [] ends){
        S1736=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread2905(int [] tdone, int [] ends){
        S1733=1;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread2904(int [] tdone, int [] ends){
        S1730=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread2903(int [] tdone, int [] ends){
        S1727=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread2901(int [] tdone, int [] ends){
        S1736=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread2900(int [] tdone, int [] ends){
        S1733=1;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread2899(int [] tdone, int [] ends){
        S1730=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread2898(int [] tdone, int [] ends){
        S1727=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread2896(int [] tdone, int [] ends){
        switch(S1669){
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
          S1669=0;
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

  public void thread2895(int [] tdone, int [] ends){
        switch(S1666){
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
          S1666=0;
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

  public void thread2894(int [] tdone, int [] ends){
        switch(S1663){
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
          S1663=0;
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

  public void thread2893(int [] tdone, int [] ends){
        switch(S1660){
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
          S1660=0;
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

  public void thread2891(int [] tdone, int [] ends){
        S1669=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread2890(int [] tdone, int [] ends){
        S1666=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread2889(int [] tdone, int [] ends){
        S1663=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread2888(int [] tdone, int [] ends){
        S1660=1;
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
      switch(S2886){
        case 0 : 
          S2886=0;
          break RUN;
        
        case 1 : 
          S2886=2;
          S2886=2;
          liquidType_1.setClear();//sysj\fillerController.sysj line: 7, column: 2
          S1655=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          liquidType_1.setClear();//sysj\fillerController.sysj line: 7, column: 2
          switch(S1655){
            case 0 : 
              if(fillerEnable.getprestatus()){//sysj\fillerController.sysj line: 10, column: 10
                S1655=1;
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
                S1655=2;
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
                S1655=3;
                thread2888(tdone,ends);
                thread2889(tdone,ends);
                thread2890(tdone,ends);
                thread2891(tdone,ends);
                int biggest2892 = 0;
                if(ends[2]>=biggest2892){
                  biggest2892=ends[2];
                }
                if(ends[3]>=biggest2892){
                  biggest2892=ends[3];
                }
                if(ends[4]>=biggest2892){
                  biggest2892=ends[4];
                }
                if(ends[5]>=biggest2892){
                  biggest2892=ends[5];
                }
                if(biggest2892 == 1){
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
                S1655=4;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                thread2893(tdone,ends);
                thread2894(tdone,ends);
                thread2895(tdone,ends);
                thread2896(tdone,ends);
                int biggest2897 = 0;
                if(ends[2]>=biggest2897){
                  biggest2897=ends[2];
                }
                if(ends[3]>=biggest2897){
                  biggest2897=ends[3];
                }
                if(ends[4]>=biggest2897){
                  biggest2897=ends[4];
                }
                if(ends[5]>=biggest2897){
                  biggest2897=ends[5];
                }
                if(biggest2897 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest2897 == 0){
                  S1655=4;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
            case 4 : 
              if(!tick.getprestatus()){//sysj\fillerController.sysj line: 26, column: 10
                System.out.println("Filling Liquid 1");//sysj\fillerController.sysj line: 27, column: 4
                S1655=5;
                if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 1){//sysj\fillerController.sysj line: 28, column: 7
                  S1705=0;
                  fill1.setPresent();//sysj\fillerController.sysj line: 30, column: 6
                  currsigs.addElement(fill1);
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  S1705=1;
                  if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 2){//sysj\fillerController.sysj line: 33, column: 13
                    S1704=0;
                    fill2.setPresent();//sysj\fillerController.sysj line: 35, column: 6
                    currsigs.addElement(fill2);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S1704=1;
                    if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 3){//sysj\fillerController.sysj line: 38, column: 13
                      S1703=0;
                      fill3.setPresent();//sysj\fillerController.sysj line: 40, column: 6
                      currsigs.addElement(fill3);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S1703=1;
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
              switch(S1705){
                case 0 : 
                  if(tick.getprestatus()){//sysj\fillerController.sysj line: 29, column: 11
                    System.out.println("Select Liquid 2");//sysj\fillerController.sysj line: 49, column: 4
                    S1655=6;
                    thread2898(tdone,ends);
                    thread2899(tdone,ends);
                    thread2900(tdone,ends);
                    thread2901(tdone,ends);
                    int biggest2902 = 0;
                    if(ends[6]>=biggest2902){
                      biggest2902=ends[6];
                    }
                    if(ends[7]>=biggest2902){
                      biggest2902=ends[7];
                    }
                    if(ends[8]>=biggest2902){
                      biggest2902=ends[8];
                    }
                    if(ends[9]>=biggest2902){
                      biggest2902=ends[9];
                    }
                    if(biggest2902 == 1){
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
                  switch(S1704){
                    case 0 : 
                      if(tick.getprestatus()){//sysj\fillerController.sysj line: 34, column: 11
                        System.out.println("Select Liquid 2");//sysj\fillerController.sysj line: 49, column: 4
                        S1655=6;
                        thread2903(tdone,ends);
                        thread2904(tdone,ends);
                        thread2905(tdone,ends);
                        thread2906(tdone,ends);
                        int biggest2907 = 0;
                        if(ends[6]>=biggest2907){
                          biggest2907=ends[6];
                        }
                        if(ends[7]>=biggest2907){
                          biggest2907=ends[7];
                        }
                        if(ends[8]>=biggest2907){
                          biggest2907=ends[8];
                        }
                        if(ends[9]>=biggest2907){
                          biggest2907=ends[9];
                        }
                        if(biggest2907 == 1){
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
                      switch(S1703){
                        case 0 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 39, column: 11
                            System.out.println("Select Liquid 2");//sysj\fillerController.sysj line: 49, column: 4
                            S1655=6;
                            thread2908(tdone,ends);
                            thread2909(tdone,ends);
                            thread2910(tdone,ends);
                            thread2911(tdone,ends);
                            int biggest2912 = 0;
                            if(ends[6]>=biggest2912){
                              biggest2912=ends[6];
                            }
                            if(ends[7]>=biggest2912){
                              biggest2912=ends[7];
                            }
                            if(ends[8]>=biggest2912){
                              biggest2912=ends[8];
                            }
                            if(ends[9]>=biggest2912){
                              biggest2912=ends[9];
                            }
                            if(biggest2912 == 1){
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
                            S1655=6;
                            thread2913(tdone,ends);
                            thread2914(tdone,ends);
                            thread2915(tdone,ends);
                            thread2916(tdone,ends);
                            int biggest2917 = 0;
                            if(ends[6]>=biggest2917){
                              biggest2917=ends[6];
                            }
                            if(ends[7]>=biggest2917){
                              biggest2917=ends[7];
                            }
                            if(ends[8]>=biggest2917){
                              biggest2917=ends[8];
                            }
                            if(ends[9]>=biggest2917){
                              biggest2917=ends[9];
                            }
                            if(biggest2917 == 1){
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
                S1655=7;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                thread2918(tdone,ends);
                thread2919(tdone,ends);
                thread2920(tdone,ends);
                thread2921(tdone,ends);
                int biggest2922 = 0;
                if(ends[6]>=biggest2922){
                  biggest2922=ends[6];
                }
                if(ends[7]>=biggest2922){
                  biggest2922=ends[7];
                }
                if(ends[8]>=biggest2922){
                  biggest2922=ends[8];
                }
                if(ends[9]>=biggest2922){
                  biggest2922=ends[9];
                }
                if(biggest2922 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest2922 == 0){
                  S1655=7;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
            case 7 : 
              if(!tick.getprestatus()){//sysj\fillerController.sysj line: 61, column: 10
                System.out.println("Filling Liquid 2");//sysj\fillerController.sysj line: 62, column: 4
                S1655=8;
                if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 1){//sysj\fillerController.sysj line: 63, column: 7
                  S1811=0;
                  fill1.setPresent();//sysj\fillerController.sysj line: 65, column: 6
                  currsigs.addElement(fill1);
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  S1811=1;
                  if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 2){//sysj\fillerController.sysj line: 68, column: 13
                    S1810=0;
                    fill2.setPresent();//sysj\fillerController.sysj line: 70, column: 6
                    currsigs.addElement(fill2);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S1810=1;
                    if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 3){//sysj\fillerController.sysj line: 73, column: 13
                      S1809=0;
                      fill3.setPresent();//sysj\fillerController.sysj line: 75, column: 6
                      currsigs.addElement(fill3);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S1809=1;
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
              switch(S1811){
                case 0 : 
                  if(tick.getprestatus()){//sysj\fillerController.sysj line: 64, column: 11
                    System.out.println("Select Liquid 3");//sysj\fillerController.sysj line: 84, column: 4
                    S1655=9;
                    thread2923(tdone,ends);
                    thread2924(tdone,ends);
                    thread2925(tdone,ends);
                    thread2926(tdone,ends);
                    int biggest2927 = 0;
                    if(ends[10]>=biggest2927){
                      biggest2927=ends[10];
                    }
                    if(ends[11]>=biggest2927){
                      biggest2927=ends[11];
                    }
                    if(ends[12]>=biggest2927){
                      biggest2927=ends[12];
                    }
                    if(ends[13]>=biggest2927){
                      biggest2927=ends[13];
                    }
                    if(biggest2927 == 1){
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
                  switch(S1810){
                    case 0 : 
                      if(tick.getprestatus()){//sysj\fillerController.sysj line: 69, column: 11
                        System.out.println("Select Liquid 3");//sysj\fillerController.sysj line: 84, column: 4
                        S1655=9;
                        thread2928(tdone,ends);
                        thread2929(tdone,ends);
                        thread2930(tdone,ends);
                        thread2931(tdone,ends);
                        int biggest2932 = 0;
                        if(ends[10]>=biggest2932){
                          biggest2932=ends[10];
                        }
                        if(ends[11]>=biggest2932){
                          biggest2932=ends[11];
                        }
                        if(ends[12]>=biggest2932){
                          biggest2932=ends[12];
                        }
                        if(ends[13]>=biggest2932){
                          biggest2932=ends[13];
                        }
                        if(biggest2932 == 1){
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
                      switch(S1809){
                        case 0 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 74, column: 11
                            System.out.println("Select Liquid 3");//sysj\fillerController.sysj line: 84, column: 4
                            S1655=9;
                            thread2933(tdone,ends);
                            thread2934(tdone,ends);
                            thread2935(tdone,ends);
                            thread2936(tdone,ends);
                            int biggest2937 = 0;
                            if(ends[10]>=biggest2937){
                              biggest2937=ends[10];
                            }
                            if(ends[11]>=biggest2937){
                              biggest2937=ends[11];
                            }
                            if(ends[12]>=biggest2937){
                              biggest2937=ends[12];
                            }
                            if(ends[13]>=biggest2937){
                              biggest2937=ends[13];
                            }
                            if(biggest2937 == 1){
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
                            S1655=9;
                            thread2938(tdone,ends);
                            thread2939(tdone,ends);
                            thread2940(tdone,ends);
                            thread2941(tdone,ends);
                            int biggest2942 = 0;
                            if(ends[10]>=biggest2942){
                              biggest2942=ends[10];
                            }
                            if(ends[11]>=biggest2942){
                              biggest2942=ends[11];
                            }
                            if(ends[12]>=biggest2942){
                              biggest2942=ends[12];
                            }
                            if(ends[13]>=biggest2942){
                              biggest2942=ends[13];
                            }
                            if(biggest2942 == 1){
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
                S1655=10;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                thread2943(tdone,ends);
                thread2944(tdone,ends);
                thread2945(tdone,ends);
                thread2946(tdone,ends);
                int biggest2947 = 0;
                if(ends[10]>=biggest2947){
                  biggest2947=ends[10];
                }
                if(ends[11]>=biggest2947){
                  biggest2947=ends[11];
                }
                if(ends[12]>=biggest2947){
                  biggest2947=ends[12];
                }
                if(ends[13]>=biggest2947){
                  biggest2947=ends[13];
                }
                if(biggest2947 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest2947 == 0){
                  S1655=10;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
            case 10 : 
              if(!tick.getprestatus()){//sysj\fillerController.sysj line: 96, column: 10
                System.out.println("Filling Liquid 3");//sysj\fillerController.sysj line: 97, column: 4
                S1655=11;
                if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 1){//sysj\fillerController.sysj line: 98, column: 7
                  S1917=0;
                  fill1.setPresent();//sysj\fillerController.sysj line: 100, column: 6
                  currsigs.addElement(fill1);
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  S1917=1;
                  if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 2){//sysj\fillerController.sysj line: 103, column: 13
                    S1916=0;
                    fill2.setPresent();//sysj\fillerController.sysj line: 105, column: 6
                    currsigs.addElement(fill2);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S1916=1;
                    if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 3){//sysj\fillerController.sysj line: 108, column: 13
                      S1915=0;
                      fill3.setPresent();//sysj\fillerController.sysj line: 110, column: 6
                      currsigs.addElement(fill3);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S1915=1;
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
              switch(S1917){
                case 0 : 
                  if(tick.getprestatus()){//sysj\fillerController.sysj line: 99, column: 11
                    System.out.println("Select Liquid 4");//sysj\fillerController.sysj line: 119, column: 4
                    S1655=12;
                    thread2948(tdone,ends);
                    thread2949(tdone,ends);
                    thread2950(tdone,ends);
                    thread2951(tdone,ends);
                    int biggest2952 = 0;
                    if(ends[14]>=biggest2952){
                      biggest2952=ends[14];
                    }
                    if(ends[15]>=biggest2952){
                      biggest2952=ends[15];
                    }
                    if(ends[16]>=biggest2952){
                      biggest2952=ends[16];
                    }
                    if(ends[17]>=biggest2952){
                      biggest2952=ends[17];
                    }
                    if(biggest2952 == 1){
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
                  switch(S1916){
                    case 0 : 
                      if(tick.getprestatus()){//sysj\fillerController.sysj line: 104, column: 11
                        System.out.println("Select Liquid 4");//sysj\fillerController.sysj line: 119, column: 4
                        S1655=12;
                        thread2953(tdone,ends);
                        thread2954(tdone,ends);
                        thread2955(tdone,ends);
                        thread2956(tdone,ends);
                        int biggest2957 = 0;
                        if(ends[14]>=biggest2957){
                          biggest2957=ends[14];
                        }
                        if(ends[15]>=biggest2957){
                          biggest2957=ends[15];
                        }
                        if(ends[16]>=biggest2957){
                          biggest2957=ends[16];
                        }
                        if(ends[17]>=biggest2957){
                          biggest2957=ends[17];
                        }
                        if(biggest2957 == 1){
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
                      switch(S1915){
                        case 0 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 109, column: 11
                            System.out.println("Select Liquid 4");//sysj\fillerController.sysj line: 119, column: 4
                            S1655=12;
                            thread2958(tdone,ends);
                            thread2959(tdone,ends);
                            thread2960(tdone,ends);
                            thread2961(tdone,ends);
                            int biggest2962 = 0;
                            if(ends[14]>=biggest2962){
                              biggest2962=ends[14];
                            }
                            if(ends[15]>=biggest2962){
                              biggest2962=ends[15];
                            }
                            if(ends[16]>=biggest2962){
                              biggest2962=ends[16];
                            }
                            if(ends[17]>=biggest2962){
                              biggest2962=ends[17];
                            }
                            if(biggest2962 == 1){
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
                            S1655=12;
                            thread2963(tdone,ends);
                            thread2964(tdone,ends);
                            thread2965(tdone,ends);
                            thread2966(tdone,ends);
                            int biggest2967 = 0;
                            if(ends[14]>=biggest2967){
                              biggest2967=ends[14];
                            }
                            if(ends[15]>=biggest2967){
                              biggest2967=ends[15];
                            }
                            if(ends[16]>=biggest2967){
                              biggest2967=ends[16];
                            }
                            if(ends[17]>=biggest2967){
                              biggest2967=ends[17];
                            }
                            if(biggest2967 == 1){
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
                S1655=13;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                thread2968(tdone,ends);
                thread2969(tdone,ends);
                thread2970(tdone,ends);
                thread2971(tdone,ends);
                int biggest2972 = 0;
                if(ends[14]>=biggest2972){
                  biggest2972=ends[14];
                }
                if(ends[15]>=biggest2972){
                  biggest2972=ends[15];
                }
                if(ends[16]>=biggest2972){
                  biggest2972=ends[16];
                }
                if(ends[17]>=biggest2972){
                  biggest2972=ends[17];
                }
                if(biggest2972 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest2972 == 0){
                  S1655=13;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
            case 13 : 
              if(!tick.getprestatus()){//sysj\fillerController.sysj line: 131, column: 10
                System.out.println("Filling Liquid 4");//sysj\fillerController.sysj line: 132, column: 4
                S1655=14;
                if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 1){//sysj\fillerController.sysj line: 133, column: 7
                  S2023=0;
                  fill1.setPresent();//sysj\fillerController.sysj line: 135, column: 6
                  currsigs.addElement(fill1);
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  S2023=1;
                  if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 2){//sysj\fillerController.sysj line: 138, column: 13
                    S2022=0;
                    fill2.setPresent();//sysj\fillerController.sysj line: 140, column: 6
                    currsigs.addElement(fill2);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S2022=1;
                    if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 3){//sysj\fillerController.sysj line: 143, column: 13
                      S2021=0;
                      fill3.setPresent();//sysj\fillerController.sysj line: 145, column: 6
                      currsigs.addElement(fill3);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S2021=1;
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
              switch(S2023){
                case 0 : 
                  if(tick.getprestatus()){//sysj\fillerController.sysj line: 134, column: 11
                    S1655=15;
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
                  switch(S2022){
                    case 0 : 
                      if(tick.getprestatus()){//sysj\fillerController.sysj line: 139, column: 11
                        S1655=15;
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
                      switch(S2021){
                        case 0 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 144, column: 11
                            S1655=15;
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
                            S1655=15;
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
                S1655=0;
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
