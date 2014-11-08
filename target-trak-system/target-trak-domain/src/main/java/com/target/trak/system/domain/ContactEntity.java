package com.target.trak.system.domain;

import java.io.Serializable;
import java.sql.Timestamp;

public class ContactEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private ContactTypeEntity contactType;
	private String title;
	private String firstName;
	private String lastName;
	private String middleInitial;
	private String suffix;
	private String telephoneNumber;
	private String emailAddress;
	private String lastUpdatedBy;
	private Timestamp lastUpdatedDate;
	private boolean activeAtCompany;
	private CompanyEntity company;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ContactTypeEntity getContactType() {
		return contactType;
	}

	public void setContactType(ContactTypeEntity contactType) {
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

	public Timestamp getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Timestamp lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public boolean isActiveAtCompany() {
		return activeAtCompany;
	}

	public void setActiveAtCompany(boolean activeAtCompany) {
		this.activeAtCompany = activeAtCompany;
	}

	public CompanyEntity getCompany() {
		return company;
	}

	public void setCompany(CompanyEntity company) {
		this.company = company;
	}

}
