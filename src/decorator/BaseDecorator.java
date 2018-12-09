package decorator;

import java.util.List;

public abstract class BaseDecorator extends Car{

    protected Car car;

    public BaseDecorator(Car car) {
        this.car = car;
        addFeature(this);
    }

    @Override
    public void addFeature(BaseDecorator baseDecorator){
        car.addFeature(baseDecorator);
    }

    @Override
    public final void ride() {
        car.ride();
    }

    @Override
    public int getPrice() {
        return car.getPrice();
    }

    @Override
    public List<BaseDecorator> getFeatures() {
        return car.getFeatures();
    }

    @Override
    public String getName() {
        return car.getName();
    }
}
