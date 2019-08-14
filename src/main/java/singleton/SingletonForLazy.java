package singleton;

/**
 * 懒汉式 线程不安全
 *
 * @author LiJie on 2019/8/13
 */
public class SingletonForLazy {
    private static SingletonForLazy singleton;

    private SingletonForLazy() {
    }

    public static SingletonForLazy getInstance(){
        if(singleton == null){
            singleton = new SingletonForLazy();
        }
        return singleton;
    }
}
