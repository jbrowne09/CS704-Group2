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
  private int S1873 = 1;
  private int S1857 = 1;
  private int S1501 = 1;
  private int S1871 = 1;
  private int S1859 = 1;
  
  private int[] ends = new int[4];
  private int[] tdone = new int[4];
  
  public void thread1879(int [] tdone, int [] ends){
        switch(S1871){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S1859){
          case 0 : 
            if(tick.getprestatus()){//sysj\loaderController.sysj line: 82, column: 10
              System.out.println("doing tick");//sysj\loaderController.sysj line: 83, column: 4
              S1859=1;
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
            if(!tick.getprestatus()){//sysj\loaderController.sysj line: 84, column: 10
              S1859=0;
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

  public void thread1878(int [] tdone, int [] ends){
        switch(S1857){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S1501){
          case 0 : 
            if(!CMDfb.getprestatus()){//sysj\loaderController.sysj line: 10, column: 10
              S1501=1;
              System.out.println("Move to load point");//sysj\loaderController.sysj line: 12, column: 5
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
            if(CMDfb.getprestatus()){//sysj\loaderController.sysj line: 11, column: 10
              S1501=2;
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
            if(!tick.getprestatus()){//sysj\loaderController.sysj line: 17, column: 10
              S1501=3;
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
              S1501=4;
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
            if(!CMDfb.getprestatus()){//sysj\loaderController.sysj line: 21, column: 10
              S1501=5;
              System.out.println("Grip load bottle");//sysj\loaderController.sysj line: 23, column: 5
              CMD.setPresent();//sysj\loaderController.sysj line: 24, column: 5
              currsigs.addElement(CMD);
              CMD.setValue("G");//sysj\loaderController.sysj line: 24, column: 5
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
            if(CMDfb.getprestatus()){//sysj\loaderController.sysj line: 22, column: 10
              S1501=6;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              CMD.setPresent();//sysj\loaderController.sysj line: 24, column: 5
              currsigs.addElement(CMD);
              CMD.setValue("G");//sysj\loaderController.sysj line: 24, column: 5
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 6 : 
            if(!tick.getprestatus()){//sysj\loaderController.sysj line: 28, column: 10
              S1501=7;
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
            if(tick.getprestatus()){//sysj\loaderController.sysj line: 29, column: 10
              S1501=8;
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
          
          case 8 : 
            if(!CMDfb.getprestatus()){//sysj\loaderController.sysj line: 32, column: 10
              S1501=9;
              System.out.println("Move to load conveyor");//sysj\loaderController.sysj line: 34, column: 5
              CMD.setPresent();//sysj\loaderController.sysj line: 35, column: 5
              currsigs.addElement(CMD);
              CMD.setValue("C");//sysj\loaderController.sysj line: 35, column: 5
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
            if(CMDfb.getprestatus()){//sysj\loaderController.sysj line: 33, column: 10
              S1501=10;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              CMD.setPresent();//sysj\loaderController.sysj line: 35, column: 5
              currsigs.addElement(CMD);
              CMD.setValue("C");//sysj\loaderController.sysj line: 35, column: 5
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 10 : 
            if(!tick.getprestatus()){//sysj\loaderController.sysj line: 39, column: 10
              S1501=11;
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
            if(tick.getprestatus()){//sysj\loaderController.sysj line: 40, column: 10
              S1501=12;
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
            if(!CMDfb.getprestatus()){//sysj\loaderController.sysj line: 43, column: 10
              S1501=13;
              CMD.setPresent();//sysj\loaderController.sysj line: 45, column: 5
              currsigs.addElement(CMD);
              CMD.setValue("D");//sysj\loaderController.sysj line: 45, column: 5
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
            if(CMDfb.getprestatus()){//sysj\loaderController.sysj line: 44, column: 10
              S1501=14;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              CMD.setPresent();//sysj\loaderController.sysj line: 45, column: 5
              currsigs.addElement(CMD);
              CMD.setValue("D");//sysj\loaderController.sysj line: 45, column: 5
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 14 : 
            if(!tick.getprestatus()){//sysj\loaderController.sysj line: 49, column: 10
              S1501=15;
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
            if(tick.getprestatus()){//sysj\loaderController.sysj line: 50, column: 10
              S1501=16;
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
            if(!CMDfb.getprestatus()){//sysj\loaderController.sysj line: 53, column: 10
              S1501=17;
              System.out.println("Ungrip load bottle");//sysj\loaderController.sysj line: 55, column: 5
              CMD.setPresent();//sysj\loaderController.sysj line: 56, column: 5
              currsigs.addElement(CMD);
              CMD.setValue("O");//sysj\loaderController.sysj line: 56, column: 5
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
          
          case 17 : 
            if(CMDfb.getprestatus()){//sysj\loaderController.sysj line: 54, column: 10
              S1501=18;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              CMD.setPresent();//sysj\loaderController.sysj line: 56, column: 5
              currsigs.addElement(CMD);
              CMD.setValue("O");//sysj\loaderController.sysj line: 56, column: 5
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 18 : 
            if(!tick.getprestatus()){//sysj\loaderController.sysj line: 60, column: 10
              S1501=19;
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
          
          case 19 : 
            if(tick.getprestatus()){//sysj\loaderController.sysj line: 61, column: 10
              S1501=20;
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
          
          case 20 : 
            if(!CMDfb.getprestatus()){//sysj\loaderController.sysj line: 64, column: 10
              S1501=21;
              System.out.println("Move to init load");//sysj\loaderController.sysj line: 66, column: 5
              CMD.setPresent();//sysj\loaderController.sysj line: 67, column: 5
              currsigs.addElement(CMD);
              CMD.setValue("A");//sysj\loaderController.sysj line: 67, column: 5
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
          
          case 21 : 
            if(CMDfb.getprestatus()){//sysj\loaderController.sysj line: 65, column: 10
              loaderDone.setPresent();//sysj\loaderController.sysj line: 69, column: 4
              currsigs.addElement(loaderDone);
              S1501=22;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              CMD.setPresent();//sysj\loaderController.sysj line: 67, column: 5
              currsigs.addElement(CMD);
              CMD.setValue("A");//sysj\loaderController.sysj line: 67, column: 5
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 22 : 
            if(!tick.getprestatus()){//sysj\loaderController.sysj line: 72, column: 10
              S1501=23;
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
          
          case 23 : 
            if(tick.getprestatus()){//sysj\loaderController.sysj line: 73, column: 10
              S1501=24;
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
          
          case 24 : 
            S1501=24;
            S1501=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread1876(int [] tdone, int [] ends){
        S1871=1;
    S1859=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread1875(int [] tdone, int [] ends){
        S1857=1;
    S1501=0;
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
      switch(S1873){
        case 0 : 
          S1873=0;
          break RUN;
        
        case 1 : 
          S1873=2;
          S1873=2;
          thread1875(tdone,ends);
          thread1876(tdone,ends);
          int biggest1877 = 0;
          if(ends[2]>=biggest1877){
            biggest1877=ends[2];
          }
          if(ends[3]>=biggest1877){
            biggest1877=ends[3];
          }
          if(biggest1877 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread1878(tdone,ends);
          thread1879(tdone,ends);
          int biggest1880 = 0;
          if(ends[2]>=biggest1880){
            biggest1880=ends[2];
          }
          if(ends[3]>=biggest1880){
            biggest1880=ends[3];
          }
          if(biggest1880 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1880 == 0){
            S1873=0;
            active[1]=0;
            ends[1]=0;
            S1873=0;
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
