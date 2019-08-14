package singleton;

/**
 * 双重校验锁 double-checked locking
 *
 * 这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * @author LiJie on 2019/8/14
 */
public class SingletonForDCL {
    private static volatile SingletonForDCL singleton;
    private SingletonForDCL(){
    }
    public static SingletonForDCL getInstance(){
        if(singleton == null){
            synchronized (SingletonForDCL.class){
                if(singleton == null){
                    singleton = new SingletonForDCL();
                }
            }
        }
        return singleton;
    }
}
