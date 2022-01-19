package design.pattern.study.inflearn.builder;

public class LGGramBlueprint extends Blueprint{

    private Computer computer;


    public LGGramBlueprint() {
        this.computer = new Computer("default", "default", "default");
    }

    @Override
    public void setCpu() {
        computer.setCpu("i7");
    }

    @Override
    public void setRam() {
        computer.setRam("8G");
    }

    @Override
    public void setStorage() {
        computer.setStorage("256G SSD");
    }

    @Override
    public Computer getComputer() {
        return computer.copy();
    }
}
