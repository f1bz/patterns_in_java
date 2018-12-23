package visitor.vistors;

import visitor.buildings.Bank;
import visitor.buildings.House;
import visitor.buildings.Office;

public interface Visitor {
    void visit(House house);
    void visit(Bank bank);
    void visit(Office office);
}
