package adapter;

public class Main {
    public static void main(String[] args) {

        Canvas canvas = new FigureToCanvasAdapter(new ConcreteFigure());
        canvas.paint();

    }
}
