package fabric_method;

public class Main {
    public static void main(String[] args) {
        CarFabric vanFabric = new VainCarFabric();
        CarFabric sportFabric = new SportCarFabric();

        Car car1 = vanFabric.makeCar();
        Car car2 = sportFabric.makeCar();

        System.out.println(car1.getName());
        System.out.println(car2.getName());

    }
}
