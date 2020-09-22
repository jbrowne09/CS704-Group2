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
  private int S3258 = 1;
  private int S1610 = 1;
  private int S1629 = 1;
  private int S1632 = 1;
  private int S1635 = 1;
  private int S1638 = 1;
  private int S1701 = 1;
  private int S1662 = 1;
  private int S1667 = 1;
  private int S1672 = 1;
  private int S1700 = 1;
  private int S1699 = 1;
  private int S1786 = 1;
  private int S1789 = 1;
  private int S1792 = 1;
  private int S1795 = 1;
  private int S1847 = 1;
  private int S1846 = 1;
  private int S1845 = 1;
  private int S1913 = 1;
  private int S1916 = 1;
  private int S1919 = 1;
  private int S1922 = 1;
  private int S1974 = 1;
  private int S1973 = 1;
  private int S1972 = 1;
  private int S2040 = 1;
  private int S2043 = 1;
  private int S2046 = 1;
  private int S2049 = 1;
  private int S2101 = 1;
  private int S2100 = 1;
  private int S2099 = 1;
  
  private int[] ends = new int[20];
  private int[] tdone = new int[20];
  
  public void thread3301(int [] tdone, int [] ends){
        switch(S2049){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        if(toFill4.getprestatus()){//sysj\fillerController.sysj line: 164, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 164, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(4);//sysj\fillerController.sysj line: 164, column: 23
          S2049=0;
          active[19]=0;
          ends[19]=0;
          tdone[19]=1;
        }
        else {
          active[19]=1;
          ends[19]=1;
          tdone[19]=1;
        }
        break;
      
    }
  }

  public void thread3300(int [] tdone, int [] ends){
        switch(S2046){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        if(toFill3.getprestatus()){//sysj\fillerController.sysj line: 162, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 162, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(3);//sysj\fillerController.sysj line: 162, column: 23
          S2046=0;
          active[18]=0;
          ends[18]=0;
          tdone[18]=1;
        }
        else {
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        break;
      
    }
  }

  public void thread3299(int [] tdone, int [] ends){
        switch(S2043){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(toFill2.getprestatus()){//sysj\fillerController.sysj line: 160, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 160, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(2);//sysj\fillerController.sysj line: 160, column: 23
          S2043=0;
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

  public void thread3298(int [] tdone, int [] ends){
        switch(S2040){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(toFill1.getprestatus()){//sysj\fillerController.sysj line: 158, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 158, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(1);//sysj\fillerController.sysj line: 158, column: 23
          S2040=0;
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

  public void thread3296(int [] tdone, int [] ends){
        S2049=1;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread3295(int [] tdone, int [] ends){
        S2046=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread3294(int [] tdone, int [] ends){
        S2043=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread3293(int [] tdone, int [] ends){
        S2040=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread3291(int [] tdone, int [] ends){
        switch(S1922){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(toFill4.getprestatus()){//sysj\fillerController.sysj line: 119, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 119, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(4);//sysj\fillerController.sysj line: 119, column: 23
          S1922=0;
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

  public void thread3290(int [] tdone, int [] ends){
        switch(S1919){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(toFill3.getprestatus()){//sysj\fillerController.sysj line: 117, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 117, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(3);//sysj\fillerController.sysj line: 117, column: 23
          S1919=0;
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

  public void thread3289(int [] tdone, int [] ends){
        switch(S1916){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(toFill2.getprestatus()){//sysj\fillerController.sysj line: 115, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 115, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(2);//sysj\fillerController.sysj line: 115, column: 23
          S1916=0;
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

  public void thread3288(int [] tdone, int [] ends){
        switch(S1913){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(toFill1.getprestatus()){//sysj\fillerController.sysj line: 113, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 113, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(1);//sysj\fillerController.sysj line: 113, column: 23
          S1913=0;
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

  public void thread3286(int [] tdone, int [] ends){
        S1922=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread3285(int [] tdone, int [] ends){
        S1919=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread3284(int [] tdone, int [] ends){
        S1916=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread3283(int [] tdone, int [] ends){
        S1913=1;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread3281(int [] tdone, int [] ends){
        switch(S1795){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(toFill4.getprestatus()){//sysj\fillerController.sysj line: 76, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 76, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(4);//sysj\fillerController.sysj line: 76, column: 23
          S1795=0;
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

  public void thread3280(int [] tdone, int [] ends){
        switch(S1792){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(toFill3.getprestatus()){//sysj\fillerController.sysj line: 74, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 74, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(3);//sysj\fillerController.sysj line: 74, column: 23
          S1792=0;
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

  public void thread3279(int [] tdone, int [] ends){
        switch(S1789){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(toFill2.getprestatus()){//sysj\fillerController.sysj line: 72, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 72, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(2);//sysj\fillerController.sysj line: 72, column: 23
          S1789=0;
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

  public void thread3278(int [] tdone, int [] ends){
        switch(S1786){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(toFill1.getprestatus()){//sysj\fillerController.sysj line: 70, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 70, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(1);//sysj\fillerController.sysj line: 70, column: 23
          S1786=0;
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

  public void thread3276(int [] tdone, int [] ends){
        S1795=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread3275(int [] tdone, int [] ends){
        S1792=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread3274(int [] tdone, int [] ends){
        S1789=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread3273(int [] tdone, int [] ends){
        S1786=1;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread3271(int [] tdone, int [] ends){
        switch(S1672){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        valveExtend.setPresent();//sysj\fillerController.sysj line: 38, column: 8
        currsigs.addElement(valveExtend);
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
        break;
      
    }
  }

  public void thread3270(int [] tdone, int [] ends){
        switch(S1667){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        inletOn.setPresent();//sysj\fillerController.sysj line: 36, column: 8
        currsigs.addElement(inletOn);
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
        break;
      
    }
  }

  public void thread3268(int [] tdone, int [] ends){
        switch(S1638){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(toFill4.getprestatus()){//sysj\fillerController.sysj line: 27, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 27, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(4);//sysj\fillerController.sysj line: 27, column: 23
          S1638=0;
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

  public void thread3267(int [] tdone, int [] ends){
        switch(S1635){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(toFill3.getprestatus()){//sysj\fillerController.sysj line: 25, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 25, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(3);//sysj\fillerController.sysj line: 25, column: 23
          S1635=0;
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

  public void thread3266(int [] tdone, int [] ends){
        switch(S1632){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(toFill2.getprestatus()){//sysj\fillerController.sysj line: 23, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 23, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(2);//sysj\fillerController.sysj line: 23, column: 23
          S1632=0;
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

  public void thread3265(int [] tdone, int [] ends){
        switch(S1629){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        if(toFill1.getprestatus()){//sysj\fillerController.sysj line: 21, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 21, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(1);//sysj\fillerController.sysj line: 21, column: 23
          S1629=0;
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

  public void thread3263(int [] tdone, int [] ends){
        S1638=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread3262(int [] tdone, int [] ends){
        S1635=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread3261(int [] tdone, int [] ends){
        S1632=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread3260(int [] tdone, int [] ends){
        S1629=1;
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
      switch(S3258){
        case 0 : 
          S3258=0;
          break RUN;
        
        case 1 : 
          S3258=2;
          S3258=2;
          liquidType_1.setClear();//sysj\fillerController.sysj line: 7, column: 2
          S1610=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          liquidType_1.setClear();//sysj\fillerController.sysj line: 7, column: 2
          switch(S1610){
            case 0 : 
              if(tick.getprestatus()){//sysj\fillerController.sysj line: 10, column: 10
                S1610=1;
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
              if(!tick.getprestatus()){//sysj\fillerController.sysj line: 11, column: 10
                S1610=2;
                injectorOn.setPresent();//sysj\fillerController.sysj line: 13, column: 5
                currsigs.addElement(injectorOn);
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
              if(tick.getprestatus()){//sysj\fillerController.sysj line: 12, column: 10
                S1610=3;
                canTop.setPresent();//sysj\fillerController.sysj line: 16, column: 5
                currsigs.addElement(canTop);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                injectorOn.setPresent();//sysj\fillerController.sysj line: 13, column: 5
                currsigs.addElement(injectorOn);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 3 : 
              if(tick.getprestatus()){//sysj\fillerController.sysj line: 15, column: 10
                System.out.println("Select Liquid 1");//sysj\fillerController.sysj line: 18, column: 4
                S1610=4;
                thread3260(tdone,ends);
                thread3261(tdone,ends);
                thread3262(tdone,ends);
                thread3263(tdone,ends);
                int biggest3264 = 0;
                if(ends[2]>=biggest3264){
                  biggest3264=ends[2];
                }
                if(ends[3]>=biggest3264){
                  biggest3264=ends[3];
                }
                if(ends[4]>=biggest3264){
                  biggest3264=ends[4];
                }
                if(ends[5]>=biggest3264){
                  biggest3264=ends[5];
                }
                if(biggest3264 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                canTop.setPresent();//sysj\fillerController.sysj line: 16, column: 5
                currsigs.addElement(canTop);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 4 : 
              if(liquidType_1.getprestatus()){//sysj\fillerController.sysj line: 20, column: 10
                S1610=5;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                thread3265(tdone,ends);
                thread3266(tdone,ends);
                thread3267(tdone,ends);
                thread3268(tdone,ends);
                int biggest3269 = 0;
                if(ends[2]>=biggest3269){
                  biggest3269=ends[2];
                }
                if(ends[3]>=biggest3269){
                  biggest3269=ends[3];
                }
                if(ends[4]>=biggest3269){
                  biggest3269=ends[4];
                }
                if(ends[5]>=biggest3269){
                  biggest3269=ends[5];
                }
                if(biggest3269 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest3269 == 0){
                  S1610=5;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
            case 5 : 
              if(!tick.getprestatus()){//sysj\fillerController.sysj line: 30, column: 10
                S1610=6;
                if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 1){//sysj\fillerController.sysj line: 31, column: 7
                  S1701=0;
                  System.out.println("Filling 1 to 25%\n");//sysj\fillerController.sysj line: 33, column: 6
                  S1662=0;
                  fill1.setPresent();//sysj\fillerController.sysj line: 34, column: 6
                  currsigs.addElement(fill1);
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  S1701=1;
                  if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 2){//sysj\fillerController.sysj line: 42, column: 13
                    S1700=0;
                    System.out.println("Filling with 2 to 25%\n");//sysj\fillerController.sysj line: 44, column: 6
                    fill2.setPresent();//sysj\fillerController.sysj line: 45, column: 6
                    currsigs.addElement(fill2);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S1700=1;
                    if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 3){//sysj\fillerController.sysj line: 48, column: 13
                      S1699=0;
                      System.out.println("Filling with 3 to 25%\n");//sysj\fillerController.sysj line: 50, column: 6
                      fill3.setPresent();//sysj\fillerController.sysj line: 51, column: 6
                      currsigs.addElement(fill3);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S1699=1;
                      System.out.println("Filling with 4 to 25%\n");//sysj\fillerController.sysj line: 56, column: 6
                      fill4.setPresent();//sysj\fillerController.sysj line: 57, column: 6
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
            
            case 6 : 
              switch(S1701){
                case 0 : 
                  if(tick.getprestatus()){//sysj\fillerController.sysj line: 32, column: 11
                    S1610=7;
                    injectorOn.setPresent();//sysj\fillerController.sysj line: 62, column: 5
                    currsigs.addElement(injectorOn);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    switch(S1662){
                      case 0 : 
                        fill1.setPresent();//sysj\fillerController.sysj line: 34, column: 6
                        currsigs.addElement(fill1);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      
                      case 1 : 
                        if(canBottom.getprestatus()){//sysj\fillerController.sysj line: 35, column: 12
                          S1610=7;
                          injectorOn.setPresent();//sysj\fillerController.sysj line: 62, column: 5
                          currsigs.addElement(injectorOn);
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        else {
                          thread3270(tdone,ends);
                          thread3271(tdone,ends);
                          int biggest3272 = 0;
                          if(ends[6]>=biggest3272){
                            biggest3272=ends[6];
                          }
                          if(ends[7]>=biggest3272){
                            biggest3272=ends[7];
                          }
                          if(biggest3272 == 1){
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          //FINXME code
                          if(biggest3272 == 0){
                            S1610=7;
                            injectorOn.setPresent();//sysj\fillerController.sysj line: 62, column: 5
                            currsigs.addElement(injectorOn);
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  switch(S1700){
                    case 0 : 
                      if(tick.getprestatus()){//sysj\fillerController.sysj line: 43, column: 11
                        S1610=7;
                        injectorOn.setPresent();//sysj\fillerController.sysj line: 62, column: 5
                        currsigs.addElement(injectorOn);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        fill2.setPresent();//sysj\fillerController.sysj line: 45, column: 6
                        currsigs.addElement(fill2);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                    case 1 : 
                      switch(S1699){
                        case 0 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 49, column: 11
                            S1610=7;
                            injectorOn.setPresent();//sysj\fillerController.sysj line: 62, column: 5
                            currsigs.addElement(injectorOn);
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            fill3.setPresent();//sysj\fillerController.sysj line: 51, column: 6
                            currsigs.addElement(fill3);
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        
                        case 1 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 55, column: 11
                            S1610=7;
                            injectorOn.setPresent();//sysj\fillerController.sysj line: 62, column: 5
                            currsigs.addElement(injectorOn);
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            fill4.setPresent();//sysj\fillerController.sysj line: 57, column: 6
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
            
            case 7 : 
              if(tick.getprestatus()){//sysj\fillerController.sysj line: 61, column: 10
                S1610=8;
                canTop.setPresent();//sysj\fillerController.sysj line: 65, column: 5
                currsigs.addElement(canTop);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                injectorOn.setPresent();//sysj\fillerController.sysj line: 62, column: 5
                currsigs.addElement(injectorOn);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 8 : 
              if(tick.getprestatus()){//sysj\fillerController.sysj line: 64, column: 10
                System.out.println("Select Liquid 2");//sysj\fillerController.sysj line: 67, column: 4
                S1610=9;
                thread3273(tdone,ends);
                thread3274(tdone,ends);
                thread3275(tdone,ends);
                thread3276(tdone,ends);
                int biggest3277 = 0;
                if(ends[8]>=biggest3277){
                  biggest3277=ends[8];
                }
                if(ends[9]>=biggest3277){
                  biggest3277=ends[9];
                }
                if(ends[10]>=biggest3277){
                  biggest3277=ends[10];
                }
                if(ends[11]>=biggest3277){
                  biggest3277=ends[11];
                }
                if(biggest3277 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                canTop.setPresent();//sysj\fillerController.sysj line: 65, column: 5
                currsigs.addElement(canTop);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 9 : 
              if(liquidType_1.getprestatus()){//sysj\fillerController.sysj line: 69, column: 10
                S1610=10;
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
                if(ends[8]>=biggest3282){
                  biggest3282=ends[8];
                }
                if(ends[9]>=biggest3282){
                  biggest3282=ends[9];
                }
                if(ends[10]>=biggest3282){
                  biggest3282=ends[10];
                }
                if(ends[11]>=biggest3282){
                  biggest3282=ends[11];
                }
                if(biggest3282 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest3282 == 0){
                  S1610=10;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
            case 10 : 
              if(!tick.getprestatus()){//sysj\fillerController.sysj line: 79, column: 10
                S1610=11;
                if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 1){//sysj\fillerController.sysj line: 80, column: 7
                  S1847=0;
                  System.out.println("Filling with 1 to 50%\n");//sysj\fillerController.sysj line: 82, column: 6
                  fill1.setPresent();//sysj\fillerController.sysj line: 83, column: 6
                  currsigs.addElement(fill1);
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  S1847=1;
                  if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 2){//sysj\fillerController.sysj line: 86, column: 13
                    S1846=0;
                    System.out.println("Filling with 2 to 50%\n");//sysj\fillerController.sysj line: 88, column: 6
                    fill2.setPresent();//sysj\fillerController.sysj line: 89, column: 6
                    currsigs.addElement(fill2);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S1846=1;
                    if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 3){//sysj\fillerController.sysj line: 92, column: 13
                      S1845=0;
                      System.out.println("Filling with 3 to 50%\n");//sysj\fillerController.sysj line: 94, column: 6
                      fill3.setPresent();//sysj\fillerController.sysj line: 95, column: 6
                      currsigs.addElement(fill3);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S1845=1;
                      System.out.println("Filling with 4 to 50%\n");//sysj\fillerController.sysj line: 100, column: 6
                      fill4.setPresent();//sysj\fillerController.sysj line: 101, column: 6
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
              switch(S1847){
                case 0 : 
                  if(tick.getprestatus()){//sysj\fillerController.sysj line: 81, column: 11
                    S1610=12;
                    injectorOn.setPresent();//sysj\fillerController.sysj line: 105, column: 5
                    currsigs.addElement(injectorOn);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    fill1.setPresent();//sysj\fillerController.sysj line: 83, column: 6
                    currsigs.addElement(fill1);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 1 : 
                  switch(S1846){
                    case 0 : 
                      if(tick.getprestatus()){//sysj\fillerController.sysj line: 87, column: 11
                        S1610=12;
                        injectorOn.setPresent();//sysj\fillerController.sysj line: 105, column: 5
                        currsigs.addElement(injectorOn);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        fill2.setPresent();//sysj\fillerController.sysj line: 89, column: 6
                        currsigs.addElement(fill2);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                    case 1 : 
                      switch(S1845){
                        case 0 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 93, column: 11
                            S1610=12;
                            injectorOn.setPresent();//sysj\fillerController.sysj line: 105, column: 5
                            currsigs.addElement(injectorOn);
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            fill3.setPresent();//sysj\fillerController.sysj line: 95, column: 6
                            currsigs.addElement(fill3);
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        
                        case 1 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 99, column: 11
                            S1610=12;
                            injectorOn.setPresent();//sysj\fillerController.sysj line: 105, column: 5
                            currsigs.addElement(injectorOn);
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            fill4.setPresent();//sysj\fillerController.sysj line: 101, column: 6
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
              if(tick.getprestatus()){//sysj\fillerController.sysj line: 104, column: 10
                S1610=13;
                canTop.setPresent();//sysj\fillerController.sysj line: 108, column: 5
                currsigs.addElement(canTop);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                injectorOn.setPresent();//sysj\fillerController.sysj line: 105, column: 5
                currsigs.addElement(injectorOn);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 13 : 
              if(tick.getprestatus()){//sysj\fillerController.sysj line: 107, column: 10
                System.out.println("Select Liquid 3");//sysj\fillerController.sysj line: 110, column: 4
                S1610=14;
                thread3283(tdone,ends);
                thread3284(tdone,ends);
                thread3285(tdone,ends);
                thread3286(tdone,ends);
                int biggest3287 = 0;
                if(ends[12]>=biggest3287){
                  biggest3287=ends[12];
                }
                if(ends[13]>=biggest3287){
                  biggest3287=ends[13];
                }
                if(ends[14]>=biggest3287){
                  biggest3287=ends[14];
                }
                if(ends[15]>=biggest3287){
                  biggest3287=ends[15];
                }
                if(biggest3287 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                canTop.setPresent();//sysj\fillerController.sysj line: 108, column: 5
                currsigs.addElement(canTop);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 14 : 
              if(liquidType_1.getprestatus()){//sysj\fillerController.sysj line: 112, column: 10
                S1610=15;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                thread3288(tdone,ends);
                thread3289(tdone,ends);
                thread3290(tdone,ends);
                thread3291(tdone,ends);
                int biggest3292 = 0;
                if(ends[12]>=biggest3292){
                  biggest3292=ends[12];
                }
                if(ends[13]>=biggest3292){
                  biggest3292=ends[13];
                }
                if(ends[14]>=biggest3292){
                  biggest3292=ends[14];
                }
                if(ends[15]>=biggest3292){
                  biggest3292=ends[15];
                }
                if(biggest3292 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest3292 == 0){
                  S1610=15;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
            case 15 : 
              if(!tick.getprestatus()){//sysj\fillerController.sysj line: 122, column: 10
                S1610=16;
                if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 1){//sysj\fillerController.sysj line: 123, column: 7
                  S1974=0;
                  System.out.println("Filling with 1 to 75%\n");//sysj\fillerController.sysj line: 125, column: 6
                  fill1.setPresent();//sysj\fillerController.sysj line: 126, column: 6
                  currsigs.addElement(fill1);
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  S1974=1;
                  if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 2){//sysj\fillerController.sysj line: 129, column: 13
                    S1973=0;
                    System.out.println("Filling with 2 to 75%\n");//sysj\fillerController.sysj line: 131, column: 6
                    fill2.setPresent();//sysj\fillerController.sysj line: 132, column: 6
                    currsigs.addElement(fill2);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S1973=1;
                    if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 3){//sysj\fillerController.sysj line: 135, column: 13
                      S1972=0;
                      System.out.println("Filling with 3 to 75%\n");//sysj\fillerController.sysj line: 137, column: 6
                      fill3.setPresent();//sysj\fillerController.sysj line: 138, column: 6
                      currsigs.addElement(fill3);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S1972=1;
                      System.out.println("Filling with 4 to 75%\n");//sysj\fillerController.sysj line: 143, column: 6
                      fill4.setPresent();//sysj\fillerController.sysj line: 144, column: 6
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
            
            case 16 : 
              switch(S1974){
                case 0 : 
                  if(tick.getprestatus()){//sysj\fillerController.sysj line: 124, column: 11
                    S1610=17;
                    injectorOn.setPresent();//sysj\fillerController.sysj line: 149, column: 5
                    currsigs.addElement(injectorOn);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    fill1.setPresent();//sysj\fillerController.sysj line: 126, column: 6
                    currsigs.addElement(fill1);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 1 : 
                  switch(S1973){
                    case 0 : 
                      if(tick.getprestatus()){//sysj\fillerController.sysj line: 130, column: 11
                        S1610=17;
                        injectorOn.setPresent();//sysj\fillerController.sysj line: 149, column: 5
                        currsigs.addElement(injectorOn);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        fill2.setPresent();//sysj\fillerController.sysj line: 132, column: 6
                        currsigs.addElement(fill2);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                    case 1 : 
                      switch(S1972){
                        case 0 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 136, column: 11
                            S1610=17;
                            injectorOn.setPresent();//sysj\fillerController.sysj line: 149, column: 5
                            currsigs.addElement(injectorOn);
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            fill3.setPresent();//sysj\fillerController.sysj line: 138, column: 6
                            currsigs.addElement(fill3);
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        
                        case 1 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 142, column: 11
                            S1610=17;
                            injectorOn.setPresent();//sysj\fillerController.sysj line: 149, column: 5
                            currsigs.addElement(injectorOn);
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            fill4.setPresent();//sysj\fillerController.sysj line: 144, column: 6
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
            
            case 17 : 
              if(tick.getprestatus()){//sysj\fillerController.sysj line: 148, column: 10
                S1610=18;
                canTop.setPresent();//sysj\fillerController.sysj line: 152, column: 5
                currsigs.addElement(canTop);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                injectorOn.setPresent();//sysj\fillerController.sysj line: 149, column: 5
                currsigs.addElement(injectorOn);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 18 : 
              if(tick.getprestatus()){//sysj\fillerController.sysj line: 151, column: 10
                System.out.println("Select Liquid 4");//sysj\fillerController.sysj line: 155, column: 4
                S1610=19;
                thread3293(tdone,ends);
                thread3294(tdone,ends);
                thread3295(tdone,ends);
                thread3296(tdone,ends);
                int biggest3297 = 0;
                if(ends[16]>=biggest3297){
                  biggest3297=ends[16];
                }
                if(ends[17]>=biggest3297){
                  biggest3297=ends[17];
                }
                if(ends[18]>=biggest3297){
                  biggest3297=ends[18];
                }
                if(ends[19]>=biggest3297){
                  biggest3297=ends[19];
                }
                if(biggest3297 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                canTop.setPresent();//sysj\fillerController.sysj line: 152, column: 5
                currsigs.addElement(canTop);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 19 : 
              if(liquidType_1.getprestatus()){//sysj\fillerController.sysj line: 157, column: 10
                S1610=20;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                thread3298(tdone,ends);
                thread3299(tdone,ends);
                thread3300(tdone,ends);
                thread3301(tdone,ends);
                int biggest3302 = 0;
                if(ends[16]>=biggest3302){
                  biggest3302=ends[16];
                }
                if(ends[17]>=biggest3302){
                  biggest3302=ends[17];
                }
                if(ends[18]>=biggest3302){
                  biggest3302=ends[18];
                }
                if(ends[19]>=biggest3302){
                  biggest3302=ends[19];
                }
                if(biggest3302 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest3302 == 0){
                  S1610=20;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
            case 20 : 
              if(!tick.getprestatus()){//sysj\fillerController.sysj line: 167, column: 10
                S1610=21;
                if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 1){//sysj\fillerController.sysj line: 168, column: 7
                  S2101=0;
                  System.out.println("Filling with 1 to 100%\n");//sysj\fillerController.sysj line: 170, column: 6
                  fill1.setPresent();//sysj\fillerController.sysj line: 171, column: 6
                  currsigs.addElement(fill1);
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  S2101=1;
                  if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 2){//sysj\fillerController.sysj line: 174, column: 13
                    S2100=0;
                    System.out.println("Filling with 2 to 100%\n");//sysj\fillerController.sysj line: 176, column: 6
                    fill2.setPresent();//sysj\fillerController.sysj line: 177, column: 6
                    currsigs.addElement(fill2);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S2100=1;
                    if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 3){//sysj\fillerController.sysj line: 180, column: 13
                      S2099=0;
                      System.out.println("Filling with 3 to 100%\n");//sysj\fillerController.sysj line: 182, column: 6
                      fill3.setPresent();//sysj\fillerController.sysj line: 183, column: 6
                      currsigs.addElement(fill3);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S2099=1;
                      System.out.println("Filling with 4 to 100%\n");//sysj\fillerController.sysj line: 188, column: 6
                      fill4.setPresent();//sysj\fillerController.sysj line: 189, column: 6
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
            
            case 21 : 
              switch(S2101){
                case 0 : 
                  if(tick.getprestatus()){//sysj\fillerController.sysj line: 169, column: 11
                    S1610=22;
                    fillerDone.setPresent();//sysj\fillerController.sysj line: 194, column: 5
                    currsigs.addElement(fillerDone);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    fill1.setPresent();//sysj\fillerController.sysj line: 171, column: 6
                    currsigs.addElement(fill1);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 1 : 
                  switch(S2100){
                    case 0 : 
                      if(tick.getprestatus()){//sysj\fillerController.sysj line: 175, column: 11
                        S1610=22;
                        fillerDone.setPresent();//sysj\fillerController.sysj line: 194, column: 5
                        currsigs.addElement(fillerDone);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        fill2.setPresent();//sysj\fillerController.sysj line: 177, column: 6
                        currsigs.addElement(fill2);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                    case 1 : 
                      switch(S2099){
                        case 0 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 181, column: 11
                            S1610=22;
                            fillerDone.setPresent();//sysj\fillerController.sysj line: 194, column: 5
                            currsigs.addElement(fillerDone);
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            fill3.setPresent();//sysj\fillerController.sysj line: 183, column: 6
                            currsigs.addElement(fill3);
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        
                        case 1 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 187, column: 11
                            S1610=22;
                            fillerDone.setPresent();//sysj\fillerController.sysj line: 194, column: 5
                            currsigs.addElement(fillerDone);
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            fill4.setPresent();//sysj\fillerController.sysj line: 189, column: 6
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
            
            case 22 : 
              if(!fillerEnable.getprestatus()){//sysj\fillerController.sysj line: 193, column: 10
                S1610=0;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                fillerDone.setPresent();//sysj\fillerController.sysj line: 194, column: 5
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
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
