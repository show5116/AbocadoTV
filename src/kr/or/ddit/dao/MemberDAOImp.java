package kr.or.ddit.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.or.ddit.util.SqlSessionFactoryUtil;
import kr.or.ddit.vo.MemberVO;

public class MemberDAOImp implements IMemberDAO {
	private static MemberDAOImp instance;
	public static MemberDAOImp getInstance() {
		if(instance == null) instance = new MemberDAOImp();
		return instance;
	}
	
	private SqlSessionFactory factory;
	private SqlSession sqlSession;
	
	public MemberDAOImp() {
		factory = SqlSessionFactoryUtil.getInstance();
	}
	
	@Override
	public boolean CheckMember(String mail) {
		try {
			sqlSession = factory.openSession();
			int check = sqlSession.selectOne("MEMBER.checkMember",mail);
			System.out.println(check);
			sqlSession.close();
			if(check==0) return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean InsertMember(MemberVO vo) {
		try {
			sqlSession = factory.openSession();
			int success = sqlSession.insert("MEMBER.insertMember", vo);
			sqlSession.commit();
			sqlSession.close();
			if(success!=0) return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
