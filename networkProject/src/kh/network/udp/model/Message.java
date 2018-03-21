package kh.network.udp.model;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

import kh.network.udp.view.MyFrame;

public class Message {
	private int myPort;
	private int toPort;
	InetAddress ipInfo;
	DatagramSocket socket;
	MyFrame mf;
	
	public Message(int myPort, int toPort){
		this.myPort = myPort;
		this.toPort = toPort;
		
		try {
			ipInfo = InetAddress.getByName("127.0.0.1");
			socket = new DatagramSocket(myPort);
			mf = new MyFrame(ipInfo, toPort, socket);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (SocketException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
}
