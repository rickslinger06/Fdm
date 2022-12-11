package com.fdmgroup_polymorphism;

public class AdminUser extends UserAccount{

	private static int minAdminPasswordlength;
	
	public AdminUser(String username, String password, String fullName) {
		super(username, password, fullName);
		
	}
	
	//Overload method passing 3 arguments
	public boolean changePassword(String newPass, String ConfirmPass, UserAccount user) {
			char[] passwordArray = newPass.toCharArray();
			int passwordLength = passwordArray.length;
			
			if(newPass.equals(ConfirmPass) && passwordLength >= minAdminPasswordlength){
				System.out.println(user.getFullName() +" Password has been changed ");
				return true;
				
			}
			System.out.println("Password doesn't or length doesn't met the minimum length");
			return false;
		
	}
	
	//Overriding the changepassword method passing length of password
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


	public static int getMinAdminPasswordlength() {
		return minAdminPasswordlength;
	}


	public static void setMinAdminPasswordlength(int minAdminPasswordlength) {
		AdminUser.minAdminPasswordlength = minAdminPasswordlength;
	}

	@Override
	public void accessWebite() {
		System.out.println("accessing website with admin rights");
		
	}

}
