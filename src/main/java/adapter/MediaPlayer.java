package adapter;

/**
 * 媒体播放接口，默认只能播放 MP3
 *
 * 目标接口
 *
 * @author LiJie on 2019/9/6
 */
public interface MediaPlayer {
    void play(String audioType, String fileName);
}
