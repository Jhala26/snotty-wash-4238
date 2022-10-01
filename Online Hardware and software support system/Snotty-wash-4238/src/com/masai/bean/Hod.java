package com.masai.bean;

public class Hod {

	private int hodId;
	private String hodName;
	private String hodUsername;
	private String hodPassword;
	
	
	public Hod() {
		
	}
	
	
	public Hod(int hodId, String hodName, String hodUsername, String hodPassword) {
		super();
		this.hodId = hodId;
		this.hodName = hodName;
		this.hodUsername = hodUsername;
		this.hodPassword = hodPassword;
	}


	public int getHodId() {
		return hodId;
	}


	public void setHodId(int hodId) {
		this.hodId = hodId;
	}


	public String getHodName() {
		return hodName;
	}


	public void setHodName(String hodName) {
		this.hodName = hodName;
	}


	public String getHodUsername() {
		return hodUsername;
	}


	public void setHodUsername(String hodUsername) {
		this.hodUsername = hodUsername;
	}


	public String getHodPassword() {
		return hodPassword;
	}


	public void setHodPassword(String hodPassword) {
		this.hodPassword = hodPassword;
	}


	@Override
	public String toString() {
		return "Hod [hodId=" + hodId + ", hodName=" + hodName + ", hodUsername=" + hodUsername + ", hodPassword="
				+ hodPassword + "]";
	}
	
	
	
	
	
	
	
	
	
}
