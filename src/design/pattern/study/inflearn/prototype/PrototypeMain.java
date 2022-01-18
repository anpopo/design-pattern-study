package design.pattern.study.inflearn.prototype;

public class PrototypeMain {

    public static void main(String[] args) throws CloneNotSupportedException {
        Circle c1 = new Circle(10, 10, 10);
        Circle c2 = c1.copy();

        System.out.println(c1.getId() + ", " + c1.getX() + ", " + c1.getY() + ", " + c1.getR());
        System.out.println(c2.getId() + ", " + c2.getX() + ", " + c2.getY() + ", " + c2.getR());
    }
}
