package com.target.trak.system.business.dto.matter;

import com.target.trak.system.business.dto.TargetTrakRequest;

public class MatterRequest extends TargetTrakRequest {

	private MatterDto matter;

	public MatterDto getMatter() {
		return matter;
	}

	public void setMatter(MatterDto matter) {
		this.matter = matter;
	}
	
	
}
