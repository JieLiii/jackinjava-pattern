package singleton;

/**
 * 饿汉式
 *
 * @author LiJie on 2019/8/14
 */
public class SingletonForHanger {
    private static SingletonForHanger singleton = new SingletonForHanger();

    private SingletonForHanger() {
    }

    public static SingletonForHanger getInstance(){
        return singleton;
    }
}
