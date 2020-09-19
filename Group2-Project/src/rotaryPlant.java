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
  private long __start_thread_3;//sysj\rotaryPlant.sysj line: 21, column: 3
  private int S2289 = 1;
  private int S2109 = 1;
  private int S2087 = 1;
  private int S2261 = 1;
  private int S2139 = 1;
  private int S2112 = 1;
  private int S2287 = 1;
  private int S2269 = 1;
  private int S2277 = 1;
  private int S2285 = 1;
  
  private int[] ends = new int[8];
  private int[] tdone = new int[8];
  
  public void thread2304(int [] tdone, int [] ends){
        switch(S2285){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(capPos1.getprestatus()){//sysj\rotaryPlant.sysj line: 40, column: 25
          capPos1S.setPresent();//sysj\rotaryPlant.sysj line: 40, column: 35
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

  public void thread2303(int [] tdone, int [] ends){
        switch(S2277){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(bottlePos5.getprestatus()){//sysj\rotaryPlant.sysj line: 38, column: 25
          bottlePos5S.setPresent();//sysj\rotaryPlant.sysj line: 38, column: 38
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

  public void thread2302(int [] tdone, int [] ends){
        switch(S2269){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(aligned.getprestatus()){//sysj\rotaryPlant.sysj line: 36, column: 25
          alignedS.setPresent();//sysj\rotaryPlant.sysj line: 36, column: 35
          currsigs.addElement(alignedS);
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

  public void thread2301(int [] tdone, int [] ends){
        switch(S2287){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        thread2302(tdone,ends);
        thread2303(tdone,ends);
        thread2304(tdone,ends);
        int biggest2305 = 0;
        if(ends[5]>=biggest2305){
          biggest2305=ends[5];
        }
        if(ends[6]>=biggest2305){
          biggest2305=ends[6];
        }
        if(ends[7]>=biggest2305){
          biggest2305=ends[7];
        }
        if(biggest2305 == 1){
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        //FINXME code
        if(biggest2305 == 0){
          S2287=0;
          active[4]=0;
          ends[4]=0;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread2300(int [] tdone, int [] ends){
        switch(S2261){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S2139){
          case 0 : 
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 22, column: 10
              S2139=1;
              __start_thread_3 = com.systemj.Timer.getMs();//sysj\rotaryPlant.sysj line: 21, column: 3
              S2112=0;
              if(com.systemj.Timer.getMs() - __start_thread_3 >= 500){//sysj\rotaryPlant.sysj line: 21, column: 3
                ends[3]=2;
                ;//sysj\rotaryPlant.sysj line: 21, column: 3
                aligned.setPresent();//sysj\rotaryPlant.sysj line: 31, column: 4
                currsigs.addElement(aligned);
                S2139=0;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                S2112=1;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            switch(S2112){
              case 0 : 
                S2112=0;
                if(com.systemj.Timer.getMs() - __start_thread_3 >= 500){//sysj\rotaryPlant.sysj line: 21, column: 3
                  ends[3]=2;
                  ;//sysj\rotaryPlant.sysj line: 21, column: 3
                  aligned.setPresent();//sysj\rotaryPlant.sysj line: 31, column: 4
                  currsigs.addElement(aligned);
                  S2139=0;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S2112=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                break;
              
              case 1 : 
                S2112=1;
                S2112=0;
                if(com.systemj.Timer.getMs() - __start_thread_3 >= 500){//sysj\rotaryPlant.sysj line: 21, column: 3
                  ends[3]=2;
                  ;//sysj\rotaryPlant.sysj line: 21, column: 3
                  aligned.setPresent();//sysj\rotaryPlant.sysj line: 31, column: 4
                  currsigs.addElement(aligned);
                  S2139=0;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S2112=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2299(int [] tdone, int [] ends){
        switch(S2109){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S2087){
          case 0 : 
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 13, column: 10
              S2087=1;
              rotateS.setPresent();//sysj\rotaryPlant.sysj line: 15, column: 5
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
          
          case 1 : 
            if(!rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 14, column: 11
              S2087=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              rotateS.setPresent();//sysj\rotaryPlant.sysj line: 15, column: 5
              currsigs.addElement(rotateS);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2296(int [] tdone, int [] ends){
        S2285=1;
    if(capPos1.getprestatus()){//sysj\rotaryPlant.sysj line: 40, column: 25
      capPos1S.setPresent();//sysj\rotaryPlant.sysj line: 40, column: 35
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

  public void thread2295(int [] tdone, int [] ends){
        S2277=1;
    if(bottlePos5.getprestatus()){//sysj\rotaryPlant.sysj line: 38, column: 25
      bottlePos5S.setPresent();//sysj\rotaryPlant.sysj line: 38, column: 38
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

  public void thread2294(int [] tdone, int [] ends){
        S2269=1;
    if(aligned.getprestatus()){//sysj\rotaryPlant.sysj line: 36, column: 25
      alignedS.setPresent();//sysj\rotaryPlant.sysj line: 36, column: 35
      currsigs.addElement(alignedS);
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

  public void thread2293(int [] tdone, int [] ends){
        S2287=1;
    thread2294(tdone,ends);
    thread2295(tdone,ends);
    thread2296(tdone,ends);
    int biggest2297 = 0;
    if(ends[5]>=biggest2297){
      biggest2297=ends[5];
    }
    if(ends[6]>=biggest2297){
      biggest2297=ends[6];
    }
    if(ends[7]>=biggest2297){
      biggest2297=ends[7];
    }
    if(biggest2297 == 1){
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread2292(int [] tdone, int [] ends){
        S2261=1;
    S2139=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread2291(int [] tdone, int [] ends){
        S2109=1;
    S2087=0;
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
      switch(S2289){
        case 0 : 
          S2289=0;
          break RUN;
        
        case 1 : 
          S2289=2;
          S2289=2;
          thread2291(tdone,ends);
          thread2292(tdone,ends);
          thread2293(tdone,ends);
          int biggest2298 = 0;
          if(ends[2]>=biggest2298){
            biggest2298=ends[2];
          }
          if(ends[3]>=biggest2298){
            biggest2298=ends[3];
          }
          if(ends[4]>=biggest2298){
            biggest2298=ends[4];
          }
          if(biggest2298 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread2299(tdone,ends);
          thread2300(tdone,ends);
          thread2301(tdone,ends);
          int biggest2306 = 0;
          if(ends[2]>=biggest2306){
            biggest2306=ends[2];
          }
          if(ends[3]>=biggest2306){
            biggest2306=ends[3];
          }
          if(ends[4]>=biggest2306){
            biggest2306=ends[4];
          }
          if(biggest2306 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2306 == 0){
            S2289=0;
            active[1]=0;
            ends[1]=0;
            S2289=0;
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
