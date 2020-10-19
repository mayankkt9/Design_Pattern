package bridge;

public class LongViewConcrete extends ViewAbstract {

	public LongViewConcrete(ResourceAbstract resource) {
		super(resource);
	}

	public void show() {
		System.out.println(resource.getTitle() + " " + resource.getImage() + " " + resource.getSnippet() + " "
				+ resource.getUrl());

	}
}
