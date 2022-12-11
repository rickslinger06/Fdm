package com.fdm.project;

import java.util.ArrayList;

public class Loops {

	public static void main(String[] args) {
	
		//Section 1 – For Each loops
		//Array of courses
		
		String [] courses = {"UNIX","SQL","Java","Python","Web Apps"};
		
		for(String i : courses) {
			System.out.println("I love learning " + i);
			
		}
		
		//Copying to an ArrayList
		
		ArrayList<String> courseList = new ArrayList<>();
		for(String i : courses) {
			courseList.add(i);
			System.out.println(i);
			
		}
		
		ArrayList<Double> prices = new ArrayList<>();
		prices.add(4.50);
		prices.add(1.99);
		prices.add(9.75);
		prices.add(3.15);
		prices.add(10.25);
		
		double totalPrices = 0;
		for(double i : prices) {
			totalPrices += i;	
		}
		System.out.println(totalPrices);
		
		Double [] pricesArray = prices.toArray(new Double[0]);
		
		for(double i : pricesArray) {
			System.out.println(i);
			
			
		}
		
		//fib
		
		int num1 = 0;
		int num2 = 1;

		int counter = 0;
		
		while (counter < 10) {
			System.out.print(num1 +  " ");
			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			counter += 1;
			
		}
		


	}

}
