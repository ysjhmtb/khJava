package component;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

public class ImageIconTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("이미지 아이콘 테스트");
		frame.setBounds(200, 200, 300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Image imageIcon = new ImageIcon("user.PNG").getImage().getScaledInstance(150, 150, 0);
		JLabel label = new JLabel(new ImageIcon(imageIcon));
		frame.add(label, "Center");
		
		JToggleButton imageChgBtn = new JToggleButton("이미지 보기");
		frame.add(imageChgBtn, "South");
		
		imageChgBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Image changeIcon = null;
				if(imageChgBtn.isSelected()){
					changeIcon = new ImageIcon("tiger.PNG").getImage().getScaledInstance(150, 150, 0);
				}else{
					changeIcon = new ImageIcon("user.PNG").getImage().getScaledInstance(150, 150, 0);
				}
				label.setIcon(new ImageIcon(changeIcon));
			}
		});
		
		frame.setVisible(true);
	}
}


















