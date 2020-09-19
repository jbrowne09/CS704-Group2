import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class loaderPlant extends ClockDomain{
  public loaderPlant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal CMD = new Signal("CMD", Signal.INPUT);
  public Signal posBS = new Signal("posBS", Signal.OUTPUT);
  public Signal posCS = new Signal("posCS", Signal.OUTPUT);
  public Signal posDS = new Signal("posDS", Signal.OUTPUT);
  public Signal posAS = new Signal("posAS", Signal.OUTPUT);
  public Signal closeGripperS = new Signal("closeGripperS", Signal.OUTPUT);
  public Signal openGripperS = new Signal("openGripperS", Signal.OUTPUT);
  public Signal CMDfb = new Signal("CMDfb", Signal.OUTPUT);
  public Signal ready = new Signal("ready", Signal.OUTPUT);
  private int S1710 = 1;
  private int S1680 = 1;
  
  private int[] ends = new int[2];
  private int[] tdone = new int[2];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S1710){
        case 0 : 
          S1710=0;
          break RUN;
        
        case 1 : 
          S1710=2;
          S1710=2;
          S1680=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          switch(S1680){
            case 0 : 
              if(CMD.getprestatus()){//sysj\loaderPlant.sysj line: 9, column: 9
                if((CMD.getpreval() == null ? null : ((String)CMD.getpreval())).equals("B")){//sysj\loaderPlant.sysj line: 11, column: 3
                  posBS.setPresent();//sysj\loaderPlant.sysj line: 12, column: 4
                  currsigs.addElement(posBS);
                  System.out.println("CMD is " + (CMD.getpreval() == null ? null : ((String)CMD.getpreval())));//sysj\loaderPlant.sysj line: 32, column: 3
                  CMDfb.setPresent();//sysj\loaderPlant.sysj line: 33, column: 3
                  currsigs.addElement(CMDfb);
                  S1680=1;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  if((CMD.getpreval() == null ? null : ((String)CMD.getpreval())).equals("C")){//sysj\loaderPlant.sysj line: 14, column: 8
                    posCS.setPresent();//sysj\loaderPlant.sysj line: 15, column: 4
                    currsigs.addElement(posCS);
                    System.out.println("CMD is " + (CMD.getpreval() == null ? null : ((String)CMD.getpreval())));//sysj\loaderPlant.sysj line: 32, column: 3
                    CMDfb.setPresent();//sysj\loaderPlant.sysj line: 33, column: 3
                    currsigs.addElement(CMDfb);
                    S1680=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    if((CMD.getpreval() == null ? null : ((String)CMD.getpreval())).equals("D")){//sysj\loaderPlant.sysj line: 17, column: 8
                      posDS.setPresent();//sysj\loaderPlant.sysj line: 18, column: 4
                      currsigs.addElement(posDS);
                      System.out.println("CMD is " + (CMD.getpreval() == null ? null : ((String)CMD.getpreval())));//sysj\loaderPlant.sysj line: 32, column: 3
                      CMDfb.setPresent();//sysj\loaderPlant.sysj line: 33, column: 3
                      currsigs.addElement(CMDfb);
                      S1680=1;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      if((CMD.getpreval() == null ? null : ((String)CMD.getpreval())).equals("A")){//sysj\loaderPlant.sysj line: 20, column: 8
                        posAS.setPresent();//sysj\loaderPlant.sysj line: 21, column: 4
                        currsigs.addElement(posAS);
                        System.out.println("CMD is " + (CMD.getpreval() == null ? null : ((String)CMD.getpreval())));//sysj\loaderPlant.sysj line: 32, column: 3
                        CMDfb.setPresent();//sysj\loaderPlant.sysj line: 33, column: 3
                        currsigs.addElement(CMDfb);
                        S1680=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        if((CMD.getpreval() == null ? null : ((String)CMD.getpreval())).equals("G")){//sysj\loaderPlant.sysj line: 23, column: 8
                          closeGripperS.setPresent();//sysj\loaderPlant.sysj line: 24, column: 4
                          currsigs.addElement(closeGripperS);
                          System.out.println("CMD is " + (CMD.getpreval() == null ? null : ((String)CMD.getpreval())));//sysj\loaderPlant.sysj line: 32, column: 3
                          CMDfb.setPresent();//sysj\loaderPlant.sysj line: 33, column: 3
                          currsigs.addElement(CMDfb);
                          S1680=1;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        else {
                          if((CMD.getpreval() == null ? null : ((String)CMD.getpreval())).equals("O")){//sysj\loaderPlant.sysj line: 26, column: 8
                            openGripperS.setPresent();//sysj\loaderPlant.sysj line: 27, column: 4
                            currsigs.addElement(openGripperS);
                            System.out.println("CMD is " + (CMD.getpreval() == null ? null : ((String)CMD.getpreval())));//sysj\loaderPlant.sysj line: 32, column: 3
                            CMDfb.setPresent();//sysj\loaderPlant.sysj line: 33, column: 3
                            currsigs.addElement(CMDfb);
                            S1680=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            System.out.println("CMD not working " + (CMD.getpreval() == null ? null : ((String)CMD.getpreval())));//sysj\loaderPlant.sysj line: 30, column: 4
                            System.out.println("CMD is " + (CMD.getpreval() == null ? null : ((String)CMD.getpreval())));//sysj\loaderPlant.sysj line: 32, column: 3
                            CMDfb.setPresent();//sysj\loaderPlant.sysj line: 33, column: 3
                            currsigs.addElement(CMDfb);
                            S1680=1;
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
              S1680=1;
              S1680=0;
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
          CMD.gethook();
          df = true;
        }
        runClockDomain();
      }
      CMD.setpreclear();
      posBS.setpreclear();
      posCS.setpreclear();
      posDS.setpreclear();
      posAS.setpreclear();
      closeGripperS.setpreclear();
      openGripperS.setpreclear();
      CMDfb.setpreclear();
      ready.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = CMD.getStatus() ? CMD.setprepresent() : CMD.setpreclear();
      CMD.setpreval(CMD.getValue());
      CMD.setClear();
      posBS.sethook();
      posBS.setClear();
      posCS.sethook();
      posCS.setClear();
      posDS.sethook();
      posDS.setClear();
      posAS.sethook();
      posAS.setClear();
      closeGripperS.sethook();
      closeGripperS.setClear();
      openGripperS.sethook();
      openGripperS.setClear();
      CMDfb.sethook();
      CMDfb.setClear();
      ready.sethook();
      ready.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        CMD.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
