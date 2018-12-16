package command.commands;

import command.Mp3Player;

public class StopCommand implements Command {
    private Mp3Player mp3Player;

    public StopCommand(Mp3Player mp3Player) {
        this.mp3Player = mp3Player;
    }

    @Override
    public void execute() {
        mp3Player.stop();
    }
}
