package kr.or.ddit.dao;

import java.util.List;

import kr.or.ddit.vo.BoardCommentVO;

public interface IBoardCommentDAO {
	public boolean InsertComment(BoardCommentVO vo);
	
	public boolean UpdateComment(BoardCommentVO vo);
	
	public List<BoardCommentVO> SelectListComment(String boardIdx);
}
