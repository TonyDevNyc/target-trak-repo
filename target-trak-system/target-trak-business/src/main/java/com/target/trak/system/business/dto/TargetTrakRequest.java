package com.target.trak.system.business.dto;

public abstract class TargetTrakRequest {

	private RequestTypeEnum requestType;

	public RequestTypeEnum getRequestType() {
		return requestType;
	}

	public void setRequestType(RequestTypeEnum requestType) {
		this.requestType = requestType;
	}
}
