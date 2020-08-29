package org.compsys704;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class CapLoader extends JFrame {
	private JPanel panel;
	
	public CapLoader() {
//		this.setPreferredSize(new Dimension(200, 300));
		panel = new Canvas();
		panel.setPreferredSize(new Dimension(360, 350));
		panel.setBackground(Color.WHITE);
		JButton enable = new JButton("enable");
		enable.addActionListener(new SignalClient(Ports.PORT_LOADER_PLANT, Ports.ENABLE_SIGNAL));
		JButton request = new JButton("request");
		request.addActionListener(new SignalClient(Ports.PORT_LOADER_CONTROLLER, Ports.REQUEST_SIGNAL));
		//JButton refill = new JButton("refill");
		//refill.addActionListener(new SignalClient(Ports.PORT_LOADER_PLANT, Ports.REFILL_SIGNAL));
		JPanel ss = new JPanel();
		ss.add(enable);
		ss.add(request);
		//ss.add(refill);
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		this.add(panel,c);
		c.gridx = 0;
		c.gridy = 1;
		this.add(ss,c);
	}

	public static void main(String[] args) {
		CapLoader cl = new CapLoader();
		cl.pack();
		cl.setVisible(true);
		
		SignalServer<LoaderVizWorker> server = new SignalServer<LoaderVizWorker>(Ports.PORT_LOADER_VIZ, LoaderVizWorker.class);
		new Thread(server).start();
		while(true){
			try {
				cl.repaint();
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
