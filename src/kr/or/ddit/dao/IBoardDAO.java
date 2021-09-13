package kr.or.ddit.dao;

import java.util.List;

import kr.or.ddit.vo.BoardVO;

public interface IBoardDAO {
	public int CountTotalBoard();
	
	public boolean InsertBoard(BoardVO vo);
	
	public boolean DeleteBoard(BoardVO vo);
	
	public boolean UpdateBoard(BoardVO vo);
	
	/**
	 * 전체 리스트 출력
	 * @return
	 */
	public List<BoardVO> SelectListBoard();
	
	/**
	 * 검색
	 * @param condition 검색 조건
	 * @param value 검색 값
	 * @return
	 */
	public List<BoardVO> SelectListBoard(String condition,String value);
	
	public BoardVO SeeBoard(String idx);
	
	public BoardVO NextBoard(String idx);
	
	public BoardVO PreBoard(String idx);
}
