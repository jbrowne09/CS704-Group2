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
  public Signal toFill1 = new Signal("toFill1", Signal.INPUT);
  public Signal toFill2 = new Signal("toFill2", Signal.INPUT);
  public Signal toFill3 = new Signal("toFill3", Signal.INPUT);
  public Signal toFill4 = new Signal("toFill4", Signal.INPUT);
  public Signal inletOn = new Signal("inletOn", Signal.OUTPUT);
  public Signal injectorOn = new Signal("injectorOn", Signal.OUTPUT);
  public Signal valveRetract = new Signal("valveRetract", Signal.OUTPUT);
  public Signal valveExtend = new Signal("valveExtend", Signal.OUTPUT);
  public Signal fillerDone = new Signal("fillerDone", Signal.OUTPUT);
  public Signal fill1 = new Signal("fill1", Signal.OUTPUT);
  public Signal fill2 = new Signal("fill2", Signal.OUTPUT);
  public Signal fill3 = new Signal("fill3", Signal.OUTPUT);
  public Signal fill4 = new Signal("fill4", Signal.OUTPUT);
  private int S1311 = 1;
  private int S1275 = 1;
  private int S1057 = 1;
  private int S1062 = 1;
  private int S1080 = 1;
  private int S1085 = 1;
  private int S1309 = 1;
  private int S1283 = 1;
  private int S1291 = 1;
  private int S1299 = 1;
  private int S1307 = 1;
  
  private int[] ends = new int[12];
  private int[] tdone = new int[12];
  
  public void thread1341(int [] tdone, int [] ends){
        switch(S1307){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(toFill4.getprestatus()){//sysj\fillerController.sysj line: 35, column: 25
          fill4.setPresent();//sysj\fillerController.sysj line: 35, column: 35
          currsigs.addElement(fill4);
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        else {
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread1340(int [] tdone, int [] ends){
        switch(S1299){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(toFill3.getprestatus()){//sysj\fillerController.sysj line: 33, column: 25
          fill3.setPresent();//sysj\fillerController.sysj line: 33, column: 35
          currsigs.addElement(fill3);
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
        else {
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
        break;
      
    }
  }

  public void thread1339(int [] tdone, int [] ends){
        switch(S1291){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(toFill2.getprestatus()){//sysj\fillerController.sysj line: 31, column: 25
          fill2.setPresent();//sysj\fillerController.sysj line: 31, column: 35
          currsigs.addElement(fill2);
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

  public void thread1338(int [] tdone, int [] ends){
        switch(S1283){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(toFill1.getprestatus()){//sysj\fillerController.sysj line: 29, column: 25
          fill1.setPresent();//sysj\fillerController.sysj line: 29, column: 35
          currsigs.addElement(fill1);
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

  public void thread1337(int [] tdone, int [] ends){
        switch(S1309){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        thread1338(tdone,ends);
        thread1339(tdone,ends);
        thread1340(tdone,ends);
        thread1341(tdone,ends);
        int biggest1342 = 0;
        if(ends[8]>=biggest1342){
          biggest1342=ends[8];
        }
        if(ends[9]>=biggest1342){
          biggest1342=ends[9];
        }
        if(ends[10]>=biggest1342){
          biggest1342=ends[10];
        }
        if(ends[11]>=biggest1342){
          biggest1342=ends[11];
        }
        if(biggest1342 == 1){
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        //FINXME code
        if(biggest1342 == 0){
          S1309=0;
          active[7]=0;
          ends[7]=0;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread1335(int [] tdone, int [] ends){
        switch(S1085){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        valveExtend.setPresent();//sysj\fillerController.sysj line: 22, column: 6
        currsigs.addElement(valveExtend);
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
        break;
      
    }
  }

  public void thread1334(int [] tdone, int [] ends){
        switch(S1080){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        inletOn.setPresent();//sysj\fillerController.sysj line: 20, column: 6
        currsigs.addElement(inletOn);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
        break;
      
    }
  }

  public void thread1332(int [] tdone, int [] ends){
        S1085=1;
    valveExtend.setPresent();//sysj\fillerController.sysj line: 22, column: 6
    currsigs.addElement(valveExtend);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread1331(int [] tdone, int [] ends){
        S1080=1;
    inletOn.setPresent();//sysj\fillerController.sysj line: 20, column: 6
    currsigs.addElement(inletOn);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread1329(int [] tdone, int [] ends){
        active[4]=0;
    ends[4]=0;
    tdone[4]=1;
  }

  public void thread1328(int [] tdone, int [] ends){
        switch(S1062){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        injectorOn.setPresent();//sysj\fillerController.sysj line: 12, column: 6
        currsigs.addElement(injectorOn);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread1326(int [] tdone, int [] ends){
        S1085=1;
    valveExtend.setPresent();//sysj\fillerController.sysj line: 22, column: 6
    currsigs.addElement(valveExtend);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread1325(int [] tdone, int [] ends){
        S1080=1;
    inletOn.setPresent();//sysj\fillerController.sysj line: 20, column: 6
    currsigs.addElement(inletOn);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread1323(int [] tdone, int [] ends){
        if(canBottom.getprestatus()){//sysj\fillerController.sysj line: 14, column: 15
      valveRetract.setPresent();//sysj\fillerController.sysj line: 15, column: 6
      currsigs.addElement(valveRetract);
      active[4]=0;
      ends[4]=0;
      tdone[4]=1;
    }
    else {
      active[4]=0;
      ends[4]=0;
      tdone[4]=1;
    }
  }

  public void thread1322(int [] tdone, int [] ends){
        S1062=1;
    injectorOn.setPresent();//sysj\fillerController.sysj line: 12, column: 6
    currsigs.addElement(injectorOn);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread1321(int [] tdone, int [] ends){
        switch(S1275){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S1057){
          case 0 : 
            if(fillerEnable.getprestatus()){//sysj\fillerController.sysj line: 9, column: 10
              S1057=1;
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
            if(tick.getprestatus()){//sysj\fillerController.sysj line: 10, column: 10
              S1057=2;
              thread1322(tdone,ends);
              thread1323(tdone,ends);
              int biggest1324 = 0;
              if(ends[3]>=biggest1324){
                biggest1324=ends[3];
              }
              if(ends[4]>=biggest1324){
                biggest1324=ends[4];
              }
              if(biggest1324 == 1){
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
          
          case 2 : 
            if(canTop.getprestatus()){//sysj\fillerController.sysj line: 11, column: 10
              S1057=3;
              thread1325(tdone,ends);
              thread1326(tdone,ends);
              int biggest1327 = 0;
              if(ends[5]>=biggest1327){
                biggest1327=ends[5];
              }
              if(ends[6]>=biggest1327){
                biggest1327=ends[6];
              }
              if(biggest1327 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              thread1328(tdone,ends);
              thread1329(tdone,ends);
              int biggest1330 = 0;
              if(ends[3]>=biggest1330){
                biggest1330=ends[3];
              }
              if(ends[4]>=biggest1330){
                biggest1330=ends[4];
              }
              if(biggest1330 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest1330 == 0){
                S1057=3;
                thread1331(tdone,ends);
                thread1332(tdone,ends);
                int biggest1333 = 0;
                if(ends[5]>=biggest1333){
                  biggest1333=ends[5];
                }
                if(ends[6]>=biggest1333){
                  biggest1333=ends[6];
                }
                if(biggest1333 == 1){
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
            }
            break;
          
          case 3 : 
            if(canBottom.getprestatus()){//sysj\fillerController.sysj line: 19, column: 10
              fillerDone.setPresent();//sysj\fillerController.sysj line: 24, column: 4
              currsigs.addElement(fillerDone);
              S1057=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              thread1334(tdone,ends);
              thread1335(tdone,ends);
              int biggest1336 = 0;
              if(ends[5]>=biggest1336){
                biggest1336=ends[5];
              }
              if(ends[6]>=biggest1336){
                biggest1336=ends[6];
              }
              if(biggest1336 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest1336 == 0){
                fillerDone.setPresent();//sysj\fillerController.sysj line: 24, column: 4
                currsigs.addElement(fillerDone);
                S1057=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1318(int [] tdone, int [] ends){
        S1307=1;
    if(toFill4.getprestatus()){//sysj\fillerController.sysj line: 35, column: 25
      fill4.setPresent();//sysj\fillerController.sysj line: 35, column: 35
      currsigs.addElement(fill4);
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread1317(int [] tdone, int [] ends){
        S1299=1;
    if(toFill3.getprestatus()){//sysj\fillerController.sysj line: 33, column: 25
      fill3.setPresent();//sysj\fillerController.sysj line: 33, column: 35
      currsigs.addElement(fill3);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread1316(int [] tdone, int [] ends){
        S1291=1;
    if(toFill2.getprestatus()){//sysj\fillerController.sysj line: 31, column: 25
      fill2.setPresent();//sysj\fillerController.sysj line: 31, column: 35
      currsigs.addElement(fill2);
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

  public void thread1315(int [] tdone, int [] ends){
        S1283=1;
    if(toFill1.getprestatus()){//sysj\fillerController.sysj line: 29, column: 25
      fill1.setPresent();//sysj\fillerController.sysj line: 29, column: 35
      currsigs.addElement(fill1);
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

  public void thread1314(int [] tdone, int [] ends){
        S1309=1;
    thread1315(tdone,ends);
    thread1316(tdone,ends);
    thread1317(tdone,ends);
    thread1318(tdone,ends);
    int biggest1319 = 0;
    if(ends[8]>=biggest1319){
      biggest1319=ends[8];
    }
    if(ends[9]>=biggest1319){
      biggest1319=ends[9];
    }
    if(ends[10]>=biggest1319){
      biggest1319=ends[10];
    }
    if(ends[11]>=biggest1319){
      biggest1319=ends[11];
    }
    if(biggest1319 == 1){
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread1313(int [] tdone, int [] ends){
        S1275=1;
    S1057=0;
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
      switch(S1311){
        case 0 : 
          S1311=0;
          break RUN;
        
        case 1 : 
          S1311=2;
          S1311=2;
          thread1313(tdone,ends);
          thread1314(tdone,ends);
          int biggest1320 = 0;
          if(ends[2]>=biggest1320){
            biggest1320=ends[2];
          }
          if(ends[7]>=biggest1320){
            biggest1320=ends[7];
          }
          if(biggest1320 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread1321(tdone,ends);
          thread1337(tdone,ends);
          int biggest1343 = 0;
          if(ends[2]>=biggest1343){
            biggest1343=ends[2];
          }
          if(ends[7]>=biggest1343){
            biggest1343=ends[7];
          }
          if(biggest1343 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1343 == 0){
            S1311=0;
            active[1]=0;
            ends[1]=0;
            S1311=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          toFill1.gethook();
          toFill2.gethook();
          toFill3.gethook();
          toFill4.gethook();
          df = true;
        }
        runClockDomain();
      }
      canBottom.setpreclear();
      canTop.setpreclear();
      fillerEnable.setpreclear();
      tick.setpreclear();
      toFill1.setpreclear();
      toFill2.setpreclear();
      toFill3.setpreclear();
      toFill4.setpreclear();
      inletOn.setpreclear();
      injectorOn.setpreclear();
      valveRetract.setpreclear();
      valveExtend.setpreclear();
      fillerDone.setpreclear();
      fill1.setpreclear();
      fill2.setpreclear();
      fill3.setpreclear();
      fill4.setpreclear();
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
      dummyint = toFill1.getStatus() ? toFill1.setprepresent() : toFill1.setpreclear();
      toFill1.setpreval(toFill1.getValue());
      toFill1.setClear();
      dummyint = toFill2.getStatus() ? toFill2.setprepresent() : toFill2.setpreclear();
      toFill2.setpreval(toFill2.getValue());
      toFill2.setClear();
      dummyint = toFill3.getStatus() ? toFill3.setprepresent() : toFill3.setpreclear();
      toFill3.setpreval(toFill3.getValue());
      toFill3.setClear();
      dummyint = toFill4.getStatus() ? toFill4.setprepresent() : toFill4.setpreclear();
      toFill4.setpreval(toFill4.getValue());
      toFill4.setClear();
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
      fill1.sethook();
      fill1.setClear();
      fill2.sethook();
      fill2.setClear();
      fill3.sethook();
      fill3.setClear();
      fill4.sethook();
      fill4.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        canBottom.gethook();
        canTop.gethook();
        fillerEnable.gethook();
        tick.gethook();
        toFill1.gethook();
        toFill2.gethook();
        toFill3.gethook();
        toFill4.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
