package builder.car;

public abstract class Car {
    private String carcase;
    private String engine;
    private String wheels;
    private String transmission;

    public Car() {

    }

    public String getCarcase() {
        return carcase;
    }

    public void setCarcase(String carcase) {
        this.carcase = carcase;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carcase='" + carcase + '\'' +
                ", engine='" + engine + '\'' +
                ", wheels='" + wheels + '\'' +
                ", transmission='" + transmission + '\'' +
                '}';
    }
}
