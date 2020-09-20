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
  private int S2102 = 1;
  private int S2086 = 1;
  private int S2085 = 1;
  private int S1502 = 1;
  private int S2100 = 1;
  private int S2088 = 1;
  
  private int[] ends = new int[4];
  private int[] tdone = new int[4];
  
  public void thread2108(int [] tdone, int [] ends){
        switch(S2100){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S2088){
          case 0 : 
            if(tick.getprestatus()){//sysj\loaderController.sysj line: 53, column: 10
              System.out.println("doing tick");//sysj\loaderController.sysj line: 54, column: 4
              S2088=1;
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
            if(!tick.getprestatus()){//sysj\loaderController.sysj line: 55, column: 10
              S2088=0;
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

  public void thread2107(int [] tdone, int [] ends){
        switch(S2086){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S2085){
          case 0 : 
            if(tick.getprestatus()){//sysj\loaderController.sysj line: 8, column: 8
              S2085=1;
              S1502=0;
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
            switch(S1502){
              case 0 : 
                if(!tick.getprestatus()){//sysj\loaderController.sysj line: 11, column: 10
                  S1502=1;
                  System.out.println("Move to load point");//sysj\loaderController.sysj line: 13, column: 5
                  CMD.setPresent();//sysj\loaderController.sysj line: 14, column: 5
                  currsigs.addElement(CMD);
                  CMD.setValue("B");//sysj\loaderController.sysj line: 14, column: 5
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
                  S1502=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  CMD.setPresent();//sysj\loaderController.sysj line: 14, column: 5
                  currsigs.addElement(CMD);
                  CMD.setValue("B");//sysj\loaderController.sysj line: 14, column: 5
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 2 : 
                if(!tick.getprestatus()){//sysj\loaderController.sysj line: 17, column: 10
                  S1502=3;
                  System.out.println("Grip load bottle");//sysj\loaderController.sysj line: 19, column: 5
                  CMD.setPresent();//sysj\loaderController.sysj line: 20, column: 5
                  currsigs.addElement(CMD);
                  CMD.setValue("G");//sysj\loaderController.sysj line: 20, column: 5
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
                if(tick.getprestatus()){//sysj\loaderController.sysj line: 18, column: 10
                  S1502=4;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  CMD.setPresent();//sysj\loaderController.sysj line: 20, column: 5
                  currsigs.addElement(CMD);
                  CMD.setValue("G");//sysj\loaderController.sysj line: 20, column: 5
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 4 : 
                if(!tick.getprestatus()){//sysj\loaderController.sysj line: 23, column: 10
                  S1502=5;
                  System.out.println("Move to load conveyor");//sysj\loaderController.sysj line: 25, column: 5
                  CMD.setPresent();//sysj\loaderController.sysj line: 26, column: 5
                  currsigs.addElement(CMD);
                  CMD.setValue("C");//sysj\loaderController.sysj line: 26, column: 5
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
                if(tick.getprestatus()){//sysj\loaderController.sysj line: 24, column: 10
                  S1502=6;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  CMD.setPresent();//sysj\loaderController.sysj line: 26, column: 5
                  currsigs.addElement(CMD);
                  CMD.setValue("C");//sysj\loaderController.sysj line: 26, column: 5
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 6 : 
                if(!tick.getprestatus()){//sysj\loaderController.sysj line: 29, column: 10
                  S1502=7;
                  CMD.setPresent();//sysj\loaderController.sysj line: 31, column: 5
                  currsigs.addElement(CMD);
                  CMD.setValue("D");//sysj\loaderController.sysj line: 31, column: 5
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
                if(tick.getprestatus()){//sysj\loaderController.sysj line: 30, column: 10
                  S1502=8;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  CMD.setPresent();//sysj\loaderController.sysj line: 31, column: 5
                  currsigs.addElement(CMD);
                  CMD.setValue("D");//sysj\loaderController.sysj line: 31, column: 5
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 8 : 
                if(!tick.getprestatus()){//sysj\loaderController.sysj line: 34, column: 10
                  S1502=9;
                  System.out.println("Ungrip load bottle");//sysj\loaderController.sysj line: 36, column: 5
                  CMD.setPresent();//sysj\loaderController.sysj line: 37, column: 5
                  currsigs.addElement(CMD);
                  CMD.setValue("O");//sysj\loaderController.sysj line: 37, column: 5
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
                if(tick.getprestatus()){//sysj\loaderController.sysj line: 35, column: 10
                  S1502=10;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  CMD.setPresent();//sysj\loaderController.sysj line: 37, column: 5
                  currsigs.addElement(CMD);
                  CMD.setValue("O");//sysj\loaderController.sysj line: 37, column: 5
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 10 : 
                if(!tick.getprestatus()){//sysj\loaderController.sysj line: 40, column: 10
                  S1502=11;
                  System.out.println("Move to init load");//sysj\loaderController.sysj line: 42, column: 5
                  CMD.setPresent();//sysj\loaderController.sysj line: 43, column: 5
                  currsigs.addElement(CMD);
                  CMD.setValue("A");//sysj\loaderController.sysj line: 43, column: 5
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
                if(tick.getprestatus()){//sysj\loaderController.sysj line: 41, column: 10
                  loaderDone.setPresent();//sysj\loaderController.sysj line: 45, column: 4
                  currsigs.addElement(loaderDone);
                  S1502=12;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  CMD.setPresent();//sysj\loaderController.sysj line: 43, column: 5
                  currsigs.addElement(CMD);
                  CMD.setValue("A");//sysj\loaderController.sysj line: 43, column: 5
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 12 : 
                S1502=12;
                S1502=0;
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

  public void thread2105(int [] tdone, int [] ends){
        S2100=1;
    S2088=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread2104(int [] tdone, int [] ends){
        S2086=1;
    S2085=0;
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
      switch(S2102){
        case 0 : 
          S2102=0;
          break RUN;
        
        case 1 : 
          S2102=2;
          S2102=2;
          thread2104(tdone,ends);
          thread2105(tdone,ends);
          int biggest2106 = 0;
          if(ends[2]>=biggest2106){
            biggest2106=ends[2];
          }
          if(ends[3]>=biggest2106){
            biggest2106=ends[3];
          }
          if(biggest2106 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread2107(tdone,ends);
          thread2108(tdone,ends);
          int biggest2109 = 0;
          if(ends[2]>=biggest2109){
            biggest2109=ends[2];
          }
          if(ends[3]>=biggest2109){
            biggest2109=ends[3];
          }
          if(biggest2109 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2109 == 0){
            S2102=0;
            active[1]=0;
            ends[1]=0;
            S2102=0;
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
