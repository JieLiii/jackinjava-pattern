package adapter;

/**
 * @author LiJie on 2019/9/6
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("播放Vlc视频:" + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
