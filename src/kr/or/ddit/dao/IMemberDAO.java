package kr.or.ddit.dao;

import kr.or.ddit.vo.MemberVO;

public interface IMemberDAO {
	public boolean CheckMember(String mail);
	
	public boolean InsertMember(MemberVO vo);
}
