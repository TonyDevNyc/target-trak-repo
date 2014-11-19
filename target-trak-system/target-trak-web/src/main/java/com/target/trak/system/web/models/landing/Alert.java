package com.target.trak.system.web.models.landing;

public class Alert {

	private int alertId;
	private String alertType;
	private String alertDescription;
	
	public Alert(){}
	
	public Alert(int alertId, String alertType, String alertDescription) {
		this.alertId = alertId;
		this.alertType = alertType;
		this.alertDescription = alertDescription;
	}

	public int getAlertId() {
		return alertId;
	}

	public void setAlertId(int alertId) {
		this.alertId = alertId;
	}

	public String getAlertType() {
		return alertType;
	}

	public void setAlertType(String alertType) {
		this.alertType = alertType;
	}

	public String getAlertDescription() {
		return alertDescription;
	}

	public void setAlertDescription(String alertDescription) {
		this.alertDescription = alertDescription;
	}

}
