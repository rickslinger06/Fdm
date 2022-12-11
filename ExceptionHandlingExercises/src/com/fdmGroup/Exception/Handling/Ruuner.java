package com.fdmGroup.Exception.Handling;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.fdmGroup.Exception.Handling.CustomException.DividebyZeroException;
import com.fdmGroup.Exception.Handling.CustomException.ResultIsNegativeException;

public class Ruuner {

	public static void main(String[] args) {
		
		//DividebyZeroException================================================
		CustomException c1 = new CustomException();
		try {
			System.out.println(c1.divide(4, 0));
			
		} catch (DividebyZeroException e) {
			
			e.printStackTrace();
		}
		//SquareRoot=============================================================
		CustomException squareRoot = new CustomException();
		try {
			System.out.println(squareRoot.SquareRootOfANumber(-1));
			
		} catch (ResultIsNegativeException e) {
			
			e.printStackTrace();
		}
	//===================================================================================================================
		try {
			c1.CheckingPositiveNumber(-1);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		// FileReading=====================================================
		FileReading readfile = new FileReading();
		try {
			readfile.openFile(null);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//====================================================5 .Examine the following code. Does the code compile and if so why?
	}}


