package com.target.trak.system.business.dto.matter;

import java.util.Calendar;

import com.target.trak.system.business.dto.common.ContactDto;

public class MatterDto {

	private Long id;
	private MatterTypeDto matterType;
	private ContactDto primaryContact;
	private String status;
	private String createdBy;
	private Calendar createDate;
	private Calendar completionDate;
	private Calendar serviceLevelAgrementDate;
	private String lastUpdatedBy;
	private Calendar lastUpdatedDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public MatterTypeDto getMatterType() {
		return matterType;
	}

	public void setMatterType(MatterTypeDto matterType) {
		this.matterType = matterType;
	}

	public ContactDto getPrimaryContact() {
		return primaryContact;
	}

	public void setPrimaryContact(ContactDto primaryContact) {
		this.primaryContact = primaryContact;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Calendar getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Calendar createDate) {
		this.createDate = createDate;
	}

	public Calendar getCompletionDate() {
		return completionDate;
	}

	public void setCompletionDate(Calendar completionDate) {
		this.completionDate = completionDate;
	}

	public Calendar getServiceLevelAgrementDate() {
		return serviceLevelAgrementDate;
	}

	public void setServiceLevelAgrementDate(Calendar serviceLevelAgrementDate) {
		this.serviceLevelAgrementDate = serviceLevelAgrementDate;
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

}
