package layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("보더 레이아웃");
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setLayout(new BorderLayout());
		
		JButton northBtn = new JButton("북");
		JButton southBtn = new JButton("남");
		JButton eastBtn = new JButton("동");
		JButton westBtn = new JButton("서");
		JButton centerBtn = new JButton("가운데");
		
		frame.add(northBtn,"North");
		frame.add(southBtn,"South");
		frame.add(eastBtn, "East");
		frame.add(westBtn, "West");
		frame.add(centerBtn, "Center");
		
		
		frame.setVisible(true);
	}
}




