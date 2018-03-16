package event;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MouseEventTest extends JFrame implements MouseListener, MouseMotionListener{
	Point[] points = {new Point(20, 20), new Point(150, 150)}; 

	public MouseEventTest(){
		setTitle("마우스 이벤트 테스트");
		setBounds(100, 100, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.addMouseListener(this);
		panel.addMouseMotionListener(this);
		add(panel, "Center");
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
//		System.out.println("마우스가 클릭 됬을때 클릭 횟수: " + e.getClickCount());
		System.out.println("클릭 위치 : " + e.getX() + ", " + e.getY());
		Point temp = null;
		int x = e.getX();
		int y = e.getY();
		for(int i = 0 ; i < points.length ; i++){
			temp = points[i];
			if(temp.x <= x && x <= temp.x + 20 && 
					temp.y <= y && y <= temp.y + 20){
				JOptionPane.showMessageDialog(null, "찾았습니다.");
			}
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("마우스가 눌러진 상태");
		System.out.println("눌러진 위치 : " + e.getX() + ", " + e.getY());
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("클릭을 땐 위치 : " + e.getX() + ", " + e.getY());
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("마우스가 들어왔습니다.");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("마우스가 나갔습니다.");
	}
	
	
	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("마우스 드래그 : " + e);
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
//		System.out.println("마우스 무브드 : " + e);
	}
	
	public static void main(String[] args){
		MouseEventTest frame = new MouseEventTest();
		frame.setVisible(true);
	}
	
}














