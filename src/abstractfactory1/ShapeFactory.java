package abstractfactory1;

public class ShapeFactory extends AbstractFactory {

	@Override
	Shape getShape(String shapeType) {
		if (shapeType.equals("Rectangle"))
			return new Rectangle();
		if (shapeType.equals("Square"))
			return new Square();
		return null;
	}

}
