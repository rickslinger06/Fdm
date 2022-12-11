package com.fdmgroup.inheritance;

public class Customer extends UserAccount{

	public Customer(String username, String password, String fullName) {
		super(username, password, fullName);
		
	}

	@Override
	public void accessWebite() {
		System.out.println("accessing website as customer");
		
	}

}
