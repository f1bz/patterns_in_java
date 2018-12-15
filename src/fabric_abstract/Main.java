package fabric_abstract;

import fabric_abstract.cars.Car;
import fabric_abstract.fabrics.cars.CarMaker;
import fabric_abstract.fabrics.parts.DefaultCarPartsFabric;
import fabric_abstract.fabrics.parts.SportCarPartsFabric;

public class Main {
    public static void main(String[] args) {

        Car sportCar = (new CarMaker(new SportCarPartsFabric())).makeCar();
        Car regularCar = (new CarMaker(new DefaultCarPartsFabric())).makeCar();

        System.out.println(sportCar);
        System.out.println(regularCar);
    }
}
