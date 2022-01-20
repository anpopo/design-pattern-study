package design.pattern.study.inflearn.abstractfactory.linux;

import design.pattern.study.inflearn.abstractfactory.abst.TextArea;

public class LinuxTextArea implements TextArea {
    @Override
    public void input() {
        System.out.println("linux text area");
    }
}
