package kr.or.ddit.service;

import java.util.List;

import kr.or.ddit.vo.CategoryVO;

public interface ICategoryService {
	public boolean InsertCategory(CategoryVO vo);
	
	public boolean DeleteCategory(CategoryVO vo);
	
	public boolean UpdateCategory(CategoryVO vo);
	
	public List<CategoryVO> SelectCategory(String mail);
}
