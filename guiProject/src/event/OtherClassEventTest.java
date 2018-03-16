package event;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class OtherClassEventTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("다른 클래스 이벤트 테스트");
		frame.setBounds(100, 100, 100, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("클릭하십시오!!");
		frame.add(label, "North");
		
		JButton button = new JButton("선택 버튼");
		frame.add(button, "South");
		
		button.addActionListener(new MyEventListener(label, button));
		
		frame.setVisible(true);
	}
}


































