package kr.or.ddit.service;

import java.util.List;

import kr.or.ddit.vo.SeedVO;

public interface ISeedService {
	public boolean InsertSeed(SeedVO vo);
	
	public List<SeedVO> SelectSeed(String mail);
	
	public int SumSales();
}
