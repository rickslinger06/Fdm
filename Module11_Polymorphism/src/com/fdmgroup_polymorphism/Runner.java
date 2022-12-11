package com.fdmgroup_polymorphism;

public class Runner {

	public static void main(String[] args) {
		
		//creating admin/customer objects
		AdminUser adminUser1 = new AdminUser("JamesBond", "password12", "James Bond");
		AdminUser adminUser2 = new AdminUser("JohnWick", "password34", "John Wick");
		
		Customer cust1 = new Customer("MichaelJodan", "password56", "Michael Jordan");
		Customer cust2 = new Customer("KobeBryant", "password78", "Kobe Bryant");
		
		//Checking if the password matched
		adminUser1.changePassword("pass12", "pass12");
		
		cust1.changePassword("pass101", "pass101");
		
		
		//accesing website check
		adminUser1.accessWebite();
		cust1.accessWebite();
		
		//adding accounts to to UserAccount using Using Useraccount manager method addUser()
		UserAccountManager acctManager1 = new UserAccountManager();
		acctManager1.addUser(cust1);
		acctManager1.addUser(cust2);
		acctManager1.addUser(adminUser1);
		acctManager1.addUser(adminUser2);
		
		//checking if the user and and password existed and matched from Useraccounts list of account.	
		acctManager1.login("KobeBryant", "password78");
				
		//calling static method and setting password length setting to 10	
		AdminUser.setMinAdminPasswordlength(10);
		
		//testing if the password minimum requirement is met and matched
		adminUser2.changePassword("Test12345", "Test12345");
		
		//calling overloading method form adminUser class
		adminUser1.changePassword("Password12", "Password12", cust1);
		
		Customer.setMinAdminPasswordlength(7);
		
		//testing if the password minimum requirement is met and matched for customer
		cust1.changePassword("hard24", "hard24");
	}
	
	

}
