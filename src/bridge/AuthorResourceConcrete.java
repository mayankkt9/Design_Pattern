package bridge;

public class AuthorResourceConcrete implements ResourceAbstract {

	@Override
	public String getSnippet() {
		return "Author Snippet";
	}

	@Override
	public String getImage() {
		return "Author Image";
	}

	@Override
	public String getTitle() {
		return "Author Title";
	}

	@Override
	public String getUrl() {
		return "Author URL";
	}

}
