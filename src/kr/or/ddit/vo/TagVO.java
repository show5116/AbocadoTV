package kr.or.ddit.vo;

public class TagVO {
	private String member_mail;
	private String tag;
	private String tag_index;
	
	public TagVO() {}
	public String getMember_mail() {
		return member_mail;
	}
	public void setMember_mail(String member_mail) {
		this.member_mail = member_mail;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getTag_index() {
		return tag_index;
	}
	public void setTag_index(String tag_index) {
		this.tag_index = tag_index;
	}

}
