package mediator;

import java.util.ArrayList;
import java.util.List;

public class ServerMediator implements Mediator {

    private List<Client> clientList = new ArrayList<>();

    @Override
    public void addClient(Client newClient) {
        clientList.add(newClient);
    }

    @Override
    public void notifiy(String name, String message) {

        for (Client client : clientList) {
            if (!client.getName().equals(name)) {
                client.receiveMessage(message,name);
            }
        }
        System.out.println("***********************************");
    }
}
