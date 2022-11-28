package threadSyncronization;

public class DemoMain {

	public static void main(String[] args) {
		
		Demo1 d1 = new Demo1();
		
		Demo2 obj1 = new Demo2("Thread 01", d1);
		Demo2 obj2 = new Demo2("Thread 02", d1);

		obj1.start();
		obj2.start();
	}
	

}
