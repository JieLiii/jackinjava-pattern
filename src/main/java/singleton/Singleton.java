package singleton;

public class Singleton {

	private Singleton() {
	}

	private static class SingletonFactory{
		private static Singleton instance = new Singleton();
	}

	public static Singleton getInstance(){
		return SingletonFactory.instance;
	}

	public Object readRosolve(){
		return getInstance();
	}
}
