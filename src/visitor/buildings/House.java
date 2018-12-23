package visitor.buildings;

import visitor.vistors.Visitor;

public class House extends Building{
    public House(String name) {
        super(name);
    }

    @Override
    public void visitBy(Visitor visitor) {
        visitor.visit(this);
    }

    public void sleep(){
        System.out.println("sleeping");
    }
}
