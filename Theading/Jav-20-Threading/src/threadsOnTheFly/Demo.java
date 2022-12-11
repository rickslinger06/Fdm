package threadsOnTheFly;

public class Demo {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		//this is a thread on the fly using a lambda.
		Thread thread = new Thread(() -> {
			for(int count = 1; count < 100; count++) {
				counter.increment();
				System.out.println("The name of the thread is " + Thread.currentThread().getName() + counter);
			}
		});
		
		thread.start();
		
		
		// function without name 
		
		//() -> {}
		//parenthesis: parameters
		//->
		//{} : work to be done
		
		
		
		

	}

}
