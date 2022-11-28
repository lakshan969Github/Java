package inheri;

public class demo {
	
	public static void main(String[] args) {
		Person p = new Person("Kamal", "Colombo");
		Student s = new Student("IT2123123", "Roshan", "Kandy");
		p.display();
		System.out.println("=========================");
		s.display();
	}
	
}
