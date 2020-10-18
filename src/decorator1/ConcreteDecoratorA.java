package decorator1;

public class ConcreteDecoratorA extends Decorator {

	@Override
	public void operation() {
		super.operation();
		System.out.println("Concrete Decorator A Operation");
	}

}
