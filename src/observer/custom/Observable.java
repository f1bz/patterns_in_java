package observer.custom;

public interface Observable {
    void addObserver(Observer observer);
    void deleteObserver(Observer observer);
    void notifyAllObservers();
    void notifyAllObservers(Object data);
}
