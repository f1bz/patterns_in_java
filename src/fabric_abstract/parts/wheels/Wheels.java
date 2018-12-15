package fabric_abstract.parts.wheels;

public abstract class Wheels {
    public int radiusInCentimeters;

    public Wheels(int radiusInCentimeters) {
        this.radiusInCentimeters = radiusInCentimeters;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
