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
  private int capcount_thread_7;//sysj\plant.sysj line: 98, column: 3
  private int S1114 = 1;
  private int S447 = 1;
  private int S500 = 1;
  private int S454 = 1;
  private int S553 = 1;
  private int S507 = 1;
  private int S597 = 1;
  private int S567 = 1;
  private int S562 = 1;
  private int S665 = 1;
  private int S619 = 1;
  private int S601 = 1;
  private int S727 = 1;
  private int S777 = 1;
  private int S735 = 1;
  private int S743 = 1;
  private int S751 = 1;
  private int S759 = 1;
  private int S767 = 1;
  private int S775 = 1;
  
  private int[] ends = new int[15];
  private int[] tdone = new int[15];
  
  public void thread1143(int [] tdone, int [] ends){
        switch(S775){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(empty.getprestatus()){//sysj\plant.sysj line: 126, column: 24
          emptyE.setPresent();//sysj\plant.sysj line: 126, column: 31
          currsigs.addElement(emptyE);
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        else {
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        break;
      
    }
  }

  public void thread1142(int [] tdone, int [] ends){
        switch(S767){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(armAtDest.getprestatus()){//sysj\plant.sysj line: 124, column: 24
          armAtDestE.setPresent();//sysj\plant.sysj line: 124, column: 35
          currsigs.addElement(armAtDestE);
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

  public void thread1141(int [] tdone, int [] ends){
        switch(S759){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(armAtSource.getprestatus()){//sysj\plant.sysj line: 122, column: 24
          armAtSourceE.setPresent();//sysj\plant.sysj line: 122, column: 37
          currsigs.addElement(armAtSourceE);
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

  public void thread1140(int [] tdone, int [] ends){
        switch(S751){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(WPgripped.getprestatus()){//sysj\plant.sysj line: 120, column: 24
          WPgrippedE.setPresent();//sysj\plant.sysj line: 120, column: 35
          currsigs.addElement(WPgrippedE);
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

  public void thread1139(int [] tdone, int [] ends){
        switch(S743){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(pusherExtended.getprestatus()){//sysj\plant.sysj line: 118, column: 24
          pusherExtendedE.setPresent();//sysj\plant.sysj line: 118, column: 40
          currsigs.addElement(pusherExtendedE);
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

  public void thread1138(int [] tdone, int [] ends){
        switch(S735){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 116, column: 24
          pusherRetractedE.setPresent();//sysj\plant.sysj line: 116, column: 41
          currsigs.addElement(pusherRetractedE);
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

  public void thread1137(int [] tdone, int [] ends){
        switch(S777){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        thread1138(tdone,ends);
        thread1139(tdone,ends);
        thread1140(tdone,ends);
        thread1141(tdone,ends);
        thread1142(tdone,ends);
        thread1143(tdone,ends);
        int biggest1144 = 0;
        if(ends[9]>=biggest1144){
          biggest1144=ends[9];
        }
        if(ends[10]>=biggest1144){
          biggest1144=ends[10];
        }
        if(ends[11]>=biggest1144){
          biggest1144=ends[11];
        }
        if(ends[12]>=biggest1144){
          biggest1144=ends[12];
        }
        if(ends[13]>=biggest1144){
          biggest1144=ends[13];
        }
        if(ends[14]>=biggest1144){
          biggest1144=ends[14];
        }
        if(biggest1144 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        //FINXME code
        if(biggest1144 == 0){
          S777=0;
          active[8]=0;
          ends[8]=0;
          tdone[8]=1;
        }
        break;
      
    }
  }

  public void thread1136(int [] tdone, int [] ends){
        switch(S727){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(capDec_1.getprestatus()){//sysj\plant.sysj line: 100, column: 12
          if(capcount_thread_7 > 0) {//sysj\plant.sysj line: 101, column: 5
            capcount_thread_7 = capcount_thread_7 - 1;//sysj\plant.sysj line: 102, column: 6
          }
          if(refill.getprestatus()){//sysj\plant.sysj line: 104, column: 12
            capcount_thread_7 = 5;//sysj\plant.sysj line: 105, column: 5
            if(capcount_thread_7 == 0){//sysj\plant.sysj line: 108, column: 8
              empty.setPresent();//sysj\plant.sysj line: 109, column: 6
              currsigs.addElement(empty);
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
          else {
            if(capcount_thread_7 == 0){//sysj\plant.sysj line: 108, column: 8
              empty.setPresent();//sysj\plant.sysj line: 109, column: 6
              currsigs.addElement(empty);
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
        }
        else {
          if(refill.getprestatus()){//sysj\plant.sysj line: 104, column: 12
            capcount_thread_7 = 5;//sysj\plant.sysj line: 105, column: 5
            if(capcount_thread_7 == 0){//sysj\plant.sysj line: 108, column: 8
              empty.setPresent();//sysj\plant.sysj line: 109, column: 6
              currsigs.addElement(empty);
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
          else {
            if(capcount_thread_7 == 0){//sysj\plant.sysj line: 108, column: 8
              empty.setPresent();//sysj\plant.sysj line: 109, column: 6
              currsigs.addElement(empty);
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
        }
        break;
      
    }
  }

  public void thread1135(int [] tdone, int [] ends){
        switch(S665){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S619){
          case 0 : 
            if(empty.getprestatus()){//sysj\plant.sysj line: 83, column: 10
              S619=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              switch(S601){
                case 0 : 
                  if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 85, column: 13
                    S601=1;
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
                
                case 1 : 
                  if(pusherExtended.getprestatus()){//sysj\plant.sysj line: 86, column: 13
                    capPos_1.setPresent();//sysj\plant.sysj line: 88, column: 7
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(1);//sysj\plant.sysj line: 88, column: 7
                    S601=2;
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
                
                case 2 : 
                  if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 89, column: 13
                    capDec_1.setPresent();//sysj\plant.sysj line: 90, column: 7
                    currsigs.addElement(capDec_1);
                    S601=0;
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
            break;
          
          case 1 : 
            if(refill.getprestatus()){//sysj\plant.sysj line: 93, column: 10
              S619=0;
              S601=0;
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
        break;
      
    }
  }

  public void thread1134(int [] tdone, int [] ends){
        switch(S597){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S567){
          case 0 : 
            switch(S562){
              case 0 : 
                if(!vacOn.getprestatus()){//sysj\plant.sysj line: 63, column: 12
                  S562=1;
                  if(armAtSource.getprestatus()){//sysj\plant.sysj line: 66, column: 14
                    capPos_1.setPresent();//sysj\plant.sysj line: 67, column: 7
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(1);//sysj\plant.sysj line: 67, column: 7
                    S567=1;
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                  else {
                    S567=1;
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                }
                else {
                  WPgripped.setPresent();//sysj\plant.sysj line: 64, column: 7
                  currsigs.addElement(WPgripped);
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                break;
              
              case 1 : 
                S567=0;
                if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plant.sysj line: 60, column: 12
                  if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\plant.sysj line: 61, column: 8
                    capPos_1.setPresent();//sysj\plant.sysj line: 62, column: 6
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(0);//sysj\plant.sysj line: 62, column: 6
                    S562=0;
                    WPgripped.setPresent();//sysj\plant.sysj line: 64, column: 7
                    currsigs.addElement(WPgripped);
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                  else {
                    S567=1;
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                }
                else {
                  S567=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S567=1;
            S567=0;
            if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plant.sysj line: 60, column: 12
              if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\plant.sysj line: 61, column: 8
                capPos_1.setPresent();//sysj\plant.sysj line: 62, column: 6
                currsigs.addElement(capPos_1);
                capPos_1.setValue(0);//sysj\plant.sysj line: 62, column: 6
                S562=0;
                WPgripped.setPresent();//sysj\plant.sysj line: 64, column: 7
                currsigs.addElement(WPgripped);
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                S567=1;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
            }
            else {
              S567=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1133(int [] tdone, int [] ends){
        switch(S553){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S507){
          case 0 : 
            if(pusherExtend.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 47, column: 10
              S507=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              pusherRetracted.setPresent();//sysj\plant.sysj line: 48, column: 5
              currsigs.addElement(pusherRetracted);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 50, column: 10
              S507=2;
              pusherExtended.setPresent();//sysj\plant.sysj line: 52, column: 5
              currsigs.addElement(pusherExtended);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 2 : 
            if(!pusherExtend.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 51, column: 10
              S507=3;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              pusherExtended.setPresent();//sysj\plant.sysj line: 52, column: 5
              currsigs.addElement(pusherExtended);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 54, column: 10
              S507=0;
              pusherRetracted.setPresent();//sysj\plant.sysj line: 48, column: 5
              currsigs.addElement(pusherRetracted);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1132(int [] tdone, int [] ends){
        switch(S500){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S454){
          case 0 : 
            if(armSource.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 34, column: 10
              S454=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              armAtDest.setPresent();//sysj\plant.sysj line: 35, column: 5
              currsigs.addElement(armAtDest);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 37, column: 10
              S454=2;
              armAtSource.setPresent();//sysj\plant.sysj line: 39, column: 5
              currsigs.addElement(armAtSource);
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
            if(armDest.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 38, column: 10
              S454=3;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              armAtSource.setPresent();//sysj\plant.sysj line: 39, column: 5
              currsigs.addElement(armAtSource);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 41, column: 10
              S454=0;
              armAtDest.setPresent();//sysj\plant.sysj line: 35, column: 5
              currsigs.addElement(armAtDest);
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

  public void thread1131(int [] tdone, int [] ends){
        switch(S447){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        System.out.println("LOOPBOY");//sysj\plant.sysj line: 27, column: 4
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
        break;
      
    }
  }

  public void thread1128(int [] tdone, int [] ends){
        S775=1;
    if(empty.getprestatus()){//sysj\plant.sysj line: 126, column: 24
      emptyE.setPresent();//sysj\plant.sysj line: 126, column: 31
      currsigs.addElement(emptyE);
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread1127(int [] tdone, int [] ends){
        S767=1;
    if(armAtDest.getprestatus()){//sysj\plant.sysj line: 124, column: 24
      armAtDestE.setPresent();//sysj\plant.sysj line: 124, column: 35
      currsigs.addElement(armAtDestE);
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

  public void thread1126(int [] tdone, int [] ends){
        S759=1;
    if(armAtSource.getprestatus()){//sysj\plant.sysj line: 122, column: 24
      armAtSourceE.setPresent();//sysj\plant.sysj line: 122, column: 37
      currsigs.addElement(armAtSourceE);
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

  public void thread1125(int [] tdone, int [] ends){
        S751=1;
    if(WPgripped.getprestatus()){//sysj\plant.sysj line: 120, column: 24
      WPgrippedE.setPresent();//sysj\plant.sysj line: 120, column: 35
      currsigs.addElement(WPgrippedE);
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

  public void thread1124(int [] tdone, int [] ends){
        S743=1;
    if(pusherExtended.getprestatus()){//sysj\plant.sysj line: 118, column: 24
      pusherExtendedE.setPresent();//sysj\plant.sysj line: 118, column: 40
      currsigs.addElement(pusherExtendedE);
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

  public void thread1123(int [] tdone, int [] ends){
        S735=1;
    if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 116, column: 24
      pusherRetractedE.setPresent();//sysj\plant.sysj line: 116, column: 41
      currsigs.addElement(pusherRetractedE);
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

  public void thread1122(int [] tdone, int [] ends){
        S777=1;
    thread1123(tdone,ends);
    thread1124(tdone,ends);
    thread1125(tdone,ends);
    thread1126(tdone,ends);
    thread1127(tdone,ends);
    thread1128(tdone,ends);
    int biggest1129 = 0;
    if(ends[9]>=biggest1129){
      biggest1129=ends[9];
    }
    if(ends[10]>=biggest1129){
      biggest1129=ends[10];
    }
    if(ends[11]>=biggest1129){
      biggest1129=ends[11];
    }
    if(ends[12]>=biggest1129){
      biggest1129=ends[12];
    }
    if(ends[13]>=biggest1129){
      biggest1129=ends[13];
    }
    if(ends[14]>=biggest1129){
      biggest1129=ends[14];
    }
    if(biggest1129 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread1121(int [] tdone, int [] ends){
        S727=1;
    capcount_thread_7 = 5;//sysj\plant.sysj line: 98, column: 3
    if(capDec_1.getprestatus()){//sysj\plant.sysj line: 100, column: 12
      if(capcount_thread_7 > 0) {//sysj\plant.sysj line: 101, column: 5
        capcount_thread_7 = capcount_thread_7 - 1;//sysj\plant.sysj line: 102, column: 6
      }
      if(refill.getprestatus()){//sysj\plant.sysj line: 104, column: 12
        capcount_thread_7 = 5;//sysj\plant.sysj line: 105, column: 5
        if(capcount_thread_7 == 0){//sysj\plant.sysj line: 108, column: 8
          empty.setPresent();//sysj\plant.sysj line: 109, column: 6
          currsigs.addElement(empty);
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
      else {
        if(capcount_thread_7 == 0){//sysj\plant.sysj line: 108, column: 8
          empty.setPresent();//sysj\plant.sysj line: 109, column: 6
          currsigs.addElement(empty);
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
    }
    else {
      if(refill.getprestatus()){//sysj\plant.sysj line: 104, column: 12
        capcount_thread_7 = 5;//sysj\plant.sysj line: 105, column: 5
        if(capcount_thread_7 == 0){//sysj\plant.sysj line: 108, column: 8
          empty.setPresent();//sysj\plant.sysj line: 109, column: 6
          currsigs.addElement(empty);
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
      else {
        if(capcount_thread_7 == 0){//sysj\plant.sysj line: 108, column: 8
          empty.setPresent();//sysj\plant.sysj line: 109, column: 6
          currsigs.addElement(empty);
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
    }
  }

  public void thread1120(int [] tdone, int [] ends){
        S665=1;
    S619=0;
    S601=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread1119(int [] tdone, int [] ends){
        S597=1;
    S567=0;
    if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plant.sysj line: 60, column: 12
      if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\plant.sysj line: 61, column: 8
        capPos_1.setPresent();//sysj\plant.sysj line: 62, column: 6
        currsigs.addElement(capPos_1);
        capPos_1.setValue(0);//sysj\plant.sysj line: 62, column: 6
        S562=0;
        WPgripped.setPresent();//sysj\plant.sysj line: 64, column: 7
        currsigs.addElement(WPgripped);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
      else {
        S567=1;
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
    }
    else {
      S567=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread1118(int [] tdone, int [] ends){
        S553=1;
    S507=0;
    pusherRetracted.setPresent();//sysj\plant.sysj line: 48, column: 5
    currsigs.addElement(pusherRetracted);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread1117(int [] tdone, int [] ends){
        S500=1;
    S454=0;
    armAtDest.setPresent();//sysj\plant.sysj line: 35, column: 5
    currsigs.addElement(armAtDest);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread1116(int [] tdone, int [] ends){
        S447=1;
    System.out.println("LOOPBOY");//sysj\plant.sysj line: 27, column: 4
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
      switch(S1114){
        case 0 : 
          S1114=0;
          break RUN;
        
        case 1 : 
          S1114=2;
          S1114=2;
          capDec_1.setClear();//sysj\plant.sysj line: 18, column: 2
          capPos_1.setClear();//sysj\plant.sysj line: 19, column: 2
          capPos_1.setPresent();//sysj\plant.sysj line: 20, column: 2
          currsigs.addElement(capPos_1);
          capPos_1.setValue(0);//sysj\plant.sysj line: 20, column: 2
          thread1116(tdone,ends);
          thread1117(tdone,ends);
          thread1118(tdone,ends);
          thread1119(tdone,ends);
          thread1120(tdone,ends);
          thread1121(tdone,ends);
          thread1122(tdone,ends);
          int biggest1130 = 0;
          if(ends[2]>=biggest1130){
            biggest1130=ends[2];
          }
          if(ends[3]>=biggest1130){
            biggest1130=ends[3];
          }
          if(ends[4]>=biggest1130){
            biggest1130=ends[4];
          }
          if(ends[5]>=biggest1130){
            biggest1130=ends[5];
          }
          if(ends[6]>=biggest1130){
            biggest1130=ends[6];
          }
          if(ends[7]>=biggest1130){
            biggest1130=ends[7];
          }
          if(ends[8]>=biggest1130){
            biggest1130=ends[8];
          }
          if(biggest1130 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          capDec_1.setClear();//sysj\plant.sysj line: 18, column: 2
          capPos_1.setClear();//sysj\plant.sysj line: 19, column: 2
          thread1131(tdone,ends);
          thread1132(tdone,ends);
          thread1133(tdone,ends);
          thread1134(tdone,ends);
          thread1135(tdone,ends);
          thread1136(tdone,ends);
          thread1137(tdone,ends);
          int biggest1145 = 0;
          if(ends[2]>=biggest1145){
            biggest1145=ends[2];
          }
          if(ends[3]>=biggest1145){
            biggest1145=ends[3];
          }
          if(ends[4]>=biggest1145){
            biggest1145=ends[4];
          }
          if(ends[5]>=biggest1145){
            biggest1145=ends[5];
          }
          if(ends[6]>=biggest1145){
            biggest1145=ends[6];
          }
          if(ends[7]>=biggest1145){
            biggest1145=ends[7];
          }
          if(ends[8]>=biggest1145){
            biggest1145=ends[8];
          }
          if(biggest1145 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1145 == 0){
            S1114=0;
            active[1]=0;
            ends[1]=0;
            S1114=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
