package observer.custom;

public class Main {

    public static void main(String[] args) {
        MagazineReleaser magazineReleaser = new MagazineReleaser();

        Observer observerPrice = new MagazineObserverPrice(magazineReleaser);
        Observer observerName = new MagazineObserverName(magazineReleaser);

        magazineReleaser.addObserver(new Observer() {

            @Override
            public void update(Object data) {
                System.out.println("Anonymous class observer: "+data);
            }

            @Override
            public void update() {
                System.out.println("Anonymous class observer: no data to fetch!");
            }
        });

        magazineReleaser.releaseNewMagazineDigest("Silicon Valley",200);


    }
}
