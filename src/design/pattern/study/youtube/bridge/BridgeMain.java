package design.pattern.study.youtube.bridge;

public class BridgeMain {
    public static void main(String[] args) {
        PrintMorseCode code = new PrintMorseCode(new DefaultMorseCodeFunction());
        code.g().a().r().a().m();
    }
}
