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
  private int S3237 = 1;
  private int S1637 = 1;
  private int S1642 = 1;
  private int S1645 = 1;
  private int S1648 = 1;
  private int S1651 = 1;
  private int S1703 = 1;
  private int S1702 = 1;
  private int S1701 = 1;
  private int S1741 = 1;
  private int S1744 = 1;
  private int S1747 = 1;
  private int S1750 = 1;
  private int S1841 = 1;
  private int S1840 = 1;
  private int S1839 = 1;
  private int S1879 = 1;
  private int S1882 = 1;
  private int S1885 = 1;
  private int S1888 = 1;
  private int S1979 = 1;
  private int S1978 = 1;
  private int S1977 = 1;
  private int S2017 = 1;
  private int S2020 = 1;
  private int S2023 = 1;
  private int S2026 = 1;
  private int S2117 = 1;
  private int S2116 = 1;
  private int S2115 = 1;
  
  private int[] ends = new int[18];
  private int[] tdone = new int[18];
  
  public void thread3322(int [] tdone, int [] ends){
        switch(S2026){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(toFill4.getprestatus()){//sysj\fillerController.sysj line: 137, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 137, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(4);//sysj\fillerController.sysj line: 137, column: 23
          S2026=0;
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

  public void thread3321(int [] tdone, int [] ends){
        switch(S2023){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(toFill3.getprestatus()){//sysj\fillerController.sysj line: 135, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 135, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(3);//sysj\fillerController.sysj line: 135, column: 23
          S2023=0;
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

  public void thread3320(int [] tdone, int [] ends){
        switch(S2020){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(toFill2.getprestatus()){//sysj\fillerController.sysj line: 133, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 133, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(2);//sysj\fillerController.sysj line: 133, column: 23
          S2020=0;
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

  public void thread3319(int [] tdone, int [] ends){
        switch(S2017){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(toFill1.getprestatus()){//sysj\fillerController.sysj line: 131, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 131, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(1);//sysj\fillerController.sysj line: 131, column: 23
          S2017=0;
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

  public void thread3317(int [] tdone, int [] ends){
        S2026=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread3316(int [] tdone, int [] ends){
        S2023=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread3315(int [] tdone, int [] ends){
        S2020=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread3314(int [] tdone, int [] ends){
        S2017=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread3312(int [] tdone, int [] ends){
        S2026=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread3311(int [] tdone, int [] ends){
        S2023=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread3310(int [] tdone, int [] ends){
        S2020=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread3309(int [] tdone, int [] ends){
        S2017=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread3307(int [] tdone, int [] ends){
        S2026=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread3306(int [] tdone, int [] ends){
        S2023=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread3305(int [] tdone, int [] ends){
        S2020=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread3304(int [] tdone, int [] ends){
        S2017=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread3302(int [] tdone, int [] ends){
        S2026=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread3301(int [] tdone, int [] ends){
        S2023=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread3300(int [] tdone, int [] ends){
        S2020=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread3299(int [] tdone, int [] ends){
        S2017=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread3297(int [] tdone, int [] ends){
        switch(S1888){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(toFill4.getprestatus()){//sysj\fillerController.sysj line: 99, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 99, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(4);//sysj\fillerController.sysj line: 99, column: 23
          S1888=0;
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

  public void thread3296(int [] tdone, int [] ends){
        switch(S1885){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(toFill3.getprestatus()){//sysj\fillerController.sysj line: 97, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 97, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(3);//sysj\fillerController.sysj line: 97, column: 23
          S1885=0;
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

  public void thread3295(int [] tdone, int [] ends){
        switch(S1882){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(toFill2.getprestatus()){//sysj\fillerController.sysj line: 95, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 95, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(2);//sysj\fillerController.sysj line: 95, column: 23
          S1882=0;
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

  public void thread3294(int [] tdone, int [] ends){
        switch(S1879){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(toFill1.getprestatus()){//sysj\fillerController.sysj line: 93, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 93, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(1);//sysj\fillerController.sysj line: 93, column: 23
          S1879=0;
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

  public void thread3292(int [] tdone, int [] ends){
        S1888=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread3291(int [] tdone, int [] ends){
        S1885=1;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread3290(int [] tdone, int [] ends){
        S1882=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread3289(int [] tdone, int [] ends){
        S1879=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread3287(int [] tdone, int [] ends){
        S1888=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread3286(int [] tdone, int [] ends){
        S1885=1;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread3285(int [] tdone, int [] ends){
        S1882=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread3284(int [] tdone, int [] ends){
        S1879=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread3282(int [] tdone, int [] ends){
        S1888=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread3281(int [] tdone, int [] ends){
        S1885=1;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread3280(int [] tdone, int [] ends){
        S1882=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread3279(int [] tdone, int [] ends){
        S1879=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread3277(int [] tdone, int [] ends){
        S1888=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread3276(int [] tdone, int [] ends){
        S1885=1;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread3275(int [] tdone, int [] ends){
        S1882=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread3274(int [] tdone, int [] ends){
        S1879=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread3272(int [] tdone, int [] ends){
        switch(S1750){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(toFill4.getprestatus()){//sysj\fillerController.sysj line: 61, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 61, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(4);//sysj\fillerController.sysj line: 61, column: 23
          S1750=0;
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

  public void thread3271(int [] tdone, int [] ends){
        switch(S1747){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(toFill3.getprestatus()){//sysj\fillerController.sysj line: 59, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 59, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(3);//sysj\fillerController.sysj line: 59, column: 23
          S1747=0;
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

  public void thread3270(int [] tdone, int [] ends){
        switch(S1744){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(toFill2.getprestatus()){//sysj\fillerController.sysj line: 57, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 57, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(2);//sysj\fillerController.sysj line: 57, column: 23
          S1744=0;
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

  public void thread3269(int [] tdone, int [] ends){
        switch(S1741){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(toFill1.getprestatus()){//sysj\fillerController.sysj line: 55, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 55, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(1);//sysj\fillerController.sysj line: 55, column: 23
          S1741=0;
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

  public void thread3267(int [] tdone, int [] ends){
        S1750=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread3266(int [] tdone, int [] ends){
        S1747=1;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread3265(int [] tdone, int [] ends){
        S1744=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread3264(int [] tdone, int [] ends){
        S1741=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread3262(int [] tdone, int [] ends){
        S1750=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread3261(int [] tdone, int [] ends){
        S1747=1;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread3260(int [] tdone, int [] ends){
        S1744=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread3259(int [] tdone, int [] ends){
        S1741=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread3257(int [] tdone, int [] ends){
        S1750=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread3256(int [] tdone, int [] ends){
        S1747=1;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread3255(int [] tdone, int [] ends){
        S1744=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread3254(int [] tdone, int [] ends){
        S1741=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread3252(int [] tdone, int [] ends){
        S1750=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread3251(int [] tdone, int [] ends){
        S1747=1;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread3250(int [] tdone, int [] ends){
        S1744=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread3249(int [] tdone, int [] ends){
        S1741=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread3247(int [] tdone, int [] ends){
        switch(S1651){
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
          S1651=0;
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

  public void thread3246(int [] tdone, int [] ends){
        switch(S1648){
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
          S1648=0;
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

  public void thread3245(int [] tdone, int [] ends){
        switch(S1645){
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
          S1645=0;
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

  public void thread3244(int [] tdone, int [] ends){
        switch(S1642){
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
          S1642=0;
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

  public void thread3242(int [] tdone, int [] ends){
        S1651=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread3241(int [] tdone, int [] ends){
        S1648=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread3240(int [] tdone, int [] ends){
        S1645=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread3239(int [] tdone, int [] ends){
        S1642=1;
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
      switch(S3237){
        case 0 : 
          S3237=0;
          break RUN;
        
        case 1 : 
          S3237=2;
          S3237=2;
          liquidType_1.setClear();//sysj\fillerController.sysj line: 7, column: 2
          S1637=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          liquidType_1.setClear();//sysj\fillerController.sysj line: 7, column: 2
          switch(S1637){
            case 0 : 
              if(fillerEnable.getprestatus()){//sysj\fillerController.sysj line: 10, column: 10
                S1637=1;
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
                S1637=2;
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
                S1637=3;
                thread3239(tdone,ends);
                thread3240(tdone,ends);
                thread3241(tdone,ends);
                thread3242(tdone,ends);
                int biggest3243 = 0;
                if(ends[2]>=biggest3243){
                  biggest3243=ends[2];
                }
                if(ends[3]>=biggest3243){
                  biggest3243=ends[3];
                }
                if(ends[4]>=biggest3243){
                  biggest3243=ends[4];
                }
                if(ends[5]>=biggest3243){
                  biggest3243=ends[5];
                }
                if(biggest3243 == 1){
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
                S1637=4;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                thread3244(tdone,ends);
                thread3245(tdone,ends);
                thread3246(tdone,ends);
                thread3247(tdone,ends);
                int biggest3248 = 0;
                if(ends[2]>=biggest3248){
                  biggest3248=ends[2];
                }
                if(ends[3]>=biggest3248){
                  biggest3248=ends[3];
                }
                if(ends[4]>=biggest3248){
                  biggest3248=ends[4];
                }
                if(ends[5]>=biggest3248){
                  biggest3248=ends[5];
                }
                if(biggest3248 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest3248 == 0){
                  S1637=4;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
            case 4 : 
              if(!tick.getprestatus()){//sysj\fillerController.sysj line: 26, column: 10
                S1637=5;
                if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 1){//sysj\fillerController.sysj line: 27, column: 7
                  S1703=0;
                  System.out.println("Filling 1 to 25%\n");//sysj\fillerController.sysj line: 29, column: 6
                  fill1.setPresent();//sysj\fillerController.sysj line: 30, column: 6
                  currsigs.addElement(fill1);
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  S1703=1;
                  if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 2){//sysj\fillerController.sysj line: 33, column: 13
                    S1702=0;
                    System.out.println("Filling with 2 to 25%\n");//sysj\fillerController.sysj line: 35, column: 6
                    fill2.setPresent();//sysj\fillerController.sysj line: 36, column: 6
                    currsigs.addElement(fill2);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S1702=1;
                    if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 3){//sysj\fillerController.sysj line: 39, column: 13
                      S1701=0;
                      System.out.println("Filling with 3 to 25%\n");//sysj\fillerController.sysj line: 41, column: 6
                      fill3.setPresent();//sysj\fillerController.sysj line: 42, column: 6
                      currsigs.addElement(fill3);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S1701=1;
                      System.out.println("Filling with 4 to 25%\n");//sysj\fillerController.sysj line: 47, column: 6
                      fill4.setPresent();//sysj\fillerController.sysj line: 48, column: 6
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
              switch(S1703){
                case 0 : 
                  if(tick.getprestatus()){//sysj\fillerController.sysj line: 28, column: 11
                    System.out.println("Select Liquid 2");//sysj\fillerController.sysj line: 52, column: 4
                    S1637=6;
                    thread3249(tdone,ends);
                    thread3250(tdone,ends);
                    thread3251(tdone,ends);
                    thread3252(tdone,ends);
                    int biggest3253 = 0;
                    if(ends[6]>=biggest3253){
                      biggest3253=ends[6];
                    }
                    if(ends[7]>=biggest3253){
                      biggest3253=ends[7];
                    }
                    if(ends[8]>=biggest3253){
                      biggest3253=ends[8];
                    }
                    if(ends[9]>=biggest3253){
                      biggest3253=ends[9];
                    }
                    if(biggest3253 == 1){
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
                  switch(S1702){
                    case 0 : 
                      if(tick.getprestatus()){//sysj\fillerController.sysj line: 34, column: 11
                        System.out.println("Select Liquid 2");//sysj\fillerController.sysj line: 52, column: 4
                        S1637=6;
                        thread3254(tdone,ends);
                        thread3255(tdone,ends);
                        thread3256(tdone,ends);
                        thread3257(tdone,ends);
                        int biggest3258 = 0;
                        if(ends[6]>=biggest3258){
                          biggest3258=ends[6];
                        }
                        if(ends[7]>=biggest3258){
                          biggest3258=ends[7];
                        }
                        if(ends[8]>=biggest3258){
                          biggest3258=ends[8];
                        }
                        if(ends[9]>=biggest3258){
                          biggest3258=ends[9];
                        }
                        if(biggest3258 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        fill2.setPresent();//sysj\fillerController.sysj line: 36, column: 6
                        currsigs.addElement(fill2);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                    case 1 : 
                      switch(S1701){
                        case 0 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 40, column: 11
                            System.out.println("Select Liquid 2");//sysj\fillerController.sysj line: 52, column: 4
                            S1637=6;
                            thread3259(tdone,ends);
                            thread3260(tdone,ends);
                            thread3261(tdone,ends);
                            thread3262(tdone,ends);
                            int biggest3263 = 0;
                            if(ends[6]>=biggest3263){
                              biggest3263=ends[6];
                            }
                            if(ends[7]>=biggest3263){
                              biggest3263=ends[7];
                            }
                            if(ends[8]>=biggest3263){
                              biggest3263=ends[8];
                            }
                            if(ends[9]>=biggest3263){
                              biggest3263=ends[9];
                            }
                            if(biggest3263 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            fill3.setPresent();//sysj\fillerController.sysj line: 42, column: 6
                            currsigs.addElement(fill3);
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        
                        case 1 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 46, column: 11
                            System.out.println("Select Liquid 2");//sysj\fillerController.sysj line: 52, column: 4
                            S1637=6;
                            thread3264(tdone,ends);
                            thread3265(tdone,ends);
                            thread3266(tdone,ends);
                            thread3267(tdone,ends);
                            int biggest3268 = 0;
                            if(ends[6]>=biggest3268){
                              biggest3268=ends[6];
                            }
                            if(ends[7]>=biggest3268){
                              biggest3268=ends[7];
                            }
                            if(ends[8]>=biggest3268){
                              biggest3268=ends[8];
                            }
                            if(ends[9]>=biggest3268){
                              biggest3268=ends[9];
                            }
                            if(biggest3268 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            fill4.setPresent();//sysj\fillerController.sysj line: 48, column: 6
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
              if(liquidType_1.getprestatus()){//sysj\fillerController.sysj line: 54, column: 10
                S1637=7;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                thread3269(tdone,ends);
                thread3270(tdone,ends);
                thread3271(tdone,ends);
                thread3272(tdone,ends);
                int biggest3273 = 0;
                if(ends[6]>=biggest3273){
                  biggest3273=ends[6];
                }
                if(ends[7]>=biggest3273){
                  biggest3273=ends[7];
                }
                if(ends[8]>=biggest3273){
                  biggest3273=ends[8];
                }
                if(ends[9]>=biggest3273){
                  biggest3273=ends[9];
                }
                if(biggest3273 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest3273 == 0){
                  S1637=7;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
            case 7 : 
              if(!tick.getprestatus()){//sysj\fillerController.sysj line: 64, column: 10
                S1637=8;
                if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 1){//sysj\fillerController.sysj line: 65, column: 7
                  S1841=0;
                  System.out.println("Filling with 1 to 50%\n");//sysj\fillerController.sysj line: 67, column: 6
                  fill1.setPresent();//sysj\fillerController.sysj line: 68, column: 6
                  currsigs.addElement(fill1);
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  S1841=1;
                  if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 2){//sysj\fillerController.sysj line: 71, column: 13
                    S1840=0;
                    System.out.println("Filling with 2 to 50%\n");//sysj\fillerController.sysj line: 73, column: 6
                    fill2.setPresent();//sysj\fillerController.sysj line: 74, column: 6
                    currsigs.addElement(fill2);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S1840=1;
                    if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 3){//sysj\fillerController.sysj line: 77, column: 13
                      S1839=0;
                      System.out.println("Filling with 3 to 50%\n");//sysj\fillerController.sysj line: 79, column: 6
                      fill3.setPresent();//sysj\fillerController.sysj line: 80, column: 6
                      currsigs.addElement(fill3);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S1839=1;
                      System.out.println("Filling with 4 to 50%\n");//sysj\fillerController.sysj line: 85, column: 6
                      fill4.setPresent();//sysj\fillerController.sysj line: 86, column: 6
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
              switch(S1841){
                case 0 : 
                  if(tick.getprestatus()){//sysj\fillerController.sysj line: 66, column: 11
                    System.out.println("Select Liquid 3");//sysj\fillerController.sysj line: 90, column: 4
                    S1637=9;
                    thread3274(tdone,ends);
                    thread3275(tdone,ends);
                    thread3276(tdone,ends);
                    thread3277(tdone,ends);
                    int biggest3278 = 0;
                    if(ends[10]>=biggest3278){
                      biggest3278=ends[10];
                    }
                    if(ends[11]>=biggest3278){
                      biggest3278=ends[11];
                    }
                    if(ends[12]>=biggest3278){
                      biggest3278=ends[12];
                    }
                    if(ends[13]>=biggest3278){
                      biggest3278=ends[13];
                    }
                    if(biggest3278 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    fill1.setPresent();//sysj\fillerController.sysj line: 68, column: 6
                    currsigs.addElement(fill1);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 1 : 
                  switch(S1840){
                    case 0 : 
                      if(tick.getprestatus()){//sysj\fillerController.sysj line: 72, column: 11
                        System.out.println("Select Liquid 3");//sysj\fillerController.sysj line: 90, column: 4
                        S1637=9;
                        thread3279(tdone,ends);
                        thread3280(tdone,ends);
                        thread3281(tdone,ends);
                        thread3282(tdone,ends);
                        int biggest3283 = 0;
                        if(ends[10]>=biggest3283){
                          biggest3283=ends[10];
                        }
                        if(ends[11]>=biggest3283){
                          biggest3283=ends[11];
                        }
                        if(ends[12]>=biggest3283){
                          biggest3283=ends[12];
                        }
                        if(ends[13]>=biggest3283){
                          biggest3283=ends[13];
                        }
                        if(biggest3283 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        fill2.setPresent();//sysj\fillerController.sysj line: 74, column: 6
                        currsigs.addElement(fill2);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                    case 1 : 
                      switch(S1839){
                        case 0 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 78, column: 11
                            System.out.println("Select Liquid 3");//sysj\fillerController.sysj line: 90, column: 4
                            S1637=9;
                            thread3284(tdone,ends);
                            thread3285(tdone,ends);
                            thread3286(tdone,ends);
                            thread3287(tdone,ends);
                            int biggest3288 = 0;
                            if(ends[10]>=biggest3288){
                              biggest3288=ends[10];
                            }
                            if(ends[11]>=biggest3288){
                              biggest3288=ends[11];
                            }
                            if(ends[12]>=biggest3288){
                              biggest3288=ends[12];
                            }
                            if(ends[13]>=biggest3288){
                              biggest3288=ends[13];
                            }
                            if(biggest3288 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            fill3.setPresent();//sysj\fillerController.sysj line: 80, column: 6
                            currsigs.addElement(fill3);
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        
                        case 1 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 84, column: 11
                            System.out.println("Select Liquid 3");//sysj\fillerController.sysj line: 90, column: 4
                            S1637=9;
                            thread3289(tdone,ends);
                            thread3290(tdone,ends);
                            thread3291(tdone,ends);
                            thread3292(tdone,ends);
                            int biggest3293 = 0;
                            if(ends[10]>=biggest3293){
                              biggest3293=ends[10];
                            }
                            if(ends[11]>=biggest3293){
                              biggest3293=ends[11];
                            }
                            if(ends[12]>=biggest3293){
                              biggest3293=ends[12];
                            }
                            if(ends[13]>=biggest3293){
                              biggest3293=ends[13];
                            }
                            if(biggest3293 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            fill4.setPresent();//sysj\fillerController.sysj line: 86, column: 6
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
              if(liquidType_1.getprestatus()){//sysj\fillerController.sysj line: 92, column: 10
                S1637=10;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                thread3294(tdone,ends);
                thread3295(tdone,ends);
                thread3296(tdone,ends);
                thread3297(tdone,ends);
                int biggest3298 = 0;
                if(ends[10]>=biggest3298){
                  biggest3298=ends[10];
                }
                if(ends[11]>=biggest3298){
                  biggest3298=ends[11];
                }
                if(ends[12]>=biggest3298){
                  biggest3298=ends[12];
                }
                if(ends[13]>=biggest3298){
                  biggest3298=ends[13];
                }
                if(biggest3298 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest3298 == 0){
                  S1637=10;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
            case 10 : 
              if(!tick.getprestatus()){//sysj\fillerController.sysj line: 102, column: 10
                S1637=11;
                if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 1){//sysj\fillerController.sysj line: 103, column: 7
                  S1979=0;
                  System.out.println("Filling with 1 to 75%\n");//sysj\fillerController.sysj line: 105, column: 6
                  fill1.setPresent();//sysj\fillerController.sysj line: 106, column: 6
                  currsigs.addElement(fill1);
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  S1979=1;
                  if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 2){//sysj\fillerController.sysj line: 109, column: 13
                    S1978=0;
                    System.out.println("Filling with 2 to 75%\n");//sysj\fillerController.sysj line: 111, column: 6
                    fill2.setPresent();//sysj\fillerController.sysj line: 112, column: 6
                    currsigs.addElement(fill2);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S1978=1;
                    if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 3){//sysj\fillerController.sysj line: 115, column: 13
                      S1977=0;
                      System.out.println("Filling with 3 to 75%\n");//sysj\fillerController.sysj line: 117, column: 6
                      fill3.setPresent();//sysj\fillerController.sysj line: 118, column: 6
                      currsigs.addElement(fill3);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S1977=1;
                      System.out.println("Filling with 4 to 75%\n");//sysj\fillerController.sysj line: 123, column: 6
                      fill4.setPresent();//sysj\fillerController.sysj line: 124, column: 6
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
              switch(S1979){
                case 0 : 
                  if(tick.getprestatus()){//sysj\fillerController.sysj line: 104, column: 11
                    System.out.println("Select Liquid 4");//sysj\fillerController.sysj line: 128, column: 4
                    S1637=12;
                    thread3299(tdone,ends);
                    thread3300(tdone,ends);
                    thread3301(tdone,ends);
                    thread3302(tdone,ends);
                    int biggest3303 = 0;
                    if(ends[14]>=biggest3303){
                      biggest3303=ends[14];
                    }
                    if(ends[15]>=biggest3303){
                      biggest3303=ends[15];
                    }
                    if(ends[16]>=biggest3303){
                      biggest3303=ends[16];
                    }
                    if(ends[17]>=biggest3303){
                      biggest3303=ends[17];
                    }
                    if(biggest3303 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    fill1.setPresent();//sysj\fillerController.sysj line: 106, column: 6
                    currsigs.addElement(fill1);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 1 : 
                  switch(S1978){
                    case 0 : 
                      if(tick.getprestatus()){//sysj\fillerController.sysj line: 110, column: 11
                        System.out.println("Select Liquid 4");//sysj\fillerController.sysj line: 128, column: 4
                        S1637=12;
                        thread3304(tdone,ends);
                        thread3305(tdone,ends);
                        thread3306(tdone,ends);
                        thread3307(tdone,ends);
                        int biggest3308 = 0;
                        if(ends[14]>=biggest3308){
                          biggest3308=ends[14];
                        }
                        if(ends[15]>=biggest3308){
                          biggest3308=ends[15];
                        }
                        if(ends[16]>=biggest3308){
                          biggest3308=ends[16];
                        }
                        if(ends[17]>=biggest3308){
                          biggest3308=ends[17];
                        }
                        if(biggest3308 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        fill2.setPresent();//sysj\fillerController.sysj line: 112, column: 6
                        currsigs.addElement(fill2);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                    case 1 : 
                      switch(S1977){
                        case 0 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 116, column: 11
                            System.out.println("Select Liquid 4");//sysj\fillerController.sysj line: 128, column: 4
                            S1637=12;
                            thread3309(tdone,ends);
                            thread3310(tdone,ends);
                            thread3311(tdone,ends);
                            thread3312(tdone,ends);
                            int biggest3313 = 0;
                            if(ends[14]>=biggest3313){
                              biggest3313=ends[14];
                            }
                            if(ends[15]>=biggest3313){
                              biggest3313=ends[15];
                            }
                            if(ends[16]>=biggest3313){
                              biggest3313=ends[16];
                            }
                            if(ends[17]>=biggest3313){
                              biggest3313=ends[17];
                            }
                            if(biggest3313 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            fill3.setPresent();//sysj\fillerController.sysj line: 118, column: 6
                            currsigs.addElement(fill3);
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        
                        case 1 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 122, column: 11
                            System.out.println("Select Liquid 4");//sysj\fillerController.sysj line: 128, column: 4
                            S1637=12;
                            thread3314(tdone,ends);
                            thread3315(tdone,ends);
                            thread3316(tdone,ends);
                            thread3317(tdone,ends);
                            int biggest3318 = 0;
                            if(ends[14]>=biggest3318){
                              biggest3318=ends[14];
                            }
                            if(ends[15]>=biggest3318){
                              biggest3318=ends[15];
                            }
                            if(ends[16]>=biggest3318){
                              biggest3318=ends[16];
                            }
                            if(ends[17]>=biggest3318){
                              biggest3318=ends[17];
                            }
                            if(biggest3318 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            fill4.setPresent();//sysj\fillerController.sysj line: 124, column: 6
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
              if(liquidType_1.getprestatus()){//sysj\fillerController.sysj line: 130, column: 10
                S1637=13;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                thread3319(tdone,ends);
                thread3320(tdone,ends);
                thread3321(tdone,ends);
                thread3322(tdone,ends);
                int biggest3323 = 0;
                if(ends[14]>=biggest3323){
                  biggest3323=ends[14];
                }
                if(ends[15]>=biggest3323){
                  biggest3323=ends[15];
                }
                if(ends[16]>=biggest3323){
                  biggest3323=ends[16];
                }
                if(ends[17]>=biggest3323){
                  biggest3323=ends[17];
                }
                if(biggest3323 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest3323 == 0){
                  S1637=13;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
            case 13 : 
              if(!tick.getprestatus()){//sysj\fillerController.sysj line: 140, column: 10
                S1637=14;
                if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 1){//sysj\fillerController.sysj line: 141, column: 7
                  S2117=0;
                  System.out.println("Filling with 1 to 100%\n");//sysj\fillerController.sysj line: 143, column: 6
                  fill1.setPresent();//sysj\fillerController.sysj line: 144, column: 6
                  currsigs.addElement(fill1);
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  S2117=1;
                  if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 2){//sysj\fillerController.sysj line: 147, column: 13
                    S2116=0;
                    System.out.println("Filling with 2 to 100%\n");//sysj\fillerController.sysj line: 149, column: 6
                    fill2.setPresent();//sysj\fillerController.sysj line: 150, column: 6
                    currsigs.addElement(fill2);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S2116=1;
                    if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 3){//sysj\fillerController.sysj line: 153, column: 13
                      S2115=0;
                      System.out.println("Filling with 3 to 100%\n");//sysj\fillerController.sysj line: 155, column: 6
                      fill3.setPresent();//sysj\fillerController.sysj line: 156, column: 6
                      currsigs.addElement(fill3);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S2115=1;
                      System.out.println("Filling with 4 to 100%\n");//sysj\fillerController.sysj line: 161, column: 6
                      fill4.setPresent();//sysj\fillerController.sysj line: 162, column: 6
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
              switch(S2117){
                case 0 : 
                  if(tick.getprestatus()){//sysj\fillerController.sysj line: 142, column: 11
                    S1637=15;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    fill1.setPresent();//sysj\fillerController.sysj line: 144, column: 6
                    currsigs.addElement(fill1);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 1 : 
                  switch(S2116){
                    case 0 : 
                      if(tick.getprestatus()){//sysj\fillerController.sysj line: 148, column: 11
                        S1637=15;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        fill2.setPresent();//sysj\fillerController.sysj line: 150, column: 6
                        currsigs.addElement(fill2);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                    case 1 : 
                      switch(S2115){
                        case 0 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 154, column: 11
                            S1637=15;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            fill3.setPresent();//sysj\fillerController.sysj line: 156, column: 6
                            currsigs.addElement(fill3);
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        
                        case 1 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 160, column: 11
                            S1637=15;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            fill4.setPresent();//sysj\fillerController.sysj line: 162, column: 6
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
              if(!tick.getprestatus()){//sysj\fillerController.sysj line: 166, column: 10
                S1637=16;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 16 : 
              if(tick.getprestatus()){//sysj\fillerController.sysj line: 167, column: 10
                S1637=17;
                fillerDone.setPresent();//sysj\fillerController.sysj line: 169, column: 5
                currsigs.addElement(fillerDone);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 17 : 
              if(!fillerEnable.getprestatus()){//sysj\fillerController.sysj line: 168, column: 10
                S1637=0;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                fillerDone.setPresent();//sysj\fillerController.sysj line: 169, column: 5
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
