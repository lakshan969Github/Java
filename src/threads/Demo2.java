package threads;


public class Demo2 implements Runnable{
	
	public void run() {
		
		for(int x = 0; x < 5; x++) {
			System.out.println("Child02: " + x);
		}
		
	}
	
}