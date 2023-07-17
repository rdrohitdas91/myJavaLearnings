package com.citibank.domain;

public class Login {
	private String loginId;
	private String password;
	private String username;
	
	public Login() {
		// TODO Auto-generated constructor stub
	}

	public Login(String loginId, String password, String username) {
		super();
		this.loginId = loginId;
		this.password = password;
		this.username = username;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "Login [loginId=" + loginId + ", password=" + password + ", username=" + username + "]";
	}
	

}
