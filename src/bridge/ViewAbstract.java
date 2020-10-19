package bridge;

public abstract class ViewAbstract {

	ResourceAbstract resource;

	public ViewAbstract(ResourceAbstract resource) {
		this.resource = resource;
	}

	public abstract void show();
}
