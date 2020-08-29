package org.compsys704;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;

import javax.imageio.ImageIO;

public class conveyorCanvas extends JPanel{
	BufferedImage conveyorMove1;
	BufferedImage conveyorMove2;
	BufferedImage conveyorStationary;
	private int bottlePos = 1096;
	private JButton rotary = new JButton("rotary");
	
	public conveyorCanvas(){
		try {
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
		g.drawImage(conveyorStationary, 712, 100, null);

		
		if(States.MOTOR && this.bottlePos > 712) {
			this.bottlePos -= 1;
		}
		
		if(States.MOTOR && this.bottlePos > 0 && this.bottlePos <= 384) {
			this.bottlePos -= 1;
		}
		
		if(this.bottlePos == 712) {
			States.bottlePos1 = true;
			this.bottlePos = 384;
		} else {
			States.bottlePos1 = false;
		}
		if(this.bottlePos == 384) {
			States.bottlePos5 = true;
		} else {
			States.bottlePos5 = false;
		}
		if(this.bottlePos == 0) {
			States.bottleLeft5 = true;
		} else {
			States.bottleLeft5 = false;
		}
		
		Font f1 = new Font(Font.SANS_SERIF, Font.BOLD, 12);
		g.setFont(f1);
		
		if(States.bottlePos5) {
			g.setColor(Color.GREEN);
		} else {
			g.setColor(Color.RED);
		}
		g.drawString("bottlePos5", 100, 406);
		if(States.bottlePos1) {
			g.setColor(Color.GREEN);
		} else {
			g.setColor(Color.RED);
		}
		g.drawString("bottlePos1", 100, 456);
		if(States.bottleLeft5) {
			g.setColor(Color.GREEN);
		} else {
			g.setColor(Color.RED);
		}
		g.drawString("bottleLeft5", 200, 406);
		if(States.MOTOR) {
			g.setColor(Color.GREEN);
		} else {
			g.setColor(Color.RED);
		}
		g.drawString("motor", 200, 456);
		
		g.setColor(Color.BLACK);
		g.fillOval(this.bottlePos, 164, 128, 128);
	}
}
