package design.pattern.study.inflearn.adapter;

public class AdapterInheritanceImpl extends CustomMath implements Adapter{
    @Override
    public Float twiceOf(Float f) {
        return twiceOF(f.doubleValue()).floatValue();
    }

    @Override
    public Float halfOf(Float f) {
        return halfOf(f.doubleValue()).floatValue();
    }
}
