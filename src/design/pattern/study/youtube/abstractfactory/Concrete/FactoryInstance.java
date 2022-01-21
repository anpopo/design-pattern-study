package design.pattern.study.youtube.abstractfactory.Concrete;

import design.pattern.study.youtube.abstractfactory.abst.GuiFactory;
import design.pattern.study.youtube.abstractfactory.linux.LinuxGuiFactory;
import design.pattern.study.youtube.abstractfactory.win.WIinGuiFactory;

public class FactoryInstance {
    public static GuiFactory getGuiFactory() {
        switch (0) {
            case 0 :
                return new LinuxGuiFactory();
        }

        return new WIinGuiFactory();
    }
}
