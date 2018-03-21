package kh.network.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Client client = new Client();
		try {
			client.requestConnect();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

	private void requestConnect() throws UnknownHostException{
//		1. 서버의 IP주소와 서버가 정한 port번호를 매개변수로 하여 클라이언트용 소켓 객체를 생성한다.
		int port = 10000;
		String ip = InetAddress.getLocalHost().getHostAddress();
		InputStream is = null;
		OutputStream os = null;
		BufferedReader br = null;
		OutputStreamWriter osw = null;
		String message = "";
		try(Scanner sc = new Scanner(System.in);){
			Socket socket = new Socket(ip, port);
//		2. 서버와의 입출력 스트림을 오픈한다.
			if(socket != null){
				is = socket.getInputStream();
				os = socket.getOutputStream();
//		3. 보조스트림을 붙여 성능을 개선한다.
				br = new BufferedReader(new InputStreamReader(is));
				osw = new OutputStreamWriter(os);
				
				System.out.print("아이디 : ");
				String name = sc.nextLine();
				
				osw.write(name + "\n");
				osw.flush();
				
//		4. 스트림을 통해 읽고 쓰기를 한다.
				while(true){
					System.out.print("할말 : ");
					message = sc.nextLine();
					
					if("exit".equals(message)){
						System.out.println("통신 종료!!");
						break;
					}else{
						osw.write(message + "\n");
						osw.flush();
					}
				}
				
//		5. 통신을 종료한다.
				osw.close();
				br.close();
				socket.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
