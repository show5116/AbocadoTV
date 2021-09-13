package kr.or.ddit.service;

import java.util.List;

import kr.or.ddit.vo.BoardCommentVO;

public interface IBoardCommentService {
	public boolean InsertComment(BoardCommentVO vo);
	
	public boolean UpdateComment(BoardCommentVO vo);
	
	public List<BoardCommentVO> SelectListComment(String boardIdx);
}
