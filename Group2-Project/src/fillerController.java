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
  private int S5340 = 1;
  private int S1622 = 1;
  private int S1629 = 1;
  private int S1634 = 1;
  private int S1649 = 1;
  private int S1652 = 1;
  private int S1655 = 1;
  private int S1658 = 1;
  private int S1779 = 1;
  private int S1693 = 1;
  private int S1698 = 1;
  private int S1778 = 1;
  private int S1715 = 1;
  private int S1720 = 1;
  private int S1777 = 1;
  private int S1737 = 1;
  private int S1742 = 1;
  private int S1759 = 1;
  private int S1764 = 1;
  private int S1875 = 1;
  private int S1880 = 1;
  private int S1972 = 1;
  private int S1975 = 1;
  private int S1978 = 1;
  private int S1981 = 1;
  private int S2102 = 1;
  private int S2016 = 1;
  private int S2021 = 1;
  private int S2101 = 1;
  private int S2038 = 1;
  private int S2043 = 1;
  private int S2100 = 1;
  private int S2060 = 1;
  private int S2065 = 1;
  private int S2082 = 1;
  private int S2087 = 1;
  private int S2198 = 1;
  private int S2203 = 1;
  private int S2295 = 1;
  private int S2298 = 1;
  private int S2301 = 1;
  private int S2304 = 1;
  private int S2425 = 1;
  private int S2339 = 1;
  private int S2344 = 1;
  private int S2424 = 1;
  private int S2361 = 1;
  private int S2366 = 1;
  private int S2423 = 1;
  private int S2383 = 1;
  private int S2388 = 1;
  private int S2405 = 1;
  private int S2410 = 1;
  private int S2521 = 1;
  private int S2526 = 1;
  private int S2618 = 1;
  private int S2621 = 1;
  private int S2624 = 1;
  private int S2627 = 1;
  private int S2748 = 1;
  private int S2662 = 1;
  private int S2667 = 1;
  private int S2747 = 1;
  private int S2684 = 1;
  private int S2689 = 1;
  private int S2746 = 1;
  private int S2706 = 1;
  private int S2711 = 1;
  private int S2728 = 1;
  private int S2733 = 1;
  
  private int[] ends = new int[58];
  private int[] tdone = new int[58];
  
  public void thread5583(int [] tdone, int [] ends){
        switch(S2733){
      case 0 : 
        active[57]=0;
        ends[57]=0;
        tdone[57]=1;
        break;
      
      case 1 : 
        inletOn.setPresent();//sysj\fillerController.sysj line: 212, column: 7
        currsigs.addElement(inletOn);
        active[57]=1;
        ends[57]=1;
        tdone[57]=1;
        break;
      
    }
  }

  public void thread5582(int [] tdone, int [] ends){
        switch(S2728){
      case 0 : 
        active[56]=0;
        ends[56]=0;
        tdone[56]=1;
        break;
      
      case 1 : 
        fill4.setPresent();//sysj\fillerController.sysj line: 210, column: 8
        currsigs.addElement(fill4);
        active[56]=1;
        ends[56]=1;
        tdone[56]=1;
        break;
      
    }
  }

  public void thread5580(int [] tdone, int [] ends){
        switch(S2711){
      case 0 : 
        active[55]=0;
        ends[55]=0;
        tdone[55]=1;
        break;
      
      case 1 : 
        inletOn.setPresent();//sysj\fillerController.sysj line: 204, column: 7
        currsigs.addElement(inletOn);
        active[55]=1;
        ends[55]=1;
        tdone[55]=1;
        break;
      
    }
  }

  public void thread5579(int [] tdone, int [] ends){
        switch(S2706){
      case 0 : 
        active[54]=0;
        ends[54]=0;
        tdone[54]=1;
        break;
      
      case 1 : 
        fill3.setPresent();//sysj\fillerController.sysj line: 202, column: 8
        currsigs.addElement(fill3);
        active[54]=1;
        ends[54]=1;
        tdone[54]=1;
        break;
      
    }
  }

  public void thread5577(int [] tdone, int [] ends){
        switch(S2689){
      case 0 : 
        active[53]=0;
        ends[53]=0;
        tdone[53]=1;
        break;
      
      case 1 : 
        inletOn.setPresent();//sysj\fillerController.sysj line: 196, column: 7
        currsigs.addElement(inletOn);
        active[53]=1;
        ends[53]=1;
        tdone[53]=1;
        break;
      
    }
  }

  public void thread5576(int [] tdone, int [] ends){
        switch(S2684){
      case 0 : 
        active[52]=0;
        ends[52]=0;
        tdone[52]=1;
        break;
      
      case 1 : 
        fill2.setPresent();//sysj\fillerController.sysj line: 194, column: 8
        currsigs.addElement(fill2);
        active[52]=1;
        ends[52]=1;
        tdone[52]=1;
        break;
      
    }
  }

  public void thread5574(int [] tdone, int [] ends){
        switch(S2667){
      case 0 : 
        active[51]=0;
        ends[51]=0;
        tdone[51]=1;
        break;
      
      case 1 : 
        inletOn.setPresent();//sysj\fillerController.sysj line: 188, column: 7
        currsigs.addElement(inletOn);
        active[51]=1;
        ends[51]=1;
        tdone[51]=1;
        break;
      
    }
  }

  public void thread5573(int [] tdone, int [] ends){
        switch(S2662){
      case 0 : 
        active[50]=0;
        ends[50]=0;
        tdone[50]=1;
        break;
      
      case 1 : 
        fill1.setPresent();//sysj\fillerController.sysj line: 186, column: 8
        currsigs.addElement(fill1);
        active[50]=1;
        ends[50]=1;
        tdone[50]=1;
        break;
      
    }
  }

  public void thread5571(int [] tdone, int [] ends){
        S2733=1;
    inletOn.setPresent();//sysj\fillerController.sysj line: 212, column: 7
    currsigs.addElement(inletOn);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread5570(int [] tdone, int [] ends){
        S2728=1;
    fill4.setPresent();//sysj\fillerController.sysj line: 210, column: 8
    currsigs.addElement(fill4);
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread5568(int [] tdone, int [] ends){
        S2711=1;
    inletOn.setPresent();//sysj\fillerController.sysj line: 204, column: 7
    currsigs.addElement(inletOn);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread5567(int [] tdone, int [] ends){
        S2706=1;
    fill3.setPresent();//sysj\fillerController.sysj line: 202, column: 8
    currsigs.addElement(fill3);
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread5565(int [] tdone, int [] ends){
        S2689=1;
    inletOn.setPresent();//sysj\fillerController.sysj line: 196, column: 7
    currsigs.addElement(inletOn);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread5564(int [] tdone, int [] ends){
        S2684=1;
    fill2.setPresent();//sysj\fillerController.sysj line: 194, column: 8
    currsigs.addElement(fill2);
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread5562(int [] tdone, int [] ends){
        S2667=1;
    inletOn.setPresent();//sysj\fillerController.sysj line: 188, column: 7
    currsigs.addElement(inletOn);
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread5561(int [] tdone, int [] ends){
        S2662=1;
    fill1.setPresent();//sysj\fillerController.sysj line: 186, column: 8
    currsigs.addElement(fill1);
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread5559(int [] tdone, int [] ends){
        switch(S2627){
      case 0 : 
        active[49]=0;
        ends[49]=0;
        tdone[49]=1;
        break;
      
      case 1 : 
        if(toFill4.getprestatus()){//sysj\fillerController.sysj line: 179, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 179, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(4);//sysj\fillerController.sysj line: 179, column: 23
          S2627=0;
          active[49]=0;
          ends[49]=0;
          tdone[49]=1;
        }
        else {
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
        break;
      
    }
  }

  public void thread5558(int [] tdone, int [] ends){
        switch(S2624){
      case 0 : 
        active[48]=0;
        ends[48]=0;
        tdone[48]=1;
        break;
      
      case 1 : 
        if(toFill3.getprestatus()){//sysj\fillerController.sysj line: 177, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 177, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(3);//sysj\fillerController.sysj line: 177, column: 23
          S2624=0;
          active[48]=0;
          ends[48]=0;
          tdone[48]=1;
        }
        else {
          active[48]=1;
          ends[48]=1;
          tdone[48]=1;
        }
        break;
      
    }
  }

  public void thread5557(int [] tdone, int [] ends){
        switch(S2621){
      case 0 : 
        active[47]=0;
        ends[47]=0;
        tdone[47]=1;
        break;
      
      case 1 : 
        if(toFill2.getprestatus()){//sysj\fillerController.sysj line: 175, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 175, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(2);//sysj\fillerController.sysj line: 175, column: 23
          S2621=0;
          active[47]=0;
          ends[47]=0;
          tdone[47]=1;
        }
        else {
          active[47]=1;
          ends[47]=1;
          tdone[47]=1;
        }
        break;
      
    }
  }

  public void thread5556(int [] tdone, int [] ends){
        switch(S2618){
      case 0 : 
        active[46]=0;
        ends[46]=0;
        tdone[46]=1;
        break;
      
      case 1 : 
        if(toFill1.getprestatus()){//sysj\fillerController.sysj line: 173, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 173, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(1);//sysj\fillerController.sysj line: 173, column: 23
          S2618=0;
          active[46]=0;
          ends[46]=0;
          tdone[46]=1;
        }
        else {
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
        break;
      
    }
  }

  public void thread5554(int [] tdone, int [] ends){
        S2627=1;
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread5553(int [] tdone, int [] ends){
        S2624=1;
    active[48]=1;
    ends[48]=1;
    tdone[48]=1;
  }

  public void thread5552(int [] tdone, int [] ends){
        S2621=1;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread5551(int [] tdone, int [] ends){
        S2618=1;
    active[46]=1;
    ends[46]=1;
    tdone[46]=1;
  }

  public void thread5549(int [] tdone, int [] ends){
        switch(S2526){
      case 0 : 
        active[45]=0;
        ends[45]=0;
        tdone[45]=1;
        break;
      
      case 1 : 
        valveRetract.setPresent();//sysj\fillerController.sysj line: 167, column: 6
        currsigs.addElement(valveRetract);
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
        break;
      
    }
  }

  public void thread5548(int [] tdone, int [] ends){
        switch(S2521){
      case 0 : 
        active[44]=0;
        ends[44]=0;
        tdone[44]=1;
        break;
      
      case 1 : 
        injectorOn.setPresent();//sysj\fillerController.sysj line: 165, column: 7
        currsigs.addElement(injectorOn);
        active[44]=1;
        ends[44]=1;
        tdone[44]=1;
        break;
      
    }
  }

  public void thread5546(int [] tdone, int [] ends){
        S2627=1;
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread5545(int [] tdone, int [] ends){
        S2624=1;
    active[48]=1;
    ends[48]=1;
    tdone[48]=1;
  }

  public void thread5544(int [] tdone, int [] ends){
        S2621=1;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread5543(int [] tdone, int [] ends){
        S2618=1;
    active[46]=1;
    ends[46]=1;
    tdone[46]=1;
  }

  public void thread5541(int [] tdone, int [] ends){
        S2526=1;
    valveRetract.setPresent();//sysj\fillerController.sysj line: 167, column: 6
    currsigs.addElement(valveRetract);
    active[45]=1;
    ends[45]=1;
    tdone[45]=1;
  }

  public void thread5540(int [] tdone, int [] ends){
        S2521=1;
    injectorOn.setPresent();//sysj\fillerController.sysj line: 165, column: 7
    currsigs.addElement(injectorOn);
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread5538(int [] tdone, int [] ends){
        switch(S2410){
      case 0 : 
        active[43]=0;
        ends[43]=0;
        tdone[43]=1;
        break;
      
      case 1 : 
        inletOn.setPresent();//sysj\fillerController.sysj line: 160, column: 7
        currsigs.addElement(inletOn);
        active[43]=1;
        ends[43]=1;
        tdone[43]=1;
        break;
      
    }
  }

  public void thread5537(int [] tdone, int [] ends){
        switch(S2405){
      case 0 : 
        active[42]=0;
        ends[42]=0;
        tdone[42]=1;
        break;
      
      case 1 : 
        fill4.setPresent();//sysj\fillerController.sysj line: 158, column: 8
        currsigs.addElement(fill4);
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
        break;
      
    }
  }

  public void thread5535(int [] tdone, int [] ends){
        S2526=1;
    valveRetract.setPresent();//sysj\fillerController.sysj line: 167, column: 6
    currsigs.addElement(valveRetract);
    active[45]=1;
    ends[45]=1;
    tdone[45]=1;
  }

  public void thread5534(int [] tdone, int [] ends){
        S2521=1;
    injectorOn.setPresent();//sysj\fillerController.sysj line: 165, column: 7
    currsigs.addElement(injectorOn);
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread5532(int [] tdone, int [] ends){
        S2526=1;
    valveRetract.setPresent();//sysj\fillerController.sysj line: 167, column: 6
    currsigs.addElement(valveRetract);
    active[45]=1;
    ends[45]=1;
    tdone[45]=1;
  }

  public void thread5531(int [] tdone, int [] ends){
        S2521=1;
    injectorOn.setPresent();//sysj\fillerController.sysj line: 165, column: 7
    currsigs.addElement(injectorOn);
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread5529(int [] tdone, int [] ends){
        switch(S2388){
      case 0 : 
        active[41]=0;
        ends[41]=0;
        tdone[41]=1;
        break;
      
      case 1 : 
        inletOn.setPresent();//sysj\fillerController.sysj line: 152, column: 7
        currsigs.addElement(inletOn);
        active[41]=1;
        ends[41]=1;
        tdone[41]=1;
        break;
      
    }
  }

  public void thread5528(int [] tdone, int [] ends){
        switch(S2383){
      case 0 : 
        active[40]=0;
        ends[40]=0;
        tdone[40]=1;
        break;
      
      case 1 : 
        fill3.setPresent();//sysj\fillerController.sysj line: 150, column: 8
        currsigs.addElement(fill3);
        active[40]=1;
        ends[40]=1;
        tdone[40]=1;
        break;
      
    }
  }

  public void thread5526(int [] tdone, int [] ends){
        S2526=1;
    valveRetract.setPresent();//sysj\fillerController.sysj line: 167, column: 6
    currsigs.addElement(valveRetract);
    active[45]=1;
    ends[45]=1;
    tdone[45]=1;
  }

  public void thread5525(int [] tdone, int [] ends){
        S2521=1;
    injectorOn.setPresent();//sysj\fillerController.sysj line: 165, column: 7
    currsigs.addElement(injectorOn);
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread5523(int [] tdone, int [] ends){
        S2526=1;
    valveRetract.setPresent();//sysj\fillerController.sysj line: 167, column: 6
    currsigs.addElement(valveRetract);
    active[45]=1;
    ends[45]=1;
    tdone[45]=1;
  }

  public void thread5522(int [] tdone, int [] ends){
        S2521=1;
    injectorOn.setPresent();//sysj\fillerController.sysj line: 165, column: 7
    currsigs.addElement(injectorOn);
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread5520(int [] tdone, int [] ends){
        switch(S2366){
      case 0 : 
        active[39]=0;
        ends[39]=0;
        tdone[39]=1;
        break;
      
      case 1 : 
        inletOn.setPresent();//sysj\fillerController.sysj line: 144, column: 7
        currsigs.addElement(inletOn);
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
        break;
      
    }
  }

  public void thread5519(int [] tdone, int [] ends){
        switch(S2361){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        fill2.setPresent();//sysj\fillerController.sysj line: 142, column: 8
        currsigs.addElement(fill2);
        active[38]=1;
        ends[38]=1;
        tdone[38]=1;
        break;
      
    }
  }

  public void thread5517(int [] tdone, int [] ends){
        S2526=1;
    valveRetract.setPresent();//sysj\fillerController.sysj line: 167, column: 6
    currsigs.addElement(valveRetract);
    active[45]=1;
    ends[45]=1;
    tdone[45]=1;
  }

  public void thread5516(int [] tdone, int [] ends){
        S2521=1;
    injectorOn.setPresent();//sysj\fillerController.sysj line: 165, column: 7
    currsigs.addElement(injectorOn);
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread5514(int [] tdone, int [] ends){
        S2526=1;
    valveRetract.setPresent();//sysj\fillerController.sysj line: 167, column: 6
    currsigs.addElement(valveRetract);
    active[45]=1;
    ends[45]=1;
    tdone[45]=1;
  }

  public void thread5513(int [] tdone, int [] ends){
        S2521=1;
    injectorOn.setPresent();//sysj\fillerController.sysj line: 165, column: 7
    currsigs.addElement(injectorOn);
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread5511(int [] tdone, int [] ends){
        switch(S2344){
      case 0 : 
        active[37]=0;
        ends[37]=0;
        tdone[37]=1;
        break;
      
      case 1 : 
        inletOn.setPresent();//sysj\fillerController.sysj line: 136, column: 7
        currsigs.addElement(inletOn);
        active[37]=1;
        ends[37]=1;
        tdone[37]=1;
        break;
      
    }
  }

  public void thread5510(int [] tdone, int [] ends){
        switch(S2339){
      case 0 : 
        active[36]=0;
        ends[36]=0;
        tdone[36]=1;
        break;
      
      case 1 : 
        fill1.setPresent();//sysj\fillerController.sysj line: 134, column: 8
        currsigs.addElement(fill1);
        active[36]=1;
        ends[36]=1;
        tdone[36]=1;
        break;
      
    }
  }

  public void thread5508(int [] tdone, int [] ends){
        S2526=1;
    valveRetract.setPresent();//sysj\fillerController.sysj line: 167, column: 6
    currsigs.addElement(valveRetract);
    active[45]=1;
    ends[45]=1;
    tdone[45]=1;
  }

  public void thread5507(int [] tdone, int [] ends){
        S2521=1;
    injectorOn.setPresent();//sysj\fillerController.sysj line: 165, column: 7
    currsigs.addElement(injectorOn);
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread5505(int [] tdone, int [] ends){
        S2410=1;
    inletOn.setPresent();//sysj\fillerController.sysj line: 160, column: 7
    currsigs.addElement(inletOn);
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread5504(int [] tdone, int [] ends){
        S2405=1;
    fill4.setPresent();//sysj\fillerController.sysj line: 158, column: 8
    currsigs.addElement(fill4);
    active[42]=1;
    ends[42]=1;
    tdone[42]=1;
  }

  public void thread5502(int [] tdone, int [] ends){
        S2388=1;
    inletOn.setPresent();//sysj\fillerController.sysj line: 152, column: 7
    currsigs.addElement(inletOn);
    active[41]=1;
    ends[41]=1;
    tdone[41]=1;
  }

  public void thread5501(int [] tdone, int [] ends){
        S2383=1;
    fill3.setPresent();//sysj\fillerController.sysj line: 150, column: 8
    currsigs.addElement(fill3);
    active[40]=1;
    ends[40]=1;
    tdone[40]=1;
  }

  public void thread5499(int [] tdone, int [] ends){
        S2366=1;
    inletOn.setPresent();//sysj\fillerController.sysj line: 144, column: 7
    currsigs.addElement(inletOn);
    active[39]=1;
    ends[39]=1;
    tdone[39]=1;
  }

  public void thread5498(int [] tdone, int [] ends){
        S2361=1;
    fill2.setPresent();//sysj\fillerController.sysj line: 142, column: 8
    currsigs.addElement(fill2);
    active[38]=1;
    ends[38]=1;
    tdone[38]=1;
  }

  public void thread5496(int [] tdone, int [] ends){
        S2344=1;
    inletOn.setPresent();//sysj\fillerController.sysj line: 136, column: 7
    currsigs.addElement(inletOn);
    active[37]=1;
    ends[37]=1;
    tdone[37]=1;
  }

  public void thread5495(int [] tdone, int [] ends){
        S2339=1;
    fill1.setPresent();//sysj\fillerController.sysj line: 134, column: 8
    currsigs.addElement(fill1);
    active[36]=1;
    ends[36]=1;
    tdone[36]=1;
  }

  public void thread5493(int [] tdone, int [] ends){
        switch(S2304){
      case 0 : 
        active[35]=0;
        ends[35]=0;
        tdone[35]=1;
        break;
      
      case 1 : 
        if(toFill4.getprestatus()){//sysj\fillerController.sysj line: 127, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 127, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(4);//sysj\fillerController.sysj line: 127, column: 23
          S2304=0;
          active[35]=0;
          ends[35]=0;
          tdone[35]=1;
        }
        else {
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
        }
        break;
      
    }
  }

  public void thread5492(int [] tdone, int [] ends){
        switch(S2301){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        if(toFill3.getprestatus()){//sysj\fillerController.sysj line: 125, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 125, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(3);//sysj\fillerController.sysj line: 125, column: 23
          S2301=0;
          active[34]=0;
          ends[34]=0;
          tdone[34]=1;
        }
        else {
          active[34]=1;
          ends[34]=1;
          tdone[34]=1;
        }
        break;
      
    }
  }

  public void thread5491(int [] tdone, int [] ends){
        switch(S2298){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        if(toFill2.getprestatus()){//sysj\fillerController.sysj line: 123, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 123, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(2);//sysj\fillerController.sysj line: 123, column: 23
          S2298=0;
          active[33]=0;
          ends[33]=0;
          tdone[33]=1;
        }
        else {
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        break;
      
    }
  }

  public void thread5490(int [] tdone, int [] ends){
        switch(S2295){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        if(toFill1.getprestatus()){//sysj\fillerController.sysj line: 121, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 121, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(1);//sysj\fillerController.sysj line: 121, column: 23
          S2295=0;
          active[32]=0;
          ends[32]=0;
          tdone[32]=1;
        }
        else {
          active[32]=1;
          ends[32]=1;
          tdone[32]=1;
        }
        break;
      
    }
  }

  public void thread5488(int [] tdone, int [] ends){
        S2304=1;
    active[35]=1;
    ends[35]=1;
    tdone[35]=1;
  }

  public void thread5487(int [] tdone, int [] ends){
        S2301=1;
    active[34]=1;
    ends[34]=1;
    tdone[34]=1;
  }

  public void thread5486(int [] tdone, int [] ends){
        S2298=1;
    active[33]=1;
    ends[33]=1;
    tdone[33]=1;
  }

  public void thread5485(int [] tdone, int [] ends){
        S2295=1;
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread5483(int [] tdone, int [] ends){
        switch(S2203){
      case 0 : 
        active[31]=0;
        ends[31]=0;
        tdone[31]=1;
        break;
      
      case 1 : 
        valveRetract.setPresent();//sysj\fillerController.sysj line: 116, column: 6
        currsigs.addElement(valveRetract);
        active[31]=1;
        ends[31]=1;
        tdone[31]=1;
        break;
      
    }
  }

  public void thread5482(int [] tdone, int [] ends){
        switch(S2198){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        injectorOn.setPresent();//sysj\fillerController.sysj line: 114, column: 7
        currsigs.addElement(injectorOn);
        active[30]=1;
        ends[30]=1;
        tdone[30]=1;
        break;
      
    }
  }

  public void thread5480(int [] tdone, int [] ends){
        S2304=1;
    active[35]=1;
    ends[35]=1;
    tdone[35]=1;
  }

  public void thread5479(int [] tdone, int [] ends){
        S2301=1;
    active[34]=1;
    ends[34]=1;
    tdone[34]=1;
  }

  public void thread5478(int [] tdone, int [] ends){
        S2298=1;
    active[33]=1;
    ends[33]=1;
    tdone[33]=1;
  }

  public void thread5477(int [] tdone, int [] ends){
        S2295=1;
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread5475(int [] tdone, int [] ends){
        S2203=1;
    valveRetract.setPresent();//sysj\fillerController.sysj line: 116, column: 6
    currsigs.addElement(valveRetract);
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread5474(int [] tdone, int [] ends){
        S2198=1;
    injectorOn.setPresent();//sysj\fillerController.sysj line: 114, column: 7
    currsigs.addElement(injectorOn);
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread5472(int [] tdone, int [] ends){
        switch(S2087){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        inletOn.setPresent();//sysj\fillerController.sysj line: 110, column: 7
        currsigs.addElement(inletOn);
        active[29]=1;
        ends[29]=1;
        tdone[29]=1;
        break;
      
    }
  }

  public void thread5471(int [] tdone, int [] ends){
        switch(S2082){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        fill4.setPresent();//sysj\fillerController.sysj line: 108, column: 8
        currsigs.addElement(fill4);
        active[28]=1;
        ends[28]=1;
        tdone[28]=1;
        break;
      
    }
  }

  public void thread5469(int [] tdone, int [] ends){
        S2203=1;
    valveRetract.setPresent();//sysj\fillerController.sysj line: 116, column: 6
    currsigs.addElement(valveRetract);
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread5468(int [] tdone, int [] ends){
        S2198=1;
    injectorOn.setPresent();//sysj\fillerController.sysj line: 114, column: 7
    currsigs.addElement(injectorOn);
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread5466(int [] tdone, int [] ends){
        S2203=1;
    valveRetract.setPresent();//sysj\fillerController.sysj line: 116, column: 6
    currsigs.addElement(valveRetract);
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread5465(int [] tdone, int [] ends){
        S2198=1;
    injectorOn.setPresent();//sysj\fillerController.sysj line: 114, column: 7
    currsigs.addElement(injectorOn);
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread5463(int [] tdone, int [] ends){
        switch(S2065){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        inletOn.setPresent();//sysj\fillerController.sysj line: 102, column: 7
        currsigs.addElement(inletOn);
        active[27]=1;
        ends[27]=1;
        tdone[27]=1;
        break;
      
    }
  }

  public void thread5462(int [] tdone, int [] ends){
        switch(S2060){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        fill3.setPresent();//sysj\fillerController.sysj line: 100, column: 8
        currsigs.addElement(fill3);
        active[26]=1;
        ends[26]=1;
        tdone[26]=1;
        break;
      
    }
  }

  public void thread5460(int [] tdone, int [] ends){
        S2203=1;
    valveRetract.setPresent();//sysj\fillerController.sysj line: 116, column: 6
    currsigs.addElement(valveRetract);
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread5459(int [] tdone, int [] ends){
        S2198=1;
    injectorOn.setPresent();//sysj\fillerController.sysj line: 114, column: 7
    currsigs.addElement(injectorOn);
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread5457(int [] tdone, int [] ends){
        S2203=1;
    valveRetract.setPresent();//sysj\fillerController.sysj line: 116, column: 6
    currsigs.addElement(valveRetract);
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread5456(int [] tdone, int [] ends){
        S2198=1;
    injectorOn.setPresent();//sysj\fillerController.sysj line: 114, column: 7
    currsigs.addElement(injectorOn);
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread5454(int [] tdone, int [] ends){
        switch(S2043){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        inletOn.setPresent();//sysj\fillerController.sysj line: 94, column: 7
        currsigs.addElement(inletOn);
        active[25]=1;
        ends[25]=1;
        tdone[25]=1;
        break;
      
    }
  }

  public void thread5453(int [] tdone, int [] ends){
        switch(S2038){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        fill2.setPresent();//sysj\fillerController.sysj line: 92, column: 8
        currsigs.addElement(fill2);
        active[24]=1;
        ends[24]=1;
        tdone[24]=1;
        break;
      
    }
  }

  public void thread5451(int [] tdone, int [] ends){
        S2203=1;
    valveRetract.setPresent();//sysj\fillerController.sysj line: 116, column: 6
    currsigs.addElement(valveRetract);
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread5450(int [] tdone, int [] ends){
        S2198=1;
    injectorOn.setPresent();//sysj\fillerController.sysj line: 114, column: 7
    currsigs.addElement(injectorOn);
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread5448(int [] tdone, int [] ends){
        S2203=1;
    valveRetract.setPresent();//sysj\fillerController.sysj line: 116, column: 6
    currsigs.addElement(valveRetract);
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread5447(int [] tdone, int [] ends){
        S2198=1;
    injectorOn.setPresent();//sysj\fillerController.sysj line: 114, column: 7
    currsigs.addElement(injectorOn);
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread5445(int [] tdone, int [] ends){
        switch(S2021){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        inletOn.setPresent();//sysj\fillerController.sysj line: 86, column: 7
        currsigs.addElement(inletOn);
        active[23]=1;
        ends[23]=1;
        tdone[23]=1;
        break;
      
    }
  }

  public void thread5444(int [] tdone, int [] ends){
        switch(S2016){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        fill1.setPresent();//sysj\fillerController.sysj line: 84, column: 8
        currsigs.addElement(fill1);
        active[22]=1;
        ends[22]=1;
        tdone[22]=1;
        break;
      
    }
  }

  public void thread5442(int [] tdone, int [] ends){
        S2203=1;
    valveRetract.setPresent();//sysj\fillerController.sysj line: 116, column: 6
    currsigs.addElement(valveRetract);
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread5441(int [] tdone, int [] ends){
        S2198=1;
    injectorOn.setPresent();//sysj\fillerController.sysj line: 114, column: 7
    currsigs.addElement(injectorOn);
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread5439(int [] tdone, int [] ends){
        S2087=1;
    inletOn.setPresent();//sysj\fillerController.sysj line: 110, column: 7
    currsigs.addElement(inletOn);
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread5438(int [] tdone, int [] ends){
        S2082=1;
    fill4.setPresent();//sysj\fillerController.sysj line: 108, column: 8
    currsigs.addElement(fill4);
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread5436(int [] tdone, int [] ends){
        S2065=1;
    inletOn.setPresent();//sysj\fillerController.sysj line: 102, column: 7
    currsigs.addElement(inletOn);
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread5435(int [] tdone, int [] ends){
        S2060=1;
    fill3.setPresent();//sysj\fillerController.sysj line: 100, column: 8
    currsigs.addElement(fill3);
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread5433(int [] tdone, int [] ends){
        S2043=1;
    inletOn.setPresent();//sysj\fillerController.sysj line: 94, column: 7
    currsigs.addElement(inletOn);
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread5432(int [] tdone, int [] ends){
        S2038=1;
    fill2.setPresent();//sysj\fillerController.sysj line: 92, column: 8
    currsigs.addElement(fill2);
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread5430(int [] tdone, int [] ends){
        S2021=1;
    inletOn.setPresent();//sysj\fillerController.sysj line: 86, column: 7
    currsigs.addElement(inletOn);
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread5429(int [] tdone, int [] ends){
        S2016=1;
    fill1.setPresent();//sysj\fillerController.sysj line: 84, column: 8
    currsigs.addElement(fill1);
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread5427(int [] tdone, int [] ends){
        switch(S1981){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        if(toFill4.getprestatus()){//sysj\fillerController.sysj line: 77, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 77, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(4);//sysj\fillerController.sysj line: 77, column: 23
          S1981=0;
          active[21]=0;
          ends[21]=0;
          tdone[21]=1;
        }
        else {
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        break;
      
    }
  }

  public void thread5426(int [] tdone, int [] ends){
        switch(S1978){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        if(toFill3.getprestatus()){//sysj\fillerController.sysj line: 75, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 75, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(3);//sysj\fillerController.sysj line: 75, column: 23
          S1978=0;
          active[20]=0;
          ends[20]=0;
          tdone[20]=1;
        }
        else {
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
        break;
      
    }
  }

  public void thread5425(int [] tdone, int [] ends){
        switch(S1975){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        if(toFill2.getprestatus()){//sysj\fillerController.sysj line: 73, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 73, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(2);//sysj\fillerController.sysj line: 73, column: 23
          S1975=0;
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

  public void thread5424(int [] tdone, int [] ends){
        switch(S1972){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        if(toFill1.getprestatus()){//sysj\fillerController.sysj line: 71, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 71, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(1);//sysj\fillerController.sysj line: 71, column: 23
          S1972=0;
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

  public void thread5422(int [] tdone, int [] ends){
        S1981=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread5421(int [] tdone, int [] ends){
        S1978=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread5420(int [] tdone, int [] ends){
        S1975=1;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread5419(int [] tdone, int [] ends){
        S1972=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread5417(int [] tdone, int [] ends){
        switch(S1880){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        valveRetract.setPresent();//sysj\fillerController.sysj line: 66, column: 6
        currsigs.addElement(valveRetract);
        active[17]=1;
        ends[17]=1;
        tdone[17]=1;
        break;
      
    }
  }

  public void thread5416(int [] tdone, int [] ends){
        switch(S1875){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        injectorOn.setPresent();//sysj\fillerController.sysj line: 64, column: 7
        currsigs.addElement(injectorOn);
        active[16]=1;
        ends[16]=1;
        tdone[16]=1;
        break;
      
    }
  }

  public void thread5414(int [] tdone, int [] ends){
        S1981=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread5413(int [] tdone, int [] ends){
        S1978=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread5412(int [] tdone, int [] ends){
        S1975=1;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread5411(int [] tdone, int [] ends){
        S1972=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread5409(int [] tdone, int [] ends){
        S1880=1;
    valveRetract.setPresent();//sysj\fillerController.sysj line: 66, column: 6
    currsigs.addElement(valveRetract);
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread5408(int [] tdone, int [] ends){
        S1875=1;
    injectorOn.setPresent();//sysj\fillerController.sysj line: 64, column: 7
    currsigs.addElement(injectorOn);
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread5406(int [] tdone, int [] ends){
        switch(S1764){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        inletOn.setPresent();//sysj\fillerController.sysj line: 59, column: 7
        currsigs.addElement(inletOn);
        active[15]=1;
        ends[15]=1;
        tdone[15]=1;
        break;
      
    }
  }

  public void thread5405(int [] tdone, int [] ends){
        switch(S1759){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        fill4.setPresent();//sysj\fillerController.sysj line: 57, column: 8
        currsigs.addElement(fill4);
        active[14]=1;
        ends[14]=1;
        tdone[14]=1;
        break;
      
    }
  }

  public void thread5403(int [] tdone, int [] ends){
        S1880=1;
    valveRetract.setPresent();//sysj\fillerController.sysj line: 66, column: 6
    currsigs.addElement(valveRetract);
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread5402(int [] tdone, int [] ends){
        S1875=1;
    injectorOn.setPresent();//sysj\fillerController.sysj line: 64, column: 7
    currsigs.addElement(injectorOn);
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread5400(int [] tdone, int [] ends){
        S1880=1;
    valveRetract.setPresent();//sysj\fillerController.sysj line: 66, column: 6
    currsigs.addElement(valveRetract);
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread5399(int [] tdone, int [] ends){
        S1875=1;
    injectorOn.setPresent();//sysj\fillerController.sysj line: 64, column: 7
    currsigs.addElement(injectorOn);
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread5397(int [] tdone, int [] ends){
        switch(S1742){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        inletOn.setPresent();//sysj\fillerController.sysj line: 51, column: 7
        currsigs.addElement(inletOn);
        active[13]=1;
        ends[13]=1;
        tdone[13]=1;
        break;
      
    }
  }

  public void thread5396(int [] tdone, int [] ends){
        switch(S1737){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        fill3.setPresent();//sysj\fillerController.sysj line: 49, column: 8
        currsigs.addElement(fill3);
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
        break;
      
    }
  }

  public void thread5394(int [] tdone, int [] ends){
        S1880=1;
    valveRetract.setPresent();//sysj\fillerController.sysj line: 66, column: 6
    currsigs.addElement(valveRetract);
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread5393(int [] tdone, int [] ends){
        S1875=1;
    injectorOn.setPresent();//sysj\fillerController.sysj line: 64, column: 7
    currsigs.addElement(injectorOn);
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread5391(int [] tdone, int [] ends){
        S1880=1;
    valveRetract.setPresent();//sysj\fillerController.sysj line: 66, column: 6
    currsigs.addElement(valveRetract);
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread5390(int [] tdone, int [] ends){
        S1875=1;
    injectorOn.setPresent();//sysj\fillerController.sysj line: 64, column: 7
    currsigs.addElement(injectorOn);
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread5388(int [] tdone, int [] ends){
        switch(S1720){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        inletOn.setPresent();//sysj\fillerController.sysj line: 43, column: 7
        currsigs.addElement(inletOn);
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
        break;
      
    }
  }

  public void thread5387(int [] tdone, int [] ends){
        switch(S1715){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        fill2.setPresent();//sysj\fillerController.sysj line: 41, column: 8
        currsigs.addElement(fill2);
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
        break;
      
    }
  }

  public void thread5385(int [] tdone, int [] ends){
        S1880=1;
    valveRetract.setPresent();//sysj\fillerController.sysj line: 66, column: 6
    currsigs.addElement(valveRetract);
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread5384(int [] tdone, int [] ends){
        S1875=1;
    injectorOn.setPresent();//sysj\fillerController.sysj line: 64, column: 7
    currsigs.addElement(injectorOn);
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread5382(int [] tdone, int [] ends){
        S1880=1;
    valveRetract.setPresent();//sysj\fillerController.sysj line: 66, column: 6
    currsigs.addElement(valveRetract);
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread5381(int [] tdone, int [] ends){
        S1875=1;
    injectorOn.setPresent();//sysj\fillerController.sysj line: 64, column: 7
    currsigs.addElement(injectorOn);
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread5379(int [] tdone, int [] ends){
        switch(S1698){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        inletOn.setPresent();//sysj\fillerController.sysj line: 35, column: 7
        currsigs.addElement(inletOn);
        active[9]=1;
        ends[9]=1;
        tdone[9]=1;
        break;
      
    }
  }

  public void thread5378(int [] tdone, int [] ends){
        switch(S1693){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        fill1.setPresent();//sysj\fillerController.sysj line: 33, column: 8
        currsigs.addElement(fill1);
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
        break;
      
    }
  }

  public void thread5376(int [] tdone, int [] ends){
        S1880=1;
    valveRetract.setPresent();//sysj\fillerController.sysj line: 66, column: 6
    currsigs.addElement(valveRetract);
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread5375(int [] tdone, int [] ends){
        S1875=1;
    injectorOn.setPresent();//sysj\fillerController.sysj line: 64, column: 7
    currsigs.addElement(injectorOn);
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread5373(int [] tdone, int [] ends){
        S1764=1;
    inletOn.setPresent();//sysj\fillerController.sysj line: 59, column: 7
    currsigs.addElement(inletOn);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread5372(int [] tdone, int [] ends){
        S1759=1;
    fill4.setPresent();//sysj\fillerController.sysj line: 57, column: 8
    currsigs.addElement(fill4);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread5370(int [] tdone, int [] ends){
        S1742=1;
    inletOn.setPresent();//sysj\fillerController.sysj line: 51, column: 7
    currsigs.addElement(inletOn);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread5369(int [] tdone, int [] ends){
        S1737=1;
    fill3.setPresent();//sysj\fillerController.sysj line: 49, column: 8
    currsigs.addElement(fill3);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread5367(int [] tdone, int [] ends){
        S1720=1;
    inletOn.setPresent();//sysj\fillerController.sysj line: 43, column: 7
    currsigs.addElement(inletOn);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread5366(int [] tdone, int [] ends){
        S1715=1;
    fill2.setPresent();//sysj\fillerController.sysj line: 41, column: 8
    currsigs.addElement(fill2);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread5364(int [] tdone, int [] ends){
        S1698=1;
    inletOn.setPresent();//sysj\fillerController.sysj line: 35, column: 7
    currsigs.addElement(inletOn);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread5363(int [] tdone, int [] ends){
        S1693=1;
    fill1.setPresent();//sysj\fillerController.sysj line: 33, column: 8
    currsigs.addElement(fill1);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread5361(int [] tdone, int [] ends){
        switch(S1658){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(toFill4.getprestatus()){//sysj\fillerController.sysj line: 26, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 26, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(4);//sysj\fillerController.sysj line: 26, column: 23
          S1658=0;
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

  public void thread5360(int [] tdone, int [] ends){
        switch(S1655){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(toFill3.getprestatus()){//sysj\fillerController.sysj line: 24, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 24, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(3);//sysj\fillerController.sysj line: 24, column: 23
          S1655=0;
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

  public void thread5359(int [] tdone, int [] ends){
        switch(S1652){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(toFill2.getprestatus()){//sysj\fillerController.sysj line: 22, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 22, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(2);//sysj\fillerController.sysj line: 22, column: 23
          S1652=0;
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

  public void thread5358(int [] tdone, int [] ends){
        switch(S1649){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(toFill1.getprestatus()){//sysj\fillerController.sysj line: 20, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 20, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(1);//sysj\fillerController.sysj line: 20, column: 23
          S1649=0;
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

  public void thread5356(int [] tdone, int [] ends){
        S1658=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread5355(int [] tdone, int [] ends){
        S1655=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread5354(int [] tdone, int [] ends){
        S1652=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread5353(int [] tdone, int [] ends){
        S1649=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread5351(int [] tdone, int [] ends){
        switch(S1634){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        valveRetract.setPresent();//sysj\fillerController.sysj line: 15, column: 6
        currsigs.addElement(valveRetract);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread5350(int [] tdone, int [] ends){
        switch(S1629){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        injectorOn.setPresent();//sysj\fillerController.sysj line: 13, column: 7
        currsigs.addElement(injectorOn);
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
        break;
      
    }
  }

  public void thread5348(int [] tdone, int [] ends){
        S1658=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread5347(int [] tdone, int [] ends){
        S1655=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread5346(int [] tdone, int [] ends){
        S1652=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread5345(int [] tdone, int [] ends){
        S1649=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread5343(int [] tdone, int [] ends){
        S1634=1;
    valveRetract.setPresent();//sysj\fillerController.sysj line: 15, column: 6
    currsigs.addElement(valveRetract);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread5342(int [] tdone, int [] ends){
        S1629=1;
    injectorOn.setPresent();//sysj\fillerController.sysj line: 13, column: 7
    currsigs.addElement(injectorOn);
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
      switch(S5340){
        case 0 : 
          S5340=0;
          break RUN;
        
        case 1 : 
          S5340=2;
          S5340=2;
          liquidType_1.setClear();//sysj\fillerController.sysj line: 7, column: 2
          S1622=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          liquidType_1.setClear();//sysj\fillerController.sysj line: 7, column: 2
          switch(S1622){
            case 0 : 
              if(fillerEnable.getprestatus()){//sysj\fillerController.sysj line: 9, column: 10
                S1622=1;
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
              if(tick.getprestatus()){//sysj\fillerController.sysj line: 10, column: 10
                S1622=2;
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
              if(!tick.getprestatus()){//sysj\fillerController.sysj line: 11, column: 10
                S1622=3;
                thread5342(tdone,ends);
                thread5343(tdone,ends);
                int biggest5344 = 0;
                if(ends[2]>=biggest5344){
                  biggest5344=ends[2];
                }
                if(ends[3]>=biggest5344){
                  biggest5344=ends[3];
                }
                if(biggest5344 == 1){
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
              if(tick.getprestatus()){//sysj\fillerController.sysj line: 12, column: 10
                System.out.println("Select Liquid 1");//sysj\fillerController.sysj line: 17, column: 4
                S1622=4;
                thread5345(tdone,ends);
                thread5346(tdone,ends);
                thread5347(tdone,ends);
                thread5348(tdone,ends);
                int biggest5349 = 0;
                if(ends[4]>=biggest5349){
                  biggest5349=ends[4];
                }
                if(ends[5]>=biggest5349){
                  biggest5349=ends[5];
                }
                if(ends[6]>=biggest5349){
                  biggest5349=ends[6];
                }
                if(ends[7]>=biggest5349){
                  biggest5349=ends[7];
                }
                if(biggest5349 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                thread5350(tdone,ends);
                thread5351(tdone,ends);
                int biggest5352 = 0;
                if(ends[2]>=biggest5352){
                  biggest5352=ends[2];
                }
                if(ends[3]>=biggest5352){
                  biggest5352=ends[3];
                }
                if(biggest5352 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest5352 == 0){
                  System.out.println("Select Liquid 1");//sysj\fillerController.sysj line: 17, column: 4
                  S1622=4;
                  thread5353(tdone,ends);
                  thread5354(tdone,ends);
                  thread5355(tdone,ends);
                  thread5356(tdone,ends);
                  int biggest5357 = 0;
                  if(ends[4]>=biggest5357){
                    biggest5357=ends[4];
                  }
                  if(ends[5]>=biggest5357){
                    biggest5357=ends[5];
                  }
                  if(ends[6]>=biggest5357){
                    biggest5357=ends[6];
                  }
                  if(ends[7]>=biggest5357){
                    biggest5357=ends[7];
                  }
                  if(biggest5357 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
              }
            
            case 4 : 
              if(liquidType_1.getprestatus()){//sysj\fillerController.sysj line: 19, column: 10
                S1622=5;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                thread5358(tdone,ends);
                thread5359(tdone,ends);
                thread5360(tdone,ends);
                thread5361(tdone,ends);
                int biggest5362 = 0;
                if(ends[4]>=biggest5362){
                  biggest5362=ends[4];
                }
                if(ends[5]>=biggest5362){
                  biggest5362=ends[5];
                }
                if(ends[6]>=biggest5362){
                  biggest5362=ends[6];
                }
                if(ends[7]>=biggest5362){
                  biggest5362=ends[7];
                }
                if(biggest5362 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest5362 == 0){
                  S1622=5;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
            case 5 : 
              if(!tick.getprestatus()){//sysj\fillerController.sysj line: 29, column: 10
                S1622=6;
                if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 1){//sysj\fillerController.sysj line: 30, column: 7
                  S1779=0;
                  System.out.println("Filling 1 to 25%\n");//sysj\fillerController.sysj line: 32, column: 6
                  thread5363(tdone,ends);
                  thread5364(tdone,ends);
                  int biggest5365 = 0;
                  if(ends[8]>=biggest5365){
                    biggest5365=ends[8];
                  }
                  if(ends[9]>=biggest5365){
                    biggest5365=ends[9];
                  }
                  if(biggest5365 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
                else {
                  S1779=1;
                  if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 2){//sysj\fillerController.sysj line: 38, column: 13
                    S1778=0;
                    System.out.println("Filling with 2 to 25%\n");//sysj\fillerController.sysj line: 40, column: 6
                    thread5366(tdone,ends);
                    thread5367(tdone,ends);
                    int biggest5368 = 0;
                    if(ends[10]>=biggest5368){
                      biggest5368=ends[10];
                    }
                    if(ends[11]>=biggest5368){
                      biggest5368=ends[11];
                    }
                    if(biggest5368 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    S1778=1;
                    if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 3){//sysj\fillerController.sysj line: 46, column: 13
                      S1777=0;
                      System.out.println("Filling with 3 to 25%\n");//sysj\fillerController.sysj line: 48, column: 6
                      thread5369(tdone,ends);
                      thread5370(tdone,ends);
                      int biggest5371 = 0;
                      if(ends[12]>=biggest5371){
                        biggest5371=ends[12];
                      }
                      if(ends[13]>=biggest5371){
                        biggest5371=ends[13];
                      }
                      if(biggest5371 == 1){
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      S1777=1;
                      System.out.println("Filling with 4 to 25%\n");//sysj\fillerController.sysj line: 56, column: 6
                      thread5372(tdone,ends);
                      thread5373(tdone,ends);
                      int biggest5374 = 0;
                      if(ends[14]>=biggest5374){
                        biggest5374=ends[14];
                      }
                      if(ends[15]>=biggest5374){
                        biggest5374=ends[15];
                      }
                      if(biggest5374 == 1){
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
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
              switch(S1779){
                case 0 : 
                  if(tick.getprestatus()){//sysj\fillerController.sysj line: 31, column: 11
                    S1622=7;
                    thread5375(tdone,ends);
                    thread5376(tdone,ends);
                    int biggest5377 = 0;
                    if(ends[16]>=biggest5377){
                      biggest5377=ends[16];
                    }
                    if(ends[17]>=biggest5377){
                      biggest5377=ends[17];
                    }
                    if(biggest5377 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    thread5378(tdone,ends);
                    thread5379(tdone,ends);
                    int biggest5380 = 0;
                    if(ends[8]>=biggest5380){
                      biggest5380=ends[8];
                    }
                    if(ends[9]>=biggest5380){
                      biggest5380=ends[9];
                    }
                    if(biggest5380 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    //FINXME code
                    if(biggest5380 == 0){
                      S1622=7;
                      thread5381(tdone,ends);
                      thread5382(tdone,ends);
                      int biggest5383 = 0;
                      if(ends[16]>=biggest5383){
                        biggest5383=ends[16];
                      }
                      if(ends[17]>=biggest5383){
                        biggest5383=ends[17];
                      }
                      if(biggest5383 == 1){
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                  }
                
                case 1 : 
                  switch(S1778){
                    case 0 : 
                      if(tick.getprestatus()){//sysj\fillerController.sysj line: 39, column: 11
                        S1622=7;
                        thread5384(tdone,ends);
                        thread5385(tdone,ends);
                        int biggest5386 = 0;
                        if(ends[16]>=biggest5386){
                          biggest5386=ends[16];
                        }
                        if(ends[17]>=biggest5386){
                          biggest5386=ends[17];
                        }
                        if(biggest5386 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        thread5387(tdone,ends);
                        thread5388(tdone,ends);
                        int biggest5389 = 0;
                        if(ends[10]>=biggest5389){
                          biggest5389=ends[10];
                        }
                        if(ends[11]>=biggest5389){
                          biggest5389=ends[11];
                        }
                        if(biggest5389 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        //FINXME code
                        if(biggest5389 == 0){
                          S1622=7;
                          thread5390(tdone,ends);
                          thread5391(tdone,ends);
                          int biggest5392 = 0;
                          if(ends[16]>=biggest5392){
                            biggest5392=ends[16];
                          }
                          if(ends[17]>=biggest5392){
                            biggest5392=ends[17];
                          }
                          if(biggest5392 == 1){
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                      }
                    
                    case 1 : 
                      switch(S1777){
                        case 0 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 47, column: 11
                            S1622=7;
                            thread5393(tdone,ends);
                            thread5394(tdone,ends);
                            int biggest5395 = 0;
                            if(ends[16]>=biggest5395){
                              biggest5395=ends[16];
                            }
                            if(ends[17]>=biggest5395){
                              biggest5395=ends[17];
                            }
                            if(biggest5395 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            thread5396(tdone,ends);
                            thread5397(tdone,ends);
                            int biggest5398 = 0;
                            if(ends[12]>=biggest5398){
                              biggest5398=ends[12];
                            }
                            if(ends[13]>=biggest5398){
                              biggest5398=ends[13];
                            }
                            if(biggest5398 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest5398 == 0){
                              S1622=7;
                              thread5399(tdone,ends);
                              thread5400(tdone,ends);
                              int biggest5401 = 0;
                              if(ends[16]>=biggest5401){
                                biggest5401=ends[16];
                              }
                              if(ends[17]>=biggest5401){
                                biggest5401=ends[17];
                              }
                              if(biggest5401 == 1){
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                          }
                        
                        case 1 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 55, column: 11
                            S1622=7;
                            thread5402(tdone,ends);
                            thread5403(tdone,ends);
                            int biggest5404 = 0;
                            if(ends[16]>=biggest5404){
                              biggest5404=ends[16];
                            }
                            if(ends[17]>=biggest5404){
                              biggest5404=ends[17];
                            }
                            if(biggest5404 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            thread5405(tdone,ends);
                            thread5406(tdone,ends);
                            int biggest5407 = 0;
                            if(ends[14]>=biggest5407){
                              biggest5407=ends[14];
                            }
                            if(ends[15]>=biggest5407){
                              biggest5407=ends[15];
                            }
                            if(biggest5407 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest5407 == 0){
                              S1622=7;
                              thread5408(tdone,ends);
                              thread5409(tdone,ends);
                              int biggest5410 = 0;
                              if(ends[16]>=biggest5410){
                                biggest5410=ends[16];
                              }
                              if(ends[17]>=biggest5410){
                                biggest5410=ends[17];
                              }
                              if(biggest5410 == 1){
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                          }
                        
                      }
                      break;
                    
                  }
                  break;
                
              }
              break;
            
            case 7 : 
              if(tick.getprestatus()){//sysj\fillerController.sysj line: 63, column: 10
                System.out.println("Select Liquid 2");//sysj\fillerController.sysj line: 68, column: 4
                S1622=8;
                thread5411(tdone,ends);
                thread5412(tdone,ends);
                thread5413(tdone,ends);
                thread5414(tdone,ends);
                int biggest5415 = 0;
                if(ends[18]>=biggest5415){
                  biggest5415=ends[18];
                }
                if(ends[19]>=biggest5415){
                  biggest5415=ends[19];
                }
                if(ends[20]>=biggest5415){
                  biggest5415=ends[20];
                }
                if(ends[21]>=biggest5415){
                  biggest5415=ends[21];
                }
                if(biggest5415 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                thread5416(tdone,ends);
                thread5417(tdone,ends);
                int biggest5418 = 0;
                if(ends[16]>=biggest5418){
                  biggest5418=ends[16];
                }
                if(ends[17]>=biggest5418){
                  biggest5418=ends[17];
                }
                if(biggest5418 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest5418 == 0){
                  System.out.println("Select Liquid 2");//sysj\fillerController.sysj line: 68, column: 4
                  S1622=8;
                  thread5419(tdone,ends);
                  thread5420(tdone,ends);
                  thread5421(tdone,ends);
                  thread5422(tdone,ends);
                  int biggest5423 = 0;
                  if(ends[18]>=biggest5423){
                    biggest5423=ends[18];
                  }
                  if(ends[19]>=biggest5423){
                    biggest5423=ends[19];
                  }
                  if(ends[20]>=biggest5423){
                    biggest5423=ends[20];
                  }
                  if(ends[21]>=biggest5423){
                    biggest5423=ends[21];
                  }
                  if(biggest5423 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
              }
            
            case 8 : 
              if(liquidType_1.getprestatus()){//sysj\fillerController.sysj line: 70, column: 10
                S1622=9;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                thread5424(tdone,ends);
                thread5425(tdone,ends);
                thread5426(tdone,ends);
                thread5427(tdone,ends);
                int biggest5428 = 0;
                if(ends[18]>=biggest5428){
                  biggest5428=ends[18];
                }
                if(ends[19]>=biggest5428){
                  biggest5428=ends[19];
                }
                if(ends[20]>=biggest5428){
                  biggest5428=ends[20];
                }
                if(ends[21]>=biggest5428){
                  biggest5428=ends[21];
                }
                if(biggest5428 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest5428 == 0){
                  S1622=9;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
            case 9 : 
              if(!tick.getprestatus()){//sysj\fillerController.sysj line: 80, column: 10
                S1622=10;
                if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 1){//sysj\fillerController.sysj line: 81, column: 7
                  S2102=0;
                  System.out.println("Filling with 1 to 50%\n");//sysj\fillerController.sysj line: 83, column: 6
                  thread5429(tdone,ends);
                  thread5430(tdone,ends);
                  int biggest5431 = 0;
                  if(ends[22]>=biggest5431){
                    biggest5431=ends[22];
                  }
                  if(ends[23]>=biggest5431){
                    biggest5431=ends[23];
                  }
                  if(biggest5431 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
                else {
                  S2102=1;
                  if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 2){//sysj\fillerController.sysj line: 89, column: 13
                    S2101=0;
                    System.out.println("Filling with 2 to 50%\n");//sysj\fillerController.sysj line: 91, column: 6
                    thread5432(tdone,ends);
                    thread5433(tdone,ends);
                    int biggest5434 = 0;
                    if(ends[24]>=biggest5434){
                      biggest5434=ends[24];
                    }
                    if(ends[25]>=biggest5434){
                      biggest5434=ends[25];
                    }
                    if(biggest5434 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    S2101=1;
                    if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 3){//sysj\fillerController.sysj line: 97, column: 13
                      S2100=0;
                      System.out.println("Filling with 3 to 50%\n");//sysj\fillerController.sysj line: 99, column: 6
                      thread5435(tdone,ends);
                      thread5436(tdone,ends);
                      int biggest5437 = 0;
                      if(ends[26]>=biggest5437){
                        biggest5437=ends[26];
                      }
                      if(ends[27]>=biggest5437){
                        biggest5437=ends[27];
                      }
                      if(biggest5437 == 1){
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      S2100=1;
                      System.out.println("Filling with 4 to 50%\n");//sysj\fillerController.sysj line: 107, column: 6
                      thread5438(tdone,ends);
                      thread5439(tdone,ends);
                      int biggest5440 = 0;
                      if(ends[28]>=biggest5440){
                        biggest5440=ends[28];
                      }
                      if(ends[29]>=biggest5440){
                        biggest5440=ends[29];
                      }
                      if(biggest5440 == 1){
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                  }
                }
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 10 : 
              switch(S2102){
                case 0 : 
                  if(tick.getprestatus()){//sysj\fillerController.sysj line: 82, column: 11
                    S1622=11;
                    thread5441(tdone,ends);
                    thread5442(tdone,ends);
                    int biggest5443 = 0;
                    if(ends[30]>=biggest5443){
                      biggest5443=ends[30];
                    }
                    if(ends[31]>=biggest5443){
                      biggest5443=ends[31];
                    }
                    if(biggest5443 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    thread5444(tdone,ends);
                    thread5445(tdone,ends);
                    int biggest5446 = 0;
                    if(ends[22]>=biggest5446){
                      biggest5446=ends[22];
                    }
                    if(ends[23]>=biggest5446){
                      biggest5446=ends[23];
                    }
                    if(biggest5446 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    //FINXME code
                    if(biggest5446 == 0){
                      S1622=11;
                      thread5447(tdone,ends);
                      thread5448(tdone,ends);
                      int biggest5449 = 0;
                      if(ends[30]>=biggest5449){
                        biggest5449=ends[30];
                      }
                      if(ends[31]>=biggest5449){
                        biggest5449=ends[31];
                      }
                      if(biggest5449 == 1){
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                  }
                
                case 1 : 
                  switch(S2101){
                    case 0 : 
                      if(tick.getprestatus()){//sysj\fillerController.sysj line: 90, column: 11
                        S1622=11;
                        thread5450(tdone,ends);
                        thread5451(tdone,ends);
                        int biggest5452 = 0;
                        if(ends[30]>=biggest5452){
                          biggest5452=ends[30];
                        }
                        if(ends[31]>=biggest5452){
                          biggest5452=ends[31];
                        }
                        if(biggest5452 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        thread5453(tdone,ends);
                        thread5454(tdone,ends);
                        int biggest5455 = 0;
                        if(ends[24]>=biggest5455){
                          biggest5455=ends[24];
                        }
                        if(ends[25]>=biggest5455){
                          biggest5455=ends[25];
                        }
                        if(biggest5455 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        //FINXME code
                        if(biggest5455 == 0){
                          S1622=11;
                          thread5456(tdone,ends);
                          thread5457(tdone,ends);
                          int biggest5458 = 0;
                          if(ends[30]>=biggest5458){
                            biggest5458=ends[30];
                          }
                          if(ends[31]>=biggest5458){
                            biggest5458=ends[31];
                          }
                          if(biggest5458 == 1){
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                      }
                    
                    case 1 : 
                      switch(S2100){
                        case 0 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 98, column: 11
                            S1622=11;
                            thread5459(tdone,ends);
                            thread5460(tdone,ends);
                            int biggest5461 = 0;
                            if(ends[30]>=biggest5461){
                              biggest5461=ends[30];
                            }
                            if(ends[31]>=biggest5461){
                              biggest5461=ends[31];
                            }
                            if(biggest5461 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            thread5462(tdone,ends);
                            thread5463(tdone,ends);
                            int biggest5464 = 0;
                            if(ends[26]>=biggest5464){
                              biggest5464=ends[26];
                            }
                            if(ends[27]>=biggest5464){
                              biggest5464=ends[27];
                            }
                            if(biggest5464 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest5464 == 0){
                              S1622=11;
                              thread5465(tdone,ends);
                              thread5466(tdone,ends);
                              int biggest5467 = 0;
                              if(ends[30]>=biggest5467){
                                biggest5467=ends[30];
                              }
                              if(ends[31]>=biggest5467){
                                biggest5467=ends[31];
                              }
                              if(biggest5467 == 1){
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                          }
                        
                        case 1 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 106, column: 11
                            S1622=11;
                            thread5468(tdone,ends);
                            thread5469(tdone,ends);
                            int biggest5470 = 0;
                            if(ends[30]>=biggest5470){
                              biggest5470=ends[30];
                            }
                            if(ends[31]>=biggest5470){
                              biggest5470=ends[31];
                            }
                            if(biggest5470 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            thread5471(tdone,ends);
                            thread5472(tdone,ends);
                            int biggest5473 = 0;
                            if(ends[28]>=biggest5473){
                              biggest5473=ends[28];
                            }
                            if(ends[29]>=biggest5473){
                              biggest5473=ends[29];
                            }
                            if(biggest5473 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest5473 == 0){
                              S1622=11;
                              thread5474(tdone,ends);
                              thread5475(tdone,ends);
                              int biggest5476 = 0;
                              if(ends[30]>=biggest5476){
                                biggest5476=ends[30];
                              }
                              if(ends[31]>=biggest5476){
                                biggest5476=ends[31];
                              }
                              if(biggest5476 == 1){
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                          }
                        
                      }
                      break;
                    
                  }
                  break;
                
              }
              break;
            
            case 11 : 
              if(tick.getprestatus()){//sysj\fillerController.sysj line: 113, column: 10
                System.out.println("Select Liquid 3");//sysj\fillerController.sysj line: 118, column: 4
                S1622=12;
                thread5477(tdone,ends);
                thread5478(tdone,ends);
                thread5479(tdone,ends);
                thread5480(tdone,ends);
                int biggest5481 = 0;
                if(ends[32]>=biggest5481){
                  biggest5481=ends[32];
                }
                if(ends[33]>=biggest5481){
                  biggest5481=ends[33];
                }
                if(ends[34]>=biggest5481){
                  biggest5481=ends[34];
                }
                if(ends[35]>=biggest5481){
                  biggest5481=ends[35];
                }
                if(biggest5481 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                thread5482(tdone,ends);
                thread5483(tdone,ends);
                int biggest5484 = 0;
                if(ends[30]>=biggest5484){
                  biggest5484=ends[30];
                }
                if(ends[31]>=biggest5484){
                  biggest5484=ends[31];
                }
                if(biggest5484 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest5484 == 0){
                  System.out.println("Select Liquid 3");//sysj\fillerController.sysj line: 118, column: 4
                  S1622=12;
                  thread5485(tdone,ends);
                  thread5486(tdone,ends);
                  thread5487(tdone,ends);
                  thread5488(tdone,ends);
                  int biggest5489 = 0;
                  if(ends[32]>=biggest5489){
                    biggest5489=ends[32];
                  }
                  if(ends[33]>=biggest5489){
                    biggest5489=ends[33];
                  }
                  if(ends[34]>=biggest5489){
                    biggest5489=ends[34];
                  }
                  if(ends[35]>=biggest5489){
                    biggest5489=ends[35];
                  }
                  if(biggest5489 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
              }
            
            case 12 : 
              if(liquidType_1.getprestatus()){//sysj\fillerController.sysj line: 120, column: 10
                S1622=13;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                thread5490(tdone,ends);
                thread5491(tdone,ends);
                thread5492(tdone,ends);
                thread5493(tdone,ends);
                int biggest5494 = 0;
                if(ends[32]>=biggest5494){
                  biggest5494=ends[32];
                }
                if(ends[33]>=biggest5494){
                  biggest5494=ends[33];
                }
                if(ends[34]>=biggest5494){
                  biggest5494=ends[34];
                }
                if(ends[35]>=biggest5494){
                  biggest5494=ends[35];
                }
                if(biggest5494 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest5494 == 0){
                  S1622=13;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
            case 13 : 
              if(!tick.getprestatus()){//sysj\fillerController.sysj line: 130, column: 10
                S1622=14;
                if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 1){//sysj\fillerController.sysj line: 131, column: 7
                  S2425=0;
                  System.out.println("Filling with 1 to 75%\n");//sysj\fillerController.sysj line: 133, column: 6
                  thread5495(tdone,ends);
                  thread5496(tdone,ends);
                  int biggest5497 = 0;
                  if(ends[36]>=biggest5497){
                    biggest5497=ends[36];
                  }
                  if(ends[37]>=biggest5497){
                    biggest5497=ends[37];
                  }
                  if(biggest5497 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
                else {
                  S2425=1;
                  if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 2){//sysj\fillerController.sysj line: 139, column: 13
                    S2424=0;
                    System.out.println("Filling with 2 to 75%\n");//sysj\fillerController.sysj line: 141, column: 6
                    thread5498(tdone,ends);
                    thread5499(tdone,ends);
                    int biggest5500 = 0;
                    if(ends[38]>=biggest5500){
                      biggest5500=ends[38];
                    }
                    if(ends[39]>=biggest5500){
                      biggest5500=ends[39];
                    }
                    if(biggest5500 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    S2424=1;
                    if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 3){//sysj\fillerController.sysj line: 147, column: 13
                      S2423=0;
                      System.out.println("Filling with 3 to 75%\n");//sysj\fillerController.sysj line: 149, column: 6
                      thread5501(tdone,ends);
                      thread5502(tdone,ends);
                      int biggest5503 = 0;
                      if(ends[40]>=biggest5503){
                        biggest5503=ends[40];
                      }
                      if(ends[41]>=biggest5503){
                        biggest5503=ends[41];
                      }
                      if(biggest5503 == 1){
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      S2423=1;
                      System.out.println("Filling with 4 to 75%\n");//sysj\fillerController.sysj line: 157, column: 6
                      thread5504(tdone,ends);
                      thread5505(tdone,ends);
                      int biggest5506 = 0;
                      if(ends[42]>=biggest5506){
                        biggest5506=ends[42];
                      }
                      if(ends[43]>=biggest5506){
                        biggest5506=ends[43];
                      }
                      if(biggest5506 == 1){
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
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
              switch(S2425){
                case 0 : 
                  if(tick.getprestatus()){//sysj\fillerController.sysj line: 132, column: 11
                    S1622=15;
                    thread5507(tdone,ends);
                    thread5508(tdone,ends);
                    int biggest5509 = 0;
                    if(ends[44]>=biggest5509){
                      biggest5509=ends[44];
                    }
                    if(ends[45]>=biggest5509){
                      biggest5509=ends[45];
                    }
                    if(biggest5509 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    thread5510(tdone,ends);
                    thread5511(tdone,ends);
                    int biggest5512 = 0;
                    if(ends[36]>=biggest5512){
                      biggest5512=ends[36];
                    }
                    if(ends[37]>=biggest5512){
                      biggest5512=ends[37];
                    }
                    if(biggest5512 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    //FINXME code
                    if(biggest5512 == 0){
                      S1622=15;
                      thread5513(tdone,ends);
                      thread5514(tdone,ends);
                      int biggest5515 = 0;
                      if(ends[44]>=biggest5515){
                        biggest5515=ends[44];
                      }
                      if(ends[45]>=biggest5515){
                        biggest5515=ends[45];
                      }
                      if(biggest5515 == 1){
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                  }
                
                case 1 : 
                  switch(S2424){
                    case 0 : 
                      if(tick.getprestatus()){//sysj\fillerController.sysj line: 140, column: 11
                        S1622=15;
                        thread5516(tdone,ends);
                        thread5517(tdone,ends);
                        int biggest5518 = 0;
                        if(ends[44]>=biggest5518){
                          biggest5518=ends[44];
                        }
                        if(ends[45]>=biggest5518){
                          biggest5518=ends[45];
                        }
                        if(biggest5518 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        thread5519(tdone,ends);
                        thread5520(tdone,ends);
                        int biggest5521 = 0;
                        if(ends[38]>=biggest5521){
                          biggest5521=ends[38];
                        }
                        if(ends[39]>=biggest5521){
                          biggest5521=ends[39];
                        }
                        if(biggest5521 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        //FINXME code
                        if(biggest5521 == 0){
                          S1622=15;
                          thread5522(tdone,ends);
                          thread5523(tdone,ends);
                          int biggest5524 = 0;
                          if(ends[44]>=biggest5524){
                            biggest5524=ends[44];
                          }
                          if(ends[45]>=biggest5524){
                            biggest5524=ends[45];
                          }
                          if(biggest5524 == 1){
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                      }
                    
                    case 1 : 
                      switch(S2423){
                        case 0 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 148, column: 11
                            S1622=15;
                            thread5525(tdone,ends);
                            thread5526(tdone,ends);
                            int biggest5527 = 0;
                            if(ends[44]>=biggest5527){
                              biggest5527=ends[44];
                            }
                            if(ends[45]>=biggest5527){
                              biggest5527=ends[45];
                            }
                            if(biggest5527 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            thread5528(tdone,ends);
                            thread5529(tdone,ends);
                            int biggest5530 = 0;
                            if(ends[40]>=biggest5530){
                              biggest5530=ends[40];
                            }
                            if(ends[41]>=biggest5530){
                              biggest5530=ends[41];
                            }
                            if(biggest5530 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest5530 == 0){
                              S1622=15;
                              thread5531(tdone,ends);
                              thread5532(tdone,ends);
                              int biggest5533 = 0;
                              if(ends[44]>=biggest5533){
                                biggest5533=ends[44];
                              }
                              if(ends[45]>=biggest5533){
                                biggest5533=ends[45];
                              }
                              if(biggest5533 == 1){
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                          }
                        
                        case 1 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 156, column: 11
                            S1622=15;
                            thread5534(tdone,ends);
                            thread5535(tdone,ends);
                            int biggest5536 = 0;
                            if(ends[44]>=biggest5536){
                              biggest5536=ends[44];
                            }
                            if(ends[45]>=biggest5536){
                              biggest5536=ends[45];
                            }
                            if(biggest5536 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            thread5537(tdone,ends);
                            thread5538(tdone,ends);
                            int biggest5539 = 0;
                            if(ends[42]>=biggest5539){
                              biggest5539=ends[42];
                            }
                            if(ends[43]>=biggest5539){
                              biggest5539=ends[43];
                            }
                            if(biggest5539 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest5539 == 0){
                              S1622=15;
                              thread5540(tdone,ends);
                              thread5541(tdone,ends);
                              int biggest5542 = 0;
                              if(ends[44]>=biggest5542){
                                biggest5542=ends[44];
                              }
                              if(ends[45]>=biggest5542){
                                biggest5542=ends[45];
                              }
                              if(biggest5542 == 1){
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                          }
                        
                      }
                      break;
                    
                  }
                  break;
                
              }
              break;
            
            case 15 : 
              if(tick.getprestatus()){//sysj\fillerController.sysj line: 164, column: 10
                System.out.println("Select Liquid 4");//sysj\fillerController.sysj line: 170, column: 4
                S1622=16;
                thread5543(tdone,ends);
                thread5544(tdone,ends);
                thread5545(tdone,ends);
                thread5546(tdone,ends);
                int biggest5547 = 0;
                if(ends[46]>=biggest5547){
                  biggest5547=ends[46];
                }
                if(ends[47]>=biggest5547){
                  biggest5547=ends[47];
                }
                if(ends[48]>=biggest5547){
                  biggest5547=ends[48];
                }
                if(ends[49]>=biggest5547){
                  biggest5547=ends[49];
                }
                if(biggest5547 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                thread5548(tdone,ends);
                thread5549(tdone,ends);
                int biggest5550 = 0;
                if(ends[44]>=biggest5550){
                  biggest5550=ends[44];
                }
                if(ends[45]>=biggest5550){
                  biggest5550=ends[45];
                }
                if(biggest5550 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest5550 == 0){
                  System.out.println("Select Liquid 4");//sysj\fillerController.sysj line: 170, column: 4
                  S1622=16;
                  thread5551(tdone,ends);
                  thread5552(tdone,ends);
                  thread5553(tdone,ends);
                  thread5554(tdone,ends);
                  int biggest5555 = 0;
                  if(ends[46]>=biggest5555){
                    biggest5555=ends[46];
                  }
                  if(ends[47]>=biggest5555){
                    biggest5555=ends[47];
                  }
                  if(ends[48]>=biggest5555){
                    biggest5555=ends[48];
                  }
                  if(ends[49]>=biggest5555){
                    biggest5555=ends[49];
                  }
                  if(biggest5555 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
              }
            
            case 16 : 
              if(liquidType_1.getprestatus()){//sysj\fillerController.sysj line: 172, column: 10
                S1622=17;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                thread5556(tdone,ends);
                thread5557(tdone,ends);
                thread5558(tdone,ends);
                thread5559(tdone,ends);
                int biggest5560 = 0;
                if(ends[46]>=biggest5560){
                  biggest5560=ends[46];
                }
                if(ends[47]>=biggest5560){
                  biggest5560=ends[47];
                }
                if(ends[48]>=biggest5560){
                  biggest5560=ends[48];
                }
                if(ends[49]>=biggest5560){
                  biggest5560=ends[49];
                }
                if(biggest5560 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest5560 == 0){
                  S1622=17;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
            case 17 : 
              if(!tick.getprestatus()){//sysj\fillerController.sysj line: 182, column: 10
                S1622=18;
                if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 1){//sysj\fillerController.sysj line: 183, column: 7
                  S2748=0;
                  System.out.println("Filling with 1 to 100%\n");//sysj\fillerController.sysj line: 185, column: 6
                  thread5561(tdone,ends);
                  thread5562(tdone,ends);
                  int biggest5563 = 0;
                  if(ends[50]>=biggest5563){
                    biggest5563=ends[50];
                  }
                  if(ends[51]>=biggest5563){
                    biggest5563=ends[51];
                  }
                  if(biggest5563 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
                else {
                  S2748=1;
                  if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 2){//sysj\fillerController.sysj line: 191, column: 13
                    S2747=0;
                    System.out.println("Filling with 2 to 100%\n");//sysj\fillerController.sysj line: 193, column: 6
                    thread5564(tdone,ends);
                    thread5565(tdone,ends);
                    int biggest5566 = 0;
                    if(ends[52]>=biggest5566){
                      biggest5566=ends[52];
                    }
                    if(ends[53]>=biggest5566){
                      biggest5566=ends[53];
                    }
                    if(biggest5566 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    S2747=1;
                    if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 3){//sysj\fillerController.sysj line: 199, column: 13
                      S2746=0;
                      System.out.println("Filling with 3 to 100%\n");//sysj\fillerController.sysj line: 201, column: 6
                      thread5567(tdone,ends);
                      thread5568(tdone,ends);
                      int biggest5569 = 0;
                      if(ends[54]>=biggest5569){
                        biggest5569=ends[54];
                      }
                      if(ends[55]>=biggest5569){
                        biggest5569=ends[55];
                      }
                      if(biggest5569 == 1){
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      S2746=1;
                      System.out.println("Filling with 4 to 100%\n");//sysj\fillerController.sysj line: 209, column: 6
                      thread5570(tdone,ends);
                      thread5571(tdone,ends);
                      int biggest5572 = 0;
                      if(ends[56]>=biggest5572){
                        biggest5572=ends[56];
                      }
                      if(ends[57]>=biggest5572){
                        biggest5572=ends[57];
                      }
                      if(biggest5572 == 1){
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                  }
                }
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 18 : 
              switch(S2748){
                case 0 : 
                  if(tick.getprestatus()){//sysj\fillerController.sysj line: 184, column: 11
                    S1622=19;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    thread5573(tdone,ends);
                    thread5574(tdone,ends);
                    int biggest5575 = 0;
                    if(ends[50]>=biggest5575){
                      biggest5575=ends[50];
                    }
                    if(ends[51]>=biggest5575){
                      biggest5575=ends[51];
                    }
                    if(biggest5575 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    //FINXME code
                    if(biggest5575 == 0){
                      S1622=19;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                
                case 1 : 
                  switch(S2747){
                    case 0 : 
                      if(tick.getprestatus()){//sysj\fillerController.sysj line: 192, column: 11
                        S1622=19;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        thread5576(tdone,ends);
                        thread5577(tdone,ends);
                        int biggest5578 = 0;
                        if(ends[52]>=biggest5578){
                          biggest5578=ends[52];
                        }
                        if(ends[53]>=biggest5578){
                          biggest5578=ends[53];
                        }
                        if(biggest5578 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        //FINXME code
                        if(biggest5578 == 0){
                          S1622=19;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                    
                    case 1 : 
                      switch(S2746){
                        case 0 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 200, column: 11
                            S1622=19;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            thread5579(tdone,ends);
                            thread5580(tdone,ends);
                            int biggest5581 = 0;
                            if(ends[54]>=biggest5581){
                              biggest5581=ends[54];
                            }
                            if(ends[55]>=biggest5581){
                              biggest5581=ends[55];
                            }
                            if(biggest5581 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest5581 == 0){
                              S1622=19;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                        
                        case 1 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 208, column: 11
                            S1622=19;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            thread5582(tdone,ends);
                            thread5583(tdone,ends);
                            int biggest5584 = 0;
                            if(ends[56]>=biggest5584){
                              biggest5584=ends[56];
                            }
                            if(ends[57]>=biggest5584){
                              biggest5584=ends[57];
                            }
                            if(biggest5584 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest5584 == 0){
                              S1622=19;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                        
                      }
                      break;
                    
                  }
                  break;
                
              }
              break;
            
            case 19 : 
              if(!tick.getprestatus()){//sysj\fillerController.sysj line: 216, column: 10
                S1622=20;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 20 : 
              if(tick.getprestatus()){//sysj\fillerController.sysj line: 217, column: 10
                S1622=21;
                fillerDone.setPresent();//sysj\fillerController.sysj line: 219, column: 5
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
            
            case 21 : 
              if(!fillerEnable.getprestatus()){//sysj\fillerController.sysj line: 218, column: 10
                S1622=0;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                fillerDone.setPresent();//sysj\fillerController.sysj line: 219, column: 5
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
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
