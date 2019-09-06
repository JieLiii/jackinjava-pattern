package adapter.forObject;

import adapter.forClass.Adaptee;
import adapter.forClass.Target;

/**
 * 对象适配器
 *
 * @author LiJie on 2019/9/6
 */
public class AdapterForObject implements Target {
    private Adaptee adaptee;

    public AdapterForObject(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specialRequest();
    }
}
