package net.daum.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import net.daum.vo.TestVO;

public interface TestRepository extends JpaRepository<TestVO, Integer> {

}
