package com.fdmgroup.loops;

public class Fibonacci {

	public static void main(String[] args) {
		//3.3 Fibonacci sequence
		
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
