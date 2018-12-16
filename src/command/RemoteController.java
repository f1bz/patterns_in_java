package command;

import command.commands.Command;

import java.util.ArrayList;

public class RemoteController {
    private ArrayList<Command> commands = new ArrayList<>();

    public void addCommand(Command command){
        commands.add(command);
    }

    public void executeCommand(int commandIndex){
        commands.get(commandIndex).execute();
    }


}
