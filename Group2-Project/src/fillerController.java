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
  private int S4728 = 1;
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
  private int S1884 = 1;
  private int S1889 = 1;
  private int S1904 = 1;
  private int S1907 = 1;
  private int S1910 = 1;
  private int S1913 = 1;
  private int S2034 = 1;
  private int S1948 = 1;
  private int S1953 = 1;
  private int S2033 = 1;
  private int S1970 = 1;
  private int S1975 = 1;
  private int S2032 = 1;
  private int S1992 = 1;
  private int S1997 = 1;
  private int S2014 = 1;
  private int S2019 = 1;
  private int S2139 = 1;
  private int S2144 = 1;
  private int S2159 = 1;
  private int S2162 = 1;
  private int S2165 = 1;
  private int S2168 = 1;
  private int S2289 = 1;
  private int S2203 = 1;
  private int S2208 = 1;
  private int S2288 = 1;
  private int S2225 = 1;
  private int S2230 = 1;
  private int S2287 = 1;
  private int S2247 = 1;
  private int S2252 = 1;
  private int S2269 = 1;
  private int S2274 = 1;
  private int S2394 = 1;
  private int S2399 = 1;
  private int S2414 = 1;
  private int S2417 = 1;
  private int S2420 = 1;
  private int S2423 = 1;
  private int S2544 = 1;
  private int S2458 = 1;
  private int S2463 = 1;
  private int S2543 = 1;
  private int S2480 = 1;
  private int S2485 = 1;
  private int S2542 = 1;
  private int S2502 = 1;
  private int S2507 = 1;
  private int S2524 = 1;
  private int S2529 = 1;
  
  private int[] ends = new int[58];
  private int[] tdone = new int[58];
  
  public void thread4908(int [] tdone, int [] ends){
        switch(S2529){
      case 0 : 
        active[57]=0;
        ends[57]=0;
        tdone[57]=1;
        break;
      
      case 1 : 
        inletOn.setPresent();//sysj\fillerController.sysj line: 216, column: 7
        currsigs.addElement(inletOn);
        active[57]=1;
        ends[57]=1;
        tdone[57]=1;
        break;
      
    }
  }

  public void thread4907(int [] tdone, int [] ends){
        switch(S2524){
      case 0 : 
        active[56]=0;
        ends[56]=0;
        tdone[56]=1;
        break;
      
      case 1 : 
        fill4.setPresent();//sysj\fillerController.sysj line: 214, column: 8
        currsigs.addElement(fill4);
        active[56]=1;
        ends[56]=1;
        tdone[56]=1;
        break;
      
    }
  }

  public void thread4905(int [] tdone, int [] ends){
        switch(S2507){
      case 0 : 
        active[55]=0;
        ends[55]=0;
        tdone[55]=1;
        break;
      
      case 1 : 
        inletOn.setPresent();//sysj\fillerController.sysj line: 208, column: 7
        currsigs.addElement(inletOn);
        active[55]=1;
        ends[55]=1;
        tdone[55]=1;
        break;
      
    }
  }

  public void thread4904(int [] tdone, int [] ends){
        switch(S2502){
      case 0 : 
        active[54]=0;
        ends[54]=0;
        tdone[54]=1;
        break;
      
      case 1 : 
        fill3.setPresent();//sysj\fillerController.sysj line: 206, column: 8
        currsigs.addElement(fill3);
        active[54]=1;
        ends[54]=1;
        tdone[54]=1;
        break;
      
    }
  }

  public void thread4902(int [] tdone, int [] ends){
        switch(S2485){
      case 0 : 
        active[53]=0;
        ends[53]=0;
        tdone[53]=1;
        break;
      
      case 1 : 
        inletOn.setPresent();//sysj\fillerController.sysj line: 200, column: 7
        currsigs.addElement(inletOn);
        active[53]=1;
        ends[53]=1;
        tdone[53]=1;
        break;
      
    }
  }

  public void thread4901(int [] tdone, int [] ends){
        switch(S2480){
      case 0 : 
        active[52]=0;
        ends[52]=0;
        tdone[52]=1;
        break;
      
      case 1 : 
        fill2.setPresent();//sysj\fillerController.sysj line: 198, column: 8
        currsigs.addElement(fill2);
        active[52]=1;
        ends[52]=1;
        tdone[52]=1;
        break;
      
    }
  }

  public void thread4899(int [] tdone, int [] ends){
        switch(S2463){
      case 0 : 
        active[51]=0;
        ends[51]=0;
        tdone[51]=1;
        break;
      
      case 1 : 
        inletOn.setPresent();//sysj\fillerController.sysj line: 192, column: 7
        currsigs.addElement(inletOn);
        active[51]=1;
        ends[51]=1;
        tdone[51]=1;
        break;
      
    }
  }

  public void thread4898(int [] tdone, int [] ends){
        switch(S2458){
      case 0 : 
        active[50]=0;
        ends[50]=0;
        tdone[50]=1;
        break;
      
      case 1 : 
        fill1.setPresent();//sysj\fillerController.sysj line: 190, column: 8
        currsigs.addElement(fill1);
        active[50]=1;
        ends[50]=1;
        tdone[50]=1;
        break;
      
    }
  }

  public void thread4896(int [] tdone, int [] ends){
        S2529=1;
    inletOn.setPresent();//sysj\fillerController.sysj line: 216, column: 7
    currsigs.addElement(inletOn);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread4895(int [] tdone, int [] ends){
        S2524=1;
    fill4.setPresent();//sysj\fillerController.sysj line: 214, column: 8
    currsigs.addElement(fill4);
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread4893(int [] tdone, int [] ends){
        S2507=1;
    inletOn.setPresent();//sysj\fillerController.sysj line: 208, column: 7
    currsigs.addElement(inletOn);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread4892(int [] tdone, int [] ends){
        S2502=1;
    fill3.setPresent();//sysj\fillerController.sysj line: 206, column: 8
    currsigs.addElement(fill3);
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread4890(int [] tdone, int [] ends){
        S2485=1;
    inletOn.setPresent();//sysj\fillerController.sysj line: 200, column: 7
    currsigs.addElement(inletOn);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread4889(int [] tdone, int [] ends){
        S2480=1;
    fill2.setPresent();//sysj\fillerController.sysj line: 198, column: 8
    currsigs.addElement(fill2);
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread4887(int [] tdone, int [] ends){
        S2463=1;
    inletOn.setPresent();//sysj\fillerController.sysj line: 192, column: 7
    currsigs.addElement(inletOn);
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread4886(int [] tdone, int [] ends){
        S2458=1;
    fill1.setPresent();//sysj\fillerController.sysj line: 190, column: 8
    currsigs.addElement(fill1);
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread4884(int [] tdone, int [] ends){
        switch(S2423){
      case 0 : 
        active[49]=0;
        ends[49]=0;
        tdone[49]=1;
        break;
      
      case 1 : 
        if(toFill4.getprestatus()){//sysj\fillerController.sysj line: 183, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 183, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(4);//sysj\fillerController.sysj line: 183, column: 23
          S2423=0;
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

  public void thread4883(int [] tdone, int [] ends){
        switch(S2420){
      case 0 : 
        active[48]=0;
        ends[48]=0;
        tdone[48]=1;
        break;
      
      case 1 : 
        if(toFill3.getprestatus()){//sysj\fillerController.sysj line: 181, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 181, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(3);//sysj\fillerController.sysj line: 181, column: 23
          S2420=0;
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

  public void thread4882(int [] tdone, int [] ends){
        switch(S2417){
      case 0 : 
        active[47]=0;
        ends[47]=0;
        tdone[47]=1;
        break;
      
      case 1 : 
        if(toFill2.getprestatus()){//sysj\fillerController.sysj line: 179, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 179, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(2);//sysj\fillerController.sysj line: 179, column: 23
          S2417=0;
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

  public void thread4881(int [] tdone, int [] ends){
        switch(S2414){
      case 0 : 
        active[46]=0;
        ends[46]=0;
        tdone[46]=1;
        break;
      
      case 1 : 
        if(toFill1.getprestatus()){//sysj\fillerController.sysj line: 177, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 177, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(1);//sysj\fillerController.sysj line: 177, column: 23
          S2414=0;
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

  public void thread4879(int [] tdone, int [] ends){
        S2423=1;
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread4878(int [] tdone, int [] ends){
        S2420=1;
    active[48]=1;
    ends[48]=1;
    tdone[48]=1;
  }

  public void thread4877(int [] tdone, int [] ends){
        S2417=1;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread4876(int [] tdone, int [] ends){
        S2414=1;
    active[46]=1;
    ends[46]=1;
    tdone[46]=1;
  }

  public void thread4874(int [] tdone, int [] ends){
        switch(S2399){
      case 0 : 
        active[45]=0;
        ends[45]=0;
        tdone[45]=1;
        break;
      
      case 1 : 
        valveRetract.setPresent();//sysj\fillerController.sysj line: 171, column: 6
        currsigs.addElement(valveRetract);
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
        break;
      
    }
  }

  public void thread4873(int [] tdone, int [] ends){
        switch(S2394){
      case 0 : 
        active[44]=0;
        ends[44]=0;
        tdone[44]=1;
        break;
      
      case 1 : 
        injectorOn.setPresent();//sysj\fillerController.sysj line: 169, column: 7
        currsigs.addElement(injectorOn);
        active[44]=1;
        ends[44]=1;
        tdone[44]=1;
        break;
      
    }
  }

  public void thread4871(int [] tdone, int [] ends){
        S2423=1;
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread4870(int [] tdone, int [] ends){
        S2420=1;
    active[48]=1;
    ends[48]=1;
    tdone[48]=1;
  }

  public void thread4869(int [] tdone, int [] ends){
        S2417=1;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread4868(int [] tdone, int [] ends){
        S2414=1;
    active[46]=1;
    ends[46]=1;
    tdone[46]=1;
  }

  public void thread4866(int [] tdone, int [] ends){
        S2399=1;
    valveRetract.setPresent();//sysj\fillerController.sysj line: 171, column: 6
    currsigs.addElement(valveRetract);
    active[45]=1;
    ends[45]=1;
    tdone[45]=1;
  }

  public void thread4865(int [] tdone, int [] ends){
        S2394=1;
    injectorOn.setPresent();//sysj\fillerController.sysj line: 169, column: 7
    currsigs.addElement(injectorOn);
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread4863(int [] tdone, int [] ends){
        switch(S2274){
      case 0 : 
        active[43]=0;
        ends[43]=0;
        tdone[43]=1;
        break;
      
      case 1 : 
        inletOn.setPresent();//sysj\fillerController.sysj line: 163, column: 7
        currsigs.addElement(inletOn);
        active[43]=1;
        ends[43]=1;
        tdone[43]=1;
        break;
      
    }
  }

  public void thread4862(int [] tdone, int [] ends){
        switch(S2269){
      case 0 : 
        active[42]=0;
        ends[42]=0;
        tdone[42]=1;
        break;
      
      case 1 : 
        fill4.setPresent();//sysj\fillerController.sysj line: 161, column: 8
        currsigs.addElement(fill4);
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
        break;
      
    }
  }

  public void thread4860(int [] tdone, int [] ends){
        switch(S2252){
      case 0 : 
        active[41]=0;
        ends[41]=0;
        tdone[41]=1;
        break;
      
      case 1 : 
        inletOn.setPresent();//sysj\fillerController.sysj line: 155, column: 7
        currsigs.addElement(inletOn);
        active[41]=1;
        ends[41]=1;
        tdone[41]=1;
        break;
      
    }
  }

  public void thread4859(int [] tdone, int [] ends){
        switch(S2247){
      case 0 : 
        active[40]=0;
        ends[40]=0;
        tdone[40]=1;
        break;
      
      case 1 : 
        fill3.setPresent();//sysj\fillerController.sysj line: 153, column: 8
        currsigs.addElement(fill3);
        active[40]=1;
        ends[40]=1;
        tdone[40]=1;
        break;
      
    }
  }

  public void thread4857(int [] tdone, int [] ends){
        switch(S2230){
      case 0 : 
        active[39]=0;
        ends[39]=0;
        tdone[39]=1;
        break;
      
      case 1 : 
        inletOn.setPresent();//sysj\fillerController.sysj line: 147, column: 7
        currsigs.addElement(inletOn);
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
        break;
      
    }
  }

  public void thread4856(int [] tdone, int [] ends){
        switch(S2225){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        fill2.setPresent();//sysj\fillerController.sysj line: 145, column: 8
        currsigs.addElement(fill2);
        active[38]=1;
        ends[38]=1;
        tdone[38]=1;
        break;
      
    }
  }

  public void thread4854(int [] tdone, int [] ends){
        switch(S2208){
      case 0 : 
        active[37]=0;
        ends[37]=0;
        tdone[37]=1;
        break;
      
      case 1 : 
        inletOn.setPresent();//sysj\fillerController.sysj line: 139, column: 7
        currsigs.addElement(inletOn);
        active[37]=1;
        ends[37]=1;
        tdone[37]=1;
        break;
      
    }
  }

  public void thread4853(int [] tdone, int [] ends){
        switch(S2203){
      case 0 : 
        active[36]=0;
        ends[36]=0;
        tdone[36]=1;
        break;
      
      case 1 : 
        fill1.setPresent();//sysj\fillerController.sysj line: 137, column: 8
        currsigs.addElement(fill1);
        active[36]=1;
        ends[36]=1;
        tdone[36]=1;
        break;
      
    }
  }

  public void thread4851(int [] tdone, int [] ends){
        S2274=1;
    inletOn.setPresent();//sysj\fillerController.sysj line: 163, column: 7
    currsigs.addElement(inletOn);
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread4850(int [] tdone, int [] ends){
        S2269=1;
    fill4.setPresent();//sysj\fillerController.sysj line: 161, column: 8
    currsigs.addElement(fill4);
    active[42]=1;
    ends[42]=1;
    tdone[42]=1;
  }

  public void thread4848(int [] tdone, int [] ends){
        S2252=1;
    inletOn.setPresent();//sysj\fillerController.sysj line: 155, column: 7
    currsigs.addElement(inletOn);
    active[41]=1;
    ends[41]=1;
    tdone[41]=1;
  }

  public void thread4847(int [] tdone, int [] ends){
        S2247=1;
    fill3.setPresent();//sysj\fillerController.sysj line: 153, column: 8
    currsigs.addElement(fill3);
    active[40]=1;
    ends[40]=1;
    tdone[40]=1;
  }

  public void thread4845(int [] tdone, int [] ends){
        S2230=1;
    inletOn.setPresent();//sysj\fillerController.sysj line: 147, column: 7
    currsigs.addElement(inletOn);
    active[39]=1;
    ends[39]=1;
    tdone[39]=1;
  }

  public void thread4844(int [] tdone, int [] ends){
        S2225=1;
    fill2.setPresent();//sysj\fillerController.sysj line: 145, column: 8
    currsigs.addElement(fill2);
    active[38]=1;
    ends[38]=1;
    tdone[38]=1;
  }

  public void thread4842(int [] tdone, int [] ends){
        S2208=1;
    inletOn.setPresent();//sysj\fillerController.sysj line: 139, column: 7
    currsigs.addElement(inletOn);
    active[37]=1;
    ends[37]=1;
    tdone[37]=1;
  }

  public void thread4841(int [] tdone, int [] ends){
        S2203=1;
    fill1.setPresent();//sysj\fillerController.sysj line: 137, column: 8
    currsigs.addElement(fill1);
    active[36]=1;
    ends[36]=1;
    tdone[36]=1;
  }

  public void thread4839(int [] tdone, int [] ends){
        switch(S2168){
      case 0 : 
        active[35]=0;
        ends[35]=0;
        tdone[35]=1;
        break;
      
      case 1 : 
        if(toFill4.getprestatus()){//sysj\fillerController.sysj line: 130, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 130, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(4);//sysj\fillerController.sysj line: 130, column: 23
          S2168=0;
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

  public void thread4838(int [] tdone, int [] ends){
        switch(S2165){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        if(toFill3.getprestatus()){//sysj\fillerController.sysj line: 128, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 128, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(3);//sysj\fillerController.sysj line: 128, column: 23
          S2165=0;
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

  public void thread4837(int [] tdone, int [] ends){
        switch(S2162){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        if(toFill2.getprestatus()){//sysj\fillerController.sysj line: 126, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 126, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(2);//sysj\fillerController.sysj line: 126, column: 23
          S2162=0;
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

  public void thread4836(int [] tdone, int [] ends){
        switch(S2159){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        if(toFill1.getprestatus()){//sysj\fillerController.sysj line: 124, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 124, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(1);//sysj\fillerController.sysj line: 124, column: 23
          S2159=0;
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

  public void thread4834(int [] tdone, int [] ends){
        S2168=1;
    active[35]=1;
    ends[35]=1;
    tdone[35]=1;
  }

  public void thread4833(int [] tdone, int [] ends){
        S2165=1;
    active[34]=1;
    ends[34]=1;
    tdone[34]=1;
  }

  public void thread4832(int [] tdone, int [] ends){
        S2162=1;
    active[33]=1;
    ends[33]=1;
    tdone[33]=1;
  }

  public void thread4831(int [] tdone, int [] ends){
        S2159=1;
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread4829(int [] tdone, int [] ends){
        switch(S2144){
      case 0 : 
        active[31]=0;
        ends[31]=0;
        tdone[31]=1;
        break;
      
      case 1 : 
        valveRetract.setPresent();//sysj\fillerController.sysj line: 119, column: 6
        currsigs.addElement(valveRetract);
        active[31]=1;
        ends[31]=1;
        tdone[31]=1;
        break;
      
    }
  }

  public void thread4828(int [] tdone, int [] ends){
        switch(S2139){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        injectorOn.setPresent();//sysj\fillerController.sysj line: 117, column: 7
        currsigs.addElement(injectorOn);
        active[30]=1;
        ends[30]=1;
        tdone[30]=1;
        break;
      
    }
  }

  public void thread4826(int [] tdone, int [] ends){
        S2168=1;
    active[35]=1;
    ends[35]=1;
    tdone[35]=1;
  }

  public void thread4825(int [] tdone, int [] ends){
        S2165=1;
    active[34]=1;
    ends[34]=1;
    tdone[34]=1;
  }

  public void thread4824(int [] tdone, int [] ends){
        S2162=1;
    active[33]=1;
    ends[33]=1;
    tdone[33]=1;
  }

  public void thread4823(int [] tdone, int [] ends){
        S2159=1;
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread4821(int [] tdone, int [] ends){
        S2144=1;
    valveRetract.setPresent();//sysj\fillerController.sysj line: 119, column: 6
    currsigs.addElement(valveRetract);
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread4820(int [] tdone, int [] ends){
        S2139=1;
    injectorOn.setPresent();//sysj\fillerController.sysj line: 117, column: 7
    currsigs.addElement(injectorOn);
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread4818(int [] tdone, int [] ends){
        switch(S2019){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        inletOn.setPresent();//sysj\fillerController.sysj line: 111, column: 7
        currsigs.addElement(inletOn);
        active[29]=1;
        ends[29]=1;
        tdone[29]=1;
        break;
      
    }
  }

  public void thread4817(int [] tdone, int [] ends){
        switch(S2014){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        fill4.setPresent();//sysj\fillerController.sysj line: 109, column: 8
        currsigs.addElement(fill4);
        active[28]=1;
        ends[28]=1;
        tdone[28]=1;
        break;
      
    }
  }

  public void thread4815(int [] tdone, int [] ends){
        switch(S1997){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        inletOn.setPresent();//sysj\fillerController.sysj line: 103, column: 7
        currsigs.addElement(inletOn);
        active[27]=1;
        ends[27]=1;
        tdone[27]=1;
        break;
      
    }
  }

  public void thread4814(int [] tdone, int [] ends){
        switch(S1992){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        fill3.setPresent();//sysj\fillerController.sysj line: 101, column: 8
        currsigs.addElement(fill3);
        active[26]=1;
        ends[26]=1;
        tdone[26]=1;
        break;
      
    }
  }

  public void thread4812(int [] tdone, int [] ends){
        switch(S1975){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        inletOn.setPresent();//sysj\fillerController.sysj line: 95, column: 7
        currsigs.addElement(inletOn);
        active[25]=1;
        ends[25]=1;
        tdone[25]=1;
        break;
      
    }
  }

  public void thread4811(int [] tdone, int [] ends){
        switch(S1970){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        fill2.setPresent();//sysj\fillerController.sysj line: 93, column: 8
        currsigs.addElement(fill2);
        active[24]=1;
        ends[24]=1;
        tdone[24]=1;
        break;
      
    }
  }

  public void thread4809(int [] tdone, int [] ends){
        switch(S1953){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        inletOn.setPresent();//sysj\fillerController.sysj line: 87, column: 7
        currsigs.addElement(inletOn);
        active[23]=1;
        ends[23]=1;
        tdone[23]=1;
        break;
      
    }
  }

  public void thread4808(int [] tdone, int [] ends){
        switch(S1948){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        fill1.setPresent();//sysj\fillerController.sysj line: 85, column: 8
        currsigs.addElement(fill1);
        active[22]=1;
        ends[22]=1;
        tdone[22]=1;
        break;
      
    }
  }

  public void thread4806(int [] tdone, int [] ends){
        S2019=1;
    inletOn.setPresent();//sysj\fillerController.sysj line: 111, column: 7
    currsigs.addElement(inletOn);
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread4805(int [] tdone, int [] ends){
        S2014=1;
    fill4.setPresent();//sysj\fillerController.sysj line: 109, column: 8
    currsigs.addElement(fill4);
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread4803(int [] tdone, int [] ends){
        S1997=1;
    inletOn.setPresent();//sysj\fillerController.sysj line: 103, column: 7
    currsigs.addElement(inletOn);
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread4802(int [] tdone, int [] ends){
        S1992=1;
    fill3.setPresent();//sysj\fillerController.sysj line: 101, column: 8
    currsigs.addElement(fill3);
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread4800(int [] tdone, int [] ends){
        S1975=1;
    inletOn.setPresent();//sysj\fillerController.sysj line: 95, column: 7
    currsigs.addElement(inletOn);
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread4799(int [] tdone, int [] ends){
        S1970=1;
    fill2.setPresent();//sysj\fillerController.sysj line: 93, column: 8
    currsigs.addElement(fill2);
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread4797(int [] tdone, int [] ends){
        S1953=1;
    inletOn.setPresent();//sysj\fillerController.sysj line: 87, column: 7
    currsigs.addElement(inletOn);
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread4796(int [] tdone, int [] ends){
        S1948=1;
    fill1.setPresent();//sysj\fillerController.sysj line: 85, column: 8
    currsigs.addElement(fill1);
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread4794(int [] tdone, int [] ends){
        switch(S1913){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        if(toFill4.getprestatus()){//sysj\fillerController.sysj line: 78, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 78, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(4);//sysj\fillerController.sysj line: 78, column: 23
          S1913=0;
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

  public void thread4793(int [] tdone, int [] ends){
        switch(S1910){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        if(toFill3.getprestatus()){//sysj\fillerController.sysj line: 76, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 76, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(3);//sysj\fillerController.sysj line: 76, column: 23
          S1910=0;
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

  public void thread4792(int [] tdone, int [] ends){
        switch(S1907){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        if(toFill2.getprestatus()){//sysj\fillerController.sysj line: 74, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 74, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(2);//sysj\fillerController.sysj line: 74, column: 23
          S1907=0;
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

  public void thread4791(int [] tdone, int [] ends){
        switch(S1904){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        if(toFill1.getprestatus()){//sysj\fillerController.sysj line: 72, column: 13
          liquidType_1.setPresent();//sysj\fillerController.sysj line: 72, column: 23
          currsigs.addElement(liquidType_1);
          liquidType_1.setValue(1);//sysj\fillerController.sysj line: 72, column: 23
          S1904=0;
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

  public void thread4789(int [] tdone, int [] ends){
        S1913=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread4788(int [] tdone, int [] ends){
        S1910=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread4787(int [] tdone, int [] ends){
        S1907=1;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread4786(int [] tdone, int [] ends){
        S1904=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread4784(int [] tdone, int [] ends){
        switch(S1889){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        valveRetract.setPresent();//sysj\fillerController.sysj line: 67, column: 6
        currsigs.addElement(valveRetract);
        active[17]=1;
        ends[17]=1;
        tdone[17]=1;
        break;
      
    }
  }

  public void thread4783(int [] tdone, int [] ends){
        switch(S1884){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        injectorOn.setPresent();//sysj\fillerController.sysj line: 65, column: 7
        currsigs.addElement(injectorOn);
        active[16]=1;
        ends[16]=1;
        tdone[16]=1;
        break;
      
    }
  }

  public void thread4781(int [] tdone, int [] ends){
        S1913=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread4780(int [] tdone, int [] ends){
        S1910=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread4779(int [] tdone, int [] ends){
        S1907=1;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread4778(int [] tdone, int [] ends){
        S1904=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread4776(int [] tdone, int [] ends){
        S1889=1;
    valveRetract.setPresent();//sysj\fillerController.sysj line: 67, column: 6
    currsigs.addElement(valveRetract);
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread4775(int [] tdone, int [] ends){
        S1884=1;
    injectorOn.setPresent();//sysj\fillerController.sysj line: 65, column: 7
    currsigs.addElement(injectorOn);
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread4773(int [] tdone, int [] ends){
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

  public void thread4772(int [] tdone, int [] ends){
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

  public void thread4770(int [] tdone, int [] ends){
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

  public void thread4769(int [] tdone, int [] ends){
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

  public void thread4767(int [] tdone, int [] ends){
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

  public void thread4766(int [] tdone, int [] ends){
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

  public void thread4764(int [] tdone, int [] ends){
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

  public void thread4763(int [] tdone, int [] ends){
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

  public void thread4761(int [] tdone, int [] ends){
        S1764=1;
    inletOn.setPresent();//sysj\fillerController.sysj line: 59, column: 7
    currsigs.addElement(inletOn);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread4760(int [] tdone, int [] ends){
        S1759=1;
    fill4.setPresent();//sysj\fillerController.sysj line: 57, column: 8
    currsigs.addElement(fill4);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread4758(int [] tdone, int [] ends){
        S1742=1;
    inletOn.setPresent();//sysj\fillerController.sysj line: 51, column: 7
    currsigs.addElement(inletOn);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread4757(int [] tdone, int [] ends){
        S1737=1;
    fill3.setPresent();//sysj\fillerController.sysj line: 49, column: 8
    currsigs.addElement(fill3);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread4755(int [] tdone, int [] ends){
        S1720=1;
    inletOn.setPresent();//sysj\fillerController.sysj line: 43, column: 7
    currsigs.addElement(inletOn);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread4754(int [] tdone, int [] ends){
        S1715=1;
    fill2.setPresent();//sysj\fillerController.sysj line: 41, column: 8
    currsigs.addElement(fill2);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread4752(int [] tdone, int [] ends){
        S1698=1;
    inletOn.setPresent();//sysj\fillerController.sysj line: 35, column: 7
    currsigs.addElement(inletOn);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread4751(int [] tdone, int [] ends){
        S1693=1;
    fill1.setPresent();//sysj\fillerController.sysj line: 33, column: 8
    currsigs.addElement(fill1);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread4749(int [] tdone, int [] ends){
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

  public void thread4748(int [] tdone, int [] ends){
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

  public void thread4747(int [] tdone, int [] ends){
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

  public void thread4746(int [] tdone, int [] ends){
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

  public void thread4744(int [] tdone, int [] ends){
        S1658=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread4743(int [] tdone, int [] ends){
        S1655=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread4742(int [] tdone, int [] ends){
        S1652=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread4741(int [] tdone, int [] ends){
        S1649=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread4739(int [] tdone, int [] ends){
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

  public void thread4738(int [] tdone, int [] ends){
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

  public void thread4736(int [] tdone, int [] ends){
        S1658=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread4735(int [] tdone, int [] ends){
        S1655=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread4734(int [] tdone, int [] ends){
        S1652=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread4733(int [] tdone, int [] ends){
        S1649=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread4731(int [] tdone, int [] ends){
        S1634=1;
    valveRetract.setPresent();//sysj\fillerController.sysj line: 15, column: 6
    currsigs.addElement(valveRetract);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread4730(int [] tdone, int [] ends){
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
      switch(S4728){
        case 0 : 
          S4728=0;
          break RUN;
        
        case 1 : 
          S4728=2;
          S4728=2;
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
                thread4730(tdone,ends);
                thread4731(tdone,ends);
                int biggest4732 = 0;
                if(ends[2]>=biggest4732){
                  biggest4732=ends[2];
                }
                if(ends[3]>=biggest4732){
                  biggest4732=ends[3];
                }
                if(biggest4732 == 1){
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
                thread4733(tdone,ends);
                thread4734(tdone,ends);
                thread4735(tdone,ends);
                thread4736(tdone,ends);
                int biggest4737 = 0;
                if(ends[4]>=biggest4737){
                  biggest4737=ends[4];
                }
                if(ends[5]>=biggest4737){
                  biggest4737=ends[5];
                }
                if(ends[6]>=biggest4737){
                  biggest4737=ends[6];
                }
                if(ends[7]>=biggest4737){
                  biggest4737=ends[7];
                }
                if(biggest4737 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                thread4738(tdone,ends);
                thread4739(tdone,ends);
                int biggest4740 = 0;
                if(ends[2]>=biggest4740){
                  biggest4740=ends[2];
                }
                if(ends[3]>=biggest4740){
                  biggest4740=ends[3];
                }
                if(biggest4740 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest4740 == 0){
                  System.out.println("Select Liquid 1");//sysj\fillerController.sysj line: 17, column: 4
                  S1622=4;
                  thread4741(tdone,ends);
                  thread4742(tdone,ends);
                  thread4743(tdone,ends);
                  thread4744(tdone,ends);
                  int biggest4745 = 0;
                  if(ends[4]>=biggest4745){
                    biggest4745=ends[4];
                  }
                  if(ends[5]>=biggest4745){
                    biggest4745=ends[5];
                  }
                  if(ends[6]>=biggest4745){
                    biggest4745=ends[6];
                  }
                  if(ends[7]>=biggest4745){
                    biggest4745=ends[7];
                  }
                  if(biggest4745 == 1){
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
                thread4746(tdone,ends);
                thread4747(tdone,ends);
                thread4748(tdone,ends);
                thread4749(tdone,ends);
                int biggest4750 = 0;
                if(ends[4]>=biggest4750){
                  biggest4750=ends[4];
                }
                if(ends[5]>=biggest4750){
                  biggest4750=ends[5];
                }
                if(ends[6]>=biggest4750){
                  biggest4750=ends[6];
                }
                if(ends[7]>=biggest4750){
                  biggest4750=ends[7];
                }
                if(biggest4750 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest4750 == 0){
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
                  thread4751(tdone,ends);
                  thread4752(tdone,ends);
                  int biggest4753 = 0;
                  if(ends[8]>=biggest4753){
                    biggest4753=ends[8];
                  }
                  if(ends[9]>=biggest4753){
                    biggest4753=ends[9];
                  }
                  if(biggest4753 == 1){
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
                    thread4754(tdone,ends);
                    thread4755(tdone,ends);
                    int biggest4756 = 0;
                    if(ends[10]>=biggest4756){
                      biggest4756=ends[10];
                    }
                    if(ends[11]>=biggest4756){
                      biggest4756=ends[11];
                    }
                    if(biggest4756 == 1){
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
                      thread4757(tdone,ends);
                      thread4758(tdone,ends);
                      int biggest4759 = 0;
                      if(ends[12]>=biggest4759){
                        biggest4759=ends[12];
                      }
                      if(ends[13]>=biggest4759){
                        biggest4759=ends[13];
                      }
                      if(biggest4759 == 1){
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      S1777=1;
                      System.out.println("Filling with 4 to 25%\n");//sysj\fillerController.sysj line: 56, column: 6
                      thread4760(tdone,ends);
                      thread4761(tdone,ends);
                      int biggest4762 = 0;
                      if(ends[14]>=biggest4762){
                        biggest4762=ends[14];
                      }
                      if(ends[15]>=biggest4762){
                        biggest4762=ends[15];
                      }
                      if(biggest4762 == 1){
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
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    thread4763(tdone,ends);
                    thread4764(tdone,ends);
                    int biggest4765 = 0;
                    if(ends[8]>=biggest4765){
                      biggest4765=ends[8];
                    }
                    if(ends[9]>=biggest4765){
                      biggest4765=ends[9];
                    }
                    if(biggest4765 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    //FINXME code
                    if(biggest4765 == 0){
                      S1622=7;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                
                case 1 : 
                  switch(S1778){
                    case 0 : 
                      if(tick.getprestatus()){//sysj\fillerController.sysj line: 39, column: 11
                        S1622=7;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        thread4766(tdone,ends);
                        thread4767(tdone,ends);
                        int biggest4768 = 0;
                        if(ends[10]>=biggest4768){
                          biggest4768=ends[10];
                        }
                        if(ends[11]>=biggest4768){
                          biggest4768=ends[11];
                        }
                        if(biggest4768 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        //FINXME code
                        if(biggest4768 == 0){
                          S1622=7;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                    
                    case 1 : 
                      switch(S1777){
                        case 0 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 47, column: 11
                            S1622=7;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            thread4769(tdone,ends);
                            thread4770(tdone,ends);
                            int biggest4771 = 0;
                            if(ends[12]>=biggest4771){
                              biggest4771=ends[12];
                            }
                            if(ends[13]>=biggest4771){
                              biggest4771=ends[13];
                            }
                            if(biggest4771 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest4771 == 0){
                              S1622=7;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                        
                        case 1 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 55, column: 11
                            S1622=7;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            thread4772(tdone,ends);
                            thread4773(tdone,ends);
                            int biggest4774 = 0;
                            if(ends[14]>=biggest4774){
                              biggest4774=ends[14];
                            }
                            if(ends[15]>=biggest4774){
                              biggest4774=ends[15];
                            }
                            if(biggest4774 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest4774 == 0){
                              S1622=7;
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
            
            case 7 : 
              if(!tick.getprestatus()){//sysj\fillerController.sysj line: 63, column: 10
                S1622=8;
                thread4775(tdone,ends);
                thread4776(tdone,ends);
                int biggest4777 = 0;
                if(ends[16]>=biggest4777){
                  biggest4777=ends[16];
                }
                if(ends[17]>=biggest4777){
                  biggest4777=ends[17];
                }
                if(biggest4777 == 1){
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
            
            case 8 : 
              if(tick.getprestatus()){//sysj\fillerController.sysj line: 64, column: 10
                System.out.println("Select Liquid 2");//sysj\fillerController.sysj line: 69, column: 4
                S1622=9;
                thread4778(tdone,ends);
                thread4779(tdone,ends);
                thread4780(tdone,ends);
                thread4781(tdone,ends);
                int biggest4782 = 0;
                if(ends[18]>=biggest4782){
                  biggest4782=ends[18];
                }
                if(ends[19]>=biggest4782){
                  biggest4782=ends[19];
                }
                if(ends[20]>=biggest4782){
                  biggest4782=ends[20];
                }
                if(ends[21]>=biggest4782){
                  biggest4782=ends[21];
                }
                if(biggest4782 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                thread4783(tdone,ends);
                thread4784(tdone,ends);
                int biggest4785 = 0;
                if(ends[16]>=biggest4785){
                  biggest4785=ends[16];
                }
                if(ends[17]>=biggest4785){
                  biggest4785=ends[17];
                }
                if(biggest4785 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest4785 == 0){
                  System.out.println("Select Liquid 2");//sysj\fillerController.sysj line: 69, column: 4
                  S1622=9;
                  thread4786(tdone,ends);
                  thread4787(tdone,ends);
                  thread4788(tdone,ends);
                  thread4789(tdone,ends);
                  int biggest4790 = 0;
                  if(ends[18]>=biggest4790){
                    biggest4790=ends[18];
                  }
                  if(ends[19]>=biggest4790){
                    biggest4790=ends[19];
                  }
                  if(ends[20]>=biggest4790){
                    biggest4790=ends[20];
                  }
                  if(ends[21]>=biggest4790){
                    biggest4790=ends[21];
                  }
                  if(biggest4790 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
              }
            
            case 9 : 
              if(liquidType_1.getprestatus()){//sysj\fillerController.sysj line: 71, column: 10
                S1622=10;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                thread4791(tdone,ends);
                thread4792(tdone,ends);
                thread4793(tdone,ends);
                thread4794(tdone,ends);
                int biggest4795 = 0;
                if(ends[18]>=biggest4795){
                  biggest4795=ends[18];
                }
                if(ends[19]>=biggest4795){
                  biggest4795=ends[19];
                }
                if(ends[20]>=biggest4795){
                  biggest4795=ends[20];
                }
                if(ends[21]>=biggest4795){
                  biggest4795=ends[21];
                }
                if(biggest4795 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest4795 == 0){
                  S1622=10;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
            case 10 : 
              if(!tick.getprestatus()){//sysj\fillerController.sysj line: 81, column: 10
                S1622=11;
                if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 1){//sysj\fillerController.sysj line: 82, column: 7
                  S2034=0;
                  System.out.println("Filling with 1 to 50%\n");//sysj\fillerController.sysj line: 84, column: 6
                  thread4796(tdone,ends);
                  thread4797(tdone,ends);
                  int biggest4798 = 0;
                  if(ends[22]>=biggest4798){
                    biggest4798=ends[22];
                  }
                  if(ends[23]>=biggest4798){
                    biggest4798=ends[23];
                  }
                  if(biggest4798 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
                else {
                  S2034=1;
                  if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 2){//sysj\fillerController.sysj line: 90, column: 13
                    S2033=0;
                    System.out.println("Filling with 2 to 50%\n");//sysj\fillerController.sysj line: 92, column: 6
                    thread4799(tdone,ends);
                    thread4800(tdone,ends);
                    int biggest4801 = 0;
                    if(ends[24]>=biggest4801){
                      biggest4801=ends[24];
                    }
                    if(ends[25]>=biggest4801){
                      biggest4801=ends[25];
                    }
                    if(biggest4801 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    S2033=1;
                    if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 3){//sysj\fillerController.sysj line: 98, column: 13
                      S2032=0;
                      System.out.println("Filling with 3 to 50%\n");//sysj\fillerController.sysj line: 100, column: 6
                      thread4802(tdone,ends);
                      thread4803(tdone,ends);
                      int biggest4804 = 0;
                      if(ends[26]>=biggest4804){
                        biggest4804=ends[26];
                      }
                      if(ends[27]>=biggest4804){
                        biggest4804=ends[27];
                      }
                      if(biggest4804 == 1){
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      S2032=1;
                      System.out.println("Filling with 4 to 50%\n");//sysj\fillerController.sysj line: 108, column: 6
                      thread4805(tdone,ends);
                      thread4806(tdone,ends);
                      int biggest4807 = 0;
                      if(ends[28]>=biggest4807){
                        biggest4807=ends[28];
                      }
                      if(ends[29]>=biggest4807){
                        biggest4807=ends[29];
                      }
                      if(biggest4807 == 1){
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
            
            case 11 : 
              switch(S2034){
                case 0 : 
                  if(tick.getprestatus()){//sysj\fillerController.sysj line: 83, column: 11
                    S1622=12;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    thread4808(tdone,ends);
                    thread4809(tdone,ends);
                    int biggest4810 = 0;
                    if(ends[22]>=biggest4810){
                      biggest4810=ends[22];
                    }
                    if(ends[23]>=biggest4810){
                      biggest4810=ends[23];
                    }
                    if(biggest4810 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    //FINXME code
                    if(biggest4810 == 0){
                      S1622=12;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                
                case 1 : 
                  switch(S2033){
                    case 0 : 
                      if(tick.getprestatus()){//sysj\fillerController.sysj line: 91, column: 11
                        S1622=12;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        thread4811(tdone,ends);
                        thread4812(tdone,ends);
                        int biggest4813 = 0;
                        if(ends[24]>=biggest4813){
                          biggest4813=ends[24];
                        }
                        if(ends[25]>=biggest4813){
                          biggest4813=ends[25];
                        }
                        if(biggest4813 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        //FINXME code
                        if(biggest4813 == 0){
                          S1622=12;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                    
                    case 1 : 
                      switch(S2032){
                        case 0 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 99, column: 11
                            S1622=12;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            thread4814(tdone,ends);
                            thread4815(tdone,ends);
                            int biggest4816 = 0;
                            if(ends[26]>=biggest4816){
                              biggest4816=ends[26];
                            }
                            if(ends[27]>=biggest4816){
                              biggest4816=ends[27];
                            }
                            if(biggest4816 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest4816 == 0){
                              S1622=12;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                        
                        case 1 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 107, column: 11
                            S1622=12;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            thread4817(tdone,ends);
                            thread4818(tdone,ends);
                            int biggest4819 = 0;
                            if(ends[28]>=biggest4819){
                              biggest4819=ends[28];
                            }
                            if(ends[29]>=biggest4819){
                              biggest4819=ends[29];
                            }
                            if(biggest4819 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest4819 == 0){
                              S1622=12;
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
            
            case 12 : 
              if(!tick.getprestatus()){//sysj\fillerController.sysj line: 115, column: 10
                S1622=13;
                thread4820(tdone,ends);
                thread4821(tdone,ends);
                int biggest4822 = 0;
                if(ends[30]>=biggest4822){
                  biggest4822=ends[30];
                }
                if(ends[31]>=biggest4822){
                  biggest4822=ends[31];
                }
                if(biggest4822 == 1){
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
            
            case 13 : 
              if(tick.getprestatus()){//sysj\fillerController.sysj line: 116, column: 10
                System.out.println("Select Liquid 3");//sysj\fillerController.sysj line: 121, column: 4
                S1622=14;
                thread4823(tdone,ends);
                thread4824(tdone,ends);
                thread4825(tdone,ends);
                thread4826(tdone,ends);
                int biggest4827 = 0;
                if(ends[32]>=biggest4827){
                  biggest4827=ends[32];
                }
                if(ends[33]>=biggest4827){
                  biggest4827=ends[33];
                }
                if(ends[34]>=biggest4827){
                  biggest4827=ends[34];
                }
                if(ends[35]>=biggest4827){
                  biggest4827=ends[35];
                }
                if(biggest4827 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                thread4828(tdone,ends);
                thread4829(tdone,ends);
                int biggest4830 = 0;
                if(ends[30]>=biggest4830){
                  biggest4830=ends[30];
                }
                if(ends[31]>=biggest4830){
                  biggest4830=ends[31];
                }
                if(biggest4830 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest4830 == 0){
                  System.out.println("Select Liquid 3");//sysj\fillerController.sysj line: 121, column: 4
                  S1622=14;
                  thread4831(tdone,ends);
                  thread4832(tdone,ends);
                  thread4833(tdone,ends);
                  thread4834(tdone,ends);
                  int biggest4835 = 0;
                  if(ends[32]>=biggest4835){
                    biggest4835=ends[32];
                  }
                  if(ends[33]>=biggest4835){
                    biggest4835=ends[33];
                  }
                  if(ends[34]>=biggest4835){
                    biggest4835=ends[34];
                  }
                  if(ends[35]>=biggest4835){
                    biggest4835=ends[35];
                  }
                  if(biggest4835 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
              }
            
            case 14 : 
              if(liquidType_1.getprestatus()){//sysj\fillerController.sysj line: 123, column: 10
                S1622=15;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                thread4836(tdone,ends);
                thread4837(tdone,ends);
                thread4838(tdone,ends);
                thread4839(tdone,ends);
                int biggest4840 = 0;
                if(ends[32]>=biggest4840){
                  biggest4840=ends[32];
                }
                if(ends[33]>=biggest4840){
                  biggest4840=ends[33];
                }
                if(ends[34]>=biggest4840){
                  biggest4840=ends[34];
                }
                if(ends[35]>=biggest4840){
                  biggest4840=ends[35];
                }
                if(biggest4840 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest4840 == 0){
                  S1622=15;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
            case 15 : 
              if(!tick.getprestatus()){//sysj\fillerController.sysj line: 133, column: 10
                S1622=16;
                if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 1){//sysj\fillerController.sysj line: 134, column: 7
                  S2289=0;
                  System.out.println("Filling with 1 to 75%\n");//sysj\fillerController.sysj line: 136, column: 6
                  thread4841(tdone,ends);
                  thread4842(tdone,ends);
                  int biggest4843 = 0;
                  if(ends[36]>=biggest4843){
                    biggest4843=ends[36];
                  }
                  if(ends[37]>=biggest4843){
                    biggest4843=ends[37];
                  }
                  if(biggest4843 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
                else {
                  S2289=1;
                  if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 2){//sysj\fillerController.sysj line: 142, column: 13
                    S2288=0;
                    System.out.println("Filling with 2 to 75%\n");//sysj\fillerController.sysj line: 144, column: 6
                    thread4844(tdone,ends);
                    thread4845(tdone,ends);
                    int biggest4846 = 0;
                    if(ends[38]>=biggest4846){
                      biggest4846=ends[38];
                    }
                    if(ends[39]>=biggest4846){
                      biggest4846=ends[39];
                    }
                    if(biggest4846 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    S2288=1;
                    if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 3){//sysj\fillerController.sysj line: 150, column: 13
                      S2287=0;
                      System.out.println("Filling with 3 to 75%\n");//sysj\fillerController.sysj line: 152, column: 6
                      thread4847(tdone,ends);
                      thread4848(tdone,ends);
                      int biggest4849 = 0;
                      if(ends[40]>=biggest4849){
                        biggest4849=ends[40];
                      }
                      if(ends[41]>=biggest4849){
                        biggest4849=ends[41];
                      }
                      if(biggest4849 == 1){
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      S2287=1;
                      System.out.println("Filling with 4 to 75%\n");//sysj\fillerController.sysj line: 160, column: 6
                      thread4850(tdone,ends);
                      thread4851(tdone,ends);
                      int biggest4852 = 0;
                      if(ends[42]>=biggest4852){
                        biggest4852=ends[42];
                      }
                      if(ends[43]>=biggest4852){
                        biggest4852=ends[43];
                      }
                      if(biggest4852 == 1){
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
            
            case 16 : 
              switch(S2289){
                case 0 : 
                  if(tick.getprestatus()){//sysj\fillerController.sysj line: 135, column: 11
                    S1622=17;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    thread4853(tdone,ends);
                    thread4854(tdone,ends);
                    int biggest4855 = 0;
                    if(ends[36]>=biggest4855){
                      biggest4855=ends[36];
                    }
                    if(ends[37]>=biggest4855){
                      biggest4855=ends[37];
                    }
                    if(biggest4855 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    //FINXME code
                    if(biggest4855 == 0){
                      S1622=17;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                
                case 1 : 
                  switch(S2288){
                    case 0 : 
                      if(tick.getprestatus()){//sysj\fillerController.sysj line: 143, column: 11
                        S1622=17;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        thread4856(tdone,ends);
                        thread4857(tdone,ends);
                        int biggest4858 = 0;
                        if(ends[38]>=biggest4858){
                          biggest4858=ends[38];
                        }
                        if(ends[39]>=biggest4858){
                          biggest4858=ends[39];
                        }
                        if(biggest4858 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        //FINXME code
                        if(biggest4858 == 0){
                          S1622=17;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                    
                    case 1 : 
                      switch(S2287){
                        case 0 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 151, column: 11
                            S1622=17;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            thread4859(tdone,ends);
                            thread4860(tdone,ends);
                            int biggest4861 = 0;
                            if(ends[40]>=biggest4861){
                              biggest4861=ends[40];
                            }
                            if(ends[41]>=biggest4861){
                              biggest4861=ends[41];
                            }
                            if(biggest4861 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest4861 == 0){
                              S1622=17;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                        
                        case 1 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 159, column: 11
                            S1622=17;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            thread4862(tdone,ends);
                            thread4863(tdone,ends);
                            int biggest4864 = 0;
                            if(ends[42]>=biggest4864){
                              biggest4864=ends[42];
                            }
                            if(ends[43]>=biggest4864){
                              biggest4864=ends[43];
                            }
                            if(biggest4864 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest4864 == 0){
                              S1622=17;
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
            
            case 17 : 
              if(!tick.getprestatus()){//sysj\fillerController.sysj line: 167, column: 10
                S1622=18;
                thread4865(tdone,ends);
                thread4866(tdone,ends);
                int biggest4867 = 0;
                if(ends[44]>=biggest4867){
                  biggest4867=ends[44];
                }
                if(ends[45]>=biggest4867){
                  biggest4867=ends[45];
                }
                if(biggest4867 == 1){
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
            
            case 18 : 
              if(tick.getprestatus()){//sysj\fillerController.sysj line: 168, column: 10
                System.out.println("Select Liquid 4");//sysj\fillerController.sysj line: 174, column: 4
                S1622=19;
                thread4868(tdone,ends);
                thread4869(tdone,ends);
                thread4870(tdone,ends);
                thread4871(tdone,ends);
                int biggest4872 = 0;
                if(ends[46]>=biggest4872){
                  biggest4872=ends[46];
                }
                if(ends[47]>=biggest4872){
                  biggest4872=ends[47];
                }
                if(ends[48]>=biggest4872){
                  biggest4872=ends[48];
                }
                if(ends[49]>=biggest4872){
                  biggest4872=ends[49];
                }
                if(biggest4872 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                thread4873(tdone,ends);
                thread4874(tdone,ends);
                int biggest4875 = 0;
                if(ends[44]>=biggest4875){
                  biggest4875=ends[44];
                }
                if(ends[45]>=biggest4875){
                  biggest4875=ends[45];
                }
                if(biggest4875 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest4875 == 0){
                  System.out.println("Select Liquid 4");//sysj\fillerController.sysj line: 174, column: 4
                  S1622=19;
                  thread4876(tdone,ends);
                  thread4877(tdone,ends);
                  thread4878(tdone,ends);
                  thread4879(tdone,ends);
                  int biggest4880 = 0;
                  if(ends[46]>=biggest4880){
                    biggest4880=ends[46];
                  }
                  if(ends[47]>=biggest4880){
                    biggest4880=ends[47];
                  }
                  if(ends[48]>=biggest4880){
                    biggest4880=ends[48];
                  }
                  if(ends[49]>=biggest4880){
                    biggest4880=ends[49];
                  }
                  if(biggest4880 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
              }
            
            case 19 : 
              if(liquidType_1.getprestatus()){//sysj\fillerController.sysj line: 176, column: 10
                S1622=20;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                thread4881(tdone,ends);
                thread4882(tdone,ends);
                thread4883(tdone,ends);
                thread4884(tdone,ends);
                int biggest4885 = 0;
                if(ends[46]>=biggest4885){
                  biggest4885=ends[46];
                }
                if(ends[47]>=biggest4885){
                  biggest4885=ends[47];
                }
                if(ends[48]>=biggest4885){
                  biggest4885=ends[48];
                }
                if(ends[49]>=biggest4885){
                  biggest4885=ends[49];
                }
                if(biggest4885 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest4885 == 0){
                  S1622=20;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
            case 20 : 
              if(!tick.getprestatus()){//sysj\fillerController.sysj line: 186, column: 10
                S1622=21;
                if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 1){//sysj\fillerController.sysj line: 187, column: 7
                  S2544=0;
                  System.out.println("Filling with 1 to 100%\n");//sysj\fillerController.sysj line: 189, column: 6
                  thread4886(tdone,ends);
                  thread4887(tdone,ends);
                  int biggest4888 = 0;
                  if(ends[50]>=biggest4888){
                    biggest4888=ends[50];
                  }
                  if(ends[51]>=biggest4888){
                    biggest4888=ends[51];
                  }
                  if(biggest4888 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
                else {
                  S2544=1;
                  if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 2){//sysj\fillerController.sysj line: 195, column: 13
                    S2543=0;
                    System.out.println("Filling with 2 to 100%\n");//sysj\fillerController.sysj line: 197, column: 6
                    thread4889(tdone,ends);
                    thread4890(tdone,ends);
                    int biggest4891 = 0;
                    if(ends[52]>=biggest4891){
                      biggest4891=ends[52];
                    }
                    if(ends[53]>=biggest4891){
                      biggest4891=ends[53];
                    }
                    if(biggest4891 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    S2543=1;
                    if((liquidType_1.getpreval() == null ? 0 : ((Integer)liquidType_1.getpreval()).intValue()) == 3){//sysj\fillerController.sysj line: 203, column: 13
                      S2542=0;
                      System.out.println("Filling with 3 to 100%\n");//sysj\fillerController.sysj line: 205, column: 6
                      thread4892(tdone,ends);
                      thread4893(tdone,ends);
                      int biggest4894 = 0;
                      if(ends[54]>=biggest4894){
                        biggest4894=ends[54];
                      }
                      if(ends[55]>=biggest4894){
                        biggest4894=ends[55];
                      }
                      if(biggest4894 == 1){
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      S2542=1;
                      System.out.println("Filling with 4 to 100%\n");//sysj\fillerController.sysj line: 213, column: 6
                      thread4895(tdone,ends);
                      thread4896(tdone,ends);
                      int biggest4897 = 0;
                      if(ends[56]>=biggest4897){
                        biggest4897=ends[56];
                      }
                      if(ends[57]>=biggest4897){
                        biggest4897=ends[57];
                      }
                      if(biggest4897 == 1){
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
            
            case 21 : 
              switch(S2544){
                case 0 : 
                  if(tick.getprestatus()){//sysj\fillerController.sysj line: 188, column: 11
                    S1622=22;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    thread4898(tdone,ends);
                    thread4899(tdone,ends);
                    int biggest4900 = 0;
                    if(ends[50]>=biggest4900){
                      biggest4900=ends[50];
                    }
                    if(ends[51]>=biggest4900){
                      biggest4900=ends[51];
                    }
                    if(biggest4900 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    //FINXME code
                    if(biggest4900 == 0){
                      S1622=22;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                
                case 1 : 
                  switch(S2543){
                    case 0 : 
                      if(tick.getprestatus()){//sysj\fillerController.sysj line: 196, column: 11
                        S1622=22;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        thread4901(tdone,ends);
                        thread4902(tdone,ends);
                        int biggest4903 = 0;
                        if(ends[52]>=biggest4903){
                          biggest4903=ends[52];
                        }
                        if(ends[53]>=biggest4903){
                          biggest4903=ends[53];
                        }
                        if(biggest4903 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        //FINXME code
                        if(biggest4903 == 0){
                          S1622=22;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                    
                    case 1 : 
                      switch(S2542){
                        case 0 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 204, column: 11
                            S1622=22;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            thread4904(tdone,ends);
                            thread4905(tdone,ends);
                            int biggest4906 = 0;
                            if(ends[54]>=biggest4906){
                              biggest4906=ends[54];
                            }
                            if(ends[55]>=biggest4906){
                              biggest4906=ends[55];
                            }
                            if(biggest4906 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest4906 == 0){
                              S1622=22;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                        
                        case 1 : 
                          if(tick.getprestatus()){//sysj\fillerController.sysj line: 212, column: 11
                            S1622=22;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            thread4907(tdone,ends);
                            thread4908(tdone,ends);
                            int biggest4909 = 0;
                            if(ends[56]>=biggest4909){
                              biggest4909=ends[56];
                            }
                            if(ends[57]>=biggest4909){
                              biggest4909=ends[57];
                            }
                            if(biggest4909 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest4909 == 0){
                              S1622=22;
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
            
            case 22 : 
              if(!tick.getprestatus()){//sysj\fillerController.sysj line: 220, column: 10
                S1622=23;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 23 : 
              if(tick.getprestatus()){//sysj\fillerController.sysj line: 221, column: 10
                S1622=24;
                fillerDone.setPresent();//sysj\fillerController.sysj line: 223, column: 5
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
            
            case 24 : 
              if(!fillerEnable.getprestatus()){//sysj\fillerController.sysj line: 222, column: 10
                S1622=0;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                fillerDone.setPresent();//sysj\fillerController.sysj line: 223, column: 5
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
