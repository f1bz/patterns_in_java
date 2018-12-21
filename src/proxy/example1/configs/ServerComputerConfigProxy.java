package proxy.example1.configs;

import proxy.example1.ComputerUser;

public class ServerComputerConfigProxy extends ComputerConfig {

    private ComputerConfig server;

    public ServerComputerConfigProxy() {
        server = new ServerComputerConfig();

    }

    @Override
    String getVeryImportantInfo() {
        return server.getVeryImportantInfo();
    }

    public String getInfoWithAccess(ComputerUser user){
        String response = "Ooops, user has no permissions";
        if (user.isAdmin()) {
            response = server.getVeryImportantInfo();
        }
        return response;
    }
}
