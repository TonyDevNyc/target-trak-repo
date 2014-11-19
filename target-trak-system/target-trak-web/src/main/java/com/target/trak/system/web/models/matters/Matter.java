package com.target.trak.system.web.models.matters;

public class Matter {

	private long matterId;
	private String matterType;
	private String primaryContactFirstName;
	private String primaryContactLastName;
	private String primaryContactCompany;
	private String matterStatus;
	private String createdByUserId;
	private String createDate;
	private String completionDate;
	private String serviceLevelAgreementDate;
	private String lastUpdatedBy;
	private String lastUpdatedDate;

	public long getMatterId() {
		return matterId;
	}

	public void setMatterId(long matterId) {
		this.matterId = matterId;
	}

	public String getMatterType() {
		return matterType;
	}

	public void setMatterType(String matterType) {
		this.matterType = matterType;
	}

	public String getPrimaryContactFirstName() {
		return primaryContactFirstName;
	}

	public void setPrimaryContactFirstName(String primaryContactFirstName) {
		this.primaryContactFirstName = primaryContactFirstName;
	}

	public String getPrimaryContactLastName() {
		return primaryContactLastName;
	}

	public void setPrimaryContactLastName(String primaryContactLastName) {
		this.primaryContactLastName = primaryContactLastName;
	}

	public String getPrimaryContactCompany() {
		return primaryContactCompany;
	}

	public void setPrimaryContactCompany(String primaryContactCompany) {
		this.primaryContactCompany = primaryContactCompany;
	}

	public String getMatterStatus() {
		return matterStatus;
	}

	public void setMatterStatus(String matterStatus) {
		this.matterStatus = matterStatus;
	}

	public String getCreatedByUserId() {
		return createdByUserId;
	}

	public void setCreatedByUserId(String createdByUserId) {
		this.createdByUserId = createdByUserId;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getCompletionDate() {
		return completionDate;
	}

	public void setCompletionDate(String completionDate) {
		this.completionDate = completionDate;
	}

	public String getServiceLevelAgreementDate() {
		return serviceLevelAgreementDate;
	}

	public void setServiceLevelAgreementDate(String serviceLevelAgreementDate) {
		this.serviceLevelAgreementDate = serviceLevelAgreementDate;
	}

	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public String getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(String lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

}
