package builder;

/**
 * 客户类
 *
 * @author LiJie on 2019/8/15
 */
public class Client {
    public static void main(String[] args){
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        product.show();
    }
}
