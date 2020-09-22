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
  private int S2508 = 1;
  private int S1277 = 1;
  private int S1282 = 1;
  private int S1285 = 1;
  private int S1288 = 1;
  private int S1291 = 1;
  private int S1327 = 1;
  private int S1326 = 1;
  private int S1325 = 1;
  private int S1349 = 1;
  private int S1352 = 1;
  private int S1355 = 1;
  private int S1358 = 1;
  private int S1433 = 1;
  private int S1432 = 1;
  private int S1431 = 1;
  private int S1455 = 1;
  private int S1458 = 1;
  private int S1461 = 1;
  private int S1464 = 1;
  private int S1539 = 1;
  private int S1538 = 1;
  private int S1537 = 1;
  private int S1561 = 1;
  private int S1564 = 1;
  private int S1567 = 1;
  private int S1570 = 1;
  private int S1645 = 1;
  private int S1644 = 1;
  private int S1643 = 1;
  
  private int[] ends = new int[18];
  private int[] tdone = new int[18];
  
  public void thread2593(int [] tdone, int [] ends){
        switch(S1570){
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
          S1570=0;
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

  public void thread2592(int [] tdone, int [] ends){
        switch(S1567){
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
          S1567=0;
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

  public void thread2591(int [] tdone, int [] ends){
        switch(S1564){
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
          S1564=0;
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

  public void thread2590(int [] tdone, int [] ends){
        switch(S1561){
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
          S1561=0;
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

  public void thread2588(int [] tdone, int [] ends){
        S1570=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread2587(int [] tdone, int [] ends){
        S1567=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread2586(int [] tdone, int [] ends){
        S1564=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread2585(int [] tdone, int [] ends){
        S1561=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread2583(int [] tdone, int [] ends){
        S1570=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread2582(int [] tdone, int [] ends){
        S1567=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread2581(int [] tdone, int [] ends){
        S1564=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread2580(int [] tdone, int [] ends){
        S1561=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread2578(int [] tdone, int [] ends){
        S1570=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread2577(int [] tdone, int [] ends){
        S1567=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread2576(int [] tdone, int [] ends){
        S1564=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread2575(int [] tdone, int [] ends){
        S1561=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread2573(int [] tdone, int [] ends){
        S1570=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread2572(int [] tdone, int [] ends){
        S1567=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread2571(int [] tdone, int [] ends){
        S1564=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread2570(int [] tdone, int [] ends){
        S1561=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread2568(int [] tdone, int [] ends){
        switch(S1464){
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
          S1464=0;
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

  public void thread2567(int [] tdone, int [] ends){
        switch(S1461){
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
          S1461=0;
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

  public void thread2566(int [] tdone, int [] ends){
        switch(S1458){
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
          S1458=0;
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

  public void thread2565(int [] tdone, int [] ends){
        switch(S1455){
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
          S1455=0;
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

  public void thread2563(int [] tdone, int [] ends){
        S1464=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread2562(int [] tdone, int [] ends){
        S1461=1;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread2561(int [] tdone, int [] ends){
        S1458=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread2560(int [] tdone, int [] ends){
        S1455=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread2558(int [] tdone, int [] ends){
        S1464=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread2557(int [] tdone, int [] ends){
        S1461=1;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread2556(int [] tdone, int [] ends){
        S1458=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread2555(int [] tdone, int [] ends){
        S1455=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread2553(int [] tdone, int [] ends){
        S1464=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread2552(int [] tdone, int [] ends){
        S1461=1;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread2551(int [] tdone, int [] ends){
        S1458=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread2550(int [] tdone, int [] ends){
        S1455=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread2548(int [] tdone, int [] ends){
        S1464=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread2547(int [] tdone, int [] ends){
        S1461=1;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread2546(int [] tdone, int [] ends){
        S1458=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread2545(int [] tdone, int [] ends){
        S1455=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread2543(int [] tdone, int [] ends){
        switch(S1358){
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
          S1358=0;
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

  public void thread2542(int [] tdone, int [] ends){
        switch(S1355){
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
          S1355=0;
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

  public void thread2541(int [] tdone, int [] ends){
        switch(S1352){
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
          S1352=0;
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

  public void thread2540(int [] tdone, int [] ends){
        switch(S1349){
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
          S1349=0;
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

  public void thread2538(int [] tdone, int [] ends){
        S1358=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread2537(int [] tdone, int [] ends){
        S1355=1;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread2536(int [] tdone, int [] ends){
        S1352=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread2535(int [] tdone, int [] ends){
        S1349=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread2533(int [] tdone, int [] ends){
        S1358=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread2532(int [] tdone, int [] ends){
        S1355=1;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread2531(int [] tdone, int [] ends){
        S1352=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread2530(int [] tdone, int [] ends){
        S1349=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread2528(int [] tdone, int [] ends){
        S1358=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread2527(int [] tdone, int [] ends){
        S1355=1;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread2526(int [] tdone, int [] ends){
        S1352=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread2525(int [] tdone, int [] ends){
        S1349=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread2523(int [] tdone, int [] ends){
        S1358=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread2522(int [] tdone, int [] ends){
        S1355=1;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread2521(int [] tdone, int [] ends){
        S1352=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread2520(int [] tdone, int [] ends){
        S1349=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread2518(int [] tdone, int [] ends){
        switch(S1291){
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
          S1291=0;
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

  public void thread2517(int [] tdone, int [] ends){
        switch(S1288){
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
          S1288=0;
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

  public void thread2516(int [] tdone, int [] ends){
        switch(S1285){
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
          S1285=0;
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

  public void thread2515(int [] tdone, int [] ends){
        switch(S1282){
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
          S1282=0;
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

  public void thread2513(int [] tdone, int [] ends){
        S1291=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread2512(int [] tdone, int [] ends){
        S1288=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread2511(int [] tdone, int [] ends){
        S1285=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread2510(int [] tdone, int [] ends){
        S1282=1;
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
      switch(S2508){
        case 0 : 
          S2508=0;
          break RUN;
        
        case 1 : 
          S2508=2;
          S2508=2;
          liquidType_1.setClear();//sysj\fillerController.sysj line: 7, column: 2
          S1277=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          liquidType_1.setClear();//sysj\fillerController.sysj line: 7, column: 2
          switch(S1277){
            case 0 : 
              if(fillerEnable.getprestatus()){//sysj\fillerController.sysj line: 10, column: 10
                S1277=1;
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
                S1277=2;
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
                S1277=3;
                thread2510(tdone,ends);
                thread2511(tdone,ends);
                thread2512(tdone,ends);
                thread2513(tdone,ends);
                int biggest2514 = 0;
                if(ends[2]>=biggest2514){
                  biggest2514=ends[2];
                }
                if(ends[3]>=biggest2514){
                  biggest2514=ends[3];
                }
                if(ends[4]>=biggest2514){
                  biggest2514=ends[4];
                }
                if(ends[5]>=biggest2514){
                  biggest2514=ends[5];
                }
                if(biggest2514 == 1){
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
                S1277=4;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                thread2515(tdone,ends);
                thread2516(tdone,ends);
                thread2517(tdone,ends);
                thread2518(tdone,ends);
                int biggest2519 = 0;
                if(ends[2]>=biggest2519){
                  biggest2519=ends[2];
                }
                if(ends[3]>=biggest2519){
                  biggest2519=ends[3];
                }
                if(ends[4]>=biggest2519){
                  biggest2519=ends[4];
                }
                if(ends[5]>=biggest2519){
                  biggest2519=ends[5];
                }
                if(biggest2519 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest2519 == 0){
                  S1277=4;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
            case 4 : 
              if(!tick.getprestatus()){//sysj\fillerController.sysj line: 26, column: 10
                System.out.println("Filling Liquid 1");//sysj\fillerController.sysj line: 27, column: 4
                S1277=5;
                if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 1){//sysj\fillerController.sysj line: 28, column: 7
                  S1327=0;
                  fill1.setPresent();//sysj\fillerController.sysj line: 30, column: 6
                  currsigs.addElement(fill1);
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  S1327=1;
                  if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 2){//sysj\fillerController.sysj line: 33, column: 13
                    S1326=0;
                    fill2.setPresent();//sysj\fillerController.sysj line: 35, column: 6
                    currsigs.addElement(fill2);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S1326=1;
                    if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 3){//sysj\fillerController.sysj line: 38, column: 13
                      S1325=0;
                      fill3.setPresent();//sysj\fillerController.sysj line: 40, column: 6
                      currsigs.addElement(fill3);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S1325=1;
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
              switch(S1327){
                case 0 : 
                  if(tick.getprestatus()){//sysj\fillerController.sysj line: 29, column: 11
                    System.out.println("Select Liquid 2");//sysj\fillerController.sysj line: 49, column: 4
                    S1277=6;
                    thread2520(tdone,ends);
                    thread2521(tdone,ends);
                    thread2522(tdone,ends);
                    thread2523(tdone,ends);
                    int biggest2524 = 0;
                    if(ends[6]>=biggest2524){
                      biggest2524=ends[6];
                    }
                    if(ends[7]>=biggest2524){
                      biggest2524=ends[7];
                    }
                    if(ends[8]>=biggest2524){
                      biggest2524=ends[8];
                    }
                    if(ends[9]>=biggest2524){
                      biggest2524=ends[9];
                    }
                    if(biggest2524 == 1){
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
                  switch(S1326){
                    case 0 : 
                      if(tick.getprestatus()){//sysj\fillerController.sysj line: 34, column: 11
                        System.out.println("Select Liquid 2");//sysj\fillerController.sysj line: 49, column: 4
                        S1277=6;
                        thread2525(tdone,ends);
                        thread2526(tdone,ends);
                        thread2527(tdone,ends);
                        thread2528(tdone,ends);
                        int biggest2529 = 0;
                        if(ends[6]>=biggest2529){
                          biggest2529=ends[6];
                        }
                        if(ends[7]>=biggest2529){
                          biggest2529=ends[7];
                        }
                        if(ends[8]>=biggest2529){
                          biggest2529=ends[8];
                        }
                        if(ends[9]>=biggest2529){
                          biggest2529=ends[9];
                        }
                        if(biggest2529 == 1){
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
                      switch(S1325){
                        case 0 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 39, column: 11
                            System.out.println("Select Liquid 2");//sysj\fillerController.sysj line: 49, column: 4
                            S1277=6;
                            thread2530(tdone,ends);
                            thread2531(tdone,ends);
                            thread2532(tdone,ends);
                            thread2533(tdone,ends);
                            int biggest2534 = 0;
                            if(ends[6]>=biggest2534){
                              biggest2534=ends[6];
                            }
                            if(ends[7]>=biggest2534){
                              biggest2534=ends[7];
                            }
                            if(ends[8]>=biggest2534){
                              biggest2534=ends[8];
                            }
                            if(ends[9]>=biggest2534){
                              biggest2534=ends[9];
                            }
                            if(biggest2534 == 1){
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
                            S1277=6;
                            thread2535(tdone,ends);
                            thread2536(tdone,ends);
                            thread2537(tdone,ends);
                            thread2538(tdone,ends);
                            int biggest2539 = 0;
                            if(ends[6]>=biggest2539){
                              biggest2539=ends[6];
                            }
                            if(ends[7]>=biggest2539){
                              biggest2539=ends[7];
                            }
                            if(ends[8]>=biggest2539){
                              biggest2539=ends[8];
                            }
                            if(ends[9]>=biggest2539){
                              biggest2539=ends[9];
                            }
                            if(biggest2539 == 1){
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
                S1277=7;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                thread2540(tdone,ends);
                thread2541(tdone,ends);
                thread2542(tdone,ends);
                thread2543(tdone,ends);
                int biggest2544 = 0;
                if(ends[6]>=biggest2544){
                  biggest2544=ends[6];
                }
                if(ends[7]>=biggest2544){
                  biggest2544=ends[7];
                }
                if(ends[8]>=biggest2544){
                  biggest2544=ends[8];
                }
                if(ends[9]>=biggest2544){
                  biggest2544=ends[9];
                }
                if(biggest2544 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest2544 == 0){
                  S1277=7;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
            case 7 : 
              if(!tick.getprestatus()){//sysj\fillerController.sysj line: 61, column: 10
                System.out.println("Filling Liquid 2");//sysj\fillerController.sysj line: 62, column: 4
                S1277=8;
                if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 1){//sysj\fillerController.sysj line: 63, column: 7
                  S1433=0;
                  fill1.setPresent();//sysj\fillerController.sysj line: 65, column: 6
                  currsigs.addElement(fill1);
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  S1433=1;
                  if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 2){//sysj\fillerController.sysj line: 68, column: 13
                    S1432=0;
                    fill2.setPresent();//sysj\fillerController.sysj line: 70, column: 6
                    currsigs.addElement(fill2);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S1432=1;
                    if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 3){//sysj\fillerController.sysj line: 73, column: 13
                      S1431=0;
                      fill3.setPresent();//sysj\fillerController.sysj line: 75, column: 6
                      currsigs.addElement(fill3);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S1431=1;
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
              switch(S1433){
                case 0 : 
                  if(tick.getprestatus()){//sysj\fillerController.sysj line: 64, column: 11
                    System.out.println("Select Liquid 3");//sysj\fillerController.sysj line: 84, column: 4
                    S1277=9;
                    thread2545(tdone,ends);
                    thread2546(tdone,ends);
                    thread2547(tdone,ends);
                    thread2548(tdone,ends);
                    int biggest2549 = 0;
                    if(ends[10]>=biggest2549){
                      biggest2549=ends[10];
                    }
                    if(ends[11]>=biggest2549){
                      biggest2549=ends[11];
                    }
                    if(ends[12]>=biggest2549){
                      biggest2549=ends[12];
                    }
                    if(ends[13]>=biggest2549){
                      biggest2549=ends[13];
                    }
                    if(biggest2549 == 1){
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
                  switch(S1432){
                    case 0 : 
                      if(tick.getprestatus()){//sysj\fillerController.sysj line: 69, column: 11
                        System.out.println("Select Liquid 3");//sysj\fillerController.sysj line: 84, column: 4
                        S1277=9;
                        thread2550(tdone,ends);
                        thread2551(tdone,ends);
                        thread2552(tdone,ends);
                        thread2553(tdone,ends);
                        int biggest2554 = 0;
                        if(ends[10]>=biggest2554){
                          biggest2554=ends[10];
                        }
                        if(ends[11]>=biggest2554){
                          biggest2554=ends[11];
                        }
                        if(ends[12]>=biggest2554){
                          biggest2554=ends[12];
                        }
                        if(ends[13]>=biggest2554){
                          biggest2554=ends[13];
                        }
                        if(biggest2554 == 1){
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
                      switch(S1431){
                        case 0 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 74, column: 11
                            System.out.println("Select Liquid 3");//sysj\fillerController.sysj line: 84, column: 4
                            S1277=9;
                            thread2555(tdone,ends);
                            thread2556(tdone,ends);
                            thread2557(tdone,ends);
                            thread2558(tdone,ends);
                            int biggest2559 = 0;
                            if(ends[10]>=biggest2559){
                              biggest2559=ends[10];
                            }
                            if(ends[11]>=biggest2559){
                              biggest2559=ends[11];
                            }
                            if(ends[12]>=biggest2559){
                              biggest2559=ends[12];
                            }
                            if(ends[13]>=biggest2559){
                              biggest2559=ends[13];
                            }
                            if(biggest2559 == 1){
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
                            S1277=9;
                            thread2560(tdone,ends);
                            thread2561(tdone,ends);
                            thread2562(tdone,ends);
                            thread2563(tdone,ends);
                            int biggest2564 = 0;
                            if(ends[10]>=biggest2564){
                              biggest2564=ends[10];
                            }
                            if(ends[11]>=biggest2564){
                              biggest2564=ends[11];
                            }
                            if(ends[12]>=biggest2564){
                              biggest2564=ends[12];
                            }
                            if(ends[13]>=biggest2564){
                              biggest2564=ends[13];
                            }
                            if(biggest2564 == 1){
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
                S1277=10;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                thread2565(tdone,ends);
                thread2566(tdone,ends);
                thread2567(tdone,ends);
                thread2568(tdone,ends);
                int biggest2569 = 0;
                if(ends[10]>=biggest2569){
                  biggest2569=ends[10];
                }
                if(ends[11]>=biggest2569){
                  biggest2569=ends[11];
                }
                if(ends[12]>=biggest2569){
                  biggest2569=ends[12];
                }
                if(ends[13]>=biggest2569){
                  biggest2569=ends[13];
                }
                if(biggest2569 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest2569 == 0){
                  S1277=10;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
            case 10 : 
              if(!tick.getprestatus()){//sysj\fillerController.sysj line: 96, column: 10
                System.out.println("Filling Liquid 3");//sysj\fillerController.sysj line: 97, column: 4
                S1277=11;
                if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 1){//sysj\fillerController.sysj line: 98, column: 7
                  S1539=0;
                  fill1.setPresent();//sysj\fillerController.sysj line: 100, column: 6
                  currsigs.addElement(fill1);
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  S1539=1;
                  if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 2){//sysj\fillerController.sysj line: 103, column: 13
                    S1538=0;
                    fill2.setPresent();//sysj\fillerController.sysj line: 105, column: 6
                    currsigs.addElement(fill2);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S1538=1;
                    if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 3){//sysj\fillerController.sysj line: 108, column: 13
                      S1537=0;
                      fill3.setPresent();//sysj\fillerController.sysj line: 110, column: 6
                      currsigs.addElement(fill3);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S1537=1;
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
              switch(S1539){
                case 0 : 
                  if(tick.getprestatus()){//sysj\fillerController.sysj line: 99, column: 11
                    System.out.println("Select Liquid 4");//sysj\fillerController.sysj line: 119, column: 4
                    S1277=12;
                    thread2570(tdone,ends);
                    thread2571(tdone,ends);
                    thread2572(tdone,ends);
                    thread2573(tdone,ends);
                    int biggest2574 = 0;
                    if(ends[14]>=biggest2574){
                      biggest2574=ends[14];
                    }
                    if(ends[15]>=biggest2574){
                      biggest2574=ends[15];
                    }
                    if(ends[16]>=biggest2574){
                      biggest2574=ends[16];
                    }
                    if(ends[17]>=biggest2574){
                      biggest2574=ends[17];
                    }
                    if(biggest2574 == 1){
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
                  switch(S1538){
                    case 0 : 
                      if(tick.getprestatus()){//sysj\fillerController.sysj line: 104, column: 11
                        System.out.println("Select Liquid 4");//sysj\fillerController.sysj line: 119, column: 4
                        S1277=12;
                        thread2575(tdone,ends);
                        thread2576(tdone,ends);
                        thread2577(tdone,ends);
                        thread2578(tdone,ends);
                        int biggest2579 = 0;
                        if(ends[14]>=biggest2579){
                          biggest2579=ends[14];
                        }
                        if(ends[15]>=biggest2579){
                          biggest2579=ends[15];
                        }
                        if(ends[16]>=biggest2579){
                          biggest2579=ends[16];
                        }
                        if(ends[17]>=biggest2579){
                          biggest2579=ends[17];
                        }
                        if(biggest2579 == 1){
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
                      switch(S1537){
                        case 0 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 109, column: 11
                            System.out.println("Select Liquid 4");//sysj\fillerController.sysj line: 119, column: 4
                            S1277=12;
                            thread2580(tdone,ends);
                            thread2581(tdone,ends);
                            thread2582(tdone,ends);
                            thread2583(tdone,ends);
                            int biggest2584 = 0;
                            if(ends[14]>=biggest2584){
                              biggest2584=ends[14];
                            }
                            if(ends[15]>=biggest2584){
                              biggest2584=ends[15];
                            }
                            if(ends[16]>=biggest2584){
                              biggest2584=ends[16];
                            }
                            if(ends[17]>=biggest2584){
                              biggest2584=ends[17];
                            }
                            if(biggest2584 == 1){
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
                            S1277=12;
                            thread2585(tdone,ends);
                            thread2586(tdone,ends);
                            thread2587(tdone,ends);
                            thread2588(tdone,ends);
                            int biggest2589 = 0;
                            if(ends[14]>=biggest2589){
                              biggest2589=ends[14];
                            }
                            if(ends[15]>=biggest2589){
                              biggest2589=ends[15];
                            }
                            if(ends[16]>=biggest2589){
                              biggest2589=ends[16];
                            }
                            if(ends[17]>=biggest2589){
                              biggest2589=ends[17];
                            }
                            if(biggest2589 == 1){
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
                S1277=13;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                thread2590(tdone,ends);
                thread2591(tdone,ends);
                thread2592(tdone,ends);
                thread2593(tdone,ends);
                int biggest2594 = 0;
                if(ends[14]>=biggest2594){
                  biggest2594=ends[14];
                }
                if(ends[15]>=biggest2594){
                  biggest2594=ends[15];
                }
                if(ends[16]>=biggest2594){
                  biggest2594=ends[16];
                }
                if(ends[17]>=biggest2594){
                  biggest2594=ends[17];
                }
                if(biggest2594 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest2594 == 0){
                  S1277=13;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
            case 13 : 
              if(!tick.getprestatus()){//sysj\fillerController.sysj line: 131, column: 10
                System.out.println("Filling Liquid 4");//sysj\fillerController.sysj line: 132, column: 4
                S1277=14;
                if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 1){//sysj\fillerController.sysj line: 133, column: 7
                  S1645=0;
                  fill1.setPresent();//sysj\fillerController.sysj line: 135, column: 6
                  currsigs.addElement(fill1);
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  S1645=1;
                  if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 2){//sysj\fillerController.sysj line: 138, column: 13
                    S1644=0;
                    fill2.setPresent();//sysj\fillerController.sysj line: 140, column: 6
                    currsigs.addElement(fill2);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S1644=1;
                    if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 3){//sysj\fillerController.sysj line: 143, column: 13
                      S1643=0;
                      fill3.setPresent();//sysj\fillerController.sysj line: 145, column: 6
                      currsigs.addElement(fill3);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S1643=1;
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
              switch(S1645){
                case 0 : 
                  if(tick.getprestatus()){//sysj\fillerController.sysj line: 134, column: 11
                    S1277=15;
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
                  switch(S1644){
                    case 0 : 
                      if(tick.getprestatus()){//sysj\fillerController.sysj line: 139, column: 11
                        S1277=15;
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
                      switch(S1643){
                        case 0 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 144, column: 11
                            S1277=15;
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
                            S1277=15;
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
                S1277=0;
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
