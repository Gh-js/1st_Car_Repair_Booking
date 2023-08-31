package manager;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class CarManager extends JFrame {

	
	private JTabbedPane jtp;
	
	public CarManager() {
		super("MYCAR");
		jtp=new JTabbedPane();
		
		//상단 탭
		CarManagerTap1 cmt1=new CarManagerTap1(); 
		CarManagerTap2 cmt2=new CarManagerTap2(); 
		CarManagerTap3 cmt3=new CarManagerTap3(); 
		CarManagerTap4 cmt4=new CarManagerTap4(); 
		CarManagerTap5 cmt5=new CarManagerTap5(); 
		CarManagerTap6 cmt6=new CarManagerTap6(); 
		
		jtp.add(cmt1,"차 량 관 리");
		jtp.add(cmt2,"재 고 관 리");
		jtp.add(cmt3,"발 주 관 리");
		jtp.add(cmt4,"예 약 관 리");
		jtp.add(cmt5," 정    산 ");
		jtp.add(cmt6,"내   정 보");
		
		add("Center", jtp);
		
		//글씨
		cmt1.setFont(new Font("맑은 고딕",Font.PLAIN,12));
		cmt2.setFont(new Font("맑은 고딕",Font.PLAIN,12));
		cmt3.setFont(new Font("맑은 고딕",Font.PLAIN,12));
		cmt4.setFont(new Font("맑은 고딕",Font.PLAIN,12));
		cmt5.setFont(new Font("맑은 고딕",Font.PLAIN,12));
		cmt6.setFont(new Font("맑은 고딕",Font.PLAIN,12));
		
		

		//크기 조정 및 배치
		setBounds(100, 100, 1500, 800);
		setVisible(true);
		
		
	}//CarManager
	
	
	public static void main(String[] args) {
		new CarManager();
	}//main

}//class
