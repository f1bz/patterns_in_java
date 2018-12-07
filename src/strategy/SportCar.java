package strategy;

public class SportCar extends Car {
    public SportCar() {
        super(new FastMovable());
    }
}
