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
  public Signal capPos1S = new Signal("capPos1S", Signal.OUTPUT);
  public Signal rotateS = new Signal("rotateS", Signal.OUTPUT);
  private int S2527 = 1;
  private int S2491 = 1;
  private int S2525 = 1;
  private int S2499 = 1;
  private int S2493 = 1;
  private int S2507 = 1;
  private int S2515 = 1;
  private int S2523 = 1;
  
  private int[] ends = new int[8];
  private int[] tdone = new int[8];
  
  public void thread2542(int [] tdone, int [] ends){
        switch(S2523){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 26, column: 25
          rotateS.setPresent();//sysj\rotaryPlant.sysj line: 26, column: 34
          currsigs.addElement(rotateS);
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

  public void thread2541(int [] tdone, int [] ends){
        switch(S2515){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(capPos1.getprestatus()){//sysj\rotaryPlant.sysj line: 24, column: 25
          capPos1S.setPresent();//sysj\rotaryPlant.sysj line: 24, column: 35
          currsigs.addElement(capPos1S);
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

  public void thread2540(int [] tdone, int [] ends){
        switch(S2507){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(bottlePos5.getprestatus()){//sysj\rotaryPlant.sysj line: 22, column: 25
          bottlePos5S.setPresent();//sysj\rotaryPlant.sysj line: 22, column: 38
          currsigs.addElement(bottlePos5S);
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
      
    }
  }

  public void thread2539(int [] tdone, int [] ends){
        switch(S2499){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S2493){
          case 0 : 
            S2493=0;
            if(aligned.getprestatus()){//sysj\rotaryPlant.sysj line: 20, column: 25
              alignedS.setPresent();//sysj\rotaryPlant.sysj line: 20, column: 35
              currsigs.addElement(alignedS);
              S2493=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S2493=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S2493=1;
            S2493=0;
            if(aligned.getprestatus()){//sysj\rotaryPlant.sysj line: 20, column: 25
              alignedS.setPresent();//sysj\rotaryPlant.sysj line: 20, column: 35
              currsigs.addElement(alignedS);
              S2493=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S2493=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2538(int [] tdone, int [] ends){
        switch(S2525){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread2539(tdone,ends);
        thread2540(tdone,ends);
        thread2541(tdone,ends);
        thread2542(tdone,ends);
        int biggest2543 = 0;
        if(ends[4]>=biggest2543){
          biggest2543=ends[4];
        }
        if(ends[5]>=biggest2543){
          biggest2543=ends[5];
        }
        if(ends[6]>=biggest2543){
          biggest2543=ends[6];
        }
        if(ends[7]>=biggest2543){
          biggest2543=ends[7];
        }
        if(biggest2543 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest2543 == 0){
          S2525=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread2537(int [] tdone, int [] ends){
        switch(S2491){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 11, column: 10
          System.out.print("rotate?");//sysj\rotaryPlant.sysj line: 14, column: 5
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

  public void thread2534(int [] tdone, int [] ends){
        S2523=1;
    if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 26, column: 25
      rotateS.setPresent();//sysj\rotaryPlant.sysj line: 26, column: 34
      currsigs.addElement(rotateS);
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

  public void thread2533(int [] tdone, int [] ends){
        S2515=1;
    if(capPos1.getprestatus()){//sysj\rotaryPlant.sysj line: 24, column: 25
      capPos1S.setPresent();//sysj\rotaryPlant.sysj line: 24, column: 35
      currsigs.addElement(capPos1S);
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

  public void thread2532(int [] tdone, int [] ends){
        S2507=1;
    if(bottlePos5.getprestatus()){//sysj\rotaryPlant.sysj line: 22, column: 25
      bottlePos5S.setPresent();//sysj\rotaryPlant.sysj line: 22, column: 38
      currsigs.addElement(bottlePos5S);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread2531(int [] tdone, int [] ends){
        S2499=1;
    S2493=0;
    if(aligned.getprestatus()){//sysj\rotaryPlant.sysj line: 20, column: 25
      alignedS.setPresent();//sysj\rotaryPlant.sysj line: 20, column: 35
      currsigs.addElement(alignedS);
      S2493=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S2493=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread2530(int [] tdone, int [] ends){
        S2525=1;
    thread2531(tdone,ends);
    thread2532(tdone,ends);
    thread2533(tdone,ends);
    thread2534(tdone,ends);
    int biggest2535 = 0;
    if(ends[4]>=biggest2535){
      biggest2535=ends[4];
    }
    if(ends[5]>=biggest2535){
      biggest2535=ends[5];
    }
    if(ends[6]>=biggest2535){
      biggest2535=ends[6];
    }
    if(ends[7]>=biggest2535){
      biggest2535=ends[7];
    }
    if(biggest2535 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread2529(int [] tdone, int [] ends){
        S2491=1;
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
      switch(S2527){
        case 0 : 
          S2527=0;
          break RUN;
        
        case 1 : 
          S2527=2;
          S2527=2;
          thread2529(tdone,ends);
          thread2530(tdone,ends);
          int biggest2536 = 0;
          if(ends[2]>=biggest2536){
            biggest2536=ends[2];
          }
          if(ends[3]>=biggest2536){
            biggest2536=ends[3];
          }
          if(biggest2536 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread2537(tdone,ends);
          thread2538(tdone,ends);
          int biggest2544 = 0;
          if(ends[2]>=biggest2544){
            biggest2544=ends[2];
          }
          if(ends[3]>=biggest2544){
            biggest2544=ends[3];
          }
          if(biggest2544 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2544 == 0){
            S2527=0;
            active[1]=0;
            ends[1]=0;
            S2527=0;
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
      capPos1S.setpreclear();
      rotateS.setpreclear();
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
      capPos1S.sethook();
      capPos1S.setClear();
      rotateS.sethook();
      rotateS.setClear();
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
