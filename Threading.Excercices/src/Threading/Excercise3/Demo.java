package Threading.Excercise3;



public class Demo {

	public static void main(String[] args) throws InterruptedException {
	
		AverageCalculator ac = new AverageCalculator();
		
		
		
		
		
		FileReaderThread fr = new FileReaderThread(ac, "TestRecords.txt");
		
		fr.start();
		fr.join();
		
		System.out.println(ac.getCount());
		System.out.println(ac.getTotal());
		System.out.println(ac.calculateAverage());
		
		
		
		
		//==================================
		
		
		Thread currentTotalthread = new Thread(() -> {
			
			while(true) {
				
				System.out.println(ac.calculateAverage());
				
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						break;
					}	
			}
			
		});
		
		
		FileReaderThread fr1 = new FileReaderThread(ac, "c:\\temp\\records1.txt");
		FileReaderThread fr2 = new FileReaderThread(ac, "c:\\temp\\records2.txt");
		
		System.out.println("Application has started:");
		
		fr1.start();
		fr2.start();
		currentTotalthread.start();
		fr1.join();
		fr2.join();
		System.out.println("=====================================================================");
		System.out.println(ac.getCount());
		System.out.println(ac.getTotal());
		System.out.println(ac.calculateAverage());
		
		

		currentTotalthread.interrupt();
////		
//		public void createThreads(int number) {
//
//
//			for (int i = 0; i < number; i++) {
//				Thread thread = new Thread(() -> {
//				System.out.println(Thread.currentThread().getName());
//					
//			}
//		
//
//		);
//		threads.add(thread);
//
//			}}
	}

}
