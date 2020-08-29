package org.compsys704;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

public class customActionListener implements ActionListener{
	public conveyorCanvas canvas;
	
	public customActionListener(JPanel canvas) {
		this.canvas = (conveyorCanvas)canvas;
	}
	
	public void actionPerformed(ActionEvent e) {
		this.canvas.updateRotary();
	}
}
