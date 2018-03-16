package layout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutTest {
	public static void main(String[] args) {
		JFrame mf = new JFrame();
		mf.setBounds(300, 300, 300, 300);
		mf.setLayout(new FlowLayout(FlowLayout.CENTER));
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mf.add(new JButton("1번"));
		mf.add(new JButton("2번"));
		mf.add(new JButton("3번"));
		mf.add(new JButton("4번"));
		mf.add(new JButton("5번"));
		mf.add(new JButton("1번"));
		mf.add(new JButton("2번"));

		mf.setVisible(true);
	}
}
