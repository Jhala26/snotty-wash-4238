package com.masai.bean;

public class ComplainStatus {

	private int compId;
	private int engId;
	private String engName;
	private String engEmail;
	private String comType;
	private String comStatus;
	
	
	public ComplainStatus() {
		
	}


	public ComplainStatus(int compId, int engId, String engName, String engEmail, String comType, String comStatus) {
		super();
		this.compId = compId;
		this.engId = engId;
		this.engName = engName;
		this.engEmail = engEmail;
		this.comType = comType;
		this.comStatus = comStatus;
	}


	public int getCompId() {
		return compId;
	}


	public void setCompId(int compId) {
		this.compId = compId;
	}


	public int getEngId() {
		return engId;
	}


	public void setEngId(int engId) {
		this.engId = engId;
	}


	public String getEngName() {
		return engName;
	}


	public void setEngName(String engName) {
		this.engName = engName;
	}


	public String getEngEmail() {
		return engEmail;
	}


	public void setEngEmail(String engEmail) {
		this.engEmail = engEmail;
	}


	public String getComType() {
		return comType;
	}


	public void setComType(String comType) {
		this.comType = comType;
	}


	public String getComStatus() {
		return comStatus;
	}


	public void setComStatus(String comStatus) {
		this.comStatus = comStatus;
	}


	@Override
	public String toString() {
		return "ComplainStatus [compId=" + compId + ", engId=" + engId + ", engName=" + engName + ", engEmail="
				+ engEmail + ", comType=" + comType + ", comStatus=" + comStatus + "]";
	}
	
	
	
}
