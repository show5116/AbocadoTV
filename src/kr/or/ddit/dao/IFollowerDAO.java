package kr.or.ddit.dao;

import kr.or.ddit.vo.FollowerVO;

public interface IFollowerDAO {
	public boolean InsertFollower(FollowerVO vo);
	
	public boolean DeleteFollower(FollowerVO vo);

	public int CountFollower(String mail);
}
