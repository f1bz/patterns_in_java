package adapter;

public class ConcreteFigure implements Figure{

    @Override
    public void draw() {
        System.out.println("I am a figure!");
    }
}
