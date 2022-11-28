package generies;

public class Demo{
	
	public static void main(String[] args) {
		
		String [] arr = {"Max", "Alex", "Jonathan", "Rox"};
		
		Test<String> aObj = new Test();
		aObj.method(arr);
		
	}

}

class Test<T>{
	
	void method(T [] arr) {
		
		for(int x = 0; x < arr.length; x++) {
			System.out.print(arr[x]+" , ");
		}	
		
	}
	
}