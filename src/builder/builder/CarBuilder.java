package builder.builder;

import builder.car.Car;

public abstract class CarBuilder {
    protected Car car;

    public abstract CarBuilder createCar();
    public abstract CarBuilder addCarcase();
    public abstract CarBuilder addEngine();
    public abstract CarBuilder addWheels();
    public abstract CarBuilder addTransmission();
    public abstract Car build();
}
