package design.pattern.study.youtube.abstractfactory.linux;

import design.pattern.study.youtube.abstractfactory.abst.Button;
import design.pattern.study.youtube.abstractfactory.abst.GuiFactory;
import design.pattern.study.youtube.abstractfactory.abst.TextArea;

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
