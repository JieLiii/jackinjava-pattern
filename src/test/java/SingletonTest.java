import org.junit.jupiter.api.Test;
import singleton.SingletonForHanger;

/**
 * 测试单例模式
 *
 * @author LiJie on 2019/8/14
 */
public class SingletonTest {
    @Test
    public void getSingleton(){
        SingletonForHanger singleton1 = SingletonForHanger.getInstance();
        SingletonForHanger singleton2 = SingletonForHanger.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}
