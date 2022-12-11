package runnableInterfaceImplementation;

public class Demo {

	//by invoking main I create the first thread
	public static void main(String[] args) throws InterruptedException{
		
		ClassImplementingRunnable t0 = new ClassImplementingRunnable();
		
		//I am instantiating the class thread from the java.util package with the parameter
		//of my class that implements the Runnable interface
		Thread thread0 = new Thread(t0);
		Thread thread1 = new Thread(t0);
		Thread thread2 = new Thread(t0);
		Thread thread3 = new Thread(()->{
			System.out.println("Running thread3");
		});
		
		thread0.start(); //second thread //new stack 2
		
		thread1.start(); //third thread //new stack 3
	
		thread1.join(10000); //this join forces stack 3 to stop doing work and just wait 5 seconds
		thread0.join(); //this join forces the work to stop on this stack
		
		thread3.start();
		
		System.out.println("Main thread is dead"); 
		//stack 1 --> no more work to do
		
		
		
		
		
		
		
	}
	
	
//	//Cat factory (okay)
//	Cat extends Animal implements Runnable{
//			
//		
//	}
//	//Not okay
//	cat extends Animal, Thread{
//		
//	}
	

}
