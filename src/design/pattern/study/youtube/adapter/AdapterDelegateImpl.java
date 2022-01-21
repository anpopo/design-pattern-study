package design.pattern.study.youtube.adapter;

public class AdapterDelegateImpl implements Adapter {

    private CustomMath customMath;

    public AdapterDelegateImpl(CustomMath customMath) {
        this.customMath = customMath;
    }

    @Override
    public Float twiceOf(Float f) {
        return this.customMath.twiceOF(f.doubleValue()).floatValue();
    }

    @Override
    public Float halfOf(Float f) {
        return this.customMath.halfOf(f.doubleValue()).floatValue();
    }
}
