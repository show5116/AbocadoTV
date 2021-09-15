package kr.or.ddit.service;

import kr.or.ddit.vo.MemberVO;

public interface IMemberService {
	public String CheckMember(String mail);
	
	public String Resend(String mail);
	
	public String InsertMember(MemberVO vo,String certification);
}
