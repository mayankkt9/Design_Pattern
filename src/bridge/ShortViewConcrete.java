package bridge;

public class ShortViewConcrete extends ViewAbstract {

	public ShortViewConcrete(ResourceAbstract resource) {
		super(resource);
	}

	public void show() {
		System.out.println(resource.getTitle() + " " + resource.getSnippet() + " " + resource.getUrl());

	}
}