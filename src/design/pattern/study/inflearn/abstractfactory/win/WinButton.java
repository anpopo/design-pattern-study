package design.pattern.study.inflearn.abstractfactory.win;

import design.pattern.study.inflearn.abstractfactory.abst.Button;

public class WinButton implements Button {
    @Override
    public void click() {
        System.out.println("window button click");
    }
}
