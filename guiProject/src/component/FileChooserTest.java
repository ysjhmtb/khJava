package component;

import java.awt.ScrollPane;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class FileChooserTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("파일 추저 테스트");
		frame.setBounds(200, 200, 100, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton messageBtn = new JButton("파일");
		messageBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser jfc = new JFileChooser();
				int status = jfc.showOpenDialog(frame);
				if(status == 0){
					System.out.println("전체 path : " + jfc.getSelectedFile().getPath());
					System.out.println("파일 경로 : " + jfc.getSelectedFile().getParent());
					System.out.println("파일 이름 : " + jfc.getSelectedFile().getName());
				}
			}
		});
		frame.add(messageBtn, "North");
		
		
		
		
		
		frame.setVisible(true);
	}
}
