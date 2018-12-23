package visitor.buildings;

public abstract class Building implements Visitable{
    private String name;

    public String getName() {
        return name;
    }

    public Building(String name) {
        this.name = name;
    }
}
