package kh.network.multi.client;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MultiChatClient {
	Socket socket;
	public MultiChatClient(){
		String ip = "127.0.0.1";
		int port = 8888;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력 하십시오 : ");
		String name = sc.nextLine();
		
		try {
			socket = new Socket(ip, port);
			
			new MessageSender(socket, name).start();
			new MessageReceiver(socket).start();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}






