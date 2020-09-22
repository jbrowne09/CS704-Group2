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
  private int S5346 = 1;
  private int S5336 = 1;
  private int S5095 = 1;
  private int S5112 = 1;
  private int S5117 = 1;
  private int S5344 = 1;
  
  private int[] ends = new int[6];
  private int[] tdone = new int[6];
  
  public void thread5358(int [] tdone, int [] ends){
        switch(S5344){
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

  public void thread5356(int [] tdone, int [] ends){
        switch(S5117){
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

  public void thread5355(int [] tdone, int [] ends){
        switch(S5112){
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

  public void thread5353(int [] tdone, int [] ends){
        S5117=1;
    getBottle.setPresent();//sysj\loaderController.sysj line: 23, column: 6
    currsigs.addElement(getBottle);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread5352(int [] tdone, int [] ends){
        S5112=1;
    CMD.setPresent();//sysj\loaderController.sysj line: 21, column: 6
    currsigs.addElement(CMD);
    CMD.setValue("G");//sysj\loaderController.sysj line: 21, column: 6
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread5351(int [] tdone, int [] ends){
        switch(S5336){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S5095){
          case 0 : 
            if(bottleToLoad.getprestatus()){//sysj\loaderController.sysj line: 12, column: 10
              S5095=1;
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
              S5095=2;
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
              S5095=3;
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
              S5095=4;
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
              S5095=5;
              thread5352(tdone,ends);
              thread5353(tdone,ends);
              int biggest5354 = 0;
              if(ends[3]>=biggest5354){
                biggest5354=ends[3];
              }
              if(ends[4]>=biggest5354){
                biggest5354=ends[4];
              }
              if(biggest5354 == 1){
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
              S5095=6;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              thread5355(tdone,ends);
              thread5356(tdone,ends);
              int biggest5357 = 0;
              if(ends[3]>=biggest5357){
                biggest5357=ends[3];
              }
              if(ends[4]>=biggest5357){
                biggest5357=ends[4];
              }
              if(biggest5357 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest5357 == 0){
                S5095=6;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            break;
          
          case 6 : 
            if(!tick.getprestatus()){//sysj\loaderController.sysj line: 26, column: 10
              S5095=7;
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
              S5095=8;
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
              S5095=9;
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
              S5095=10;
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
              S5095=11;
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
              S5095=12;
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
              S5095=13;
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
              S5095=14;
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
              S5095=0;
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

  public void thread5349(int [] tdone, int [] ends){
        S5344=1;
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

  public void thread5348(int [] tdone, int [] ends){
        S5336=1;
    S5095=0;
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
      switch(S5346){
        case 0 : 
          S5346=0;
          break RUN;
        
        case 1 : 
          S5346=2;
          S5346=2;
          thread5348(tdone,ends);
          thread5349(tdone,ends);
          int biggest5350 = 0;
          if(ends[2]>=biggest5350){
            biggest5350=ends[2];
          }
          if(ends[5]>=biggest5350){
            biggest5350=ends[5];
          }
          if(biggest5350 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread5351(tdone,ends);
          thread5358(tdone,ends);
          int biggest5359 = 0;
          if(ends[2]>=biggest5359){
            biggest5359=ends[2];
          }
          if(ends[5]>=biggest5359){
            biggest5359=ends[5];
          }
          if(biggest5359 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest5359 == 0){
            S5346=0;
            active[1]=0;
            ends[1]=0;
            S5346=0;
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
