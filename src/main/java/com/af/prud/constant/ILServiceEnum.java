package com.af.prud.constant;

public enum ILServiceEnum {
	CLIENT_CREATE("assured"), AGENT_CREATE("agent"), NEW_BUISENESS("newBuisness");
	private String serviceName;

	public String getServiceName() {
		return this.serviceName;
	}

	ILServiceEnum(String selectProcess) {
		this.serviceName = selectProcess;
	}
}
