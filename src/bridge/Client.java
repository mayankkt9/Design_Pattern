package bridge;

public class Client {
	public static void main(String[] args) {

		ViewAbstract view1 = new LongViewConcrete(new ArtistResourceConcrete());
		view1.show();
		ViewAbstract view2 = new LongViewConcrete(new BookResourceConcrete());
		view2.show();
		ViewAbstract view3 = new PopUpViewConcrete(new BookResourceConcrete());
		view3.show();
		
	}
}
