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
  private int S1344 = 1;
  private int S1308 = 1;
  private int S1090 = 1;
  private int S1095 = 1;
  private int S1113 = 1;
  private int S1118 = 1;
  private int S1342 = 1;
  private int S1316 = 1;
  private int S1324 = 1;
  private int S1332 = 1;
  private int S1340 = 1;
  
  private int[] ends = new int[12];
  private int[] tdone = new int[12];
  
  public void thread1374(int [] tdone, int [] ends){
        switch(S1340){
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

  public void thread1373(int [] tdone, int [] ends){
        switch(S1332){
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

  public void thread1372(int [] tdone, int [] ends){
        switch(S1324){
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

  public void thread1371(int [] tdone, int [] ends){
        switch(S1316){
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

  public void thread1370(int [] tdone, int [] ends){
        switch(S1342){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        thread1371(tdone,ends);
        thread1372(tdone,ends);
        thread1373(tdone,ends);
        thread1374(tdone,ends);
        int biggest1375 = 0;
        if(ends[8]>=biggest1375){
          biggest1375=ends[8];
        }
        if(ends[9]>=biggest1375){
          biggest1375=ends[9];
        }
        if(ends[10]>=biggest1375){
          biggest1375=ends[10];
        }
        if(ends[11]>=biggest1375){
          biggest1375=ends[11];
        }
        if(biggest1375 == 1){
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        //FINXME code
        if(biggest1375 == 0){
          S1342=0;
          active[7]=0;
          ends[7]=0;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread1368(int [] tdone, int [] ends){
        switch(S1118){
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

  public void thread1367(int [] tdone, int [] ends){
        switch(S1113){
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

  public void thread1365(int [] tdone, int [] ends){
        S1118=1;
    valveExtend.setPresent();//sysj\fillerController.sysj line: 22, column: 6
    currsigs.addElement(valveExtend);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread1364(int [] tdone, int [] ends){
        S1113=1;
    inletOn.setPresent();//sysj\fillerController.sysj line: 20, column: 6
    currsigs.addElement(inletOn);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread1362(int [] tdone, int [] ends){
        active[4]=0;
    ends[4]=0;
    tdone[4]=1;
  }

  public void thread1361(int [] tdone, int [] ends){
        switch(S1095){
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

  public void thread1359(int [] tdone, int [] ends){
        S1118=1;
    valveExtend.setPresent();//sysj\fillerController.sysj line: 22, column: 6
    currsigs.addElement(valveExtend);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread1358(int [] tdone, int [] ends){
        S1113=1;
    inletOn.setPresent();//sysj\fillerController.sysj line: 20, column: 6
    currsigs.addElement(inletOn);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread1356(int [] tdone, int [] ends){
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

  public void thread1355(int [] tdone, int [] ends){
        S1095=1;
    injectorOn.setPresent();//sysj\fillerController.sysj line: 12, column: 6
    currsigs.addElement(injectorOn);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread1354(int [] tdone, int [] ends){
        switch(S1308){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S1090){
          case 0 : 
            if(fillerEnable.getprestatus()){//sysj\fillerController.sysj line: 9, column: 10
              S1090=1;
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
              S1090=2;
              thread1355(tdone,ends);
              thread1356(tdone,ends);
              int biggest1357 = 0;
              if(ends[3]>=biggest1357){
                biggest1357=ends[3];
              }
              if(ends[4]>=biggest1357){
                biggest1357=ends[4];
              }
              if(biggest1357 == 1){
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
              S1090=3;
              thread1358(tdone,ends);
              thread1359(tdone,ends);
              int biggest1360 = 0;
              if(ends[5]>=biggest1360){
                biggest1360=ends[5];
              }
              if(ends[6]>=biggest1360){
                biggest1360=ends[6];
              }
              if(biggest1360 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              thread1361(tdone,ends);
              thread1362(tdone,ends);
              int biggest1363 = 0;
              if(ends[3]>=biggest1363){
                biggest1363=ends[3];
              }
              if(ends[4]>=biggest1363){
                biggest1363=ends[4];
              }
              if(biggest1363 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest1363 == 0){
                S1090=3;
                thread1364(tdone,ends);
                thread1365(tdone,ends);
                int biggest1366 = 0;
                if(ends[5]>=biggest1366){
                  biggest1366=ends[5];
                }
                if(ends[6]>=biggest1366){
                  biggest1366=ends[6];
                }
                if(biggest1366 == 1){
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
              S1090=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              thread1367(tdone,ends);
              thread1368(tdone,ends);
              int biggest1369 = 0;
              if(ends[5]>=biggest1369){
                biggest1369=ends[5];
              }
              if(ends[6]>=biggest1369){
                biggest1369=ends[6];
              }
              if(biggest1369 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest1369 == 0){
                fillerDone.setPresent();//sysj\fillerController.sysj line: 24, column: 4
                currsigs.addElement(fillerDone);
                S1090=0;
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

  public void thread1351(int [] tdone, int [] ends){
        S1340=1;
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

  public void thread1350(int [] tdone, int [] ends){
        S1332=1;
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

  public void thread1349(int [] tdone, int [] ends){
        S1324=1;
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

  public void thread1348(int [] tdone, int [] ends){
        S1316=1;
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

  public void thread1347(int [] tdone, int [] ends){
        S1342=1;
    thread1348(tdone,ends);
    thread1349(tdone,ends);
    thread1350(tdone,ends);
    thread1351(tdone,ends);
    int biggest1352 = 0;
    if(ends[8]>=biggest1352){
      biggest1352=ends[8];
    }
    if(ends[9]>=biggest1352){
      biggest1352=ends[9];
    }
    if(ends[10]>=biggest1352){
      biggest1352=ends[10];
    }
    if(ends[11]>=biggest1352){
      biggest1352=ends[11];
    }
    if(biggest1352 == 1){
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread1346(int [] tdone, int [] ends){
        S1308=1;
    S1090=0;
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
      switch(S1344){
        case 0 : 
          S1344=0;
          break RUN;
        
        case 1 : 
          S1344=2;
          S1344=2;
          thread1346(tdone,ends);
          thread1347(tdone,ends);
          int biggest1353 = 0;
          if(ends[2]>=biggest1353){
            biggest1353=ends[2];
          }
          if(ends[7]>=biggest1353){
            biggest1353=ends[7];
          }
          if(biggest1353 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread1354(tdone,ends);
          thread1370(tdone,ends);
          int biggest1376 = 0;
          if(ends[2]>=biggest1376){
            biggest1376=ends[2];
          }
          if(ends[7]>=biggest1376){
            biggest1376=ends[7];
          }
          if(biggest1376 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1376 == 0){
            S1344=0;
            active[1]=0;
            ends[1]=0;
            S1344=0;
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
