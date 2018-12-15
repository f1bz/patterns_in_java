package fabric_abstract.fabrics.cars;

import fabric_abstract.cars.Car;
import fabric_abstract.fabrics.parts.CarPartsFabric;
import fabric_abstract.parts.engine.Engine;
import fabric_abstract.parts.transmission.Transmission;
import fabric_abstract.parts.wheels.Wheels;


public class CarMaker implements CarFabric {
    private CarPartsFabric carPartsFabric;

    private CarMaker() {

    }

    public CarMaker(CarPartsFabric carPartsFabric) {
        this.carPartsFabric = carPartsFabric;
    }


    @Override
    public Car makeCar() {
        Engine engine = carPartsFabric.makeEngine();
        Transmission transmission = carPartsFabric.makeTransmission();
        Wheels wheels = carPartsFabric.makeWheels();

        Car car = new Car(wheels, engine, transmission);
        Car car2 = SimpleSportCarFactory.createCar(); // - Simple static factory usage example

        return car;
    }
}
