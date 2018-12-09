package decorator.decorators;

import decorator.BaseDecorator;
import decorator.Car;

import java.util.List;

public class TunedWheels extends BaseDecorator {

    public TunedWheels(Car car) {
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
            priceToAdd=5000;
        }

        if (super.getName().equalsIgnoreCase("vaz")) {
            priceToAdd=1000;
        }

        return super.getPrice()+priceToAdd;
    }
}
