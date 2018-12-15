package fabric_method;

public class VainCarFabric extends CarFabric {

    @Override
    public Car createCar() {
        return new VanCar("Van");
    }
}
