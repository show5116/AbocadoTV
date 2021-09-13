package kr.or.ddit.dao;

import java.util.List;

import kr.or.ddit.vo.BlogVO;



public interface IBlogDAO {
	public int CountTotalBoard();
	
	public boolean InsertBoard(BlogVO vo);
	
	public boolean DeleteBoard(BlogVO vo);
	
	public boolean UpdateBoard(BlogVO vo);

	public List<BlogVO> SelectListBoard();
	
	public List<BlogVO> SelectListBoard(String category);

	public List<BlogVO> SelectListBoard(String category,String condition,String value);
	
	public BlogVO SeeBoard(String idx);
	
	public BlogVO NextBoard(String idx);
	
	public BlogVO NextBoard(String idx, String category);
	
	public BlogVO PreBoard(String idx);
	
	public BlogVO PreBoard(String idx, String category);
}
