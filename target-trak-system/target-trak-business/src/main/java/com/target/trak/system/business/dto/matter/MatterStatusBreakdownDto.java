package com.target.trak.system.business.dto.matter;

public class MatterStatusBreakdownDto {

	private int count;
	private String status;

	public MatterStatusBreakdownDto() {
	}

	public MatterStatusBreakdownDto(int count, String status) {
		this.count = count;
		this.status = status;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
