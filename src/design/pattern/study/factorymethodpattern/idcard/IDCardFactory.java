package design.pattern.study.factorymethodpattern.idcard;

import design.pattern.study.factorymethodpattern.framework.Factory;
import design.pattern.study.factorymethodpattern.framework.Product;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class IDCardFactory extends Factory {
    private Map<Integer, IDCard> database = new ConcurrentHashMap<>();
    private AtomicInteger serialNumber = new AtomicInteger(100);


    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner, serialNumber.getAndAdd(1));
    }

    @Override
    protected void registerProduct(Product p) {
        IDCard idCard = (IDCard) p;
        database.put(idCard.getSerialNumber(), idCard);
    }

    public Map<Integer, IDCard> getDatabase() {
        return database;
    }
}
