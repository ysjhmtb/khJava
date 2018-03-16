package layout;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CardLayoutTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("카드 레이아웃");
		frame.setBounds(300, 200, 300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		CardLayout card = new CardLayout();
		frame.setLayout(card);
		//패널 컴포넌트를 생성
		JPanel card1 = new JPanel();
		JPanel card2 = new JPanel();
		JPanel card3 = new JPanel();
		
		//패널 색 설정
		card1.setBackground(Color.PINK);
		card2.setBackground(Color.BLACK);
		card3.setBackground(Color.YELLOW);
		
		//글자 출력을 위해서 라벨 추가
		card1.add(new JLabel("Card1"));
		card2.add(new JLabel("Card2"));
		card3.add(new JLabel("Card3"));
		
		card1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e){
				System.out.println("1번 판 클릭 하셧습니다.");
				if(e.getButton() == 1){
					System.out.println("1번 버튼 클릭!");
					card.next(card1.getParent());
				}
				if(e.getButton() == 3){
					System.out.println("3번 버튼 클릭!");
					card.previous(card1.getParent());
				}
			}
		});
		
		card2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e){
				System.out.println("2번 판 클릭 하셧습니다.");
				if(e.getButton() == 1){
					System.out.println("1번 버튼 클릭!");
					card.next(card2.getParent());
				}
				if(e.getButton() == 3){
					System.out.println("3번 버튼 클릭!");
					card.previous(card2.getParent());
				}
			}
		});
		
		card3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e){
				System.out.println("3번 판 클릭 하셧습니다.");
				if(e.getButton() == 1){
					System.out.println("1번 버튼 클릭!");
					card.next(card3.getParent());
				}
				if(e.getButton() == 3){
					System.out.println("3번 버튼 클릭!");
					card.previous(card3.getParent());
				}
			}
		});
		
		frame.add(card1);
		frame.add(card2);
		frame.add(card3);
		
		frame.setVisible(true);
	}
}
