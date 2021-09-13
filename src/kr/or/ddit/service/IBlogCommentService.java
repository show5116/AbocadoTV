package kr.or.ddit.service;

import java.util.List;

import kr.or.ddit.vo.BlogCommentVO;

public interface IBlogCommentService {
	public boolean InsertComment(BlogCommentVO vo);
	
	public boolean UpdateComment(BlogCommentVO vo);
	
	public List<BlogCommentVO> SelectListComment(String boardIdx);
}
