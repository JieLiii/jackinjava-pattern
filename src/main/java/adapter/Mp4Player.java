package adapter;

/**
 * @author LiJie on 2019/9/6
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("播放MP4视频:" + fileName);
    }
}
