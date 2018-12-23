package bridge;

public class Remote {
    private Device device;

    public void on(){
        device.turnOn();
    }

    public void off(){
        device.turnOff();
    }

    public void setDevice(Device device) {
        this.device = device;
    }
}