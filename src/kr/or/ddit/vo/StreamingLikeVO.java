package kr.or.ddit.vo;

public class StreamingLikeVO {
	private String member_mail;
	private String board_index;
	private String slike_index;
	private String slike_state;
	
	public StreamingLikeVO() {}
	public String getMember_mail() {
		return member_mail;
	}
	public void setMember_mail(String member_mail) {
		this.member_mail = member_mail;
	}
	public String getBoard_index() {
		return board_index;
	}
	public void setBoard_index(String board_index) {
		this.board_index = board_index;
	}
	public String getSlike_index() {
		return slike_index;
	}
	public void setSlike_index(String slike_index) {
		this.slike_index = slike_index;
	}
	public String getSlike_state() {
		return slike_state;
	}
	public void setSlike_state(String slike_state) {
		this.slike_state = slike_state;
	}
}
