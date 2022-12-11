package com.fdmgroup.threadingExercise3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderThread extends Thread{
	
	private AverageCalculator averageCalculator;
	private String fileName;
	
	
	
	public FileReaderThread(AverageCalculator averageCalculator, String fileName) {
		super();
		this.averageCalculator = averageCalculator;
		this.fileName = fileName;
	}

	@Override
	public void run() {
		
		try(BufferedReader br =  new BufferedReader(new FileReader(fileName))) {
			
			while(br.ready()) {
				String line = br.readLine();
				String [] numArray = line.split(",");
				
				for(String i : numArray) {	
				averageCalculator.addToTotal(Integer.parseInt(i));
						
				}	
			}

		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e1) {
		
			e1.printStackTrace();
		}
		
		
		
	}

}
