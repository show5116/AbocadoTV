package kr.or.ddit.service;

import kr.or.ddit.vo.FollowerVO;

public interface IFollowerService {
	public boolean InsertFollower(FollowerVO vo);
	
	public boolean DeleteFollower(FollowerVO vo);

	public int CountFollower(String mail);
}
