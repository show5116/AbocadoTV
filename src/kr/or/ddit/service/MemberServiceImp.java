package kr.or.ddit.service;

import kr.or.ddit.dao.MemberDAOImp;
import kr.or.ddit.util.GsonUtil;
import kr.or.ddit.util.SHA256Util;
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
	private GsonUtil gsonUtil;
	private SHA256Util sha256Util;
	
	private MemberServiceImp() {
		memberdao = MemberDAOImp.getInstance();
		sendmail = SendMail.getInstance();
		gsonUtil = GsonUtil.getInstance();
		sha256Util = SHA256Util.getInstance();
	}
	
	@Override
	public String CheckMember(String mail) {
		if(memberdao.CheckMember(mail)) {
			try {
				sendmail.SendCertification(mail);
				return gsonUtil.SwOK();
			} catch (Exception e) {
			}
		}
		return gsonUtil.SwNO();
	}
	
	@Override
	public String Resend(String mail) {
		try {
			sendmail.SendCertification(mail);
			return gsonUtil.SwOK();			
		} catch (Exception e) {
			return gsonUtil.SwNO();
		}
	}

	@Override
	public String InsertMember(MemberVO vo,String certification) {
		vo.setPassword(sha256Util.encrypt(vo.getPassword()));
		if(certification.equals(sendmail.getFromMap(vo.getMember_mail()))) {
			if(memberdao.InsertMember(vo)) {
				return gsonUtil.SwOK();
			}
		}
		return gsonUtil.SwNO();
	}
}
