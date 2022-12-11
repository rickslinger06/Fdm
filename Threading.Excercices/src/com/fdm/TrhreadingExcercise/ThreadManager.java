package com.fdm.TrhreadingExcercise;


import java.util.ArrayList;
import java.util.List;

public class ThreadManager {
	
	protected List<Thread> threads = new ArrayList<>();



	public void createThreads(int number) {
		
		for(int i= 0; i < number ; i++) {
	
			Thread thread =  new Thread(new MyRunnable());
			
			threads.add(thread);
		}
		
		
	}
	
	public void runThreads() {
		
		threads.forEach(a -> a.start());
		
	}

}
