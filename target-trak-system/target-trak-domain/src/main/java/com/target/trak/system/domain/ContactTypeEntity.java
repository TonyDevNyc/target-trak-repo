package com.target.trak.system.domain;

import java.io.Serializable;

public class ContactTypeEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String contactTypeDescription;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContactTypeDescription() {
		return contactTypeDescription;
	}

	public void setContactTypeDescription(String contactTypeDescription) {
		this.contactTypeDescription = contactTypeDescription;
	}

}
