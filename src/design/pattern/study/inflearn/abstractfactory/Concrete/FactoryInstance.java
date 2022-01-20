package design.pattern.study.inflearn.abstractfactory.Concrete;

import design.pattern.study.inflearn.abstractfactory.abst.GuiFactory;
import design.pattern.study.inflearn.abstractfactory.linux.LinuxGuiFactory;
import design.pattern.study.inflearn.abstractfactory.win.WIinGuiFactory;

public class FactoryInstance {
    public static GuiFactory getGuiFactory() {
        switch (0) {
            case 0 :
                return new LinuxGuiFactory();
        }

        return new WIinGuiFactory();
    }
}
