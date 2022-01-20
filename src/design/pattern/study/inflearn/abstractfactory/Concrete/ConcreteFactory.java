package design.pattern.study.inflearn.abstractfactory.Concrete;

import design.pattern.study.inflearn.abstractfactory.abst.BikeFactory;
import design.pattern.study.inflearn.abstractfactory.abst.Body;
import design.pattern.study.inflearn.abstractfactory.abst.Wheel;

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
