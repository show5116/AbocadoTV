package kr.or.ddit.service;

import java.util.List;

import kr.or.ddit.vo.TagVO;

public interface ITagService {
	public boolean InsertTag(TagVO vo);
	
	public boolean DeleteTag(TagVO vo);
	
	public List<TagVO> SelectListTag(String mail);
	
}
