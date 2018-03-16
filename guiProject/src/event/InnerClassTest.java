package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class InnerClassTest {
	private JLabel label;
	private JButton button;
	
	public InnerClassTest(){
		JFrame frame = new JFrame("내부 클래스 이벤트 테스트");
		frame.setBounds(100, 100, 100, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label = new JLabel("클릭하십시오!!");
		frame.add(label, "North");
		
		button = new JButton("선택 버튼");
		frame.add(button, "South");
		
		button.addActionListener(new MyEventListener());
		
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new InnerClassTest();
	}
	
	class MyEventListener implements ActionListener {
		public MyEventListener(){
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button){
				label.setText("이벤트 테스트 입니다.");
			}
		}
	}
}
