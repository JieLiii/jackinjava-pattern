package adapter.forClass;

/**
 * 适配者：需要在目标接口中适配的类
 *
 * @author LiJie on 2019/9/6
 */
public class Adaptee {
    public void specialRequest(){
        System.out.println("这是适配者的业务代码");
    }
}
