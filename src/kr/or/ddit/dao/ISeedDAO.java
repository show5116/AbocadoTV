package kr.or.ddit.dao;

import java.util.List;

import kr.or.ddit.vo.SeedVO;

public interface ISeedDAO {
	public boolean InsertSeed(SeedVO vo);
	
	public List<SeedVO> SelectSeed(String mail);
	
	public int SumSales();
}
