package kr.or.ddit.dao;

import java.util.List;

import kr.or.ddit.vo.CategoryVO;

public interface ICategoryDAO {
	public boolean InsertCategory(CategoryVO vo);
	
	public boolean DeleteCategory(CategoryVO vo);
	
	public boolean UpdateCategory(CategoryVO vo);
	
	public List<CategoryVO> SelectCategory(String mail);
}
