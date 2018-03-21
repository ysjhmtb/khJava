package kh.network.multi.server;

import java.io.IOException;

public class ServerRun {
	public static void main(String[] args) {
		MultiChatServer mcs = new MultiChatServer();
		try {
			mcs.serverStart();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


//192.168.10.33 // 10005
//질문 우리반의 이름을 오름차순으로 정렬 했을때,
//11번째 사람은 누구인가요?
//자기이름 - 답 누구

















