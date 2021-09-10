package kr.or.ddit.service;

import kr.or.ddit.vo.MemberVO;

public interface IMemberService {
	public boolean CheckMember(String mail);
	
	public boolean Resend(String mail);
	
	public boolean InsertMember(MemberVO vo,String certification);
}
