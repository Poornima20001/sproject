package com.sproject.sproject;

import java.time.LocalDateTime;

public class ResponseUserDTO {
	
	private String userName;
	private String email;
	private String mobileNo;
	public ResponseUserDTO() {
		
	}
	public ResponseUserDTO(String userName, String email, String mobileNo) {
		
		this.userName = userName;
		this.email = email;
		this.mobileNo = mobileNo;
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
	@Override
	public String toString() {
		return "ResponseUserDTO [userName=" + userName + ", email=" + email + ", mobileNo=" + mobileNo + "]";
	}
	
	
	
	
}
