package com.target.trak.system.business.dto.matter;

public class MatterTypeDto {

	private Long id;
	private String matterTypeDescription;

	public MatterTypeDto() {}
	
	public MatterTypeDto(Long id, String matterTypeDescription) {
		this.id = id;
		this.matterTypeDescription = matterTypeDescription;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMatterTypeDescription() {
		return matterTypeDescription;
	}

	public void setMatterTypeDescription(String matterTypeDescription) {
		this.matterTypeDescription = matterTypeDescription;
	}

}
