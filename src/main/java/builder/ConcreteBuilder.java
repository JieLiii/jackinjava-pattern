package builder;

/**
 * 具体建造者
 *
 * @author LiJie on 2019/8/15
 */
public class ConcreteBuilder extends Builder {
    @Override
    public void buildPartA() {
        product.setPartA("partA");
    }

    @Override
    public void buildPartB() {
        product.setPartA("partB");
    }

    @Override
    public void buildPartC() {
        product.setPartA("partC");
    }
}
