package command.commands;

import command.Mp3Player;

public class ChangeSongCommand implements Command {
    private Mp3Player mp3Player;

    public ChangeSongCommand(Mp3Player mp3Player) {
        this.mp3Player = mp3Player;
    }

    @Override
    public void execute() {
        mp3Player.changeSong();
    }
}
