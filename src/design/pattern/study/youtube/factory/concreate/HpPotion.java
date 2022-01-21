package design.pattern.study.youtube.factory.concreate;

import design.pattern.study.youtube.factory.framework.Item;

public class HpPotion implements Item {
    @Override
    public void use() {
        System.out.println("체력 회복");
    }
}
