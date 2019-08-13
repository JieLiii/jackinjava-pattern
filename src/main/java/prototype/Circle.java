package prototype;

import java.util.Scanner;

/**
 * @author LiJie on 2019/8/13
 */
public class Circle implements Shape{
    public Circle() {
        System.out.println("创建了一个圆形");
    }

    @Override
    public Object clone() {
        Circle circle = null;
        try{
            circle = (Circle)super.clone();
        }catch (CloneNotSupportedException e){
            System.out.println("克隆圆形失败");
        }
        return circle;
    }

    @Override
    public void countArea() {
        int r=0;
        System.out.print("这是一个圆，请输入圆的半径：");
        Scanner input=new Scanner(System.in);
        r=input.nextInt();
        System.out.println("该圆的面积="+3.1415*r*r+"\n");
    }
}
