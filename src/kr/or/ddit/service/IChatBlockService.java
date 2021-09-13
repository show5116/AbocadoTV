package kr.or.ddit.service;

import kr.or.ddit.vo.ChatBlockVO;

public interface IChatBlockService {
	public boolean InsertChatBlock(ChatBlockVO vo);
	
	public boolean CheckChatBlock(String mail);
}
