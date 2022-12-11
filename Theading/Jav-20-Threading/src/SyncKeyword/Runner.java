package SyncKeyword;

public class Runner {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		
		
		Thread thread1 = new Thread(() -> {
				System.out.println("The value of i is: in the Thread" + Thread.currentThread().getName());
				counter.increment();

			
		});
		
		Thread thread2 = new Thread(() -> {
				System.out.println("The value of i is: in the Thread" + Thread.currentThread().getName());
				counter.decrement();	
		});
		
		thread1.start();
		thread2.start();
		
		System.out.println(counter);

		

		
		//your main method creates the main thread
		//when your main method finishes executing it will terminate.

	}

}
