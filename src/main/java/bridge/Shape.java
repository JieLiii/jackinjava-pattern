package bridge;

/**
 * 抽象化角色
 *
 * @author LiJie on 2019/9/18
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
