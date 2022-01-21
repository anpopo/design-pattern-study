package design.pattern.study.youtube.bridge;

public class SoundMorseCodeFunction implements MorseCodeFunction{

    @Override
    public void dot() {
        System.out.print("닷");
    }

    @Override
    public void dash() {
        System.out.print("대시");
    }

    @Override
    public void space() {
        System.out.print("스페이스~~");
    }
}
