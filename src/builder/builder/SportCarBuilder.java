package builder.builder;

import builder.car.SportCar;
import builder.car.Car;

public class SportCarBuilder extends CarBuilder {

    public SportCarBuilder() {
        super();
    }

    @Override
    public CarBuilder createCar() {
        car = new SportCar();
        return this;
    }

    @Override
    public CarBuilder addCarcase() {
        car.setCarcase("Cabriolet");
        return this;
    }

    @Override
    public CarBuilder addEngine() {
        car.setEngine("Tuned Engine");
        return this;
    }

    @Override
    public CarBuilder addWheels() {
        car.setWheels("Medium wheels");
        return this;
    }

    @Override
    public CarBuilder addTransmission() {
        car.setTransmission("Sport turbo auto");
        return this;
    }

    @Override
    public Car build() {
        return car;
    }
}
