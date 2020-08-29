package org.compsys704;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import javax.imageio.ImageIO;

public class conveyorCanvas extends JPanel{
	BufferedImage conveyorMove1;
	BufferedImage conveyorMove2;
	BufferedImage conveyorStationary;
	private int loadPos = 384;
	private int rotarypos = 0;
	
	public conveyorCanvas(){
		try {
			BufferedImage bi = ImageIO.read(new File("res/arm.png"));
			conveyorMove1 = ImageIO.read(new File("res/conveyorMove1.png"));
			conveyorMove2 = ImageIO.read(new File("res/conveyorMove2.png"));
			conveyorStationary = ImageIO.read(new File("res/conveyorStationary.png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);;
		}
	}
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(conveyorStationary, 0, 100, null);
		g.fillOval(0, 164, 128, 128);
		
		//if(States.ARM_AT_DEST)
		//	g.drawImage(arm1, 0, 0, null);
		//else
		//	g.drawImage(arm2, 30, 0, null);
		
		//if(States.GRIPPED){
		//	if(States.ARM_AT_DEST){
		//		g.setColor(Color.black);
		//		g.fillOval(10, 11, 30, 30);
		//		g.setColor(Color.red);
		//		g.fillOval(10, 11, 15, 15);

		//	}
		//	else{
		//		g.setColor(Color.black);
		//		g.fillOval(40, 243, 30, 30);
		//		g.setColor(Color.red);
		//		g.fillOval(35, 232, 15, 15);
		//	}
		//	g.setColor(Color.black);
		//}
	}
}
