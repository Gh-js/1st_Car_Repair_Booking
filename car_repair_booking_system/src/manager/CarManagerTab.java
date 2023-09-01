package manager;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
//import java.awt.Color;
//
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class CarManagerTab extends JPanel { //차량관리
	
	private JTable carTable;
    private JScrollPane scrollPane;

    public CarManagerTab() {
        setLayout(new BorderLayout());

        String[] columnNames = {"차량번호", "모델명", "수리 내역", "입고일", "출고일", "비고"};

        Object[][] data = { //확인용 데이터
                {"123일 5678", "iX", "엔진오일 교체", "2023-08-23", "2023-08-25", ""},
                {"128조 3561", "컴페티션", "타이어 교체", "2023-08-23", "2023-08-27", ""},
                {"586화 1111", "어쩌고", "주유구 점검", "2023-08-30", "2023-08-31", ""},
                {"320이 3492", "저쩌고", "기어 교체", "2023-09-01", "2023-09-12", ""},
                {"932팅 1489", "얼씨고", "유리창 교체", "2023-09-18", "2023-09-23", ""},
                {"521아 6437", "절씨고", "시트 교체", "2023-09-25", "2023-09-27", ""},
                {"359자 5617", "알파고", "암튼 교체함", "2023-09-27", "2023-10-01", ""}
        };

        
        carTable = new JTable(data, columnNames);
        scrollPane = new JScrollPane(carTable);
        CarManagerTab cmt = new CarManagerTab();
        

        add(scrollPane, BorderLayout.CENTER); 
        
        JFrame frame = new JFrame();
        frame.setBounds(200, 200, 500, 600);
        
        
    } //CarManagerTap1

 
    	
} //class
