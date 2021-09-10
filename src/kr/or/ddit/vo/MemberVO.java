package kr.or.ddit.vo;

public class MemberVO {
	
	private String member_mail; 
	private String firstname; 
	private String lastname; 
	private String password;
	
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

	@Override
	public String toString() {
		return "MemberVO [member_mail=" + member_mail + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", password=" + password + "]";
	};
	
}