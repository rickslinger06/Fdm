package racecondition;

import racecondition.Counter;

public class RunnerRaceConditionDemo {
	public static void main(String[] args) {
		Counter counter = new Counter();

		Thread thread1 = new Thread(() -> {
			for (int count = 1; count <= 10; count++) {
				System.out.println("The counter is being incremented");
				System.out.println(counter.getCount());
				counter.increment();
			}

		});

		Thread thread2 = new Thread(() -> {
			for (int count = 1; count <= 10; count++) {
				System.out.println("The counter is being decremented");
				System.out.println(counter.getCount());
				counter.decrement();
			}

		});

		thread1.start();
		thread2.start();
			

//		try {
//			thread1.join();
//			thread2.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		System.out.println("The final value of counter is: " + counter.getCount());
	}

}
