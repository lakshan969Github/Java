package templateDesign;

abstract class Template{
	
	final void template() {

		//executing order
		start();
		service();
		stop();
	}
	
	abstract void start();
	abstract void service();
	abstract void stop();
}

class MyLifeCycle extends Template {
	void start() {
		System.out.println("Started");
	}
	void service() {
		System.out.println("Service");
	}
	void stop() {
		System.out.println("Stoped");
	}
	
}


public class Demo {

	public static void main(String[] args) {
		
		
		Template temp = new MyLifeCycle();
		temp.template();

	}

}
