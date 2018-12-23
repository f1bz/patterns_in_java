package visitor;

import visitor.buildings.Bank;
import visitor.buildings.Building;
import visitor.buildings.House;
import visitor.buildings.Office;
import visitor.vistors.BusinessmanVisitor;
import visitor.vistors.Visitor;
import visitor.vistors.WorkerVisitor;

public class Main {
    public static void main(String[] args) {
        Visitor worker = new WorkerVisitor();
        Visitor businessman = new BusinessmanVisitor();

        Building house = new House("st. Newers, 5, apt.50");
        Building bank = new Bank("St. Javaster Bank");
        Building office = new Office("OracleFans corporation");

        house.visitBy(worker);
        office.visitBy(worker);
        bank.visitBy(worker);

        house.visitBy(businessman);
        office.visitBy(businessman);
        bank.visitBy(businessman);

    }
}
