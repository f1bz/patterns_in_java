package visitor.buildings;

import visitor.vistors.Visitor;

public interface Visitable {
    void visitBy(Visitor visitor);
}
