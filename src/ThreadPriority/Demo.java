package ThreadPriority;

public class Demo extends Thread{

	public void run() {
		
		for(int x =0; x < 10; x++) {
			System.out.println(x);
		}
		
	}
	
	public static void main(String[] args) {
		
		Thread t = new Thread();
		
		t.start();
		
		t.setPriority(9);
		for(int x =0; x < 10; x++) {
			System.out.println(x);
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		
	}

}
