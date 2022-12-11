package extendingTheThreadClass;

public class PrintNumbers {
	
	public void printCountDown() {
		for(int i = 50; i> 0; i--) {
			System.out.println("The value of i is: " + i + "in the Thread" + Thread.currentThread().getName());	
		}
	}

}
