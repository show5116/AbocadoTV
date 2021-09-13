package kr.or.ddit.dao;

import java.util.List;

import kr.or.ddit.vo.StreamingVO;

public interface IStreamingDAO {
	public boolean InsertStreaming(StreamingVO vo);
	
	public boolean UpdateStreaming(StreamingVO vo);
	
	public boolean DeleteStreaming(StreamingVO vo);
	
	public List<StreamingVO> SelectListStreaming();
	
	public List<StreamingVO> SelectListStreaming(String condition);
}
