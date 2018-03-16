package layout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
//배치 방식을 사용하지 않고, 
//원하는 위치에 원하는 크기로 출력하기 위해서 사용
public class NullLayoutTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("null 레이아웃 테스트");
		frame.setBounds(200, 200, 300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		JLabel idLabel = new JLabel("ID");
		idLabel.setLocation(50, 50);
		idLabel.setSize(100, 50);
		frame.add(idLabel);
		
		
		JTextField idText = new JTextField(20);
		idText.setBounds(160, 50, 100, 50);
		frame.add(idText);
		
		JLabel pwLabel = new JLabel("PASSWORD");
		pwLabel.setBounds(50, 110, 100, 50);
		frame.add(pwLabel);
		
		JPasswordField pwf = new JPasswordField(20);
		pwf.setBounds(160, 110, 100, 50);
		frame.add(pwf);
		
		JButton joinBtn = new JButton("회원가입");
		joinBtn.setBounds(100, 180, 100, 50);
		frame.add(joinBtn);
		
		frame.setVisible(true);
	}
}












