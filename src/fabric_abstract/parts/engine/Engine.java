package fabric_abstract.parts.engine;

public abstract class Engine {

    private double capacityInLiters;

    public Engine(double capacityInLiters) {
        this.capacityInLiters = capacityInLiters;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
