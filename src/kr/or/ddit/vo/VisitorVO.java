package kr.or.ddit.vo;

public class VisitorVO {
	private String visitor_date;
	private String visitor_count;
	private String visitor_target;
	private String visitor;
	
	public VisitorVO() {}
	public String getVisitor_date() {
		return visitor_date;
	}
	public void setVisitor_date(String visitor_date) {
		this.visitor_date = visitor_date;
	}
	public String getVisitor_count() {
		return visitor_count;
	}
	public void setVisitor_count(String visitor_count) {
		this.visitor_count = visitor_count;
	}
	public String getVisitor_target() {
		return visitor_target;
	}
	public void setVisitor_target(String visitor_target) {
		this.visitor_target = visitor_target;
	}
	public String getVisitor() {
		return visitor;
	}
	public void setVisitor(String visitor) {
		this.visitor = visitor;
	}
}
