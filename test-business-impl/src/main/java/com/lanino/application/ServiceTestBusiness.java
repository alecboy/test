package com.lanino.application;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.lanino.domain.TestDTO;
import com.lanino.domain.TestRepository;

@Stateless
@Remote (TestBusiness.class)
public class ServiceTestBusiness implements TestBusiness {

    @EJB(lookup="ejb:test-repository/test-repository-impl//JpaTestRepository!com.lanino.domain.TestRepository")
	private TestRepository repository;
	
	public List<TestDTO> findAll() {
		List<TestDTO> r = repository.findAll();
		return r;
	}

}
