package org.compsys704;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class systemViz extends JFrame implements ActionListener {
	private systemCanvas canvas;
	
	//TEMPORARY button/checkboxes
	JButton tick = new JButton("tick");
	JButton request = new JButton("request");
	
	JButton liquidPos1 = new JButton("liquidPos1");
	JButton liquidPos2 = new JButton("liquidPos2");
	JButton liquidPos3 = new JButton("liquidPos3");
	JButton liquidPos4 = new JButton("liquidPos4");
	
	//TEMPORARY FOR TESTING LIDLOADER
	JCheckBox pusherExtend = new JCheckBox("pusherExtend");
	JCheckBox toDest = new JCheckBox("toDest");
	JCheckBox toInit = new JCheckBox("toInit");
	JCheckBox vacOn = new JCheckBox("vacOn");
	
	public systemViz() {
		
		//Frame elements
		canvas = new systemCanvas();
		canvas.setPreferredSize(new Dimension(1024, 752));
		canvas.setBackground(Color.WHITE);
		
		Font bold = new Font(Font.SANS_SERIF, Font.BOLD, 12);
		Font normal = new Font(Font.SANS_SERIF, Font.PLAIN, 12);
		
		//tick button
		tick.addActionListener(new SignalClient(11000, "LControllerCD.tick"));
		tick.addActionListener(new SignalClient(11001, "ULControllerCD.tick"));
		tick.addActionListener(new SignalClient(11002, "CPlantCD.tick"));
		tick.addActionListener(new SignalClient(11003, "RPlantCD.tick"));
		tick.addActionListener(new SignalClient(11004, "FControllerCD.tick"));
		tick.addActionListener(new SignalClient(11005, "CapControllerCD.tick"));
		tick.addActionListener(new SignalClient(11006, "MControllerCD.tick"));
		tick.setEnabled(true);
		tick.setFont(bold);
		
		//request button
		request.addActionListener(new SignalClient(11007, "MControllerCD.bottleAtLoad"));
		request.setEnabled(true);
		request.setFont(bold);
		
		//filler buttons
		liquidPos1.addActionListener(new SignalClient(10203, "FControllerCD.toFill1"));
		liquidPos1.setEnabled(true);
		liquidPos1.setFont(bold);
		liquidPos2.addActionListener(new SignalClient(10204, "FControllerCD.toFill2"));
		liquidPos2.setEnabled(true);
		liquidPos2.setFont(bold);
		liquidPos3.addActionListener(new SignalClient(10205, "FControllerCD.toFill3"));
		liquidPos3.setEnabled(true);
		liquidPos3.setFont(bold);
		liquidPos4.addActionListener(new SignalClient(10206, "FControllerCD.toFill4"));
		liquidPos4.setEnabled(true);
		liquidPos4.setFont(bold);
		
		//TEMPORARY FOR TESTING LIDLOADER
		pusherExtend.addActionListener(this);
		pusherExtend.setEnabled(true);
		pusherExtend.setFont(bold);
		toDest.addActionListener(this);
		toDest.setEnabled(true);
		toDest.setFont(bold);
		toInit.addActionListener(this);
		toInit.setEnabled(true);
		toInit.setFont(bold);
		vacOn.addActionListener(this);
		vacOn.setEnabled(true);
		vacOn.setFont(bold);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridBagLayout());
		GridBagConstraints bc = new GridBagConstraints();
		bc.gridx = 0;
		bc.gridy = 0;
		buttonPanel.add(tick, bc);
		bc.gridx = 1;
		bc.gridy = 0;
		buttonPanel.add(request, bc);
		
		bc.gridx = 2;
		bc.gridy = 0;
		buttonPanel.add(liquidPos1, bc);
		bc.gridx = 3;
		bc.gridy = 0;
		buttonPanel.add(liquidPos2, bc);
		bc.gridx = 4;
		bc.gridy = 0;
		buttonPanel.add(liquidPos3, bc);
		bc.gridx = 5;
		bc.gridy = 0;
		buttonPanel.add(liquidPos4, bc);
		
		//TEMPORARY FOR TESTING LIDLOADER
		bc.gridx = 0;
		bc.gridy = 1;
		buttonPanel.add(pusherExtend, bc);
		bc.gridx = 1;
		bc.gridy = 1;
		buttonPanel.add(toDest, bc);
		bc.gridx = 2;
		bc.gridy = 1;
		buttonPanel.add(toInit, bc);
		bc.gridx = 3;
		bc.gridy = 1;
		buttonPanel.add(vacOn, bc);
		
		//setup grid layout 1x2 (canvas on top of button panel)
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		this.add(canvas,c);
		c.gridx = 0;
		c.gridy = 1;
		this.add(buttonPanel,c);
		
		this.setTitle("Group2-System");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (pusherExtend.isSelected()) {
			canvas.updateSignals("pusherExtend", true);
		} else {
			canvas.updateSignals("pusherExtend", false);
		}
		if (toDest.isSelected()) {
			canvas.updateSignals("toDest", true);
		} else {
			canvas.updateSignals("toDest", false);
		}
		if (toInit.isSelected()) {
			canvas.updateSignals("toInit", true);
		} else {
			canvas.updateSignals("toInit", false);
		}
		if (vacOn.isSelected()) {
			canvas.updateSignals("vacOn", true);
		} else {
			canvas.updateSignals("vacOn", false);
		}
	}

	public static void main(String[] args) {
		systemViz cv = new systemViz();
		cv.pack();
		cv.setVisible(true);
		
		SignalServer<LoaderVizWorker> server = new SignalServer<LoaderVizWorker>(Ports.PORT_LOADER_VIZ, LoaderVizWorker.class);
		new Thread(server).start();
		
		while(true){
			try {
				cv.repaint();
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
