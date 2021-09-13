package kr.or.ddit.vo;

public class BlogLikeVO {
	private String member_mail;
	private String blog_index;
	private String bloglike_index;
	private String bloglike_state;
	
	public BlogLikeVO() {}
	public String getMember_mail() {
		return member_mail;
	}
	public void setMember_mail(String member_mail) {
		this.member_mail = member_mail;
	}
	public String getBlog_index() {
		return blog_index;
	}
	public void setBlog_index(String blog_index) {
		this.blog_index = blog_index;
	}
	public String getBloglike_index() {
		return bloglike_index;
	}
	public void setBloglike_index(String bloglike_index) {
		this.bloglike_index = bloglike_index;
	}
	public String getBloglike_state() {
		return bloglike_state;
	}
	public void setBloglike_state(String bloglike_state) {
		this.bloglike_state = bloglike_state;
	}
}
