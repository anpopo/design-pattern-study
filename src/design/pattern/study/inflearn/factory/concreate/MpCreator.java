package design.pattern.study.inflearn.factory.concreate;

import design.pattern.study.inflearn.factory.framework.Item;
import design.pattern.study.inflearn.factory.framework.ItemCreator;

import java.util.Date;

public class MpCreator extends ItemCreator {
    @Override
    protected void requestItemInfo() {
        System.out.println("디비에서 마나 물약의 정보를 가져옴");
    }

    @Override
    protected void createItemLog() {
        System.out.println("회복 마력 새로 생성 디비에 저장 " + new Date());
    }

    @Override
    protected Item createItem() {
        return new MpPotion();
    }
}
