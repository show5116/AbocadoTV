package kr.or.ddit.dao;

import java.util.List;

import kr.or.ddit.vo.BoardVO;

public class BoardDAOImp implements IBoardDAO{

	@Override
	public int CountTotalBoard() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean InsertBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean DeleteBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean UpdateBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<BoardVO> SelectListBoard() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardVO> SelectListBoard(String condition, String value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardVO SeeBoard(String idx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardVO NextBoard(String idx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardVO PreBoard(String idx) {
		// TODO Auto-generated method stub
		return null;
	}

}
