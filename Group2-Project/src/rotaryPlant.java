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
  private int S2365 = 1;
  private int S2185 = 1;
  private int S2163 = 1;
  private int S2337 = 1;
  private int S2215 = 1;
  private int S2188 = 1;
  private int S2363 = 1;
  private int S2345 = 1;
  private int S2353 = 1;
  private int S2361 = 1;
  
  private int[] ends = new int[8];
  private int[] tdone = new int[8];
  
  public void thread2380(int [] tdone, int [] ends){
        switch(S2361){
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

  public void thread2379(int [] tdone, int [] ends){
        switch(S2353){
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

  public void thread2378(int [] tdone, int [] ends){
        switch(S2345){
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

  public void thread2377(int [] tdone, int [] ends){
        switch(S2363){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        thread2378(tdone,ends);
        thread2379(tdone,ends);
        thread2380(tdone,ends);
        int biggest2381 = 0;
        if(ends[5]>=biggest2381){
          biggest2381=ends[5];
        }
        if(ends[6]>=biggest2381){
          biggest2381=ends[6];
        }
        if(ends[7]>=biggest2381){
          biggest2381=ends[7];
        }
        if(biggest2381 == 1){
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        //FINXME code
        if(biggest2381 == 0){
          S2363=0;
          active[4]=0;
          ends[4]=0;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread2376(int [] tdone, int [] ends){
        switch(S2337){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S2215){
          case 0 : 
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 22, column: 10
              S2215=1;
              __start_thread_3 = com.systemj.Timer.getMs();//sysj\rotaryPlant.sysj line: 21, column: 3
              S2188=0;
              if(com.systemj.Timer.getMs() - __start_thread_3 >= 500){//sysj\rotaryPlant.sysj line: 21, column: 3
                ends[3]=2;
                ;//sysj\rotaryPlant.sysj line: 21, column: 3
                aligned.setPresent();//sysj\rotaryPlant.sysj line: 31, column: 4
                currsigs.addElement(aligned);
                S2215=0;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                S2188=1;
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
            switch(S2188){
              case 0 : 
                S2188=0;
                if(com.systemj.Timer.getMs() - __start_thread_3 >= 500){//sysj\rotaryPlant.sysj line: 21, column: 3
                  ends[3]=2;
                  ;//sysj\rotaryPlant.sysj line: 21, column: 3
                  aligned.setPresent();//sysj\rotaryPlant.sysj line: 31, column: 4
                  currsigs.addElement(aligned);
                  S2215=0;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S2188=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                break;
              
              case 1 : 
                S2188=1;
                S2188=0;
                if(com.systemj.Timer.getMs() - __start_thread_3 >= 500){//sysj\rotaryPlant.sysj line: 21, column: 3
                  ends[3]=2;
                  ;//sysj\rotaryPlant.sysj line: 21, column: 3
                  aligned.setPresent();//sysj\rotaryPlant.sysj line: 31, column: 4
                  currsigs.addElement(aligned);
                  S2215=0;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S2188=1;
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

  public void thread2375(int [] tdone, int [] ends){
        switch(S2185){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S2163){
          case 0 : 
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 13, column: 10
              S2163=1;
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
              S2163=0;
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

  public void thread2372(int [] tdone, int [] ends){
        S2361=1;
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

  public void thread2371(int [] tdone, int [] ends){
        S2353=1;
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

  public void thread2370(int [] tdone, int [] ends){
        S2345=1;
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

  public void thread2369(int [] tdone, int [] ends){
        S2363=1;
    thread2370(tdone,ends);
    thread2371(tdone,ends);
    thread2372(tdone,ends);
    int biggest2373 = 0;
    if(ends[5]>=biggest2373){
      biggest2373=ends[5];
    }
    if(ends[6]>=biggest2373){
      biggest2373=ends[6];
    }
    if(ends[7]>=biggest2373){
      biggest2373=ends[7];
    }
    if(biggest2373 == 1){
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread2368(int [] tdone, int [] ends){
        S2337=1;
    S2215=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread2367(int [] tdone, int [] ends){
        S2185=1;
    S2163=0;
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
      switch(S2365){
        case 0 : 
          S2365=0;
          break RUN;
        
        case 1 : 
          S2365=2;
          S2365=2;
          thread2367(tdone,ends);
          thread2368(tdone,ends);
          thread2369(tdone,ends);
          int biggest2374 = 0;
          if(ends[2]>=biggest2374){
            biggest2374=ends[2];
          }
          if(ends[3]>=biggest2374){
            biggest2374=ends[3];
          }
          if(ends[4]>=biggest2374){
            biggest2374=ends[4];
          }
          if(biggest2374 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread2375(tdone,ends);
          thread2376(tdone,ends);
          thread2377(tdone,ends);
          int biggest2382 = 0;
          if(ends[2]>=biggest2382){
            biggest2382=ends[2];
          }
          if(ends[3]>=biggest2382){
            biggest2382=ends[3];
          }
          if(ends[4]>=biggest2382){
            biggest2382=ends[4];
          }
          if(biggest2382 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2382 == 0){
            S2365=0;
            active[1]=0;
            ends[1]=0;
            S2365=0;
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
