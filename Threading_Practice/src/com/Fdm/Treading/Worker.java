package com.Fdm.Treading;

public class Worker extends Thread{

	Sequence sequence = null;
	
	public Worker(Sequence sequence) {
		this.sequence = sequence;
	
	}
	
	public void run() {
		for(int i = 0; i<50; i++) {
			System.out.println(Thread.currentThread().getName() + "got value:" + sequence.getnext());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			}
		}
}	
