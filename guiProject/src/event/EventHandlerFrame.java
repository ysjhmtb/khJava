package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EventHandlerFrame extends JFrame implements ActionListener {
	private JLabel label;
	private JButton button;
	
	public EventHandlerFrame(){
		super("내부 클래스 이벤트 테스트");
		setBounds(100, 100, 100, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label = new JLabel("클릭하십시오!!");
		add(label, "North");
		
		button = new JButton("선택 버튼");
		add(button, "South");
		
		button.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button){
			label.setText("이벤트 테스트 입니다.");
		}
	}

}
