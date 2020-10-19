package bridge;

public class ArtistResourceConcrete implements ResourceAbstract {

	@Override
	public String getSnippet() {
		return "Artist Snippet";
	}

	@Override
	public String getImage() {
		return "Artist Image";
	}

	@Override
	public String getTitle() {
		return "Artist Title";
	}

	@Override
	public String getUrl() {
		return "Artist URL";
	}

}
