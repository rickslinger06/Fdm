package com.fdmgroup.inheritance;

public abstract class UserAccount {
	
	private String username;
	private String password;
	private String fullName;
	
	public UserAccount(String username, String password, String fullName) {
		super();
		this.username = username;
		this.password = password;
		this.fullName = fullName;
	}
	
	
	public abstract void accessWebite();
	
	public boolean changePassword(String newPass, String ConfirmPass){
		if(newPass.equals(ConfirmPass)) {
			System.out.println("Password has been changed");
			return true;
			
		}
		System.out.println("Password doesn't match try again");
		return false;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}


	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	
	
	
	
	
	
	

}
