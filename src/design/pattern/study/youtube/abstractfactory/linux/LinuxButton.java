package design.pattern.study.youtube.abstractfactory.linux;

import design.pattern.study.youtube.abstractfactory.abst.Button;

public class LinuxButton implements Button {

    @Override
    public void click() {
        System.out.println("linux click");
    }
}
