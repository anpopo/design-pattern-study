package design.pattern.study.factorymethodpattern.idcard;

import design.pattern.study.factorymethodpattern.framework.Product;

public class IDCard extends Product {

    private String owner;
    private int serialNumber;

    IDCard(String owner, int serialNumber) {
        System.out.println(owner +  String.format("(%d)", serialNumber) + "의 카드를 만듭니다.");
        this.serialNumber = serialNumber;
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(owner + String.format("(%d)", serialNumber) + "의 카드를 사용합니다");
    }

    public String getOwner() {
        return owner;
    }

    public int getSerialNumber() {
        return serialNumber;
    }
}
