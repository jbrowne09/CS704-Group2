import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class Controller extends ClockDomain{
  public Controller(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal pusherRetracted = new Signal("pusherRetracted", Signal.INPUT);
  public Signal pusherExtended = new Signal("pusherExtended", Signal.INPUT);
  public Signal WPgripped = new Signal("WPgripped", Signal.INPUT);
  public Signal armAtSource = new Signal("armAtSource", Signal.INPUT);
  public Signal armAtDest = new Signal("armAtDest", Signal.INPUT);
  public Signal empty = new Signal("empty", Signal.INPUT);
  public Signal request = new Signal("request", Signal.INPUT);
  public Signal mode = new Signal("mode", Signal.INPUT);
  public Signal pusherExtendM = new Signal("pusherExtendM", Signal.INPUT);
  public Signal vacOnM = new Signal("vacOnM", Signal.INPUT);
  public Signal armSourceM = new Signal("armSourceM", Signal.INPUT);
  public Signal armDestM = new Signal("armDestM", Signal.INPUT);
  public Signal pusherExtend = new Signal("pusherExtend", Signal.OUTPUT);
  public Signal vacOn = new Signal("vacOn", Signal.OUTPUT);
  public Signal armSource = new Signal("armSource", Signal.OUTPUT);
  public Signal armDest = new Signal("armDest", Signal.OUTPUT);
  private int opMode_thread_1;//sysj\wLoaderController.sysj line: 10, column: 3
  private int S3202 = 1;
  private int S2840 = 1;
  private int S2783 = 1;
  private int S2812 = 1;
  private int S2811 = 1;
  
  private int[] ends = new int[4];
  private int[] tdone = new int[4];
  
  public void thread3208(int [] tdone, int [] ends){
        switch(S2812){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S2811){
          case 0 : 
            if(WPgripped.getprestatus()){//sysj\wLoaderController.sysj line: 33, column: 14
              S2811=1;
              armDest.setPresent();//sysj\wLoaderController.sysj line: 34, column: 8
              currsigs.addElement(armDest);
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
            armDest.setPresent();//sysj\wLoaderController.sysj line: 34, column: 8
            currsigs.addElement(armDest);
            active[3]=1;
            ends[3]=1;
            tdone[3]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread3207(int [] tdone, int [] ends){
        active[2]=0;
    ends[2]=0;
    tdone[2]=1;
  }

  public void thread3205(int [] tdone, int [] ends){
        S2812=1;
    S2811=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread3204(int [] tdone, int [] ends){
        vacOn.setPresent();//sysj\wLoaderController.sysj line: 29, column: 8
    currsigs.addElement(vacOn);
    active[2]=0;
    ends[2]=0;
    tdone[2]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S3202){
        case 0 : 
          S3202=0;
          break RUN;
        
        case 1 : 
          S3202=2;
          S3202=2;
          opMode_thread_1 = 0;//sysj\wLoaderController.sysj line: 10, column: 3
          S2840=0;
          if(request.getprestatus()){//sysj\wLoaderController.sysj line: 12, column: 12
            if(opMode_thread_1 == 0){//sysj\wLoaderController.sysj line: 13, column: 8
              S2783=0;
              if(empty.getprestatus()){//sysj\wLoaderController.sysj line: 14, column: 14
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                S2783=1;
                armDest.setPresent();//sysj\wLoaderController.sysj line: 18, column: 7
                currsigs.addElement(armDest);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            }
            else {
              if(opMode_thread_1 == 1) {//sysj\wLoaderController.sysj line: 42, column: 20
              }
              S2840=1;
              active[1]=1;
              ends[1]=1;
              break RUN;
            }
          }
          else {
            S2840=1;
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          switch(S2840){
            case 0 : 
              switch(S2783){
                case 0 : 
                  if(!empty.getprestatus()){//sysj\wLoaderController.sysj line: 15, column: 13
                    S2783=1;
                    armDest.setPresent();//sysj\wLoaderController.sysj line: 18, column: 7
                    currsigs.addElement(armDest);
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
                  if(armAtDest.getprestatus()){//sysj\wLoaderController.sysj line: 17, column: 12
                    S2783=2;
                    pusherExtend.setPresent();//sysj\wLoaderController.sysj line: 21, column: 7
                    currsigs.addElement(pusherExtend);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    armDest.setPresent();//sysj\wLoaderController.sysj line: 18, column: 7
                    currsigs.addElement(armDest);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 2 : 
                  if(pusherExtended.getprestatus()){//sysj\wLoaderController.sysj line: 20, column: 12
                    S2783=3;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    pusherExtend.setPresent();//sysj\wLoaderController.sysj line: 21, column: 7
                    currsigs.addElement(pusherExtend);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 3 : 
                  if(pusherRetracted.getprestatus()){//sysj\wLoaderController.sysj line: 23, column: 12
                    S2783=4;
                    armSource.setPresent();//sysj\wLoaderController.sysj line: 25, column: 7
                    currsigs.addElement(armSource);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 4 : 
                  if(armAtSource.getprestatus()){//sysj\wLoaderController.sysj line: 24, column: 12
                    S2783=5;
                    thread3204(tdone,ends);
                    thread3205(tdone,ends);
                    int biggest3206 = 0;
                    if(ends[2]>=biggest3206){
                      biggest3206=ends[2];
                    }
                    if(ends[3]>=biggest3206){
                      biggest3206=ends[3];
                    }
                    if(biggest3206 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    armSource.setPresent();//sysj\wLoaderController.sysj line: 25, column: 7
                    currsigs.addElement(armSource);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 5 : 
                  if(armAtDest.getprestatus()){//sysj\wLoaderController.sysj line: 27, column: 12
                    S2783=6;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    thread3207(tdone,ends);
                    thread3208(tdone,ends);
                    int biggest3209 = 0;
                    if(ends[2]>=biggest3209){
                      biggest3209=ends[2];
                    }
                    if(ends[3]>=biggest3209){
                      biggest3209=ends[3];
                    }
                    if(biggest3209 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    //FINXME code
                    if(biggest3209 == 0){
                      S2783=6;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                
                case 6 : 
                  if(!WPgripped.getprestatus()){//sysj\wLoaderController.sysj line: 37, column: 12
                    S2783=7;
                    armSource.setPresent();//sysj\wLoaderController.sysj line: 39, column: 7
                    currsigs.addElement(armSource);
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
                  if(armAtSource.getprestatus()){//sysj\wLoaderController.sysj line: 38, column: 12
                    if(opMode_thread_1 == 1) {//sysj\wLoaderController.sysj line: 42, column: 20
                    }
                    S2840=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    armSource.setPresent();//sysj\wLoaderController.sysj line: 39, column: 7
                    currsigs.addElement(armSource);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
              }
              break;
            
            case 1 : 
              S2840=1;
              S2840=0;
              if(request.getprestatus()){//sysj\wLoaderController.sysj line: 12, column: 12
                if(opMode_thread_1 == 0){//sysj\wLoaderController.sysj line: 13, column: 8
                  S2783=0;
                  if(empty.getprestatus()){//sysj\wLoaderController.sysj line: 14, column: 14
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S2783=1;
                    armDest.setPresent();//sysj\wLoaderController.sysj line: 18, column: 7
                    currsigs.addElement(armDest);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
                else {
                  if(opMode_thread_1 == 1) {//sysj\wLoaderController.sysj line: 42, column: 20
                  }
                  S2840=1;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                S2840=1;
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
          pusherRetracted.gethook();
          pusherExtended.gethook();
          WPgripped.gethook();
          armAtSource.gethook();
          armAtDest.gethook();
          empty.gethook();
          request.gethook();
          mode.gethook();
          pusherExtendM.gethook();
          vacOnM.gethook();
          armSourceM.gethook();
          armDestM.gethook();
          df = true;
        }
        runClockDomain();
      }
      pusherRetracted.setpreclear();
      pusherExtended.setpreclear();
      WPgripped.setpreclear();
      armAtSource.setpreclear();
      armAtDest.setpreclear();
      empty.setpreclear();
      request.setpreclear();
      mode.setpreclear();
      pusherExtendM.setpreclear();
      vacOnM.setpreclear();
      armSourceM.setpreclear();
      armDestM.setpreclear();
      pusherExtend.setpreclear();
      vacOn.setpreclear();
      armSource.setpreclear();
      armDest.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = pusherRetracted.getStatus() ? pusherRetracted.setprepresent() : pusherRetracted.setpreclear();
      pusherRetracted.setpreval(pusherRetracted.getValue());
      pusherRetracted.setClear();
      dummyint = pusherExtended.getStatus() ? pusherExtended.setprepresent() : pusherExtended.setpreclear();
      pusherExtended.setpreval(pusherExtended.getValue());
      pusherExtended.setClear();
      dummyint = WPgripped.getStatus() ? WPgripped.setprepresent() : WPgripped.setpreclear();
      WPgripped.setpreval(WPgripped.getValue());
      WPgripped.setClear();
      dummyint = armAtSource.getStatus() ? armAtSource.setprepresent() : armAtSource.setpreclear();
      armAtSource.setpreval(armAtSource.getValue());
      armAtSource.setClear();
      dummyint = armAtDest.getStatus() ? armAtDest.setprepresent() : armAtDest.setpreclear();
      armAtDest.setpreval(armAtDest.getValue());
      armAtDest.setClear();
      dummyint = empty.getStatus() ? empty.setprepresent() : empty.setpreclear();
      empty.setpreval(empty.getValue());
      empty.setClear();
      dummyint = request.getStatus() ? request.setprepresent() : request.setpreclear();
      request.setpreval(request.getValue());
      request.setClear();
      dummyint = mode.getStatus() ? mode.setprepresent() : mode.setpreclear();
      mode.setpreval(mode.getValue());
      mode.setClear();
      dummyint = pusherExtendM.getStatus() ? pusherExtendM.setprepresent() : pusherExtendM.setpreclear();
      pusherExtendM.setpreval(pusherExtendM.getValue());
      pusherExtendM.setClear();
      dummyint = vacOnM.getStatus() ? vacOnM.setprepresent() : vacOnM.setpreclear();
      vacOnM.setpreval(vacOnM.getValue());
      vacOnM.setClear();
      dummyint = armSourceM.getStatus() ? armSourceM.setprepresent() : armSourceM.setpreclear();
      armSourceM.setpreval(armSourceM.getValue());
      armSourceM.setClear();
      dummyint = armDestM.getStatus() ? armDestM.setprepresent() : armDestM.setpreclear();
      armDestM.setpreval(armDestM.getValue());
      armDestM.setClear();
      pusherExtend.sethook();
      pusherExtend.setClear();
      vacOn.sethook();
      vacOn.setClear();
      armSource.sethook();
      armSource.setClear();
      armDest.sethook();
      armDest.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        pusherRetracted.gethook();
        pusherExtended.gethook();
        WPgripped.gethook();
        armAtSource.gethook();
        armAtDest.gethook();
        empty.gethook();
        request.gethook();
        mode.gethook();
        pusherExtendM.gethook();
        vacOnM.gethook();
        armSourceM.gethook();
        armDestM.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
