package design.pattern.study.templatepattern;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Happy, Merry Christmas");
        AbstractDisplay d3 = new StringDisplay("행복한 크리스마스 되세용~");

        d1.display();
        d2.display();
        d3.display();

    }
}
