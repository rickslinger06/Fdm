package com.fdmgroup.threadingExercises.exercise3;

public class Runner {

	public static void main(String[] args) {
		
		/*
		 * DATA FILES NEED TO BE CREATED AT LOCATION RELATIVE TO YOUR FILE SYSTEM...
		 */

		
//		AverageCalculator averageCalculator = new AverageCalculator();
//	
//		String fileName = "./Testrecords.txt";
//		
//		FileReaderThread fileReaderThread = new FileReaderThread(averageCalculator, fileName);		
//		fileReaderThread.start();
//		
//		try {
//			fileReaderThread.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println(averageCalculator);
		
		AverageCalculator averageCalculator = new AverageCalculator();
		
		Thread currentTotalThread = 
				new Thread(() -> { 				
						while(true) {
							System.out.println(averageCalculator);
							try {
								Thread.sleep(100);
							} catch (InterruptedException e) {
								break;
							}					
						}
					});

		String records1 = "./records1.txt";		
		FileReaderThread fileReaderThread1 = new FileReaderThread(averageCalculator, records1);				

		String records2 = "./records2.txt";
		FileReaderThread fileReaderThread2 = new FileReaderThread(averageCalculator, records2);
		
		fileReaderThread1.start();
		fileReaderThread2.start();
		currentTotalThread.start();
		
		try {
			fileReaderThread1.join();
			fileReaderThread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\nCalculations completed...");
		System.out.println(averageCalculator);
		
		currentTotalThread.interrupt();
	}
}
