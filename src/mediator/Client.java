package mediator;

public class Client {
    private String name;
    private Mediator serverMediator;

    public Client(String name, Mediator serverMediator) {
        this.name = name;
        this.serverMediator = serverMediator;
        serverMediator.addClient(this);
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String message){
        serverMediator.notifiy(name,message);
    }

    public void receiveMessage(String message,String sender){
        System.out.println(name+" got the the message (from "+sender+"): "+message);
    }
}
