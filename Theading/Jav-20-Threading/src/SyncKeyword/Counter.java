package SyncKeyword;

public class Counter {
	
	private int counter = 0;
	
	public synchronized void increment() {
		counter++;
	}
	
	public synchronized void decrement() {
		counter--;
	}
	
	public int getCount() {
		return counter;
	}

	@Override
	public String toString() {
		return "Counter [counter=" + counter + "]";
	}
	
	
	

}
