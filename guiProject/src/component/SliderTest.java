package component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("슬라이더 연습");
		frame.setBounds(100, 100, 500, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("슬라이더 이동");
		frame.add(label, "North");
		
		JSlider slider = new JSlider(1, 100, 50);
		frame.add(slider, "Center");
		
		JPanel resultPanel = new JPanel();
		JButton resultBtn = new JButton("결과");
		resultPanel.add(resultBtn);
		JLabel resultLabel = new JLabel();
		resultPanel.add(resultLabel);
		frame.add(resultPanel, "South");
		
//		slider.addChangeListener(new ChangeListener() {
//			@Override
//			public void stateChanged(ChangeEvent e) {
//				resultLabel.setText(String.valueOf(slider.getValue()));
//			}
//		});
		
		resultBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				resultLabel.setText(String.valueOf(slider.getValue()));
			}
		});
		frame.setVisible(true);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
