package extendingTheThreadClass;

public class MyThread extends Thread {
	
	//attributes
	private String threadName;
	private PrintNumbers p;
	
	//2 constructors
	public MyThread() {
		
	}
	
	public MyThread(String threadName, PrintNumbers p) {
		super();
		this.threadName = threadName;
		this.p = p;	
	}

	public String getThreadName() {
		return threadName;
	}

	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}

	public PrintNumbers getP() {
		return p;
	}

	public void setP(PrintNumbers p) {
		this.p = p;
	}
	
	//I need to provide the run method implementation
	public void run() {
		System.out.println("Thread" + threadName + " has been started");
		p.printCountDown();
		System.out.println("Thread" + threadName + " has finished");
		
	}

}
