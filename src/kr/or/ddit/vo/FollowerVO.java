package kr.or.ddit.vo;

public class FollowerVO {
	private String follow_mail;
	private String follower_mail;
	private String follower_index;
	
	public FollowerVO() {}
	public String getFollow_mail() {
		return follow_mail;
	}
	public void setFollow_mail(String follow_mail) {
		this.follow_mail = follow_mail;
	}
	public String getFollower_mail() {
		return follower_mail;
	}
	public void setFollower_mail(String follower_mail) {
		this.follower_mail = follower_mail;
	}
	public String getFollower_index() {
		return follower_index;
	}
	public void setFollower_index(String follower_index) {
		this.follower_index = follower_index;
	}
}
