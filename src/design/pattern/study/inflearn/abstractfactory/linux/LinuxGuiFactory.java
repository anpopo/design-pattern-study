package design.pattern.study.inflearn.abstractfactory.linux;

import design.pattern.study.inflearn.abstractfactory.abst.Button;
import design.pattern.study.inflearn.abstractfactory.abst.GuiFactory;
import design.pattern.study.inflearn.abstractfactory.abst.TextArea;

public class LinuxGuiFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public TextArea createTextArea() {
        return new LinuxTextArea();
    }
}
