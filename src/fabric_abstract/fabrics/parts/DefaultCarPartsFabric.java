package fabric_abstract.fabrics.parts;

import fabric_abstract.parts.engine.Engine;
import fabric_abstract.parts.engine.RegularEngine;
import fabric_abstract.parts.transmission.RegularTransmission;
import fabric_abstract.parts.transmission.Transmission;
import fabric_abstract.parts.wheels.LargeWheels;
import fabric_abstract.parts.wheels.Wheels;

public class DefaultCarPartsFabric implements CarPartsFabric {

    @Override
    public Wheels makeWheels() {
        return new LargeWheels();
    }

    @Override
    public Engine makeEngine() {
        return new RegularEngine();
    }

    @Override
    public Transmission makeTransmission() {
        return new RegularTransmission();
    }
}
