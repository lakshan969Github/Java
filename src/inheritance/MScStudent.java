package inheritance;

public class MScStudent extends Student{

	private String DegreeProgram;
	private int DegreeTime;
	
	
	public MScStudent(int nIC, String name, String city, String studentID, int year, String degreeProgram,
			int degreeTime) {
		super(nIC, name, city, studentID, year);
		DegreeProgram = degreeProgram;
		DegreeTime = degreeTime;
	}


	public void display() {
		super.display();
		System.out.println("DegreeProgram: " + this.DegreeProgram);
		System.out.println("DegreeProgram: " + this.DegreeTime);
		System.out.println();
	}
}
