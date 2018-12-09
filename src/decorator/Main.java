package decorator;

import decorator.cars.Bmw;
import decorator.cars.Vaz;
import decorator.decorators.TunedEngine;
import decorator.decorators.TunedWheels;

public class Main {
    public static void main(String[] args) {
        Car vaz = new Vaz();
        Car bmw = new Bmw();

        System.out.println("vaz price:"+ vaz.getPrice());
        System.out.println("bmw price:"+ bmw.getPrice());

        vaz = new TunedWheels(vaz);
        bmw = new TunedWheels(bmw);

        System.out.println("*************************************************");
        System.out.println("vaz with tuned wheels price: "+ vaz.getPrice());
        System.out.println("bmw with tuned wheels price: "+ bmw.getPrice());

        vaz = new TunedWheels(vaz);
        bmw = new TunedWheels(bmw);


        System.out.println("*************************************************");
        System.out.println("vaz with twice tuned wheels price: "+ vaz.getPrice());
        System.out.println("bmw with twice tuned wheels price: "+ bmw.getPrice());


        vaz = new TunedEngine(vaz);
        bmw = new TunedEngine(bmw);


        System.out.println("*************************************************");
        System.out.println("vaz with tuned engine and wheels price: "+ vaz.getPrice());
        System.out.println("bmw with tuned engine and wheels price: "+ bmw.getPrice());

        System.out.println("*************************************************");
        System.out.println("vaz's all tunes: "+ vaz.getFeatures().size());
        System.out.println("bmw's all tunes: "+ bmw.getFeatures().size());

    }
}
