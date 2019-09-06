package adapter;

/**
 * 视频播放接口
 *
 * @author LiJie on 2019/9/6
 */
public interface AdvancedMediaPlayer {
    void playVlc(String fileName);
    void playMp4(String fileName);
}
