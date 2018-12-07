package observer.java;

import java.util.Observable;
import java.util.Observer;

public class MagazineObserverPrice implements Observer {

    private Observable subject;

    public MagazineObserverPrice(Observable subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof MagazineReleaser) {

            if (arg == null) {
                System.out.println("Queried type for price: " + ((MagazineReleaser) subject).getPrice());
            } else {
                if (arg instanceof Integer) {
                    System.out.println("Price: " + arg);
                }
            }
        }


    }
}
