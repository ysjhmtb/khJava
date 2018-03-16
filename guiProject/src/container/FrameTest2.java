package container;

import javax.swing.JFrame;

public class FrameTest2 {
	public static void main(String[] args) {
		JFrame mainFrame = new JFrame("두번째 프레임 실습 창");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(300, 300);
		mainFrame.setLocation(0, 0);
		
		mainFrame.setVisible(true);
	}
}
