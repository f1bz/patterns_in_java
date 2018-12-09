package decorator;

import java.util.ArrayList;
import java.util.List;

public abstract class Car {
    protected List<BaseDecorator> features = new ArrayList<>();

    public  void addFeature(BaseDecorator baseDecorator) {
        features.add(baseDecorator);
    }
    public List<BaseDecorator> getFeatures() {
        return features;
    }
    public abstract String getName();
    public abstract void ride();
    public abstract int getPrice();
}
