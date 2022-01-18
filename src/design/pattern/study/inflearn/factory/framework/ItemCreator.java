package design.pattern.study.inflearn.factory.framework;

public abstract class ItemCreator {

    public Item create () {
        Item item;
        requestItemInfo();
        item = createItem();
        createItemLog();
        return item;
    }

    abstract protected void requestItemInfo();
    abstract protected void createItemLog();
    abstract protected Item createItem();

}
