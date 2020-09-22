import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class loaderController extends ClockDomain{
  public loaderController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottleToLoad = new Signal("bottleToLoad", Signal.INPUT);
  public Signal CMDfb = new Signal("CMDfb", Signal.INPUT);
  public Signal tick = new Signal("tick", Signal.INPUT);
  public Signal loaderDone = new Signal("loaderDone", Signal.OUTPUT);
  public Signal getBottle = new Signal("getBottle", Signal.OUTPUT);
  public Signal CMD = new Signal("CMD", Signal.OUTPUT);
  public Signal NloaderDone = new Signal("NloaderDone", Signal.OUTPUT);
  private int S1750 = 1;
  private int S1740 = 1;
  private int S1499 = 1;
  private int S1526 = 1;
  private int S1531 = 1;
  private int S1748 = 1;
  
  private int[] ends = new int[6];
  private int[] tdone = new int[6];
  
  public void thread1762(int [] tdone, int [] ends){
        switch(S1748){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(loaderDone.getprestatus()){//sysj\loaderController.sysj line: 51, column: 24
          NloaderDone.setPresent();//sysj\loaderController.sysj line: 51, column: 37
          currsigs.addElement(NloaderDone);
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

  public void thread1760(int [] tdone, int [] ends){
        switch(S1531){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        getBottle.setPresent();//sysj\loaderController.sysj line: 28, column: 6
        currsigs.addElement(getBottle);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
        break;
      
    }
  }

  public void thread1759(int [] tdone, int [] ends){
        switch(S1526){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        CMD.setPresent();//sysj\loaderController.sysj line: 26, column: 6
        currsigs.addElement(CMD);
        CMD.setValue("C");//sysj\loaderController.sysj line: 26, column: 6
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread1757(int [] tdone, int [] ends){
        S1531=1;
    getBottle.setPresent();//sysj\loaderController.sysj line: 28, column: 6
    currsigs.addElement(getBottle);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread1756(int [] tdone, int [] ends){
        S1526=1;
    CMD.setPresent();//sysj\loaderController.sysj line: 26, column: 6
    currsigs.addElement(CMD);
    CMD.setValue("C");//sysj\loaderController.sysj line: 26, column: 6
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread1755(int [] tdone, int [] ends){
        switch(S1740){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S1499){
          case 0 : 
            if(bottleToLoad.getprestatus()){//sysj\loaderController.sysj line: 12, column: 10
              S1499=1;
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
            if(tick.getprestatus()){//sysj\loaderController.sysj line: 13, column: 10
              S1499=2;
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
          
          case 2 : 
            if(!tick.getprestatus()){//sysj\loaderController.sysj line: 14, column: 10
              S1499=3;
              CMD.setPresent();//sysj\loaderController.sysj line: 16, column: 5
              currsigs.addElement(CMD);
              CMD.setValue("B");//sysj\loaderController.sysj line: 16, column: 5
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
          
          case 3 : 
            if(tick.getprestatus()){//sysj\loaderController.sysj line: 15, column: 10
              S1499=4;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              CMD.setPresent();//sysj\loaderController.sysj line: 16, column: 5
              currsigs.addElement(CMD);
              CMD.setValue("B");//sysj\loaderController.sysj line: 16, column: 5
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 4 : 
            if(!tick.getprestatus()){//sysj\loaderController.sysj line: 19, column: 10
              S1499=5;
              CMD.setPresent();//sysj\loaderController.sysj line: 21, column: 5
              currsigs.addElement(CMD);
              CMD.setValue("G");//sysj\loaderController.sysj line: 21, column: 5
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
          
          case 5 : 
            if(tick.getprestatus()){//sysj\loaderController.sysj line: 20, column: 10
              S1499=6;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              CMD.setPresent();//sysj\loaderController.sysj line: 21, column: 5
              currsigs.addElement(CMD);
              CMD.setValue("G");//sysj\loaderController.sysj line: 21, column: 5
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 6 : 
            if(!tick.getprestatus()){//sysj\loaderController.sysj line: 24, column: 10
              S1499=7;
              thread1756(tdone,ends);
              thread1757(tdone,ends);
              int biggest1758 = 0;
              if(ends[3]>=biggest1758){
                biggest1758=ends[3];
              }
              if(ends[4]>=biggest1758){
                biggest1758=ends[4];
              }
              if(biggest1758 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 7 : 
            if(tick.getprestatus()){//sysj\loaderController.sysj line: 25, column: 10
              S1499=8;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              thread1759(tdone,ends);
              thread1760(tdone,ends);
              int biggest1761 = 0;
              if(ends[3]>=biggest1761){
                biggest1761=ends[3];
              }
              if(ends[4]>=biggest1761){
                biggest1761=ends[4];
              }
              if(biggest1761 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest1761 == 0){
                S1499=8;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            break;
          
          case 8 : 
            if(!tick.getprestatus()){//sysj\loaderController.sysj line: 31, column: 10
              S1499=9;
              CMD.setPresent();//sysj\loaderController.sysj line: 33, column: 5
              currsigs.addElement(CMD);
              CMD.setValue("O");//sysj\loaderController.sysj line: 33, column: 5
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
          
          case 9 : 
            if(tick.getprestatus()){//sysj\loaderController.sysj line: 32, column: 10
              S1499=10;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              CMD.setPresent();//sysj\loaderController.sysj line: 33, column: 5
              currsigs.addElement(CMD);
              CMD.setValue("O");//sysj\loaderController.sysj line: 33, column: 5
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 10 : 
            if(!tick.getprestatus()){//sysj\loaderController.sysj line: 36, column: 10
              S1499=11;
              CMD.setPresent();//sysj\loaderController.sysj line: 38, column: 5
              currsigs.addElement(CMD);
              CMD.setValue("A");//sysj\loaderController.sysj line: 38, column: 5
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
          
          case 11 : 
            if(tick.getprestatus()){//sysj\loaderController.sysj line: 37, column: 10
              S1499=12;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              CMD.setPresent();//sysj\loaderController.sysj line: 38, column: 5
              currsigs.addElement(CMD);
              CMD.setValue("A");//sysj\loaderController.sysj line: 38, column: 5
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 12 : 
            if(!tick.getprestatus()){//sysj\loaderController.sysj line: 41, column: 10
              S1499=13;
              loaderDone.setPresent();//sysj\loaderController.sysj line: 43, column: 5
              currsigs.addElement(loaderDone);
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
          
          case 13 : 
            if(tick.getprestatus()){//sysj\loaderController.sysj line: 42, column: 10
              S1499=14;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              loaderDone.setPresent();//sysj\loaderController.sysj line: 43, column: 5
              currsigs.addElement(loaderDone);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 14 : 
            if(!tick.getprestatus()){//sysj\loaderController.sysj line: 45, column: 10
              S1499=0;
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
        break;
      
    }
  }

  public void thread1753(int [] tdone, int [] ends){
        S1748=1;
    if(loaderDone.getprestatus()){//sysj\loaderController.sysj line: 51, column: 24
      NloaderDone.setPresent();//sysj\loaderController.sysj line: 51, column: 37
      currsigs.addElement(NloaderDone);
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

  public void thread1752(int [] tdone, int [] ends){
        S1740=1;
    S1499=0;
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
      switch(S1750){
        case 0 : 
          S1750=0;
          break RUN;
        
        case 1 : 
          S1750=2;
          S1750=2;
          thread1752(tdone,ends);
          thread1753(tdone,ends);
          int biggest1754 = 0;
          if(ends[2]>=biggest1754){
            biggest1754=ends[2];
          }
          if(ends[5]>=biggest1754){
            biggest1754=ends[5];
          }
          if(biggest1754 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread1755(tdone,ends);
          thread1762(tdone,ends);
          int biggest1763 = 0;
          if(ends[2]>=biggest1763){
            biggest1763=ends[2];
          }
          if(ends[5]>=biggest1763){
            biggest1763=ends[5];
          }
          if(biggest1763 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1763 == 0){
            S1750=0;
            active[1]=0;
            ends[1]=0;
            S1750=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0};
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
          bottleToLoad.gethook();
          CMDfb.gethook();
          tick.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleToLoad.setpreclear();
      CMDfb.setpreclear();
      tick.setpreclear();
      loaderDone.setpreclear();
      getBottle.setpreclear();
      CMD.setpreclear();
      NloaderDone.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottleToLoad.getStatus() ? bottleToLoad.setprepresent() : bottleToLoad.setpreclear();
      bottleToLoad.setpreval(bottleToLoad.getValue());
      bottleToLoad.setClear();
      dummyint = CMDfb.getStatus() ? CMDfb.setprepresent() : CMDfb.setpreclear();
      CMDfb.setpreval(CMDfb.getValue());
      CMDfb.setClear();
      dummyint = tick.getStatus() ? tick.setprepresent() : tick.setpreclear();
      tick.setpreval(tick.getValue());
      tick.setClear();
      loaderDone.sethook();
      loaderDone.setClear();
      getBottle.sethook();
      getBottle.setClear();
      CMD.sethook();
      CMD.setClear();
      NloaderDone.sethook();
      NloaderDone.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        bottleToLoad.gethook();
        CMDfb.gethook();
        tick.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
