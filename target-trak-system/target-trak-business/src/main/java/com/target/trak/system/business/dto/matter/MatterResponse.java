package com.target.trak.system.business.dto.matter;

import java.util.List;

import com.target.trak.system.business.dto.TargetTrakResponse;

public class MatterResponse extends TargetTrakResponse {

	private int count;
	private MatterDto matter;
	private List<MatterDto> matters;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public MatterDto getMatter() {
		return matter;
	}

	public void setMatter(MatterDto matter) {
		this.matter = matter;
	}

	public List<MatterDto> getMatters() {
		return matters;
	}

	public void setMatters(List<MatterDto> matters) {
		this.matters = matters;
	}

}
