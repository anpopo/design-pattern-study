package design.pattern.study.inflearn.abstractfactory.linux;

import design.pattern.study.inflearn.abstractfactory.abst.Button;

public class LinuxButton implements Button {

    @Override
    public void click() {
        System.out.println("linux click");
    }
}
