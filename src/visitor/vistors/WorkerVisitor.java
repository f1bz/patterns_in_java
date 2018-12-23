package visitor.vistors;

import visitor.buildings.Bank;
import visitor.buildings.House;
import visitor.buildings.Office;

public class WorkerVisitor implements Visitor {

    @Override
    public void visit(House house) {
        System.out.println("resting in the house:" + house.getName());
        house.sleep();
    }

    @Override
    public void visit(Bank bank) {
        System.out.println("getting salary int the bank:" + bank.getName());
    }

    @Override
    public void visit(Office office) {
        System.out.println("working at the office:" + office.getName());
        office.work();
    }
}
