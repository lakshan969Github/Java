package interfaces;

public abstract class ShapeArea implements ICalculator{
	
	private String shapeName;

	public ShapeArea(String shapeName) {
		super();
		this.shapeName = shapeName;
	}
	
	public abstract double getCal();
	
	public void display() {
		System.out.println("Shape Name: " + this.shapeName);
		System.out.println("Area: " + this.getCal());
		System.out.println();
	}
	
}
