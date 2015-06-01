package com.lanino.infrastructure;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.lanino.domain.TestDTO;
import com.lanino.domain.TestRepository;

@Stateless
@Remote(TestRepository.class)
public class JpaTestRepository implements TestRepository {

	@PersistenceContext(unitName = "testPU")
	private EntityManager entityManager;

	public List<TestDTO> findAll() {
		List<TestDTO> r = new ArrayList<TestDTO>();
		r.add(new TestDTO("NAME1", "DESC1"));
		r.add(new TestDTO("NAME2", "DESC2"));
		r.add(new TestDTO("NAME3", "DESC3"));
		r.add(new TestDTO("NAME4", "DESC4"));
		return r;
	}

}
