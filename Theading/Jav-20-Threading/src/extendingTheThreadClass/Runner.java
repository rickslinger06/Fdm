package extendingTheThreadClass;

public class Runner {

	public static void main(String[] args) {
		
		PrintNumbers p = new PrintNumbers();
		
		MyThread t1 = new MyThread("t1", p);
		MyThread t2 = new MyThread("t2", p);
		
		t1.start();
		t2.start();
		
		//your main method creates the main thread
		//when your main method finishes executing it will terminate.

	}

}
