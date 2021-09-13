package kr.or.ddit.dao;

import kr.or.ddit.vo.BlogLikeVO;

public interface IBlogLikeDAO {
	public boolean InsertBoardLike(BlogLikeVO vo);
	
	public boolean DeleteBoardLike(BlogLikeVO vo);
	
	public boolean CheckBoardLike(String mail);
	
	public int CountBoardLike(String idx);
}
