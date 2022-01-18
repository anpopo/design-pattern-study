package design.pattern.study.inflearn.prototype.deepshallow;

public class ShallowMain {

    public static void main(String[] args) throws CloneNotSupportedException {
        Cat navi = new Cat("navi", new Age(2021, 1));

        // yo 는 단순 참조값을 복사해오는 얕은 복사
        Cat yo = navi;
        yo.setName("yoyo");
        yo.setAge(new Age(2020, 2));


        // ca 는 새로운 참조로 내부 값을 가지는 깊은 복사
        // 깊은 복사에서  내부적으로 프리미티브 타입의 래퍼클래스들은 새로운 참조값을 참조값을 할당한다.
        // 하지만 새롭게 생성한 클래스 인스턴스는 그렇지 않다.
        Cat ca = navi.copy();
        ca.setName("ca");
        ca.getAge().setYear(2015);
        ca.getAge().setValue(7);

        System.out.println(navi.getName());
        System.out.println(yo.getName());
        System.out.println(ca.getName());

        System.out.println(navi.getAge().getYear());
        System.out.println(yo.getAge().getYear());
        System.out.println(ca.getAge().getYear());

        System.out.println(navi.getAge().getValue());
        System.out.println(yo.getAge().getValue());
        System.out.println(ca.getAge().getValue());
    }
}
