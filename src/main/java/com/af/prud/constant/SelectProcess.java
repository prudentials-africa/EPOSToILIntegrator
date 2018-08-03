package com.af.prud.constant;

public enum SelectProcess {
	CLIENT_CREATE("assured"), AGENT_CREATE("agent"), NEW_BUISENESS("newBuisness");
	private String selectProcess;

	public String getSelectProcess() {
		return this.selectProcess;
	}

	SelectProcess(String selectProcess) {
		this.selectProcess = selectProcess;
	}
}
