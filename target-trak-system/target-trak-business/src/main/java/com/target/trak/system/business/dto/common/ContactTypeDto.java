package com.target.trak.system.business.dto.common;

public class ContactTypeDto {

	private Long id;
	private String contactTypeDescription;

	public ContactTypeDto() {
	}

	public ContactTypeDto(Long id, String contactTypeDescription) {
		this.id = id;
		this.contactTypeDescription = contactTypeDescription;
	}

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
