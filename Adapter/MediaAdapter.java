package Adapter;

public class MediaAdapter implements MediaPlayer{
    /**
     * 实现 MediaPlayer 接口的实体类 AudioPlayer 可播放 mp3音频文件。
     * 实现接口 AdvancedMediaPlayer 接口的实体类 AdvancedMediaPlayer 可播放 vlc 和 mp4 格式的文件。
     * 使用MediaAdapter使得AudioPlayer播放其他格式音频文件。
     */
    AdvancedMediaPlayer advancedMediaPlayer;
    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer = new VlcPlayer();
        }else if(audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.PlayMp4(fileName);
        }
    }
}
