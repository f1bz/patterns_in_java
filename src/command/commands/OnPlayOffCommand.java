package command.commands;

import command.Mp3Player;

import java.util.ArrayList;

public class OnPlayOffCommand implements Command {

    ArrayList<Command> list = new ArrayList<>();
    public OnPlayOffCommand(Mp3Player mp3Player) {
        list.add(new TurnOnCommand(mp3Player));
        list.add(new PlayCommand(mp3Player));
        list.add(new TurnOffCommand(mp3Player));
    }

    @Override
    public void execute() {
        for(Command command : list){
            command.execute();
        }
    }
}
