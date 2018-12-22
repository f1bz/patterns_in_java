package builder;

import builder.builder.SportCarBuilder;
import builder.car.Car;

public class Main {
    public static void main(String[] args) {
        Director director = new Director(new SportCarBuilder());
        Car car = director.constructCar();
        System.out.println(car);
    }
}
