package design.pattern.study.youtube.factory.concreate;

import design.pattern.study.youtube.factory.framework.Item;

public class MpPotion implements Item {

    @Override
    public void use() {
        System.out.println("마력 회복");
    }
}
