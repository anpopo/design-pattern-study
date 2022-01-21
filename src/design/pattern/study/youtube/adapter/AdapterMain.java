package design.pattern.study.youtube.adapter;

public class AdapterMain {
    public static void main(String[] args) {
        Adapter adapter1 = new AdapterDelegateImpl(new CustomMath());

        System.out.println(adapter1.twiceOf(100f));
        System.out.println(adapter1.halfOf(100f));


        Adapter adapter2 = new AdapterInheritanceImpl();
        System.out.println(adapter2.twiceOf(100f));
        System.out.println(adapter2.halfOf(100f));
    }
}
