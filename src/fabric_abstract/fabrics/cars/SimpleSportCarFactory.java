package fabric_abstract.fabrics.cars;

import fabric_abstract.cars.Car;
import fabric_abstract.parts.engine.SportEngine;
import fabric_abstract.parts.transmission.SportTransmission;
import fabric_abstract.parts.wheels.MediumWheels;

public class SimpleSportCarFactory {

    public static Car createCar() {
        return new Car(new MediumWheels(),new SportEngine(),new SportTransmission());
    }
}
