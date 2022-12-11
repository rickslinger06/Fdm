package com.fdmgroup.inheritance;

public class AdminUser extends UserAccount{

	public AdminUser(String username, String password, String fullName) {
		super(username, password, fullName);
		
	}

	@Override
	public void accessWebite() {
		System.out.println("accessing website with admin rights");
		
	}

}
