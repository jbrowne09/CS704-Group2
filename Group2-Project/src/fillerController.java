import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class fillerController extends ClockDomain{
  public fillerController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal canBottom = new Signal("canBottom", Signal.INPUT);
  public Signal canTop = new Signal("canTop", Signal.INPUT);
  public Signal fillerEnable = new Signal("fillerEnable", Signal.INPUT);
  public Signal tick = new Signal("tick", Signal.INPUT);
  public Signal inletOn = new Signal("inletOn", Signal.OUTPUT);
  public Signal injectorOn = new Signal("injectorOn", Signal.OUTPUT);
  public Signal valveRetract = new Signal("valveRetract", Signal.OUTPUT);
  public Signal valveExtend = new Signal("valveExtend", Signal.OUTPUT);
  public Signal fillerDone = new Signal("fillerDone", Signal.OUTPUT);
  private int S1300 = 1;
  private int S1106 = 1;
  private int S1092 = 1;
  private int S1111 = 1;
  private int S1116 = 1;
  
  private int[] ends = new int[6];
  private int[] tdone = new int[6];
  
  public void thread1315(int [] tdone, int [] ends){
        switch(S1116){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        valveExtend.setPresent();//sysj\fillerController.sysj line: 21, column: 5
        currsigs.addElement(valveExtend);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
        break;
      
    }
  }

  public void thread1314(int [] tdone, int [] ends){
        switch(S1111){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        inletOn.setPresent();//sysj\fillerController.sysj line: 19, column: 5
        currsigs.addElement(inletOn);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
        break;
      
    }
  }

  public void thread1312(int [] tdone, int [] ends){
        S1116=1;
    valveExtend.setPresent();//sysj\fillerController.sysj line: 21, column: 5
    currsigs.addElement(valveExtend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread1311(int [] tdone, int [] ends){
        S1111=1;
    inletOn.setPresent();//sysj\fillerController.sysj line: 19, column: 5
    currsigs.addElement(inletOn);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread1309(int [] tdone, int [] ends){
        active[3]=0;
    ends[3]=0;
    tdone[3]=1;
  }

  public void thread1308(int [] tdone, int [] ends){
        switch(S1092){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        injectorOn.setPresent();//sysj\fillerController.sysj line: 11, column: 5
        currsigs.addElement(injectorOn);
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
        break;
      
    }
  }

  public void thread1306(int [] tdone, int [] ends){
        S1116=1;
    valveExtend.setPresent();//sysj\fillerController.sysj line: 21, column: 5
    currsigs.addElement(valveExtend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread1305(int [] tdone, int [] ends){
        S1111=1;
    inletOn.setPresent();//sysj\fillerController.sysj line: 19, column: 5
    currsigs.addElement(inletOn);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread1303(int [] tdone, int [] ends){
        if(canBottom.getprestatus()){//sysj\fillerController.sysj line: 13, column: 14
      valveRetract.setPresent();//sysj\fillerController.sysj line: 14, column: 5
      currsigs.addElement(valveRetract);
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
    else {
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
  }

  public void thread1302(int [] tdone, int [] ends){
        S1092=1;
    injectorOn.setPresent();//sysj\fillerController.sysj line: 11, column: 5
    currsigs.addElement(injectorOn);
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
      switch(S1300){
        case 0 : 
          S1300=0;
          break RUN;
        
        case 1 : 
          S1300=2;
          S1300=2;
          S1106=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          switch(S1106){
            case 0 : 
              if(tick.getprestatus()){//sysj\fillerController.sysj line: 9, column: 9
                S1106=1;
                thread1302(tdone,ends);
                thread1303(tdone,ends);
                int biggest1304 = 0;
                if(ends[2]>=biggest1304){
                  biggest1304=ends[2];
                }
                if(ends[3]>=biggest1304){
                  biggest1304=ends[3];
                }
                if(biggest1304 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 1 : 
              if(canTop.getprestatus()){//sysj\fillerController.sysj line: 10, column: 9
                S1106=2;
                thread1305(tdone,ends);
                thread1306(tdone,ends);
                int biggest1307 = 0;
                if(ends[4]>=biggest1307){
                  biggest1307=ends[4];
                }
                if(ends[5]>=biggest1307){
                  biggest1307=ends[5];
                }
                if(biggest1307 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                thread1308(tdone,ends);
                thread1309(tdone,ends);
                int biggest1310 = 0;
                if(ends[2]>=biggest1310){
                  biggest1310=ends[2];
                }
                if(ends[3]>=biggest1310){
                  biggest1310=ends[3];
                }
                if(biggest1310 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest1310 == 0){
                  S1106=2;
                  thread1311(tdone,ends);
                  thread1312(tdone,ends);
                  int biggest1313 = 0;
                  if(ends[4]>=biggest1313){
                    biggest1313=ends[4];
                  }
                  if(ends[5]>=biggest1313){
                    biggest1313=ends[5];
                  }
                  if(biggest1313 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
              }
            
            case 2 : 
              if(canBottom.getprestatus()){//sysj\fillerController.sysj line: 18, column: 9
                fillerDone.setPresent();//sysj\fillerController.sysj line: 23, column: 3
                currsigs.addElement(fillerDone);
                S1106=0;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                thread1314(tdone,ends);
                thread1315(tdone,ends);
                int biggest1316 = 0;
                if(ends[4]>=biggest1316){
                  biggest1316=ends[4];
                }
                if(ends[5]>=biggest1316){
                  biggest1316=ends[5];
                }
                if(biggest1316 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest1316 == 0){
                  fillerDone.setPresent();//sysj\fillerController.sysj line: 23, column: 3
                  currsigs.addElement(fillerDone);
                  S1106=0;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
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
          canBottom.gethook();
          canTop.gethook();
          fillerEnable.gethook();
          tick.gethook();
          df = true;
        }
        runClockDomain();
      }
      canBottom.setpreclear();
      canTop.setpreclear();
      fillerEnable.setpreclear();
      tick.setpreclear();
      inletOn.setpreclear();
      injectorOn.setpreclear();
      valveRetract.setpreclear();
      valveExtend.setpreclear();
      fillerDone.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = canBottom.getStatus() ? canBottom.setprepresent() : canBottom.setpreclear();
      canBottom.setpreval(canBottom.getValue());
      canBottom.setClear();
      dummyint = canTop.getStatus() ? canTop.setprepresent() : canTop.setpreclear();
      canTop.setpreval(canTop.getValue());
      canTop.setClear();
      dummyint = fillerEnable.getStatus() ? fillerEnable.setprepresent() : fillerEnable.setpreclear();
      fillerEnable.setpreval(fillerEnable.getValue());
      fillerEnable.setClear();
      dummyint = tick.getStatus() ? tick.setprepresent() : tick.setpreclear();
      tick.setpreval(tick.getValue());
      tick.setClear();
      inletOn.sethook();
      inletOn.setClear();
      injectorOn.sethook();
      injectorOn.setClear();
      valveRetract.sethook();
      valveRetract.setClear();
      valveExtend.sethook();
      valveExtend.setClear();
      fillerDone.sethook();
      fillerDone.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        canBottom.gethook();
        canTop.gethook();
        fillerEnable.gethook();
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
