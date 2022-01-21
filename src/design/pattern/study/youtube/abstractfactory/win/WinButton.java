package design.pattern.study.youtube.abstractfactory.win;

import design.pattern.study.youtube.abstractfactory.abst.Button;

public class WinButton implements Button {
    @Override
    public void click() {
        System.out.println("window button click");
    }
}
