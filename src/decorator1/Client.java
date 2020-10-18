package decorator1;

public class Client {
	public static void main(String[] args) {
		ConcreteComponent c = new ConcreteComponent();
		ConcreteDecoratorA d1 = new ConcreteDecoratorA();
		ConcreteDecoratorB d2 = new ConcreteDecoratorB();
		d1.add(c);
		d2.add(d1);
		d2.operation();
	}
}
