package design.pattern.study.youtube.builder;

public class ComputerBuilder {

    private Blueprint blueprint;
    public void setBluePrint(Blueprint bluePrint) {
        this.blueprint = bluePrint;
    }

    public void make() {
        blueprint.setCpu();
        blueprint.setRam();
        blueprint.setStorage();
    }

    public Computer getComputer() {
        return blueprint.getComputer();
    }
}
