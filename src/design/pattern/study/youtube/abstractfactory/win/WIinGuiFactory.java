package design.pattern.study.youtube.abstractfactory.win;

import design.pattern.study.youtube.abstractfactory.abst.Button;
import design.pattern.study.youtube.abstractfactory.abst.GuiFactory;
import design.pattern.study.youtube.abstractfactory.abst.TextArea;

public class WIinGuiFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public TextArea createTextArea() {
        return new WinTextArea();
    }

}
