package singleton;

public class Client {
	public static void main(String[] args) {
		if (SingletonClass.getInstance() == SingletonClass.getInstance())
			System.out.println("True");
	}
}
