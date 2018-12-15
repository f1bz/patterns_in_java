package fabric_method;

public class SportCarFabric implements CarFabric {
    @Override
    public Car makeCar() {
        return new SportCar("Sport");
    }
}
