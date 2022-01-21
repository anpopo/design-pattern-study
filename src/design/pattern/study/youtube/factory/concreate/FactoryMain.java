package design.pattern.study.youtube.factory.concreate;

import design.pattern.study.youtube.factory.framework.Item;
import design.pattern.study.youtube.factory.framework.ItemCreator;

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
