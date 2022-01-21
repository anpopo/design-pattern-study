package design.pattern.study.youtube.abstractfactory.win;

import design.pattern.study.youtube.abstractfactory.abst.TextArea;

public class WinTextArea implements TextArea {
    @Override
    public void input() {
        System.out.println("window input ");
    }
}
