package threadingProducerConsumer;

public class ProducerRunnable implements Runnable {

	private Producer producer;
	
	public ProducerRunnable(Producer producer) {
		this.producer = producer;
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				producer.addJobToWorkQueue(new Job());
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	
	
}
