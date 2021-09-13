package kr.or.ddit.vo;

public class EarningVO {
	private String member_mail;
	private String charge;
	private String earning_date;
	private String earning_index;
	
	public EarningVO() {}
	public String getMember_mail() {
		return member_mail;
	}
	public void setMember_mail(String member_mail) {
		this.member_mail = member_mail;
	}
	public String getCharge() {
		return charge;
	}
	public void setCharge(String charge) {
		this.charge = charge;
	}
	public String getEarning_date() {
		return earning_date;
	}
	public void setEarning_date(String earning_date) {
		this.earning_date = earning_date;
	}
	public String getEarning_index() {
		return earning_index;
	}
	public void setEarning_index(String earning_index) {
		this.earning_index = earning_index;
	}
}
