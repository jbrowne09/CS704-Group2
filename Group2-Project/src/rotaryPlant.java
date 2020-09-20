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
  public Signal rotate = new Signal("rotate", Signal.INPUT);
  public Signal aligned = new Signal("aligned", Signal.OUTPUT);
  public Signal bottlePos5 = new Signal("bottlePos5", Signal.OUTPUT);
  public Signal capPos1 = new Signal("capPos1", Signal.OUTPUT);
  public Signal alignedS = new Signal("alignedS", Signal.OUTPUT);
  public Signal bottlePos5S = new Signal("bottlePos5S", Signal.OUTPUT);
  public Signal bottlePos2S = new Signal("bottlePos2S", Signal.OUTPUT);
  public Signal capPos1S = new Signal("capPos1S", Signal.OUTPUT);
  public Signal rotateS = new Signal("rotateS", Signal.OUTPUT);
  public Signal bottlePos1S = new Signal("bottlePos1S", Signal.OUTPUT);
  private int S2526 = 1;
  private int S2475 = 1;
  private int S2498 = 1;
  private int S2482 = 1;
  private int S2481 = 1;
  private int S2524 = 1;
  private int S2506 = 1;
  private int S2500 = 1;
  private int S2514 = 1;
  private int S2522 = 1;
  
  private int[] ends = new int[8];
  private int[] tdone = new int[8];
  
  public void thread2541(int [] tdone, int [] ends){
        switch(S2522){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(capPos1.getprestatus()){//sysj\rotaryPlant.sysj line: 36, column: 25
          capPos1S.setPresent();//sysj\rotaryPlant.sysj line: 36, column: 35
          currsigs.addElement(capPos1S);
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
  }

  public void thread2540(int [] tdone, int [] ends){
        switch(S2514){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(bottlePos5.getprestatus()){//sysj\rotaryPlant.sysj line: 34, column: 25
          bottlePos5S.setPresent();//sysj\rotaryPlant.sysj line: 34, column: 38
          currsigs.addElement(bottlePos5S);
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
  }

  public void thread2539(int [] tdone, int [] ends){
        switch(S2506){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S2500){
          case 0 : 
            S2500=0;
            if(aligned.getprestatus()){//sysj\rotaryPlant.sysj line: 32, column: 25
              alignedS.setPresent();//sysj\rotaryPlant.sysj line: 32, column: 35
              currsigs.addElement(alignedS);
              S2500=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S2500=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S2500=1;
            S2500=0;
            if(aligned.getprestatus()){//sysj\rotaryPlant.sysj line: 32, column: 25
              alignedS.setPresent();//sysj\rotaryPlant.sysj line: 32, column: 35
              currsigs.addElement(alignedS);
              S2500=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S2500=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2538(int [] tdone, int [] ends){
        switch(S2524){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        thread2539(tdone,ends);
        thread2540(tdone,ends);
        thread2541(tdone,ends);
        int biggest2542 = 0;
        if(ends[5]>=biggest2542){
          biggest2542=ends[5];
        }
        if(ends[6]>=biggest2542){
          biggest2542=ends[6];
        }
        if(ends[7]>=biggest2542){
          biggest2542=ends[7];
        }
        if(biggest2542 == 1){
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        //FINXME code
        if(biggest2542 == 0){
          S2524=0;
          active[4]=0;
          ends[4]=0;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread2537(int [] tdone, int [] ends){
        switch(S2498){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S2482){
          case 0 : 
            switch(S2481){
              case 0 : 
                if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 21, column: 11
                  bottlePos2S.setPresent();//sysj\rotaryPlant.sysj line: 22, column: 5
                  currsigs.addElement(bottlePos2S);
                  S2482=1;
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
                bottlePos1S.setPresent();//sysj\rotaryPlant.sysj line: 25, column: 5
                currsigs.addElement(bottlePos1S);
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
                break;
              
            }
            break;
          
          case 1 : 
            S2482=1;
            S2482=0;
            if(bottlePos1S.getprestatus()){//sysj\rotaryPlant.sysj line: 20, column: 12
              S2481=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S2481=1;
              bottlePos1S.setPresent();//sysj\rotaryPlant.sysj line: 25, column: 5
              currsigs.addElement(bottlePos1S);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2536(int [] tdone, int [] ends){
        switch(S2475){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 11, column: 10
          rotateS.setPresent();//sysj\rotaryPlant.sysj line: 12, column: 4
          currsigs.addElement(rotateS);
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
      
    }
  }

  public void thread2533(int [] tdone, int [] ends){
        S2522=1;
    if(capPos1.getprestatus()){//sysj\rotaryPlant.sysj line: 36, column: 25
      capPos1S.setPresent();//sysj\rotaryPlant.sysj line: 36, column: 35
      currsigs.addElement(capPos1S);
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread2532(int [] tdone, int [] ends){
        S2514=1;
    if(bottlePos5.getprestatus()){//sysj\rotaryPlant.sysj line: 34, column: 25
      bottlePos5S.setPresent();//sysj\rotaryPlant.sysj line: 34, column: 38
      currsigs.addElement(bottlePos5S);
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread2531(int [] tdone, int [] ends){
        S2506=1;
    S2500=0;
    if(aligned.getprestatus()){//sysj\rotaryPlant.sysj line: 32, column: 25
      alignedS.setPresent();//sysj\rotaryPlant.sysj line: 32, column: 35
      currsigs.addElement(alignedS);
      S2500=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S2500=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread2530(int [] tdone, int [] ends){
        S2524=1;
    thread2531(tdone,ends);
    thread2532(tdone,ends);
    thread2533(tdone,ends);
    int biggest2534 = 0;
    if(ends[5]>=biggest2534){
      biggest2534=ends[5];
    }
    if(ends[6]>=biggest2534){
      biggest2534=ends[6];
    }
    if(ends[7]>=biggest2534){
      biggest2534=ends[7];
    }
    if(biggest2534 == 1){
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread2529(int [] tdone, int [] ends){
        S2498=1;
    S2482=0;
    if(bottlePos1S.getprestatus()){//sysj\rotaryPlant.sysj line: 20, column: 12
      S2481=0;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S2481=1;
      bottlePos1S.setPresent();//sysj\rotaryPlant.sysj line: 25, column: 5
      currsigs.addElement(bottlePos1S);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread2528(int [] tdone, int [] ends){
        S2475=1;
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
      switch(S2526){
        case 0 : 
          S2526=0;
          break RUN;
        
        case 1 : 
          S2526=2;
          S2526=2;
          thread2528(tdone,ends);
          thread2529(tdone,ends);
          thread2530(tdone,ends);
          int biggest2535 = 0;
          if(ends[2]>=biggest2535){
            biggest2535=ends[2];
          }
          if(ends[3]>=biggest2535){
            biggest2535=ends[3];
          }
          if(ends[4]>=biggest2535){
            biggest2535=ends[4];
          }
          if(biggest2535 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread2536(tdone,ends);
          thread2537(tdone,ends);
          thread2538(tdone,ends);
          int biggest2543 = 0;
          if(ends[2]>=biggest2543){
            biggest2543=ends[2];
          }
          if(ends[3]>=biggest2543){
            biggest2543=ends[3];
          }
          if(ends[4]>=biggest2543){
            biggest2543=ends[4];
          }
          if(biggest2543 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2543 == 0){
            S2526=0;
            active[1]=0;
            ends[1]=0;
            S2526=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
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
          rotate.gethook();
          df = true;
        }
        runClockDomain();
      }
      rotate.setpreclear();
      aligned.setpreclear();
      bottlePos5.setpreclear();
      capPos1.setpreclear();
      alignedS.setpreclear();
      bottlePos5S.setpreclear();
      bottlePos2S.setpreclear();
      capPos1S.setpreclear();
      rotateS.setpreclear();
      bottlePos1S.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = rotate.getStatus() ? rotate.setprepresent() : rotate.setpreclear();
      rotate.setpreval(rotate.getValue());
      rotate.setClear();
      aligned.sethook();
      aligned.setClear();
      bottlePos5.sethook();
      bottlePos5.setClear();
      capPos1.sethook();
      capPos1.setClear();
      alignedS.sethook();
      alignedS.setClear();
      bottlePos5S.sethook();
      bottlePos5S.setClear();
      bottlePos2S.sethook();
      bottlePos2S.setClear();
      capPos1S.sethook();
      capPos1S.setClear();
      rotateS.sethook();
      rotateS.setClear();
      bottlePos1S.sethook();
      bottlePos1S.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        rotate.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
