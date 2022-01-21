package design.pattern.study.youtube.abstractfactory.Concrete;

import design.pattern.study.youtube.abstractfactory.abst.BikeFactory;
import design.pattern.study.youtube.abstractfactory.abst.Body;
import design.pattern.study.youtube.abstractfactory.abst.Wheel;

public class ConcreteFactory implements BikeFactory {

    @Override
    public Body createBody() {
        return new ConcreteBody();
    }

    @Override
    public Wheel createWheel() {
        return new ConcreteWheel();
    }
}
