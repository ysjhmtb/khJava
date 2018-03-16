package component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ConfirmDialogTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("메세지 다이얼로그 확인");
		frame.setBounds(200, 200, 100, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton messageBtn = new JButton("확인");
		messageBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "확인 메세지 출력");
			}
		});
		frame.add(messageBtn, "North");
		
		JButton inputBtn = new JButton("값 입력");
		inputBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String inputMessage = JOptionPane.showInputDialog("당신이 생각하는 정답은 무엇입니까?");
				System.out.println(inputMessage);
			}
		});
		frame.add(inputBtn, "Center");
		
		JButton confirmBtn = new JButton("Yes/No");
		confirmBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(frame, "지금 배가 고프싶니까?");
				System.out.println(result);
			}
		});
		frame.add(confirmBtn, "South");
		frame.setVisible(true);
	}
}
















