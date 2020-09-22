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
  private int S3246 = 1;
  private int S1631 = 1;
  private int S1636 = 1;
  private int S1639 = 1;
  private int S1642 = 1;
  private int S1645 = 1;
  private int S1697 = 1;
  private int S1696 = 1;
  private int S1695 = 1;
  private int S1735 = 1;
  private int S1738 = 1;
  private int S1741 = 1;
  private int S1744 = 1;
  private int S1835 = 1;
  private int S1834 = 1;
  private int S1833 = 1;
  private int S1873 = 1;
  private int S1876 = 1;
  private int S1879 = 1;
  private int S1882 = 1;
  private int S1973 = 1;
  private int S1972 = 1;
  private int S1971 = 1;
  private int S2011 = 1;
  private int S2014 = 1;
  private int S2017 = 1;
  private int S2020 = 1;
  private int S2111 = 1;
  private int S2110 = 1;
  private int S2109 = 1;
  
  private int[] ends = new int[18];
  private int[] tdone = new int[18];
  
  public void thread3331(int [] tdone, int [] ends){
        switch(S2020){
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
          S2020=0;
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

  public void thread3330(int [] tdone, int [] ends){
        switch(S2017){
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
          S2017=0;
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

  public void thread3329(int [] tdone, int [] ends){
        switch(S2014){
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
          S2014=0;
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

  public void thread3328(int [] tdone, int [] ends){
        switch(S2011){
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
          S2011=0;
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

  public void thread3326(int [] tdone, int [] ends){
        S2020=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread3325(int [] tdone, int [] ends){
        S2017=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread3324(int [] tdone, int [] ends){
        S2014=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread3323(int [] tdone, int [] ends){
        S2011=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread3321(int [] tdone, int [] ends){
        S2020=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread3320(int [] tdone, int [] ends){
        S2017=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread3319(int [] tdone, int [] ends){
        S2014=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread3318(int [] tdone, int [] ends){
        S2011=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread3316(int [] tdone, int [] ends){
        S2020=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread3315(int [] tdone, int [] ends){
        S2017=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread3314(int [] tdone, int [] ends){
        S2014=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread3313(int [] tdone, int [] ends){
        S2011=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread3311(int [] tdone, int [] ends){
        S2020=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread3310(int [] tdone, int [] ends){
        S2017=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread3309(int [] tdone, int [] ends){
        S2014=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread3308(int [] tdone, int [] ends){
        S2011=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread3306(int [] tdone, int [] ends){
        switch(S1882){
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
          S1882=0;
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

  public void thread3305(int [] tdone, int [] ends){
        switch(S1879){
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
          S1879=0;
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

  public void thread3304(int [] tdone, int [] ends){
        switch(S1876){
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
          S1876=0;
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

  public void thread3303(int [] tdone, int [] ends){
        switch(S1873){
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
          S1873=0;
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

  public void thread3301(int [] tdone, int [] ends){
        S1882=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread3300(int [] tdone, int [] ends){
        S1879=1;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread3299(int [] tdone, int [] ends){
        S1876=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread3298(int [] tdone, int [] ends){
        S1873=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread3296(int [] tdone, int [] ends){
        S1882=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread3295(int [] tdone, int [] ends){
        S1879=1;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread3294(int [] tdone, int [] ends){
        S1876=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread3293(int [] tdone, int [] ends){
        S1873=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread3291(int [] tdone, int [] ends){
        S1882=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread3290(int [] tdone, int [] ends){
        S1879=1;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread3289(int [] tdone, int [] ends){
        S1876=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread3288(int [] tdone, int [] ends){
        S1873=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread3286(int [] tdone, int [] ends){
        S1882=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread3285(int [] tdone, int [] ends){
        S1879=1;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread3284(int [] tdone, int [] ends){
        S1876=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread3283(int [] tdone, int [] ends){
        S1873=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread3281(int [] tdone, int [] ends){
        switch(S1744){
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
          S1744=0;
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

  public void thread3280(int [] tdone, int [] ends){
        switch(S1741){
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
          S1741=0;
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

  public void thread3279(int [] tdone, int [] ends){
        switch(S1738){
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
          S1738=0;
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

  public void thread3278(int [] tdone, int [] ends){
        switch(S1735){
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
          S1735=0;
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

  public void thread3276(int [] tdone, int [] ends){
        S1744=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread3275(int [] tdone, int [] ends){
        S1741=1;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread3274(int [] tdone, int [] ends){
        S1738=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread3273(int [] tdone, int [] ends){
        S1735=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread3271(int [] tdone, int [] ends){
        S1744=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread3270(int [] tdone, int [] ends){
        S1741=1;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread3269(int [] tdone, int [] ends){
        S1738=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread3268(int [] tdone, int [] ends){
        S1735=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread3266(int [] tdone, int [] ends){
        S1744=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread3265(int [] tdone, int [] ends){
        S1741=1;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread3264(int [] tdone, int [] ends){
        S1738=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread3263(int [] tdone, int [] ends){
        S1735=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread3261(int [] tdone, int [] ends){
        S1744=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread3260(int [] tdone, int [] ends){
        S1741=1;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread3259(int [] tdone, int [] ends){
        S1738=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread3258(int [] tdone, int [] ends){
        S1735=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread3256(int [] tdone, int [] ends){
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

  public void thread3255(int [] tdone, int [] ends){
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

  public void thread3254(int [] tdone, int [] ends){
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

  public void thread3253(int [] tdone, int [] ends){
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

  public void thread3251(int [] tdone, int [] ends){
        S1645=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread3250(int [] tdone, int [] ends){
        S1642=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread3249(int [] tdone, int [] ends){
        S1639=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread3248(int [] tdone, int [] ends){
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
      switch(S3246){
        case 0 : 
          S3246=0;
          break RUN;
        
        case 1 : 
          S3246=2;
          S3246=2;
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
                thread3248(tdone,ends);
                thread3249(tdone,ends);
                thread3250(tdone,ends);
                thread3251(tdone,ends);
                int biggest3252 = 0;
                if(ends[2]>=biggest3252){
                  biggest3252=ends[2];
                }
                if(ends[3]>=biggest3252){
                  biggest3252=ends[3];
                }
                if(ends[4]>=biggest3252){
                  biggest3252=ends[4];
                }
                if(ends[5]>=biggest3252){
                  biggest3252=ends[5];
                }
                if(biggest3252 == 1){
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
                thread3253(tdone,ends);
                thread3254(tdone,ends);
                thread3255(tdone,ends);
                thread3256(tdone,ends);
                int biggest3257 = 0;
                if(ends[2]>=biggest3257){
                  biggest3257=ends[2];
                }
                if(ends[3]>=biggest3257){
                  biggest3257=ends[3];
                }
                if(ends[4]>=biggest3257){
                  biggest3257=ends[4];
                }
                if(ends[5]>=biggest3257){
                  biggest3257=ends[5];
                }
                if(biggest3257 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest3257 == 0){
                  S1631=4;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
            case 4 : 
              if(!tick.getprestatus()){//sysj\fillerController.sysj line: 26, column: 10
                S1631=5;
                if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 1){//sysj\fillerController.sysj line: 27, column: 7
                  S1697=0;
                  System.out.println("Filling 1 to 25%\n");//sysj\fillerController.sysj line: 29, column: 6
                  fill1.setPresent();//sysj\fillerController.sysj line: 30, column: 6
                  currsigs.addElement(fill1);
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  S1697=1;
                  if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 2){//sysj\fillerController.sysj line: 33, column: 13
                    S1696=0;
                    System.out.println("Filling with 2 to 25%\n");//sysj\fillerController.sysj line: 35, column: 6
                    fill2.setPresent();//sysj\fillerController.sysj line: 36, column: 6
                    currsigs.addElement(fill2);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S1696=1;
                    if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 3){//sysj\fillerController.sysj line: 39, column: 13
                      S1695=0;
                      System.out.println("Filling with 3 to 25%\n");//sysj\fillerController.sysj line: 41, column: 6
                      fill3.setPresent();//sysj\fillerController.sysj line: 42, column: 6
                      currsigs.addElement(fill3);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S1695=1;
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
              switch(S1697){
                case 0 : 
                  if(tick.getprestatus()){//sysj\fillerController.sysj line: 28, column: 11
                    System.out.println("Select Liquid 2");//sysj\fillerController.sysj line: 52, column: 4
                    S1631=6;
                    thread3258(tdone,ends);
                    thread3259(tdone,ends);
                    thread3260(tdone,ends);
                    thread3261(tdone,ends);
                    int biggest3262 = 0;
                    if(ends[6]>=biggest3262){
                      biggest3262=ends[6];
                    }
                    if(ends[7]>=biggest3262){
                      biggest3262=ends[7];
                    }
                    if(ends[8]>=biggest3262){
                      biggest3262=ends[8];
                    }
                    if(ends[9]>=biggest3262){
                      biggest3262=ends[9];
                    }
                    if(biggest3262 == 1){
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
                  switch(S1696){
                    case 0 : 
                      if(tick.getprestatus()){//sysj\fillerController.sysj line: 34, column: 11
                        System.out.println("Select Liquid 2");//sysj\fillerController.sysj line: 52, column: 4
                        S1631=6;
                        thread3263(tdone,ends);
                        thread3264(tdone,ends);
                        thread3265(tdone,ends);
                        thread3266(tdone,ends);
                        int biggest3267 = 0;
                        if(ends[6]>=biggest3267){
                          biggest3267=ends[6];
                        }
                        if(ends[7]>=biggest3267){
                          biggest3267=ends[7];
                        }
                        if(ends[8]>=biggest3267){
                          biggest3267=ends[8];
                        }
                        if(ends[9]>=biggest3267){
                          biggest3267=ends[9];
                        }
                        if(biggest3267 == 1){
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
                      switch(S1695){
                        case 0 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 40, column: 11
                            System.out.println("Select Liquid 2");//sysj\fillerController.sysj line: 52, column: 4
                            S1631=6;
                            thread3268(tdone,ends);
                            thread3269(tdone,ends);
                            thread3270(tdone,ends);
                            thread3271(tdone,ends);
                            int biggest3272 = 0;
                            if(ends[6]>=biggest3272){
                              biggest3272=ends[6];
                            }
                            if(ends[7]>=biggest3272){
                              biggest3272=ends[7];
                            }
                            if(ends[8]>=biggest3272){
                              biggest3272=ends[8];
                            }
                            if(ends[9]>=biggest3272){
                              biggest3272=ends[9];
                            }
                            if(biggest3272 == 1){
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
                            S1631=6;
                            thread3273(tdone,ends);
                            thread3274(tdone,ends);
                            thread3275(tdone,ends);
                            thread3276(tdone,ends);
                            int biggest3277 = 0;
                            if(ends[6]>=biggest3277){
                              biggest3277=ends[6];
                            }
                            if(ends[7]>=biggest3277){
                              biggest3277=ends[7];
                            }
                            if(ends[8]>=biggest3277){
                              biggest3277=ends[8];
                            }
                            if(ends[9]>=biggest3277){
                              biggest3277=ends[9];
                            }
                            if(biggest3277 == 1){
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
                S1631=7;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                thread3278(tdone,ends);
                thread3279(tdone,ends);
                thread3280(tdone,ends);
                thread3281(tdone,ends);
                int biggest3282 = 0;
                if(ends[6]>=biggest3282){
                  biggest3282=ends[6];
                }
                if(ends[7]>=biggest3282){
                  biggest3282=ends[7];
                }
                if(ends[8]>=biggest3282){
                  biggest3282=ends[8];
                }
                if(ends[9]>=biggest3282){
                  biggest3282=ends[9];
                }
                if(biggest3282 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest3282 == 0){
                  S1631=7;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
            case 7 : 
              if(!tick.getprestatus()){//sysj\fillerController.sysj line: 64, column: 10
                S1631=8;
                if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 1){//sysj\fillerController.sysj line: 65, column: 7
                  S1835=0;
                  System.out.println("Filling with 1 to 50%\n");//sysj\fillerController.sysj line: 67, column: 6
                  fill1.setPresent();//sysj\fillerController.sysj line: 68, column: 6
                  currsigs.addElement(fill1);
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  S1835=1;
                  if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 2){//sysj\fillerController.sysj line: 71, column: 13
                    S1834=0;
                    System.out.println("Filling with 2 to 50%\n");//sysj\fillerController.sysj line: 73, column: 6
                    fill2.setPresent();//sysj\fillerController.sysj line: 74, column: 6
                    currsigs.addElement(fill2);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S1834=1;
                    if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 3){//sysj\fillerController.sysj line: 77, column: 13
                      S1833=0;
                      System.out.println("Filling with 3 to 50%\n");//sysj\fillerController.sysj line: 79, column: 6
                      fill3.setPresent();//sysj\fillerController.sysj line: 80, column: 6
                      currsigs.addElement(fill3);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S1833=1;
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
              switch(S1835){
                case 0 : 
                  if(tick.getprestatus()){//sysj\fillerController.sysj line: 66, column: 11
                    System.out.println("Select Liquid 3");//sysj\fillerController.sysj line: 90, column: 4
                    S1631=9;
                    thread3283(tdone,ends);
                    thread3284(tdone,ends);
                    thread3285(tdone,ends);
                    thread3286(tdone,ends);
                    int biggest3287 = 0;
                    if(ends[10]>=biggest3287){
                      biggest3287=ends[10];
                    }
                    if(ends[11]>=biggest3287){
                      biggest3287=ends[11];
                    }
                    if(ends[12]>=biggest3287){
                      biggest3287=ends[12];
                    }
                    if(ends[13]>=biggest3287){
                      biggest3287=ends[13];
                    }
                    if(biggest3287 == 1){
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
                  switch(S1834){
                    case 0 : 
                      if(tick.getprestatus()){//sysj\fillerController.sysj line: 72, column: 11
                        System.out.println("Select Liquid 3");//sysj\fillerController.sysj line: 90, column: 4
                        S1631=9;
                        thread3288(tdone,ends);
                        thread3289(tdone,ends);
                        thread3290(tdone,ends);
                        thread3291(tdone,ends);
                        int biggest3292 = 0;
                        if(ends[10]>=biggest3292){
                          biggest3292=ends[10];
                        }
                        if(ends[11]>=biggest3292){
                          biggest3292=ends[11];
                        }
                        if(ends[12]>=biggest3292){
                          biggest3292=ends[12];
                        }
                        if(ends[13]>=biggest3292){
                          biggest3292=ends[13];
                        }
                        if(biggest3292 == 1){
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
                      switch(S1833){
                        case 0 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 78, column: 11
                            System.out.println("Select Liquid 3");//sysj\fillerController.sysj line: 90, column: 4
                            S1631=9;
                            thread3293(tdone,ends);
                            thread3294(tdone,ends);
                            thread3295(tdone,ends);
                            thread3296(tdone,ends);
                            int biggest3297 = 0;
                            if(ends[10]>=biggest3297){
                              biggest3297=ends[10];
                            }
                            if(ends[11]>=biggest3297){
                              biggest3297=ends[11];
                            }
                            if(ends[12]>=biggest3297){
                              biggest3297=ends[12];
                            }
                            if(ends[13]>=biggest3297){
                              biggest3297=ends[13];
                            }
                            if(biggest3297 == 1){
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
                            S1631=9;
                            thread3298(tdone,ends);
                            thread3299(tdone,ends);
                            thread3300(tdone,ends);
                            thread3301(tdone,ends);
                            int biggest3302 = 0;
                            if(ends[10]>=biggest3302){
                              biggest3302=ends[10];
                            }
                            if(ends[11]>=biggest3302){
                              biggest3302=ends[11];
                            }
                            if(ends[12]>=biggest3302){
                              biggest3302=ends[12];
                            }
                            if(ends[13]>=biggest3302){
                              biggest3302=ends[13];
                            }
                            if(biggest3302 == 1){
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
                S1631=10;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                thread3303(tdone,ends);
                thread3304(tdone,ends);
                thread3305(tdone,ends);
                thread3306(tdone,ends);
                int biggest3307 = 0;
                if(ends[10]>=biggest3307){
                  biggest3307=ends[10];
                }
                if(ends[11]>=biggest3307){
                  biggest3307=ends[11];
                }
                if(ends[12]>=biggest3307){
                  biggest3307=ends[12];
                }
                if(ends[13]>=biggest3307){
                  biggest3307=ends[13];
                }
                if(biggest3307 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest3307 == 0){
                  S1631=10;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
            case 10 : 
              if(!tick.getprestatus()){//sysj\fillerController.sysj line: 102, column: 10
                S1631=11;
                if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 1){//sysj\fillerController.sysj line: 103, column: 7
                  S1973=0;
                  System.out.println("Filling with 1 to 75%\n");//sysj\fillerController.sysj line: 105, column: 6
                  fill1.setPresent();//sysj\fillerController.sysj line: 106, column: 6
                  currsigs.addElement(fill1);
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  S1973=1;
                  if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 2){//sysj\fillerController.sysj line: 109, column: 13
                    S1972=0;
                    System.out.println("Filling with 2 to 75%\n");//sysj\fillerController.sysj line: 111, column: 6
                    fill2.setPresent();//sysj\fillerController.sysj line: 112, column: 6
                    currsigs.addElement(fill2);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S1972=1;
                    if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 3){//sysj\fillerController.sysj line: 115, column: 13
                      S1971=0;
                      System.out.println("Filling with 3 to 75%\n");//sysj\fillerController.sysj line: 117, column: 6
                      fill3.setPresent();//sysj\fillerController.sysj line: 118, column: 6
                      currsigs.addElement(fill3);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S1971=1;
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
              switch(S1973){
                case 0 : 
                  if(tick.getprestatus()){//sysj\fillerController.sysj line: 104, column: 11
                    System.out.println("Select Liquid 4");//sysj\fillerController.sysj line: 128, column: 4
                    S1631=12;
                    thread3308(tdone,ends);
                    thread3309(tdone,ends);
                    thread3310(tdone,ends);
                    thread3311(tdone,ends);
                    int biggest3312 = 0;
                    if(ends[14]>=biggest3312){
                      biggest3312=ends[14];
                    }
                    if(ends[15]>=biggest3312){
                      biggest3312=ends[15];
                    }
                    if(ends[16]>=biggest3312){
                      biggest3312=ends[16];
                    }
                    if(ends[17]>=biggest3312){
                      biggest3312=ends[17];
                    }
                    if(biggest3312 == 1){
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
                  switch(S1972){
                    case 0 : 
                      if(tick.getprestatus()){//sysj\fillerController.sysj line: 110, column: 11
                        System.out.println("Select Liquid 4");//sysj\fillerController.sysj line: 128, column: 4
                        S1631=12;
                        thread3313(tdone,ends);
                        thread3314(tdone,ends);
                        thread3315(tdone,ends);
                        thread3316(tdone,ends);
                        int biggest3317 = 0;
                        if(ends[14]>=biggest3317){
                          biggest3317=ends[14];
                        }
                        if(ends[15]>=biggest3317){
                          biggest3317=ends[15];
                        }
                        if(ends[16]>=biggest3317){
                          biggest3317=ends[16];
                        }
                        if(ends[17]>=biggest3317){
                          biggest3317=ends[17];
                        }
                        if(biggest3317 == 1){
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
                      switch(S1971){
                        case 0 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 116, column: 11
                            System.out.println("Select Liquid 4");//sysj\fillerController.sysj line: 128, column: 4
                            S1631=12;
                            thread3318(tdone,ends);
                            thread3319(tdone,ends);
                            thread3320(tdone,ends);
                            thread3321(tdone,ends);
                            int biggest3322 = 0;
                            if(ends[14]>=biggest3322){
                              biggest3322=ends[14];
                            }
                            if(ends[15]>=biggest3322){
                              biggest3322=ends[15];
                            }
                            if(ends[16]>=biggest3322){
                              biggest3322=ends[16];
                            }
                            if(ends[17]>=biggest3322){
                              biggest3322=ends[17];
                            }
                            if(biggest3322 == 1){
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
                            S1631=12;
                            thread3323(tdone,ends);
                            thread3324(tdone,ends);
                            thread3325(tdone,ends);
                            thread3326(tdone,ends);
                            int biggest3327 = 0;
                            if(ends[14]>=biggest3327){
                              biggest3327=ends[14];
                            }
                            if(ends[15]>=biggest3327){
                              biggest3327=ends[15];
                            }
                            if(ends[16]>=biggest3327){
                              biggest3327=ends[16];
                            }
                            if(ends[17]>=biggest3327){
                              biggest3327=ends[17];
                            }
                            if(biggest3327 == 1){
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
                S1631=13;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                thread3328(tdone,ends);
                thread3329(tdone,ends);
                thread3330(tdone,ends);
                thread3331(tdone,ends);
                int biggest3332 = 0;
                if(ends[14]>=biggest3332){
                  biggest3332=ends[14];
                }
                if(ends[15]>=biggest3332){
                  biggest3332=ends[15];
                }
                if(ends[16]>=biggest3332){
                  biggest3332=ends[16];
                }
                if(ends[17]>=biggest3332){
                  biggest3332=ends[17];
                }
                if(biggest3332 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest3332 == 0){
                  S1631=13;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
            case 13 : 
              if(!tick.getprestatus()){//sysj\fillerController.sysj line: 140, column: 10
                S1631=14;
                if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 1){//sysj\fillerController.sysj line: 141, column: 7
                  S2111=0;
                  System.out.println("Filling with 1 to 100%\n");//sysj\fillerController.sysj line: 143, column: 6
                  fill1.setPresent();//sysj\fillerController.sysj line: 144, column: 6
                  currsigs.addElement(fill1);
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  S2111=1;
                  if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 2){//sysj\fillerController.sysj line: 147, column: 13
                    S2110=0;
                    System.out.println("Filling with 2 to 100%\n");//sysj\fillerController.sysj line: 149, column: 6
                    fill2.setPresent();//sysj\fillerController.sysj line: 150, column: 6
                    currsigs.addElement(fill2);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S2110=1;
                    if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 3){//sysj\fillerController.sysj line: 153, column: 13
                      S2109=0;
                      System.out.println("Filling with 3 to 100%\n");//sysj\fillerController.sysj line: 155, column: 6
                      fill3.setPresent();//sysj\fillerController.sysj line: 156, column: 6
                      currsigs.addElement(fill3);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S2109=1;
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
              switch(S2111){
                case 0 : 
                  if(tick.getprestatus()){//sysj\fillerController.sysj line: 142, column: 11
                    S1631=15;
                    fillerDone.setPresent();//sysj\fillerController.sysj line: 167, column: 5
                    currsigs.addElement(fillerDone);
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
                  switch(S2110){
                    case 0 : 
                      if(tick.getprestatus()){//sysj\fillerController.sysj line: 148, column: 11
                        S1631=15;
                        fillerDone.setPresent();//sysj\fillerController.sysj line: 167, column: 5
                        currsigs.addElement(fillerDone);
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
                      switch(S2109){
                        case 0 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 154, column: 11
                            S1631=15;
                            fillerDone.setPresent();//sysj\fillerController.sysj line: 167, column: 5
                            currsigs.addElement(fillerDone);
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
                            S1631=15;
                            fillerDone.setPresent();//sysj\fillerController.sysj line: 167, column: 5
                            currsigs.addElement(fillerDone);
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
              if(!fillerEnable.getprestatus()){//sysj\fillerController.sysj line: 166, column: 10
                S1631=0;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                fillerDone.setPresent();//sysj\fillerController.sysj line: 167, column: 5
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
