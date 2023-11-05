package com.landinbt.ipsubnetcalculator.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainWindow extends JFrame implements ActionListener {
	// Attributes
	private JTextField ipText;
	private JButton generateBtn;
	private JLabel ipLabel;
	
	// Methods
	public MainWindow() {
		setTitle("IP Subnet Calculator");
		setSize(500, 400); // width, height
		setLocationRelativeTo(null); // centered window
		
		initializeComponents();
	}
	
	private void initializeComponents() {
		setLayout(null); // distribute items.
		
		// Labels
		ipLabel = new JLabel("IP Address");
		ipLabel.setBounds(15, 15, 70, 15);
		add(ipLabel);
		
		// Text Fields
		ipText = new JTextField();
		ipText.setBounds(15, 35, 150, 25);
		add(ipText);
		
		// Buttons
		generateBtn = new JButton();
		generateBtn.setText("Generate");
		generateBtn.setBounds(35, 70, 100, 25); // x, y, width, height
		add(generateBtn);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String dataInput = ipText.getText(); // capture user data
		
	}
	
}
