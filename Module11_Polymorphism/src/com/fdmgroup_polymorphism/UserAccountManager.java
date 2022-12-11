package com.fdmgroup_polymorphism;

import java.util.ArrayList;

public class UserAccountManager {
	
	private ArrayList<UserAccount> userAccounts  = new ArrayList<>();
	
	public void addUser(UserAccount user) {
		userAccounts.add(user);
		
}
	//looping from users account list if username and password is match with the account
	public boolean login(String username , String password) {		
		for(UserAccount user : userAccounts){
			if(user.getUsername().equals(username) && user.getPassword().equals(password)){
				System.out.println("password matched");
				return true;
				
			}
	
		}
		System.out.println("Account not found or password doesnt match");
		return false;
	}

	public ArrayList<UserAccount> getUserAccounts() {
		return userAccounts;
	}

	public void setUserAccounts(ArrayList<UserAccount> userAccounts) {
		this.userAccounts = userAccounts;
	}
}
