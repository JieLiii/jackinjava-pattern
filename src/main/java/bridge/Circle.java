package bridge;

/**
 * 具体抽象化角色
 *
 * @author LiJie on 2019/9/18
 */
public class Circle extends Shape {

    public Circle(DrawAPI drawAPI) {
        super(drawAPI);
    }

    @Override
    public void draw() {
        drawAPI.drawCircle();
    }
}
