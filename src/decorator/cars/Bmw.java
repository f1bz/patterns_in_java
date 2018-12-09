package decorator.cars;

import decorator.Car;

public class Bmw extends Car {
    @Override
    public String getName() {
        return "bmw";
    }

    @Override
    public void ride() {
        System.out.println("BMW whoooahooo!");
    }

    @Override
    public int getPrice() {
        return 30_000;
    }
}
