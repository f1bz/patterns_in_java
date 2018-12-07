package observer.java;


import java.util.Observable;
import java.util.Observer;

public class MagazineObserverName implements Observer {
    private Observable subject;

    public MagazineObserverName(Observable subject) {
        this.subject = subject;
        subject.addObserver(this);

    }

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof MagazineReleaser) {
            if (arg == null) {
                System.out.println("Queried type for name: " + ((MagazineReleaser) subject).getName());
            } else {
                if (arg instanceof String) {
                    System.out.println("Name: " + arg);
                }
            }
        }


    }
}
