package builder;

/**
 * 抽象建造者
 *
 * @author LiJie on 2019/8/15
 */
public abstract class Builder {
    protected Product product = new Product();
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();
    public Product getProduct(){
        return product;
    }
}
