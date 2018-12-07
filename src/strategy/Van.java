package strategy;

public class Van extends Car {
    public Van() {
        super(new SlowMovable());
    }
}
