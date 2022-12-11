package com.fdmgroup.threadingExercises;

import java.util.ArrayList;
import java.util.List;

public class ThreadManager {
	
	protected List<Thread> threads;
	
	public ThreadManager() {
		super();
		threads = new ArrayList<>();
	}

	public void createThreads(int number) {
		
		Runnable myRunnable = new MyRunnable();
		
		for (int sequence=1 ; sequence<= number; sequence++) {
			
			Thread thread = new Thread(myRunnable, "thread" + sequence);
			threads.add(thread);
		}
	}
	
	public void runThreads() {
		
		threads.forEach(t -> t.start());		
	}
}
