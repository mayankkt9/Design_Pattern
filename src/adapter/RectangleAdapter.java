package adapter;

public class RectangleAdapter implements Shape {

	Rectangle adaptee;

	public RectangleAdapter(Rectangle rectangle) {
		this.adaptee = rectangle;
	}

	@Override
	public void draw(int x1, int y1, int x2, int y2) {
		int x = Math.min(x1, x2);
		int y = Math.min(y1, y2);
		int width = Math.abs(x2 - x1);
		int height = Math.abs(y2 - y1);
		adaptee.draw(x, y, width, height);
	}

}
