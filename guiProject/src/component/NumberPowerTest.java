package component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class NumberPowerTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("제곱하기");
		frame.setBounds(100, 100, 300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		JTextField numTF = new JTextField();
		numTF.setBounds(50, 50, 200, 50);
		frame.add(numTF);
		
		JTextField resultTF = new JTextField();
		resultTF.setBounds(50, 110, 200, 50);
		resultTF.setEditable(false);
		frame.add(resultTF);
		
		JButton operBtn = new JButton("제곱하기");
		operBtn.setBounds(100, 180, 100, 50);
		frame.add(operBtn);
		
		operBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//1. 입력된 값을 가져온다.
				String inputStr = numTF.getText();
				int inputNum = Integer.parseInt(inputStr);
				//2. 값을 제곱한다.
				int result = inputNum * inputNum;
				//3. 해당 결과값을 두번째 칸에 출력한다.
				resultTF.setText(String.valueOf(result));
			}
		});
		
		frame.setVisible(true);
	}
}







