package proxy;

/**
 * 真实主题
 *
 * @author LiJie on 2019/9/4
 */
public class RealSubject implements Subject {

    @Override
    public void Request() {
        System.out.println("访问真实主题方法...");
    }
}
