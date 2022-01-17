package design.pattern.study.book.prototypepattern.framework;

public interface Product extends Cloneable{
    void use(String s);
    Product createClone();

}
