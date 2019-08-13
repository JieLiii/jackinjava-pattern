package prototype;

/**
 * @author LiJie on 2019/8/13
 */
public class ProtoTypeTest {
    public static void main(String[]args)throws CloneNotSupportedException{
        RealizeType obj1 = new RealizeType();
        RealizeType obj2 = (RealizeType) obj1.clone();
        System.out.println(obj1 == obj2);

        ProtoTypeManager protoTypeManager = new ProtoTypeManager();
        Circle circle = (Circle) protoTypeManager.getShape("Circle");
        circle.countArea();
        Square square = (Square) protoTypeManager.getShape("Square");
        square.countArea();
    }
}
