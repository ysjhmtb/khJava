package layout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("그리드 레이아웃");
		frame.setBounds(300, 300, 300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setLayout(new GridLayout(5, 5));
		
		for(int i = 0 ; i < 25 ; i++){
			frame.add(new JButton(i + "버튼"));
		}
		
		frame.setVisible(true);
	}
}
