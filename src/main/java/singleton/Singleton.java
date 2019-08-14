package singleton;

/**
 * 饿汉式
 * 1.线程安全
 * 2.在类加载的时候就创建了一个实例
 */
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
