package abstractfactory1;

public class Client {
	public static void main(String[] args) {
		AbstractFactory shapeFactory = new ShapeFactory();
		shapeFactory.getShape("Rectangle").draw();
		shapeFactory.getShape("Square").draw();
		AbstractFactory roundedShapeFactory = new RoundedShapeFactory();
		roundedShapeFactory.getShape("RoundRectangle").draw();
		roundedShapeFactory.getShape("RoundSquare").draw();

	}
}
