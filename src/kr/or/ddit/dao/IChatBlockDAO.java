package kr.or.ddit.dao;

import kr.or.ddit.vo.ChatBlockVO;

public interface IChatBlockDAO {
	public boolean InsertChatBlock(ChatBlockVO vo);
	
	public boolean CheckChatBlock(String mail);
}
