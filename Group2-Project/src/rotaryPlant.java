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
  private int S1869 = 1;
  private int S1689 = 1;
  private int S1667 = 1;
  private int S1841 = 1;
  private int S1719 = 1;
  private int S1692 = 1;
  private int S1867 = 1;
  private int S1849 = 1;
  private int S1857 = 1;
  private int S1865 = 1;
  
  private int[] ends = new int[8];
  private int[] tdone = new int[8];
  
  public void thread1884(int [] tdone, int [] ends){
        switch(S1865){
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

  public void thread1883(int [] tdone, int [] ends){
        switch(S1857){
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

  public void thread1882(int [] tdone, int [] ends){
        switch(S1849){
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

  public void thread1881(int [] tdone, int [] ends){
        switch(S1867){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        thread1882(tdone,ends);
        thread1883(tdone,ends);
        thread1884(tdone,ends);
        int biggest1885 = 0;
        if(ends[5]>=biggest1885){
          biggest1885=ends[5];
        }
        if(ends[6]>=biggest1885){
          biggest1885=ends[6];
        }
        if(ends[7]>=biggest1885){
          biggest1885=ends[7];
        }
        if(biggest1885 == 1){
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        //FINXME code
        if(biggest1885 == 0){
          S1867=0;
          active[4]=0;
          ends[4]=0;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread1880(int [] tdone, int [] ends){
        switch(S1841){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S1719){
          case 0 : 
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 22, column: 10
              S1719=1;
              __start_thread_3 = com.systemj.Timer.getMs();//sysj\rotaryPlant.sysj line: 21, column: 3
              S1692=0;
              if(com.systemj.Timer.getMs() - __start_thread_3 >= 500){//sysj\rotaryPlant.sysj line: 21, column: 3
                ends[3]=2;
                ;//sysj\rotaryPlant.sysj line: 21, column: 3
                aligned.setPresent();//sysj\rotaryPlant.sysj line: 31, column: 4
                currsigs.addElement(aligned);
                S1719=0;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                S1692=1;
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
            switch(S1692){
              case 0 : 
                S1692=0;
                if(com.systemj.Timer.getMs() - __start_thread_3 >= 500){//sysj\rotaryPlant.sysj line: 21, column: 3
                  ends[3]=2;
                  ;//sysj\rotaryPlant.sysj line: 21, column: 3
                  aligned.setPresent();//sysj\rotaryPlant.sysj line: 31, column: 4
                  currsigs.addElement(aligned);
                  S1719=0;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S1692=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                break;
              
              case 1 : 
                S1692=1;
                S1692=0;
                if(com.systemj.Timer.getMs() - __start_thread_3 >= 500){//sysj\rotaryPlant.sysj line: 21, column: 3
                  ends[3]=2;
                  ;//sysj\rotaryPlant.sysj line: 21, column: 3
                  aligned.setPresent();//sysj\rotaryPlant.sysj line: 31, column: 4
                  currsigs.addElement(aligned);
                  S1719=0;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S1692=1;
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

  public void thread1879(int [] tdone, int [] ends){
        switch(S1689){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S1667){
          case 0 : 
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 13, column: 10
              S1667=1;
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
              S1667=0;
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

  public void thread1876(int [] tdone, int [] ends){
        S1865=1;
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

  public void thread1875(int [] tdone, int [] ends){
        S1857=1;
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

  public void thread1874(int [] tdone, int [] ends){
        S1849=1;
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

  public void thread1873(int [] tdone, int [] ends){
        S1867=1;
    thread1874(tdone,ends);
    thread1875(tdone,ends);
    thread1876(tdone,ends);
    int biggest1877 = 0;
    if(ends[5]>=biggest1877){
      biggest1877=ends[5];
    }
    if(ends[6]>=biggest1877){
      biggest1877=ends[6];
    }
    if(ends[7]>=biggest1877){
      biggest1877=ends[7];
    }
    if(biggest1877 == 1){
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread1872(int [] tdone, int [] ends){
        S1841=1;
    S1719=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread1871(int [] tdone, int [] ends){
        S1689=1;
    S1667=0;
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
      switch(S1869){
        case 0 : 
          S1869=0;
          break RUN;
        
        case 1 : 
          S1869=2;
          S1869=2;
          thread1871(tdone,ends);
          thread1872(tdone,ends);
          thread1873(tdone,ends);
          int biggest1878 = 0;
          if(ends[2]>=biggest1878){
            biggest1878=ends[2];
          }
          if(ends[3]>=biggest1878){
            biggest1878=ends[3];
          }
          if(ends[4]>=biggest1878){
            biggest1878=ends[4];
          }
          if(biggest1878 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread1879(tdone,ends);
          thread1880(tdone,ends);
          thread1881(tdone,ends);
          int biggest1886 = 0;
          if(ends[2]>=biggest1886){
            biggest1886=ends[2];
          }
          if(ends[3]>=biggest1886){
            biggest1886=ends[3];
          }
          if(ends[4]>=biggest1886){
            biggest1886=ends[4];
          }
          if(biggest1886 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1886 == 0){
            S1869=0;
            active[1]=0;
            ends[1]=0;
            S1869=0;
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
