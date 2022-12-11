package com.fdmgroup.threadingExcercises;



public class ThreadManagerChild extends ThreadManager {

	@Override
	public void createThreads(int number) {


			for (int i = 0; i < number; i++) {
				Thread thread = new Thread(() -> {
				System.out.println(Thread.currentThread().getName());
					
			}
		

		);
		threads.add(thread);

			}}

}

//
//Thread thread = new Thread(() -> {
//	for(int count = 1; count < 100; count++) {
//		counter.increment();
//		System.out.println("The name of the thread is " + Thread.currentThread().getName() + counter);
//	}
//});
//
//thread.start();
