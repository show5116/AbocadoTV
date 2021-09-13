package kr.or.ddit.service;

import kr.or.ddit.vo.BoardLikeVO;

public interface IBoardLikeService {
	public boolean InsertBoardLike(BoardLikeVO vo);
	
	public boolean DeleteBoardLike(BoardLikeVO vo);
	
	public boolean CheckBoardLike(String mail);
	
	public int CountBoardLike(String idx);
}
