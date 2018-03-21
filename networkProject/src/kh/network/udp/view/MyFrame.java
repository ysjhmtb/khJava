package kh.network.udp.view;

import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame{
	private int toPort;
	InetAddress ipInfo;
	DatagramSocket socket;
	JTextArea messageArea;
	JTextField inputMessage;
	
	public MyFrame(InetAddress ipInfo, int toPort, DatagramSocket socket) {
		this.toPort = toPort;
		this.ipInfo = ipInfo;
		this.socket = socket;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		
		messageArea = new JTextArea(5, 30);
		messageArea.setEditable(false);
		add(messageArea, "Center");
		
		inputMessage = new JTextField();
		inputMessage.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String message = inputMessage.getText();
				byte[] messageArr = message.getBytes();
				
				DatagramPacket dp = new DatagramPacket(messageArr, messageArr.length, ipInfo, toPort);
				try {
					socket.send(dp);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				messageArea.append("보낸메세지 : " + inputMessage.getText() + "\n");
				inputMessage.setText("");
			}
		});
		add(inputMessage, "South");
		setVisible(true);
		
		readMessage();
	}
	
	
	public void readMessage(){
		while(true){
			byte[] buffer = new byte[256];
			DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
			try {
				socket.receive(packet);
				messageArea.append("받은메세지 : " + new String(buffer) + "\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}



















