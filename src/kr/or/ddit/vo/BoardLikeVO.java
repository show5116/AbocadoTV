package kr.or.ddit.vo;

public class BoardLikeVO {
	private String member_mail;
	private String board_index;
	private String blike_index;
	private String blike_state;
	
	public BoardLikeVO() {}
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
	public String getBlike_index() {
		return blike_index;
	}
	public void setBlike_index(String blike_index) {
		this.blike_index = blike_index;
	}
	public String getBlike_state() {
		return blike_state;
	}
	public void setBlike_state(String blike_state) {
		this.blike_state = blike_state;
	}
}
