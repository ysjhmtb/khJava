package component;

import java.awt.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
public class ListTest {
	public static void main(String[] args) {
		String[] cities = {"서울", "경기도", "강원도", "경상도", "전라도", "충청도", "제주도"};
		JFrame frame = new JFrame("리스트 테스트");
		frame.setBounds(100, 100, 300, 300);
		
		JList cityList = new JList(cities);
		cityList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		frame.add(cityList, "Center");
		
		JLabel resultLabel = new JLabel("test");
		frame.add(resultLabel, "South");
		
		cityList.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				resultLabel.setText((String)cityList.getSelectedValue());
			}
		});
		
		frame.setVisible(true);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
