package kr.or.ddit.service;

import kr.or.ddit.vo.BlogLikeVO;

public interface IBlogLikeService {
	public boolean InsertBoardLike(BlogLikeVO vo);
	
	public boolean DeleteBoardLike(BlogLikeVO vo);
	
	public boolean CheckBoardLike(String mail);
	
	public int CountBoardLike(String idx);
}
