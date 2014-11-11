package com.target.trak.system.business.dto.common;

import java.util.Calendar;

public class ContactDto {

	private Long id;
	private ContactTypeDto contactType;
	private String title;
	private String firstName;
	private String lastName;
	private String middleInitial;
	private String suffix;
	private String telephoneNumber;
	private String emailAddress;
	private String lastUpdatedBy;
	private Calendar lastUpdatedDate;
	private Boolean activeAtCompany;
	private CompanyDto company;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ContactTypeDto getContactType() {
		return contactType;
	}

	public void setContactType(ContactTypeDto contactType) {
		this.contactType = contactType;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleInitial() {
		return middleInitial;
	}

	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public Calendar getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Calendar lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public Boolean isActiveAtCompany() {
		return activeAtCompany;
	}

	public void setActiveAtCompany(Boolean activeAtCompany) {
		this.activeAtCompany = activeAtCompany;
	}

	public CompanyDto getCompany() {
		return company;
	}

	public void setCompany(CompanyDto company) {
		this.company = company;
	}

}
