package kr.or.ddit.vo;

public class ChatBlockVO {
	private String streamer_mail;
	private String member_mail;
	private String block_index;
	private String block_starttime;
	private String block_endtime;
	
	public ChatBlockVO() {}
	public String getStreamer_mail() {
		return streamer_mail;
	}
	public void setStreamer_mail(String streamer_mail) {
		this.streamer_mail = streamer_mail;
	}
	public String getMember_mail() {
		return member_mail;
	}
	public void setMember_mail(String member_mail) {
		this.member_mail = member_mail;
	}
	public String getBlock_index() {
		return block_index;
	}
	public void setBlock_index(String block_index) {
		this.block_index = block_index;
	}
	public String getBlock_starttime() {
		return block_starttime;
	}
	public void setBlock_starttime(String block_starttime) {
		this.block_starttime = block_starttime;
	}
	public String getBlock_endtime() {
		return block_endtime;
	}
	public void setBlock_endtime(String block_endtime) {
		this.block_endtime = block_endtime;
	}
}
