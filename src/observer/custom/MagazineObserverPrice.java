package observer.custom;

public class MagazineObserverPrice implements Observer {

    private Observable subject;

    public MagazineObserverPrice(Observable subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update(Object data) {
        if (data instanceof Integer) {
            System.out.println("Price Observer | Magazine`s price: " + data);
        }
    }

    @Override
    public void update() {
        if (subject instanceof MagazineReleaser) {
            System.out.println("Queried type for price: " + ((MagazineReleaser) subject).getPrice());
        }
    }}
