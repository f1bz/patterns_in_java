package fabric_abstract.parts.transmission;

public abstract class Transmission {
    private boolean isForSport;

    public Transmission(boolean isForSport) {
        this.isForSport = isForSport;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
