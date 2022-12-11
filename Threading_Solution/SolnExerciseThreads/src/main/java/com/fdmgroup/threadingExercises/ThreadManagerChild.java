package com.fdmgroup.threadingExercises;

public class ThreadManagerChild extends ThreadManager {
	
	@Override
	public void createThreads(int number) {
		
		for (int sequence=1 ; sequence<= number; sequence++) {
			
			Thread thread = new Thread(
					() -> System.out.println(Thread.currentThread().getName() + " is running"), 
					"thread" + sequence);
			threads.add(thread);
		}
	}

}
