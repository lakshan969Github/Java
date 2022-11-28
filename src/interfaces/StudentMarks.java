package interfaces;

public class StudentMarks implements ICalculator{
	
	private String StudentName;
	private double mod1, mod2, mod3;
	public StudentMarks(String studentName, double mod1, double mod2, double mod3) {
		super();
		StudentName = studentName;
		this.mod1 = mod1;
		this.mod2 = mod2;
		this.mod3 = mod3;
	}
	
	public double calculate() {
		return ((mod1+mod2+mod3)/3);
	}
	
	public void display() {
		System.out.println("Student Name: " + this.StudentName);
		System.out.println("Average: " + this.calculate());
	}

}
