package design.pattern.study.inflearn.prototype.deepshallow;

public class Cat implements Cloneable{
    private String name;
    private Age age;

    public Cat(String name, Age age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Age getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Age age) {
        this.age = age;
    }


    public Cat copy() throws CloneNotSupportedException {
        Cat cat = (Cat)clone();
        // 클래스의 깊은 복사를 위해서 직접 깊은 복사를 해 주어야 한다.
        cat.setAge(new Age(age.getYear(), age.getValue()));
        return cat;
    }
}
