package bridge;

/**
 * 测试
 *
 * @author LiJie on 2019/9/18
 */
public class BridgeClient {
    public static void main(String[] args) {
        Shape red = new Circle(new RedCircle());
        Shape green = new Circle(new GreenCircle());
        red.draw();
        green.draw();
    }
}
