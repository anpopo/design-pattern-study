package design.pattern.study.book.singletonpattern.example;

public class Triple {

    private static final Triple triple1 = new Triple();
    private static final Triple triple2 = new Triple();
    private static final Triple triple3 = new Triple();

    private Triple () {}

    public static Triple getInstance(int id) {
        if (id == 1) return triple1;
        else if (id == 2) return triple2;
        return triple3;
    }
}
