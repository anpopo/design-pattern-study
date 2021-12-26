package design.pattern.study.prototypepattern;

import design.pattern.study.prototypepattern.framework.Manager;
import design.pattern.study.prototypepattern.framework.Product;

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderlinePen underlinePen = new UnderlinePen('~');
        MessageBox messageBox1 = new MessageBox('*');
        MessageBox messageBox2 = new MessageBox('/');

        manager.register("strong message", underlinePen);
        manager.register("warning box", messageBox1);
        manager.register("slash box", messageBox2);


        Product p1 = manager.create("strong message");
        p1.use("hello");
        Product p2 = manager.create("warning box");
        p2.use("hello");
        Product p3 = manager.create("slash box");
        p3.use("hello");


    }
}
