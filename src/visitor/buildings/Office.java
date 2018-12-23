package visitor.buildings;

import visitor.vistors.Visitor;

public class Office extends Building{
    public Office(String name) {
        super(name);
    }

    @Override
    public void visitBy(Visitor visitor) {
        visitor.visit(this);
    }
    public void work(){
        System.out.println("working");
    }
}
