package abstractfactory1;

public class RoundedShapeFactory extends AbstractFactory {

	@Override
	Shape getShape(String shapeType) {
		if (shapeType.equals("RoundRectangle"))
			return new RoundedRectangle();
		if (shapeType.equals("RoundSquare"))
			return new RoundedSquare();
		return null;
	}

}
