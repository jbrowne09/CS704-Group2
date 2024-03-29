package org.compsys704;

import java.awt.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.*;

import javax.imageio.ImageIO;


public class systemCanvas extends JPanel{
	BufferedImage systemBackground;
	BufferedImage rotaryTable;
	BufferedImage signalBackground;

	//conveyor
	private boolean bottleLeft5 = false;
	private boolean motor = false;
	
	//rotary-table
	private boolean bottlePos1 = false;
	private boolean bottlePos2 = false;
	private boolean bottlePos3 = false;
	private boolean bottlePos4 = false;
	private boolean bottlePos5 = false;
	private boolean rotate = false;
	
	//Filler
	private boolean liquidPos1 = false;
	private boolean liquidPos2 = false;
	private boolean liquidPos3 = false;
	private boolean liquidPos4 = false;
	private boolean canTop = false;
	private boolean inletIsOn = false;
	private boolean injectorIsOn = false;
	private boolean NbottleFilled = false;
	
	//Bottle-Loader/Unloader
	private boolean bottleAtLoad = false;
	private boolean gripLoadBottle = false;
	private boolean ungripLoadBottle = false;
	private boolean toA = false;
	private boolean toB = false;
	private boolean toC = false;
	private boolean gripUnloadBottle = false;
	private boolean ungripUnloadBottle = false;
	private boolean toA2 = false;
	private boolean toB2 = false;
	private boolean toC2 = false;
	
	//Capper
	private boolean clampBottle = false;
	private boolean gripCap = false;
	private boolean gripDown = false;
	private boolean twistGrip = false;
	private boolean untwistGrip = false; 
	private boolean NbottleCapped = false;
	
	//LidLoader
	private boolean pusherExtend = false;
	private boolean toDest = false;
	private boolean toInit = false;
	private boolean vacOn = false;
	
	//various variables for tracking bottle positions (used for visualiser 
	//printing)
	int loadPosX = -1;
	int loadPosY = -1;
	int loadArmAngle = 45;
	int loadArmX = 172;
	int loadArmY = 411;
	boolean moveToLoadPoint = false;
	boolean moveToLoadInit = false;
	boolean moveToLoadConv = false;
	boolean grippedLoadBottle = false;
	boolean bottleWait = false;
	
	int unloadPosX = -1;
	int unloadPosY = -1;
	int unloadArmAngle = 45;
	int unloadArmX = 851;
	int unloadArmY = 411;
	boolean moveToUnloadPoint = false;
	boolean moveToUnloadInit = false;
	boolean moveToUnloadConv = false;
	boolean grippedUnloadBottle = false;
	
	int loadConvPos = -1;
	int unloadConvPos = -1;
	boolean motorRunning = false;
	
	int rotateAngle = 0;
	int pos1X = -1;
	int pos1Y = -1;
	int pos2X = -1;
	int pos2Y = -1;
	int pos3X = -1;
	int pos3Y = -1;
	int pos4X = -1;
	int pos4Y = -1;
	boolean rotating = false;
	boolean finishedRotation = true;
	
	int fillerAngle = 60;
	int selectedNozzle = 1;
	int currentNozzle = 1;
	int fillerX = 378;
	int fillerY = 105;
	boolean moveNozzle = false;
	
	int armExtend = 0;
	int crossRadius = 64;
	int capX = 664;
	int capY = 168;
	int capEndX = 0;
	int capEndY = 0;
	int crossX1 = 0;
	int crossY1 = 0;
	int crossX2 = 0;
	int crossY2 = 0;
	int grip1X1 = 0;
	int grip1Y1 = 0;
	int grip1X2 = 0;
	int grip1Y2 = 0;
	int grip2X1 = 0;
	int grip2Y1 = 0;
	int grip2X2 = 0;
	int grip2Y2 = 0;
	int clampPos = 0;
	int gripAngle = 0;
	boolean moveGrip = false;
	boolean tightGrip = false;
	boolean clamp = false;
	boolean rotateGrip = false;
	
	int lloaderArmX = 512;
	int lloaderArmY = 64;
	int lloaderArmAngle = 30;
	int pusherX = 670;
	int lidX = 640;
	int lidY = 64;
	boolean vacHold = false;
	boolean newLid = false;
	
	public systemCanvas(){
		try {
			systemBackground = ImageIO.read(new File("res/systemBackground.png"));
			rotaryTable = ImageIO.read(new File("res/rotaryTable.png"));
			signalBackground = ImageIO.read(new File("res/signalsBackground.png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);;
		}
	}
	
	//TO BE REMOVED
	public void updateSignals(String signal, boolean status) {
		switch(signal) {
			case "pusherExtend":
				this.pusherExtend = status;
				break;
			case "toDest":
				this.toDest = status;
				break;
			case "toInit":
				this.toInit = status;
				break;
			case "vacOn":
				this.vacOn = status;
				break;
		}
	}
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(systemBackground, 0, 0, null);
		g.drawImage(signalBackground, 0, 512, null);
		Graphics2D g2 = (Graphics2D) g;
		
		//initial bottleAtLoad
		this.bottleAtLoad = States.bottleAtLoad;
		
		//conveyor	
		this.bottleLeft5 = States.bottleLeft5;
		this.motor = States.MOTOR;
		
		//rotary-table
		this.bottlePos1 = States.bottlePos1;
		this.bottlePos2 = States.bottlePos2;
		this.bottlePos3 = States.bottlePos3;
		this.bottlePos4 = States.bottlePos4;
		this.bottlePos5 = States.bottlePos5;
		this.rotate = States.rotate;
		if (!States.rotate) {
			finishedRotation = true;
		}
		
		//filler
		this.liquidPos1 = States.fill1;
		this.liquidPos2 = States.fill2;
		this.liquidPos3 = States.fill3;
		this.liquidPos4 = States.fill4;
		this.canTop = States.canTop;
		this.inletIsOn = States.inletIsOn;
		this.injectorIsOn = States.injectorIsOn;
		
		//capper	
		this.clampBottle = States.bottleClamped;
		this.gripCap = States.gripCap;
		this.gripDown = States.gripperLowered;
		this.twistGrip = States.gripperTurned;
		this.untwistGrip = States.gripperInit;
		
		//bottle-loader
		this.gripLoadBottle = States.gripContainer;
		this.ungripLoadBottle = States.releaseContainer;
		this.toA = States.armtoA;
		this.toB = States.armtoB;
		this.toC = States.armtoC;
		
		//bottle-unloader
		this.gripUnloadBottle = States.gripContainer2;
		this.ungripUnloadBottle = States.releaseContainer2;
		this.toA2 = States.armtoA2;
		this.toB2 = States.armtoB2;
		this.toC2 = States.armtoC2;
		
		//caploader
		this.pusherExtend = States.pusherExtend;
		this.toDest = States.toDest;
		this.toInit = States.toInit;
		this.vacOn = States.vacOn;	
		
		//#######################################################################################
		//UPDATING ANIMATION STATUS BELOW
		
		//Loading Arm
		if(this.bottleAtLoad && loadPosX != 81 && loadPosY != 448) {
			bottleWait = true;
		}
		if(bottleWait && loadPosX == -1 && loadPosY == -1) {
			loadPosX = 81;
			loadPosY = 448;
			bottleWait = false;
		}
		
		if(this.toA) {
			moveToLoadInit = true;
		} else {
			moveToLoadInit = false;
		}
		if(this.toB) {
			moveToLoadPoint = true;
		} else {
			moveToLoadPoint = false;
		}
		if(this.toC) {
			moveToLoadConv = true;
		} else {
			moveToLoadConv = false;
		}
			
		//Unloading Arm
		if(this.bottleLeft5) {
			unloadPosX = 814;
			unloadPosY = 320;
		}
		if(this.toA2) {
			moveToUnloadInit = true;
		} else {
			moveToUnloadInit = false;
		}
		if(this.toB2) {
			moveToUnloadPoint = true;
		} else {
			moveToUnloadPoint = false;
		}
		if(this.toC2) {
			moveToUnloadConv = true;
		} else {
			moveToUnloadConv = false;
		}
			
		//Conveyor and updating grip status of unload/load bottles
		if (this.gripLoadBottle) {
			if (loadArmX == loadPosX && loadArmY == loadPosY) {
				grippedLoadBottle = true;
			}
		} 
		if (this.ungripLoadBottle) {
			if (!(loadPosX == 81 && loadPosY == 448)) {
				if (loadPosX == 209 && loadPosY == 320) {
					loadConvPos = 179;
				}
				loadPosX = -1;
				loadPosY = -1;
			}
			grippedLoadBottle = false;
		}
		if (this.gripUnloadBottle) {
			if (unloadArmX == unloadPosX && unloadArmY == unloadPosY) {
				grippedUnloadBottle = true;
			}
			if (unloadPosX == 814 && loadPosY == 320) {
				unloadConvPos = -1;
			}
		} 
		if (this.ungripUnloadBottle) {
			if (!(unloadPosX == 814 && loadPosY == 320)) {
				unloadPosX = -1;
				unloadPosY = -1;
			}
			grippedUnloadBottle = false;
		}
		
		if(this.bottlePos1) {
			if (!(this.loadConvPos == 179)) { 
				loadConvPos = -1;
			}
			
			pos1X = 401;
			pos1Y = 320;
		}
		if(this.bottlePos5) {
			if (!this.bottlePos4) {
				pos4X = -1;
				pos4Y = -1;
			}
			
			unloadConvPos = 593;
		}
		if(this.bottleLeft5) {
			if (!this.bottlePos5) {
				unloadConvPos = -1;
			}
			
			unloadPosX = 814;
			unloadPosY = 320;
		}
		if(this.motor) {
			motorRunning = true;
		} else {
			motorRunning = false;
		}
		
		//Rotary-Table
		if(this.bottlePos2) {
			if (!this.bottlePos1) {
				pos1X = -1;
				pos1Y = -1;
			}
			
			pos2X = 401;
			pos2Y = 192;
		}
		if(this.bottlePos3) {
			if(!this.bottlePos2) {
				pos2X = -1;
				pos2Y = -1;
			}
				
			pos3X = 512;
			pos3Y = 128;
		}
		if(this.bottlePos4) {
			if(!this.bottlePos3) {
				pos3X = -1;
				pos3Y = -1;
			}
			
			pos4X = 623;
			pos4Y = 192;
		}
		if(this.rotate && finishedRotation) {
			rotating = true;
			finishedRotation = false;
		}
		
		//Filler
		if(this.liquidPos1) {
			selectedNozzle = 1;
			moveNozzle = true;
		} else if (this.liquidPos2) {
			selectedNozzle = 2;
			moveNozzle = true;
		} else if (this.liquidPos3) {
			selectedNozzle = 3;
			moveNozzle = true;
		} else if (this.liquidPos4) {
			selectedNozzle = 4;
			moveNozzle = true;
		} else {
			moveNozzle = false;
		}
			
		//Capper
		if (this.gripDown) {
			moveGrip = true;
		} else {
			moveGrip = false;
		}
		if (this.gripCap) {
			tightGrip = true;
		} else {
			tightGrip = false;
		}
		if (this.clampBottle) {
			clamp = true;
		} else {
			clamp = false;
		}
		if (this.twistGrip) {
			rotateGrip = true;
		} else if (this.untwistGrip) {
			rotateGrip = false;
		}
		
		//END OF UPDATING ANIMATION STATUS
		//#######################################################################################
		
		
		//drawing loading bottle/arm
		if (moveToLoadPoint) {
			if (loadArmAngle > 0) {
				loadArmAngle -= 1;
			}
		} else if (moveToLoadConv) {
			if (loadArmAngle < 90) {
				loadArmAngle += 1;
			}
		} else if (moveToLoadInit) {
			if (loadArmAngle < 45) {
				loadArmAngle += 1;
			} else if (loadArmAngle > 45){
				loadArmAngle -= 1;
			}
		}
		loadArmX = 81 + (int)(128*Math.cos(Math.toRadians(90-loadArmAngle)));
		loadArmY = 320 + (int)(128*Math.sin(Math.toRadians(90-loadArmAngle)));
		
		if (loadPosX != -1 && loadPosY != -1) {
			if (grippedLoadBottle) {
				loadPosX = loadArmX;
				loadPosY = loadArmY;
			}
		}
		g.setColor(Color.BLUE);
		if(loadPosX != -1 && loadPosY != -1) {
			g.fillOval(loadPosX-30, loadPosY-30, 60, 60);
		}	
		if(bottleWait) {
			g.fillOval(81-30, 448-30, 60, 60);
		}
		
		g2.setColor(Color.BLACK);
		g2.setStroke(new BasicStroke(8));
		g2.drawLine(81, 320, loadArmX, loadArmY);
		g2.fillOval(73, 312, 16, 16);
		
		//drawing unloading bottle/arm
		if (moveToUnloadPoint) {
			if (unloadArmAngle > 0) {
				unloadArmAngle -= 1;
			}
		} else if (moveToUnloadConv) {
			if (unloadArmAngle < 90) {
				unloadArmAngle += 1;
			}
		} else if (moveToUnloadInit) {
			if (unloadArmAngle < 45) {
				unloadArmAngle += 1;
			} else if (unloadArmAngle > 45){
				unloadArmAngle -= 1;
			}
		}
		unloadArmX = 942 - (int)(128*Math.cos(Math.toRadians(90-unloadArmAngle)));
		unloadArmY = 320 + (int)(128*Math.sin(Math.toRadians(90-unloadArmAngle)));
		
		if (unloadPosX != -1 && unloadPosY != -1) {
			if (grippedUnloadBottle) {
				unloadPosX = unloadArmX;
				unloadPosY = unloadArmY;
			}
		}
		g.setColor(Color.BLUE);
		if(unloadPosX != -1 && unloadPosY != -1) {
			g.fillOval(unloadPosX-30, unloadPosY-30, 60, 60);
		}	
		
		g2.setColor(Color.BLACK);
		g2.setStroke(new BasicStroke(8));
		g2.drawLine(942, 320, unloadArmX, unloadArmY);
		g2.fillOval(934, 312, 16, 16);
		
		//drawing bottles on the conveyor
		g.setColor(Color.BLUE);
		if(loadConvPos != -1) {
			g.fillOval(loadConvPos, 290, 60, 60);
			
			if(motorRunning && loadConvPos < 371) {
				loadConvPos += 1;
			}
		}
		if(unloadConvPos != -1) {
			g.fillOval(unloadConvPos, 290, 60, 60);
			
			if(motorRunning && unloadConvPos < 784) {
				unloadConvPos += 1;
			}
		}
		
		//drawing rotary-table
		int w = rotaryTable.getWidth();
		int h = rotaryTable.getHeight();
		AffineTransform at = AffineTransform.getTranslateInstance(384, 128);
		at.rotate(Math.toRadians(rotateAngle), w/2, h/2);
		
		if(rotating) {
			if (rotateAngle < 60) {
				rotateAngle += 1;
			} else {			
				rotateAngle = 0;
				rotating = false;
			}
		}
		g2.drawImage(rotaryTable, at, null);
		
		//bottles on the rotary-table
		if(rotating) {
			if (rotateAngle <= 30) {
				if (pos1X != -1 && pos1Y != -1) {
					pos1X = 512-(int)(128*Math.cos(Math.toRadians(30-rotateAngle)));
					pos1Y = 256+(int)(128*Math.sin(Math.toRadians(30-rotateAngle)));
				}
				if (pos2X != -1 && pos2Y != -1) {
					pos2X = 512-(int)(128*Math.cos(Math.toRadians(30+rotateAngle)));
					pos2Y = 256-(int)(128*Math.sin(Math.toRadians(30+rotateAngle)));
				}
				if (pos3X != -1 && pos3Y != -1) {
					pos3X = 512+(int)(128*Math.sin(Math.toRadians(rotateAngle)));
					pos3Y = 256-(int)(128*Math.cos(Math.toRadians(rotateAngle)));
				}
				if (pos4X != -1 && pos4Y != -1) {
					pos4X = 512+(int)(128*Math.cos(Math.toRadians(30-rotateAngle)));
					pos4Y = 256-(int)(128*Math.sin(Math.toRadians(30-rotateAngle)));
				}
			} else {
				if (pos1X != -1 && pos1Y != -1) {
					pos1X = 512-(int)(128*Math.cos(Math.toRadians(rotateAngle-30)));
					pos1Y = 256-(int)(128*Math.sin(Math.toRadians(rotateAngle-30)));
				}
				if (pos2X != -1 && pos2Y != -1) {
					pos2X = 512-(int)(128*Math.sin(Math.toRadians(60-rotateAngle)));
					pos2Y = 256-(int)(128*Math.cos(Math.toRadians(60-rotateAngle)));
				}
				if (pos3X != -1 && pos3Y != -1) {
					pos3X = 512+(int)(128*Math.cos(Math.toRadians(90-rotateAngle)));
					pos3Y = 256-(int)(128*Math.sin(Math.toRadians(90-rotateAngle)));
				}
				if (pos4X != -1 && pos4Y != -1) {
					pos4X = 512+(int)(128*Math.cos(Math.toRadians(rotateAngle-30)));
					pos4Y = 256+(int)(128*Math.sin(Math.toRadians(rotateAngle-30)));
				}
			}
		}
		if(pos1X != -1 && pos1Y != -1) {
			g.fillOval(pos1X-30, pos1Y-30, 60, 60);
		}
		if(pos2X != -1 && pos2Y != -1) {
			g.fillOval(pos2X-30, pos2Y-30, 60, 60);
		}
		if(pos3X != -1 && pos3Y != -1) {
			g.fillOval(pos3X-30, pos3Y-30, 60, 60);
		}
		if(pos4X != -1 && pos4Y != -1) {
			g.fillOval(pos4X-30, pos4Y-30, 60, 60);
		}
		
		//Filler
		//liquid/nozzle 1 = yellow
		//liquid/nozzle 2 = green
		//liquid/nozzle 3 = cyan
		//liquid/nozzle 4 = pink
		if(moveNozzle && currentNozzle == selectedNozzle) {
			if (fillerAngle > -30) {
				fillerAngle -= 1;
			}
		} else {
			if (fillerAngle < 60) {
				fillerAngle += 1;
			}
		}
		if (fillerAngle >= 0) {
			fillerX = (int)(346+64*Math.cos(Math.toRadians(fillerAngle)));
			fillerY = (int)(160-64*Math.sin(Math.toRadians(fillerAngle)));
		} else {
			fillerX = (int)(346+64*Math.cos(Math.toRadians(Math.abs(fillerAngle))));
			fillerY = (int)(160+64*Math.sin(Math.toRadians(Math.abs(fillerAngle))));
		}
		
		if(fillerAngle == 60) {
			currentNozzle = selectedNozzle;
		}
		if(currentNozzle == 1) {
			g2.setColor(Color.GREEN);
			g2.drawLine(346, 160, 378, 104);
			
			g2.setColor(Color.YELLOW);
			g2.drawLine(346, 160, fillerX, fillerY);
			
		} else if (currentNozzle == 2) {
			g2.setColor(Color.GREEN);
			g2.drawLine(346, 160, fillerX, fillerY);
			
			g2.setColor(Color.YELLOW);
			g2.drawLine(346, 160, 378, 104);
			
		} else if (currentNozzle == 3) {
			g2.setColor(Color.CYAN);
			g2.drawLine(346, 160, fillerX, fillerY);
			
			g2.setColor(Color.YELLOW);
			g2.drawLine(346, 160, 378, 104);
			
		} else if (currentNozzle == 4) {
			g2.setColor(Color.PINK);
			g2.drawLine(346, 160, fillerX, fillerY);
			
			g2.setColor(Color.YELLOW);
			g2.drawLine(346, 160, 378, 104);
		}
		
		//Capper
		if (moveGrip) {
			if (armExtend < 47) {
				armExtend += 1;
			}
		} else {
			if (armExtend > 0) {
				armExtend -= 1;
			}
		}
		if (tightGrip) {
			if (crossRadius > 48) {
				crossRadius -= 2;
			}
		} else {
			if (crossRadius < 64) {
				crossRadius += 2;
			}
		}
		if (clamp) {
			if (clampPos < 16) {
				clampPos += 1;
			}
		} else {
			if (clampPos > 0) {
				clampPos -= 1;
			}
		}
		if (rotateGrip) {
			if (gripAngle < 90) {
				gripAngle += 1;
			}
		} else {
			if (gripAngle > 0) {
				gripAngle -= 1;
			}
		}
		
		capX = 664 - (int)(armExtend*Math.cos(Math.toRadians(30)));
		capY = 168 + (int)(armExtend*Math.sin(Math.toRadians(30)));
		capEndX = capX + (int)(111*Math.cos(Math.toRadians(30)));
		capEndY = capY - (int)(111*Math.sin(Math.toRadians(30)));
		
		if (gripAngle <= 60) {
			crossX1 = capX - (int)((crossRadius/2)*Math.cos(Math.toRadians(60-gripAngle)));
			crossX2 = capX + (int)((crossRadius/2)*Math.cos(Math.toRadians(60-gripAngle)));
			crossY1 = capY - (int)((crossRadius/2)*Math.sin(Math.toRadians(60-gripAngle)));
			crossY2 = capY + (int)((crossRadius/2)*Math.sin(Math.toRadians(60-gripAngle)));
			grip1X1 = crossX1 - (int)(20*Math.cos(Math.toRadians(30+gripAngle)));
			grip1X2 = crossX1 + (int)(20*Math.cos(Math.toRadians(30+gripAngle)));
			grip1Y1 = crossY1 + (int)(20*Math.sin(Math.toRadians(30+gripAngle)));
			grip1Y2 = crossY1 - (int)(20*Math.sin(Math.toRadians(30+gripAngle)));
			grip2X1 = crossX2 - (int)(20*Math.cos(Math.toRadians(30+gripAngle)));
			grip2X2 = crossX2 + (int)(20*Math.cos(Math.toRadians(30+gripAngle)));
			grip2Y1 = crossY2 + (int)(20*Math.sin(Math.toRadians(30+gripAngle)));
			grip2Y2 = crossY2 - (int)(20*Math.sin(Math.toRadians(30+gripAngle)));
		} else {
			crossX1 = capX - (int)((crossRadius/2)*Math.cos(Math.toRadians(gripAngle-60)));
			crossX2 = capX + (int)((crossRadius/2)*Math.cos(Math.toRadians(gripAngle-60)));
			crossY1 = capY + (int)((crossRadius/2)*Math.sin(Math.toRadians(gripAngle-60)));
			crossY2 = capY - (int)((crossRadius/2)*Math.sin(Math.toRadians(gripAngle-60)));
			grip1X1 = crossX1 + (int)(20*Math.cos(Math.toRadians(90-gripAngle+60)));
			grip1X2 = crossX1 - (int)(20*Math.cos(Math.toRadians(90-gripAngle+60)));
			grip1Y1 = crossY1 + (int)(20*Math.sin(Math.toRadians(90-gripAngle+60)));
			grip1Y2 = crossY1 - (int)(20*Math.sin(Math.toRadians(90-gripAngle+60)));
			grip2X1 = crossX2 + (int)(20*Math.cos(Math.toRadians(90-gripAngle+60)));
			grip2X2 = crossX2 - (int)(20*Math.cos(Math.toRadians(90-gripAngle+60)));
			grip2Y1 = crossY2 + (int)(20*Math.sin(Math.toRadians(90-gripAngle+60)));
			grip2Y2 = crossY2 - (int)(20*Math.sin(Math.toRadians(90-gripAngle+60)));
		}
		
		g2.setColor(Color.YELLOW);
		g2.fillRect(665-clampPos, 188, 8, 8);
		g2.fillRect(573+clampPos, 188, 8, 8);
		
		g2.setColor(Color.BLACK);
		g2.drawLine(capX, capY, capEndX, capEndY);
		g2.setStroke(new BasicStroke(4));
		g2.drawLine(crossX1, crossY1, crossX2, crossY2);
		g2.drawLine(grip1X1, grip1Y1, grip1X2, grip1Y2);
		g2.drawLine(grip2X1, grip2Y1, grip2X2, grip2Y2);
		
		//LidLoader
		if (this.toInit) {
			if (lloaderArmAngle < 30) {
				lloaderArmAngle += 1;
			}
		} else if (this.toDest) {
			if (lloaderArmAngle > -30) {
				lloaderArmAngle -= 1;
			}
		}
		if (this.pusherExtend) {
			if (pusherX > 542) {
				pusherX -= 1;
			}
		} else {
			if (pusherX < 670) {
				pusherX += 1;
			}
		}
		if(pusherX == 670) {
			newLid = false;
		}
		
		if (lidY == 64 && lidX > pusherX-30 && newLid == false) {
			lidX = pusherX-30;
		}
		
		if (this.vacOn) {
			if (lloaderArmX == 512 && lloaderArmY == 65 && lidX == 512 && (lidY == 64 || lidY == 65)) {
				vacHold = true;
			}
		} else if (lidY != 64 && lidY != 65) {
			lidX = 640;
			lidY = 64;
			vacHold = false;
			newLid = true;
		} else {
			vacHold = false;
		}
		if (vacHold) {
			lidX = lloaderArmX;
			lidY = lloaderArmY;
		}
		
		if (lloaderArmAngle >= 0) {
			lloaderArmX = 457 + (int)(64*Math.cos(Math.toRadians(lloaderArmAngle)));
			lloaderArmY = 96 - (int)(64*Math.sin(Math.toRadians(lloaderArmAngle)));
		} else {
			lloaderArmX = 457 + (int)(64*Math.cos(Math.toRadians(Math.abs(lloaderArmAngle))));
			lloaderArmY = 96 + (int)(64*Math.sin(Math.toRadians(Math.abs(lloaderArmAngle))));
		}
		
		g2.setColor(Color.RED);		
		g2.fillOval(lidX-22, lidY-22, 44, 44);
		
		g2.setColor(Color.BLACK);
		g2.setStroke(new BasicStroke(8));
		g2.drawLine(pusherX, 64, pusherX+128, 64);
		g2.fillRect(pusherX-8, 38, 16, 56);
		
		g2.setColor(Color.BLACK);
		g2.setStroke(new BasicStroke(4));
		g2.drawLine(457, 96, lloaderArmX, lloaderArmY);
		g2.fillOval(449, 88, 16, 16);
		
		g2.setColor(Color.RED);
		g2.fillOval(618, 42, 44, 44);
		
		//#######################################################################################
		//SIGNAL STATUS DISPLAY
		
		Font bold = new Font(Font.SANS_SERIF, Font.BOLD, 12);
		Font plain = new Font(Font.SANS_SERIF, Font.PLAIN, 12);
		Font title = new Font(Font.SANS_SERIF, Font.BOLD, 16);
		
		//loader
		g.setFont(title);
		g.setColor(Color.WHITE);
		g.drawString("LOADER", 16, 540);
		if (this.gripLoadBottle) {
			g.setFont(bold);
			g.setColor(new Color(50, 150, 50));
		} else {
			g.setFont(plain);
			g.setColor(Color.BLACK);
		}
		g.drawString("gripLoadBottle", 148, 540);
		if (this.ungripLoadBottle) {
			g.setFont(bold);
			g.setColor(new Color(50, 150, 50));
		} else {
			g.setFont(plain);
			g.setColor(Color.BLACK);
		}
		g.drawString("ungripLoadBottle", 272, 540);
		if (this.toA) {
			g.setFont(bold);
			g.setColor(new Color(50, 150, 50));
		} else {
			g.setFont(plain);
			g.setColor(Color.BLACK);
		}
		g.drawString("toA", 396, 540);
		if (this.toB) {
			g.setFont(bold);
			g.setColor(new Color(50, 150, 50));
		} else {
			g.setFont(plain);
			g.setColor(Color.BLACK);
		}
		g.drawString("toB", 520, 540);
		if (this.toC) {
			g.setFont(bold);
			g.setColor(new Color(50, 150, 50));
		} else {
			g.setFont(plain);
			g.setColor(Color.BLACK);
		}
		g.drawString("toC", 644, 540);
		
		//unloader
		g.setFont(title);
		g.setColor(Color.WHITE);
		g.drawString("UNLOADER", 16, 572);
		if (this.gripUnloadBottle) {
			g.setFont(bold);
			g.setColor(new Color(50, 150, 50));
		} else {
			g.setFont(plain);
			g.setColor(Color.BLACK);
		}
		g.drawString("gripUnloadBottle", 148, 572);
		if (this.ungripUnloadBottle) {
			g.setFont(bold);
			g.setColor(new Color(50, 150, 50));
		} else {
			g.setFont(plain);
			g.setColor(Color.BLACK);
		}
		g.drawString("ungripUnloadBottle", 272, 572);
		if (this.toA2) {
			g.setFont(bold);
			g.setColor(new Color(50, 150, 50));
		} else {
			g.setFont(plain);
			g.setColor(Color.BLACK);
		}
		g.drawString("toA2", 396, 572);
		if (this.toB2) {
			g.setFont(bold);
			g.setColor(new Color(50, 150, 50));
		} else {
			g.setFont(plain);
			g.setColor(Color.BLACK);
		}
		g.drawString("toB2", 520, 572);
		if (this.toC2) {
			g.setFont(bold);
			g.setColor(new Color(50, 150, 50));
		} else {
			g.setFont(plain);
			g.setColor(Color.BLACK);
		}
		g.drawString("toC2", 644, 572);
		
		//conveyor
		g.setFont(title);
		g.setColor(Color.WHITE);
		g.drawString("CONVEYOR", 16, 604);
		if (this.bottleLeft5) {
			g.setFont(bold);
			g.setColor(new Color(50, 150, 50));
		} else {
			g.setColor(Color.BLACK);
			g.setFont(plain);
		}
		g.drawString("bottleLeft5", 148, 604);
		if (this.motor) {
			g.setFont(bold);
			g.setColor(new Color(50, 150, 50));
		} else {
			g.setColor(Color.BLACK);
			g.setFont(plain);
		}
		g.drawString("motor", 272, 604);
		
		//rotary table
		g.setFont(title);
		g.setColor(Color.WHITE);
		g.drawString("ROTARY", 16, 636);
		if (this.bottlePos1) {
			g.setFont(bold);
			g.setColor(new Color(50, 150, 50));
		} else {
			g.setFont(plain);
			g.setColor(Color.BLACK);
		}
		g.drawString("bottlePos1", 148, 636);
		if (this.bottlePos2) {
			g.setFont(bold);
			g.setColor(new Color(50, 150, 50));
		} else {
			g.setFont(plain);
			g.setColor(Color.BLACK);
		}
		g.drawString("bottlePos2", 272, 636);
		if (this.bottlePos3) {
			g.setFont(bold);
			g.setColor(new Color(50, 150, 50));
		} else {
			g.setFont(plain);
			g.setColor(Color.BLACK);
		}
		g.drawString("bottlePos3", 396, 636);
		if (this.bottlePos4) {
			g.setFont(bold);
			g.setColor(new Color(50, 150, 50));
		} else {
			g.setFont(plain);
			g.setColor(Color.BLACK);
		}
		g.drawString("bottlePos4", 520, 636);
		if (this.bottlePos5) {
			g.setFont(bold);
			g.setColor(new Color(50, 150, 50));
		} else {
			g.setFont(plain);
			g.setColor(Color.BLACK);
		}
		g.drawString("bottlePos5", 644, 636);
		if (this.rotate) {
			g.setFont(bold);
			g.setColor(new Color(50, 150, 50));
		} else {
			g.setFont(plain);
			g.setColor(Color.BLACK);
		}
		g.drawString("rotate", 768, 636);
		
		//filler
		g.setFont(title);
		g.setColor(Color.WHITE);
		g.drawString("FILLER", 16, 668);
		if (this.liquidPos1) {
			g.setFont(bold);
			g.setColor(new Color(50, 150, 50));
		} else {
			g.setFont(plain);
			g.setColor(Color.BLACK);
		}
		g.drawString("liquidPos1", 148, 668);
		if (this.liquidPos2) {
			g.setFont(bold);
			g.setColor(new Color(50, 150, 50));
		} else {
			g.setFont(plain);
			g.setColor(Color.BLACK);
		}
		g.drawString("liquidPos2", 272, 668);
		if (this.liquidPos3) {
			g.setFont(bold);
			g.setColor(new Color(50, 150, 50));
		} else {
			g.setFont(plain);
			g.setColor(Color.BLACK);
		}
		g.drawString("liquidPos3", 396, 668);
		if (this.liquidPos4) {
			g.setFont(bold);
			g.setColor(new Color(50, 150, 50));
		} else {
			g.setFont(plain);
			g.setColor(Color.BLACK);
		}
		g.drawString("liquidPos4", 520, 668);
		if (this.canTop) {
			g.setFont(bold);
			g.setColor(new Color(50, 150, 50));
		} else {
			g.setFont(plain);
			g.setColor(Color.BLACK);
		}
		g.drawString("canTop", 644, 668);
		if (this.inletIsOn) {
			g.setFont(bold);
			g.setColor(new Color(50, 150, 50));
		} else {
			g.setFont(plain);
			g.setColor(Color.BLACK);
		}
		g.drawString("inletIsOn", 768, 668);
		if (this.injectorIsOn) {
			g.setFont(bold);
			g.setColor(new Color(50, 150, 50));
		} else {
			g.setFont(plain);
			g.setColor(Color.BLACK);
		}
		g.drawString("injectorIsOn", 892, 668);	
		
		//Capper
		g.setFont(title);
		g.setColor(Color.WHITE);
		g.drawString("CAPPER", 16, 700);
		if (this.clampBottle) {
			g.setFont(bold);
			g.setColor(new Color(50, 150, 50));
		} else {
			g.setFont(plain);
			g.setColor(Color.BLACK);
		}
		g.drawString("clampBottle", 148, 700);
		if (this.gripCap) {
			g.setFont(bold);
			g.setColor(new Color(50, 150, 50));
		} else {
			g.setFont(plain);
			g.setColor(Color.BLACK);
		}
		g.drawString("gripCap", 272, 700);
		if (this.gripDown) {
			g.setFont(bold);
			g.setColor(new Color(50, 150, 50));
		} else {
			g.setFont(plain);
			g.setColor(Color.BLACK);
		}
		g.drawString("gripDown", 396, 700);
		if (this.twistGrip) {
			g.setFont(bold);
			g.setColor(new Color(50, 150, 50));
		} else {
			g.setFont(plain);
			g.setColor(Color.BLACK);
		}
		g.drawString("twistGrip", 520, 700);
		if (this.untwistGrip) {
			g.setFont(bold);
			g.setColor(new Color(50, 150, 50));
		} else {
			g.setFont(plain);
			g.setColor(Color.BLACK);
		}
		g.drawString("untwistGrip", 644, 700);
		if (this.NbottleCapped) {
			g.setFont(bold);
			g.setColor(new Color(50, 150, 50));
		} else {
			g.setFont(plain);
			g.setColor(Color.BLACK);
		}
		g.drawString("NbottleCapped", 768, 700);
		
		//LidLoader
		g.setFont(title);
		g.setColor(Color.WHITE);
		g.drawString("LIDLOADER", 16, 732);
		if (this.pusherExtend) {
			g.setFont(bold);
			g.setColor(new Color(50, 150, 50));
		} else {
			g.setFont(plain);
			g.setColor(Color.BLACK);
		}
		g.drawString("pusherExtend", 148, 732);
		if (this.toDest) {
			g.setFont(bold);
			g.setColor(new Color(50, 150, 50));
		} else {
			g.setFont(plain);
			g.setColor(Color.BLACK);
		}
		g.drawString("toDest", 272, 732);
		if (this.toInit) {
			g.setFont(bold);
			g.setColor(new Color(50, 150, 50));
		} else {
			g.setFont(plain);
			g.setColor(Color.BLACK);
		}
		g.drawString("toInit", 396, 732);
		if (this.vacOn) {
			g.setFont(bold);
			g.setColor(new Color(50, 150, 50));
		} else {
			g.setFont(plain);
			g.setColor(Color.BLACK);
		}
		g.drawString("vacOn", 520, 732);
		
		//END OF SIGNAL STATUS DISPLAY
		//#######################################################################################
		
		g2.dispose();
	}
}