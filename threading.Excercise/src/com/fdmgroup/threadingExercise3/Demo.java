package com.fdmgroup.threadingExercise3;

public class Demo {

	public static void main(String[] args) {
	
		AverageCalculator ac = new AverageCalculator();
		
		
		FileReaderThread fr = new FileReaderThread(ac, "TestRecords.txt");
		
		fr.start();
		
		try {
			fr.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
		System.out.println(ac.getCount());
		System.out.println(ac.getTotal());
		System.out.println(ac.calculateAverage());
	
		
		
	}

}
