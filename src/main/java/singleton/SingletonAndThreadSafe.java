package singleton;

/**
 * 懒汉式 线程安全
 *
 * @author LiJie on 2019/8/14
 */
public class SingletonAndThreadSafe {
   private static SingletonAndThreadSafe singleton;

    private SingletonAndThreadSafe() {
    }

    public static synchronized SingletonAndThreadSafe getInstance(){
        if(singleton == null){
            singleton = new SingletonAndThreadSafe();
        }
        return singleton;
    }
}
