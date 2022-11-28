package abstracts;

public class Reactangle extends ShapeArea{
	
	private double width;
	private double lenght;
	public Reactangle(String shapeName, double width, double lenght) {
		super(shapeName);
		this.width = width;
		this.lenght = lenght;
	}
	
	public double calArea() {
		return (this.lenght * this.width);
	}
	
}
