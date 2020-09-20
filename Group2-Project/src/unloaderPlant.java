import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class unloaderPlant extends ClockDomain{
  public unloaderPlant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal CMD2 = new Signal("CMD2", Signal.INPUT);
  public Signal posB2S = new Signal("posB2S", Signal.OUTPUT);
  public Signal posC2S = new Signal("posC2S", Signal.OUTPUT);
  public Signal posD2S = new Signal("posD2S", Signal.OUTPUT);
  public Signal posA2S = new Signal("posA2S", Signal.OUTPUT);
  public Signal closeGripper2S = new Signal("closeGripper2S", Signal.OUTPUT);
  public Signal openGripper2S = new Signal("openGripper2S", Signal.OUTPUT);
  public Signal CMDfd = new Signal("CMDfd", Signal.OUTPUT);
  private int S2031 = 1;
  private int S2001 = 1;
  
  private int[] ends = new int[2];
  private int[] tdone = new int[2];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S2031){
        case 0 : 
          S2031=0;
          break RUN;
        
        case 1 : 
          S2031=2;
          S2031=2;
          S2001=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          switch(S2001){
            case 0 : 
              if(CMD2.getprestatus()){//sysj\nloaderPlant.sysj line: 9, column: 9
                if((CMD2.getpreval() == null ? null : ((String)CMD2.getpreval())).equals("B2")){//sysj\nloaderPlant.sysj line: 10, column: 3
                  posB2S.setPresent();//sysj\nloaderPlant.sysj line: 11, column: 4
                  currsigs.addElement(posB2S);
                  CMDfd.setPresent();//sysj\nloaderPlant.sysj line: 31, column: 3
                  currsigs.addElement(CMDfd);
                  S2001=1;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  if((CMD2.getpreval() == null ? null : ((String)CMD2.getpreval())).equals("C2")){//sysj\nloaderPlant.sysj line: 13, column: 8
                    posC2S.setPresent();//sysj\nloaderPlant.sysj line: 14, column: 4
                    currsigs.addElement(posC2S);
                    CMDfd.setPresent();//sysj\nloaderPlant.sysj line: 31, column: 3
                    currsigs.addElement(CMDfd);
                    S2001=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    if((CMD2.getpreval() == null ? null : ((String)CMD2.getpreval())).equals("D2")){//sysj\nloaderPlant.sysj line: 16, column: 8
                      posD2S.setPresent();//sysj\nloaderPlant.sysj line: 17, column: 4
                      currsigs.addElement(posD2S);
                      CMDfd.setPresent();//sysj\nloaderPlant.sysj line: 31, column: 3
                      currsigs.addElement(CMDfd);
                      S2001=1;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      if((CMD2.getpreval() == null ? null : ((String)CMD2.getpreval())).equals("A2")){//sysj\nloaderPlant.sysj line: 19, column: 8
                        posA2S.setPresent();//sysj\nloaderPlant.sysj line: 20, column: 4
                        currsigs.addElement(posA2S);
                        CMDfd.setPresent();//sysj\nloaderPlant.sysj line: 31, column: 3
                        currsigs.addElement(CMDfd);
                        S2001=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        if((CMD2.getpreval() == null ? null : ((String)CMD2.getpreval())).equals("G2")){//sysj\nloaderPlant.sysj line: 22, column: 8
                          closeGripper2S.setPresent();//sysj\nloaderPlant.sysj line: 23, column: 4
                          currsigs.addElement(closeGripper2S);
                          CMDfd.setPresent();//sysj\nloaderPlant.sysj line: 31, column: 3
                          currsigs.addElement(CMDfd);
                          S2001=1;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        else {
                          if((CMD2.getpreval() == null ? null : ((String)CMD2.getpreval())).equals("O2")){//sysj\nloaderPlant.sysj line: 25, column: 8
                            openGripper2S.setPresent();//sysj\nloaderPlant.sysj line: 26, column: 4
                            currsigs.addElement(openGripper2S);
                            CMDfd.setPresent();//sysj\nloaderPlant.sysj line: 31, column: 3
                            currsigs.addElement(CMDfd);
                            S2001=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            System.out.println("CMD2 not working " + (CMD2.getpreval() == null ? null : ((String)CMD2.getpreval())));//sysj\nloaderPlant.sysj line: 29, column: 4
                            CMDfd.setPresent();//sysj\nloaderPlant.sysj line: 31, column: 3
                            currsigs.addElement(CMDfd);
                            S2001=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                      }
                    }
                  }
                }
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 1 : 
              S2001=1;
              S2001=0;
              active[1]=1;
              ends[1]=1;
              break RUN;
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1};
    char [] paused1 = {0, 0};
    char [] suspended1 = {0, 0};
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
          CMD2.gethook();
          df = true;
        }
        runClockDomain();
      }
      CMD2.setpreclear();
      posB2S.setpreclear();
      posC2S.setpreclear();
      posD2S.setpreclear();
      posA2S.setpreclear();
      closeGripper2S.setpreclear();
      openGripper2S.setpreclear();
      CMDfd.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = CMD2.getStatus() ? CMD2.setprepresent() : CMD2.setpreclear();
      CMD2.setpreval(CMD2.getValue());
      CMD2.setClear();
      posB2S.sethook();
      posB2S.setClear();
      posC2S.sethook();
      posC2S.setClear();
      posD2S.sethook();
      posD2S.setClear();
      posA2S.sethook();
      posA2S.setClear();
      closeGripper2S.sethook();
      closeGripper2S.setClear();
      openGripper2S.sethook();
      openGripper2S.setClear();
      CMDfd.sethook();
      CMDfd.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        CMD2.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}