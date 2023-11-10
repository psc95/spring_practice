package net.daum.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.daum.vo.TestBoardVO;

@Repository
public class TestBoardDAOImpl implements TestBoardDAO {
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public void updateBhitById(int bno) {
		this.sqlSession.update("updateBhitById", bno);
	}

	@Override
	public TestBoardVO getBoardById(int bno) {
		return this.sqlSession.selectOne("getBoardById", bno);
	}
}
