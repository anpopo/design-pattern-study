package design.pattern.study.singletonpattern;

public class Main {

    public static void main(String[] args) {
        System.out.println("start");
        Singleton instance = Singleton.getInstance();
        System.out.println(instance);
        System.out.println("end");

    }
}
