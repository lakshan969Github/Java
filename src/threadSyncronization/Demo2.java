package threadSyncronization;

public class Demo2 extends Thread{
	
	private Thread t;
	private String threadName;
	Demo1 d;
	
	Demo2(String name,  Demo1 d){
		this.threadName = name;
		this.d = d;
	}
	
	public void run() {
		synchronized (d) {
			System.out.println("Called..!");
			d.printCount();
		}
		
		System.out.println("Tread " + threadName + " exiting.");
	}
	

}
