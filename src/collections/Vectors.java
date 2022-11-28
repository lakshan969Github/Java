package collections;

import java.util.Vector;

public class Vectors {

	public static void main(String[] args) {
		
		Vector <Integer> v = new Vector<>();
		
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		
		v.forEach(x -> System.out.println(x));
		
	}

}
