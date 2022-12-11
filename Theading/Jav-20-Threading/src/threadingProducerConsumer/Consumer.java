package threadingProducerConsumer;

import java.util.Queue;

public class Consumer {

	private Queue<Job> workQueue;
	private int maxSize;
	
	public Consumer(Queue<Job> workQueue, int maxSize) {
		this.workQueue = workQueue;
		this.maxSize = maxSize;
	}
	
	public Job takeJobFromWorkQueue() {
		// We use workQueue as our lock since it is shared with the producer
		synchronized(workQueue) {
			Job job = workQueue.poll();
			System.out.println("Job retrieved from queue");
			if (workQueue.size() < maxSize) {
				System.out.println("Notifying other waiting threads");
				workQueue.notify();
			}
			return job;
		}
	}
	
}
