import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class caploaderController extends ClockDomain{
  public caploaderController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal armAtDest = new Signal("armAtDest", Signal.INPUT);
  public Signal armAtSource = new Signal("armAtSource", Signal.INPUT);
  public Signal pusherRetracted = new Signal("pusherRetracted", Signal.INPUT);
  public Signal pusherExtended = new Signal("pusherExtended", Signal.INPUT);
  public Signal WPgripped = new Signal("WPgripped", Signal.INPUT);
  public Signal tick = new Signal("tick", Signal.INPUT);
  public Signal caploaderEnable = new Signal("caploaderEnable", Signal.INPUT);
  public Signal armSource = new Signal("armSource", Signal.OUTPUT);
  public Signal armDest = new Signal("armDest", Signal.OUTPUT);
  public Signal pusherExtend = new Signal("pusherExtend", Signal.OUTPUT);
  public Signal vacOn = new Signal("vacOn", Signal.OUTPUT);
  public Signal caploaderDone = new Signal("caploaderDone", Signal.OUTPUT);
  private int S166 = 1;
  private int S3 = 1;
  private int S26 = 1;
  private int S31 = 1;
  
  private int[] ends = new int[4];
  private int[] tdone = new int[4];
  
  public void thread172(int [] tdone, int [] ends){
        switch(S31){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        armDest.setPresent();//sysj\caploaderController.sysj line: 20, column: 5
        currsigs.addElement(armDest);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread171(int [] tdone, int [] ends){
        switch(S26){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        vacOn.setPresent();//sysj\caploaderController.sysj line: 18, column: 5
        currsigs.addElement(vacOn);
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
        break;
      
    }
  }

  public void thread169(int [] tdone, int [] ends){
        S31=1;
    armDest.setPresent();//sysj\caploaderController.sysj line: 20, column: 5
    currsigs.addElement(armDest);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread168(int [] tdone, int [] ends){
        S26=1;
    vacOn.setPresent();//sysj\caploaderController.sysj line: 18, column: 5
    currsigs.addElement(vacOn);
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
      switch(S166){
        case 0 : 
          S166=0;
          break RUN;
        
        case 1 : 
          S166=2;
          S166=2;
          S3=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          switch(S3){
            case 0 : 
              if(caploaderEnable.getprestatus()){//sysj\caploaderController.sysj line: 8, column: 9
                S3=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 1 : 
              if(tick.getprestatus()){//sysj\caploaderController.sysj line: 9, column: 9
                S3=2;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 2 : 
              if(!tick.getprestatus()){//sysj\caploaderController.sysj line: 10, column: 9
                S3=3;
                pusherExtend.setPresent();//sysj\caploaderController.sysj line: 12, column: 4
                currsigs.addElement(pusherExtend);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 3 : 
              if(tick.getprestatus()){//sysj\caploaderController.sysj line: 11, column: 9
                S3=4;
                armSource.setPresent();//sysj\caploaderController.sysj line: 15, column: 4
                currsigs.addElement(armSource);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                pusherExtend.setPresent();//sysj\caploaderController.sysj line: 12, column: 4
                currsigs.addElement(pusherExtend);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 4 : 
              if(tick.getprestatus()){//sysj\caploaderController.sysj line: 14, column: 9
                S3=5;
                thread168(tdone,ends);
                thread169(tdone,ends);
                int biggest170 = 0;
                if(ends[2]>=biggest170){
                  biggest170=ends[2];
                }
                if(ends[3]>=biggest170){
                  biggest170=ends[3];
                }
                if(biggest170 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                armSource.setPresent();//sysj\caploaderController.sysj line: 15, column: 4
                currsigs.addElement(armSource);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 5 : 
              if(tick.getprestatus()){//sysj\caploaderController.sysj line: 17, column: 9
                S3=6;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                thread171(tdone,ends);
                thread172(tdone,ends);
                int biggest173 = 0;
                if(ends[2]>=biggest173){
                  biggest173=ends[2];
                }
                if(ends[3]>=biggest173){
                  biggest173=ends[3];
                }
                if(biggest173 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest173 == 0){
                  S3=6;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
            case 6 : 
              if(!tick.getprestatus()){//sysj\caploaderController.sysj line: 22, column: 9
                S3=7;
                caploaderDone.setPresent();//sysj\caploaderController.sysj line: 24, column: 4
                currsigs.addElement(caploaderDone);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 7 : 
              if(!caploaderEnable.getprestatus()){//sysj\caploaderController.sysj line: 23, column: 9
                S3=0;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                caploaderDone.setPresent();//sysj\caploaderController.sysj line: 24, column: 4
                currsigs.addElement(caploaderDone);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
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
          armAtDest.gethook();
          armAtSource.gethook();
          pusherRetracted.gethook();
          pusherExtended.gethook();
          WPgripped.gethook();
          tick.gethook();
          caploaderEnable.gethook();
          df = true;
        }
        runClockDomain();
      }
      armAtDest.setpreclear();
      armAtSource.setpreclear();
      pusherRetracted.setpreclear();
      pusherExtended.setpreclear();
      WPgripped.setpreclear();
      tick.setpreclear();
      caploaderEnable.setpreclear();
      armSource.setpreclear();
      armDest.setpreclear();
      pusherExtend.setpreclear();
      vacOn.setpreclear();
      caploaderDone.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = armAtDest.getStatus() ? armAtDest.setprepresent() : armAtDest.setpreclear();
      armAtDest.setpreval(armAtDest.getValue());
      armAtDest.setClear();
      dummyint = armAtSource.getStatus() ? armAtSource.setprepresent() : armAtSource.setpreclear();
      armAtSource.setpreval(armAtSource.getValue());
      armAtSource.setClear();
      dummyint = pusherRetracted.getStatus() ? pusherRetracted.setprepresent() : pusherRetracted.setpreclear();
      pusherRetracted.setpreval(pusherRetracted.getValue());
      pusherRetracted.setClear();
      dummyint = pusherExtended.getStatus() ? pusherExtended.setprepresent() : pusherExtended.setpreclear();
      pusherExtended.setpreval(pusherExtended.getValue());
      pusherExtended.setClear();
      dummyint = WPgripped.getStatus() ? WPgripped.setprepresent() : WPgripped.setpreclear();
      WPgripped.setpreval(WPgripped.getValue());
      WPgripped.setClear();
      dummyint = tick.getStatus() ? tick.setprepresent() : tick.setpreclear();
      tick.setpreval(tick.getValue());
      tick.setClear();
      dummyint = caploaderEnable.getStatus() ? caploaderEnable.setprepresent() : caploaderEnable.setpreclear();
      caploaderEnable.setpreval(caploaderEnable.getValue());
      caploaderEnable.setClear();
      armSource.sethook();
      armSource.setClear();
      armDest.sethook();
      armDest.setClear();
      pusherExtend.sethook();
      pusherExtend.setClear();
      vacOn.sethook();
      vacOn.setClear();
      caploaderDone.sethook();
      caploaderDone.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        armAtDest.gethook();
        armAtSource.gethook();
        pusherRetracted.gethook();
        pusherExtended.gethook();
        WPgripped.gethook();
        tick.gethook();
        caploaderEnable.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
