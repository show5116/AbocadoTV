package kr.or.ddit.dao;

import java.util.List;

import kr.or.ddit.vo.BlogVO;

public class BlogDAOImp implements IBlogDAO{

	@Override
	public int CountTotalBoard() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean InsertBoard(BlogVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean DeleteBoard(BlogVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean UpdateBoard(BlogVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<BlogVO> SelectListBoard() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BlogVO> SelectListBoard(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BlogVO> SelectListBoard(String category, String condition, String value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BlogVO SeeBoard(String idx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BlogVO NextBoard(String idx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BlogVO NextBoard(String idx, String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BlogVO PreBoard(String idx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BlogVO PreBoard(String idx, String category) {
		// TODO Auto-generated method stub
		return null;
	}

}
