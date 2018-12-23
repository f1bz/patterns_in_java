package mediator;

public interface Mediator {
    void notifiy(String name, String message);

    void addClient(Client client);
}
