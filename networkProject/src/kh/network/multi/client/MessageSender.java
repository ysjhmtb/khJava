package kh.network.multi.client;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class MessageSender extends Thread {
	Socket socket;
	String name;
	DataOutputStream dos;
	
	public MessageSender(){}
	
	public MessageSender(Socket socket, String name){
		try {
			this.socket = socket;
			this.dos = new DataOutputStream(socket.getOutputStream());
			this.name = name;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void run(){
		Scanner sc = new Scanner(System.in);
		try {
			dos.writeUTF(name);
			while(true){
				if(dos != null){
//					System.out.print("할말 : ");
					dos.writeUTF(name + ":" + sc.nextLine());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}














