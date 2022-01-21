package design.pattern.study.youtube.composite;

public class File extends Component{

    private Object data;

    public File(String name) {
        super(name);
    }

    @Override
    void show() {
        System.out.println(getName());
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
