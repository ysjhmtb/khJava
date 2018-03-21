package kh.network.inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkTest {
	public static void main(String[] args) {
		try {
			InetAddress localIp = InetAddress.getLocalHost();
			System.out.println(localIp.getHostAddress());
			System.out.println(localIp.getHostName());
			
			InetAddress naverIp = InetAddress.getByName("www.naver.com");
			System.out.println("네이버 아이피 : " + naverIp.getHostAddress());
			
			InetAddress[] naverIps = InetAddress.getAllByName("www.naver.com");
			for(InetAddress ip : naverIps){
				System.out.println(ip.getHostAddress());
				System.out.println(ip.getHostName());
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
