package singleton;

public class SingletonClass {

	private static SingletonClass _instance;

	private SingletonClass() {

	}

	public static SingletonClass getInstance() {
		if (_instance == null)
			_instance = new SingletonClass();
		return _instance;
	}
}
