package composite;

import java.util.ArrayList;
import java.util.List;

public class DirectoryComposite implements Component {

	String directoryName;
	List<Component> component;

	public DirectoryComposite(String name) {
		this.directoryName = name;
		component = new ArrayList<>();
	}

	@Override
	public String getName() {
		return directoryName;
	}

	public void add(Component c) {
		component.add(c);
	}

	@Override
	public Long getSize() {
		long size = 0L;
		for (Component c : component) {
			size = size + c.getSize();
		}
		return size;
	}

}
