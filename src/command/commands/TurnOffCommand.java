package command.commands;

import command.Mp3Player;

public class TurnOffCommand implements Command {
    private Mp3Player mp3Player;

    public TurnOffCommand(Mp3Player mp3Player) {
        this.mp3Player = mp3Player;
    }

    @Override
    public void execute() {
        mp3Player.off();
    }
}
