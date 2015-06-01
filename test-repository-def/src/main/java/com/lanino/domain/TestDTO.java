package com.lanino.domain;

import java.io.Serializable;

public class TestDTO implements Serializable {

	private static final long serialVersionUID = -1663411530059812935L;
	
	private Long id;
	private String name;
	private String description;

	public TestDTO(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	public TestDTO(Long id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
