package bridge;

/**
 * 具体实现化角色
 *
 * @author LiJie on 2019/9/18
 */
public class RedCircle implements DrawAPI{
    @Override
    public void drawCircle() {
        System.out.println("画了一个红色的圆");
    }
}
