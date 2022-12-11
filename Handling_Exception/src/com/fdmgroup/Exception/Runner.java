package com.fdmgroup.Exception;

import java.io.File;
import java.io.FileNotFoundException;

public class Runner {

	public static void main(String[] args) {
		
CustomException a = new CustomException();
try {
	System.out.println(a.divide(8, 0));
} catch (DivideByZeroException e) {
	
	e.printStackTrace();
}

	try {
		System.out.println(a.SquareRoot(-1));
	} catch (ValueIsNegativeException e) {
		
		e.printStackTrace();
	}
	
	try {
		System.out.println(a.numberChecker(-1));
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	FileReading fr  = new FileReading();
	try {
		fr.openFile("/Users/rickstermuyco/eclipse-workspace/Handling_Exception/src/com/fdmgroup/Exception/sample.txt");
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	

	
	}

}
