package event;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class KeyEventTest extends JFrame implements KeyListener{

	public KeyEventTest(){
		setTitle("키이벤트 테스트");
		setBounds(100, 100, 200, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextField textField = new JTextField();
		textField.addKeyListener(this);
		
		add(textField, "Center");
		
		setVisible(true);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("키 char : " + e.getKeyChar());
		System.out.println("키 code : " + e.getKeyCode());
		System.out.println("특수 키 확인 : " + e.isAltDown() + ", " + e.isControlDown() + ", " + e.isShiftDown());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("keyReleased");
	}

	public static void main(String[] args) {
		new KeyEventTest();
	}
}



