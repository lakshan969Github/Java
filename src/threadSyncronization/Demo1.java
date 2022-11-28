package threadSyncronization;

public class Demo1 {

	public void printCount() {
		try {
			for(int x = 1; x < 5; x++) {
				System.out.println("Counter: " + x);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
