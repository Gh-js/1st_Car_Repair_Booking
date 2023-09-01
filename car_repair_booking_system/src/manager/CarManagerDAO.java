package manager;

import java.util.ArrayList;
import java.util.List;

public class CarManagerDAO {
	private static CarManagerDAO cMDAO;
	
	private CarManagerDAO() {
		
	}
	
	public static CarManagerDAO getInstance() {
		if(cMDAO==null) {
			cMDAO=new CarManagerDAO();
		}
		return cMDAO;
	}
	
	public List<CarManagerVO> selectCarInfo(String strDate, String endDate){
		List<CarManagerVO> list = new ArrayList<CarManagerVO>();
		
		
		return list;
	}
	
	public CarManagerVO selectOneCarInfo(String carNo, String receivedDay) {
		CarManagerVO cVO = new CarManagerVO();
		
		return cVO;
	}
	
	public List<PartInfoVO> selectOnePartInfo(String partNo){
		List<PartInfoVO> list = new ArrayList<PartInfoVO>();
		
		
		return	 list;
	}
	
	public void insertCarInfo(CarManagerVO cVO) {
		
	}
	public void insertPartInfo(PartInfoVO pVO) {
		
	}
	
	public void updateCarInfo(String endDate) {
		
	}
	

}
