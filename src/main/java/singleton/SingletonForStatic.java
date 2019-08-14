package singleton;

/**
 * 静态内部类
 *
 * 需要实现 lazy loading 效果时，采用该种方法
 * INTANCE在类加载式不会初始化，因为内部类Singleton没有装载，只有在调用getInstance()方法时才会装载
 * @author LiJie on 2019/8/14
 */
public class SingletonForStatic {
    private static class Singleton {
        private static final SingletonForStatic INSTANCE = new SingletonForStatic();
    }

    private SingletonForStatic() {
    }

    public static final SingletonForStatic getInstance(){
        return Singleton.INSTANCE;
    }
}
