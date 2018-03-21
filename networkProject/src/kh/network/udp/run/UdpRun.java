package kh.network.udp.run;

import java.util.Scanner;

import kh.network.udp.model.Message;

public class UdpRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("내 포트 번호 : ");
		int myPort = sc.nextInt();
		
		System.out.print("상대방 포트 번호 : ");
		int toPort = sc.nextInt();
		
		Message message = new Message(myPort, toPort);
	}
}
