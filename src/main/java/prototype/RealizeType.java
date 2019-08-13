package prototype;

/**
 * 原型模式主要包含三元素：
 * 1.抽象原型类：规定了具体原型必须实现的接口
 * 2.具体原型类：实现抽象原型类的clone()方法，它是可被复制的对象
 * 3.访问类：使用具体原型类的clone()方法来复制对象
 *
 * @author LiJie on 2019/8/13
 */
public class RealizeType implements Cloneable {
    public RealizeType() {
        System.out.println("具体原型创建成功");
    }

    /**
     * 需要实现Cloneable接口，clone方法是nativ方法，实现接口后才能调用
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("复制成功");
        return (RealizeType) super.clone();
    }
}

