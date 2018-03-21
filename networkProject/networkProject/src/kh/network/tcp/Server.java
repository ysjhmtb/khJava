package kh.network.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		Server server = new Server();
		try {
			server.serverStart();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void serverStart() throws IOException{
		Socket clientSocket = null;
//		서버의 포트번호를 정한다.
		int port = 10000; //0 ~ 65525;   // 6000~7000  8000
		
//		서버용 소캣 객체를 생성한다
		ServerSocket server = new ServerSocket(port);
		
//		클라이언트쪽에서 접속 요청이 오기를 기다린다.
//		접속 요청이 오면 요청을 수락하고 해당 클라이언트에 대한 소켓 객체를 생성한다.
		while(true){
			System.out.println("서버 실행 되었습니다.");
			clientSocket = server.accept();
			
//		연결된 클라이언트와 입출력 스트림을 생성한다.
			InputStream is = clientSocket.getInputStream();
			OutputStream os = clientSocket.getOutputStream();
			
//		보조스트림을 통해 성능을 개선시킨다.
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			OutputStreamWriter osw = new OutputStreamWriter(os);
			
//		스트림을 통해 읽고 쓰기를 한다.
			while(true){
				String message = br.readLine();
				
				if(message.equals("exit")){
					System.out.println("프로그램을 종료합니다.");
					break;
				}else{
					System.out.println(message);
				}
			}
			
//		통신을 종료한다.
			br.close();
			osw.close();
			clientSocket.close();
		}

		
		
		
		
	}
}
