package com.fdmgroup.methods;


import java.util.Arrays;


public class Method_module {

	public static void main(String[] args) {

		int points = getPoints("red");
		System.out.println("You've scored " + points + " points!");

		sumOfNumbersUpTo(1000);

		System.out.println(validAccountNumber(1011111));

		System.out.println(reversedString("desrever neeb sah txet siht"));
		
		fibonacci(10);
		
		displayTimesTable(2);
		
		printRectangle(5);
		printTrinagle(6);
		
		System.out.println(leapYear(2000));
		
		String [] stringColors = {"green","blue","yellow"};
		System.out.println(arrayContains(stringColors,"yellow"));
		
		int [] arrayOfNUms = {1,2,3,4,2,4,3,2,};
		System.out.println(arrayFrequency(arrayOfNUms,2));
		
		int [] arrayOfNumbers = {1,2,3,4,2,4,3,2,8};
		System.out.println(highestNumber(arrayOfNumbers));
	
		
		
	}

	// Section 1 – Modularising previous exercises

	public static int getPoints(String colour) {

		if (colour.equals("green")) {
			return 5;
		} else if (colour.equals("yellow")) {
			return 10;
		} else if (colour.equals("red")) {
			return 15;
		} else {
			return 0;
		}
	}

	// 1.2 Summing numbers

	public static void sumOfNumbersUpTo(int longNumber) {

		long sumOfthousand = 0;
		for (int i = 0; i < longNumber + 1; i++) {
			sumOfthousand += i;
		}
		System.out.println(sumOfthousand);

	}

	public static boolean validAccountNumber(int accountNumber) {

		if (accountNumber >= 10000000 && accountNumber <= 99999999) {
			return true;
		} else {
			return false;

		}
	}

	// 1.4 Reversing a String

	public static String reversedString(String textString) {

//			String textString = "desrever neeb sah txet siht";
		char[] charString = textString.toCharArray();

		String reversed = "";

		for (char i : charString) {
			reversed = i + reversed;

		}
		return reversed;

	}
	
	public static void fibonacci(int N) {
		
		int num1 = 0;
		int num2 = 1;
		
		int counter = 0 ;
		
		while(counter < N) {
			System.out.print(num1 + " ");
			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			counter+=1;
			
		}
		System.out.println();
	}
	
	//Section 2 – Void methods TImeTable
	
	public static void displayTimesTable(int num) {
		
		for(int i = 1; i < 11 ; i ++ ) {
			System.out.println(i +"x"+ num + "=" + i* num);
		
	}
		
	}
	
	
	
	
	//Section 2 – Void methods 2.2 Print rectangle 
	public static void printRectangle(int num) {
		
		for(int i = 0; i <num ; i++) {
			System.out.print("X");
			for(int j = 1; j < num ; j++) {
				System.out.print("X");
				
			}
			System.out.println();
		}
	}
	
	//2.3 Print triangle
	
	public static void printTrinagle(int lines) {
			
			for(int i = 0 ; i < lines; i++) {
				System.out.print("$");
				for(int j = 1 ; j < i+1 ; j++ ) {
					System.out.print("#");
					
				}
				System.out.println();
				
			}
		}
	
	public static boolean leapYear(int year) {
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ) {
			return true;
			
		}else {
			return false;
		}
	}
	
	//3.2 Array contains
	
	public static boolean arrayContains(String [] stringArray, String str) {
		 for(String i : stringArray){
			 if(i.contains(str)) {
				 return true; 
			 }
		}
		return false;
	}
	
	//3.3 Array frequency
	
	public static int arrayFrequency(int [] intArray, int num){
		int count = 0;
		for(int i : intArray) {
			if(i == num) {
				count +=1;		
			}		
		}
		return count;
	
		
	}
	
	//3.4 Highest number
	
	public static int highestNumber(int [] arraynum) {
		Arrays.sort(arraynum);
		
		int highestNumPositon = arraynum.length - 1;
		int maximumNum = arraynum[highestNumPositon];
		return maximumNum;
		
	}
	
	
		
		
	
	
}	
