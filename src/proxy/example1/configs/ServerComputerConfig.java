package proxy.example1.configs;

public class ServerComputerConfig extends ComputerConfig {
    private String login="server_eu";
    private String password="123456";

    protected ServerComputerConfig(){

    }

    @Override
    protected String getVeryImportantInfo() {
        return login+":"+password;
    }

}
