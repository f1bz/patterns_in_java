package proxy.example2;

import java.util.ArrayList;
import java.util.List;

public class ProviderInternet implements InternetConnectable {
    private InternetConnectable internet = new RealInternet();
    private static List<String> bannedSites;

    static
    {
        bannedSites = new ArrayList<String>();
        bannedSites.add("vk.com");
        bannedSites.add("mail.ru");
    }

    @Override
    public void connectTo(String serverhost)
    {
        if(bannedSites.contains(serverhost.toLowerCase()))
        {
            throw new RuntimeException("Access Denied to "+serverhost);
        }
        internet.connectTo(serverhost);
    }
}
