package threadingProducerConsumer;

public class ConsumerRunnable implements Runnable {

	private Consumer consumer;
	
	public ConsumerRunnable(Consumer consumer) {
		this.consumer = consumer;
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				consumer.takeJobFromWorkQueue();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
