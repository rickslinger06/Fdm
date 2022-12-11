package com.fdm.TrhreadingExcercise;

public class Runner {

	public static void main(String[] args) {
	
//		ThreadManager tm = new ThreadManager();
		
//		tm.createThreads(5);
//		
//		tm.runThreads();
	
		
		ThreadManagerChild tmc = new ThreadManagerChild();
		tmc.createThreads(10);
		tmc.runThreads();
		

	}

}
