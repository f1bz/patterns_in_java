package fabric_abstract.cars;

import fabric_abstract.parts.engine.Engine;
import fabric_abstract.parts.transmission.Transmission;
import fabric_abstract.parts.wheels.Wheels;

public class Car{
    private Wheels wheels;
    private Engine engine;
    private Transmission transmission;

    public Car( Wheels wheels, Engine engine, Transmission transmission) {
        this.wheels = wheels;
        this.engine = engine;
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return wheels+"\n"+transmission+engine+"\n";
    }
}
