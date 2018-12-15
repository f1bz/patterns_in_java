package fabric_abstract.fabrics.parts;

import fabric_abstract.parts.transmission.Transmission;
import fabric_abstract.parts.wheels.Wheels;
import fabric_abstract.parts.engine.Engine;

public interface CarPartsFabric {
    Wheels makeWheels();
    Engine makeEngine();
    Transmission makeTransmission();
}
