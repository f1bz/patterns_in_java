package decorator.cars;

import decorator.Car;

public class Vaz extends Car {
    @Override
    public String getName() {
        return "vaz";
    }

    @Override
    public void ride() {
        System.out.println("Vaz djdjdj!");
    }

    @Override
    public int getPrice() {
        return 10_000;
    }
}
