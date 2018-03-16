package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class MyEventListener implements ActionListener {
	JLabel label;
	JButton button;
	
	public MyEventListener(){
	}
	
	public MyEventListener(JLabel label, JButton button){
		this.label = label;
		this.button = button;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button){
			label.setText("이벤트 테스트 입니다.");
		}
	}

}



















