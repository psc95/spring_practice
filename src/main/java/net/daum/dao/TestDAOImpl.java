package net.daum.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.daum.vo.TestVO;

@Repository
public class TestDAOImpl implements TestDAO {
	
	@Autowired
	private SqlSession sqlSession; //mybatis 쿼리문 수행 sqlSession
	
	@Autowired
	private TestRepository testRepo; //JPA 의존성 주입(DI)

	@Override
	public void insertTest01(TestVO tv) {
//		this.sqlSession.insert("t_in", tv); //mybatis로 저장하는 방법
		
		System.out.println("\n ===================> JPA로 tbl_test7테이블에 레코드 저장 연습");
		this.testRepo.save(tv);
	}
}
