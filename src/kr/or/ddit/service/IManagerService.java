package kr.or.ddit.service;

import java.util.List;

import kr.or.ddit.vo.ManagerVO;

public interface IManagerService {
	public boolean InsertManager(ManagerVO vo);
	
	public boolean DeleteManager(ManagerVO vo);
	
	public List<ManagerVO> SelectListManager(String mail);
	
	public boolean CheckManager(String mail);
}
