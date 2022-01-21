package design.pattern.study.youtube.factory.concreate;

import design.pattern.study.youtube.factory.framework.Item;
import design.pattern.study.youtube.factory.framework.ItemCreator;

import java.util.Date;

public class HpCreator extends ItemCreator {
    @Override
    protected void requestItemInfo() {
        System.out.println("디비에서 회복 물약의 정보를 가져옴");
    }

    @Override
    protected void createItemLog() {
        System.out.println("회복 물약 새로 생성 디비에 저장 " + new Date());
    }

    @Override
    protected Item createItem() {
        return new HpPotion();
    }
}
