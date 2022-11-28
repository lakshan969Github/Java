package factoryDesign;

interface Color{
	void fill();
}

class Red implements Color{
	
	public void fill() {
		System.out.println("Filled Red");
	}
	
}

class Blue implements Color{
	
	public void fill() {
		System.out.println("Filled Blue");
	}
	
}

class Green implements Color{
	
	public void fill() {
		System.out.println("Filled Green");
	}
	
}

interface Shape{
	void draw();
}

class Circle implements Shape{
	public void draw() {
		System.out.println("Call circle draw");
	}
}

class Rectangle implements Shape{
	public void draw() {
		System.out.println("Call Rectagle draw");
	}
}

class Square implements Shape{
	public void draw() {
		System.out.println("Call square draw");
	}
}

abstract class AbstractFactory{
	
	public abstract Color getColor(String type);
	public abstract Shape getShape(String type);
	
}

class FactoryProducer{
	public static AbstractFactory getFactory(String choice) {
		
		if(choice.equalsIgnoreCase("Shape")) {
			return new  ShapeFactory();
		}else if(choice.equalsIgnoreCase("Color")) {
			return new ColorFactory();
		}else {
			return null;
		}
		
	}
}

class ColorFactory extends AbstractFactory{
	
	public Color getColor(String color) {
		
		if(color.equalsIgnoreCase("Red")) {
			return new Red();
		}else if(color.equalsIgnoreCase("Green")) {
			return new Green();
		}else if(color.equalsIgnoreCase("Blue")) {
			return new Blue();
		}else {
			return null;
		}
		
	}
	
	public Shape getShape(String type) {
		return null;
	}
}

class ShapeFactory extends AbstractFactory{
	
	public Shape getShape(String shapeType) {
		
		if(shapeType == null) {
			return null;
		}else if(shapeType.equalsIgnoreCase("Circle")) {
			return new Circle();
		}else if(shapeType.equalsIgnoreCase("Rectagle")) {
			return new Rectangle();
		}else if(shapeType.equalsIgnoreCase("Square")) {
			return new Square();
		}else {
			return null;
		}
		
	}
	
	public Color getColor(String type) {
		return null;
	}
}

public class Demo {
	
	private static final String Shape ="Shape";
	private static final String Circle ="Circle";
	private static final String Rectagle ="Rectagle";
	private static final String Square ="Square";
	

	private static final String Color ="Color";
	private static final String Red ="Red";
	private static final String Green ="Green";
	private static final String Blue ="Blue";

	public static void main(String[] args) {
		
		AbstractFactory shapeFactory = FactoryProducer.getFactory(Shape);
		Shape shape = shapeFactory.getShape(Circle);
		shape.draw();
		
		FactoryProducer.getFactory(Shape).getShape(Rectagle).draw();
		FactoryProducer.getFactory(Shape).getShape(Square).draw();
		
		
		FactoryProducer.getFactory(Color).getColor(Red).fill();
		FactoryProducer.getFactory(Color).getColor(Green).fill();
		FactoryProducer.getFactory(Color).getColor(Blue).fill();

	}

}



