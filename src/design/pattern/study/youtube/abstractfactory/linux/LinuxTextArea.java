package design.pattern.study.youtube.abstractfactory.linux;

import design.pattern.study.youtube.abstractfactory.abst.TextArea;

public class LinuxTextArea implements TextArea {
    @Override
    public void input() {
        System.out.println("linux text area");
    }
}
