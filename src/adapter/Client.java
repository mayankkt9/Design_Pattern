package adapter;

public class Client {
	public static void main(String[] args) {
		Shape shape = new RectangleAdapter(new Rectangle());
		shape.draw(0, 0, 2, 3);
	}
}
