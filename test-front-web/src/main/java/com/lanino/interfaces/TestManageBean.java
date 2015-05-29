package com.lanino.interfaces;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import com.lanino.application.TestBusiness;
import com.lanino.domain.TestDTO;
import com.lanino.infrastructure.ServiceLocator;

@ViewScoped
@Named(value = "testManageBean")
public class TestManageBean implements Serializable {

	private static final long serialVersionUID = 5175933203023836477L;

    //@EJB(lookup="ejb:test-business/test-business-impl//test-business-impl!com.lanino.application.TestBusiness")
	//@EJB(lookup="java:jboss/exported/test-business/test-business-impl/ServiceTestBusiness!com.lanino.application.TestBusiness")
	private TestBusiness business;
	
	@PostConstruct
    public void init() {
		business = (TestBusiness) ServiceLocator.get("ejb:test-business/test-business-impl//ServiceTestBusiness!com.lanino.application.TestBusiness");
    }
	
	public List<TestDTO> findAll() {
		List<TestDTO> r = business.findAll();
		return r;
	}
	
}
