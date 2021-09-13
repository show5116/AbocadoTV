package kr.or.ddit.dao;

import java.util.List;

import kr.or.ddit.vo.MemberVO;

public interface IMemberDAO {
	public boolean CheckMember(String mail);
	
	public boolean InsertMember(MemberVO vo);
	
	public boolean PasswordCheck(String password);
	
	public List<MemberVO> SelectListMember();
	
	public List<MemberVO> SelectListMember(String mail);
	
	public List<MemberVO> SelectListMember(String condition,String mail);

	public int MemberCount();
	
	public MemberVO SelectMember(String mail);
	
	public boolean UpdateMember(MemberVO vo);
}
