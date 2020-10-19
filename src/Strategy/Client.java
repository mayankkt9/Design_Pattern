package Strategy;

public class Client {
	public static void main(String[] args) {
		Duck d1 = new Duck(new FlyConcrete1(), new DisplayConcrete1(), new QuackConcrete1());
		d1.fly();
		d1.display();
		d1.quack();

		Duck d2 = new Duck(new FlyConcrete2(), new DisplayConcrete2(), new QuackConcrete2());
		d2.fly();
		d2.display();
		d2.quack();

	}
}
