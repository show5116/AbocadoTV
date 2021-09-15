package kr.or.ddit.vo;

public class MemberVO {
	
	private String member_mail; 
	private String firstname; 
	private String lastname; 
	private String password;
	private String nickname;
	private String member_date;
	private String regedent_num;
	private String introducion;
	private String freezdate;
	private String profilephoth;
	
	public MemberVO(){}
	public String getMember_mail() {
		return member_mail;
	}
	public void setMember_mail(String member_mail) {
		this.member_mail = member_mail;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getMember_date() {
		return member_date;
	}
	public void setMember_date(String member_date) {
		this.member_date = member_date;
	}
	public String getRegedent_num() {
		return regedent_num;
	}
	public void setRegedent_num(String regedent_num) {
		this.regedent_num = regedent_num;
	}
	public String getIntroducion() {
		return introducion;
	}
	public void setIntroducion(String introducion) {
		this.introducion = introducion;
	}
	public String getFreezdate() {
		return freezdate;
	}
	public void setFreezdate(String freezdate) {
		this.freezdate = freezdate;
	}
	public String getProfilephoth() {
		return profilephoth;
	}
	public void setProfilephoth(String profilephoth) {
		this.profilephoth = profilephoth;
	}
}