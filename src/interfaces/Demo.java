package interfaces;

public class Demo {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle("Rectangle-01", 10, 20);
		r.calculate();
		r.display();
		
		StudentMarks s = new StudentMarks("Martin", 70, 50, 40);
		s.display();

	}

}
