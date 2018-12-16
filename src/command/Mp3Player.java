package command;

import java.util.ArrayList;

public class Mp3Player {
    private ArrayList<String> songsNames = new ArrayList<>();
    private int currentSongIndex;

    private boolean isOn;
    private boolean isPlaying;

    public Mp3Player() {
        songsNames.add("Song name 1 ");
        songsNames.add("Song name 2 ");
        songsNames.add("Song name 3 ");
    }

    public void on(){
        if (!isOn) {
            isOn = true;
            currentSongIndex=0;
            System.out.println("TURNING ON!");
        }
    }


    public void play(){
        if (isOn && !isPlaying) {
            isPlaying=true;
            System.out.println("Playing: "+ songsNames.get(currentSongIndex));
        }
    }

    public void stop(){
        if (isOn && isPlaying) {
            isPlaying=false;
            System.out.println("Stopped: "+songsNames.get(currentSongIndex));
        }
    }

    public void changeSong(){
        if (isOn) {
            if (currentSongIndex == songsNames.size()-1) {
                currentSongIndex=-1;
            }
            System.out.println("Song changed to: "+songsNames.get(++currentSongIndex));
        }
    }

    public void off(){
        if (isOn) {
            isPlaying=false;
            isOn = false;
            currentSongIndex=0;
            System.out.println("TURNING OFF!");
        }
    }

}