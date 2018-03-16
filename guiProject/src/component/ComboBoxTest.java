package component;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ComboBoxTest {
	public static void main(String[] args) {
		String[] animals = {"cat", "dog", "tiger"};

		JFrame frame = new JFrame("콤보박스 테스트");
		frame.setBounds(100, 100, 300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JComboBox<String> animalCombo = new JComboBox<String>(animals);
		frame.add(animalCombo, "North");
		
		JLabel imageLabel = new JLabel();
		frame.add(imageLabel, "Center");
		
		animalCombo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String animal = (String)animalCombo.getSelectedItem();
//				JOptionPane.showMessageDialog(frame, animal);
				Image img = new ImageIcon(animal + ".PNG").getImage().getScaledInstance(150, 150, 0);
				imageLabel.setIcon(new ImageIcon(img));
			}
		});
		frame.setVisible(true);
	}
}


























