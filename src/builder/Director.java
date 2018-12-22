package builder;

import builder.builder.CarBuilder;
import builder.car.Car;

public class Director{
    private CarBuilder carBuilder;

    public Director(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car constructCar(){
        Car car = carBuilder.createCar().addCarcase()
                .addEngine()
                .addTransmission()
                .addWheels()
                .build();

        return car;
    }
}
