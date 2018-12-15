package fabric_method;

public abstract class  CarFabric {

    public final Car makeCar(){
        return createCar();
    }

    protected abstract Car createCar();
}
