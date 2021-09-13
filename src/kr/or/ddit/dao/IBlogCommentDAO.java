package kr.or.ddit.dao;

import java.util.List;

import kr.or.ddit.vo.BlogCommentVO;

public interface IBlogCommentDAO {
	public boolean InsertComment(BlogCommentVO vo);
	
	public boolean UpdateComment(BlogCommentVO vo);
	
	public List<BlogCommentVO> SelectListComment(String boardIdx);
}
