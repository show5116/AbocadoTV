package kr.or.ddit.service;

import java.util.List;

import kr.or.ddit.vo.StreamingVO;

public interface IStreamingService {
	public boolean InsertStreaming(StreamingVO vo);
	
	public boolean UpdateStreaming(StreamingVO vo);
	
	public boolean DeleteStreaming(StreamingVO vo);
	
	public List<StreamingVO> SelectListStreaming();
	
	public List<StreamingVO> SelectListStreaming(String condition);
}
