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
  private int S1741 = 1;
  private int S1731 = 1;
  private int S1495 = 1;
  private int S1739 = 1;
  
  private int[] ends = new int[4];
  private int[] tdone = new int[4];
  
  public void thread1747(int [] tdone, int [] ends){
        switch(S1739){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(tick.getprestatus()){//sysj\loaderController.sysj line: 52, column: 10
          System.out.println("doing tick");//sysj\loaderController.sysj line: 53, column: 4
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
  }

  public void thread1746(int [] tdone, int [] ends){
        switch(S1731){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S1495){
          case 0 : 
            if(!CMDfb.getprestatus()){//sysj\loaderController.sysj line: 10, column: 10
              S1495=1;
              CMD.setPresent();//sysj\loaderController.sysj line: 12, column: 5
              currsigs.addElement(CMD);
              CMD.setValue("B");//sysj\loaderController.sysj line: 12, column: 5
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
            if(CMDfb.getprestatus()){//sysj\loaderController.sysj line: 11, column: 10
              S1495=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              CMD.setPresent();//sysj\loaderController.sysj line: 12, column: 5
              currsigs.addElement(CMD);
              CMD.setValue("B");//sysj\loaderController.sysj line: 12, column: 5
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 2 : 
            if(tick.getprestatus()){//sysj\loaderController.sysj line: 15, column: 10
              S1495=3;
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
            if(!CMDfb.getprestatus()){//sysj\loaderController.sysj line: 16, column: 10
              S1495=4;
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
          
          case 4 : 
            if(CMDfb.getprestatus()){//sysj\loaderController.sysj line: 17, column: 10
              S1495=5;
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
          
          case 5 : 
            if(tick.getprestatus()){//sysj\loaderController.sysj line: 21, column: 10
              S1495=6;
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
          
          case 6 : 
            if(!CMDfb.getprestatus()){//sysj\loaderController.sysj line: 22, column: 10
              S1495=7;
              CMD.setPresent();//sysj\loaderController.sysj line: 24, column: 5
              currsigs.addElement(CMD);
              CMD.setValue("C");//sysj\loaderController.sysj line: 24, column: 5
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
            if(CMDfb.getprestatus()){//sysj\loaderController.sysj line: 23, column: 10
              S1495=8;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              CMD.setPresent();//sysj\loaderController.sysj line: 24, column: 5
              currsigs.addElement(CMD);
              CMD.setValue("C");//sysj\loaderController.sysj line: 24, column: 5
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 8 : 
            if(tick.getprestatus()){//sysj\loaderController.sysj line: 27, column: 10
              S1495=9;
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
            if(!CMDfb.getprestatus()){//sysj\loaderController.sysj line: 28, column: 10
              S1495=10;
              CMD.setPresent();//sysj\loaderController.sysj line: 30, column: 5
              currsigs.addElement(CMD);
              CMD.setValue("D");//sysj\loaderController.sysj line: 30, column: 5
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
          
          case 10 : 
            if(CMDfb.getprestatus()){//sysj\loaderController.sysj line: 29, column: 10
              S1495=11;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              CMD.setPresent();//sysj\loaderController.sysj line: 30, column: 5
              currsigs.addElement(CMD);
              CMD.setValue("D");//sysj\loaderController.sysj line: 30, column: 5
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 11 : 
            if(tick.getprestatus()){//sysj\loaderController.sysj line: 32, column: 10
              S1495=12;
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
          
          case 12 : 
            if(!CMDfb.getprestatus()){//sysj\loaderController.sysj line: 33, column: 10
              S1495=13;
              CMD.setPresent();//sysj\loaderController.sysj line: 35, column: 5
              currsigs.addElement(CMD);
              CMD.setValue("O");//sysj\loaderController.sysj line: 35, column: 5
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
            if(CMDfb.getprestatus()){//sysj\loaderController.sysj line: 34, column: 10
              S1495=14;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              CMD.setPresent();//sysj\loaderController.sysj line: 35, column: 5
              currsigs.addElement(CMD);
              CMD.setValue("O");//sysj\loaderController.sysj line: 35, column: 5
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 14 : 
            if(tick.getprestatus()){//sysj\loaderController.sysj line: 38, column: 10
              S1495=15;
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
          
          case 15 : 
            if(!CMDfb.getprestatus()){//sysj\loaderController.sysj line: 39, column: 10
              S1495=16;
              CMD.setPresent();//sysj\loaderController.sysj line: 41, column: 5
              currsigs.addElement(CMD);
              CMD.setValue("A");//sysj\loaderController.sysj line: 41, column: 5
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
          
          case 16 : 
            if(CMDfb.getprestatus()){//sysj\loaderController.sysj line: 40, column: 10
              loaderDone.setPresent();//sysj\loaderController.sysj line: 44, column: 4
              currsigs.addElement(loaderDone);
              S1495=17;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              CMD.setPresent();//sysj\loaderController.sysj line: 41, column: 5
              currsigs.addElement(CMD);
              CMD.setValue("A");//sysj\loaderController.sysj line: 41, column: 5
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 17 : 
            if(tick.getprestatus()){//sysj\loaderController.sysj line: 45, column: 10
              S1495=18;
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
          
          case 18 : 
            S1495=18;
            S1495=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread1744(int [] tdone, int [] ends){
        S1739=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread1743(int [] tdone, int [] ends){
        S1731=1;
    S1495=0;
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
      switch(S1741){
        case 0 : 
          S1741=0;
          break RUN;
        
        case 1 : 
          S1741=2;
          S1741=2;
          thread1743(tdone,ends);
          thread1744(tdone,ends);
          int biggest1745 = 0;
          if(ends[2]>=biggest1745){
            biggest1745=ends[2];
          }
          if(ends[3]>=biggest1745){
            biggest1745=ends[3];
          }
          if(biggest1745 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread1746(tdone,ends);
          thread1747(tdone,ends);
          int biggest1748 = 0;
          if(ends[2]>=biggest1748){
            biggest1748=ends[2];
          }
          if(ends[3]>=biggest1748){
            biggest1748=ends[3];
          }
          if(biggest1748 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1748 == 0){
            S1741=0;
            active[1]=0;
            ends[1]=0;
            S1741=0;
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
