package com.target.trak.system.domain.matters;

import java.io.Serializable;

public class MatterTypeEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String matterTypeDescription;

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
