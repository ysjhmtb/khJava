package component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class CheckBoxTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("체크 박스 연습");
		frame.setBounds(200, 200, 200, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JCheckBox check1 = new JCheckBox("오렌지");
		JCheckBox check2 = new JCheckBox("딸기");
		JCheckBox check3 = new JCheckBox("키위");
		
		JPanel panel = new JPanel();
		panel.add(check1);
		panel.add(check2);
		panel.add(check3);
		
		JLabel result = new JLabel("선택 된 값이 없습니다.");
		
		frame.add(panel, "North");
		frame.add(result, "South");
		
		check1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String message = "";
				if(check1.isSelected()){
					message += "오렌지 ";
				}
				if(check2.isSelected()){
					message += "딸기 ";
				}
				if(check3.isSelected()){
					message += "키위 ";
				}
				if(check1.isSelected() || check2.isSelected() || check3.isSelected()){
					message += " 과일 선택!!";
				}else{
					message = "선택 된 값이 없습니다.";
				}
				result.setText(message);
			}
		});
		check2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String message = "";
				if(check1.isSelected()){
					message += "오렌지 ";
				}
				if(check2.isSelected()){
					message += "딸기 ";
				}
				if(check3.isSelected()){
					message += "키위 ";
				}
				if(check1.isSelected() || check2.isSelected() || check3.isSelected()){
					message += " 과일 선택!!";
				}else{
					message = "선택 된 값이 없습니다.";
				}
				result.setText(message);
			}
		});
		
		check3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String message = "";
				if(check1.isSelected()){
					message += "오렌지 ";
				}
				if(check2.isSelected()){
					message += "딸기 ";
				}
				if(check3.isSelected()){
					message += "키위 ";
				}
				if(check1.isSelected() || check2.isSelected() || check3.isSelected()){
					message += " 과일 선택!!";
				}else{
					message = "선택 된 값이 없습니다.";
				}
				result.setText(message);
			}
		});
		
		
		frame.setVisible(true);
		
		
		
		
		
		
		
		
	}
}
