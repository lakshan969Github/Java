package interfaces;

public class Rectangle extends ShapeArea implements ICalculator{
	
	private double length;
	private double width;
	public Rectangle(String shapeName, double length, double width) {
		super(shapeName);
		this.length = length;
		this.width = width;
	}
	
	public double calculate() {
		return (length * width);
	}
	
	double getArea = this.calculate();
	
	public double getCal() {
		return getArea;
	}
	
}
