package com.fdmgroup.threadingExercises.exercise3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderThread extends Thread {
	
	private AverageCalculator averageCalculator;
	private String fileName;
	
	public FileReaderThread(AverageCalculator averageCalculator, String fileName) {
		super();
		this.averageCalculator = averageCalculator;
		this.fileName = fileName;
	}
	
	@Override
	public void run() {
		
		try (FileReader fileReader = new FileReader(fileName);
				BufferedReader bufferedReader = new BufferedReader(fileReader);){
			String currentLine = bufferedReader.readLine();
			while (currentLine != null) {
				String[] numbersAsStrings = currentLine.split(",");
				for (String numStr : numbersAsStrings) {
					int num = Integer.parseInt(numStr);
					averageCalculator.addToTotal(num);
				}
				currentLine = bufferedReader.readLine();
			}			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	

}
