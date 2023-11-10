package net.daum.dao;

import net.daum.vo.TestBoardVO;

public interface TestBoardDAO {

	void updateBhitById(int bno);

	TestBoardVO getBoardById(int bno);

}
