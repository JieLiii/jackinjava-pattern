package adapter;

/**
 * 适配器：让本来只能播放 MP3 的 MediaPlayer 可以播放视频
 *  将视频播放接口 与  MP3接口 统一
 *
 * @author LiJie on 2019/9/6
 */
public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if("vlc".equalsIgnoreCase(audioType)){
            this.advancedMediaPlayer = new VlcPlayer();
        }
        if("mp4".equalsIgnoreCase(audioType)){
            this.advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if("vlc".equalsIgnoreCase(audioType)){
            advancedMediaPlayer.playVlc(fileName);
        }
        if("mp4".equalsIgnoreCase(audioType)){
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
