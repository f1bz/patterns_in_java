package command.commands;

import command.Mp3Player;

public class TurnOnCommand implements Command {
    private Mp3Player mp3Player;

    public TurnOnCommand(Mp3Player mp3Player) {
        this.mp3Player = mp3Player;
    }

    @Override
    public void execute() {
        mp3Player.on();
    }
}
