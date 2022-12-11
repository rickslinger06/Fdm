package runnableInterfaceImplementation;

public class ClassImplementingRunnable implements Runnable {
	
	int counter = 0;

	@Override
	public void run() {
		while (counter < 100000) {
		System.out.println(Thread.currentThread().getName() + " is being executed. The value of counter is:  " + counter);
		counter++;
		
		}
		
	}
	

}
