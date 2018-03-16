package container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class FrameTest3 extends JFrame{
	
	public FrameTest3(){
		//화면 좌측 상단을 0,0 기준-> x축과 y축으로 생각하시면 됩니다.
		this.setLocation(100, 100);
		//가로길이와 세로 길이 설정
		this.setSize(800, 600);
		//창 상단 타이틀 적용
		this.setTitle("메인 프레임");
		//x를 이용하여 창을 닫을때 메모리에서 삭제 시킴
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//파비콘 설정
		this.setIconImage(new ImageIcon("image/icon.PNG").getImage());
		
		//사이즈 조정x
		setResizable(false);
		
		//보여지게 하는 부분
		this.setVisible(true);
	}
}
