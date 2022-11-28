package collections;

import java.util.TreeSet;

//Hashset can not add duplication values
//There are assending order (sorted)

public class TreeSets {

	public static void main(String[] args) {
		
		TreeSet <String> ts = new TreeSet<>();
		
		ts.add("BMW");
		ts.add("Lexcus");
		ts.add("Masaratti");
		ts.add("Hyhundai");
		ts.add("BMW");
		ts.add("Lexcus");
		
		ts.forEach(x -> System.out.println(x));
		
	}

}
