package component;

import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButtonTest {
	public static void main(String[] args) {
		//프레임에 레이아웃 설정하지 않으면 기본 레이아웃이 설정됨(보더 레이아웃)
		JFrame frame = new JFrame("라디오 버튼 테스트");
		frame.setBounds(200, 200, 300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//기본 레이아웃 - 프로우 레이아웃
		JPanel panel = new JPanel();
		JLabel label = new JLabel("주문 메뉴 선택");
		panel.add(label);
		frame.add(panel, "North");
		
		JPanel buttonPanel = new JPanel();
		JRadioButton coffee1 = new JRadioButton("에스프레소");
		coffee1.setSelected(true);
		JRadioButton coffee2 = new JRadioButton("아메리카노");
		JRadioButton coffee3 = new JRadioButton("카페모카");
		
		ButtonGroup radioButtons = new ButtonGroup();
		radioButtons.add(coffee1);
		radioButtons.add(coffee2);
		radioButtons.add(coffee3);
		
		buttonPanel.add(coffee1);
		buttonPanel.add(coffee2);
		buttonPanel.add(coffee3);
		frame.add(buttonPanel, "Center");
		
		JLabel resultLabel = new JLabel("에스프레소를 선택하셧습니다.");
		frame.add(resultLabel, "South");
		
		coffee1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(coffee1.isSelected() + "/" + coffee2.isSelected() + "/" + coffee3.isSelected());
				resultLabel.setText("에스프레소를 선택하셧습니다.");
			}
		});
		coffee2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(coffee1.isSelected() + "/" + coffee2.isSelected() + "/" + coffee3.isSelected());
				resultLabel.setText("아메리카노를 선택하셧습니다.");
			}
		});
		coffee3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(coffee1.isSelected() + "/" + coffee2.isSelected() + "/" + coffee3.isSelected());
				resultLabel.setText("카페모카를 선택하셧습니다.");
			}
		});
		
		frame.setVisible(true);
	}
}
