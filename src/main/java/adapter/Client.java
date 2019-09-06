package adapter;

import adapter.forClass.Adaptee;
import adapter.forClass.AdapterForClass;
import adapter.forClass.Target;
import adapter.forObject.AdapterForObject;

/**
 * 测试
 *
 * @author LiJie on 2019/9/6
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("------------------------类适配器模式测试----------------------");
        Target target = new AdapterForClass();
        target.request();
        System.out.println("------------------------对象适配器模式测试----------------------");
        Target target1 = new AdapterForObject(new Adaptee());
        target1.request();
        System.out.println("------------------------（对象适配器模式）实际应用测试----------------------");
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("MP4", "速度与激情7.mp4");
        audioPlayer.play("mp3", "See you again.mp3");
        audioPlayer.play("rmvb", "极品飞车.rmvb");
    }
}
