package com.fdmGroup.Exception.Handling;

import java.io.IOException;
import java.sql.SQLException;

public class CustomException{
	
	//Exceptions====================================================================================
	
	public int divide (int first , int second) throws DividebyZeroException  {
		if(second == 0) {
			throw new DividebyZeroException("You cannot have 0 divisor");	
		
		}
		
		int result = first / second;
		return result;
		
	}

	
	public double SquareRootOfANumber(double number) throws ResultIsNegativeException {
		double result = Math.sqrt(number);
		if(result < 0) {
			throw new ResultIsNegativeException("You cannot have a negative Result");
			
			
		}
		return result;
		
	}
	
	
	public int CheckingPositiveNumber(int number) throws Exception {
		if(number > 0) {
			throw new SQLException("The number is Positive");
		}else if(number < 0) {
			throw new IOException("The number is Negative");
		}else if(number == 0) {
			System.out.println("The number is Zero");
		}
		return number;
	}
	
	
	//Exceptions====================================================================================
	
	
	public class ResultIsNegativeException extends Exception{
		private static final long serialVersionUID = 1L;

		public ResultIsNegativeException(String message) {
			super(message);
		}
	}
	
	
	public class DividebyZeroException extends Exception{
		private static final long serialVersionUID = 1L;

		public DividebyZeroException(String message) {
			super(message);
		}
	}
	

}
