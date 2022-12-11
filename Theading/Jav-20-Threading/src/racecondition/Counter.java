package racecondition;

public class Counter {
	private int count;

	//While a thread is accessing a synchronized method, no other threads
	//can access that method or any other synchronized methods in the SAME OBJECT
	public synchronized void increment() {
		count++;
	}

	public synchronized void decrement() {
		count--;
	}

	public synchronized int getCount() {
		return count;
	}
}
