package kr.or.ddit.dao;

import kr.or.ddit.vo.StreamingLikeVO;

public interface IStreamingLikeDAO {
	public boolean InsertStreamingLike(StreamingLikeVO vo);
	
	public boolean DeleteStreamingLike(StreamingLikeVO vo);
	
	public boolean CheckStreamingLike(String mail);
	
	public int CountStreamingLike(String idx);
}
