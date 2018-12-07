package strategy;

public class Main {

    public static void main(String[] args) {
        Car carSlow  = new Van();
        Car carFast  = new SportCar();

        carFast.makeMove();
        carSlow.makeMove();
    }
}
