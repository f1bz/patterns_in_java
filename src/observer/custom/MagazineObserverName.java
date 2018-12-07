package observer.custom;


public class MagazineObserverName implements Observer {
    private Observable subject;

    public MagazineObserverName(Observable subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update(Object data) {
        if (data instanceof String) {
            System.out.println("Name Observer | Magazine`s name: " + data);
        }
    }

    @Override
    public void update() {
        if (subject instanceof MagazineReleaser) {
            System.out.println("Queried type for name: " + ((MagazineReleaser) subject).getName());
        }
    }
}
