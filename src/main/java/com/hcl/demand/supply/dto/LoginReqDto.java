package com.hcl.demand.supply.dto;

import java.io.Serializable;


public class LoginReqDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String userName;

	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
