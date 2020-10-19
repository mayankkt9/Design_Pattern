package bridge;

public class BookResourceConcrete implements ResourceAbstract {

	@Override
	public String getSnippet() {
		return "Book Snippet";
	}

	@Override
	public String getImage() {
		return "Book Image";
	}

	@Override
	public String getTitle() {
		return "Book Title";
	}

	@Override
	public String getUrl() {
		return "Book URL";
	}

}
