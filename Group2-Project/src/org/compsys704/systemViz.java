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
	JCheckBox bottleLeft5 = new JCheckBox("bottleLeft5");
	JCheckBox motor = new JCheckBox("motor");
	JLabel conveyorLabel = new JLabel("conveyor");
	
	JCheckBox bottlePos1 = new JCheckBox("bottlePos1");
	JCheckBox bottlePos2 = new JCheckBox("bottlePos2");
	JCheckBox bottlePos3 = new JCheckBox("bottlePos3");
	JCheckBox bottlePos4 = new JCheckBox("bottlePos4");
	JCheckBox bottlePos5 = new JCheckBox("bottlePos5");
	JCheckBox rotate = new JCheckBox("rotate");
	JLabel rotaryLabel = new JLabel("rotary-table");
	
	JCheckBox liquidPos1 = new JCheckBox("liquidPos1");
	JCheckBox liquidPos2 = new JCheckBox("liquidPos2");
	JCheckBox liquidPos3 = new JCheckBox("liquidPos3");
	JCheckBox liquidPos4 = new JCheckBox("liquidPos4");
	JCheckBox NbottleFilled = new JCheckBox("NbottleFilled");
	JLabel fillerLabel = new JLabel("filler");
	
	JCheckBox bottleAtLoad = new JCheckBox("bottleAtLoad");
	JCheckBox finishLCMD = new JCheckBox("finishLCMD");
	JCheckBox NloadBottle = new JCheckBox("NloadBottle");
	JLabel loaderLabel = new JLabel("bottle-loader");
	
	JCheckBox clampBottle = new JCheckBox("clampBottle");
	JCheckBox gripCap = new JCheckBox("gripCap");
	JCheckBox gripDown = new JCheckBox("gripDown");
	JCheckBox twistGrip = new JCheckBox("twistGrip");
	JCheckBox untwistGrip = new JCheckBox("untwistGrip");
	JCheckBox NbottleCapped = new JCheckBox("NbottleCapped");
	JLabel capperLabel = new JLabel("capper");
	
	
	public systemViz() {
		
		//Frame elements
		canvas = new systemCanvas();
		canvas.setPreferredSize(new Dimension(1024, 512));
		canvas.setBackground(Color.WHITE);
		
		//change all buttons back to using SignalClient actionListener
		//JButton enable = new JButton("enable");
		//enable.addActionListener(new SignalClient(Ports.PORT_LOADER_PLANT, Ports.ENABLE_SIGNAL));
		//JButton request = new JButton("request");
		//request.addActionListener(new SignalClient(Ports.PORT_LOADER_CONTROLLER, Ports.REQUEST_SIGNAL));
		//
		//JPanel ss = new JPanel();
		//ss.add(enable);
		//ss.add(request);
		
		Font bold = new Font(Font.SANS_SERIF, Font.BOLD, 12);
		Font normal = new Font(Font.SANS_SERIF, Font.PLAIN, 12);
		
		//tick button
		tick.setEnabled(true);
		tick.addActionListener(this);
		tick.setFont(bold);
		
		//conveyor
		bottleLeft5.setEnabled(true);
		bottleLeft5.addActionListener(this);
		bottleLeft5.setFont(normal);
		motor.setEnabled(true);
		motor.addActionListener(this);
		motor.setFont(normal);
		
		//rotary-table
		bottlePos1.setEnabled(true);
		bottlePos1.addActionListener(this);
		bottlePos1.setFont(normal);
		bottlePos2.setEnabled(true);
		bottlePos2.addActionListener(this);
		bottlePos2.setFont(normal);
		bottlePos3.setEnabled(true);
		bottlePos3.addActionListener(this);
		bottlePos3.setFont(normal);
		bottlePos4.setEnabled(true);
		bottlePos4.addActionListener(this);
		bottlePos4.setFont(normal);
		bottlePos5.setEnabled(true);
		bottlePos5.addActionListener(this);
		bottlePos5.setFont(normal);
		rotate.setEnabled(true);
		rotate.addActionListener(this);
		rotate.setFont(normal);
		
		//filler
		liquidPos1.setEnabled(true);
		liquidPos1.addActionListener(this);
		liquidPos1.setFont(normal);
		liquidPos2.setEnabled(true);
		liquidPos2.addActionListener(this);
		liquidPos2.setFont(normal);
		liquidPos3.setEnabled(true);
		liquidPos3.addActionListener(this);
		liquidPos3.setFont(normal);
		liquidPos4.setEnabled(true);
		liquidPos4.addActionListener(this);
		liquidPos4.setFont(normal);
		NbottleFilled.setEnabled(true);
		NbottleFilled.addActionListener(this);
		NbottleFilled.setFont(normal);
		
		//Bottle-Loader
		bottleAtLoad.setEnabled(true);
		bottleAtLoad.addActionListener(this);
		bottleAtLoad.setFont(normal);
		finishLCMD.setEnabled(true);
		finishLCMD.addActionListener(this);
		finishLCMD.setFont(normal);
		NloadBottle.setEnabled(true);
		NloadBottle.addActionListener(this);
		NloadBottle.setFont(normal);
		
		//Capper
		clampBottle.setEnabled(true);
		clampBottle.addActionListener(this);
		clampBottle.setFont(normal);
		gripCap.setEnabled(true);
		gripCap.addActionListener(this);
		gripCap.setFont(normal);
		gripDown.setEnabled(true);
		gripDown.addActionListener(this);
		gripDown.setFont(normal);
		twistGrip.setEnabled(true);
		twistGrip.addActionListener(this);
		twistGrip.setFont(normal);
		untwistGrip.setEnabled(true);
		untwistGrip.addActionListener(this);
		untwistGrip.setFont(normal);
		NbottleCapped.setEnabled(true);
		NbottleCapped.addActionListener(this);
		NbottleCapped.setFont(normal);
		
		//machine labels
		conveyorLabel.setFont(bold);
		rotaryLabel.setFont(bold);
		capperLabel.setFont(bold);
		fillerLabel.setFont(bold);
		loaderLabel.setFont(bold);
		capperLabel.setFont(bold);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridBagLayout());
		GridBagConstraints bc = new GridBagConstraints();
		bc.gridx = 0;
		bc.gridy = 0;
		buttonPanel.add(tick, bc);
		bc.gridx = 1;
		bc.gridy = 0;
		buttonPanel.add(bottleLeft5, bc);
		bc.gridx = 2;
		bc.gridy = 0;
		buttonPanel.add(motor, bc);
		bc.gridx = 7;
		bc.gridy = 0;
		buttonPanel.add(conveyorLabel, bc);
		
		bc.gridx = 1;
		bc.gridy = 1;
		buttonPanel.add(bottlePos1, bc);
		bc.gridx = 2;
		bc.gridy = 1;
		buttonPanel.add(bottlePos2, bc);
		bc.gridx = 3;
		bc.gridy = 1;
		buttonPanel.add(bottlePos3, bc);
		bc.gridx = 4;
		bc.gridy = 1;
		buttonPanel.add(bottlePos4, bc);
		bc.gridx = 5;
		bc.gridy = 1;
		buttonPanel.add(bottlePos5, bc);
		bc.gridx = 6;
		bc.gridy = 1;
		buttonPanel.add(rotate, bc);
		bc.gridx = 7;
		bc.gridy = 1;
		buttonPanel.add(rotaryLabel, bc);
		
		bc.gridx = 1;
		bc.gridy = 2;
		buttonPanel.add(liquidPos1, bc);
		bc.gridx = 2;
		bc.gridy = 2;
		buttonPanel.add(liquidPos2, bc);
		bc.gridx = 3;
		bc.gridy = 2;
		buttonPanel.add(liquidPos3, bc);
		bc.gridx = 4;
		bc.gridy = 2;
		buttonPanel.add(liquidPos4, bc);
		bc.gridx = 5;
		bc.gridy = 2;
		buttonPanel.add(NbottleFilled, bc);
		bc.gridx = 7;
		bc.gridy = 2;
		buttonPanel.add(fillerLabel, bc);
		
		bc.gridx = 1;
		bc.gridy = 3;
		buttonPanel.add(bottleAtLoad, bc);
		bc.gridx = 2;
		bc.gridy = 3;
		buttonPanel.add(finishLCMD, bc);
		bc.gridx = 3;
		bc.gridy = 3;
		buttonPanel.add(NloadBottle, bc);
		bc.gridx = 7;
		bc.gridy = 3;
		buttonPanel.add(loaderLabel, bc);
		
		bc.gridx = 1;
		bc.gridy = 4;
		buttonPanel.add(clampBottle, bc);
		bc.gridx = 2;
		bc.gridy = 4;
		buttonPanel.add(gripCap, bc);
		bc.gridx = 3;
		bc.gridy = 4;
		buttonPanel.add(gripDown, bc);
		bc.gridx = 4;
		bc.gridy = 4;
		buttonPanel.add(twistGrip, bc);
		bc.gridx = 5;
		bc.gridy = 4;
		buttonPanel.add(untwistGrip, bc);
		bc.gridx = 6;
		bc.gridy = 4;
		buttonPanel.add(NbottleCapped, bc);
		bc.gridx = 7;
		bc.gridy = 4;
		buttonPanel.add(capperLabel, bc);
		
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
		if (bottleLeft5.isSelected()) {
			canvas.updateSignals("bottleLeft5", true);
		} else {
			canvas.updateSignals("bottleLeft5", false);
		}	
		if (motor.isSelected()) {
			canvas.updateSignals("motor", true);
		} else {
			canvas.updateSignals("motor", false);
		}
		if (bottlePos1.isSelected()) {
			canvas.updateSignals("bottlePos1", true);
		} else {
			canvas.updateSignals("bottlePos1", false);
		}
		if (bottlePos2.isSelected()) {
			canvas.updateSignals("bottlePos2", true);
		} else {
			canvas.updateSignals("bottlePos2", false);
		}
		if (bottlePos3.isSelected()) {
			canvas.updateSignals("bottlePos3", true);
		} else {
			canvas.updateSignals("bottlePos3", false);
		}
		if (bottlePos4.isSelected()) {
			canvas.updateSignals("bottlePos4", true);
		} else {
			canvas.updateSignals("bottlePos4", false);
		}
		if (bottlePos5.isSelected()) {
			canvas.updateSignals("bottlePos5", true);
		} else {
			canvas.updateSignals("bottlePos5", false);
		}
		if (rotate.isSelected()) {
			canvas.updateSignals("rotate", true);
		} else {
			canvas.updateSignals("rotate", false);
		}
		if (NbottleCapped.isSelected()) {
			canvas.updateSignals("NbottleCapped", true);
		} else {
			canvas.updateSignals("NbottleCapped", false);
		}
		if (liquidPos1.isSelected()) {
			canvas.updateSignals("liquidPos1", true);
		} else {
			canvas.updateSignals("liquidPos1", false);
		}
		if (liquidPos2.isSelected()) {
			canvas.updateSignals("liquidPos2", true);
		} else {
			canvas.updateSignals("liquidPos2", false);
		}
		if (liquidPos3.isSelected()) {
			canvas.updateSignals("liquidPos3", true);
		} else {
			canvas.updateSignals("liquidPos3", false);
		}
		if (liquidPos4.isSelected()) {
			canvas.updateSignals("liquidPos4", true);
		} else {
			canvas.updateSignals("liquidPos4", false);
		}
		if (NbottleFilled.isSelected()) {
			canvas.updateSignals("NbottleFilled", true);
		} else {
			canvas.updateSignals("NbottleFilled", false);
		}
		if (bottleAtLoad.isSelected()) {
			canvas.updateSignals("bottleAtLoad", true);
		} else {
			canvas.updateSignals("bottleAtLoad", false);
		}
		if (finishLCMD.isSelected()) {
			canvas.updateSignals("finishLCMD", true);
		} else {
			canvas.updateSignals("finishLCMD", false);
		}
		if (NloadBottle.isSelected()) {
			canvas.updateSignals("NloadBottle", true);
		} else {
			canvas.updateSignals("NloadBottle", false);
		}
		if (clampBottle.isSelected()) {
			canvas.updateSignals("clampBottle", true);
		} else {
			canvas.updateSignals("clampBottle", false);
		}
		if (gripCap.isSelected()) {
			canvas.updateSignals("gripCap", true);
		} else {
			canvas.updateSignals("gripCap", false);
		}
		if (gripDown.isSelected()) {
			canvas.updateSignals("gripDown", true);
		} else {
			canvas.updateSignals("gripDown", false);
		}
		if (twistGrip.isSelected()) {
			canvas.updateSignals("twistGrip", true);
		} else {
			canvas.updateSignals("twistGrip", false);
		}
		if (untwistGrip.isSelected()) {
			canvas.updateSignals("untwistGrip", true);
		} else {
			canvas.updateSignals("untwistGrip", false);
		}
		if (NbottleCapped.isSelected()) {
			canvas.updateSignals("NbottleCapped", true);
		} else {
			canvas.updateSignals("NbottleCapped", false);
		}
		if (e.getSource() == tick) {
			canvas.updateSignals("tick", true);
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
