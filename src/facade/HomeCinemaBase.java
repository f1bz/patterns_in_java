package facade;

import facade.parts.AudioSystem;
import facade.parts.VideoSystem;

public class HomeCinemaBase implements HomeCinemaSystem {

    AudioSystem audioSystem = new AudioSystem();
    VideoSystem videoSystem = new VideoSystem();

    @Override
    public void startViewingFilm() {
        videoSystem.turnOn();
        audioSystem.turnOn();
        audioSystem.connectToScreen();
        videoSystem.selectFilm();
        videoSystem.playFilm();


    }

    @Override
    public void stopViewingFilm() {
        videoSystem.stopFilm();
        audioSystem.turnOff();
        videoSystem.turnOff();
    }
}
