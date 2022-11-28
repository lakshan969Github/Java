package abstracts;

public abstract class ShapeArea {
	
	private String ShapeName;

	public ShapeArea(String shapeName) {
		super();
		ShapeName = shapeName;
	}
	
	public abstract double calArea();
	
	public void display() {
		System.out.println("Shape: " + this.ShapeName);
		System.out.println("Area: " + this.calArea());
		System.out.println();
	}
	
}
