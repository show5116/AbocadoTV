package kr.or.ddit.service;

import java.util.List;

import kr.or.ddit.vo.NoticeVO;

public interface INoticeService {
	public boolean InsertNotice(NoticeVO vo);
	
	public boolean UpdateNotice(NoticeVO vo);
	
	public boolean DeleteNotice(NoticeVO vo);
	
	public List<NoticeVO> SelectListNotice();
	
	public List<NoticeVO> SelectListNotice(String category ,String condition, String value);
	
}
