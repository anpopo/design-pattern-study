package design.pattern.study.youtube.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component{

    private List<Component> children = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    void show() {
        for (Component c : getChildren()) {
            c.show();
        }
    }

    public boolean addComponent (Component component) {
        return this.children.add(component);
    }

    public boolean removeComponent(Component component) {
        return children.remove(component);
    }

    public List<Component> getChildren() {
        return new ArrayList<>(children);
    }
}
