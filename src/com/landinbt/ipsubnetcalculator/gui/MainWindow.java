package com.landinbt.ipsubnetcalculator.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainWindow extends JFrame implements ActionListener {
	// Attributes
	private JTextField ipTxt;
	private JButton generateBtn;
	private JLabel ipLbl; // IP label
	private JLabel networkLbl; // network label
	private JLabel maskLbl;
	private JLabel broadcastLbl;
	private JLabel usableRangeLbl;
	private JLabel gatewayLbl;
	
	// Methods
	public MainWindow() {
		setTitle("IP Subnet Calculator");
		setSize(500, 250); // width, height
		setLocationRelativeTo(null); // centered window
		
		initializeComponents();
	}
	
	private void initializeComponents() {
		setLayout(null); // distribute items.
		
		// Labels
		ipLbl = new JLabel("IP Address");
		ipLbl.setBounds(15, 15, 70, 15);  // x, y, width, height
		add(ipLbl);
		
		networkLbl = new JLabel("Network:");
		networkLbl.setBounds(200, 15, 70, 15);
		add(networkLbl);
		
		maskLbl = new JLabel("Mask:");
		maskLbl.setBounds(200, 45, 70, 15);
		add(maskLbl);
		
		broadcastLbl = new JLabel("Broadcast:");
		broadcastLbl.setBounds(200, 75, 70, 15);
		add(broadcastLbl);
		
		usableRangeLbl = new JLabel("Usable Range:");
		usableRangeLbl.setBounds(200, 105, 85, 15);
		add(usableRangeLbl);
		
		gatewayLbl = new JLabel("Gateway:");
		gatewayLbl.setBounds(200, 135, 70, 15);
		add(gatewayLbl);
		
		// Text Fields
		ipTxt = new JTextField();
		ipTxt.setBounds(15, 35, 150, 25); // x, y, width, height
		add(ipTxt);
		
		// Buttons
		generateBtn = new JButton();
		generateBtn.setText("Generate");
		generateBtn.setBounds(35, 75, 100, 25); // x, y, width, height
		add(generateBtn);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String dataInput = ipTxt.getText(); // capture user data
		
		if(e.getSource() == generateBtn) {
			// Logic
		}
	}
	
}
