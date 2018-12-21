package proxy.example1;

import proxy.example1.configs.ServerComputerConfigProxy;

public class Main {
    public static void main(String[] args) {
        ComputerUser user = new ComputerUser(false);
        ComputerUser admin = new ComputerUser( true);

        ServerComputerConfigProxy proxy = new ServerComputerConfigProxy();

        System.out.println(proxy.getInfoWithAccess(user));
        System.out.println(proxy.getInfoWithAccess(admin));
    }
}
