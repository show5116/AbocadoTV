package kr.or.ddit.dao;

import java.util.List;

import kr.or.ddit.vo.TagVO;

public interface ITagDAO {
	public boolean InsertTag(TagVO vo);
	
	public boolean DeleteTag(TagVO vo);
	
	public List<TagVO> SelectListTag(String mail);
	
}
