package kr.or.ddit.service;

import kr.or.ddit.vo.VisitorVO;

public interface IVisitorService {
	public boolean UpdateVisitor();
	
	public boolean CheckVisitor(String date);
	
	public boolean InsertVisitor(VisitorVO vo);
	
	public int CountVisitor(String target,String date);
	
	public int CountTotalVisitor(String target);
	
}
