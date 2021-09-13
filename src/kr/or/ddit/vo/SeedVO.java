package kr.or.ddit.vo;

public class SeedVO {
	private String member_mail;
	private String seed;
	private String seed_index;
	private String seed_date;
	private String seed_state;
	
	public SeedVO() {}
	public String getMember_mail() {
		return member_mail;
	}
	public void setMember_mail(String member_mail) {
		this.member_mail = member_mail;
	}
	public String getSeed() {
		return seed;
	}
	public void setSeed(String seed) {
		this.seed = seed;
	}
	public String getSeed_index() {
		return seed_index;
	}
	public void setSeed_index(String seed_index) {
		this.seed_index = seed_index;
	}
	public String getSeed_date() {
		return seed_date;
	}
	public void setSeed_date(String seed_date) {
		this.seed_date = seed_date;
	}
	public String getSeed_state() {
		return seed_state;
	}
	public void setSeed_state(String seed_state) {
		this.seed_state = seed_state;
	}
}
