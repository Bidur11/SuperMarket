package com.mum.market.user.domain;

public enum UserRole {
  USER("USER"),
  ADMIN("ADMIN");
	
	String role;

	public String getRole() {
		return role;
	}

	private UserRole(String role) {
		this.role = role;
	}
	
	
	
}
