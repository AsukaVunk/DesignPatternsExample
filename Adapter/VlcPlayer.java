package Adapter;

public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file -> "+fileName);
    }

    @Override
    public void PlayMp4(String fileName) {

    }
}
