package observer.custom;

import java.util.ArrayList;
import java.util.List;

public class MagazineReleaser implements Observable{

    private List<Observer> listOfObservers = new ArrayList<Observer>();
    private String name;
    private int price;


    @Override
    public void addObserver(Observer observer) {
        listOfObservers.add(observer);
    }


    @Override
    public void deleteObserver(Observer observer) {
        listOfObservers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer: listOfObservers){
            observer.update();
        }
    }

    @Override
    public void notifyAllObservers(Object data) {
        for (Observer observer: listOfObservers){
            observer.update(data);
        }
    }


    public void releaseNewMagazineDigest(String nameOfDigest,int priceOfDigest) {
        setNewValues(nameOfDigest, priceOfDigest);

        notifyAllObservers(name);
        //notifyAllObservers(price);
        //notifyAllObservers();
    }

    private void setNewValues(String nameOfDigest, int priceOfDigest) {
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
