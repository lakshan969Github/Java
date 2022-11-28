package inheri;

public class Student extends Person{
	
	String StudentID;

	public Student(String studentID, String name, String city) {
		super(name, city);
		StudentID = studentID;
	}

	public String getStudentID() {
		return StudentID;
	}

	public void setStudentID(String studentID) {
		StudentID = studentID;
	}
	
	public void display() {
		System.out.println(getStudentID());
		super.display();
	}
	
}
