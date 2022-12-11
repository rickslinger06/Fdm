package com.fdmgroup_polymorphism;

public class Customer extends UserAccount{
	
	private static int minAdminPasswordlength;
	
	
	public Customer(String username, String password, String fullName) {
		super(username, password, fullName);	
			
	}
	
	//Overriding the changepassword method passing length of password for customer class
		public boolean changePassword(String newPass, String ConfirmPass){
			char[] passwordArray = newPass.toCharArray();
			int passwordLength = passwordArray.length;
			
			if(newPass.equals(ConfirmPass) && passwordLength >= minAdminPasswordlength){
				System.out.println("Password has been changed");
				return true;
				
			}
			System.out.println("Password doesn't or length doesn't met the minimum length " + minAdminPasswordlength + " or more is required");
			return false;
		}

	@Override
	public void accessWebite() {
		System.out.println("accessing website as customer");
		
	}

	public static int getMinAdminPasswordlength() {
		return minAdminPasswordlength;
	}

	public static void setMinAdminPasswordlength(int minAdminPasswordlength) {
		Customer.minAdminPasswordlength = minAdminPasswordlength;
	}

}
