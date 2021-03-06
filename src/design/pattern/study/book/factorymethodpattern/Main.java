package design.pattern.study.book.factorymethodpattern;

import design.pattern.study.book.factorymethodpattern.framework.Factory;
import design.pattern.study.book.factorymethodpattern.framework.Product;
import design.pattern.study.book.factorymethodpattern.idcard.IDCardFactory;

public class Main {

    public static void main(String[] args) {
        Factory factory = new IDCardFactory();

        Product card1 = factory.create("안세형");
        Product card2 = factory.create("최은지");
        Product card3 = factory.create("감자");

        card1.use();
        card2.use();
        card3.use();
    }
}
