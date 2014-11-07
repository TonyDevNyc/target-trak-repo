package com.target.trak.system.domain.matters;

import java.io.Serializable;
import java.sql.Timestamp;

import com.target.trak.system.domain.ContactEntity;

public class MatterEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private MatterTypeEntity matterType;
	private ContactEntity primaryContact;
	private String status;
	private Timestamp createDate;
	private Timestamp completionDate;
	private Timestamp serviceLevelAgrementDate;
	private String lastUpdatedBy;
	private Timestamp lastUpdatedDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public MatterTypeEntity getMatterType() {
		return matterType;
	}

	public void setMatterType(MatterTypeEntity matterType) {
		this.matterType = matterType;
	}

	public ContactEntity getPrimaryContact() {
		return primaryContact;
	}

	public void setPrimaryContact(ContactEntity primaryContact) {
		this.primaryContact = primaryContact;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Timestamp getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public Timestamp getCompletionDate() {
		return completionDate;
	}

	public void setCompletionDate(Timestamp completionDate) {
		this.completionDate = completionDate;
	}

	public Timestamp getServiceLevelAgrementDate() {
		return serviceLevelAgrementDate;
	}

	public void setServiceLevelAgrementDate(Timestamp serviceLevelAgrementDate) {
		this.serviceLevelAgrementDate = serviceLevelAgrementDate;
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

}
