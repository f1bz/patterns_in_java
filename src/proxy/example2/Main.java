package proxy.example2;

public class Main {
    public static void main(String[] args) {
        InternetConnectable internetByProvider = new ProviderInternet();

        InternetConnectable internetByOtherProvider= new RealInternet();

        connectToWebsite("vk.com",internetByProvider);
        connectToWebsite("mail.ru",internetByProvider);
        connectToWebsite("gmail.com",internetByProvider);

        connectToWebsite("vk.com",internetByOtherProvider);

    }
    public static void connectToWebsite(String url,InternetConnectable internet){
        try {
            internet.connectTo(url);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
