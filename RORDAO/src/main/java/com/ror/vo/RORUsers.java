package com.ror.vo;

import java.util.Map;

public class RORUsers {
	
	private Map<String, RORUser> rorUsers;
	
	public RORUsers() {
		
	}

	public RORUsers(Map<String, RORUser> rorUsers) {
		super();
		this.rorUsers = rorUsers;
	}

	public Map<String, RORUser> getRorUsers() {
		return rorUsers;
	}

	public void setRorUsers(Map<String, RORUser> rorUsers) {
		this.rorUsers = rorUsers;
	}

	@Override
	public String toString() {
		return "RORUsers [rorUsers=" + rorUsers + "]";
	}
	

}
