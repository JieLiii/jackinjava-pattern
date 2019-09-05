package proxy.reflect;

import proxy.RealSubject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 处理器
 *
 * @author LiJie on 2019/9/5
 */
public class MyInvocationHandler implements InvocationHandler {
    private RealSubject realSubject;

    public MyInvocationHandler(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
