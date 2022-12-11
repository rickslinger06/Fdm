package threadingProducerConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class Demo {

	public static void main(String[] args) {
		
		Queue<Job> jobsQueue = new LinkedList<Job>();
		jobsQueue.add(new Job());
		jobsQueue.add(new Job());
		int maxSize = 2;	
		Producer producer = new Producer(jobsQueue, maxSize);
		Consumer consumer = new Consumer(jobsQueue, maxSize);
	
		ProducerRunnable producerRunnable = new ProducerRunnable(producer);
		ProducerRunnable producerRunnable2 = new ProducerRunnable(producer);
		ConsumerRunnable consumerRunnable = new ConsumerRunnable(consumer);
		
		Thread thread0 = new Thread(producerRunnable);
		Thread thread1 = new Thread(consumerRunnable);
		Thread thread2 = new Thread(producerRunnable2);
		
		thread0.start();
		thread1.start();
		thread2.start();
		
	}
	
}
