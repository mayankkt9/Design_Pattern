package decorator1;

public class ConcreteDecoratorB extends Decorator {
	@Override
	public void operation() {
		super.operation();
		System.out.println("Concrete Decorator B Operation");
	}
}
