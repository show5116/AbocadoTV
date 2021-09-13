package kr.or.ddit.dao;

import java.util.List;

import kr.or.ddit.vo.ManagerVO;

public interface IManagerDAO {
	public boolean InsertManager(ManagerVO vo);
	
	public boolean DeleteManager(ManagerVO vo);
	
	public List<ManagerVO> SelectListManager(String mail);
	
	public boolean CheckManager(String mail);
}
