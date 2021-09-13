package kr.or.ddit.dao;

import kr.or.ddit.vo.VisitorVO;

public interface IVisitorDAO {
	public boolean UpdateVisitor();
	
	public boolean CheckVisitor(String date);
	
	public boolean InsertVisitor(VisitorVO vo);
	
	public int CountVisitor(String target,String date);
	
	public int CountTotalVisitor(String target);
	
}
