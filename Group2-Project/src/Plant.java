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
  private int S4501 = 1;
  private int S3228 = 1;
  private int S3182 = 1;
  private int S3281 = 1;
  private int S3235 = 1;
  private int S3325 = 1;
  private int S3295 = 1;
  private int S3290 = 1;
  private int S3393 = 1;
  private int S3347 = 1;
  private int S3329 = 1;
  private int S3455 = 1;
  private int S3505 = 1;
  private int S3463 = 1;
  private int S3471 = 1;
  private int S3479 = 1;
  private int S3487 = 1;
  private int S3495 = 1;
  private int S3503 = 1;
  
  private int[] ends = new int[14];
  private int[] tdone = new int[14];
  
  public void thread4528(int [] tdone, int [] ends){
        switch(S3503){
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

  public void thread4527(int [] tdone, int [] ends){
        switch(S3495){
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

  public void thread4526(int [] tdone, int [] ends){
        switch(S3487){
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

  public void thread4525(int [] tdone, int [] ends){
        switch(S3479){
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

  public void thread4524(int [] tdone, int [] ends){
        switch(S3471){
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

  public void thread4523(int [] tdone, int [] ends){
        switch(S3463){
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

  public void thread4522(int [] tdone, int [] ends){
        switch(S3505){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        thread4523(tdone,ends);
        thread4524(tdone,ends);
        thread4525(tdone,ends);
        thread4526(tdone,ends);
        thread4527(tdone,ends);
        thread4528(tdone,ends);
        int biggest4529 = 0;
        if(ends[8]>=biggest4529){
          biggest4529=ends[8];
        }
        if(ends[9]>=biggest4529){
          biggest4529=ends[9];
        }
        if(ends[10]>=biggest4529){
          biggest4529=ends[10];
        }
        if(ends[11]>=biggest4529){
          biggest4529=ends[11];
        }
        if(ends[12]>=biggest4529){
          biggest4529=ends[12];
        }
        if(ends[13]>=biggest4529){
          biggest4529=ends[13];
        }
        if(biggest4529 == 1){
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        //FINXME code
        if(biggest4529 == 0){
          S3505=0;
          active[7]=0;
          ends[7]=0;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread4521(int [] tdone, int [] ends){
        switch(S3455){
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

  public void thread4520(int [] tdone, int [] ends){
        switch(S3393){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S3347){
          case 0 : 
            if(empty.getprestatus()){//sysj\wLoaderPlant.sysj line: 65, column: 10
              S3347=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              switch(S3329){
                case 0 : 
                  if(pusherRetracted.getprestatus()){//sysj\wLoaderPlant.sysj line: 67, column: 13
                    S3329=1;
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
                    S3329=2;
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
                    S3329=0;
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
              S3347=0;
              S3329=0;
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

  public void thread4519(int [] tdone, int [] ends){
        switch(S3325){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S3295){
          case 0 : 
            switch(S3290){
              case 0 : 
                if(!vacOn.getprestatus()){//sysj\wLoaderPlant.sysj line: 45, column: 12
                  S3290=1;
                  if(armAtSource.getprestatus()){//sysj\wLoaderPlant.sysj line: 48, column: 14
                    capPos_1.setPresent();//sysj\wLoaderPlant.sysj line: 49, column: 7
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(1);//sysj\wLoaderPlant.sysj line: 49, column: 7
                    S3295=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S3295=1;
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
                S3295=0;
                if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\wLoaderPlant.sysj line: 42, column: 12
                  if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\wLoaderPlant.sysj line: 43, column: 8
                    capPos_1.setPresent();//sysj\wLoaderPlant.sysj line: 44, column: 6
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(0);//sysj\wLoaderPlant.sysj line: 44, column: 6
                    S3290=0;
                    WPgripped.setPresent();//sysj\wLoaderPlant.sysj line: 46, column: 7
                    currsigs.addElement(WPgripped);
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S3295=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                }
                else {
                  S3295=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S3295=1;
            S3295=0;
            if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\wLoaderPlant.sysj line: 42, column: 12
              if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\wLoaderPlant.sysj line: 43, column: 8
                capPos_1.setPresent();//sysj\wLoaderPlant.sysj line: 44, column: 6
                currsigs.addElement(capPos_1);
                capPos_1.setValue(0);//sysj\wLoaderPlant.sysj line: 44, column: 6
                S3290=0;
                WPgripped.setPresent();//sysj\wLoaderPlant.sysj line: 46, column: 7
                currsigs.addElement(WPgripped);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S3295=1;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            else {
              S3295=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread4518(int [] tdone, int [] ends){
        switch(S3281){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S3235){
          case 0 : 
            if(pusherExtend.getprestatus() && enable.getprestatus()){//sysj\wLoaderPlant.sysj line: 29, column: 10
              S3235=1;
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
              S3235=2;
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
              S3235=3;
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
              S3235=0;
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

  public void thread4517(int [] tdone, int [] ends){
        switch(S3228){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S3182){
          case 0 : 
            if(armSource.getprestatus() && enable.getprestatus()){//sysj\wLoaderPlant.sysj line: 16, column: 10
              S3182=1;
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
              S3182=2;
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
              S3182=3;
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
              S3182=0;
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

  public void thread4514(int [] tdone, int [] ends){
        S3503=1;
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

  public void thread4513(int [] tdone, int [] ends){
        S3495=1;
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

  public void thread4512(int [] tdone, int [] ends){
        S3487=1;
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

  public void thread4511(int [] tdone, int [] ends){
        S3479=1;
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

  public void thread4510(int [] tdone, int [] ends){
        S3471=1;
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

  public void thread4509(int [] tdone, int [] ends){
        S3463=1;
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

  public void thread4508(int [] tdone, int [] ends){
        S3505=1;
    thread4509(tdone,ends);
    thread4510(tdone,ends);
    thread4511(tdone,ends);
    thread4512(tdone,ends);
    thread4513(tdone,ends);
    thread4514(tdone,ends);
    int biggest4515 = 0;
    if(ends[8]>=biggest4515){
      biggest4515=ends[8];
    }
    if(ends[9]>=biggest4515){
      biggest4515=ends[9];
    }
    if(ends[10]>=biggest4515){
      biggest4515=ends[10];
    }
    if(ends[11]>=biggest4515){
      biggest4515=ends[11];
    }
    if(ends[12]>=biggest4515){
      biggest4515=ends[12];
    }
    if(ends[13]>=biggest4515){
      biggest4515=ends[13];
    }
    if(biggest4515 == 1){
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread4507(int [] tdone, int [] ends){
        S3455=1;
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

  public void thread4506(int [] tdone, int [] ends){
        S3393=1;
    S3347=0;
    S3329=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread4505(int [] tdone, int [] ends){
        S3325=1;
    S3295=0;
    if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\wLoaderPlant.sysj line: 42, column: 12
      if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\wLoaderPlant.sysj line: 43, column: 8
        capPos_1.setPresent();//sysj\wLoaderPlant.sysj line: 44, column: 6
        currsigs.addElement(capPos_1);
        capPos_1.setValue(0);//sysj\wLoaderPlant.sysj line: 44, column: 6
        S3290=0;
        WPgripped.setPresent();//sysj\wLoaderPlant.sysj line: 46, column: 7
        currsigs.addElement(WPgripped);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        S3295=1;
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
    }
    else {
      S3295=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread4504(int [] tdone, int [] ends){
        S3281=1;
    S3235=0;
    pusherRetracted.setPresent();//sysj\wLoaderPlant.sysj line: 30, column: 5
    currsigs.addElement(pusherRetracted);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread4503(int [] tdone, int [] ends){
        S3228=1;
    S3182=0;
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
      switch(S4501){
        case 0 : 
          S4501=0;
          break RUN;
        
        case 1 : 
          S4501=2;
          S4501=2;
          new Thread(new GUI()).start();//sysj\wLoaderPlant.sysj line: 9, column: 2
          capDec_1.setClear();//sysj\wLoaderPlant.sysj line: 11, column: 2
          capPos_1.setClear();//sysj\wLoaderPlant.sysj line: 12, column: 2
          capPos_1.setPresent();//sysj\wLoaderPlant.sysj line: 13, column: 2
          currsigs.addElement(capPos_1);
          capPos_1.setValue(0);//sysj\wLoaderPlant.sysj line: 13, column: 2
          thread4503(tdone,ends);
          thread4504(tdone,ends);
          thread4505(tdone,ends);
          thread4506(tdone,ends);
          thread4507(tdone,ends);
          thread4508(tdone,ends);
          int biggest4516 = 0;
          if(ends[2]>=biggest4516){
            biggest4516=ends[2];
          }
          if(ends[3]>=biggest4516){
            biggest4516=ends[3];
          }
          if(ends[4]>=biggest4516){
            biggest4516=ends[4];
          }
          if(ends[5]>=biggest4516){
            biggest4516=ends[5];
          }
          if(ends[6]>=biggest4516){
            biggest4516=ends[6];
          }
          if(ends[7]>=biggest4516){
            biggest4516=ends[7];
          }
          if(biggest4516 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          capDec_1.setClear();//sysj\wLoaderPlant.sysj line: 11, column: 2
          capPos_1.setClear();//sysj\wLoaderPlant.sysj line: 12, column: 2
          thread4517(tdone,ends);
          thread4518(tdone,ends);
          thread4519(tdone,ends);
          thread4520(tdone,ends);
          thread4521(tdone,ends);
          thread4522(tdone,ends);
          int biggest4530 = 0;
          if(ends[2]>=biggest4530){
            biggest4530=ends[2];
          }
          if(ends[3]>=biggest4530){
            biggest4530=ends[3];
          }
          if(ends[4]>=biggest4530){
            biggest4530=ends[4];
          }
          if(ends[5]>=biggest4530){
            biggest4530=ends[5];
          }
          if(ends[6]>=biggest4530){
            biggest4530=ends[6];
          }
          if(ends[7]>=biggest4530){
            biggest4530=ends[7];
          }
          if(biggest4530 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest4530 == 0){
            S4501=0;
            active[1]=0;
            ends[1]=0;
            S4501=0;
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
