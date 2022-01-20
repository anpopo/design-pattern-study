package design.pattern.study.inflearn.abstractfactory.win;

import design.pattern.study.inflearn.abstractfactory.abst.Button;
import design.pattern.study.inflearn.abstractfactory.abst.GuiFactory;
import design.pattern.study.inflearn.abstractfactory.abst.TextArea;

public class WIinGuiFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public TextArea textArea() {
        return new WinTextArea();
    }
}
