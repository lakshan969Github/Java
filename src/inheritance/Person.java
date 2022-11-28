package inheritance;

public class Person {
	
	private int NIC;
	private String Name;
	private String City;
	
	public Person(int nIC, String name, String city) {
		super();
		NIC = nIC;
		Name = name;
		this.City = city;
	}
	
	public void display() {

		System.out.println("Person Name: " + this.NIC);
		System.out.println("Person Name: " + this.Name);
		System.out.println("Person Name: " + this.City);
		System.out.println();
	}
	
	

}
