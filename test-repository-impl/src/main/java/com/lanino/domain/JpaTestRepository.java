package com.lanino.domain;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@Remote(TestRepository.class)
public class JpaTestRepository implements TestRepository {

	@PersistenceContext(unitName = "suitairPU")
	private EntityManager entityManager;

	public List<TestDTO> findAll() {
		List<TestDTO> r = new ArrayList<TestDTO>();
		// Test t = new Test();
		r.add(new TestDTO("N1", "D1"));
		r.add(new TestDTO("N2", "D2"));
		return r;
	}

}
