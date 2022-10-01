package com.masai.bean;

public class Engineer {
	
	private int engId;
	private String engName;
	private String engUsername;
	private String engPassword;
	private String category;
	
	
	public Engineer() {
		
	}


	public Engineer(String engName, String engUsername, String engPassword, String category) {
		super();
		
		this.engName = engName;
		this.engUsername = engUsername;
		this.engPassword = engPassword;
		this.category = category;
	}
	
	

	public Engineer(int engId, String engName, String engUsername, String engPassword, String category) {
		super();
		this.engId = engId;
		this.engName = engName;
		this.engUsername = engUsername;
		this.engPassword = engPassword;
		this.category = category;
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


	public String getEngUsername() {
		return engUsername;
	}


	public void setEngUsername(String engUsername) {
		this.engUsername = engUsername;
	}


	public String getEngPassword() {
		return engPassword;
	}


	public void setEngPassword(String engPassword) {
		this.engPassword = engPassword;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	@Override
	public String toString() {
		return "Engineer [engName=" + engName + ", engUsername=" + engUsername + ", engPassword="
				+ engPassword + ", category=" + category + "]";
	}
	
	

}
