package collections;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>();
//		assign values using add
		arr.add(20);
		arr.add(10);
		System.out.println(arr);
		arr.add(0,30);
		arr.add(2,50);
		System.out.println(arr);
		
//		check some values inside array using contains
		if(arr.contains(100) == true) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
//		display array value
		System.out.println(arr.get(0));
		
//		change array value
		arr.set(3, 90);
		System.out.println(arr);
		
//		remove value from array
		arr.remove(3);
		System.out.println(arr);
		
		System.out.println(arr.size());
		
		arr.add(90);
		arr.add(100);
		
		System.out.println(arr);
		
//		print array all values method-01
		for(int x = 0; x < arr.size(); x++) {
			System.out.println(arr.get(x));
		}
		
		System.out.println("==================");
		
//		print array all values method-02
		for(Integer x:arr) {
			System.out.println(x);
		}
		

		System.out.println("==================");
		
//		print array all values method-03
		arr.forEach(x -> System.out.println(x));

		System.out.println("==================");
		
		
	}

}
