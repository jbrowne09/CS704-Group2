import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class rotaryPlant extends ClockDomain{
  public rotaryPlant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal rotate = new Signal("rotate", Signal.INPUT);
  public Signal aligned = new Signal("aligned", Signal.OUTPUT);
  public Signal bottlePos5 = new Signal("bottlePos5", Signal.OUTPUT);
  public Signal capPos1 = new Signal("capPos1", Signal.OUTPUT);
  public Signal alignedS = new Signal("alignedS", Signal.OUTPUT);
  public Signal bottlePos5S = new Signal("bottlePos5S", Signal.OUTPUT);
  public Signal capPos1S = new Signal("capPos1S", Signal.OUTPUT);
  public Signal rotateS = new Signal("rotateS", Signal.OUTPUT);
  private int S545 = 1;
  private int S509 = 1;
  private int S487 = 1;
  private int S517 = 1;
  private int S543 = 1;
  private int S525 = 1;
  private int S519 = 1;
  private int S533 = 1;
  private int S541 = 1;
  
  private int[] ends = new int[8];
  private int[] tdone = new int[8];
  
  public void thread560(int [] tdone, int [] ends){
        switch(S541){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(capPos1.getprestatus()){//sysj\rotaryPlant.sysj line: 33, column: 25
          capPos1S.setPresent();//sysj\rotaryPlant.sysj line: 33, column: 35
          currsigs.addElement(capPos1S);
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        else {
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread559(int [] tdone, int [] ends){
        switch(S533){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(bottlePos5.getprestatus()){//sysj\rotaryPlant.sysj line: 31, column: 25
          bottlePos5S.setPresent();//sysj\rotaryPlant.sysj line: 31, column: 38
          currsigs.addElement(bottlePos5S);
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        else {
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread558(int [] tdone, int [] ends){
        switch(S525){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S519){
          case 0 : 
            S519=0;
            if(aligned.getprestatus()){//sysj\rotaryPlant.sysj line: 29, column: 25
              alignedS.setPresent();//sysj\rotaryPlant.sysj line: 29, column: 35
              currsigs.addElement(alignedS);
              S519=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S519=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S519=1;
            S519=0;
            if(aligned.getprestatus()){//sysj\rotaryPlant.sysj line: 29, column: 25
              alignedS.setPresent();//sysj\rotaryPlant.sysj line: 29, column: 35
              currsigs.addElement(alignedS);
              S519=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S519=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread557(int [] tdone, int [] ends){
        switch(S543){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        thread558(tdone,ends);
        thread559(tdone,ends);
        thread560(tdone,ends);
        int biggest561 = 0;
        if(ends[5]>=biggest561){
          biggest561=ends[5];
        }
        if(ends[6]>=biggest561){
          biggest561=ends[6];
        }
        if(ends[7]>=biggest561){
          biggest561=ends[7];
        }
        if(biggest561 == 1){
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        //FINXME code
        if(biggest561 == 0){
          S543=0;
          active[4]=0;
          ends[4]=0;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread556(int [] tdone, int [] ends){
        switch(S517){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 22, column: 10
          try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//sysj\rotaryPlant.sysj line: 23, column: 4
          aligned.setPresent();//sysj\rotaryPlant.sysj line: 24, column: 4
          currsigs.addElement(aligned);
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

  public void thread555(int [] tdone, int [] ends){
        switch(S509){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S487){
          case 0 : 
            if(rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 13, column: 10
              S487=1;
              rotateS.setPresent();//sysj\rotaryPlant.sysj line: 15, column: 5
              currsigs.addElement(rotateS);
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
            if(!rotate.getprestatus()){//sysj\rotaryPlant.sysj line: 14, column: 11
              S487=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              rotateS.setPresent();//sysj\rotaryPlant.sysj line: 15, column: 5
              currsigs.addElement(rotateS);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread552(int [] tdone, int [] ends){
        S541=1;
    if(capPos1.getprestatus()){//sysj\rotaryPlant.sysj line: 33, column: 25
      capPos1S.setPresent();//sysj\rotaryPlant.sysj line: 33, column: 35
      currsigs.addElement(capPos1S);
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread551(int [] tdone, int [] ends){
        S533=1;
    if(bottlePos5.getprestatus()){//sysj\rotaryPlant.sysj line: 31, column: 25
      bottlePos5S.setPresent();//sysj\rotaryPlant.sysj line: 31, column: 38
      currsigs.addElement(bottlePos5S);
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread550(int [] tdone, int [] ends){
        S525=1;
    S519=0;
    if(aligned.getprestatus()){//sysj\rotaryPlant.sysj line: 29, column: 25
      alignedS.setPresent();//sysj\rotaryPlant.sysj line: 29, column: 35
      currsigs.addElement(alignedS);
      S519=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S519=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread549(int [] tdone, int [] ends){
        S543=1;
    thread550(tdone,ends);
    thread551(tdone,ends);
    thread552(tdone,ends);
    int biggest553 = 0;
    if(ends[5]>=biggest553){
      biggest553=ends[5];
    }
    if(ends[6]>=biggest553){
      biggest553=ends[6];
    }
    if(ends[7]>=biggest553){
      biggest553=ends[7];
    }
    if(biggest553 == 1){
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread548(int [] tdone, int [] ends){
        S517=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread547(int [] tdone, int [] ends){
        S509=1;
    S487=0;
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
      switch(S545){
        case 0 : 
          S545=0;
          break RUN;
        
        case 1 : 
          S545=2;
          S545=2;
          thread547(tdone,ends);
          thread548(tdone,ends);
          thread549(tdone,ends);
          int biggest554 = 0;
          if(ends[2]>=biggest554){
            biggest554=ends[2];
          }
          if(ends[3]>=biggest554){
            biggest554=ends[3];
          }
          if(ends[4]>=biggest554){
            biggest554=ends[4];
          }
          if(biggest554 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread555(tdone,ends);
          thread556(tdone,ends);
          thread557(tdone,ends);
          int biggest562 = 0;
          if(ends[2]>=biggest562){
            biggest562=ends[2];
          }
          if(ends[3]>=biggest562){
            biggest562=ends[3];
          }
          if(ends[4]>=biggest562){
            biggest562=ends[4];
          }
          if(biggest562 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest562 == 0){
            S545=0;
            active[1]=0;
            ends[1]=0;
            S545=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0};
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
          rotate.gethook();
          df = true;
        }
        runClockDomain();
      }
      rotate.setpreclear();
      aligned.setpreclear();
      bottlePos5.setpreclear();
      capPos1.setpreclear();
      alignedS.setpreclear();
      bottlePos5S.setpreclear();
      capPos1S.setpreclear();
      rotateS.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = rotate.getStatus() ? rotate.setprepresent() : rotate.setpreclear();
      rotate.setpreval(rotate.getValue());
      rotate.setClear();
      aligned.sethook();
      aligned.setClear();
      bottlePos5.sethook();
      bottlePos5.setClear();
      capPos1.sethook();
      capPos1.setClear();
      alignedS.sethook();
      alignedS.setClear();
      bottlePos5S.sethook();
      bottlePos5S.setClear();
      capPos1S.sethook();
      capPos1S.setClear();
      rotateS.sethook();
      rotateS.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        rotate.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
