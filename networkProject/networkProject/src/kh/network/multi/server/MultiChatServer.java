package kh.network.multi.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public class MultiChatServer {
	ServerSocket serverSocket;
	Socket clientSocket;
	Hashtable<String, DataOutputStream> clients = new Hashtable<String, DataOutputStream>();
	
	public void serverStart() throws IOException{
		int port = 8888;
		
		serverSocket = new ServerSocket(port);
		System.out.println("서비스 제공 시작");
		
		while(true){
			clientSocket = serverSocket.accept();
			System.out.println("클라이언트 요청이 들어왔습니다.");
			
			new ServerReceiver(clientSocket).start();
		}
	}
	
	public class ServerReceiver extends Thread{
		private Socket socket; 
		private DataInputStream dis;
		private DataOutputStream dos;
		
		public ServerReceiver(Socket socket){
			this.socket = socket;
			try {
				this.dis = new DataInputStream(socket.getInputStream());
				this.dos = new DataOutputStream(socket.getOutputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		@Override
		public void run(){
			try {
				String name = dis.readUTF();
				sendMessageAll(name + "님이 들어왔습니다.");
				clients.put(name, dos);
				
				while(true){
					String message = dis.readUTF();
					sendMessageAll(message);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void sendMessageAll(String message){
		Iterator<String> keys = clients.keySet().iterator();
		while(keys.hasNext()){
			String key = keys.next();
			DataOutputStream toClient = clients.get(key);
			try {
				toClient.writeUTF(message);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}














