package design.pattern.study.inflearn.factory.concreate;

import design.pattern.study.inflearn.factory.framework.Item;

public class MpPotion implements Item {

    @Override
    public void use() {
        System.out.println("마력 회복");
    }
}
