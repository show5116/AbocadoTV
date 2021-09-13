package kr.or.ddit.vo;

public class BlogCommentVO {
	private String member_mail;
	private String blog_index;
	private String blogcomment_index;
	private String blogcomment_date;
	private String blogcomment_content;
	private String blogcomment_state;
	
	public BlogCommentVO() {}
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
	public String getBlogcomment_index() {
		return blogcomment_index;
	}
	public void setBlogcomment_index(String blogcomment_index) {
		this.blogcomment_index = blogcomment_index;
	}
	public String getBlogcomment_date() {
		return blogcomment_date;
	}
	public void setBlogcomment_date(String blogcomment_date) {
		this.blogcomment_date = blogcomment_date;
	}
	public String getBlogcomment_content() {
		return blogcomment_content;
	}
	public void setBlogcomment_content(String blogcomment_content) {
		this.blogcomment_content = blogcomment_content;
	}
	public String getBlogcomment_state() {
		return blogcomment_state;
	}
	public void setBlogcomment_state(String blogcomment_state) {
		this.blogcomment_state = blogcomment_state;
	}
}
