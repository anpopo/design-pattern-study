package design.pattern.study.prototypepattern.framework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Manager {

    private Map<String, Product> showcase = new ConcurrentHashMap<>();

    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    public Product create(String protoName) {
        Product p = showcase.get(protoName);
        return p.createClone();
    }
}
