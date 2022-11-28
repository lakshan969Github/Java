package inheritance;

public class Student extends Person{
	
	private String StudentID;
	private	int Year;

	
	
	public Student(int nIC, String name, String city, String studentID, int year) {
		super(nIC, name, city);
		StudentID = studentID;
		Year = year;
	}



	public void display() {
		super.display();
		System.out.println("Student ID: " + this.StudentID);
		System.out.println("Student Year: " + this.Year);
		System.out.println();
	}
	
	
}
