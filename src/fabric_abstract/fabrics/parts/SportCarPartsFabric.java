package fabric_abstract.fabrics.parts;

import fabric_abstract.parts.engine.Engine;
import fabric_abstract.parts.engine.SportEngine;
import fabric_abstract.parts.transmission.SportTransmission;
import fabric_abstract.parts.transmission.Transmission;
import fabric_abstract.parts.wheels.MediumWheels;
import fabric_abstract.parts.wheels.Wheels;

public class SportCarPartsFabric implements CarPartsFabric {

    @Override
    public Wheels makeWheels() {
        return new MediumWheels();
    }

    @Override
    public Engine makeEngine() {
        return new SportEngine();
    }

    @Override
    public Transmission makeTransmission() {
        return new SportTransmission();
    }
}
