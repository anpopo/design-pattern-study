package design.pattern.study.inflearn.factory.concreate;

import design.pattern.study.inflearn.factory.framework.Item;

public class HpPotion implements Item {
    @Override
    public void use() {
        System.out.println("체력 회복");
    }
}
