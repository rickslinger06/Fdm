package com.fdmgroup.Modules;

public class conditionals {

	public static void main(String[] args) {
		// Section 1 – Simple if statements 
		// Alien Colours //Alien colours 2 // //Alien colours 3
				
		String alienColour = "yellow";
		
		
		if(alienColour.equals("green")) {
			System.out.println("You just earned 5 points");
		}else if(alienColour.equals("yellow")) {
			System.out.println("You just earned 10 points");
		}else if(alienColour.equals("red")) {
			System.out.println("You just earned 15 points");	
		}else {
			System.out.println("invalid colour");
		}
		
		
		//Stages of life
		
		int age = 2; 
		
		if(age < 2) {
			System.out.println("Person is a Baby");
		}else if(age < 4){
			System.out.println("Person is a Toddler");	
		}else if(age < 13){
			System.out.println("Person is a Child");
		}else if(age < 20){
			System.out.println("Person is a Teenager");
		}else if(age < 65){
			System.out.println("Person is a adult");
		}else{
			System.out.println("Person is a pensioner");
		}
		
		//tax rate
		
		int salary = 100000;
		
		if(salary > 150000) {
			System.out.println("Tax rate is 45%");
			
		}else if(salary <= 150000 && salary > 50000) {
			System.out.println("Tax rate is 40%");
		}else if(salary <= 50000 && salary > 12500 ) {
			System.out.println("Tax rate is 40%");
		}else if(salary <=12500) {
			System.out.println("Tax rate is 0%");
		}
		
		
		//2.1 Valid account numbers
		
		int accountNumber = 12345678;
		
		
		if(accountNumber >= 10000000 && accountNumber <= 99999999) {
			System.out.println("valid account number");
		}else {
			System.out.println("Invalid account number");
		
		}
		
		//2.2 Airline codes 1
		
		String  flightCode = "gA";
		
		if(flightCode.equals("BA")) {
			System.out.println("Bristish Airway");
		}else if(flightCode.equals("LH")) {
			System.out.println("Lufthansa");
		}else if(flightCode.equals("FR")) {
			System.out.println("Ryanair");
		}
		
		// 2.3  Airline codes 2

		if(flightCode.equals("BA") || flightCode.equals("FR") || flightCode.equals("LH")){
			System.out.println("valid airline");
			
		}else {
			System.out.println("unrecognized or invalid airline");
		}
		
		//2.4 Airline codes 3
		
		String result = (flightCode.equals("BA") || flightCode.equals("FR") || flightCode.equals("LH")) ? 
				"valid flight code" : "unrecognized or invalid airline";
		System.out.println(result);
		
		
		
		//2.5 Valid ID
		
		
		boolean validPassport = true;
		boolean  validDrivingLicence = false;
		
		if(validPassport == true || validDrivingLicence == true){
			System.out.println("id verified");
			
		}else {
			System.out.println("unable to verify id");
		}
		
		//2.6 Older driver
		
		
		boolean hasLicense = true;
		boolean isDead = true;
		boolean hasPassedEyeTest = true;
		
		if(isDead && !hasLicense && !hasPassedEyeTest){
			System.out.println("not licensed to drive");
			
		}else {
			System.out.println("can still drive");
		}

		
		

		
		
	}	


	}


