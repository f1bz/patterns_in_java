package decorator.decorators;

import decorator.BaseDecorator;
import decorator.Car;

import java.util.List;

public class TunedEngine extends BaseDecorator {

    public TunedEngine(Car car) {
        super(car);
    }

    @Override
    public List<BaseDecorator> getFeatures() {
        return super.getFeatures();
    }

    @Override
    public void addFeature(BaseDecorator baseDecorator) {
        super.addFeature(baseDecorator);
    }

    @Override
    public int getPrice() {

        int priceToAdd=0;
        if (super.getName().equalsIgnoreCase("bmw")) {
            priceToAdd=15000;
        }
        if (super.getName().equalsIgnoreCase("vaz")) {
            priceToAdd=5000;
        }

        return super.getPrice()+priceToAdd;
    }
}
