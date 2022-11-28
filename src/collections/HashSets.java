package collections;

import java.util.HashSet;

//Hashset can not add duplication values
//There no assending order

public class HashSets {

	public static void main(String[] args) {
		
		HashSet <String> sh = new HashSet<>();
		
		sh.add("BMW");
		sh.add("Lexcus");
		sh.add("Masaratti");
		sh.add("Hyhundai");
		sh.add("BMW");
		sh.add("Lexcus");
		
		sh.forEach(x -> System.out.println(x));
		

	}

}
