package visitor.buildings;

import visitor.vistors.Visitor;

public class Bank extends Building{
    public Bank(String name) {
        super(name);
    }

    @Override
    public void visitBy(Visitor visitor) {
        visitor.visit(this);
    }

    public void getMoney(){
        System.out.println("getting money");
    }
}
