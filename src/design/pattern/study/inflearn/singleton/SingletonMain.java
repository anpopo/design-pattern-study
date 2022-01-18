package design.pattern.study.inflearn.singleton;

public class SingletonMain {

    public static void main(String[] args) {
        SystemSpeaker speaker1 = SystemSpeaker.getInstance();
        SystemSpeaker speaker2 = SystemSpeaker.getInstance();

        System.out.println(speaker1.getVolume());
        speaker1.setVolume(10);
        System.out.println(speaker2.getVolume());
    }
}
