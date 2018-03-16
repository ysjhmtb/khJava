package component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("텍스트 에어리어 테스트");
		frame.setBounds(100, 100, 300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextArea chatArea = new JTextArea(10, 30);
		chatArea.setEditable(false);
		
		JTextField inputMessage = new JTextField(30);
		
		inputMessage.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String message = inputMessage.getText() + "\n";
				chatArea.append(message);
				inputMessage.setText("");
			}
		});
		
		frame.add(chatArea, "Center");
		frame.add(inputMessage, "South");
		
		frame.setVisible(true);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
