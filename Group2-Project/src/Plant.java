import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class Plant extends ClockDomain{
  public Plant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal pusherExtend = new Signal("pusherExtend", Signal.INPUT);
  public Signal vacOn = new Signal("vacOn", Signal.INPUT);
  public Signal armSource = new Signal("armSource", Signal.INPUT);
  public Signal armDest = new Signal("armDest", Signal.INPUT);
  public Signal enable = new Signal("enable", Signal.INPUT);
  public Signal refill = new Signal("refill", Signal.INPUT);
  public Signal pusherRetracted = new Signal("pusherRetracted", Signal.OUTPUT);
  public Signal pusherExtended = new Signal("pusherExtended", Signal.OUTPUT);
  public Signal WPgripped = new Signal("WPgripped", Signal.OUTPUT);
  public Signal armAtSource = new Signal("armAtSource", Signal.OUTPUT);
  public Signal armAtDest = new Signal("armAtDest", Signal.OUTPUT);
  public Signal empty = new Signal("empty", Signal.OUTPUT);
  public Signal pusherRetractedE = new Signal("pusherRetractedE", Signal.OUTPUT);
  public Signal pusherExtendedE = new Signal("pusherExtendedE", Signal.OUTPUT);
  public Signal WPgrippedE = new Signal("WPgrippedE", Signal.OUTPUT);
  public Signal armAtSourceE = new Signal("armAtSourceE", Signal.OUTPUT);
  public Signal armAtDestE = new Signal("armAtDestE", Signal.OUTPUT);
  public Signal emptyE = new Signal("emptyE", Signal.OUTPUT);
  private Signal capDec_1;
  private Signal capPos_1;
  private int capcount_thread_6;//sysj\wLoaderPlant.sysj line: 80, column: 3
  private int S4283 = 1;
  private int S3010 = 1;
  private int S2964 = 1;
  private int S3063 = 1;
  private int S3017 = 1;
  private int S3107 = 1;
  private int S3077 = 1;
  private int S3072 = 1;
  private int S3175 = 1;
  private int S3129 = 1;
  private int S3111 = 1;
  private int S3237 = 1;
  private int S3287 = 1;
  private int S3245 = 1;
  private int S3253 = 1;
  private int S3261 = 1;
  private int S3269 = 1;
  private int S3277 = 1;
  private int S3285 = 1;
  
  private int[] ends = new int[14];
  private int[] tdone = new int[14];
  
  public void thread4310(int [] tdone, int [] ends){
        switch(S3285){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(empty.getprestatus()){//sysj\wLoaderPlant.sysj line: 108, column: 24
          emptyE.setPresent();//sysj\wLoaderPlant.sysj line: 108, column: 31
          currsigs.addElement(emptyE);
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        else {
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        break;
      
    }
  }

  public void thread4309(int [] tdone, int [] ends){
        switch(S3277){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(armAtDest.getprestatus()){//sysj\wLoaderPlant.sysj line: 106, column: 24
          armAtDestE.setPresent();//sysj\wLoaderPlant.sysj line: 106, column: 35
          currsigs.addElement(armAtDestE);
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        else {
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        break;
      
    }
  }

  public void thread4308(int [] tdone, int [] ends){
        switch(S3269){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(armAtSource.getprestatus()){//sysj\wLoaderPlant.sysj line: 104, column: 24
          armAtSourceE.setPresent();//sysj\wLoaderPlant.sysj line: 104, column: 37
          currsigs.addElement(armAtSourceE);
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

  public void thread4307(int [] tdone, int [] ends){
        switch(S3261){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(WPgripped.getprestatus()){//sysj\wLoaderPlant.sysj line: 102, column: 24
          WPgrippedE.setPresent();//sysj\wLoaderPlant.sysj line: 102, column: 35
          currsigs.addElement(WPgrippedE);
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

  public void thread4306(int [] tdone, int [] ends){
        switch(S3253){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(pusherExtended.getprestatus()){//sysj\wLoaderPlant.sysj line: 100, column: 24
          pusherExtendedE.setPresent();//sysj\wLoaderPlant.sysj line: 100, column: 40
          currsigs.addElement(pusherExtendedE);
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

  public void thread4305(int [] tdone, int [] ends){
        switch(S3245){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(pusherRetracted.getprestatus()){//sysj\wLoaderPlant.sysj line: 98, column: 24
          pusherRetractedE.setPresent();//sysj\wLoaderPlant.sysj line: 98, column: 41
          currsigs.addElement(pusherRetractedE);
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

  public void thread4304(int [] tdone, int [] ends){
        switch(S3287){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        thread4305(tdone,ends);
        thread4306(tdone,ends);
        thread4307(tdone,ends);
        thread4308(tdone,ends);
        thread4309(tdone,ends);
        thread4310(tdone,ends);
        int biggest4311 = 0;
        if(ends[8]>=biggest4311){
          biggest4311=ends[8];
        }
        if(ends[9]>=biggest4311){
          biggest4311=ends[9];
        }
        if(ends[10]>=biggest4311){
          biggest4311=ends[10];
        }
        if(ends[11]>=biggest4311){
          biggest4311=ends[11];
        }
        if(ends[12]>=biggest4311){
          biggest4311=ends[12];
        }
        if(ends[13]>=biggest4311){
          biggest4311=ends[13];
        }
        if(biggest4311 == 1){
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        //FINXME code
        if(biggest4311 == 0){
          S3287=0;
          active[7]=0;
          ends[7]=0;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread4303(int [] tdone, int [] ends){
        switch(S3237){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(capDec_1.getprestatus()){//sysj\wLoaderPlant.sysj line: 82, column: 12
          if(capcount_thread_6 > 0) {//sysj\wLoaderPlant.sysj line: 83, column: 5
            capcount_thread_6 = capcount_thread_6 - 1;//sysj\wLoaderPlant.sysj line: 84, column: 6
          }
          if(refill.getprestatus()){//sysj\wLoaderPlant.sysj line: 86, column: 12
            capcount_thread_6 = 5;//sysj\wLoaderPlant.sysj line: 87, column: 5
            if(capcount_thread_6 == 0){//sysj\wLoaderPlant.sysj line: 90, column: 8
              empty.setPresent();//sysj\wLoaderPlant.sysj line: 91, column: 6
              currsigs.addElement(empty);
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
          else {
            if(capcount_thread_6 == 0){//sysj\wLoaderPlant.sysj line: 90, column: 8
              empty.setPresent();//sysj\wLoaderPlant.sysj line: 91, column: 6
              currsigs.addElement(empty);
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
        }
        else {
          if(refill.getprestatus()){//sysj\wLoaderPlant.sysj line: 86, column: 12
            capcount_thread_6 = 5;//sysj\wLoaderPlant.sysj line: 87, column: 5
            if(capcount_thread_6 == 0){//sysj\wLoaderPlant.sysj line: 90, column: 8
              empty.setPresent();//sysj\wLoaderPlant.sysj line: 91, column: 6
              currsigs.addElement(empty);
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
          else {
            if(capcount_thread_6 == 0){//sysj\wLoaderPlant.sysj line: 90, column: 8
              empty.setPresent();//sysj\wLoaderPlant.sysj line: 91, column: 6
              currsigs.addElement(empty);
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
        }
        break;
      
    }
  }

  public void thread4302(int [] tdone, int [] ends){
        switch(S3175){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S3129){
          case 0 : 
            if(empty.getprestatus()){//sysj\wLoaderPlant.sysj line: 65, column: 10
              S3129=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              switch(S3111){
                case 0 : 
                  if(pusherRetracted.getprestatus()){//sysj\wLoaderPlant.sysj line: 67, column: 13
                    S3111=1;
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
                
                case 1 : 
                  if(pusherExtended.getprestatus()){//sysj\wLoaderPlant.sysj line: 68, column: 13
                    capPos_1.setPresent();//sysj\wLoaderPlant.sysj line: 70, column: 7
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(1);//sysj\wLoaderPlant.sysj line: 70, column: 7
                    S3111=2;
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
                
                case 2 : 
                  if(pusherRetracted.getprestatus()){//sysj\wLoaderPlant.sysj line: 71, column: 13
                    capDec_1.setPresent();//sysj\wLoaderPlant.sysj line: 72, column: 7
                    currsigs.addElement(capDec_1);
                    S3111=0;
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
            break;
          
          case 1 : 
            if(refill.getprestatus()){//sysj\wLoaderPlant.sysj line: 75, column: 10
              S3129=0;
              S3111=0;
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
        break;
      
    }
  }

  public void thread4301(int [] tdone, int [] ends){
        switch(S3107){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S3077){
          case 0 : 
            switch(S3072){
              case 0 : 
                if(!vacOn.getprestatus()){//sysj\wLoaderPlant.sysj line: 45, column: 12
                  S3072=1;
                  if(armAtSource.getprestatus()){//sysj\wLoaderPlant.sysj line: 48, column: 14
                    capPos_1.setPresent();//sysj\wLoaderPlant.sysj line: 49, column: 7
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(1);//sysj\wLoaderPlant.sysj line: 49, column: 7
                    S3077=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S3077=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                }
                else {
                  WPgripped.setPresent();//sysj\wLoaderPlant.sysj line: 46, column: 7
                  currsigs.addElement(WPgripped);
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                break;
              
              case 1 : 
                S3077=0;
                if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\wLoaderPlant.sysj line: 42, column: 12
                  if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\wLoaderPlant.sysj line: 43, column: 8
                    capPos_1.setPresent();//sysj\wLoaderPlant.sysj line: 44, column: 6
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(0);//sysj\wLoaderPlant.sysj line: 44, column: 6
                    S3072=0;
                    WPgripped.setPresent();//sysj\wLoaderPlant.sysj line: 46, column: 7
                    currsigs.addElement(WPgripped);
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S3077=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                }
                else {
                  S3077=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S3077=1;
            S3077=0;
            if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\wLoaderPlant.sysj line: 42, column: 12
              if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\wLoaderPlant.sysj line: 43, column: 8
                capPos_1.setPresent();//sysj\wLoaderPlant.sysj line: 44, column: 6
                currsigs.addElement(capPos_1);
                capPos_1.setValue(0);//sysj\wLoaderPlant.sysj line: 44, column: 6
                S3072=0;
                WPgripped.setPresent();//sysj\wLoaderPlant.sysj line: 46, column: 7
                currsigs.addElement(WPgripped);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S3077=1;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            else {
              S3077=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread4300(int [] tdone, int [] ends){
        switch(S3063){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S3017){
          case 0 : 
            if(pusherExtend.getprestatus() && enable.getprestatus()){//sysj\wLoaderPlant.sysj line: 29, column: 10
              S3017=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              pusherRetracted.setPresent();//sysj\wLoaderPlant.sysj line: 30, column: 5
              currsigs.addElement(pusherRetracted);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\wLoaderPlant.sysj line: 32, column: 10
              S3017=2;
              pusherExtended.setPresent();//sysj\wLoaderPlant.sysj line: 34, column: 5
              currsigs.addElement(pusherExtended);
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
          
          case 2 : 
            if(!pusherExtend.getprestatus() && enable.getprestatus()){//sysj\wLoaderPlant.sysj line: 33, column: 10
              S3017=3;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              pusherExtended.setPresent();//sysj\wLoaderPlant.sysj line: 34, column: 5
              currsigs.addElement(pusherExtended);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\wLoaderPlant.sysj line: 36, column: 10
              S3017=0;
              pusherRetracted.setPresent();//sysj\wLoaderPlant.sysj line: 30, column: 5
              currsigs.addElement(pusherRetracted);
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
        break;
      
    }
  }

  public void thread4299(int [] tdone, int [] ends){
        switch(S3010){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S2964){
          case 0 : 
            if(armSource.getprestatus() && enable.getprestatus()){//sysj\wLoaderPlant.sysj line: 16, column: 10
              S2964=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              armAtDest.setPresent();//sysj\wLoaderPlant.sysj line: 17, column: 5
              currsigs.addElement(armAtDest);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\wLoaderPlant.sysj line: 19, column: 10
              S2964=2;
              armAtSource.setPresent();//sysj\wLoaderPlant.sysj line: 21, column: 5
              currsigs.addElement(armAtSource);
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
            if(armDest.getprestatus() && enable.getprestatus()){//sysj\wLoaderPlant.sysj line: 20, column: 10
              S2964=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              armAtSource.setPresent();//sysj\wLoaderPlant.sysj line: 21, column: 5
              currsigs.addElement(armAtSource);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\wLoaderPlant.sysj line: 23, column: 10
              S2964=0;
              armAtDest.setPresent();//sysj\wLoaderPlant.sysj line: 17, column: 5
              currsigs.addElement(armAtDest);
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

  public void thread4296(int [] tdone, int [] ends){
        S3285=1;
    if(empty.getprestatus()){//sysj\wLoaderPlant.sysj line: 108, column: 24
      emptyE.setPresent();//sysj\wLoaderPlant.sysj line: 108, column: 31
      currsigs.addElement(emptyE);
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread4295(int [] tdone, int [] ends){
        S3277=1;
    if(armAtDest.getprestatus()){//sysj\wLoaderPlant.sysj line: 106, column: 24
      armAtDestE.setPresent();//sysj\wLoaderPlant.sysj line: 106, column: 35
      currsigs.addElement(armAtDestE);
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread4294(int [] tdone, int [] ends){
        S3269=1;
    if(armAtSource.getprestatus()){//sysj\wLoaderPlant.sysj line: 104, column: 24
      armAtSourceE.setPresent();//sysj\wLoaderPlant.sysj line: 104, column: 37
      currsigs.addElement(armAtSourceE);
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

  public void thread4293(int [] tdone, int [] ends){
        S3261=1;
    if(WPgripped.getprestatus()){//sysj\wLoaderPlant.sysj line: 102, column: 24
      WPgrippedE.setPresent();//sysj\wLoaderPlant.sysj line: 102, column: 35
      currsigs.addElement(WPgrippedE);
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

  public void thread4292(int [] tdone, int [] ends){
        S3253=1;
    if(pusherExtended.getprestatus()){//sysj\wLoaderPlant.sysj line: 100, column: 24
      pusherExtendedE.setPresent();//sysj\wLoaderPlant.sysj line: 100, column: 40
      currsigs.addElement(pusherExtendedE);
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

  public void thread4291(int [] tdone, int [] ends){
        S3245=1;
    if(pusherRetracted.getprestatus()){//sysj\wLoaderPlant.sysj line: 98, column: 24
      pusherRetractedE.setPresent();//sysj\wLoaderPlant.sysj line: 98, column: 41
      currsigs.addElement(pusherRetractedE);
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

  public void thread4290(int [] tdone, int [] ends){
        S3287=1;
    thread4291(tdone,ends);
    thread4292(tdone,ends);
    thread4293(tdone,ends);
    thread4294(tdone,ends);
    thread4295(tdone,ends);
    thread4296(tdone,ends);
    int biggest4297 = 0;
    if(ends[8]>=biggest4297){
      biggest4297=ends[8];
    }
    if(ends[9]>=biggest4297){
      biggest4297=ends[9];
    }
    if(ends[10]>=biggest4297){
      biggest4297=ends[10];
    }
    if(ends[11]>=biggest4297){
      biggest4297=ends[11];
    }
    if(ends[12]>=biggest4297){
      biggest4297=ends[12];
    }
    if(ends[13]>=biggest4297){
      biggest4297=ends[13];
    }
    if(biggest4297 == 1){
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread4289(int [] tdone, int [] ends){
        S3237=1;
    capcount_thread_6 = 5;//sysj\wLoaderPlant.sysj line: 80, column: 3
    if(capDec_1.getprestatus()){//sysj\wLoaderPlant.sysj line: 82, column: 12
      if(capcount_thread_6 > 0) {//sysj\wLoaderPlant.sysj line: 83, column: 5
        capcount_thread_6 = capcount_thread_6 - 1;//sysj\wLoaderPlant.sysj line: 84, column: 6
      }
      if(refill.getprestatus()){//sysj\wLoaderPlant.sysj line: 86, column: 12
        capcount_thread_6 = 5;//sysj\wLoaderPlant.sysj line: 87, column: 5
        if(capcount_thread_6 == 0){//sysj\wLoaderPlant.sysj line: 90, column: 8
          empty.setPresent();//sysj\wLoaderPlant.sysj line: 91, column: 6
          currsigs.addElement(empty);
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
      else {
        if(capcount_thread_6 == 0){//sysj\wLoaderPlant.sysj line: 90, column: 8
          empty.setPresent();//sysj\wLoaderPlant.sysj line: 91, column: 6
          currsigs.addElement(empty);
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
    }
    else {
      if(refill.getprestatus()){//sysj\wLoaderPlant.sysj line: 86, column: 12
        capcount_thread_6 = 5;//sysj\wLoaderPlant.sysj line: 87, column: 5
        if(capcount_thread_6 == 0){//sysj\wLoaderPlant.sysj line: 90, column: 8
          empty.setPresent();//sysj\wLoaderPlant.sysj line: 91, column: 6
          currsigs.addElement(empty);
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
      else {
        if(capcount_thread_6 == 0){//sysj\wLoaderPlant.sysj line: 90, column: 8
          empty.setPresent();//sysj\wLoaderPlant.sysj line: 91, column: 6
          currsigs.addElement(empty);
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
    }
  }

  public void thread4288(int [] tdone, int [] ends){
        S3175=1;
    S3129=0;
    S3111=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread4287(int [] tdone, int [] ends){
        S3107=1;
    S3077=0;
    if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\wLoaderPlant.sysj line: 42, column: 12
      if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\wLoaderPlant.sysj line: 43, column: 8
        capPos_1.setPresent();//sysj\wLoaderPlant.sysj line: 44, column: 6
        currsigs.addElement(capPos_1);
        capPos_1.setValue(0);//sysj\wLoaderPlant.sysj line: 44, column: 6
        S3072=0;
        WPgripped.setPresent();//sysj\wLoaderPlant.sysj line: 46, column: 7
        currsigs.addElement(WPgripped);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        S3077=1;
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
    }
    else {
      S3077=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread4286(int [] tdone, int [] ends){
        S3063=1;
    S3017=0;
    pusherRetracted.setPresent();//sysj\wLoaderPlant.sysj line: 30, column: 5
    currsigs.addElement(pusherRetracted);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread4285(int [] tdone, int [] ends){
        S3010=1;
    S2964=0;
    armAtDest.setPresent();//sysj\wLoaderPlant.sysj line: 17, column: 5
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
      switch(S4283){
        case 0 : 
          S4283=0;
          break RUN;
        
        case 1 : 
          S4283=2;
          S4283=2;
          new Thread(new GUI()).start();//sysj\wLoaderPlant.sysj line: 9, column: 2
          capDec_1.setClear();//sysj\wLoaderPlant.sysj line: 11, column: 2
          capPos_1.setClear();//sysj\wLoaderPlant.sysj line: 12, column: 2
          capPos_1.setPresent();//sysj\wLoaderPlant.sysj line: 13, column: 2
          currsigs.addElement(capPos_1);
          capPos_1.setValue(0);//sysj\wLoaderPlant.sysj line: 13, column: 2
          thread4285(tdone,ends);
          thread4286(tdone,ends);
          thread4287(tdone,ends);
          thread4288(tdone,ends);
          thread4289(tdone,ends);
          thread4290(tdone,ends);
          int biggest4298 = 0;
          if(ends[2]>=biggest4298){
            biggest4298=ends[2];
          }
          if(ends[3]>=biggest4298){
            biggest4298=ends[3];
          }
          if(ends[4]>=biggest4298){
            biggest4298=ends[4];
          }
          if(ends[5]>=biggest4298){
            biggest4298=ends[5];
          }
          if(ends[6]>=biggest4298){
            biggest4298=ends[6];
          }
          if(ends[7]>=biggest4298){
            biggest4298=ends[7];
          }
          if(biggest4298 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          capDec_1.setClear();//sysj\wLoaderPlant.sysj line: 11, column: 2
          capPos_1.setClear();//sysj\wLoaderPlant.sysj line: 12, column: 2
          thread4299(tdone,ends);
          thread4300(tdone,ends);
          thread4301(tdone,ends);
          thread4302(tdone,ends);
          thread4303(tdone,ends);
          thread4304(tdone,ends);
          int biggest4312 = 0;
          if(ends[2]>=biggest4312){
            biggest4312=ends[2];
          }
          if(ends[3]>=biggest4312){
            biggest4312=ends[3];
          }
          if(ends[4]>=biggest4312){
            biggest4312=ends[4];
          }
          if(ends[5]>=biggest4312){
            biggest4312=ends[5];
          }
          if(ends[6]>=biggest4312){
            biggest4312=ends[6];
          }
          if(ends[7]>=biggest4312){
            biggest4312=ends[7];
          }
          if(biggest4312 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest4312 == 0){
            S4283=0;
            active[1]=0;
            ends[1]=0;
            S4283=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    capDec_1 = new Signal();
    capPos_1 = new Signal();
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
          pusherExtend.gethook();
          vacOn.gethook();
          armSource.gethook();
          armDest.gethook();
          enable.gethook();
          refill.gethook();
          df = true;
        }
        runClockDomain();
      }
      pusherExtend.setpreclear();
      vacOn.setpreclear();
      armSource.setpreclear();
      armDest.setpreclear();
      enable.setpreclear();
      refill.setpreclear();
      pusherRetracted.setpreclear();
      pusherExtended.setpreclear();
      WPgripped.setpreclear();
      armAtSource.setpreclear();
      armAtDest.setpreclear();
      empty.setpreclear();
      pusherRetractedE.setpreclear();
      pusherExtendedE.setpreclear();
      WPgrippedE.setpreclear();
      armAtSourceE.setpreclear();
      armAtDestE.setpreclear();
      emptyE.setpreclear();
      capDec_1.setpreclear();
      capPos_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = pusherExtend.getStatus() ? pusherExtend.setprepresent() : pusherExtend.setpreclear();
      pusherExtend.setpreval(pusherExtend.getValue());
      pusherExtend.setClear();
      dummyint = vacOn.getStatus() ? vacOn.setprepresent() : vacOn.setpreclear();
      vacOn.setpreval(vacOn.getValue());
      vacOn.setClear();
      dummyint = armSource.getStatus() ? armSource.setprepresent() : armSource.setpreclear();
      armSource.setpreval(armSource.getValue());
      armSource.setClear();
      dummyint = armDest.getStatus() ? armDest.setprepresent() : armDest.setpreclear();
      armDest.setpreval(armDest.getValue());
      armDest.setClear();
      dummyint = enable.getStatus() ? enable.setprepresent() : enable.setpreclear();
      enable.setpreval(enable.getValue());
      enable.setClear();
      dummyint = refill.getStatus() ? refill.setprepresent() : refill.setpreclear();
      refill.setpreval(refill.getValue());
      refill.setClear();
      pusherRetracted.sethook();
      pusherRetracted.setClear();
      pusherExtended.sethook();
      pusherExtended.setClear();
      WPgripped.sethook();
      WPgripped.setClear();
      armAtSource.sethook();
      armAtSource.setClear();
      armAtDest.sethook();
      armAtDest.setClear();
      empty.sethook();
      empty.setClear();
      pusherRetractedE.sethook();
      pusherRetractedE.setClear();
      pusherExtendedE.sethook();
      pusherExtendedE.setClear();
      WPgrippedE.sethook();
      WPgrippedE.setClear();
      armAtSourceE.sethook();
      armAtSourceE.setClear();
      armAtDestE.sethook();
      armAtDestE.setClear();
      emptyE.sethook();
      emptyE.setClear();
      capDec_1.setClear();
      capPos_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        pusherExtend.gethook();
        vacOn.gethook();
        armSource.gethook();
        armDest.gethook();
        enable.gethook();
        refill.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
