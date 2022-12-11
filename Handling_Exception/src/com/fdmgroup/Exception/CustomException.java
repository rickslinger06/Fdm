package com.fdmgroup.Exception;

import java.io.IOException;
import java.sql.SQLException;


public class CustomException  {
	//=================================1=================================
	
	public int divide(int num1 , int num2) throws DivideByZeroException  {
		if(num2 ==0) {
		throw new DivideByZeroException ("You can not have 0 as divisor");
	}
		int result = num1/num2;
		return result;
	}
	//=================================2=================================
	
	public double SquareRoot(double number) throws ValueIsNegativeException{
		if(number < 0) {
			throw new ValueIsNegativeException("Number you Enter is is Negative number: Enter a whole number");	
			
		}
			double result = Math.sqrt(number);
		
		return result;
		
	}
	
	//=================================3=================================
	public int numberChecker(int number) throws Exception{
		if(number > 0) {
			throw new SQLException("The number is Positive");

		}else if (number < 0) {
			throw new IOException("The number is Negative");
			
		}else {
			System.out.println("Zero Value Passed in");
		}
		
		return number;		
}
	
	//=================================4========================================
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
