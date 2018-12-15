package fabric_method;

public class VainCarFabric implements CarFabric {
    @Override
    public Car makeCar() {
        return new VanCar("Van");
    }
}
