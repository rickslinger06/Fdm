package threadsOnTheFly;

public class Counter {
	
	private int counter;
	
	public void increment() {
		counter++;
	}
	
	public void decrement() {
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
