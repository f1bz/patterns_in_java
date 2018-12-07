package observer.java;

import java.util.Observable;

public class MagazineReleaser extends Observable {

    private String name;
    private int price;

    public void releaseNewMagazineDigest(String nameOfDigest,int priceOfDigest) {
        setNewValues(nameOfDigest, priceOfDigest);

        //notifyObservers(name);
        notifyObservers(price);
        setChanged();
        notifyObservers();
    }

    private void setNewValues(String nameOfDigest, int priceOfDigest) {
        if (!nameOfDigest.equalsIgnoreCase(name)) {
            setChanged();
        }
        name = nameOfDigest;
        price = priceOfDigest;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
