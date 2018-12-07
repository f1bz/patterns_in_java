package observer.java;

import java.util.Observable;
import java.util.Observer;

public class Main {

    public static void main(String[] args) {
        MagazineReleaser magazineReleaser = new MagazineReleaser();

        Observer observerPrice = new MagazineObserverPrice(magazineReleaser);
        Observer observerName = new MagazineObserverName(magazineReleaser);


        magazineReleaser.addObserver(new Observer() {
            @Override
            public void update(Observable observable, Object arg) {
                if (observable instanceof MagazineReleaser) {

                    if (arg == null) {
                        System.out.println("Oops.. cannot access observable object");
                    } else {
                        if (arg instanceof Integer) {
                            System.out.println("Price: " + arg);
                        }
                        if (arg instanceof String) {
                            System.out.println("Name: " + arg);
                        }
                    }
                }
            }
        });

        magazineReleaser.releaseNewMagazineDigest("Silicon Valley",200);

        magazineReleaser.releaseNewMagazineDigest("Silicon Valley",300);

        magazineReleaser.releaseNewMagazineDigest("Silicon Valley (new)",300);
    }
}
