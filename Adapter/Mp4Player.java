package Adapter;

public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void PlayMp4(String fileName) {
        System.out.println("Playing mp4 file -> "+fileName);
    }
}
