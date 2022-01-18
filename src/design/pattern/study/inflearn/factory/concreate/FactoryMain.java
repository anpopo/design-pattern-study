package design.pattern.study.inflearn.factory.concreate;

import design.pattern.study.inflearn.factory.framework.Item;
import design.pattern.study.inflearn.factory.framework.ItemCreator;

public class FactoryMain {
    public static void main(String[] args) {

        ItemCreator creator = new HpCreator();
        Item item = creator.create();
        item.use();

        creator = new MpCreator();
        Item item1 = creator.create();
        item1.use();

    }
}
