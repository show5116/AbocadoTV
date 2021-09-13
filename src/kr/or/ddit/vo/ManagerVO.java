package kr.or.ddit.vo;

public class ManagerVO {
	private String member_mail;
	private String manager_mail;
	private String manager_index;
	
	public ManagerVO() {}
	public String getMember_mail() {
		return member_mail;
	}
	public void setMember_mail(String member_mail) {
		this.member_mail = member_mail;
	}
	public String getManager_mail() {
		return manager_mail;
	}
	public void setManager_mail(String manager_mail) {
		this.manager_mail = manager_mail;
	}
	public String getManager_index() {
		return manager_index;
	}
	public void setManager_index(String manager_index) {
		this.manager_index = manager_index;
	}
}
