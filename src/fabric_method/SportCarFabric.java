package fabric_method;

public class SportCarFabric extends CarFabric {
    @Override
    public Car createCar() {
        return new SportCar("Sport");
    }
}
