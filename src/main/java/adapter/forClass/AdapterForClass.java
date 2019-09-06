package adapter.forClass;

/**
 * 类适配器：实现目标接口,在目标接口中调用适配者的方法
 * 现在我想访问 Adaptee中的 specialRequest()方法  ，只需要访问目标接口 Target中的 request()方法
 *
 * @author LiJie on 2019/9/6
 */
public class AdapterForClass extends Adaptee implements Target {
    @Override
    public void request() {
        specialRequest();
    }
}
