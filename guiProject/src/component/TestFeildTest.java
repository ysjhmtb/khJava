package component;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TestFeildTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("텍스트필드 테스트");
		
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new GridLayout(3, 2));
		
		JLabel idLabel = new JLabel("ID");
		jPanel.add(idLabel);
		JTextField idTF = new JTextField(30);
		jPanel.add(idTF);
		
		JLabel pwLabel = new JLabel("PASSWORD");
		jPanel.add(pwLabel);
		JPasswordField pwF = new JPasswordField(30);
		jPanel.add(pwF);
		
		JTextArea jTextArea = new JTextArea(5, 30);
		
		JButton button = new JButton("보내기");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = "id : " + idTF.getText() + "\n";
				text += "password : " + pwF.getPassword() + "\n";
				jTextArea.append(text);
			}
		});
		
		
		frame.add(jPanel,"North");
		frame.add(jTextArea,"Center");
		frame.add(button,"South");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 500, 500);
		frame.setVisible(true);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
