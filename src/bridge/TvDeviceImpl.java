package bridge;

public class TvDeviceImpl implements Device {

    @Override
    public void turnOn() {
        System.out.println("Tv is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv is turned off");
    }
}
