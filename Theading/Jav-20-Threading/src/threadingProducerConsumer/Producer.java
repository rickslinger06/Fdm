package threadingProducerConsumer;

import java.util.Queue;

public class Producer {

	private Queue<Job> workQueue;
	private int maxSize;
	
	public Producer(Queue<Job> workQueue, int maxSize) {
		this.workQueue = workQueue;
		this.maxSize = maxSize;
	}
	
	public void addJobToWorkQueue(Job job) throws InterruptedException {
		// We use workQueue as our lock since it is shared with the consumer
		synchronized(workQueue) {
			if (workQueue.size() >= maxSize) {
				System.out.println("Waiting until notified");
				workQueue.wait();
			}
			workQueue.add(job);
			System.out.println("Job added to queue");
		}
	}
	
}
