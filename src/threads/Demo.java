package threads;

public class Demo extends Thread{

	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.start(); //start already have in thread class
		
		for(int x = 0; x < 5; x++) {
			System.out.println("Parent: " + x);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}
	
	//run method already have in thread class
	public void run() {
		
		Thread thread = new Thread(new Demo());
		thread.start();
		
		for(int x = 0; x < 5; x++) {
			System.out.println("Child: " + x);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
