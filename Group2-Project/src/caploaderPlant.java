import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class caploaderPlant extends ClockDomain{
  public caploaderPlant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal armSource = new Signal("armSource", Signal.INPUT);
  public Signal armDest = new Signal("armDest", Signal.INPUT);
  public Signal pusherExtend = new Signal("pusherExtend", Signal.INPUT);
  public Signal vacOn = new Signal("vacOn", Signal.INPUT);
  public Signal armAtDest = new Signal("armAtDest", Signal.OUTPUT);
  public Signal armAtSource = new Signal("armAtSource", Signal.OUTPUT);
  public Signal pusherRetracted = new Signal("pusherRetracted", Signal.OUTPUT);
  public Signal pusherExtended = new Signal("pusherExtended", Signal.OUTPUT);
  public Signal WPgripped = new Signal("WPgripped", Signal.OUTPUT);
  public Signal pusherExtendS = new Signal("pusherExtendS", Signal.OUTPUT);
  public Signal toInitS = new Signal("toInitS", Signal.OUTPUT);
  public Signal toDestS = new Signal("toDestS", Signal.OUTPUT);
  public Signal vacOnS = new Signal("vacOnS", Signal.OUTPUT);
  private int S332 = 1;
  private int S235 = 1;
  private int S207 = 1;
  private int S276 = 1;
  private int S248 = 1;
  private int S296 = 1;
  private int S282 = 1;
  private int S330 = 1;
  private int S304 = 1;
  private int S298 = 1;
  private int S312 = 1;
  private int S320 = 1;
  private int S328 = 1;
  
  private int[] ends = new int[10];
  private int[] tdone = new int[10];
  
  public void thread351(int [] tdone, int [] ends){
        switch(S328){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(WPgripped.getprestatus()){//sysj\caploaderPlant.sysj line: 46, column: 24
          vacOnS.setPresent();//sysj\caploaderPlant.sysj line: 46, column: 35
          currsigs.addElement(vacOnS);
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        else {
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        break;
      
    }
  }

  public void thread350(int [] tdone, int [] ends){
        switch(S320){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(armAtDest.getprestatus()){//sysj\caploaderPlant.sysj line: 44, column: 24
          toDestS.setPresent();//sysj\caploaderPlant.sysj line: 44, column: 35
          currsigs.addElement(toDestS);
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        else {
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        break;
      
    }
  }

  public void thread349(int [] tdone, int [] ends){
        switch(S312){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(armAtSource.getprestatus()){//sysj\caploaderPlant.sysj line: 42, column: 24
          toInitS.setPresent();//sysj\caploaderPlant.sysj line: 42, column: 37
          currsigs.addElement(toInitS);
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

  public void thread348(int [] tdone, int [] ends){
        switch(S304){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S298){
          case 0 : 
            S298=0;
            if(pusherExtended.getprestatus()){//sysj\caploaderPlant.sysj line: 40, column: 24
              pusherExtendS.setPresent();//sysj\caploaderPlant.sysj line: 40, column: 40
              currsigs.addElement(pusherExtendS);
              S298=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              S298=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 1 : 
            S298=1;
            S298=0;
            if(pusherExtended.getprestatus()){//sysj\caploaderPlant.sysj line: 40, column: 24
              pusherExtendS.setPresent();//sysj\caploaderPlant.sysj line: 40, column: 40
              currsigs.addElement(pusherExtendS);
              S298=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              S298=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread347(int [] tdone, int [] ends){
        switch(S330){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        thread348(tdone,ends);
        thread349(tdone,ends);
        thread350(tdone,ends);
        thread351(tdone,ends);
        int biggest352 = 0;
        if(ends[6]>=biggest352){
          biggest352=ends[6];
        }
        if(ends[7]>=biggest352){
          biggest352=ends[7];
        }
        if(ends[8]>=biggest352){
          biggest352=ends[8];
        }
        if(ends[9]>=biggest352){
          biggest352=ends[9];
        }
        if(biggest352 == 1){
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        //FINXME code
        if(biggest352 == 0){
          S330=0;
          active[5]=0;
          ends[5]=0;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread346(int [] tdone, int [] ends){
        switch(S296){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S282){
          case 0 : 
            if(!vacOn.getprestatus()){//sysj\caploaderPlant.sysj line: 31, column: 11
              S282=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              WPgripped.setPresent();//sysj\caploaderPlant.sysj line: 32, column: 6
              currsigs.addElement(WPgripped);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S282=1;
            S282=0;
            if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\caploaderPlant.sysj line: 30, column: 12
              WPgripped.setPresent();//sysj\caploaderPlant.sysj line: 32, column: 6
              currsigs.addElement(WPgripped);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S282=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread345(int [] tdone, int [] ends){
        switch(S276){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S248){
          case 0 : 
            if(pusherExtend.getprestatus()){//sysj\caploaderPlant.sysj line: 19, column: 10
              S248=1;
              pusherExtended.setPresent();//sysj\caploaderPlant.sysj line: 23, column: 5
              currsigs.addElement(pusherExtended);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              pusherRetracted.setPresent();//sysj\caploaderPlant.sysj line: 20, column: 5
              currsigs.addElement(pusherRetracted);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if(!pusherExtend.getprestatus()){//sysj\caploaderPlant.sysj line: 22, column: 10
              S248=0;
              pusherRetracted.setPresent();//sysj\caploaderPlant.sysj line: 20, column: 5
              currsigs.addElement(pusherRetracted);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              pusherExtended.setPresent();//sysj\caploaderPlant.sysj line: 23, column: 5
              currsigs.addElement(pusherExtended);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread344(int [] tdone, int [] ends){
        switch(S235){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S207){
          case 0 : 
            if(armSource.getprestatus()){//sysj\caploaderPlant.sysj line: 8, column: 10
              S207=1;
              armAtSource.setPresent();//sysj\caploaderPlant.sysj line: 12, column: 5
              currsigs.addElement(armAtSource);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              armAtDest.setPresent();//sysj\caploaderPlant.sysj line: 9, column: 5
              currsigs.addElement(armAtDest);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(armDest.getprestatus()){//sysj\caploaderPlant.sysj line: 11, column: 10
              S207=0;
              armAtDest.setPresent();//sysj\caploaderPlant.sysj line: 9, column: 5
              currsigs.addElement(armAtDest);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              armAtSource.setPresent();//sysj\caploaderPlant.sysj line: 12, column: 5
              currsigs.addElement(armAtSource);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread341(int [] tdone, int [] ends){
        S328=1;
    if(WPgripped.getprestatus()){//sysj\caploaderPlant.sysj line: 46, column: 24
      vacOnS.setPresent();//sysj\caploaderPlant.sysj line: 46, column: 35
      currsigs.addElement(vacOnS);
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread340(int [] tdone, int [] ends){
        S320=1;
    if(armAtDest.getprestatus()){//sysj\caploaderPlant.sysj line: 44, column: 24
      toDestS.setPresent();//sysj\caploaderPlant.sysj line: 44, column: 35
      currsigs.addElement(toDestS);
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread339(int [] tdone, int [] ends){
        S312=1;
    if(armAtSource.getprestatus()){//sysj\caploaderPlant.sysj line: 42, column: 24
      toInitS.setPresent();//sysj\caploaderPlant.sysj line: 42, column: 37
      currsigs.addElement(toInitS);
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

  public void thread338(int [] tdone, int [] ends){
        S304=1;
    S298=0;
    if(pusherExtended.getprestatus()){//sysj\caploaderPlant.sysj line: 40, column: 24
      pusherExtendS.setPresent();//sysj\caploaderPlant.sysj line: 40, column: 40
      currsigs.addElement(pusherExtendS);
      S298=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S298=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread337(int [] tdone, int [] ends){
        S330=1;
    thread338(tdone,ends);
    thread339(tdone,ends);
    thread340(tdone,ends);
    thread341(tdone,ends);
    int biggest342 = 0;
    if(ends[6]>=biggest342){
      biggest342=ends[6];
    }
    if(ends[7]>=biggest342){
      biggest342=ends[7];
    }
    if(ends[8]>=biggest342){
      biggest342=ends[8];
    }
    if(ends[9]>=biggest342){
      biggest342=ends[9];
    }
    if(biggest342 == 1){
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread336(int [] tdone, int [] ends){
        S296=1;
    S282=0;
    if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\caploaderPlant.sysj line: 30, column: 12
      WPgripped.setPresent();//sysj\caploaderPlant.sysj line: 32, column: 6
      currsigs.addElement(WPgripped);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S282=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread335(int [] tdone, int [] ends){
        S276=1;
    S248=0;
    pusherRetracted.setPresent();//sysj\caploaderPlant.sysj line: 20, column: 5
    currsigs.addElement(pusherRetracted);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread334(int [] tdone, int [] ends){
        S235=1;
    S207=0;
    armAtDest.setPresent();//sysj\caploaderPlant.sysj line: 9, column: 5
    currsigs.addElement(armAtDest);
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
      switch(S332){
        case 0 : 
          S332=0;
          break RUN;
        
        case 1 : 
          S332=2;
          S332=2;
          thread334(tdone,ends);
          thread335(tdone,ends);
          thread336(tdone,ends);
          thread337(tdone,ends);
          int biggest343 = 0;
          if(ends[2]>=biggest343){
            biggest343=ends[2];
          }
          if(ends[3]>=biggest343){
            biggest343=ends[3];
          }
          if(ends[4]>=biggest343){
            biggest343=ends[4];
          }
          if(ends[5]>=biggest343){
            biggest343=ends[5];
          }
          if(biggest343 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread344(tdone,ends);
          thread345(tdone,ends);
          thread346(tdone,ends);
          thread347(tdone,ends);
          int biggest353 = 0;
          if(ends[2]>=biggest353){
            biggest353=ends[2];
          }
          if(ends[3]>=biggest353){
            biggest353=ends[3];
          }
          if(ends[4]>=biggest353){
            biggest353=ends[4];
          }
          if(ends[5]>=biggest353){
            biggest353=ends[5];
          }
          if(biggest353 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest353 == 0){
            S332=0;
            active[1]=0;
            ends[1]=0;
            S332=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          armSource.gethook();
          armDest.gethook();
          pusherExtend.gethook();
          vacOn.gethook();
          df = true;
        }
        runClockDomain();
      }
      armSource.setpreclear();
      armDest.setpreclear();
      pusherExtend.setpreclear();
      vacOn.setpreclear();
      armAtDest.setpreclear();
      armAtSource.setpreclear();
      pusherRetracted.setpreclear();
      pusherExtended.setpreclear();
      WPgripped.setpreclear();
      pusherExtendS.setpreclear();
      toInitS.setpreclear();
      toDestS.setpreclear();
      vacOnS.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = armSource.getStatus() ? armSource.setprepresent() : armSource.setpreclear();
      armSource.setpreval(armSource.getValue());
      armSource.setClear();
      dummyint = armDest.getStatus() ? armDest.setprepresent() : armDest.setpreclear();
      armDest.setpreval(armDest.getValue());
      armDest.setClear();
      dummyint = pusherExtend.getStatus() ? pusherExtend.setprepresent() : pusherExtend.setpreclear();
      pusherExtend.setpreval(pusherExtend.getValue());
      pusherExtend.setClear();
      dummyint = vacOn.getStatus() ? vacOn.setprepresent() : vacOn.setpreclear();
      vacOn.setpreval(vacOn.getValue());
      vacOn.setClear();
      armAtDest.sethook();
      armAtDest.setClear();
      armAtSource.sethook();
      armAtSource.setClear();
      pusherRetracted.sethook();
      pusherRetracted.setClear();
      pusherExtended.sethook();
      pusherExtended.setClear();
      WPgripped.sethook();
      WPgripped.setClear();
      pusherExtendS.sethook();
      pusherExtendS.setClear();
      toInitS.sethook();
      toInitS.setClear();
      toDestS.sethook();
      toDestS.setClear();
      vacOnS.sethook();
      vacOnS.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        armSource.gethook();
        armDest.gethook();
        pusherExtend.gethook();
        vacOn.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
