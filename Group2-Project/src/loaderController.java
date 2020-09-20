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
  public Signal bottleAtPoint = new Signal("bottleAtPoint", Signal.INPUT);
  public Signal CMDfb = new Signal("CMDfb", Signal.INPUT);
  public Signal tick = new Signal("tick", Signal.INPUT);
  public Signal loaderDone = new Signal("loaderDone", Signal.OUTPUT);
  public Signal CMD = new Signal("CMD", Signal.OUTPUT);
  private int S1862 = 1;
  private int S1846 = 1;
  private int S1845 = 1;
  private int S1494 = 1;
  private int S1860 = 1;
  private int S1848 = 1;
  
  private int[] ends = new int[4];
  private int[] tdone = new int[4];
  
  public void thread1868(int [] tdone, int [] ends){
        switch(S1860){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S1848){
          case 0 : 
            if(tick.getprestatus()){//sysj\loaderController.sysj line: 48, column: 10
              System.out.println("doing tick");//sysj\loaderController.sysj line: 49, column: 4
              S1848=1;
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
            if(!tick.getprestatus()){//sysj\loaderController.sysj line: 50, column: 10
              S1848=0;
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
          
        }
        break;
      
    }
  }

  public void thread1867(int [] tdone, int [] ends){
        switch(S1846){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S1845){
          case 0 : 
            if(tick.getprestatus()){//sysj\loaderController.sysj line: 8, column: 8
              S1845=1;
              S1494=0;
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
            switch(S1494){
              case 0 : 
                if(!tick.getprestatus()){//sysj\loaderController.sysj line: 11, column: 10
                  S1494=1;
                  CMD.setPresent();//sysj\loaderController.sysj line: 13, column: 5
                  currsigs.addElement(CMD);
                  CMD.setValue("B");//sysj\loaderController.sysj line: 13, column: 5
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
                if(tick.getprestatus()){//sysj\loaderController.sysj line: 12, column: 10
                  S1494=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  CMD.setPresent();//sysj\loaderController.sysj line: 13, column: 5
                  currsigs.addElement(CMD);
                  CMD.setValue("B");//sysj\loaderController.sysj line: 13, column: 5
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 2 : 
                if(!tick.getprestatus()){//sysj\loaderController.sysj line: 16, column: 10
                  S1494=3;
                  CMD.setPresent();//sysj\loaderController.sysj line: 18, column: 5
                  currsigs.addElement(CMD);
                  CMD.setValue("G");//sysj\loaderController.sysj line: 18, column: 5
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
                if(tick.getprestatus()){//sysj\loaderController.sysj line: 17, column: 10
                  S1494=4;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  CMD.setPresent();//sysj\loaderController.sysj line: 18, column: 5
                  currsigs.addElement(CMD);
                  CMD.setValue("G");//sysj\loaderController.sysj line: 18, column: 5
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 4 : 
                if(!tick.getprestatus()){//sysj\loaderController.sysj line: 21, column: 10
                  S1494=5;
                  CMD.setPresent();//sysj\loaderController.sysj line: 23, column: 5
                  currsigs.addElement(CMD);
                  CMD.setValue("C");//sysj\loaderController.sysj line: 23, column: 5
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
                if(tick.getprestatus()){//sysj\loaderController.sysj line: 22, column: 10
                  S1494=6;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  CMD.setPresent();//sysj\loaderController.sysj line: 23, column: 5
                  currsigs.addElement(CMD);
                  CMD.setValue("C");//sysj\loaderController.sysj line: 23, column: 5
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 6 : 
                if(!tick.getprestatus()){//sysj\loaderController.sysj line: 26, column: 10
                  S1494=7;
                  CMD.setPresent();//sysj\loaderController.sysj line: 28, column: 5
                  currsigs.addElement(CMD);
                  CMD.setValue("D");//sysj\loaderController.sysj line: 28, column: 5
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
              
              case 7 : 
                if(tick.getprestatus()){//sysj\loaderController.sysj line: 27, column: 10
                  S1494=8;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  CMD.setPresent();//sysj\loaderController.sysj line: 28, column: 5
                  currsigs.addElement(CMD);
                  CMD.setValue("D");//sysj\loaderController.sysj line: 28, column: 5
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 8 : 
                if(!tick.getprestatus()){//sysj\loaderController.sysj line: 31, column: 10
                  S1494=9;
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
                  S1494=10;
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
                  S1494=11;
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
                  loaderDone.setPresent();//sysj\loaderController.sysj line: 40, column: 4
                  currsigs.addElement(loaderDone);
                  S1494=12;
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
                S1494=12;
                S1494=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1865(int [] tdone, int [] ends){
        S1860=1;
    S1848=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread1864(int [] tdone, int [] ends){
        S1846=1;
    S1845=0;
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
      switch(S1862){
        case 0 : 
          S1862=0;
          break RUN;
        
        case 1 : 
          S1862=2;
          S1862=2;
          thread1864(tdone,ends);
          thread1865(tdone,ends);
          int biggest1866 = 0;
          if(ends[2]>=biggest1866){
            biggest1866=ends[2];
          }
          if(ends[3]>=biggest1866){
            biggest1866=ends[3];
          }
          if(biggest1866 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread1867(tdone,ends);
          thread1868(tdone,ends);
          int biggest1869 = 0;
          if(ends[2]>=biggest1869){
            biggest1869=ends[2];
          }
          if(ends[3]>=biggest1869){
            biggest1869=ends[3];
          }
          if(biggest1869 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1869 == 0){
            S1862=0;
            active[1]=0;
            ends[1]=0;
            S1862=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0};
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
          bottleAtPoint.gethook();
          CMDfb.gethook();
          tick.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleAtPoint.setpreclear();
      CMDfb.setpreclear();
      tick.setpreclear();
      loaderDone.setpreclear();
      CMD.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottleAtPoint.getStatus() ? bottleAtPoint.setprepresent() : bottleAtPoint.setpreclear();
      bottleAtPoint.setpreval(bottleAtPoint.getValue());
      bottleAtPoint.setClear();
      dummyint = CMDfb.getStatus() ? CMDfb.setprepresent() : CMDfb.setpreclear();
      CMDfb.setpreval(CMDfb.getValue());
      CMDfb.setClear();
      dummyint = tick.getStatus() ? tick.setprepresent() : tick.setpreclear();
      tick.setpreval(tick.getValue());
      tick.setClear();
      loaderDone.sethook();
      loaderDone.setClear();
      CMD.sethook();
      CMD.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        bottleAtPoint.gethook();
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
