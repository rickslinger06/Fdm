package com.fdmgroup.threadingExercises;

public class Runner {

	public static void main(String[] args) {

		ThreadManager threadManager = new ThreadManager();
		threadManager.createThreads(5);
		threadManager.runThreads();
		
		ThreadManagerChild threadManagerChild = new ThreadManagerChild();
		threadManagerChild.createThreads(9);
		threadManagerChild.runThreads();
	}

}
