package inheritance;

public class BScStudent extends Student{
	
	private String DegreeProgram;
	private int DegreeTime;
	public BScStudent(int nIC, String name, String city, String studentID, int year, String degreeProgram,
			int degreeTime) {
		super(nIC, name, city, studentID, year);
		DegreeProgram = degreeProgram;
		DegreeTime = degreeTime;
	}
	
	public void display() {
		super.display();
		System.out.println("DegreeProgram: " + this.DegreeProgram);
		System.out.println("Degree Length: " + this.DegreeTime);
		System.out.println();
	}

}
