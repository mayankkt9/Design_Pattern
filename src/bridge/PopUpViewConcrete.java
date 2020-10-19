package bridge;

public class PopUpViewConcrete extends ViewAbstract {

	public PopUpViewConcrete(ResourceAbstract resource) {
		super(resource);
	}

	public void show() {
		System.out.println(resource.getTitle());

	}
}