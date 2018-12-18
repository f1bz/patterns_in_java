package adapter;

public class FigureToCanvasAdapter implements Canvas {

    private Figure figure;


    public FigureToCanvasAdapter(Figure figure) {
        this.figure = figure;
    }


    @Override
    public void paint() {
        figure.draw();
    }
}
