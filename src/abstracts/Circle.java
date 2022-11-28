package abstracts;

public class Circle extends ShapeArea{
	
	private double radius;

	public Circle(String shapeName, double radius) {
		super(shapeName);
		this.radius = radius;
	}
	
	public double calArea() {
		return ((3.142*this.radius)*2);
	}
	
}
