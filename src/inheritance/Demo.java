package inheritance;

import java.util.*;


public class Demo {

	public static void main(String[] args) {
		
		Person p = new Person(2001265412, "Lokesh Raj", "Mumbai");
		p.display();
		
		Student s = new Student(2001231232, "Alex Costa", "Colombo", "IT212342126", 2);
		s.display();
		
		BScStudent bsc = new BScStudent(2001231232, "Sadun Perea", "Kandy", "IT21232124", 3, "Software Engeniering", 4);
		bsc.display();
		

		MScStudent msc = new MScStudent(2001231123, "Jonathan Lucus", "NYC", "IT21232234", 3, "Data Science", 2);
		msc.display();
	}

}
