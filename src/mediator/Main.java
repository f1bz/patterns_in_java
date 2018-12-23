package mediator;

public class Main {
    public static void main(String[] args) {
        ServerMediator serverMediator = new ServerMediator();
        Client john = new Client("John", serverMediator);
        Client dave = new Client("Dave", serverMediator);
        Client steve = new Client("Steve", serverMediator);

        john.sendMessage("hello, amigos");
        dave.sendMessage("hello, how are you?");
        steve.sendMessage("who the hell are you?");

    }
}
