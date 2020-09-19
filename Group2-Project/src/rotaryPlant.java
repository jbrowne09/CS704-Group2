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
  private int S2283 = 1;
  private int S2103 = 1;
  private int S2081 = 1;
  private int S2255 = 1;
  private int S2133 = 1;
  private int S2106 = 1;
  private int S2281 = 1;
  private int S2263 = 1;
  private int S2271 = 1;
  private int S2279 = 1;
  
  private int[] ends = new int[8];
  private int[] tdone = new int[8];
  
  public void thread2298(int [] tdone, int [] ends){
        switch(S2279){
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

  public void thread2297(int [] tdone, int [] ends){
        switch(S2271){
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

  public void thread2296(int [] tdone, int [] ends){
        switch(S2263){
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

  public void thread2295(int [] tdone, int [] ends){
        switch(S2281){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        thread2296(tdone,ends);
        thread2297(tdone,ends);
        thread2298(tdone,ends);
        int biggest2299 = 0;
        if(ends[5]>=biggest2299){
          biggest2299=ends[5];
        }
        if(ends[6]>=biggest2299){
          biggest2299=ends[6];
        }
        if(ends[7]>=biggest2299){
          biggest2299=ends[7];
        }
        if(biggest2299 == 1){
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        //FINXME code
        if(biggest2299 == 0){
          S2281=0;
          active[4]=0;
          ends[4]=0;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread2294(int [] tdone, int [] ends){
        switch(S2255){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S2133){
          case 0 : 
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 22, column: 10
              S2133=1;
              __start_thread_3 = com.systemj.Timer.getMs();//sysj\rotaryPlant.sysj line: 21, column: 3
              S2106=0;
              if(com.systemj.Timer.getMs() - __start_thread_3 >= 500){//sysj\rotaryPlant.sysj line: 21, column: 3
                ends[3]=2;
                ;//sysj\rotaryPlant.sysj line: 21, column: 3
                aligned.setPresent();//sysj\rotaryPlant.sysj line: 31, column: 4
                currsigs.addElement(aligned);
                S2133=0;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                S2106=1;
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
            switch(S2106){
              case 0 : 
                S2106=0;
                if(com.systemj.Timer.getMs() - __start_thread_3 >= 500){//sysj\rotaryPlant.sysj line: 21, column: 3
                  ends[3]=2;
                  ;//sysj\rotaryPlant.sysj line: 21, column: 3
                  aligned.setPresent();//sysj\rotaryPlant.sysj line: 31, column: 4
                  currsigs.addElement(aligned);
                  S2133=0;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S2106=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                break;
              
              case 1 : 
                S2106=1;
                S2106=0;
                if(com.systemj.Timer.getMs() - __start_thread_3 >= 500){//sysj\rotaryPlant.sysj line: 21, column: 3
                  ends[3]=2;
                  ;//sysj\rotaryPlant.sysj line: 21, column: 3
                  aligned.setPresent();//sysj\rotaryPlant.sysj line: 31, column: 4
                  currsigs.addElement(aligned);
                  S2133=0;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S2106=1;
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

  public void thread2293(int [] tdone, int [] ends){
        switch(S2103){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S2081){
          case 0 : 
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 13, column: 10
              S2081=1;
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
              S2081=0;
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

  public void thread2290(int [] tdone, int [] ends){
        S2279=1;
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

  public void thread2289(int [] tdone, int [] ends){
        S2271=1;
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

  public void thread2288(int [] tdone, int [] ends){
        S2263=1;
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

  public void thread2287(int [] tdone, int [] ends){
        S2281=1;
    thread2288(tdone,ends);
    thread2289(tdone,ends);
    thread2290(tdone,ends);
    int biggest2291 = 0;
    if(ends[5]>=biggest2291){
      biggest2291=ends[5];
    }
    if(ends[6]>=biggest2291){
      biggest2291=ends[6];
    }
    if(ends[7]>=biggest2291){
      biggest2291=ends[7];
    }
    if(biggest2291 == 1){
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread2286(int [] tdone, int [] ends){
        S2255=1;
    S2133=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread2285(int [] tdone, int [] ends){
        S2103=1;
    S2081=0;
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
      switch(S2283){
        case 0 : 
          S2283=0;
          break RUN;
        
        case 1 : 
          S2283=2;
          S2283=2;
          thread2285(tdone,ends);
          thread2286(tdone,ends);
          thread2287(tdone,ends);
          int biggest2292 = 0;
          if(ends[2]>=biggest2292){
            biggest2292=ends[2];
          }
          if(ends[3]>=biggest2292){
            biggest2292=ends[3];
          }
          if(ends[4]>=biggest2292){
            biggest2292=ends[4];
          }
          if(biggest2292 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread2293(tdone,ends);
          thread2294(tdone,ends);
          thread2295(tdone,ends);
          int biggest2300 = 0;
          if(ends[2]>=biggest2300){
            biggest2300=ends[2];
          }
          if(ends[3]>=biggest2300){
            biggest2300=ends[3];
          }
          if(ends[4]>=biggest2300){
            biggest2300=ends[4];
          }
          if(biggest2300 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2300 == 0){
            S2283=0;
            active[1]=0;
            ends[1]=0;
            S2283=0;
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
