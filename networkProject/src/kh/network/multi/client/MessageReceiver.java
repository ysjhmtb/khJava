package kh.network.multi.client;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class MessageReceiver extends Thread {
	private Socket socket;
	private DataInputStream dis;
	
	public MessageReceiver(){}
	
	public MessageReceiver(Socket socket){
		try {
			this.socket = socket;
			this.dis = new DataInputStream(socket.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void run(){
		try {
			if(dis != null){
				while(true){
					System.out.println(dis.readUTF());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

















