package flyweight;

public class Main {
    public static void main(String[] args) {
        View view = new View();

        for (int i = 0; i < 5; i++) {
            view.plantTree(random(),random(),"Summer Oak","Green","type1");
            view.plantTree(random(),random(),"Autumn Oak","Yellow","type2");
        }

        view.paint();
    }

    private static int random() {
        return 1 + (int) (Math.random() * 100);
    }

}
