package com.silviucanton;

import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChatClient {
	
	JTextField outgoing;
	PrintWriter writer;
	Socket sock;
	
	public void go() {
		JFrame frame = new JFrame("Chat Client");
		JPanel mainPanel = new JPanel();
		outgoing = new JTextField(20);
		JButton sendButton = new JButton("Send");
		sendButton.addActionListener(new MySendActionListener());
		mainPanel.add(outgoing);
		mainPanel.add(sendButton);
		frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
		setUpNetworking();
		frame.setSize(400, 500);
		frame.setVisible(true);
	}
	
	private void setUpNetworking() {
		
	}
	
	public class MySendActionListener implements ActionListener {
		public void actionPerformed(ActionEvent a) {
			
		}
	}
	
	public static void main(String[] args) {
		new ChatClient().go();
	}

}
