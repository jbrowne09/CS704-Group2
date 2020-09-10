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
  private int S1821 = 1;
  private int S1641 = 1;
  private int S1619 = 1;
  private int S1793 = 1;
  private int S1671 = 1;
  private int S1644 = 1;
  private int S1819 = 1;
  private int S1801 = 1;
  private int S1809 = 1;
  private int S1817 = 1;
  
  private int[] ends = new int[8];
  private int[] tdone = new int[8];
  
  public void thread1836(int [] tdone, int [] ends){
        switch(S1817){
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

  public void thread1835(int [] tdone, int [] ends){
        switch(S1809){
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

  public void thread1834(int [] tdone, int [] ends){
        switch(S1801){
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

  public void thread1833(int [] tdone, int [] ends){
        switch(S1819){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        thread1834(tdone,ends);
        thread1835(tdone,ends);
        thread1836(tdone,ends);
        int biggest1837 = 0;
        if(ends[5]>=biggest1837){
          biggest1837=ends[5];
        }
        if(ends[6]>=biggest1837){
          biggest1837=ends[6];
        }
        if(ends[7]>=biggest1837){
          biggest1837=ends[7];
        }
        if(biggest1837 == 1){
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        //FINXME code
        if(biggest1837 == 0){
          S1819=0;
          active[4]=0;
          ends[4]=0;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread1832(int [] tdone, int [] ends){
        switch(S1793){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S1671){
          case 0 : 
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 22, column: 10
              S1671=1;
              __start_thread_3 = com.systemj.Timer.getMs();//sysj\rotaryPlant.sysj line: 21, column: 3
              S1644=0;
              if(com.systemj.Timer.getMs() - __start_thread_3 >= 500){//sysj\rotaryPlant.sysj line: 21, column: 3
                ends[3]=2;
                ;//sysj\rotaryPlant.sysj line: 21, column: 3
                aligned.setPresent();//sysj\rotaryPlant.sysj line: 31, column: 4
                currsigs.addElement(aligned);
                S1671=0;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                S1644=1;
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
            switch(S1644){
              case 0 : 
                S1644=0;
                if(com.systemj.Timer.getMs() - __start_thread_3 >= 500){//sysj\rotaryPlant.sysj line: 21, column: 3
                  ends[3]=2;
                  ;//sysj\rotaryPlant.sysj line: 21, column: 3
                  aligned.setPresent();//sysj\rotaryPlant.sysj line: 31, column: 4
                  currsigs.addElement(aligned);
                  S1671=0;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S1644=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                break;
              
              case 1 : 
                S1644=1;
                S1644=0;
                if(com.systemj.Timer.getMs() - __start_thread_3 >= 500){//sysj\rotaryPlant.sysj line: 21, column: 3
                  ends[3]=2;
                  ;//sysj\rotaryPlant.sysj line: 21, column: 3
                  aligned.setPresent();//sysj\rotaryPlant.sysj line: 31, column: 4
                  currsigs.addElement(aligned);
                  S1671=0;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S1644=1;
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

  public void thread1831(int [] tdone, int [] ends){
        switch(S1641){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S1619){
          case 0 : 
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 13, column: 10
              S1619=1;
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
              S1619=0;
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

  public void thread1828(int [] tdone, int [] ends){
        S1817=1;
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

  public void thread1827(int [] tdone, int [] ends){
        S1809=1;
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

  public void thread1826(int [] tdone, int [] ends){
        S1801=1;
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

  public void thread1825(int [] tdone, int [] ends){
        S1819=1;
    thread1826(tdone,ends);
    thread1827(tdone,ends);
    thread1828(tdone,ends);
    int biggest1829 = 0;
    if(ends[5]>=biggest1829){
      biggest1829=ends[5];
    }
    if(ends[6]>=biggest1829){
      biggest1829=ends[6];
    }
    if(ends[7]>=biggest1829){
      biggest1829=ends[7];
    }
    if(biggest1829 == 1){
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread1824(int [] tdone, int [] ends){
        S1793=1;
    S1671=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread1823(int [] tdone, int [] ends){
        S1641=1;
    S1619=0;
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
      switch(S1821){
        case 0 : 
          S1821=0;
          break RUN;
        
        case 1 : 
          S1821=2;
          S1821=2;
          thread1823(tdone,ends);
          thread1824(tdone,ends);
          thread1825(tdone,ends);
          int biggest1830 = 0;
          if(ends[2]>=biggest1830){
            biggest1830=ends[2];
          }
          if(ends[3]>=biggest1830){
            biggest1830=ends[3];
          }
          if(ends[4]>=biggest1830){
            biggest1830=ends[4];
          }
          if(biggest1830 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread1831(tdone,ends);
          thread1832(tdone,ends);
          thread1833(tdone,ends);
          int biggest1838 = 0;
          if(ends[2]>=biggest1838){
            biggest1838=ends[2];
          }
          if(ends[3]>=biggest1838){
            biggest1838=ends[3];
          }
          if(ends[4]>=biggest1838){
            biggest1838=ends[4];
          }
          if(biggest1838 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1838 == 0){
            S1821=0;
            active[1]=0;
            ends[1]=0;
            S1821=0;
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
