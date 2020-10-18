package decorator1;

public class Decorator extends Component {

	protected Component component;

	public void add(Component component) {
		this.component = component;
	}

	@Override
	public void operation() {
		if (component != null) {
			component.operation();
		}
	}

}
