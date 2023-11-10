package net.daum.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import net.daum.dao.TestBoardDAO;
import net.daum.vo.TestBoardVO;

@Service
@RequiredArgsConstructor
public class TestBoardServiceImpl implements TestBoardService {
	
	private final TestBoardDAO testBoardDAO;

    @Transactional
    @Override
    public TestBoardVO getBoardById(int bno) {
        //조회수증가
        testBoardDAO.updateBhitById(bno);
        //게시판VO
        return testBoardDAO.getBoardById(bno);
    }
}
