package kr.or.ddit.service;

import kr.or.ddit.dao.MemberDAOImp;
import kr.or.ddit.util.SendMail;
import kr.or.ddit.vo.MemberVO;

public class MemberServiceImp implements IMemberService{
	private static MemberServiceImp instance;
	public static MemberServiceImp getInstance() {
		if(instance==null) instance = new MemberServiceImp();
		return instance;
	}
	
	private MemberDAOImp memberdao;
	private SendMail sendmail;
	
	private MemberServiceImp() {
		memberdao = MemberDAOImp.getInstance();
		sendmail = SendMail.getInstance();
	}
	
	@Override
	public boolean CheckMember(String mail) {
		if(memberdao.CheckMember(mail)) {
			try {
				sendmail.SendCertification(mail);
				return true;
			} catch (Exception e) {
			}
		}
		return false;
	}
	
	@Override
	public boolean Resend(String mail) {
		try {
			sendmail.SendCertification(mail);
			return true;			
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean InsertMember(MemberVO vo,String certification) {
		if(certification.equals(sendmail.getFromMap(vo.getMember_mail()))) {
			if(memberdao.InsertMember(vo)) {
				return true;
			}
		}
		return false;
	}
}
