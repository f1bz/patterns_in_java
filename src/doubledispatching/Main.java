package doubledispatching;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[]{new Main().new Circle(),new Main().new Rectangle(),new Main().new Triangle()};
        Exporter exporter = new Exporter();

        Visitor visitor = new Visitor();

        for(Shape shape: shapes){
            exporter.export(shape);//early biding - will call visit(Shape shape) method
        }
        System.out.println();
        for(Shape shape: shapes){
            shape.accept(visitor);//solution = double-dispatch
        }

    }
    static class Visitor{

        void visit(Circle s){
            System.out.println("circle");
        }

        void visit(Triangle s){
            System.out.println("triangle");
        }

        void visit(Rectangle s){
            System.out.println("rectangle");
        }
    }
    static class Exporter{
        void export(Shape s){
            System.out.println("shape");
        }

        void export(Circle s){
            System.out.println("circle");
        }

        void export(Triangle s){
            System.out.println("triangle");
        }

        void export(Rectangle s){
            System.out.println("rectangle");
        }

    }

    interface Shape{
        void accept(Visitor v);
    }
    class Circle implements Shape{

        @Override
        public void accept(Visitor v) {
            v.visit(this);
        }
    }

    class Triangle implements Shape{

        @Override
        public void accept(Visitor v) {
            v.visit(this);

        }
    }
    class Rectangle implements Shape{

        @Override
        public void accept(Visitor v) {
            v.visit(this);

        }
    }


}
