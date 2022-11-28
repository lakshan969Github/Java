//using thread joins we can control threads

//in this code executing sequentially

package ThreadYield;

public class Demo extends Thread{

	public void run() {
		Thread t = Thread.currentThread();
		
		System.out.println("Started executing: " + t.getName());
		
		for(int i = 0; i < 10; i++) {
			System.out.println(t.getName() + 1);
		}

		System.out.println("Started executing: " + t.getName());
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread t = new Thread(new Demo(),"New Thread");
		t.start();
		
		System.out.println("Started executing main thread");
		/**
		by yield currently running thread is terminated temporally 
		and give chance to newly created thread
		**/   
		t.yield(); 
		for(int x = 0; x < 10; x++) {
			System.out.println(Thread.currentThread().getName());
		}
		System.out.println("Finished executing" + Thread.currentThread().getName());
		
		
	}

}
