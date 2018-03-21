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
