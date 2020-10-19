package Strategy;

public class Duck {
	FlyBehaviour f;
	DisplayBehaviour d;
	QuackBehaviour q;

	public Duck(FlyBehaviour f, DisplayBehaviour d, QuackBehaviour q) {
		this.f = f;
		this.d = d;
		this.q = q;
	}

	public void fly() {
		f.fly();
	}

	public void display() {
		d.display();
	}

	public void quack() {
		q.quack();
	}
}
