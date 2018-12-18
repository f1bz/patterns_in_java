package facade;

public class Main {
    public static void main(String[] args) {
        HomeCinemaSystem cinema = new HomeCinemaBase();
        cinema.startViewingFilm();
        cinema.stopViewingFilm();
    }
}
