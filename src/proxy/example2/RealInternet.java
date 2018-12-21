package proxy.example2;

public class RealInternet implements InternetConnectable{
    @Override
    public void connectTo(String serverhost) {
        System.out.println("Connecting to "+ serverhost);
    }
}
