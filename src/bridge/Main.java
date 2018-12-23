package bridge;

public class Main {
    public static void main(String[] args) {
        Device tvDevice= new TvDeviceImpl();
        Remote remoteTv= new Remote();
        remoteTv.setDevice(tvDevice);

        remoteTv.on();
        remoteTv.off();
    }

}
