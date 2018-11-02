package com.webingate.paysmartbusinessapp.driverapplication.Deo;

import com.google.gson.annotations.SerializedName;

public class DriverForgotpasswordResponse{

	@SerializedName("Passwordotp")
	private String passwordotp;

	public String getCode() {
		return Code;
	}

	public void setCode(String code) {
		Code = code;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}


	@SerializedName("Code")
	private String  Code;
	@SerializedName("Email")
	private String  Email;

	@SerializedName("Description")
	private String  Description;

	public void setPasswordotp(String passwordotp){
		this.passwordotp = passwordotp;
	}

	public String getPasswordotp(){
		return passwordotp;
	}
	public String getemail(){
		return Email;
	}

	@Override
 	public String toString(){
		return 
			"DriverForgotpasswordResponse{" + 
			"passwordotp = '" + passwordotp + '\'' +
		"Email = '" + Email + '\'' +
				"}";
		}
}