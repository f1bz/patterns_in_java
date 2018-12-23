package visitor.vistors;

import visitor.buildings.Bank;
import visitor.buildings.House;
import visitor.buildings.Office;

public class BusinessmanVisitor implements Visitor{

    @Override
    public void visit(House house) {
        System.out.println("resting in the house:"+house.getName());
    }

    @Override
    public void visit(Bank bank) {
        System.out.println("getting very big salary in the bank:"+bank.getName());
        bank.getMoney();
    }

    @Override
    public void visit(Office office) {
        System.out.println("visiting his own office:"+office.getName());

    }
}
