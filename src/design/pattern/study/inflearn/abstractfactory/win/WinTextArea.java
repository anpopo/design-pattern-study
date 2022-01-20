package design.pattern.study.inflearn.abstractfactory.win;

import design.pattern.study.inflearn.abstractfactory.abst.TextArea;

public class WinTextArea implements TextArea {
    @Override
    public void input() {
        System.out.println("window input ");
    }
}
