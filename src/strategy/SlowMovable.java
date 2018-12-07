package strategy;

public class SlowMovable implements Movable {

    @Override
    public void move() {
        System.out.println("Moving slow");
    }
}
