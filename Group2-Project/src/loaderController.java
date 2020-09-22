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
  private int S2882 = 1;
  private int S2872 = 1;
  private int S2631 = 1;
  private int S2648 = 1;
  private int S2653 = 1;
  private int S2880 = 1;
  
  private int[] ends = new int[6];
  private int[] tdone = new int[6];
  
  public void thread2894(int [] tdone, int [] ends){
        switch(S2880){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(loaderDone.getprestatus()){//sysj\loaderController.sysj line: 52, column: 24
          NloaderDone.setPresent();//sysj\loaderController.sysj line: 52, column: 37
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

  public void thread2892(int [] tdone, int [] ends){
        switch(S2653){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        getBottle.setPresent();//sysj\loaderController.sysj line: 23, column: 6
        currsigs.addElement(getBottle);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
        break;
      
    }
  }

  public void thread2891(int [] tdone, int [] ends){
        switch(S2648){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        CMD.setPresent();//sysj\loaderController.sysj line: 21, column: 6
        currsigs.addElement(CMD);
        CMD.setValue("G");//sysj\loaderController.sysj line: 21, column: 6
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread2889(int [] tdone, int [] ends){
        S2653=1;
    getBottle.setPresent();//sysj\loaderController.sysj line: 23, column: 6
    currsigs.addElement(getBottle);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread2888(int [] tdone, int [] ends){
        S2648=1;
    CMD.setPresent();//sysj\loaderController.sysj line: 21, column: 6
    currsigs.addElement(CMD);
    CMD.setValue("G");//sysj\loaderController.sysj line: 21, column: 6
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread2887(int [] tdone, int [] ends){
        switch(S2872){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S2631){
          case 0 : 
            if(bottleToLoad.getprestatus()){//sysj\loaderController.sysj line: 12, column: 10
              S2631=1;
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
              S2631=2;
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
              S2631=3;
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
              S2631=4;
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
              S2631=5;
              thread2888(tdone,ends);
              thread2889(tdone,ends);
              int biggest2890 = 0;
              if(ends[3]>=biggest2890){
                biggest2890=ends[3];
              }
              if(ends[4]>=biggest2890){
                biggest2890=ends[4];
              }
              if(biggest2890 == 1){
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
          
          case 5 : 
            if(tick.getprestatus()){//sysj\loaderController.sysj line: 20, column: 10
              S2631=6;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              thread2891(tdone,ends);
              thread2892(tdone,ends);
              int biggest2893 = 0;
              if(ends[3]>=biggest2893){
                biggest2893=ends[3];
              }
              if(ends[4]>=biggest2893){
                biggest2893=ends[4];
              }
              if(biggest2893 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest2893 == 0){
                S2631=6;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            break;
          
          case 6 : 
            if(!tick.getprestatus()){//sysj\loaderController.sysj line: 26, column: 10
              S2631=7;
              CMD.setPresent();//sysj\loaderController.sysj line: 28, column: 5
              currsigs.addElement(CMD);
              CMD.setValue("C");//sysj\loaderController.sysj line: 28, column: 5
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
              S2631=8;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              CMD.setPresent();//sysj\loaderController.sysj line: 28, column: 5
              currsigs.addElement(CMD);
              CMD.setValue("C");//sysj\loaderController.sysj line: 28, column: 5
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 8 : 
            if(!tick.getprestatus()){//sysj\loaderController.sysj line: 32, column: 10
              S2631=9;
              CMD.setPresent();//sysj\loaderController.sysj line: 34, column: 5
              currsigs.addElement(CMD);
              CMD.setValue("O");//sysj\loaderController.sysj line: 34, column: 5
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
            if(tick.getprestatus()){//sysj\loaderController.sysj line: 33, column: 10
              S2631=10;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              CMD.setPresent();//sysj\loaderController.sysj line: 34, column: 5
              currsigs.addElement(CMD);
              CMD.setValue("O");//sysj\loaderController.sysj line: 34, column: 5
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 10 : 
            if(!tick.getprestatus()){//sysj\loaderController.sysj line: 37, column: 10
              S2631=11;
              CMD.setPresent();//sysj\loaderController.sysj line: 39, column: 5
              currsigs.addElement(CMD);
              CMD.setValue("A");//sysj\loaderController.sysj line: 39, column: 5
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
            if(tick.getprestatus()){//sysj\loaderController.sysj line: 38, column: 10
              S2631=12;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              CMD.setPresent();//sysj\loaderController.sysj line: 39, column: 5
              currsigs.addElement(CMD);
              CMD.setValue("A");//sysj\loaderController.sysj line: 39, column: 5
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 12 : 
            if(!tick.getprestatus()){//sysj\loaderController.sysj line: 42, column: 10
              S2631=13;
              loaderDone.setPresent();//sysj\loaderController.sysj line: 44, column: 5
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
            if(tick.getprestatus()){//sysj\loaderController.sysj line: 43, column: 10
              S2631=14;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              loaderDone.setPresent();//sysj\loaderController.sysj line: 44, column: 5
              currsigs.addElement(loaderDone);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 14 : 
            if(!tick.getprestatus()){//sysj\loaderController.sysj line: 46, column: 10
              S2631=0;
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

  public void thread2885(int [] tdone, int [] ends){
        S2880=1;
    if(loaderDone.getprestatus()){//sysj\loaderController.sysj line: 52, column: 24
      NloaderDone.setPresent();//sysj\loaderController.sysj line: 52, column: 37
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

  public void thread2884(int [] tdone, int [] ends){
        S2872=1;
    S2631=0;
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
      switch(S2882){
        case 0 : 
          S2882=0;
          break RUN;
        
        case 1 : 
          S2882=2;
          S2882=2;
          thread2884(tdone,ends);
          thread2885(tdone,ends);
          int biggest2886 = 0;
          if(ends[2]>=biggest2886){
            biggest2886=ends[2];
          }
          if(ends[5]>=biggest2886){
            biggest2886=ends[5];
          }
          if(biggest2886 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread2887(tdone,ends);
          thread2894(tdone,ends);
          int biggest2895 = 0;
          if(ends[2]>=biggest2895){
            biggest2895=ends[2];
          }
          if(ends[5]>=biggest2895){
            biggest2895=ends[5];
          }
          if(biggest2895 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2895 == 0){
            S2882=0;
            active[1]=0;
            ends[1]=0;
            S2882=0;
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
