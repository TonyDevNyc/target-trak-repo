package com.target.trak.system.business.dto;

import java.util.List;

public abstract class TargetTrakResponse {

	private List<TargetTrakError> errors;
	private boolean success;

	public List<TargetTrakError> getErrors() {
		return errors;
	}

	public void setErrors(List<TargetTrakError> errors) {
		this.errors = errors;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

}
