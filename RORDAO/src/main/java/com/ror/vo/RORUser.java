package com.ror.vo;

import java.util.Arrays;

public class RORUser {

	private String userID;
	private String userName;
	private char[] password;
	private String email;

	public RORUser() {

	}

	public RORUser(String userID, String userName, char[] password, String email) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.password = password;
		this.email = email;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "RORUser [userID=" + userID + ", userName=" + userName + ", password=" + Arrays.toString(password)
				+ ", email=" + email + "]";
	}

}
