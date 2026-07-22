package com.sproject.sproject;

import java.time.LocalDateTime;

public class RequestUserDTO {
	private String userName;
	private String email;
	private String mobileNo;
	private String password;
	public RequestUserDTO() {
		
	}
	
	public RequestUserDTO(String userName, String email, String mobileNo, String password) {
	
		this.userName = userName;
		this.email = email;
		this.mobileNo = mobileNo;
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "RequestUserDTO [userName=" + userName + ", email=" + email + ", mobileNo=" + mobileNo + ", password="
				+ password + "]";
	}
	
	
	
}
