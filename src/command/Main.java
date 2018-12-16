package command;

import command.commands.*;

public class Main {

    public static void main(String[] args) {
        Mp3Player mp3Player = new Mp3Player();
        RemoteController remoteController = new RemoteController();

        remoteController.addCommand(new TurnOnCommand(mp3Player));
        remoteController.addCommand(new PlayCommand(mp3Player));
        remoteController.addCommand(new StopCommand(mp3Player));
        remoteController.addCommand(new ChangeSongCommand(mp3Player));
        remoteController.addCommand(new TurnOffCommand(mp3Player));

        remoteController.executeCommand(0);
        remoteController.executeCommand(1);
        remoteController.executeCommand(2);
        remoteController.executeCommand(3);
        remoteController.executeCommand(3);
        remoteController.executeCommand(2);
        remoteController.executeCommand(1);
        remoteController.executeCommand(3);
        remoteController.executeCommand(4);

        System.out.println("_________________________");

        remoteController.addCommand(new OnPlayOffCommand(mp3Player));
        remoteController.executeCommand(5);

    }
}

