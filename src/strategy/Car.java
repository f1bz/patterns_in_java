package strategy;

public abstract class Car{
    private Movable movable;

    public Car(Movable movable) {
        this.movable = movable;
    }

    protected void makeMove(){
        movable.move();
    }

}
